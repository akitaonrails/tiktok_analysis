package com.ss.android.ugc.aweme.profile.model;

import X.C1440005kM;
import X.C2188811AlT;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class UserInfoUpdateEvent implements IEvent {
    public final User user;

    public final UserInfoUpdateEvent copy(User user) {
        return new UserInfoUpdateEvent(user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserInfoUpdateEvent) && Intrinsics.LJFF(this.user, ((UserInfoUpdateEvent) obj).user);
    }

    public int hashCode() {
        return this.user.hashCode();
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
        sbLIZ.append("UserInfoUpdateEvent(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final User getUser() {
        return this.user;
    }

    public UserInfoUpdateEvent(User user) {
        this.user = user;
    }
}
