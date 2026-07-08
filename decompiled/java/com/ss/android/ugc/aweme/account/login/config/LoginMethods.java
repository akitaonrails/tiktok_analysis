package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C2097608Jq;

/* JADX INFO: loaded from: classes29.dex */
public final class LoginMethods {

    @C09CT("account_recovery")
    public final AccountRecoveryConfig accountRecoveryConfig;

    @C09CT("auto_login")
    public final BasicConfig autoLogin;

    @C09CT("google_onetap")
    public final BasicConfig googleOnetap;

    @C09CT("history_login")
    public final HistoryLoginConfig historyLogin;

    @C09CT("mobile")
    public final MobileConfig mobile;

    @C09CT("passkey")
    public final BasicConfig passkey;

    @C09CT("share_one_tap_login")
    public final ShareOneTapLoginConfig shareOneTapLogin;

    @C09CT("third_parties")
    public final ThirdPartyConfig thirdPartis;

    public LoginMethods() {
        this(new MobileConfig(new BasicConfig(true)), new ThirdPartyConfig("", C2097608Jq.LJ()), new BasicConfig(true), new BasicConfig(true), new BasicConfig(true), new HistoryLoginConfig(true, new BasicConfig(true)), new ShareOneTapLoginConfig(true, true, true, new BasicConfig(false)), new AccountRecoveryConfig(true, ""));
    }

    public LoginMethods(MobileConfig mobileConfig, ThirdPartyConfig thirdPartyConfig, BasicConfig basicConfig, BasicConfig basicConfig2, BasicConfig basicConfig3, HistoryLoginConfig historyLoginConfig, ShareOneTapLoginConfig shareOneTapLoginConfig, AccountRecoveryConfig accountRecoveryConfig) {
        this.mobile = mobileConfig;
        this.thirdPartis = thirdPartyConfig;
        this.passkey = basicConfig;
        this.googleOnetap = basicConfig2;
        this.autoLogin = basicConfig3;
        this.historyLogin = historyLoginConfig;
        this.shareOneTapLogin = shareOneTapLoginConfig;
        this.accountRecoveryConfig = accountRecoveryConfig;
    }
}
