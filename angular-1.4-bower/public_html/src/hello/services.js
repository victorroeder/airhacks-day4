hello.factory('HelloService', function ($http) {
    return {
        greet: function () {
            return $http.get("http://localhost:8080/cors-jaxrs/resources/airhacks/42");
        }};
});

