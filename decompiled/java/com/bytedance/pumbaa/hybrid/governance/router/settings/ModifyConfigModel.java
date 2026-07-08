package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyConfigModel {

    @C09CT("dfid")
    public final String dataflowId;

    @C09CT("params")
    public final ModifyParamModel params;

    @C09CT("method_name")
    public final String source;

    @C09CT("src_url")
    public final String sourceUrl;

    @C09CT("target_url")
    public final String targetUrl;

    public ModifyConfigModel() {
        this(null, null, null, null, null);
    }

    public ModifyConfigModel(String str, String str2, String str3, String str4, ModifyParamModel modifyParamModel) {
        this.dataflowId = str;
        this.sourceUrl = str2;
        this.source = str3;
        this.targetUrl = str4;
        this.params = modifyParamModel;
    }
}
