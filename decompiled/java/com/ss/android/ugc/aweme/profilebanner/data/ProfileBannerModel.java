package com.ss.android.ugc.aweme.profilebanner.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ProfileBannerModel {

    @C09CT("dynamic_profile_banner_info")
    public final ProfileBannerInfoModel infoModel;

    @C09CT("dynamic_profile_banner_meta")
    public final ProfileBannerMetaModel metaModel;

    public ProfileBannerModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileBannerModel)) {
            return false;
        }
        ProfileBannerModel profileBannerModel = (ProfileBannerModel) obj;
        return Intrinsics.LJFF(this.metaModel, profileBannerModel.metaModel) && Intrinsics.LJFF(this.infoModel, profileBannerModel.infoModel);
    }

    public final int hashCode() {
        ProfileBannerMetaModel profileBannerMetaModel = this.metaModel;
        int iHashCode = (profileBannerMetaModel == null ? 0 : profileBannerMetaModel.hashCode()) * 31;
        ProfileBannerInfoModel profileBannerInfoModel = this.infoModel;
        return iHashCode + (profileBannerInfoModel != null ? profileBannerInfoModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileBannerModel(metaModel=");
        sbLIZ.append(this.metaModel);
        sbLIZ.append(", infoModel=");
        sbLIZ.append(this.infoModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileBannerModel(ProfileBannerMetaModel profileBannerMetaModel, ProfileBannerInfoModel profileBannerInfoModel) {
        this.metaModel = profileBannerMetaModel;
        this.infoModel = profileBannerInfoModel;
    }
}
