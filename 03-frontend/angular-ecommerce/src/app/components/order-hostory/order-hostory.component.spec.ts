import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderHostoryComponent } from './order-hostory.component';

describe('OrderHostoryComponent', () => {
  let component: OrderHostoryComponent;
  let fixture: ComponentFixture<OrderHostoryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OrderHostoryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OrderHostoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
