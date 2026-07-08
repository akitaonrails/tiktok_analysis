package com.ss.android.ugc.aweme.tools.beauty.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class LocalBeautyListDefaultConfig {

    @C09CT("config_list")
    public final List<LocalBeautyConfig> configList;

    @C09CT("enable")
    public final boolean enable;

    public LocalBeautyListDefaultConfig() {
        this(false, null, 3, null);
    }

    public LocalBeautyListDefaultConfig(boolean z, List<LocalBeautyConfig> list) {
        this.enable = z;
        this.configList = list;
    }

    public LocalBeautyListDefaultConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
