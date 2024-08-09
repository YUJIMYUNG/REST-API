import { useState } from "react";
import { useSearchParams } from "react-router-dom";


function RegisterPage(){
    const[email, setEmail] = useState("");
    const[name, setName] = useState("");
    const[nickname, setNickname] = useState("");
    const[age, setAge] = useState("");
    const[password, setPassword] = useState("");
    const[checkedPassword, setCheckedPassword] = useState("");
}