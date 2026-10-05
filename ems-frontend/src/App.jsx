import { useState } from 'react'
import './App.css'
import FooterComponent from './components/footerComponent'
import HeaderComponent from './components/HeaderComponent'
import ListEmployeeCompponent from './components/ListEmployeeCompponent'
import { BrowserRouter,Routes, Route } from 'react-router-dom'
import EmployeeComponent from './components/EmployeeComponent'


function App() {


  return (
    <>
    <BrowserRouter>
    <HeaderComponent />
    <Routes>
      <Route path='/' element={<ListEmployeeCompponent />}>
      </Route>
      <Route path='/employees' element={<ListEmployeeCompponent />}>
      </Route>
      <Route path='/add-employee' element={<EmployeeComponent />}>
      </Route>
      <Route path='/edit-employee/:id' element={<EmployeeComponent />}>
      </Route>
    </Routes>

    <FooterComponent />
    </BrowserRouter>
    </>
  )
}

export default App
