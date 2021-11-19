import { StudentsService } from './services/students.service';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsersService } from './services/users.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'm4u-estude';

  constructor(private service: UsersService){

  }

  public form!: FormGroup;

  cadastrar($event: any) {
    console.log($event)
    this.service.adicionar($event);
  }

}
