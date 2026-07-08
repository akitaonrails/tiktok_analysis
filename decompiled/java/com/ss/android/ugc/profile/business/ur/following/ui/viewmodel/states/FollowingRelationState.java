package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.states;

import X.AbstractC1623806Xk;
import X.C004I;
import X.C1265190j1p;
import X.C13BV;
import X.C291001Au;
import X.C626160OhC;
import X.C627260Oiy;
import X.C627660Ojc;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FollowingRelationState implements C004I, InterfaceC636340Oxc<FollowingRelationState, InterfaceC1891350zJl> {
    public static final int $stable = 8;
    public final User followingListOwner;
    public final String hotsoonText;
    public final boolean isHotsoonHasMore;
    public final boolean isSelf;
    public final ListState<InterfaceC1891350zJl, C1265190j1p> jediListState;
    public final C627660Ojc<InterfaceC1891350zJl> listState;
    public final int liveSortBy;
    public final String pageToken;
    public final C1265190j1p payload;
    public final List<InterfaceC1891350zJl> recommendList;
    public final C291001Au<Boolean> refresh;
    public final String removeUid;
    public final String secUserId;
    public final HashMap<String, Integer> unreadCountMap;
    public final List<String> unreadUidList;
    public final String userId;
    public final int vcdCount;

    public FollowingRelationState() {
        this(null, null, false, null, null, false, 0, null, null, null, null, 0, null, null, null, null, null, 131071, null);
    }

    public final FollowingRelationState copy(String str, String str2, boolean z, List<? extends InterfaceC1891350zJl> list, ListState<InterfaceC1891350zJl, C1265190j1p> listState, boolean z2, int i, String str3, HashMap<String, Integer> map, List<String> list2, String str4, int i2, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C1265190j1p c1265190j1p, C291001Au<Boolean> c291001Au, String str5, User user) {
        return new FollowingRelationState(str, str2, z, list, listState, z2, i, str3, map, list2, str4, i2, c627660Ojc, c1265190j1p, c291001Au, str5, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowingRelationState)) {
            return false;
        }
        FollowingRelationState followingRelationState = (FollowingRelationState) obj;
        return Intrinsics.LJFF(this.userId, followingRelationState.userId) && Intrinsics.LJFF(this.secUserId, followingRelationState.secUserId) && this.isSelf == followingRelationState.isSelf && Intrinsics.LJFF(this.recommendList, followingRelationState.recommendList) && Intrinsics.LJFF(this.jediListState, followingRelationState.jediListState) && this.isHotsoonHasMore == followingRelationState.isHotsoonHasMore && this.vcdCount == followingRelationState.vcdCount && Intrinsics.LJFF(this.hotsoonText, followingRelationState.hotsoonText) && Intrinsics.LJFF(this.unreadCountMap, followingRelationState.unreadCountMap) && Intrinsics.LJFF(this.unreadUidList, followingRelationState.unreadUidList) && Intrinsics.LJFF(this.pageToken, followingRelationState.pageToken) && this.liveSortBy == followingRelationState.liveSortBy && Intrinsics.LJFF(this.listState, followingRelationState.listState) && Intrinsics.LJFF(this.payload, followingRelationState.payload) && Intrinsics.LJFF(this.refresh, followingRelationState.refresh) && Intrinsics.LJFF(this.removeUid, followingRelationState.removeUid) && Intrinsics.LJFF(this.followingListOwner, followingRelationState.followingListOwner);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.userId.hashCode() * 31) + this.secUserId.hashCode()) * 31) + C786410Ut5.Z2(this.isSelf)) * 31) + this.recommendList.hashCode()) * 31) + this.jediListState.hashCode()) * 31) + C786410Ut5.Z2(this.isHotsoonHasMore)) * 31) + this.vcdCount) * 31) + this.hotsoonText.hashCode()) * 31) + this.unreadCountMap.hashCode()) * 31) + this.unreadUidList.hashCode()) * 31) + this.pageToken.hashCode()) * 31) + this.liveSortBy) * 31) + this.listState.hashCode()) * 31) + this.payload.hashCode()) * 31) + this.refresh.hashCode()) * 31) + this.removeUid.hashCode()) * 31;
        User user = this.followingListOwner;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public String toString() {
        return "FollowingRelationState(userId=" + this.userId + ", secUserId=" + this.secUserId + ", isSelf=" + this.isSelf + ", recommendList=" + this.recommendList + ", jediListState=" + this.jediListState + ", isHotsoonHasMore=" + this.isHotsoonHasMore + ", vcdCount=" + this.vcdCount + ", hotsoonText=" + this.hotsoonText + ", unreadCountMap=" + this.unreadCountMap + ", unreadUidList=" + this.unreadUidList + ", pageToken=" + this.pageToken + ", liveSortBy=" + this.liveSortBy + ", listState=" + this.listState + ", payload=" + this.payload + ", refresh=" + this.refresh + ", removeUid=" + this.removeUid + ", followingListOwner=" + this.followingListOwner + ')';
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

    public final User getFollowingListOwner() {
        return this.followingListOwner;
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<InterfaceC1891350zJl, C1265190j1p> getJediListState() {
        return this.jediListState;
    }

    @Override // X.InterfaceC627270Oiz
    public C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.listState;
    }

    public final int getLiveSortBy() {
        return this.liveSortBy;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final C1265190j1p getPayload() {
        return this.payload;
    }

    public final List<InterfaceC1891350zJl> getRecommendList() {
        return this.recommendList;
    }

    public final C291001Au<Boolean> getRefresh() {
        return this.refresh;
    }

    public final String getRemoveUid() {
        return this.removeUid;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final boolean isHotsoonHasMore() {
        return this.isHotsoonHasMore;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FollowingRelationState(String str, String str2, boolean z, List<? extends InterfaceC1891350zJl> list, ListState<InterfaceC1891350zJl, C1265190j1p> listState, boolean z2, int i, String str3, HashMap<String, Integer> map, List<String> list2, String str4, int i2, C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C1265190j1p c1265190j1p, C291001Au<Boolean> c291001Au, String str5, User user) {
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.recommendList = list;
        this.jediListState = listState;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i;
        this.hotsoonText = str3;
        this.unreadCountMap = map;
        this.unreadUidList = list2;
        this.pageToken = str4;
        this.liveSortBy = i2;
        this.listState = c627660Ojc;
        this.payload = c1265190j1p;
        this.refresh = c291001Au;
        this.removeUid = str5;
        this.followingListOwner = user;
    }

    public FollowingRelationState(String str, String str2, boolean z, List list, ListState listState, boolean z2, int i, String str3, HashMap map, List list2, String str4, int i2, C627660Ojc c627660Ojc, C1265190j1p c1265190j1p, C291001Au c291001Au, String str5, User user, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? C13BV.INSTANCE : list, (i3 & 16) != 0 ? new ListState(new C1265190j1p(false, 0, 0L, false, 0, 0, false, 255), null, null, null, null, 30, null) : listState, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? new HashMap() : map, (i3 & 512) != 0 ? C13BV.INSTANCE : list2, (i3 & 1024) != 0 ? "" : str4, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? i2 : 0, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new C627660Ojc(null, null, null, null, 15) : c627660Ojc, (i3 & 8192) != 0 ? new C1265190j1p(false, 0, 0L, false, 0, 0, false, 255) : c1265190j1p, (i3 & 16384) != 0 ? new C291001Au(Boolean.TRUE) : c291001Au, (32768 & i3) == 0 ? str5 : "", (i3 & 65536) != 0 ? null : user);
    }
}
