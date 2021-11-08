import { HttpClient, HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatToolbarModule} from '@angular/material/toolbar';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { FooterComponent } from './footer/footer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { StudentComponent } from './student/student.component';
import { UserComponent } from './user/user.component';
import { AddressComponent } from './address/address.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
<<<<<<< HEAD
import { ManagementComponent } from './management/management.component';
=======
import { FormsModule } from '@angular/forms';
import { ListaStudentsComponent } from './lista-students/lista-students.component';
>>>>>>> 0b19664edc79c3bf38691edac2f26d3a9d64a2fe

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
<<<<<<< HEAD
    ManagementComponent
=======
    ListaStudentsComponent
>>>>>>> 0b19664edc79c3bf38691edac2f26d3a9d64a2fe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
