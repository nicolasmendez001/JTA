import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MuebleComponent } from './mueble.component';

describe('MuebleComponent', () => {
  let component: MuebleComponent;
  let fixture: ComponentFixture<MuebleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MuebleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MuebleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
