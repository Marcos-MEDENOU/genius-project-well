
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Genius</title>
</head>
<body>
<body>
	<%@ include file="/WEB-INF/components/header.jsp"%>

	<form method="post" action="sign_up">
		<!-- Container -->
		<div class="container mx-auto py-14">
			<div class="flex justify-center px-6 my-12">
				<!-- Row -->
				<div class="w-full xl:w-3/4 lg:w-11/12 flex">
					<!-- Col -->
					<div
						class="w-full h-auto pt-20 bg-white-400 hidden lg:block lg:w-5/12 bg-cover rounded-l-lg">
						<img src="images/hero-bg.svg" class="btn-" />

					</div>
					<!-- Col -->
					<div
						class="w-full lg:w-3/6 bg-white p-5 pl-20 rounded-lg lg:rounded-l-none">
						<h3 class="pb-8 pt-4 text-2xl text-center">Create an Account!</h3>
						<form class="px-8 pt-6 pb-8 mb-4 bg-white rounded">
							<div class="mb-4 md:flex md:justify-between">
								<div class="mb-4 md:mr-2 md:mb-0">
									<label class="block mb-2 text-sm font-bold text-gray-700"
										for="firstName"> Nom complet </label> <input
										class="h-12 w-full px-3 py-2 text-sm leading-tight text-gray-700 border rounded shadow appearance-none focus:outline-none focus:shadow-outline"
										id="firstName" name="Nomcomplet" type="text"
										placeholder="complet name" value="${completName }" />
									<c:if test="${response.selectionEmptyCheck(completName)}">
										<p class="text-xs italic text-red-500">nom vide ou
											invalid.</p>
									</c:if>



								</div>
								<div class="md:ml-2">
									<label class="block mb-2 text-sm font-bold text-gray-700"
										for="lastName"> Pseudo </label> <input
										class="h-12 w-full px-3 py-2 text-sm leading-tight text-gray-700 border rounded shadow appearance-none focus:outline-none focus:shadow-outline"
										id="lastName" name="Pseudo" type="text"
										placeholder="Pseudo" value="${pseudo }" />
									<c:if test="${response.selectionEmptyCheck(pseudo)}">
										<p class="text-xs italic text-red-500">pseudo vide ou
											invalid.</p>
									</c:if>
								</div>
							</div>
							<div class="mb-4">
								<label class="block mb-2 text-sm font-bold text-gray-700"
									for="email"> Email </label> <input
									class="h-12 w-full px-3 py-2 mb-3 text-sm leading-tight text-gray-700 border rounded shadow appearance-none focus:outline-none focus:shadow-outline"
									id="email" type="email" name="Email" placeholder="Email"
									value="${email}" />
									<c:if test="${response.selectionEmptyCheck(email)}">
										<p class="text-xs italic text-red-500">email vide ou
											invalid.  EX : marcosmedenou@gmail.com</p>
									</c:if>
								
							</div>
							<div class="mb-4">
								<div class="mb-4 md:mr-2 md:mb-0">
									<label class="block mb-2 text-sm font-bold text-gray-700"
										for="password"> Password </label> <input
										class="h-12 w-full px-3 py-2 mb-3 text-sm leading-tight text-gray-700 border  rounded shadow appearance-none focus:outline-none focus:shadow-outline"
										id="password" name="Password" type="password"
										placeholder="******************" />
								</div>
								<c:if test="${response.selectionEmptyCheck(password)}">
										<p class="text-xs italic text-red-500 pb-4">password vide ou
											invalid.</p>
									</c:if>
								<div class="md:ml-2">
									<label class="block mb-2 text-sm font-bold text-gray-700"
										for="c_password"> Confirm Password </label> <input
										class="h-12 w-full px-3 py-2 mb-3 text-sm leading-tight text-gray-700 border rounded shadow appearance-none focus:outline-none focus:shadow-outline"
										id="c_password" name="ConfirmPassword" type="password"
										placeholder="******************" />
								</div>
								<c:if test="${response.samePasswordCheck(password, passwordConfirm) ==false}">
										<p class="text-xs italic text-red-500 pb-4">Password non identique</p>
									</c:if>
								
<!-- 								samePasswordCheck -->
							</div>
							<div class="mb-6 text-center">
								<input
									class="h-12 w-full px-4 py-2 font-bold text-white bg-red-500 rounded-full hover:bg-blue-700 focus:outline-none focus:shadow-outline"
									type="submit" value="Register Account" />
							</div>
							<hr class="mb-6 border-t" />
							<div class="text-center">
								<a
									class="inline-block text-sm text-blue-500 align-baseline hover:text-blue-800"
									href="#"> Forgot Password? </a>
							</div>
							<div class="text-center">
								<a
									class="inline-block text-sm text-blue-500 align-baseline hover:text-blue-800"
									href="./index.html"> Already have an account? Login! </a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

	</form>
</body>
</body>
</html>