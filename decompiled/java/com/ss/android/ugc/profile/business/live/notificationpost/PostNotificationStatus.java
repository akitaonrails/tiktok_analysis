package com.ss.android.ugc.profile.business.live.notificationpost;

import X.C004I;
import X.C1265190j1p;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import com.bytedance.jedi.arch.ext.list.ListState;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class PostNotificationStatus implements C004I {
    public static final int $stable = 8;
    public final boolean friendsPushSwitchState;
    public final String hotSoonText;
    public final boolean isHotSoonHasMore;
    public final ListState<InterfaceC1891350zJl, C1265190j1p> listState;
    public final boolean pushSwitchState;
    public final String secUid;
    public final String uid;
    public final HashMap<String, Integer> unreadCountMap;
    public final List<String> unreadUidList;
    public final int vcdCount;

    public PostNotificationStatus() {
        this(null, null, null, false, 0, null, false, false, null, null, 1023, null);
    }

    public final PostNotificationStatus copy(String str, String str2, ListState<InterfaceC1891350zJl, C1265190j1p> listState, boolean z, int i, String str3, boolean z2, boolean z3, HashMap<String, Integer> map, List<String> list) {
        return new PostNotificationStatus(str, str2, listState, z, i, str3, z2, z3, map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostNotificationStatus)) {
            return false;
        }
        PostNotificationStatus postNotificationStatus = (PostNotificationStatus) obj;
        return Intrinsics.LJFF(this.uid, postNotificationStatus.uid) && Intrinsics.LJFF(this.secUid, postNotificationStatus.secUid) && Intrinsics.LJFF(this.listState, postNotificationStatus.listState) && this.isHotSoonHasMore == postNotificationStatus.isHotSoonHasMore && this.vcdCount == postNotificationStatus.vcdCount && Intrinsics.LJFF(this.hotSoonText, postNotificationStatus.hotSoonText) && this.pushSwitchState == postNotificationStatus.pushSwitchState && this.friendsPushSwitchState == postNotificationStatus.friendsPushSwitchState && Intrinsics.LJFF(this.unreadCountMap, postNotificationStatus.unreadCountMap) && Intrinsics.LJFF(this.unreadUidList, postNotificationStatus.unreadUidList);
    }

    public int hashCode() {
        return (((((((((((((((((this.uid.hashCode() * 31) + this.secUid.hashCode()) * 31) + this.listState.hashCode()) * 31) + C786410Ut5.Z2(this.isHotSoonHasMore)) * 31) + this.vcdCount) * 31) + this.hotSoonText.hashCode()) * 31) + C786410Ut5.Z2(this.pushSwitchState)) * 31) + C786410Ut5.Z2(this.friendsPushSwitchState)) * 31) + this.unreadCountMap.hashCode()) * 31) + this.unreadUidList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostNotificationStatus(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(", isHotSoonHasMore=");
        sbLIZ.append(this.isHotSoonHasMore);
        sbLIZ.append(", vcdCount=");
        sbLIZ.append(this.vcdCount);
        sbLIZ.append(", hotSoonText=");
        sbLIZ.append(this.hotSoonText);
        sbLIZ.append(", pushSwitchState=");
        sbLIZ.append(this.pushSwitchState);
        sbLIZ.append(", friendsPushSwitchState=");
        sbLIZ.append(this.friendsPushSwitchState);
        sbLIZ.append(", unreadCountMap=");
        sbLIZ.append(this.unreadCountMap);
        sbLIZ.append(", unreadUidList=");
        sbLIZ.append(this.unreadUidList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getFriendsPushSwitchState() {
        return this.friendsPushSwitchState;
    }

    public final String getHotSoonText() {
        return this.hotSoonText;
    }

    public final ListState<InterfaceC1891350zJl, C1265190j1p> getListState() {
        return this.listState;
    }

    public final boolean getPushSwitchState() {
        return this.pushSwitchState;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final boolean isHotSoonHasMore() {
        return this.isHotSoonHasMore;
    }

    public PostNotificationStatus(String str, String str2, ListState<InterfaceC1891350zJl, C1265190j1p> listState, boolean z, int i, String str3, boolean z2, boolean z3, HashMap<String, Integer> map, List<String> list) {
        this.uid = str;
        this.secUid = str2;
        this.listState = listState;
        this.isHotSoonHasMore = z;
        this.vcdCount = i;
        this.hotSoonText = str3;
        this.pushSwitchState = z2;
        this.friendsPushSwitchState = z3;
        this.unreadCountMap = map;
        this.unreadUidList = list;
    }

    public PostNotificationStatus(String str, String str2, ListState listState, boolean z, int i, String str3, boolean z2, boolean z3, HashMap map, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new ListState(new C1265190j1p(false, 0, 0L, false, 0, 0, false, 255), null, null, null, null, 30, null) : listState, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? true : z2, (i2 & 128) == 0 ? z3 : false, (i2 & 256) != 0 ? new HashMap() : map, (i2 & 512) != 0 ? C13BV.INSTANCE : list);
    }
}
