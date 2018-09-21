var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/getContent',{
            templateUrl: '/index2.html',
            controller: 'routeController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});