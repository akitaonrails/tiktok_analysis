package com.bytedance.pumbaa.governance.tool.model;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class PnsGovToolConfigItem {

    @C09CT("controlIntroduction")
    public final ControlIntroduction controlIntroduction;

    @C09CT("controlLevel")
    public final String controlLevel;

    @C09CT("controlStrategy")
    public final ControlStrategy controlStrategy;

    @C09CT("forceBlockEnable")
    public final boolean forceBlockEnable;

    @C09CT("forceHintEnable")
    public final boolean forceHintEnable;

    @C09CT("name")
    public final String name;

    public PnsGovToolConfigItem() {
        this("", null, false, false, null, null);
    }

    public PnsGovToolConfigItem(String str, String str2, boolean z, boolean z2, ControlStrategy controlStrategy, ControlIntroduction controlIntroduction) {
        this.name = str;
        this.controlLevel = str2;
        this.forceBlockEnable = z;
        this.forceHintEnable = z2;
        this.controlStrategy = controlStrategy;
        this.controlIntroduction = controlIntroduction;
    }
}
