package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class ShowItemsStruct implements Serializable {

    @C09CT("desc")
    public final String desc;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final String type;

    public ShowItemsStruct(String str, String str2, String str3) {
        this.desc = str;
        this.schema = str2;
        this.type = str3;
    }
}
