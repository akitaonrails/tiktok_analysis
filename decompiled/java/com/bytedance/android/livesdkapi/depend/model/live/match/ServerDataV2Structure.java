package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class ServerDataV2Structure {

    @C09CT("decision_id")
    public final String decisionId;

    @C09CT("decision_name")
    public final String decisionName;

    @C09CT("source")
    public final String source;

    @C09CT("value")
    public final String value;

    public ServerDataV2Structure(String str, String str2, String str3, String str4) {
        this.value = str;
        this.source = str2;
        this.decisionName = str3;
        this.decisionId = str4;
    }
}
