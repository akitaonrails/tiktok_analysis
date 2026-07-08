package com.ss.android.ugc.aweme.account.login.v2.ui.experiment;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class AlternativeChannel {

    @C09CT("alternative_sms_app_config")
    public final Map<String, String> alternativeSmsAppConfig;

    @C09CT("enable_phone_signup_secondary_entrance")
    public final boolean enableSecondaryEntrance;

    public AlternativeChannel() {
        this(false, C2097608Jq.LJ());
    }

    public AlternativeChannel(boolean z, Map<String, String> map) {
        this.enableSecondaryEntrance = z;
        this.alternativeSmsAppConfig = map;
    }
}
