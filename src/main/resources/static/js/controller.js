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

app.controller('postController', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = "http://localhost:8080/rest/greet/" + "createGreet";

        var config = {
            headers : {
                'Accept': 'application/json'
            }
        }
        var data = {
            greet: $scope.greet
        };

        $http.post(url, data, config).then(function (response) {
            $scope.postResultMessage = response.data;
        }, function error(response) {
            $scope.postResultMessage = "Error with status: " +  response.statusText;
        });

        $scope.greet = "";
    }
});