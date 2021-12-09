import React, {useState} from 'react';
import css from '../../Css/RegistrationForm.css';

function RegistrationForm(props) {
    return (

            <div id="signin">
                <div className="form-title">Sign in</div>
                <div className="input-field">
                    <input type="email" id="email" autoComplete="off"/>
                    <i className="material-icons">email</i>
                    <label htmlFor="email">Email</label>
                </div>
                <div className="input-field">
                    <input type="password" id="password"/>
                    <i className="material-icons">lock</i>
                    <label htmlFor="password">Password</label>
                </div>
                <a href="" className="forgot-pw"><p>Forgot Password ?</p></a>
                <button className="login">Login</button>
                <div className="check">
                    <i className="material-icons">check</i>
                </div>
            </div>

    )
}

export default RegistrationForm;