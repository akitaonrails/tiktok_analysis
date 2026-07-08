package com.ss.android.ugc.aweme.im.sdk.resourcemanage.lego;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class DMDowngradeRejectionExecutionTaskConfig {

    @C09CT("default_recover_delay_time")
    public final long defaultRecoverDelayTime;

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("need_discard_key_list")
    public final List<String> needDiscardKeyList;

    @C09CT("need_run_key_list")
    public final List<String> needRunKeyList;

    @C09CT("suspend_type_list")
    public final List<String> suspendTypeList;

    public DMDowngradeRejectionExecutionTaskConfig() {
        this(false, null, null, null, 0L, 31, null);
    }

    public DMDowngradeRejectionExecutionTaskConfig(boolean z, List<String> list, List<String> list2, List<String> list3, long j) {
        this.isEnable = z;
        this.suspendTypeList = list;
        this.needRunKeyList = list2;
        this.needDiscardKeyList = list3;
        this.defaultRecoverDelayTime = j;
    }

    public DMDowngradeRejectionExecutionTaskConfig(boolean z, List list, List list2, List list3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? C13BV.INSTANCE : list3, (i & 16) != 0 ? 2000L : j);
    }
}
