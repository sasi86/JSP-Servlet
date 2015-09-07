<html>
<body>
	<script>
		function loadXMLDoc(url) {
			var xmlhttp;
			if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
				xmlhttp = new XMLHttpRequest();
			} else {// code for IE6, IE5
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					var listboxValues = xmlhttp.responseText.split(",");
					var obj = document.getElementById("listValues");
					for (var i = 0; i <= listboxValues.length - 1; i++) {
						opt = document.createElement("option");
						opt.value = listboxValues[i];
						opt.text = listboxValues[i];
						obj.appendChild(opt);
					}
				}
			}
			var query = document.getElementById('query').value;
			if(query){
				xmlhttp.open("GET", url + "?query="+query , true);
				xmlhttp.send();
			}
		}
		function setValue(source,destination) {
			var selectBox = document.getElementById(source);
			
			var selectedValue = selectBox.value;
			var obj = document.getElementById(destination);
				if(selectedValue){
				opt = document.createElement("option");
					opt.value = selectedValue;
					opt.text = selectedValue;
					obj.appendChild(opt);
					selectBox.remove(selectBox.selectedIndex);
				}
		}
	</script>
<div id="container" style="text-align: center">
	<input type="text" name="query" id="query" />
	<button onclick="loadXMLDoc('SubmitQuery')">Submit</button>
	<br />
	<br />
	<div id="listbox" style="display: block;">
		<select id="listValues" size="5" style="width: 120px;"></select>
		<button onclick="setValue('listValues','restext')" style="vertical-align: top;">></button>
		<button onclick="setValue('restext','listValues')" style="vertical-align: bottom;margin-left: -32px;"><</button>
		<select id="restext" size="5" style="width: 120px;"></select>
	</div>

	</select>
</div>
</body>
</html>
