package com.ss.android.ugc.aweme.tako.nimblecard.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoNimbleConfigData {

    @C09CT("config_list")
    public final List<TakoNimbleConfig> configList;

    public TakoNimbleConfigData() {
        this(null, 1, null);
    }

    public TakoNimbleConfigData(List<TakoNimbleConfig> list) {
        this.configList = list;
    }

    public TakoNimbleConfigData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
