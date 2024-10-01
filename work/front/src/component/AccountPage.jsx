import { type } from "@testing-library/user-event/dist/type";
import { Link } from "react-router-dom";
import { Outlet } from "react-router-dom";

const AccountPage = ({type}) =>{
    return(
        <div>
            <div className="formType">
                <h3>
                    {/* type에 따라서 로그인, 회원가입 페이지 렌더링 */}
                    {type === 'loginPage' ? '로그인' : '회원가입'}
                </h3>
            </div>
            
            <div className="inputList">
                <Link to='/' />
                {/* 자식 컴포넌트의 위치 지정 Outlet사용 */}
                <Outlet />
            </div>
        </div>
    );
}