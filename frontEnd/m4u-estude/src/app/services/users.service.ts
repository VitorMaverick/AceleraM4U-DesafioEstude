import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserComponent } from '../user/user.component';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private usersList: any[];
private url = 'http://localhost:8080/users'

constructor(private httpClient: HttpClient) {
  this.usersList = [];
}

get users() {
  return this.usersList;
}

adicionar(users: any): Observable<any> {
  this.usersList.push(users)

  return this.httpClient.post<UserComponent>(this.url, users)
}

todos(): Observable<any[]> {
  return this.httpClient.get<any[]>(this.url)
}

}
