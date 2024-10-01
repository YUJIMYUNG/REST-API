
import { Link, useNavigate } from "react-router-dom";
import './Navigation.css';

function Navigation(){
    return(
        <div className="navBar">
            <Link className="navbarMenu" to={'/'}>Home</Link>
            <Link className="navbarMenu" to={'/register'}>회원가입</Link>
            <Link className="navbarMenu" to={'/login'}>로그인</Link>
            <Link className="navbarMenu" to={'/board'}>게시판</Link>
        </div>
    );
}

export default Navigation;