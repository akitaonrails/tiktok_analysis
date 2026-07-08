package com.ss.android.ugc.tools.common.quota;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class AiChatQuota {

    @C09CT("max_quota")
    public final int quotaMax;

    @C09CT("remaining_quota")
    public final int quotaRemain;

    public AiChatQuota() {
        this(5, 5);
    }

    public AiChatQuota(int i, int i2) {
        this.quotaRemain = i;
        this.quotaMax = i2;
    }
}
