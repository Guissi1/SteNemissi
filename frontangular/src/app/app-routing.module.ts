import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './dashboard/home-page/home-page.component';
import { ProductsPageComponent } from './dashboard/product/products-page/products-page.component';
import { ProviderssPageComponent } from './dashboard/provider/providerss-page/providerss-page.component';
import { FacturePageComponent } from './dashboard/facture-page/facture-page.component';
import { NavigationBarComponent } from './dashboard/navigation-bar/navigation-bar.component';

const routes: Routes = [
  {path:'home-page',component:HomePageComponent},
  {path:'',redirectTo:'home-page',pathMatch:'full'},
  {path:'providers-page',component:ProviderssPageComponent},
  {path:'products-page',component:ProductsPageComponent},
  {path:'facture-page',component:FacturePageComponent},
  {path:'navigation-bar',component:NavigationBarComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
 
}
