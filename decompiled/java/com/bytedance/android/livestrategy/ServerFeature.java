package com.bytedance.android.livestrategy;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class ServerFeature {

    @C09CT("EndTime")
    public final String endTime;

    @C09CT("Index")
    public final int index;

    @C09CT("Type")
    public final String type;

    @C09CT("Value")
    public final String value;

    public ServerFeature(int i, String str, String str2, String str3) {
        this.index = i;
        this.type = str;
        this.value = str2;
        this.endTime = str3;
    }
}
