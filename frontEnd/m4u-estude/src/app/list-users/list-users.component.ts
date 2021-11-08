import { Component, OnInit } from '@angular/core';
import { UsersService } from '../services/users.service';

@Component({
  selector: 'app-list-users',
  templateUrl: './list-users.component.html',
  styleUrls: ['./list-users.component.css']
})
export class ListUsersComponent implements OnInit {

   users: any[] = [];

  constructor(private service: UsersService) { }

  ngOnInit(): void {
    this.service.todos().subscribe((users: any[])=> {
      console.table(users)
      this.users = users;
    })
  }

}
