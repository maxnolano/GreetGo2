var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/rest/greet/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/rest/greet/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .when('/rest/greet/getAll',{
            templateUrl: '/views/route.html',
            controller: 'routeController'
        })
        .when('/rest/greet/createGreet',{
            templateUrl: '/views/form_view.html',
            controller: 'postController'
        })
        .otherwise(
            { redirectTo: '/rest/greet'}
        );
});