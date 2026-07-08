package com.ss.android.ugc.aweme.profilebanner.data;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileBannerMetaModel {
    public String LIZ;

    @C09CT("over_write")
    public final boolean canBeOverwritten;

    @C09CT("hot_update")
    public final boolean hotUpdate;

    @C09CT("is_existing")
    public final boolean isExisting;

    @C09CT("is_persist")
    public final boolean isPersistent;

    @C09CT("timing_list")
    public final List<String> timingList;

    public ProfileBannerMetaModel() {
        this(false, false, false, false, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBannerMetaModel)) {
            return false;
        }
        ProfileBannerMetaModel profileBannerMetaModel = (ProfileBannerMetaModel) obj;
        return this.hotUpdate == profileBannerMetaModel.hotUpdate && this.canBeOverwritten == profileBannerMetaModel.canBeOverwritten && this.isExisting == profileBannerMetaModel.isExisting && this.isPersistent == profileBannerMetaModel.isPersistent && Intrinsics.LJFF(this.timingList, profileBannerMetaModel.timingList);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.hotUpdate) * 31) + C786410Ut5.Z2(this.canBeOverwritten)) * 31) + C786410Ut5.Z2(this.isExisting)) * 31) + C786410Ut5.Z2(this.isPersistent)) * 31) + this.timingList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileBannerMetaModel(hotUpdate=");
        sbLIZ.append(this.hotUpdate);
        sbLIZ.append(", canBeOverwritten=");
        sbLIZ.append(this.canBeOverwritten);
        sbLIZ.append(", isExisting=");
        sbLIZ.append(this.isExisting);
        sbLIZ.append(", isPersistent=");
        sbLIZ.append(this.isPersistent);
        sbLIZ.append(", timingList=");
        sbLIZ.append(this.timingList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileBannerMetaModel(boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.hotUpdate = z;
        this.canBeOverwritten = z2;
        this.isExisting = z3;
        this.isPersistent = z4;
        this.timingList = list;
    }

    public ProfileBannerMetaModel(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
