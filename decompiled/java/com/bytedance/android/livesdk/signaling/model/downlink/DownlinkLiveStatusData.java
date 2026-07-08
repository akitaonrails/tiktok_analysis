package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class DownlinkLiveStatusData extends BaseDownlinkData {

    @C09CT("live_status_change_list")
    public List<DownlinkLiveStatusItem> liveStatusChangeList;

    public DownlinkLiveStatusData() {
        this(null);
    }

    public final DownlinkLiveStatusData copy(List<DownlinkLiveStatusItem> list) {
        return new DownlinkLiveStatusData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownlinkLiveStatusData) && Intrinsics.LJFF(this.liveStatusChangeList, ((DownlinkLiveStatusData) obj).liveStatusChangeList);
    }

    public int hashCode() {
        List<DownlinkLiveStatusItem> list = this.liveStatusChangeList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownlinkLiveStatusData(liveStatusChangeList=");
        sbLIZ.append(this.liveStatusChangeList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<DownlinkLiveStatusItem> getLiveStatusChangeList() {
        return this.liveStatusChangeList;
    }

    public DownlinkLiveStatusData(List<DownlinkLiveStatusItem> list) {
        this.liveStatusChangeList = list;
    }

    public final void setLiveStatusChangeList(List<DownlinkLiveStatusItem> list) {
        this.liveStatusChangeList = list;
    }
}
