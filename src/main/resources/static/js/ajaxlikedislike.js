$(document).ready(function(){
	alert("Hello");
	$(".likebtn").click(function(){
		var val = $(this).data("prodid");
		$.ajax({
			type : "POST",
			url : "liked",
			data : "aid="+val,
			success : function(){
				alert("data submited")
			}
		});
		$(this).html("Liked");
		$(this).siblings("button").html("Dislike");
		$(this).siblings("button").attr("disabled", false);
		$(this).attr("disabled", true);
		
	});
	
	$(".dislikebtn").click(function(){
		var val = $(this).data("prodid");
		$.ajax({
			type : "POST",
			url : "disliked",
			data : "aid="+val,
			success : function(){
				alert("data submited")
			}
		});
		$(this).html("Disliked");
		$(this).siblings("button").html("Like");
		$(this).siblings("button").attr("disabled", false);
		$(this).attr("disabled", true);
		
	});
	
});