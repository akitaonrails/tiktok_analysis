package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C1595950rdJ;
import X.C2188811AlT;
import X.C712780Rxc;
import X.InterfaceC1594910rbd;
import X.InterfaceC1595240rcA;
import X.InterfaceC1595980rdM;
import X.InterfaceC1891350zJl;
import X.InterfaceC714040Rze;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightFollowingUserItem implements InterfaceC1594910rbd, InterfaceC1595980rdM, InterfaceC1595240rcA, InterfaceC714040Rze {
    public boolean LL;

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("user")
    public User followingUser;

    @C09CT("red_dot")
    public SkylightFollowingUserRedDot redDot;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightFollowingUserItem)) {
            return false;
        }
        SkylightFollowingUserItem skylightFollowingUserItem = (SkylightFollowingUserItem) obj;
        return Intrinsics.LJFF(this.followingUser, skylightFollowingUserItem.followingUser) && Intrinsics.LJFF(this.redDot, skylightFollowingUserItem.redDot) && Intrinsics.LJFF(this.aweme, skylightFollowingUserItem.aweme);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "frequent_following";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    public final int hashCode() {
        User user = this.followingUser;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        SkylightFollowingUserRedDot skylightFollowingUserRedDot = this.redDot;
        return ((iHashCode + (skylightFollowingUserRedDot != null ? skylightFollowingUserRedDot.hashCode() : 0)) * 31) + this.aweme.hashCode();
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightFollowingUserItem(followingUser=");
        sbLIZ.append(this.followingUser);
        sbLIZ.append(", redDot=");
        sbLIZ.append(this.redDot);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC714040Rze
    public final boolean hasUnreadStory() {
        return C712780Rxc.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC714040Rze
    public final Aweme getStoryCollection() {
        return this.aweme;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return this.followingUser;
    }

    @Override // X.InterfaceC1595980rdM
    public final void LIZ(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof SkylightFollowingUserItem)) {
            return false;
        }
        SkylightFollowingUserItem skylightFollowingUserItem = (SkylightFollowingUserItem) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.followingUser, skylightFollowingUserItem.followingUser) || !Intrinsics.LJFF(this.redDot, skylightFollowingUserItem.redDot) || this.LL != skylightFollowingUserItem.LL) {
            return false;
        }
        return true;
    }

    public SkylightFollowingUserItem(User user, SkylightFollowingUserRedDot skylightFollowingUserRedDot, Aweme aweme) {
        this.followingUser = user;
        this.redDot = skylightFollowingUserRedDot;
        this.aweme = aweme;
    }
}
