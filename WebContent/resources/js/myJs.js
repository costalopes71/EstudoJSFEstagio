$( function() {
	$( ".datepicker" ).datepicker({
		  showOn: "button",
	      buttonImage: "http://jqueryui.com/resources/demos/datepicker/images/calendar.gif",
	      buttonImageOnly: true,
	      buttonText: "Select date",
	      changeMonth: true,
	      changeYear: true,
	      yearRange: "1960:2017"
	});
});

$( function() {
$('.btnNext').click(function(){
		$('.nav-tabs > .active').next('li').find('a').trigger('click');
	});
});

$( function() {
	$('.btnPrevious').click(function(){
		$('.nav-tabs > .active').prev('li').find('a').trigger('click');
	});
});

$( function() {
	$('.btnReset').click(function(){
		$('.nav-tabs > .active').prev('li').find('a').trigger('click');
		$('.nav-tabs > .active').prev('li').find('a').trigger('click');
	});
});

