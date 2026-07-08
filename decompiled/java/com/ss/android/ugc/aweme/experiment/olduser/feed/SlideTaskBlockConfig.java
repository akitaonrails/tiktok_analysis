package com.ss.android.ugc.aweme.experiment.olduser.feed;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class SlideTaskBlockConfig {

    @C09CT("all_work_thread_task_block")
    public final boolean allWorkThreadTaskBlock;

    @C09CT("block_task_type_list")
    public final List<Integer> blockTaskTypeList;

    @C09CT("enable_strategy")
    public final boolean enableStrategy;

    public SlideTaskBlockConfig() {
        this(false, false, null, 7, null);
    }

    public SlideTaskBlockConfig(boolean z, boolean z2, List<Integer> list) {
        this.enableStrategy = z;
        this.allWorkThreadTaskBlock = z2;
        this.blockTaskTypeList = list;
    }

    public SlideTaskBlockConfig(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
