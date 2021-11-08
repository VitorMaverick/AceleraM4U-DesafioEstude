import { StudentsService } from './../services/students.service';
import { Component, OnInit, Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
import { Student } from '../models/student.models';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  @Output() aoCadastrar = new EventEmitter<any>();


  name: String | undefined;
  email: String | undefined;
  age: number | undefined;

  constructor(private service: StudentsService) { }

  ngOnInit(): void {
  }

  cadastrar() {
    console.log('Solicita caadastro de novo estudante');
    console.log('nome: ', this.name);
    console.log('nome: ', this.email);
    console.log('nome: ', this.age);

    const dados: any = { name: this.name, email: this.email, age: this.age }
    this.service.adicionar(dados).subscribe(resultado => {
      console.log(resultado);

    }, (error) => console.log(error))

    this.limparCampos();
  }

  limparCampos() {
    this.name = '';
    this.email = '';
    this.age = 0;

  }

}
