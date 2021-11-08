import { StudentsService } from './../services/students.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-lista-students',
  templateUrl: './lista-students.component.html',
  styleUrls: ['./lista-students.component.css']
})
export class ListaStudentsComponent implements OnInit {

  students: any[] = [];

  constructor(private service: StudentsService) { }

  ngOnInit(): void {
    this.service.todos().subscribe((students: any[])=> {
      console.table(students)
      this.students = students;
    })
  }

}
