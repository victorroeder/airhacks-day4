hello.controller('helloController', function (HelloService) {
    var that = this;
    HelloService.greet().success(function (data) {
        that.msg = data.hack;
    });
});

