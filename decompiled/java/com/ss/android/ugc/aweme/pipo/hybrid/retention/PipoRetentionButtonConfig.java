package com.ss.android.ugc.aweme.pipo.hybrid.retention;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoRetentionButtonConfig {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("btn_text")
    public final String btnText;

    public PipoRetentionButtonConfig() {
        this(null, null);
    }

    public PipoRetentionButtonConfig(String str, String str2) {
        this.btnText = str;
        this.actionType = str2;
    }
}
