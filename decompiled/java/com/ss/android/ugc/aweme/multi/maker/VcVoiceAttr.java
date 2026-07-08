package com.ss.android.ugc.aweme.multi.maker;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class VcVoiceAttr {

    @C09CT("create_source")
    public String createSource;

    @C09CT("vc_filter_id")
    public String effectId;

    public VcVoiceAttr() {
        this(null, null);
    }

    public VcVoiceAttr(String str, String str2) {
        this.effectId = str;
        this.createSource = str2;
    }
}
