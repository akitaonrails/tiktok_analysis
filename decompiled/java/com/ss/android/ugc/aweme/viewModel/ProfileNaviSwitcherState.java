package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviSwitcherState implements C004I {
    public boolean hasListBeenUpdated;
    public boolean hasMore;
    public boolean hasNaviChanged;
    public List<ProfileNaviDataModel> naviList;
    public boolean shouldCreateNewNavi;

    public ProfileNaviSwitcherState() {
        this(null, true, false, false, false);
    }

    public final ProfileNaviSwitcherState copy(List<ProfileNaviDataModel> list, boolean z, boolean z2, boolean z3, boolean z4) {
        return new ProfileNaviSwitcherState(list, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviSwitcherState)) {
            return false;
        }
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) obj;
        return Intrinsics.LJFF(this.naviList, profileNaviSwitcherState.naviList) && this.hasMore == profileNaviSwitcherState.hasMore && this.hasListBeenUpdated == profileNaviSwitcherState.hasListBeenUpdated && this.hasNaviChanged == profileNaviSwitcherState.hasNaviChanged && this.shouldCreateNewNavi == profileNaviSwitcherState.shouldCreateNewNavi;
    }

    public int hashCode() {
        List<ProfileNaviDataModel> list = this.naviList;
        return ((((((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + C786410Ut5.Z2(this.hasListBeenUpdated)) * 31) + C786410Ut5.Z2(this.hasNaviChanged)) * 31) + C786410Ut5.Z2(this.shouldCreateNewNavi);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileNaviSwitcherState(naviList=");
        sbLIZ.append(this.naviList);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", hasListBeenUpdated=");
        sbLIZ.append(this.hasListBeenUpdated);
        sbLIZ.append(", hasNaviChanged=");
        sbLIZ.append(this.hasNaviChanged);
        sbLIZ.append(", shouldCreateNewNavi=");
        sbLIZ.append(this.shouldCreateNewNavi);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasListBeenUpdated() {
        return this.hasListBeenUpdated;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getHasNaviChanged() {
        return this.hasNaviChanged;
    }

    public final List<ProfileNaviDataModel> getNaviList() {
        return this.naviList;
    }

    public final boolean getShouldCreateNewNavi() {
        return this.shouldCreateNewNavi;
    }

    public final void setHasListBeenUpdated(boolean z) {
        this.hasListBeenUpdated = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setHasNaviChanged(boolean z) {
        this.hasNaviChanged = z;
    }

    public final void setNaviList(List<ProfileNaviDataModel> list) {
        this.naviList = list;
    }

    public final void setShouldCreateNewNavi(boolean z) {
        this.shouldCreateNewNavi = z;
    }

    public ProfileNaviSwitcherState(List<ProfileNaviDataModel> list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.naviList = list;
        this.hasMore = z;
        this.hasListBeenUpdated = z2;
        this.hasNaviChanged = z3;
        this.shouldCreateNewNavi = z4;
    }
}
