package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ApplogLogSettingCommonParamsFilterModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("remove_keys")
    public final List<String> removeKeys;

    public ApplogLogSettingCommonParamsFilterModel() {
        this(false, null, 3, null);
    }

    public ApplogLogSettingCommonParamsFilterModel(boolean z, List<String> list) {
        this.enable = z;
        this.removeKeys = list;
    }

    public ApplogLogSettingCommonParamsFilterModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
