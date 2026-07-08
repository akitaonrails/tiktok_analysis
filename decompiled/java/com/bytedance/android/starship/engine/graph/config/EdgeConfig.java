package com.bytedance.android.starship.engine.graph.config;

import X.C09CS;
import X.C09CT;
import X.EnumC1307550k89;
import X.EnumC1308140k96;

/* JADX INFO: loaded from: classes21.dex */
public final class EdgeConfig {

    @C09CT("condition")
    public final String condition;

    @C09CT("source")
    public final String source;

    @C09CT("strength")
    @C09CS(EdgeStrengthAdapter.class)
    public final EnumC1308140k96 strength;

    @C09CT("target")
    public final String target;

    @C09CT("trigger")
    @C09CS(EdgeTriggerAdapter.class)
    public final EnumC1307550k89 trigger;

    public EdgeConfig(String str, String str2, EnumC1308140k96 enumC1308140k96, EnumC1307550k89 enumC1307550k89, String str3) {
        this.source = str;
        this.target = str2;
        this.strength = enumC1308140k96;
        this.trigger = enumC1307550k89;
        this.condition = str3;
    }
}
