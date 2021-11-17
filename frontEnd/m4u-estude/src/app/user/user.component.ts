import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { UsersService } from '../services/users.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  @Output() aoCadastrar = new EventEmitter<any>();


  username: String | undefined;
  email: String | undefined;
  password: String | undefined;

  constructor(private service: UsersService) { }

  ngOnInit(): void {
  }

  cadastrar() {
    console.log('Solicita casdastro de novo usuário');
    console.log('nome: ', this.username);
    console.log('nome: ', this.email);
    console.log('nome: ', this.password);

    const dados: any = { name: this.username, email: this.email, age: this.password }
    this.service.adicionar(dados).subscribe(resultado => {
      console.log(resultado);

    }, (error) => console.log(error))

    this.limparCampos();
  }

  limparCampos() {
    this.username = '';
    this.email = '';
    this.password = '';

  }



}
