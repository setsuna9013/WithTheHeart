$(function() {
	$( 'a[rel*=leanModal]').leanModal({
		top: 100,
		overlay : 0.5,
		closeButton: ".modal_close"
	});


	$("#lean_overlay").click(function(){
		$("#textField").val("");
	});
});