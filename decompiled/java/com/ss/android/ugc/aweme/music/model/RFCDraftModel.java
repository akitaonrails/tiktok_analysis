package com.ss.android.ugc.aweme.music.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class RFCDraftModel implements Serializable {
    public final String backURL;
    public final String campaignID;
    public final String sourcePlatformChannel;

    public RFCDraftModel(String str, String str2, String str3) {
        this.campaignID = str;
        this.backURL = str2;
        this.sourcePlatformChannel = str3;
    }
}
