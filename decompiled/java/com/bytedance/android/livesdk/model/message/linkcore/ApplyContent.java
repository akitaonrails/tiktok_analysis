package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyContent {

    @C09CT("applier")
    public Player applicant;

    @C09CT("applier_link_mic_id")
    public String applicantLinkMicId;

    @C09CT("applier_linker_session_id")
    public String applierLinkerSessionId;

    public ApplyContent() {
        this(null, null, null);
    }

    public ApplyContent(Player player, String str, String str2) {
        this.applicant = player;
        this.applicantLinkMicId = str;
        this.applierLinkerSessionId = str2;
    }
}
