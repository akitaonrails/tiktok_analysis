package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class ComponentParam implements Serializable {

    @C09CT("data_str")
    public final String dataStr;

    @C09CT("key")
    public final String key;

    public ComponentParam() {
        this("", null);
    }

    public ComponentParam(String str, String str2) {
        this.key = str;
        this.dataStr = str2;
    }
}
