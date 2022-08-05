import "./styles.css";
console.log("merge");
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
        const prenume =document.getElementById('prenume') as HTMLInputElement;
        const nume =document.getElementById('nume') as HTMLInputElement;
        const nota =document.getElementById('nota') as HTMLInputElement;
        if(!(prenume.value.length<3 || nume.value.length<3 ||
             parseInt( nota.value)<1 || parseInt( nota.value)>10))
        {
        var newElementVal:string = nume?.value+ " ";
        newElementVal+=prenume?.value +" ";
        newElementVal+=nota?.value;

       var txtNode=document.createTextNode(newElementVal);
        liNode.appendChild(txtNode);
        list?.appendChild(liNode);
        document.querySelector("form")?.reset();
    }
        else alert("Error");
    })




