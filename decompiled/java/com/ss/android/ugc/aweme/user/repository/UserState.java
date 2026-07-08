package com.ss.android.ugc.aweme.user.repository;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C1252530ihP;
import X.C2188811AlT;
import X.C291001Au;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class UserState implements C004I, InterfaceC0148002o {
    public final AbstractC1252750ihl<FollowStatus> followStatus;
    public final boolean followerIsRemoved;
    public final C291001Au<Boolean> newPostTagChange;
    public final AbstractC1252750ihl<String> remarkName;
    public final Throwable removeFollowerError;
    public final User user;

    public UserState() {
        this(new User(), false, C1252530ihP.LIZ, C1252530ihP.LIZ, null, null);
    }

    public final UserState copy(User user, boolean z, AbstractC1252750ihl<FollowStatus> abstractC1252750ihl, AbstractC1252750ihl<String> abstractC1252750ihl2, Throwable th, C291001Au<Boolean> c291001Au) {
        return new UserState(user, z, abstractC1252750ihl, abstractC1252750ihl2, th, c291001Au);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return Intrinsics.LJFF(this.user, userState.user) && this.followerIsRemoved == userState.followerIsRemoved && Intrinsics.LJFF(this.followStatus, userState.followStatus) && Intrinsics.LJFF(this.remarkName, userState.remarkName) && Intrinsics.LJFF(this.removeFollowerError, userState.removeFollowerError) && Intrinsics.LJFF(this.newPostTagChange, userState.newPostTagChange);
    }

    public int hashCode() {
        int iHashCode = ((((((this.user.hashCode() * 31) + C786410Ut5.Z2(this.followerIsRemoved)) * 31) + this.followStatus.hashCode()) * 31) + this.remarkName.hashCode()) * 31;
        Throwable th = this.removeFollowerError;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.newPostTagChange;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserState(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", followerIsRemoved=");
        sbLIZ.append(this.followerIsRemoved);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.followStatus);
        sbLIZ.append(", remarkName=");
        sbLIZ.append(this.remarkName);
        sbLIZ.append(", removeFollowerError=");
        sbLIZ.append(this.removeFollowerError);
        sbLIZ.append(", newPostTagChange=");
        sbLIZ.append(this.newPostTagChange);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AbstractC1252750ihl<FollowStatus> getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getFollowerIsRemoved() {
        return this.followerIsRemoved;
    }

    public final C291001Au<Boolean> getNewPostTagChange() {
        return this.newPostTagChange;
    }

    public final AbstractC1252750ihl<String> getRemarkName() {
        return this.remarkName;
    }

    public final Throwable getRemoveFollowerError() {
        return this.removeFollowerError;
    }

    public final User getUser() {
        return this.user;
    }

    public UserState(User user) {
        this(user, false, C1252530ihP.LIZ, C1252530ihP.LIZ, null, null);
    }

    public UserState(User user, boolean z) {
        this(user, z, C1252530ihP.LIZ, C1252530ihP.LIZ, null, null);
    }

    public UserState(User user, boolean z, AbstractC1252750ihl<FollowStatus> abstractC1252750ihl) {
        this(user, z, abstractC1252750ihl, C1252530ihP.LIZ, null, null);
    }

    public UserState(User user, boolean z, AbstractC1252750ihl<FollowStatus> abstractC1252750ihl, AbstractC1252750ihl<String> abstractC1252750ihl2) {
        this(user, z, abstractC1252750ihl, abstractC1252750ihl2, null, null);
    }

    public UserState(User user, boolean z, AbstractC1252750ihl<FollowStatus> abstractC1252750ihl, AbstractC1252750ihl<String> abstractC1252750ihl2, Throwable th) {
        this(user, z, abstractC1252750ihl, abstractC1252750ihl2, th, null);
    }

    public UserState(User user, boolean z, AbstractC1252750ihl<FollowStatus> abstractC1252750ihl, AbstractC1252750ihl<String> abstractC1252750ihl2, Throwable th, C291001Au<Boolean> c291001Au) {
        this.user = user;
        this.followerIsRemoved = z;
        this.followStatus = abstractC1252750ihl;
        this.remarkName = abstractC1252750ihl2;
        this.removeFollowerError = th;
        this.newPostTagChange = c291001Au;
    }
}
