package com.bytedance.android.starship.solaria.define;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureMeta implements Serializable {

    @C09CT("data_type")
    public final String dataType;

    @C09CT("description")
    public final String description;

    @C09CT("name")
    public final String featureName;

    @C09CT("func_group")
    public final String funcGroupName;

    @C09CT("func")
    public final String funcName;

    @C09CT("func_params")
    public final FunctionParam funcParams;

    @C09CT("sub_func_group")
    public final String subFuncGroupName;

    @C09CT("sub_func")
    public final String subFuncName;

    @C09CT("tags")
    public final List<String> tags;

    public FeatureMeta() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public FeatureMeta(String str, String str2, String str3, String str4, FunctionParam functionParam, List<String> list, String str5, String str6, String str7) {
        this.featureName = str;
        this.funcGroupName = str2;
        this.funcName = str3;
        this.dataType = str4;
        this.funcParams = functionParam;
        this.tags = list;
        this.description = str5;
        this.subFuncGroupName = str6;
        this.subFuncName = str7;
    }
}
