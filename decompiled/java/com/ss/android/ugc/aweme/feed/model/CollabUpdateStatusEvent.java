package com.ss.android.ugc.aweme.feed.model;

import X.C1440005kM;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CollabUpdateStatusEvent implements IEvent {
    public final Aweme aweme;
    public final long status;
    public final User user;

    public final CollabUpdateStatusEvent copy(Aweme aweme, User user, long j) {
        return new CollabUpdateStatusEvent(aweme, user, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollabUpdateStatusEvent)) {
            return false;
        }
        CollabUpdateStatusEvent collabUpdateStatusEvent = (CollabUpdateStatusEvent) obj;
        return Intrinsics.LJFF(this.aweme, collabUpdateStatusEvent.aweme) && Intrinsics.LJFF(this.user, collabUpdateStatusEvent.user) && this.status == collabUpdateStatusEvent.status;
    }

    public int hashCode() {
        return (((this.aweme.hashCode() * 31) + this.user.hashCode()) * 31) + C786410Ut5.Y2(this.status);
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
        sbLIZ.append("CollabUpdateStatusEvent(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final long getStatus() {
        return this.status;
    }

    public final User getUser() {
        return this.user;
    }

    public CollabUpdateStatusEvent(Aweme aweme, User user, long j) {
        this.aweme = aweme;
        this.user = user;
        this.status = j;
    }
}
