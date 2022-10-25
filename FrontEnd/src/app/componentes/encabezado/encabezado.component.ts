import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {

  persona: persona = new persona("","","");
  constructor(public porfolioService: PorfolioService) { }

  ngOnInit(): void {

    this.porfolioService.getPersona().subscribe(data=> {this.persona = data});
  }

}
