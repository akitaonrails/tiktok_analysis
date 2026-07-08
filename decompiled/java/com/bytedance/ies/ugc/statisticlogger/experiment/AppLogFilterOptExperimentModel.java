package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogFilterOptExperimentModel {

    @C09CT("db_mem_enable")
    public final boolean db_mem_enable;

    @C09CT("keva_enable")
    public final boolean keva_enable;

    @C09CT("native_enable")
    public final boolean native_enable;

    public AppLogFilterOptExperimentModel() {
        this(false, false, false);
    }

    public AppLogFilterOptExperimentModel(boolean z, boolean z2, boolean z3) {
        this.native_enable = z;
        this.keva_enable = z2;
        this.db_mem_enable = z3;
    }
}
