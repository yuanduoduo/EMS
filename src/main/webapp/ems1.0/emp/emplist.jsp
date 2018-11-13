<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page contentType="text/html;charset=utf-8" isELIgnored="false" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/ems1.0/css/style.css"/>
    <link href="../css/common.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome (请显示当前登陆用户)!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>
                    <td>
                        Bir
                    </td>
                    <td>
                        Dept
                    </td>
                    <td>
                        Operation(处理删除的友情提醒)
                    </td>
                </tr>
                <c:forEach items="${requestScope.queryAll}" var="emp">
                    <tr class="row2">
                        <td>
                                ${emp.id}
                        </td>
                        <td>
                                ${emp.name}
                        </td>
                        <td>
                                ${emp.salary}
                        </td>
                        <td>
                                ${emp.age}
                        </td>
                        <td>
                                ${emp.bir}
                        </td>
                        <td>
                                ${emp.dept}
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/emp/delete?id=${id}">delete emp</a>&nbsp;
                            <a href="../ems1.0/emp/updateEmp.jsp?id=${emp.id}&name=${emp.name}&salary=${emp.salary}&age=${emp.age}
								&bir=${emp.bir}&dept=${emp.dept}">update emp</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <div class="pagination">
                <span class="firstPage">&nbsp;</span> <span class="previousPage">&nbsp;</span>
                <span class="currentPage">1</span> <a
                    href="javascript:$.pageSkip(2);">2</a> <a
                    href="javascript:$.pageSkip(3);">3</a> <span class="pageBreak">...</span>
                <a class="nextPage" href="javascript: $.pageSkip(2);">&nbsp;</a>
                <a class="lastPage" href="javascript: $.pageSkip(6);">&nbsp;</a>
                <span class="pageSkip"> 共6页 到第<input id="pageNumber"
                                                     name="pageNumber" value="1" maxlength="9"
                                                     onpaste="return false;">页
								<button type="submit">&nbsp;</button>
						</span>(请在全部功能完成后在处理分页)
            </div>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='../ems1.0/emp/addEmp.jsp'"/>
            </p>
        </div>
    </div>

    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
