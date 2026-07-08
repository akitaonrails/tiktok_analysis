package com.bytedance.pumbaa.hybrid.governance.router.settings;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyParamModel {

    @C09CT("add_params")
    public final Map<String, String> params;

    @C09CT("rerun_spark_plugin")
    public final int rerun_spark_plugin;

    public ModifyParamModel() {
        this(0, null);
    }

    public ModifyParamModel(int i, Map<String, String> map) {
        this.rerun_spark_plugin = i;
        this.params = map;
    }
}
