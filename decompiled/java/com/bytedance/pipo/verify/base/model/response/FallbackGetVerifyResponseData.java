package com.bytedance.pipo.verify.base.model.response;

import X.C09CT;
import com.bytedance.pipo.verify.base.model.SchemaComposer;

/* JADX INFO: loaded from: classes27.dex */
public final class FallbackGetVerifyResponseData {

    @C09CT("SchemaList")
    public final SchemaComposer schemaList;

    @C09CT("VerifyId")
    public final String verifyId;

    @C09CT("VerifyType")
    public final String verifyType;

    public FallbackGetVerifyResponseData() {
        this(null, null, null);
    }

    public FallbackGetVerifyResponseData(String str, String str2, SchemaComposer schemaComposer) {
        this.verifyId = str;
        this.verifyType = str2;
        this.schemaList = schemaComposer;
    }
}
