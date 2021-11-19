import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

import { StudentsService } from '../services/students.service';



@Component({
  selector: 'app-management',
  templateUrl: './management.component.html',
  styleUrls: ['./management.component.css']
})
export class ManagementComponent implements OnInit {

  constructor(private service: StudentsService ) {

  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  public form!: FormGroup;

  cadastrar($event: any) {
    console.log($event)
    this.service.adicionar($event);
  }

}
