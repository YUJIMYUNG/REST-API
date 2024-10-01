import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Nav } from 'react-bootstrap';
import LandingPage from './component/LandingPage/LandingPage';
import RegisterPage from './component/RegisterPage/RegisterPage';
import LoginPage from './component/LoginPage/LoginPage';
import Navigation from './component/NavBar/Navigation';
import BoardPage from './component/BoardPage/BoardPage';

function App() {


  return (
    <BrowserRouter>
      <Navigation />
      <Routes>
        <Route path="/" element={<LandingPage />} />
        <Route path="/board" element={<BoardPage />} />
      </Routes>
      <Routes path='/account' element={<AccountPage />} >
        <Route path="/account/login" element={<LoginPage />} />
        <Route path="/account/register" element={<RegisterPage />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
