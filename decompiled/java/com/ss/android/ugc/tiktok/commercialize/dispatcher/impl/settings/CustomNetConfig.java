package com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class CustomNetConfig {

    @C09CT("check_loop_interval")
    public final Long checkLoopInterval;

    @C09CT("critical_net_level")
    public final Integer criticalNet;

    @C09CT("mid_net_level")
    public final Integer midNet;

    @C09CT("minimum_net_level")
    public final Integer minimumNet;

    public CustomNetConfig() {
        this(null, null, null, 10000L);
    }

    public CustomNetConfig(Integer num, Integer num2, Integer num3, Long l) {
        this.minimumNet = num;
        this.midNet = num2;
        this.criticalNet = num3;
        this.checkLoopInterval = l;
    }
}
