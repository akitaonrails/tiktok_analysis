package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class SeiLiveShowGuestInfo {

    @C09CT("order")
    public int show_order;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int show_status;

    @C09CT("time")
    public long start_time;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.show_order), Long.valueOf(this.start_time), Integer.valueOf(this.show_status));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SeiLiveShowGuestInfo seiLiveShowGuestInfo = (SeiLiveShowGuestInfo) obj;
        if (this.show_order == seiLiveShowGuestInfo.show_order && this.start_time == seiLiveShowGuestInfo.start_time && this.show_status == seiLiveShowGuestInfo.show_status) {
            return true;
        }
        return false;
    }
}
