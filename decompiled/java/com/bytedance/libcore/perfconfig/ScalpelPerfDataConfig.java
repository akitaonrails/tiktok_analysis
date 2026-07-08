package com.bytedance.libcore.perfconfig;

import X.C09CT;
import X.C1867430yhB;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class ScalpelPerfDataConfig {

    @C09CT("extra")
    public String extra;

    @C09CT("main_thread")
    public ScalpelPerfConfigItem mainThreadConfig;

    @C09CT("sub_thread")
    public ScalpelPerfConfigItem subThreadConfig;

    public ScalpelPerfDataConfig() {
        this(null, null, null, 7, null);
    }

    public final String getExtra() {
        return this.extra;
    }

    public final ScalpelPerfConfigItem getMainThreadConfig() {
        return this.mainThreadConfig;
    }

    public final ScalpelPerfConfigItem getSubThreadConfig() {
        return this.subThreadConfig;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setMainThreadConfig(ScalpelPerfConfigItem scalpelPerfConfigItem) {
        this.mainThreadConfig = scalpelPerfConfigItem;
    }

    public final void setSubThreadConfig(ScalpelPerfConfigItem scalpelPerfConfigItem) {
        this.subThreadConfig = scalpelPerfConfigItem;
    }

    public ScalpelPerfDataConfig(ScalpelPerfConfigItem scalpelPerfConfigItem, ScalpelPerfConfigItem scalpelPerfConfigItem2, String str) {
        this.mainThreadConfig = scalpelPerfConfigItem;
        this.subThreadConfig = scalpelPerfConfigItem2;
        this.extra = str;
    }

    public ScalpelPerfDataConfig(ScalpelPerfConfigItem scalpelPerfConfigItem, ScalpelPerfConfigItem scalpelPerfConfigItem2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1867430yhB.LIZ : scalpelPerfConfigItem, (i & 2) != 0 ? C1867430yhB.LIZ : scalpelPerfConfigItem2, (i & 4) != 0 ? "" : str);
    }
}
