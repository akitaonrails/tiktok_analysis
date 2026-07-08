package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class EpAIGCT2IRequestJson {

    @C09CT("ratio")
    public final String ratio;

    @C09CT("style_prompt")
    public final String stylePrompt;

    public EpAIGCT2IRequestJson() {
        this("", "");
    }

    public EpAIGCT2IRequestJson(String str, String str2) {
        this.ratio = str;
        this.stylePrompt = str2;
    }
}
