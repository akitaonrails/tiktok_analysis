package com.ss.android.ugc.aweme.ecommerce.recorder;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class EcSvAiTeleprompterModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("url")
    public final String url;

    public EcSvAiTeleprompterModel() {
        this(true, "aweme://roma_redirect/?spark_page=ec_sv_copilot_teleprompter");
    }

    public EcSvAiTeleprompterModel(boolean z, String str) {
        this.enable = z;
        this.url = str;
    }
}
