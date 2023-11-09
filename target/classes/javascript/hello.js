$(document).ready(function() {
    $('#add-book').click(function (){
        $.ajax({
            url: "/books",
            method: "POST",
            success: function(data) {
                $(".addressbook-sections").html(data);
                alert("ajax called!");
            },
            error: function () {
                alert("some error happened. idk what happened")
            }
        });
    });
    

});