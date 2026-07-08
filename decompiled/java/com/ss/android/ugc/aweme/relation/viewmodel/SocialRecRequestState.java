package com.ss.android.ugc.aweme.relation.viewmodel;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialRecRequestState implements C004I {
    public static final int $stable = 8;
    public final FriendList<? extends User> friends;
    public final boolean isNeedActualPopUp;
    public final int isNewVersionSynced;
    public final boolean isOverStayTime;
    public final boolean isSkipByCancel;
    public final boolean isSkipByEmptyData;
    public final boolean isSkipByException;
    public final boolean isSync;
    public final boolean needNewVersionRecShow;
    public final int newVersionSyncClick;

    public SocialRecRequestState() {
        this(false, false, false, false, false, false, null, -1, -1, false);
    }

    public final SocialRecRequestState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i, int i2, boolean z7) {
        return new SocialRecRequestState(z, z2, z3, z4, z5, z6, friendList, i, i2, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialRecRequestState)) {
            return false;
        }
        SocialRecRequestState socialRecRequestState = (SocialRecRequestState) obj;
        return this.isSkipByException == socialRecRequestState.isSkipByException && this.isSkipByEmptyData == socialRecRequestState.isSkipByEmptyData && this.isSkipByCancel == socialRecRequestState.isSkipByCancel && this.isSync == socialRecRequestState.isSync && this.isOverStayTime == socialRecRequestState.isOverStayTime && this.isNeedActualPopUp == socialRecRequestState.isNeedActualPopUp && Intrinsics.LJFF(this.friends, socialRecRequestState.friends) && this.newVersionSyncClick == socialRecRequestState.newVersionSyncClick && this.isNewVersionSynced == socialRecRequestState.isNewVersionSynced && this.needNewVersionRecShow == socialRecRequestState.needNewVersionRecShow;
    }

    public int hashCode() {
        int iZ2 = ((((((((((C786410Ut5.Z2(this.isSkipByException) * 31) + C786410Ut5.Z2(this.isSkipByEmptyData)) * 31) + C786410Ut5.Z2(this.isSkipByCancel)) * 31) + C786410Ut5.Z2(this.isSync)) * 31) + C786410Ut5.Z2(this.isOverStayTime)) * 31) + C786410Ut5.Z2(this.isNeedActualPopUp)) * 31;
        FriendList<? extends User> friendList = this.friends;
        return ((((((iZ2 + (friendList == null ? 0 : friendList.hashCode())) * 31) + this.newVersionSyncClick) * 31) + this.isNewVersionSynced) * 31) + C786410Ut5.Z2(this.needNewVersionRecShow);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialRecRequestState(isSkipByException=");
        sbLIZ.append(this.isSkipByException);
        sbLIZ.append(", isSkipByEmptyData=");
        sbLIZ.append(this.isSkipByEmptyData);
        sbLIZ.append(", isSkipByCancel=");
        sbLIZ.append(this.isSkipByCancel);
        sbLIZ.append(", isSync=");
        sbLIZ.append(this.isSync);
        sbLIZ.append(", isOverStayTime=");
        sbLIZ.append(this.isOverStayTime);
        sbLIZ.append(", isNeedActualPopUp=");
        sbLIZ.append(this.isNeedActualPopUp);
        sbLIZ.append(", friends=");
        sbLIZ.append(this.friends);
        sbLIZ.append(", newVersionSyncClick=");
        sbLIZ.append(this.newVersionSyncClick);
        sbLIZ.append(", isNewVersionSynced=");
        sbLIZ.append(this.isNewVersionSynced);
        sbLIZ.append(", needNewVersionRecShow=");
        sbLIZ.append(this.needNewVersionRecShow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final FriendList<? extends User> getFriends() {
        return this.friends;
    }

    public final boolean getNeedNewVersionRecShow() {
        return this.needNewVersionRecShow;
    }

    public final int getNewVersionSyncClick() {
        return this.newVersionSyncClick;
    }

    public final boolean isNeedActualPopUp() {
        return this.isNeedActualPopUp;
    }

    public final int isNewVersionSynced() {
        return this.isNewVersionSynced;
    }

    public final boolean isOverStayTime() {
        return this.isOverStayTime;
    }

    public final boolean isSkipByCancel() {
        return this.isSkipByCancel;
    }

    public final boolean isSkipByEmptyData() {
        return this.isSkipByEmptyData;
    }

    public final boolean isSkipByException() {
        return this.isSkipByException;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i, int i2, boolean z7) {
        this.isSkipByException = z;
        this.isSkipByEmptyData = z2;
        this.isSkipByCancel = z3;
        this.isSync = z4;
        this.isOverStayTime = z5;
        this.isNeedActualPopUp = z6;
        this.friends = friendList;
        this.newVersionSyncClick = i;
        this.isNewVersionSynced = i2;
        this.needNewVersionRecShow = z7;
    }
}
