package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSProtectionApiResponse extends BaseResponse {

    @C09CT("dw")
    public final PNSDigitalWellbeingBean digitalWellbeingBean;

    @C09CT("fp")
    public final PNSFamilyPairingBean familyPairingBean;

    @C09CT("user_details")
    public final PNSUserDetailsInfoBean userDetailsInfoBean;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSProtectionApiResponse)) {
            return false;
        }
        PNSProtectionApiResponse pNSProtectionApiResponse = (PNSProtectionApiResponse) obj;
        return Intrinsics.LJFF(this.familyPairingBean, pNSProtectionApiResponse.familyPairingBean) && Intrinsics.LJFF(this.digitalWellbeingBean, pNSProtectionApiResponse.digitalWellbeingBean) && Intrinsics.LJFF(this.userDetailsInfoBean, pNSProtectionApiResponse.userDetailsInfoBean);
    }

    public final int hashCode() {
        PNSFamilyPairingBean pNSFamilyPairingBean = this.familyPairingBean;
        int iHashCode = (pNSFamilyPairingBean == null ? 0 : pNSFamilyPairingBean.hashCode()) * 31;
        PNSDigitalWellbeingBean pNSDigitalWellbeingBean = this.digitalWellbeingBean;
        return ((iHashCode + (pNSDigitalWellbeingBean != null ? pNSDigitalWellbeingBean.hashCode() : 0)) * 31) + this.userDetailsInfoBean.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSProtectionApiResponse(familyPairingBean=");
        sbLIZ.append(this.familyPairingBean);
        sbLIZ.append(", digitalWellbeingBean=");
        sbLIZ.append(this.digitalWellbeingBean);
        sbLIZ.append(", userDetailsInfoBean=");
        sbLIZ.append(this.userDetailsInfoBean);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSProtectionApiResponse() {
        this(new PNSFamilyPairingBean(1, new PNSGuardianRestrictionBean(0, 0, 0, new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new PNSScheduleBreakSettings(false, 0, 0, new ArrayList(), 0), null, 0), 0, 0, 0L), new PNSDigitalWellbeingBean(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, null, new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, new ArrayList(), new PNSSleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new PNSDigitalWellbeingMissionStatus(new PNSSleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE)), new PNSUserDetailsInfoBean(Boolean.FALSE, 0));
    }

    public PNSProtectionApiResponse(PNSFamilyPairingBean pNSFamilyPairingBean, PNSDigitalWellbeingBean pNSDigitalWellbeingBean, PNSUserDetailsInfoBean pNSUserDetailsInfoBean) {
        this.familyPairingBean = pNSFamilyPairingBean;
        this.digitalWellbeingBean = pNSDigitalWellbeingBean;
        this.userDetailsInfoBean = pNSUserDetailsInfoBean;
    }
}
