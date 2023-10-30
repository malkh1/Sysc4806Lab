$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080"
    }).then(function(data) {
       $('#book-id').append(data.id);
       $('#book-list').append(data.content);
    });
});