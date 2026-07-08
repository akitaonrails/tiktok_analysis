package com.ss.android.ugc.aweme.account.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class LoginFlowOptConfigSettings {
    public static final LoginFlowOptConfigModel LIZ = new LoginFlowOptConfigModel(3, true);

    public static final class LoginFlowOptConfigModel {

        @C09CT("enable_org_history_login")
        public final boolean enableOrgHistoryLogin;

        @C09CT("login_precheck_timeout")
        public final int loginPrecheckTimeout;

        public LoginFlowOptConfigModel() {
            this(3, true);
        }

        public LoginFlowOptConfigModel(int i, boolean z) {
            this.loginPrecheckTimeout = i;
            this.enableOrgHistoryLogin = z;
        }
    }
}
