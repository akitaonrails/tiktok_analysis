package com.ss.android.ugc.aweme.vibefeed.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes10.dex */
public final class SharedFeedDynamicConfig {

    @C09CT("enable_config_count")
    public final boolean enable;

    @C09CT("group_feed_item_list_length")
    public final int groupPageSize;

    @C09CT("min_final_set_size")
    public final int minFinalSetSize;

    @C09CT("min_group_final_set_size")
    public final int minGroupFinalSetSize;

    @C09CT("feed_item_list_length")
    public final int pageSize;

    public SharedFeedDynamicConfig() {
        this(true, 15, 15, 15, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedFeedDynamicConfig)) {
            return false;
        }
        SharedFeedDynamicConfig sharedFeedDynamicConfig = (SharedFeedDynamicConfig) obj;
        return this.enable == sharedFeedDynamicConfig.enable && this.pageSize == sharedFeedDynamicConfig.pageSize && this.groupPageSize == sharedFeedDynamicConfig.groupPageSize && this.minFinalSetSize == sharedFeedDynamicConfig.minFinalSetSize && this.minGroupFinalSetSize == sharedFeedDynamicConfig.minGroupFinalSetSize;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.enable) * 31) + this.pageSize) * 31) + this.groupPageSize) * 31) + this.minFinalSetSize) * 31) + this.minGroupFinalSetSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedFeedDynamicConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(this.pageSize);
        sbLIZ.append(", groupPageSize=");
        sbLIZ.append(this.groupPageSize);
        sbLIZ.append(", minFinalSetSize=");
        sbLIZ.append(this.minFinalSetSize);
        sbLIZ.append(", minGroupFinalSetSize=");
        sbLIZ.append(this.minGroupFinalSetSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SharedFeedDynamicConfig(boolean z, int i, int i2, int i3, int i4) {
        this.enable = z;
        this.pageSize = i;
        this.groupPageSize = i2;
        this.minFinalSetSize = i3;
        this.minGroupFinalSetSize = i4;
    }
}
