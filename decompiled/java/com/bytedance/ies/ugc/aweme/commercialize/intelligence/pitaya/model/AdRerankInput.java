package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class AdRerankInput implements Serializable {

    @C09CT("function_name")
    public final String function_name;

    @C09CT("param_json")
    public final ParamJson param_json;

    public AdRerankInput() {
        this("adjust_items", null);
    }

    public final String getFunction_name() {
        return this.function_name;
    }

    public final ParamJson getParam_json() {
        return this.param_json;
    }

    public AdRerankInput(String str, ParamJson paramJson) {
        this.function_name = str;
        this.param_json = paramJson;
    }
}
