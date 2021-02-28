document.addEventListener("DOMContentLoaded", function(event){
	
	//backend functions here 
	//how the calculator works/tips page

	window.addEventListener('keydown', keyDown);
	function keyDown(event) {;
		    const key = (event.detail || event.which).toString();
		    if (key == 83) {
				location.href = "calculator.html"
				//calculator.btn.click();
		    	//calculator();
		    }
		    else if (key == 70) {
				location.href = "tips.html"
				//beGreen_btn.click();
		    	//beGreen();
		    }
		}


	const calculator_btn = document.getElementById("calculator");
	calculator_btn.addEventListener('click', function(){
		//location.href = "https://www.google.com";
		location.href = "calculator.html";
	}, false);

	const tips_btn = document.getElementById("tips");
	tips_btn.addEventListener('click', function(){
		location.href = "tips.html";
		//location.href = "https://www.google.com";
	}, false);

/*
	function snakeGame() {
		calculator_btn.click();
		//window.location.href = "https://www.google.com";
	}*/

	/*object.onkeydown = function(){calculator()};*/

	/*function keyDown(event) {;
		    const key = (event.detail || event.which).toString();
		    if (key == 70) {
		      beGreem();
		    }
		}*/

/*	function beGreen() {
		beGreen_btn.click();
		//window.location.href = "https://www.google.com";
	}*/

	/*object.onkeydown = function(){beGreen()};*/
}, false);