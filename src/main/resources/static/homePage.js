$(document).ready(function(){
	
	$(".nav-link").click(function(){
		var url=$(this).attr("href");
		$.ajax({
			url: url,
			type: "get",
			datatype: "html",
			success: function(result){
				//alert("done")
				$("#fragment").html(result);
			}
		})
		return false;
	});
});
