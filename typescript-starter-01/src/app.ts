import "./styles.css";
alert("merge");
class student{
     nume:string;
    prenume:string;
    nota:number;

     constructor(Nume:string,Prenume:string,Nota:number){

        this.nume=Nume;
        this.prenume=Prenume;
        this.nota=Nota;    


    }

}
console.log("Merge");
    const button = document.getElementById('btnAdd');
    button?.addEventListener('click',function handleclick(event){
        
        let list = document.getElementById('list');
        let liNode = document.createElement('li');
        var newElementVal:string = document.getElementById('prenume')?.textContent || '';
        
       var txtNode=document.createTextNode(newElementVal);
        liNode.appendChild(txtNode);
        list?.appendChild(liNode);

    })




