package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EnterRoomPrompt {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("duration")
    public final Long duration;

    @C09CT("need_prompt")
    public final boolean needPrompt;

    @C09CT("prompt_text")
    public final String promptText;

    public EnterRoomPrompt() {
        this(null, false, null, 3000L);
    }

    public EnterRoomPrompt(String str, boolean z, String str2, Long l) {
        this.promptText = str;
        this.needPrompt = z;
        this.daInfo = str2;
        this.duration = l;
    }
}
