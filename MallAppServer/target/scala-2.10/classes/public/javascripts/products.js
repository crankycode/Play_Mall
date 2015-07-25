(function() {
  jQuery(function($) {
    var $table, RE_findSingleDigits, formatDate, loadProductDetails, loadProductTable, productDetailsUrl, productListUrl, saveRow;
    $table = $('.container table');
    productListUrl = $table.data('list');
    RE_findSingleDigits = /\b(\d)\b/g;
    loadProductTable = function() {
      return $.get(productListUrl, function(products) {
        return $.each(products, function(index, eanCode) {
          var row;
          row = $('<tr/>').append($('<td/>').text(eanCode));
          row.attr('contenteditable', true);
          $table.append(row);
          return loadProductDetails(row);
        });
      });
    };
    productDetailsUrl = function(eanCode) {
      return $table.data('details').replace('0', eanCode);
    };
    loadProductDetails = function(tableRow) {
      var eanCode;
      eanCode = tableRow.text();
      return $.get(productDetailsUrl(eanCode), function(product) {
        tableRow.append($('<td/>').text(formatDate(new Date(product.date))));
        tableRow.append($('<td/>').text(Boolean(product.sold)));
        tableRow.append($('<td/>').text(product.productname));
        tableRow.append($('<td/>').text(product.userid));
        tableRow.append($('<td/>').text(product.price));
        tableRow.append($('<td/>').text(product.stock));
        tableRow.append($('<td/>').text(product.brand));
        tableRow.append($('<td/>').text(product.category));
        tableRow.append($('<td/>').text(product.condition));
        return tableRow.append($('<td/>'));
      });
    };
    loadProductTable();
    saveRow = function($row) {
      var brand, category, condition, date, ean, jqxhr, price, product, productname, sold, stock, userid, _ref;
      _ref = $row.children().map(function() {
        return $(this).text();
      }), ean = _ref[0], date = _ref[1], sold = _ref[2], productname = _ref[3], userid = _ref[4], price = _ref[5], stock = _ref[6], brand = _ref[7], category = _ref[8], condition = _ref[9];
      product = {
        ean: ean,
        date: date,
        sold: Boolean(sold),
        productname: productname,
        userid: userid,
        price: parseFloat(price),
        stock: parseInt(stock),
        brand: brand,
        category: category,
        condition: condition
      };
      jqxhr = $.ajax({
        type: "PUT",
        url: productDetailsUrl(ean),
        contentType: "application/json",
        data: JSON.stringify(product)
      });
      jqxhr.done(function(response) {
        var $label;
        $label = $('<span/>').addClass('label label-success');
        $row.children().last().append($label.text(response));
        return $label.delay(3000).fadeOut();
      });
      return jqxhr.fail(function(data) {
        var $label, message;
        $label = $('<span/>').addClass('label label-important');
        message = data.responseText || data.statusText;
        return $row.children().last().append($label.text(message));
      });
    };
    $table.on('focusout', 'tr', function() {
      console.log('save');
      return saveRow($(this));
    });
    return formatDate = function(date) {
      var timeStamp;
      timeStamp = [date.getFullYear(), date.getMonth() + 1, date.getDate()].join(" ");
      RE_findSingleDigits = /\b(\d)\b/g;
      timeStamp = timeStamp.replace(RE_findSingleDigits, "0$1");
      return timeStamp.replace(/\s/g, "-");
    };
  });
}).call(this);
