package com.ss.android.ugc.aweme.inbox.response;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxLiveNotice {
    public boolean isCache;

    @C09CT("is_fresh")
    public final boolean isFresh;
    public int priority;
    public long receiveTime;

    @C09CT("room_info")
    public final SlimRoom roomInfo;

    @C09CT("type")
    public final int type;

    @C09CT("owner")
    public final User user;

    public InboxLiveNotice() {
        this(null, 0, null, false, 0, false, System.currentTimeMillis());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxLiveNotice)) {
            return false;
        }
        InboxLiveNotice inboxLiveNotice = (InboxLiveNotice) obj;
        return Intrinsics.LJFF(this.user, inboxLiveNotice.user) && this.type == inboxLiveNotice.type && Intrinsics.LJFF(this.roomInfo, inboxLiveNotice.roomInfo) && this.isFresh == inboxLiveNotice.isFresh && this.priority == inboxLiveNotice.priority && this.isCache == inboxLiveNotice.isCache && this.receiveTime == inboxLiveNotice.receiveTime;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxLiveNotice(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", roomInfo=");
        sbLIZ.append(this.roomInfo);
        sbLIZ.append(", isFresh=");
        sbLIZ.append(this.isFresh);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", isCache=");
        sbLIZ.append(this.isCache);
        sbLIZ.append(", receiveTime=");
        sbLIZ.append(this.receiveTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final boolean isFresh() {
        return this.isFresh;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public final void setReceiveTime(long j) {
        this.receiveTime = j;
    }

    public InboxLiveNotice(User user, int i, SlimRoom slimRoom, boolean z, int i2, boolean z2, long j) {
        this.user = user;
        this.type = i;
        this.roomInfo = slimRoom;
        this.isFresh = z;
        this.priority = i2;
        this.isCache = z2;
        this.receiveTime = j;
    }
}
