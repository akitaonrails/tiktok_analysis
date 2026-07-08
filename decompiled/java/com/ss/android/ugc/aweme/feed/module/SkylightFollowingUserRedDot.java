package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class SkylightFollowingUserRedDot implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("triggered_at_s")
    public Long triggeredAtS;

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.triggeredAtS;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightFollowingUserRedDot(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", triggeredAtS=");
        sbLIZ.append(this.triggeredAtS);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setTriggeredAtS(Long l) {
        this.triggeredAtS = l;
    }

    public SkylightFollowingUserRedDot(Integer num, Long l) {
        this.status = num;
        this.triggeredAtS = l;
    }
}
