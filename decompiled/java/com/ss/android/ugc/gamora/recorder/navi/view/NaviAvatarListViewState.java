package com.ss.android.ugc.gamora.recorder.navi.view;

import X.C004I;
import X.C111S;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class NaviAvatarListViewState implements C004I {
    public static final int $stable = 8;
    public final int avatarCountCandidate;
    public final int avatarCountSelf;
    public final List<C111S> avatarList;
    public final boolean isEditDone;
    public final Integer loadingIndex;
    public final Integer selectedIndex;

    public NaviAvatarListViewState() {
        this(null, 0, 0, null, null, false);
    }

    public final NaviAvatarListViewState copy(List<C111S> list, int i, int i2, Integer num, Integer num2, boolean z) {
        return new NaviAvatarListViewState(list, i, i2, num, num2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NaviAvatarListViewState)) {
            return false;
        }
        NaviAvatarListViewState naviAvatarListViewState = (NaviAvatarListViewState) obj;
        return Intrinsics.LJFF(this.avatarList, naviAvatarListViewState.avatarList) && this.avatarCountSelf == naviAvatarListViewState.avatarCountSelf && this.avatarCountCandidate == naviAvatarListViewState.avatarCountCandidate && Intrinsics.LJFF(this.loadingIndex, naviAvatarListViewState.loadingIndex) && Intrinsics.LJFF(this.selectedIndex, naviAvatarListViewState.selectedIndex) && this.isEditDone == naviAvatarListViewState.isEditDone;
    }

    public int hashCode() {
        List<C111S> list = this.avatarList;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.avatarCountSelf) * 31) + this.avatarCountCandidate) * 31;
        Integer num = this.loadingIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedIndex;
        return ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isEditDone);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NaviAvatarListViewState(avatarList=");
        sbLIZ.append(this.avatarList);
        sbLIZ.append(", avatarCountSelf=");
        sbLIZ.append(this.avatarCountSelf);
        sbLIZ.append(", avatarCountCandidate=");
        sbLIZ.append(this.avatarCountCandidate);
        sbLIZ.append(", loadingIndex=");
        sbLIZ.append(this.loadingIndex);
        sbLIZ.append(", selectedIndex=");
        sbLIZ.append(this.selectedIndex);
        sbLIZ.append(", isEditDone=");
        sbLIZ.append(this.isEditDone);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAvatarCountCandidate() {
        return this.avatarCountCandidate;
    }

    public final int getAvatarCountSelf() {
        return this.avatarCountSelf;
    }

    public final List<C111S> getAvatarList() {
        return this.avatarList;
    }

    public final Integer getLoadingIndex() {
        return this.loadingIndex;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final boolean isEditDone() {
        return this.isEditDone;
    }

    public NaviAvatarListViewState(List<C111S> list, int i, int i2, Integer num, Integer num2, boolean z) {
        this.avatarList = list;
        this.avatarCountSelf = i;
        this.avatarCountCandidate = i2;
        this.loadingIndex = num;
        this.selectedIndex = num2;
        this.isEditDone = z;
    }
}
