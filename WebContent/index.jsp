<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="loginAction">
<s:textfield name="name" label="Name"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:submit value="login"></s:submit>
</s:form>