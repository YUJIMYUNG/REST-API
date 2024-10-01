import { useState } from 'react';
import './RegisterPage.css';

function RegisterPage(){

    //회원가입시 필요한 내용들
    const[email, setEmail] = useState(""); //이메일
    const[nickName, setNickname] = useState(""); //닉네임
    const[name, setName] = useState(""); //이름
    const[password, setPassword] = useState(""); //비밀번호
    const[checkedPassword, setCheckedPassword] = useState(""); //비밀번호 확인


    return(
        <div className='registerPage'>
            <h2>회원가입</h2>

            <br/>

            <div className='registerContainer'>
                <div className='emailInput'>
                    <label />
                    <input type='email' placeholder='이메일' value={email}/>
                </div>
                <div>
                    <label />
                    <input type='text' placeholder='닉네임' value={nickName}/>
                </div>  
                <div>                        
                    <label />
                    <input type='text' maxLength='20' placeholder='이름' value={name}/>
                </div>
                <div>
                    <label />
                    <input type='password' minLength='8' maxLength='20' placeholder='비밀번호' value={password}/>
                </div>
                <div>
                    <label />
                    <input type='password' minLength='8' maxLength='20' placeholder='비밀번호 확인' value={checkedPassword}/>
                </div>

                <br />

                <button>회원가입</button>
            </div>
        </div>
    );
}

export default RegisterPage;