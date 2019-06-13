import { TestBed } from '@angular/core/testing';

import { ServicioMuebleService } from './servicio-mueble.service';

describe('ServicioMuebleService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServicioMuebleService = TestBed.get(ServicioMuebleService);
    expect(service).toBeTruthy();
  });
});
