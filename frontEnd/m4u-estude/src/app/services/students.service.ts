import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { StudentComponent } from '../student/student.component';


@Injectable({
  providedIn: 'root'
})
export class StudentsService {

private studentsList: any[];
private url = 'http://localhost:8080/students'

constructor(private httpClient: HttpClient) {
  this.studentsList = [];
}

get students() {
  return this.studentsList;
}

adicionar(student: any): Observable<any> {
  this.studentsList.push(student)

  return this.httpClient.post<StudentComponent>(this.url, student)
}

todos(): Observable<any[]> {
  return this.httpClient.get<any[]>(this.url)
}


}
