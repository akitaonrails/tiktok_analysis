package com.ss.android.ugc.aweme.account.login.twostep;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class AvailableWaysUserData implements Serializable {
    public static final int $stable = 8;

    @C09CT("avatar_url")
    public final String avatar_url;

    @C09CT("email")
    public final String email;

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("has_email")
    public Boolean has_email;

    @C09CT("has_mobile")
    public Boolean has_mobile;

    @C09CT("has_oauth")
    public Boolean has_oauth;

    @C09CT("has_pwd")
    public Boolean has_pwd;

    @C09CT("is_login")
    public final Boolean is_login;

    @C09CT("is_most_device")
    public final Boolean is_most_device;

    @C09CT("mobile")
    public final String mobile;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("login_passport_ticket")
    public final String passportTicket;

    @C09CT("oauth_platforms")
    public final List<String> platforms;

    @C09CT("safe")
    public final Boolean safe;

    @C09CT("token")
    public final String token;

    @C09CT("username")
    public final String userName;

    public final Boolean is_login() {
        return this.is_login;
    }

    public final Boolean is_most_device() {
        return this.is_most_device;
    }

    public final void setHas_email(Boolean bool) {
        this.has_email = bool;
    }

    public final void setHas_mobile(Boolean bool) {
        this.has_mobile = bool;
    }

    public final void setHas_oauth(Boolean bool) {
        this.has_oauth = bool;
    }

    public final void setHas_pwd(Boolean bool) {
        this.has_pwd = bool;
    }

    public AvailableWaysUserData(String str, String str2, String str3, List<String> list, String str4, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str5, String str6, Boolean bool6, Boolean bool7, String str7) {
        this.avatar_url = str;
        this.nickname = str2;
        this.userName = str3;
        this.platforms = list;
        this.email = str4;
        this.errorCode = num;
        this.has_email = bool;
        this.has_mobile = bool2;
        this.has_oauth = bool3;
        this.has_pwd = bool4;
        this.is_most_device = bool5;
        this.mobile = str5;
        this.token = str6;
        this.is_login = bool6;
        this.safe = bool7;
        this.passportTicket = str7;
    }
}
