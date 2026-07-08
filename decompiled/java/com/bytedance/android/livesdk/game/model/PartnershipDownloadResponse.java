package com.bytedance.android.livesdk.game.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class PartnershipDownloadResponse {

    @C09CT("referrer")
    public String referrer;

    public PartnershipDownloadResponse() {
        this(null);
    }

    public PartnershipDownloadResponse(String str) {
        this.referrer = str;
    }
}
