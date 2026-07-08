package com.bytedance.helios.api.config;

import X.C09CT;
import X.C2097608Jq;

/* JADX INFO: loaded from: classes14.dex */
public final class ModifyConfig {

    @C09CT("modify_conf")
    public final ModifyConf modifyConf;

    @C09CT("name")
    public final String name;

    @C09CT("range_conf")
    public final RangeConf rangeConf;

    public ModifyConfig() {
        this("", new RangeConf(null, null, null, null, 15, null), new ModifyConf(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ()));
    }

    public ModifyConfig(String str, RangeConf rangeConf, ModifyConf modifyConf) {
        this.name = str;
        this.rangeConf = rangeConf;
        this.modifyConf = modifyConf;
    }
}
