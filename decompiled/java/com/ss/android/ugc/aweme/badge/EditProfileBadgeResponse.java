package com.ss.android.ugc.aweme.badge;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class EditProfileBadgeResponse extends BaseResponse {

    @C09CT("campaign_detail")
    public final EditProfileBadgeCampaignModel campaignDetail;

    @C09CT("profile_badges")
    public final List<EditProfileBadgeModel> profileBadges;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileBadgeResponse)) {
            return false;
        }
        EditProfileBadgeResponse editProfileBadgeResponse = (EditProfileBadgeResponse) obj;
        return Intrinsics.LJFF(this.campaignDetail, editProfileBadgeResponse.campaignDetail) && Intrinsics.LJFF(this.profileBadges, editProfileBadgeResponse.profileBadges);
    }

    public final int hashCode() {
        EditProfileBadgeCampaignModel editProfileBadgeCampaignModel = this.campaignDetail;
        int iHashCode = (editProfileBadgeCampaignModel == null ? 0 : editProfileBadgeCampaignModel.hashCode()) * 31;
        List<EditProfileBadgeModel> list = this.profileBadges;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileBadgeResponse(campaignDetail=");
        sbLIZ.append(this.campaignDetail);
        sbLIZ.append(", profileBadges=");
        sbLIZ.append(this.profileBadges);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EditProfileBadgeResponse(EditProfileBadgeCampaignModel editProfileBadgeCampaignModel, List<EditProfileBadgeModel> list) {
        this.campaignDetail = editProfileBadgeCampaignModel;
        this.profileBadges = list;
    }
}
