package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class HeaderParamConfigSetting {

    @C09CT("custom")
    public final List<HeaderParamConfig> custom;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final HeaderParamConfig f51default;

    public HeaderParamConfigSetting() {
        this(null, null);
    }

    public HeaderParamConfigSetting(HeaderParamConfig headerParamConfig, List<HeaderParamConfig> list) {
        this.f51default = headerParamConfig;
        this.custom = list;
    }
}
