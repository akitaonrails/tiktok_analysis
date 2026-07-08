package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MetaInfoCommonStruct implements Serializable {

    @C09CT("customized_info")
    public String customizedInfo;

    @C09CT("key")
    public MetaInfoKey key;

    @C09CT("standard_ui")
    public MetaInfoUI standardUI;

    public MetaInfoCommonStruct() {
        this(null, null, "");
    }

    public MetaInfoCommonStruct(MetaInfoKey metaInfoKey, MetaInfoUI metaInfoUI, String str) {
        this.key = metaInfoKey;
        this.standardUI = metaInfoUI;
        this.customizedInfo = str;
    }
}
