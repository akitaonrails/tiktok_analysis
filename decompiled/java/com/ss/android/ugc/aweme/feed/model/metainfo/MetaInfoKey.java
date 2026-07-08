package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfoKey implements Serializable {

    @C09CT("business_id")
    public String businessId;

    @C09CT("component_key")
    public String componentKey;

    public MetaInfoKey() {
        this("", "");
    }

    public MetaInfoKey(String str, String str2) {
        this.componentKey = str;
        this.businessId = str2;
    }
}
