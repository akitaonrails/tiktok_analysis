package com.ss.android.ugc.aweme.pns.consent.core.network;

import X.C09CT;
import X.EnumC1876780ywG;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsentEntityWithRecord {

    @C09CT("key")
    public final String key;

    @C09CT("meta")
    public final String meta;

    @C09CT("record")
    public final LightConsentRecord record;

    @C09CT("required")
    public final Boolean required;

    @C09CT("version")
    public final int version;

    public ConsentEntityWithRecord() {
        this(0, "", "", new LightConsentRecord("", "ANDROID", 0L, EnumC1876780ywG.NOTDETERMINED.toString(), "", ""), Boolean.TRUE);
    }

    public ConsentEntityWithRecord(int i, String str, String str2, LightConsentRecord lightConsentRecord, Boolean bool) {
        this.version = i;
        this.meta = str;
        this.key = str2;
        this.record = lightConsentRecord;
        this.required = bool;
    }
}
