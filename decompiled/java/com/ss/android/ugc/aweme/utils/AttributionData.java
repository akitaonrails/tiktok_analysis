package com.ss.android.ugc.aweme.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AttributionData {

    @C09CT("af_sdk")
    public final String afAttributionData;

    @C09CT("af_ddl")
    public final String afDDL;

    @C09CT("gpir")
    public final String gpir;

    @C09CT("meta_ddl")
    public final String metaDDL;

    @C09CT("mir")
    public final String mir;

    public AttributionData() {
        this("", "", "", "", "");
    }

    public AttributionData(String str, String str2, String str3, String str4, String str5) {
        this.afAttributionData = str;
        this.gpir = str2;
        this.mir = str3;
        this.metaDDL = str4;
        this.afDDL = str5;
    }
}
