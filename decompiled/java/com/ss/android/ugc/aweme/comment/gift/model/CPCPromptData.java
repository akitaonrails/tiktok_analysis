package com.ss.android.ugc.aweme.comment.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CPCPromptData {
    public static final int $stable = 0;

    @C09CT("time_interval_for_next_prompt")
    public final int nextPromptInterval;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("redirect_link_text")
    public final String redirectLinkText;

    public CPCPromptData() {
        this("", "", 0);
    }

    public CPCPromptData(String str, String str2, int i) {
        this.promptText = str;
        this.redirectLinkText = str2;
        this.nextPromptInterval = i;
    }
}
