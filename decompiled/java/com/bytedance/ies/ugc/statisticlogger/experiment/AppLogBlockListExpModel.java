package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AppLogBlockListExpModel {

    @C09CT("block_events")
    public final List<String> blockEvents;

    @C09CT("enable")
    public final boolean enable;

    public AppLogBlockListExpModel() {
        this(false, null, 3, null);
    }

    public AppLogBlockListExpModel(boolean z, List<String> list) {
        this.enable = z;
        this.blockEvents = list;
    }

    public AppLogBlockListExpModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
