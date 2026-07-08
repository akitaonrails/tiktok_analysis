package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class EpAIGCRequestJson {

    @C09CT("duration")
    public final int duration;

    @C09CT("ratio")
    public final String ratio;

    @C09CT("style_prompt")
    public final String stylePrompt;

    public EpAIGCRequestJson() {
        this("", "", 0);
    }

    public EpAIGCRequestJson(String str, String str2, int i) {
        this.ratio = str;
        this.stylePrompt = str2;
        this.duration = i;
    }
}
