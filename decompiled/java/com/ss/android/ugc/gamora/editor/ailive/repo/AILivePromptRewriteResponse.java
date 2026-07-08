package com.ss.android.ugc.gamora.editor.ailive.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePromptRewriteResponse {

    @C09CT("log_pb")
    public final LogPB logPb;

    @C09CT("rewrited_prompt")
    public final String rewritedPrompt;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public AILivePromptRewriteResponse() {
        this(null, -1, "", "");
    }

    public AILivePromptRewriteResponse(LogPB logPB, int i, String str, String str2) {
        this.logPb = logPB;
        this.statusCode = i;
        this.statusMessage = str;
        this.rewritedPrompt = str2;
    }
}
