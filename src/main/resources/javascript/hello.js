$(document).ready(function() {
    $('#add-book').click(function (){
        $.ajax({
            type: "POST",
            url: "/books"
        });
    });
    
    $.ajax({
        url: "http://localhost:8080"
    }).then(function(data) {
       $('#book-id').append(data.Id);
       $('#book-list').append(data.buddyInfoList);
    });
});