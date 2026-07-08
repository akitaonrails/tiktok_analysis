package com.bytedance.helios.api.config;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class FuseConfig {

    @C09CT("fuse_conf")
    public final FuseConf fuseConf;

    @C09CT("name")
    public final String name;

    @C09CT("range_conf")
    public final RangeConf rangeConf;

    public FuseConfig() {
        this("", new RangeConf(null, null, null, null, 15, null), new FuseConf(410, "this api is not allow"));
    }

    public FuseConfig(String str, RangeConf rangeConf, FuseConf fuseConf) {
        this.name = str;
        this.rangeConf = rangeConf;
        this.fuseConf = fuseConf;
    }
}
