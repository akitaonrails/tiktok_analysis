package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class KYCVerifySchemaInfo implements Serializable {

    @C09CT("page_http")
    public final String pageHttp;

    @C09CT("page_schema")
    public final String pageSchema;

    @C09CT("pop_up_schema")
    public final String popUpSchema;

    public KYCVerifySchemaInfo() {
        this(null, null, null);
    }

    public KYCVerifySchemaInfo(String str, String str2, String str3) {
        this.pageHttp = str;
        this.pageSchema = str2;
        this.popUpSchema = str3;
    }
}
