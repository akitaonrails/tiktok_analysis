package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states;

import X.AbstractC1623806Xk;
import X.C004I;
import X.C1265190j1p;
import X.C2188811AlT;
import X.C626160OhC;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowerRelationState implements C004I, InterfaceC636340Oxc<FollowerRelationState, InterfaceC1891350zJl> {
    public static final int $stable = 8;
    public final User followerListOwner;
    public final boolean isSelf;
    public final C627660Ojc<InterfaceC1891350zJl> listState;
    public final String pageToken;
    public final C1265190j1p payload;
    public final String secUserId;
    public final String userId;

    public FollowerRelationState() {
        this("", "", false, "", null, new C627660Ojc(null, null, null, null, 15), new C1265190j1p(false, 0, 0L, false, 0, 0, false, 255));
    }

    public final FollowerRelationState copy(String str, String str2, boolean z, String str3, User user, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C1265190j1p c1265190j1p) {
        return new FollowerRelationState(str, str2, z, str3, user, c627660Ojc, c1265190j1p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowerRelationState)) {
            return false;
        }
        FollowerRelationState followerRelationState = (FollowerRelationState) obj;
        return Intrinsics.LJFF(this.userId, followerRelationState.userId) && Intrinsics.LJFF(this.secUserId, followerRelationState.secUserId) && this.isSelf == followerRelationState.isSelf && Intrinsics.LJFF(this.pageToken, followerRelationState.pageToken) && Intrinsics.LJFF(this.followerListOwner, followerRelationState.followerListOwner) && Intrinsics.LJFF(this.listState, followerRelationState.listState) && Intrinsics.LJFF(this.payload, followerRelationState.payload);
    }

    public int hashCode() {
        int iHashCode = ((((((this.userId.hashCode() * 31) + this.secUserId.hashCode()) * 31) + C786410Ut5.Z2(this.isSelf)) * 31) + this.pageToken.hashCode()) * 31;
        User user = this.followerListOwner;
        return ((((iHashCode + (user == null ? 0 : user.hashCode())) * 31) + this.listState.hashCode()) * 31) + this.payload.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerRelationState(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.secUserId);
        sbLIZ.append(", isSelf=");
        sbLIZ.append(this.isSelf);
        sbLIZ.append(", pageToken=");
        sbLIZ.append(this.pageToken);
        sbLIZ.append(", followerListOwner=");
        sbLIZ.append(this.followerListOwner);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    public final User getFollowerListOwner() {
        return this.followerListOwner;
    }

    @Override // X.InterfaceC627270Oiz
    public C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.listState;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final C1265190j1p getPayload() {
        return this.payload;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public FollowerRelationState(String str, String str2, boolean z, String str3, User user, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C1265190j1p c1265190j1p) {
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.pageToken = str3;
        this.followerListOwner = user;
        this.listState = c627660Ojc;
        this.payload = c1265190j1p;
    }
}
