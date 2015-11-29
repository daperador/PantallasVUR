runtConsulta.config(['$routeProvider', function($routeProvider){
	$routeProvider.
		when('/', {
			templateUrl: './templates/main.html',
			controller: 'mainController'
		}).otherwise({
			redirectTo: '/'
		})
}]);