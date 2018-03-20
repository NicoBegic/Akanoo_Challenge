<!doctype html>
<html>
<head>
    <meta name="layout" content="main">
    <title>Shops</title>
</head>

<body>
<div id = 'overall'>
    <table border="1">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Selected</th>
        </tr>
      </thead>

      <tbody>
      <g:each in="${shops}" status="i" var="shop">

        <tr>
          <td>${shop.id}</td>
          <td>${shop.name}</td>
          <td>
                //<input value="$(shop.selected)" type="checkbox"/>
                ${shop.selected}
          </td>
        </tr>

      </g:each>
      </tbody>

    </table>
    </div>
</body>
</html>