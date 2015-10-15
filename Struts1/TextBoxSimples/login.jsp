<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
</head>
<body>

	<html:form action="/Login">
	<html:errors/>
    	<html:text property="username"/>
    	<html:submit value="Submit"/>
	</html:form>
</body>
</html>