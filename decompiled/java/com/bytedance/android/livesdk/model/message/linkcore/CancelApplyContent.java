package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CancelApplyContent {

    @C09CT("applier")
    public Player applicant;

    @C09CT("applier_link_mic_id")
    public String applicantLinkMicId;

    @C09CT("applier_linker_session_id")
    public String applierLinkerSessionId;

    public CancelApplyContent() {
        this(null, null, null);
    }

    public CancelApplyContent(Player player, String str, String str2) {
        this.applicant = player;
        this.applicantLinkMicId = str;
        this.applierLinkerSessionId = str2;
    }
}
