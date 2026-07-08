package com.ss.android.ugc.aweme.profile.model;

import X.C1440005kM;
import X.C2188811AlT;
import X.InterfaceC1294060jmO;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC1294060jmO
public final class FollowStatusEvent implements IEvent {
    public final FollowStatus status;

    public final FollowStatusEvent copy(FollowStatus followStatus) {
        return new FollowStatusEvent(followStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowStatusEvent) && Intrinsics.LJFF(this.status, ((FollowStatusEvent) obj).status);
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowStatusEvent(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final FollowStatus getStatus() {
        return this.status;
    }

    public FollowStatusEvent(FollowStatus followStatus) {
        this.status = followStatus;
    }
}
