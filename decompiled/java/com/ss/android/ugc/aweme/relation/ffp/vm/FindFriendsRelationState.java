package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes20.dex */
public final class FindFriendsRelationState implements C004I {
    public static final int $stable = 0;
    public final boolean hasVisitedFriendTab;

    public FindFriendsRelationState() {
        this(false);
    }

    public final FindFriendsRelationState copy(boolean z) {
        return new FindFriendsRelationState(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FindFriendsRelationState) && this.hasVisitedFriendTab == ((FindFriendsRelationState) obj).hasVisitedFriendTab;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.hasVisitedFriendTab);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FindFriendsRelationState(hasVisitedFriendTab=");
        sbLIZ.append(this.hasVisitedFriendTab);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasVisitedFriendTab() {
        return this.hasVisitedFriendTab;
    }

    public FindFriendsRelationState(boolean z) {
        this.hasVisitedFriendTab = z;
    }
}
