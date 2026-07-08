package com.bytedance.lynx.hybrid.ttp.model;

import X.C09CT;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPExemptionSettingBean {

    @C09CT("config")
    public final Config config;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("page")
    public final Config page;

    /* JADX WARN: Multi-variable type inference failed */
    public TTPExemptionSettingBean() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public TTPExemptionSettingBean(boolean z, Config config, Config config2) {
        this.enable = z;
        this.page = config;
        this.config = config2;
    }

    public /* synthetic */ TTPExemptionSettingBean(boolean z, Config config, Config config2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new Config(null, null, 3, null) : config, (i & 4) != 0 ? new Config(null, null, 3, null) : config2);
    }
}
