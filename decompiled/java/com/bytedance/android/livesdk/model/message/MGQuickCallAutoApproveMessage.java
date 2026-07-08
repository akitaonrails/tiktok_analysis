package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MGQuickCallAutoApproveMessage extends AbstractC1136060ffY {

    @C09CT("quick_call_auto_approve")
    public int quickCallAutoApprove;

    @C09CT("quick_call_auto_approve_start_ms")
    public long quickCallAutoApproveStartMs;

    public MGQuickCallAutoApproveMessage() {
        this.type = C001A.M_G_QUICK_CALL_AUTO_APPROVE_MESSAGE;
    }
}
