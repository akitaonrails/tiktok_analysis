package com.ss.android.ugc.profile.business.live.notificationlive.ui;

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
public final class NotificationChoiceState implements C004I {
    public static final int $stable = 8;
    public final String hotsoonText;
    public final boolean isHotsoonHasMore;
    public final boolean isSelf;
    public final ListState<InterfaceC1891350zJl, C1265190j1p> listState;
    public final boolean pushSwitchState;
    public final String secUserId;
    public final HashMap<String, Integer> unreadCountMap;
    public final List<String> unreadUidList;
    public final String userId;
    public final int vcdCount;

    public NotificationChoiceState() {
        this(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    public final NotificationChoiceState copy(String str, String str2, boolean z, ListState<InterfaceC1891350zJl, C1265190j1p> listState, boolean z2, int i, String str3, boolean z3, HashMap<String, Integer> map, List<String> list) {
        return new NotificationChoiceState(str, str2, z, listState, z2, i, str3, z3, map, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationChoiceState)) {
            return false;
        }
        NotificationChoiceState notificationChoiceState = (NotificationChoiceState) obj;
        return Intrinsics.LJFF(this.userId, notificationChoiceState.userId) && Intrinsics.LJFF(this.secUserId, notificationChoiceState.secUserId) && this.isSelf == notificationChoiceState.isSelf && Intrinsics.LJFF(this.listState, notificationChoiceState.listState) && this.isHotsoonHasMore == notificationChoiceState.isHotsoonHasMore && this.vcdCount == notificationChoiceState.vcdCount && Intrinsics.LJFF(this.hotsoonText, notificationChoiceState.hotsoonText) && this.pushSwitchState == notificationChoiceState.pushSwitchState && Intrinsics.LJFF(this.unreadCountMap, notificationChoiceState.unreadCountMap) && Intrinsics.LJFF(this.unreadUidList, notificationChoiceState.unreadUidList);
    }

    public int hashCode() {
        return (((((((((((((((((this.userId.hashCode() * 31) + this.secUserId.hashCode()) * 31) + C786410Ut5.Z2(this.isSelf)) * 31) + this.listState.hashCode()) * 31) + C786410Ut5.Z2(this.isHotsoonHasMore)) * 31) + this.vcdCount) * 31) + this.hotsoonText.hashCode()) * 31) + C786410Ut5.Z2(this.pushSwitchState)) * 31) + this.unreadCountMap.hashCode()) * 31) + this.unreadUidList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationChoiceState(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.secUserId);
        sbLIZ.append(", isSelf=");
        sbLIZ.append(this.isSelf);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(", isHotsoonHasMore=");
        sbLIZ.append(this.isHotsoonHasMore);
        sbLIZ.append(", vcdCount=");
        sbLIZ.append(this.vcdCount);
        sbLIZ.append(", hotsoonText=");
        sbLIZ.append(this.hotsoonText);
        sbLIZ.append(", pushSwitchState=");
        sbLIZ.append(this.pushSwitchState);
        sbLIZ.append(", unreadCountMap=");
        sbLIZ.append(this.unreadCountMap);
        sbLIZ.append(", unreadUidList=");
        sbLIZ.append(this.unreadUidList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<InterfaceC1891350zJl, C1265190j1p> getListState() {
        return this.listState;
    }

    public final boolean getPushSwitchState() {
        return this.pushSwitchState;
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

    public NotificationChoiceState(String str, String str2, boolean z, ListState<InterfaceC1891350zJl, C1265190j1p> listState, boolean z2, int i, String str3, boolean z3, HashMap<String, Integer> map, List<String> list) {
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.listState = listState;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i;
        this.hotsoonText = str3;
        this.pushSwitchState = z3;
        this.unreadCountMap = map;
        this.unreadUidList = list;
    }

    public NotificationChoiceState(String str, String str2, boolean z, ListState listState, boolean z2, int i, String str3, boolean z3, HashMap map, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? new ListState(new C1265190j1p(false, 0, 0L, false, 0, 0, false, 255), null, null, null, null, 30, null) : listState, (i2 & 16) != 0 ? false : z2, (i2 & 32) == 0 ? i : 0, (i2 & 64) == 0 ? str3 : "", (i2 & 128) != 0 ? true : z3, (i2 & 256) != 0 ? new HashMap() : map, (i2 & 512) != 0 ? C13BV.INSTANCE : list);
    }
}
