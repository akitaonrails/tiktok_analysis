package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;
import com.bytedance.helios.api.config.AgControlConfig;

/* JADX INFO: loaded from: classes14.dex */
public final class AgConfig {

    @C09CT("real_config")
    public final AgControlConfig realConfig;

    @C09CT("version")
    public final String version;

    public AgConfig() {
        this(new AgControlConfig(false, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 65535, null), null);
    }

    public AgConfig(AgControlConfig agControlConfig, String str) {
        this.realConfig = agControlConfig;
        this.version = str;
    }
}
