import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EncabezadoComponent } from './componentes/encabezado/encabezado.component';
import { DatosPersonalesComponent } from './componentes/datos-personales/datos-personales.component';
import { FormacionAcademicaComponent } from './componentes/formacion-academica/formacion-academica.component';
import { ExperienciaLaboralComponent } from './componentes/experiencia-laboral/experiencia-laboral.component';
import { DatosInteresComponent } from './componentes/datos-interes/datos-interes.component';
import { LogosComponent } from './componentes/logos/logos.component';
import { BannerComponent } from './componentes/banner/banner.component';
import { PorfolioService } from './servicios/porfolio.service';

import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardysoftComponent } from './componentes/hardysoft/hardysoft.component';
import { ProyectosComponent } from './componentes/proyectos/proyectos.component';
import { FooterComponent } from './componentes/footer/footer.component';
import { HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    EncabezadoComponent,
    DatosPersonalesComponent,
    FormacionAcademicaComponent,
    ExperienciaLaboralComponent,
    DatosInteresComponent,
    LogosComponent,
    BannerComponent,
    HardysoftComponent,
    ProyectosComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgCircleProgressModule.forRoot({})
  ],
  providers: [PorfolioService],
  bootstrap: [AppComponent]
})
export class AppModule { }
