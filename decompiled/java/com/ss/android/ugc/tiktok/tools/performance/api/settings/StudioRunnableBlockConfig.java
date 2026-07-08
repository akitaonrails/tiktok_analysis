package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class StudioRunnableBlockConfig {

    @C09CT("block_list")
    public final List<String> blockList;

    @C09CT("block_time_in_mills")
    public final Long blockTimeInMills;

    @C09CT("enable")
    public final Boolean enable;

    public StudioRunnableBlockConfig() {
        this(null, null, null, 7, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StudioRunnableBlockConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", blockTimeInMills=");
        sbLIZ.append(this.blockTimeInMills);
        sbLIZ.append(", blockList=");
        sbLIZ.append(this.blockList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StudioRunnableBlockConfig(Boolean bool, Long l, List<String> list) {
        this.enable = bool;
        this.blockTimeInMills = l;
        this.blockList = list;
    }

    public StudioRunnableBlockConfig(Boolean bool, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
