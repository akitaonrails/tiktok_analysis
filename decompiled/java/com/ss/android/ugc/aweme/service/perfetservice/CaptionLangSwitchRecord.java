package com.ss.android.ugc.aweme.service.perfetservice;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class CaptionLangSwitchRecord implements Serializable {

    @C09CT("language_code")
    public final String languageCode;

    @C09CT("sub_id")
    public final String subId;

    @C09CT("timestamp")
    public final long timestamp;

    public CaptionLangSwitchRecord(long j, String str, String str2) {
        this.timestamp = j;
        this.languageCode = str;
        this.subId = str2;
    }
}
