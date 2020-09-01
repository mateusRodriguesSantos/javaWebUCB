function calc(op){
	var result = document.getElementById("result");
	var operacao = op.value;

		a = parseInt(document.getElementById("input-1").value);
		b = parseInt(document.getElementById("input-2").value);
		var calculo = eval(a+operacao+b);
		result.innerHTML = "<p>"+calculo+"</p>";
		
}
