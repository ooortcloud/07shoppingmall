<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>���� �����ȸ</title>

<link rel="stylesheet" href="/css/admin.css" type="text/css">

<script type="text/javascript">
	function fncGetPurchaseList() {
		document.detailForm.submit();
	}

</script>
</head>

<body bgcolor="#ffffff" text="#000000">

<div style="width: 98%; margin-left: 10px;">

<form name="detailForm" action="/purchase/listPurchase" method="post">

<input type="hidden" id="currentPage" name="currentPage" value="${resultPage.currentPage }" />

�˻� :: <input type="text" id="searchKeyword" name="searchKeyword" value="${search.searchKeyword }" />

<table width="100%" height="37" border="0" cellpadding="0"	cellspacing="0">
	<tr>
		<td width="15" height="37"><img src="/images/ct_ttl_img01.gif"width="15" height="37"></td>
		<td background="/images/ct_ttl_img02.gif" width="100%" style="padding-left: 10px;">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="93%" class="ct_ttl01">���� �����ȸ</td>
				</tr>
			</table>
		</td>
		<td width="12" height="37"><img src="/images/ct_ttl_img03.gif"	width="12" height="37"></td>
	</tr>
</table>

<table width="100%" border="0" cellspacing="0" cellpadding="0"	style="margin-top: 10px;">
	<tr> 
		<td colspan="11">��ü ${requestScope.resultPage.totalCount } �Ǽ�, ���� ${resultPage.currentPage } ������</td>
	</tr>
	<tr>
		<td class="ct_list_b" width="100">No</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b" width="150">��ǰID</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b" width="150">��ǰ��</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b">��������</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b">�����Ȳ</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b">��������</td>
	</tr>
	<tr>
		<td colspan="11" bgcolor="808285" height="1"></td>
	</tr>

	
	<%-- �ݺ����� ���� ���� ����Ʈ�� ������ ��� --%>
	<c:set var="no" value="${resultPage.totalCount - resultPage.pageSize * (resultPage.currentPage -1 ) }" />
	
	<c:forEach var="purchase" items="${requestScope.map.list }">
		<tr class="ct_list_pop">
			<td align="center">
				${no }
				<c:set var="no" value="${ no-1 }" />
			</td>
			<td></td>
			<td align="left">
				<a href="/product/getProduct?prodNo=${purchase.purchaseProd.prodNo }&menu=search">${purchase.purchaseProd.prodNo }</a>
			</td>
			<td></td>
			<td align="left">${purchase.purchaseProd.prodName }</td>
			<td></td>
			<td align="left">${purchase.orderDate }</td>
			<td></td>
			<%-- tran_state_code : "1" = "���ſϷ�", "2" = "�����", "3" = "��ۿϷ�" --%>
			<td align="left">
				<c:if test="${ purchase.tranCode == 1 }">
					���� ���ſϷ� �����Դϴ�.
				</c:if><c:if test="${ purchase.tranCode == 2 }">
					���� ����� �Դϴ�. 
				</c:if><c:if test="${ purchase.tranCode == 3 }">
					���� ��ۿϷ� ���� �Դϴ�.
				</c:if>
			</td>
			<td></td>
			<td align="left">
				<c:if test="${purchase.tranCode == 1 }">
						<a href="/purchase/getPurchase?tranNo=${purchase.tranNo }">���� ���� Ȯ�� �� ����</a>
				</c:if><c:if test="${purchase.tranCode == 2 }">
						<a href="/purchase/updateTranCode?tranNo=${purchase.tranNo }&tranCode=3">���� ���� �˸���</a>
				</c:if>
			</td>
		</tr>
	</c:forEach>
</table>

<table width="100%" border="0" cellspacing="0" cellpadding="0" style="margin-top: 10px;">
	<tr>
		<td align="center">
		
		<jsp:include page="../common/pageNavigator.jsp"></jsp:include>
		  
		</td>
	</tr>
</table>

<!--  ������ Navigator �� -->
</form>

</div>

</body>
</html>