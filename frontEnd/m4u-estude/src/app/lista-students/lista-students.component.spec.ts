import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaStudentsComponent } from './lista-students.component';

describe('ListaStudentsComponent', () => {
  let component: ListaStudentsComponent;
  let fixture: ComponentFixture<ListaStudentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaStudentsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaStudentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
