package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SyncOutreachEntry implements Serializable {

    @C09CT("keys")
    public final List<String> outreachKeys;

    @C09CT("type")
    public final String outreachType;

    public SyncOutreachEntry(String str, List<String> list) {
        this.outreachType = str;
        this.outreachKeys = list;
    }
}
