package com.ss.android.account.share.data.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public class AccountShareInfo {

    @C09CT("account_extra")
    public String accountExtra;

    @C09CT("account_type")
    public int accountType;

    @C09CT("app_id")
    public int appid;

    @C09CT("error_msg")
    public String errMsg;

    @C09CT("from_install_id")
    public String fromInstallId;

    @C09CT("is_key_mode")
    public Boolean isKidMode;

    @C09CT("account_online")
    public int isLogin;

    @C09CT("sec_user_id")
    public String secUserId;

    @C09CT("user_avatar")
    public String userAvatar;

    @C09CT("user_name")
    public String userName;

    @C09CT("user_session")
    public String userSession;

    public AccountShareInfo() {
    }

    public AccountShareInfo(String str) {
        this.errMsg = str;
    }
}
