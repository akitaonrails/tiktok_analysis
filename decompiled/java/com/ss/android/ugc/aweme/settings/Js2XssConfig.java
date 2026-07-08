package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class Js2XssConfig {

    @C09CT("xss_callback_id_switch")
    public final boolean xssCallBackEnable;

    @C09CT("xss_url_change_switch")
    public final boolean xssUrlChangedEnable;

    public Js2XssConfig() {
        this(false, false);
    }

    public Js2XssConfig(boolean z, boolean z2) {
        this.xssCallBackEnable = z;
        this.xssUrlChangedEnable = z2;
    }
}
