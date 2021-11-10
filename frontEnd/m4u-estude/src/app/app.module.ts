import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AddressComponent } from './address/address.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { ListUsersComponent } from './list-users/list-users.component';
import { ListaStudentsComponent } from './lista-students/lista-students.component';
import { LoginComponent } from './login/login.component';
import { ManagementComponent } from './management/management.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UsersService } from './services/users.service';
import { StudentComponent } from './student/student.component';
import { UserComponent } from './user/user.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    FooterComponent,
    NavbarComponent,
    StudentComponent,
    UserComponent,
    AddressComponent,
    ManagementComponent,
    ListaStudentsComponent,
    ListUsersComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    FormsModule,
    HttpClientModule,
    MatFormFieldModule,
    MatFormFieldModule,
    MatIconModule
  ],
  providers: [UsersService],
  bootstrap: [AppComponent]
})
export class AppModule { }
