dataProfile();
function dataProfile(){
	var id=1;
	$.ajax({
		url : "http://localhost:8080/api/profile/dataProfile/"+id,
		type: "GET",
		success : function(data){
			$("#nama").text(data[0].nama);
			$("#tempat").text(data[0].tempat_lahir);
		}
	});
}