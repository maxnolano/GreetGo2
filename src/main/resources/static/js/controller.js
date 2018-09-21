app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});

app.controller('routeController',function ($scope, $http){
    $scope.headingTitle = "Greet List";
    $http.get('http://localhost:8080/rest/greet/getAll').
    success(function(data) {
        // alert("success" + data);
        $scope.Data = data;
        $scope.result1 = data;
    }).
    error(function(data){
        alert("failure");
    });
});