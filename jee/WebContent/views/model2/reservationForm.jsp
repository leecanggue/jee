<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>예약 폼</title>
</head>
<body>
<div> 
<fieldset>
		<legend>예약일</legend>
		
		<ol>
		<li>예약취소는 2시간 </li>
			<li>최소 예약일은 7일간 입니다.
			<label for="wanted">원하는 예약일</label>
			<input id="wanted" name="wanted" type="date" />
			<input type="time" name="time" id="time" /></li>
			
		</ol>
		
		</fieldset>
		<input type="submit" value="전 송"/>

</div>
<div >
<hr  style="width: 400px; height: 20px; border-color: block;"/>
<div style="text-align: center;">
<%
String[][] seat = new String[3][5];
if(request.getAttribute("seat")==null){
	String[][] defaultSeat = new String[3][5];
	for (int i = 0; i < defaultSeat.length; i++) {
	    for (int j = 0; j < defaultSeat[i].length; j++) {
	        if (seat[i][j] == null) {%>
	         ㅁ <%=i+1%>0<%=j+1%>호            
	        <%} else {%>
	         ■ <%=i+1%>0<%=j+1%>호
	       <%}
	    }%>
	 <br />  
	<%}
}else{
	seat = (String[][])request.getAttribute("seat");
	for (int i = 0; i < seat.length; i++) {
	    for (int j = 0; j < seat[i].length; j++) {
	        if (seat[i][j] == null) {%>
	         ㅁ <%=i+1%>0<%=j+1%>호            
	        <%} else {%>
	         ■ <%=i+1%>0<%=j+1%>호
	       <%}
	    }%>
	 <br />  
	<%}
}
%>
</div>
<div>
<form action="<%=request.getContextPath()%>/reservation/checkIn.do">
		<fieldset>
			<legend>주문내용</legend>
			<ol>
				<li>
				<label for="prod">좌석</label>
				<input type="text" name="id" id="id" placeholder="아이디를 입력하세요 "/>
				</li>
				<li>
				<label for="num">열번호</label>
				<input id="floor" name="floor" type="number" min="1" max="5" value="1" />
				<br />
				<label for="num">행번호</label>
				<input id="row" name="row" type="number" min="1" max="5" value="1" />
				</li>
			</ol>
		</fieldset>
		
   <input type="submit" value="등록">
	</form>
</div>
<div>
<form action="<%=request.getContextPath()%>/reservation/checkOut.do">
		<fieldset>
			<legend>취소내용</legend>
			<ol>
				<li>
				<label for="prod">좌석</label>
				<input type="text" name="id" id="id" placeholder="아이디를 입력하세요 "/>
				</li>
				<li>
				<label for="num">열번호</label>
				<input id="floor" name="floor" type="number" min="1" max="5" value="1" />
				<br />
				<label for="num">행번호</label>
				<input id="row" name="row" type="number" min="1" max="5" value="1" />
				</li>
			</ol>
		</fieldset>
		
   <input type="submit" value="등록">
	</form>
</div>
</div>
</body>
</html>
