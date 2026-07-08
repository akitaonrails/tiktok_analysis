package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class CpcPromptResponse {

    @C09CT("gift_faq")
    public boolean giftFaq;

    @C09CT("prompt")
    public String prompt;

    @C09CT("redirect_link_text")
    public String redirectLinkText;

    @C09CT("time_interval_for_display")
    public long timeIntervalForDisplay;

    @C09CT("time_interval_for_next_prompt")
    public long timeIntervalForNextPrompt;

    @C09CT("time_interval_for_next_request")
    public long timeIntervalForNextRequest;

    public CpcPromptResponse() {
        this(null, null, 0L, 0L, 0L, false);
    }

    public CpcPromptResponse(String str, String str2, long j, long j2, long j3, boolean z) {
        this.prompt = str;
        this.redirectLinkText = str2;
        this.timeIntervalForDisplay = j;
        this.timeIntervalForNextPrompt = j2;
        this.timeIntervalForNextRequest = j3;
        this.giftFaq = z;
    }
}
