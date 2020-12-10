var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");

    var panel = this.nextElementSibling;
    if (panel.style.display === "block") {
      panel.style.display = "none";
    } else {
      panel.style.display = "block";
    }
  });
}

$(document).ready(function() {
    $('input[type="radio"]').click(function() {
        var inputValue = $(this).attr("value");
        var targetBox = $("." + inputValue);
        $(".selectt").not(targetBox).hide();
        $(targetBox).show();
    });
});

$(document).ready(function() {
    $('input[type="select"]').click(function() {
        var inputValue = $(this).attr("value");
        var targetBox = $("." + inputValue);
        $(".selectt").not(targetBox).hide();
        $(targetBox).show();
    });
});


$('#brand-select').change(function() {
    $(this).find("option").each(function() {
        if (this.value != '') {
            $('.' + this.value).hide();
        }
    });
    $('.' + this.value).show();
});