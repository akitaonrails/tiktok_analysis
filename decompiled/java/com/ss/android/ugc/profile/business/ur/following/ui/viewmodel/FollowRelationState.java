package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel;

import X.C004I;
import X.C0XQ7;
import X.C2188811AlT;
import X.C588270N5l;
import X.C786410Ut5;
import X.EnumC1265000j1W;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowRelationState implements C004I, InterfaceC0148002o {
    public static final int $stable = 0;
    public final int connectedRelationCount;
    public final int fanCount;
    public final boolean hasVisitedFollowerTab;
    public final boolean hasVisitedFriendsTab;
    public final boolean isFollowerTab;
    public final boolean isFollowingTab;
    public final EnumC1265000j1W isPrivacyGuideClosed;
    public final int mutualCount;
    public final String tabIndex;

    public FollowRelationState() {
        this(0, 0, 0, false, null, false, false, false, null, 511, null);
    }

    public final FollowRelationState copy(int i, int i2, int i3, boolean z, String str, boolean z2, boolean z3, boolean z4, EnumC1265000j1W enumC1265000j1W) {
        return new FollowRelationState(i, i2, i3, z, str, z2, z3, z4, enumC1265000j1W);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRelationState)) {
            return false;
        }
        FollowRelationState followRelationState = (FollowRelationState) obj;
        return this.connectedRelationCount == followRelationState.connectedRelationCount && this.fanCount == followRelationState.fanCount && this.mutualCount == followRelationState.mutualCount && this.isFollowingTab == followRelationState.isFollowingTab && Intrinsics.LJFF(this.tabIndex, followRelationState.tabIndex) && this.isFollowerTab == followRelationState.isFollowerTab && this.hasVisitedFollowerTab == followRelationState.hasVisitedFollowerTab && this.hasVisitedFriendsTab == followRelationState.hasVisitedFriendsTab && this.isPrivacyGuideClosed == followRelationState.isPrivacyGuideClosed;
    }

    public int hashCode() {
        return (((((((((((((((this.connectedRelationCount * 31) + this.fanCount) * 31) + this.mutualCount) * 31) + C786410Ut5.Z2(this.isFollowingTab)) * 31) + this.tabIndex.hashCode()) * 31) + C786410Ut5.Z2(this.isFollowerTab)) * 31) + C786410Ut5.Z2(this.hasVisitedFollowerTab)) * 31) + C786410Ut5.Z2(this.hasVisitedFriendsTab)) * 31) + this.isPrivacyGuideClosed.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowRelationState(connectedRelationCount=");
        sbLIZ.append(this.connectedRelationCount);
        sbLIZ.append(", fanCount=");
        sbLIZ.append(this.fanCount);
        sbLIZ.append(", mutualCount=");
        sbLIZ.append(this.mutualCount);
        sbLIZ.append(", isFollowingTab=");
        sbLIZ.append(this.isFollowingTab);
        sbLIZ.append(", tabIndex=");
        sbLIZ.append(this.tabIndex);
        sbLIZ.append(", isFollowerTab=");
        sbLIZ.append(this.isFollowerTab);
        sbLIZ.append(", hasVisitedFollowerTab=");
        sbLIZ.append(this.hasVisitedFollowerTab);
        sbLIZ.append(", hasVisitedFriendsTab=");
        sbLIZ.append(this.hasVisitedFriendsTab);
        sbLIZ.append(", isPrivacyGuideClosed=");
        sbLIZ.append(this.isPrivacyGuideClosed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getConnectedRelationCount() {
        return this.connectedRelationCount;
    }

    public final int getFanCount() {
        return this.fanCount;
    }

    public final boolean getHasVisitedFollowerTab() {
        return this.hasVisitedFollowerTab;
    }

    public final boolean getHasVisitedFriendsTab() {
        return this.hasVisitedFriendsTab;
    }

    public final int getMutualCount() {
        return this.mutualCount;
    }

    public final String getTabIndex() {
        return this.tabIndex;
    }

    public final boolean isFollowerTab() {
        return this.isFollowerTab;
    }

    public final boolean isFollowingTab() {
        return this.isFollowingTab;
    }

    public final EnumC1265000j1W isPrivacyGuideClosed() {
        return this.isPrivacyGuideClosed;
    }

    public FollowRelationState(int i, int i2, int i3, boolean z, String str, boolean z2, boolean z3, boolean z4, EnumC1265000j1W enumC1265000j1W) {
        this.connectedRelationCount = i;
        this.fanCount = i2;
        this.mutualCount = i3;
        this.isFollowingTab = z;
        this.tabIndex = str;
        this.isFollowerTab = z2;
        this.hasVisitedFollowerTab = z3;
        this.hasVisitedFriendsTab = z4;
        this.isPrivacyGuideClosed = enumC1265000j1W;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FollowRelationState(int i, int i2, int i3, boolean z, String str, boolean z2, boolean z3, boolean z4, EnumC1265000j1W enumC1265000j1W, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        EnumC1265000j1W enumC1265000j1W2 = enumC1265000j1W;
        boolean z5 = z3;
        boolean z6 = z2;
        String str2 = str;
        boolean z7 = z;
        int i5 = i3;
        int followerCount = i2;
        int i6 = (i4 & 1) != 0 ? 0 : i;
        if ((i4 & 2) != 0) {
            User curUser = C0XQ7.LJFF().getCurUser();
            if (curUser == null) {
                followerCount = 0;
            } else if (C588270N5l.LIZ(curUser)) {
                followerCount = curUser.getFansCount();
            } else {
                followerCount = curUser.getFollowerCount();
            }
        }
        this(i6, followerCount, (i4 & 4) != 0 ? 0 : i5, (i4 & 8) != 0 ? false : z7, (i4 & 16) != 0 ? "" : str2, (i4 & 32) != 0 ? false : z6, (i4 & 64) != 0 ? false : z5, (i4 & 128) == 0 ? z4 : false, (i4 & 256) != 0 ? EnumC1265000j1W.DEFAULT : enumC1265000j1W2);
    }
}
