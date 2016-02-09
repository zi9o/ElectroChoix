var app = angular.module('ElectroChoix', ['ngFileUpload', 'ngRoute', 'ngResource', 'ngAnimate', 'ngSanitize','angularUtils.directives.dirPagination'], function () {

}).constant('API_URL', 'http://localhost:8080/');

app.config(['$routeProvider', function ($routeProvider) {

        $routeProvider

                .when('/welcome', {
                    templateUrl: 'app/welcome.html',
                    controller: 'welcome',
                    controllerAs: 'vm',
                    caseInsensitiveMatch: true
                });
    }]);

app.directive('cvSectionBasic', function () {
    return {
        restrict: 'EA',
        replace: 'true',
        templateUrl: 'cv-section-basic'
    };
});
