<!DOCTYPE html>
<html>
	<head>
		</head>
	<body>
		<table>
			<thead>
			<tr>
				<th>id</th>
				<th>名字</th>
				<th>内容</th>
			</tr>
			</thead>
			<tbody>
			 <#list list as obj>
				<tr>
				<td>${obj.id!''}</td>
				<td>${obj.name!''}</td>
				<td>${obj.content!''}</td>
				</tr>
			</#list>
			</tbody>
		</table>
	</body>
</html>