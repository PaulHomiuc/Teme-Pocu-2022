"use strict";
exports.__esModule = true;
require("./styles.css");
console.log("merge");
var student = /** @class */ (function () {
    function student(Nume, Prenume, Nota) {
        this.nume = Nume;
        this.prenume = Prenume;
        this.nota = Nota;
    }
    return student;
}());
console.log("Merge");
var button = document.getElementById('btnAdd');
button === null || button === void 0 ? void 0 : button.addEventListener('click', function handleclick(event) {
    var _a;
    var list = document.getElementById('list');
    var liNode = document.createElement('li');
    var prenume = document.getElementById('prenume');
    var nume = document.getElementById('nume');
    var nota = document.getElementById('nota');
    if (!(prenume.value.length < 3 || nume.value.length < 3 ||
        parseInt(nota.value) < 1 || parseInt(nota.value) > 10)) {
        var newElementVal = (nume === null || nume === void 0 ? void 0 : nume.value) + " ";
        newElementVal += (prenume === null || prenume === void 0 ? void 0 : prenume.value) + " ";
        newElementVal += nota === null || nota === void 0 ? void 0 : nota.value;
        var txtNode = document.createTextNode(newElementVal);
        liNode.appendChild(txtNode);
        list === null || list === void 0 ? void 0 : list.appendChild(liNode);
        (_a = document.querySelector("form")) === null || _a === void 0 ? void 0 : _a.reset();
    }
    else
        alert("Error");
});
