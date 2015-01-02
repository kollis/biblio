<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:url var="base" value="/"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <meta http-equiv="PRAGMA" content="NO-CACHE">
        <meta http-equiv="EXPIRES" content="-1">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Biblio - <tiles:getAsString name="title" /></title>
        
        <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
        <link href='${base}css/biblio.css' rel='stylesheet'>
        <script src='${base}js/biblio.js' type='text/javascript'></script>
    </head>

    <body>
        <div id='container' class="container">
            <div id="header">
                <tiles:insertAttribute name="header" />
            </div>

            <div id="content">
                <tiles:insertAttribute name="content" />
            </div>
            <div id="footer">
                <tiles:insertAttribute name="footer" />
            </div>
        </div>
    </body>
</html>