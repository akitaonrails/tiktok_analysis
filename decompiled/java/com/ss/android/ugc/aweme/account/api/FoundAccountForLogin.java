package com.ss.android.ugc.aweme.account.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class FoundAccountForLogin implements Serializable {
    public static final int $stable = 0;

    @C09CT("avatar_url")
    public final String avatarURL;

    @C09CT("email")
    public final String email;

    @C09CT("email_source")
    public final String emailSource;

    @C09CT("mobile")
    public final String mobile;

    @C09CT("mobile_source")
    public final String mobileSource;

    @C09CT("password_verification_available")
    public final boolean passwordVerificationAvailable;

    @C09CT("platform")
    public final String platform;

    @C09CT("popup_config")
    public final AccountLookupPopupConfig popupConfig;

    @C09CT("register_platform")
    public final String registeredPlatform;

    @C09CT("username")
    public final String username;

    public FoundAccountForLogin() {
        this("", "", "", "", "", "", "", "", new AccountLookupPopupConfig("", "", true), false);
    }

    public FoundAccountForLogin(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AccountLookupPopupConfig accountLookupPopupConfig, boolean z) {
        this.username = str;
        this.avatarURL = str2;
        this.email = str3;
        this.emailSource = str4;
        this.mobile = str5;
        this.mobileSource = str6;
        this.platform = str7;
        this.registeredPlatform = str8;
        this.popupConfig = accountLookupPopupConfig;
        this.passwordVerificationAvailable = z;
    }
}
