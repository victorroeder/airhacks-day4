var pro = Object.create(HTMLButtonElement.prototype);
pro.createdCallback = function () {
    this.addEventListener('click', function (e) {
        alert('Hack the air!');
    });
};

var Airhacks = document.registerElement('airh-hacks', {
    prototype: pro
//    extends: 'button'
});
var airHacks = new Airhacks();
airHacks.appendChild(document.createTextNode("hey"));
document.body.appendChild(airHacks);

