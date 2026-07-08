package com.ss.android.ugc.aweme.commercialize.profile.talent.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileTalentShareAdResult extends BaseResponse {

    @C09CT("ad_gap")
    public final int adGap;

    @C09CT("profile_ads")
    public final List<ProfileAdData> profileAds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileTalentShareAdResult)) {
            return false;
        }
        ProfileTalentShareAdResult profileTalentShareAdResult = (ProfileTalentShareAdResult) obj;
        return this.adGap == profileTalentShareAdResult.adGap && Intrinsics.LJFF(this.profileAds, profileTalentShareAdResult.profileAds);
    }

    public final int hashCode() {
        return (this.adGap * 31) + this.profileAds.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileTalentShareAdResult(adGap=");
        sbLIZ.append(this.adGap);
        sbLIZ.append(", profileAds=");
        sbLIZ.append(this.profileAds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileTalentShareAdResult(int i, List<ProfileAdData> list) {
        this.adGap = i;
        this.profileAds = list;
    }
}
