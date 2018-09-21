app.controller('routeController',function ($scope, $http){
    $http.get('localhost:8080/rest/greet/getAll').
    success(function(data) {
        alert("success");
        $scope.Data = data;
    }).
    error(function(data){
        alert("failure");
    });
});
