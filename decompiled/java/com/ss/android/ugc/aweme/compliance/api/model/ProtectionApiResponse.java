package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ProtectionApiResponse extends BaseResponse {

    @C09CT("dw")
    public final DigitalWellbeingBean digitalWellbeingBean;

    @C09CT("fp")
    public final FamilyPairingBean familyPairingBean;

    @C09CT("user_details")
    public final UserDetailsInfoBean userDetailsInfoBean;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtectionApiResponse)) {
            return false;
        }
        ProtectionApiResponse protectionApiResponse = (ProtectionApiResponse) obj;
        return Intrinsics.LJFF(this.familyPairingBean, protectionApiResponse.familyPairingBean) && Intrinsics.LJFF(this.digitalWellbeingBean, protectionApiResponse.digitalWellbeingBean) && Intrinsics.LJFF(this.userDetailsInfoBean, protectionApiResponse.userDetailsInfoBean);
    }

    public final int hashCode() {
        FamilyPairingBean familyPairingBean = this.familyPairingBean;
        int iHashCode = (familyPairingBean == null ? 0 : familyPairingBean.hashCode()) * 31;
        DigitalWellbeingBean digitalWellbeingBean = this.digitalWellbeingBean;
        return ((iHashCode + (digitalWellbeingBean != null ? digitalWellbeingBean.hashCode() : 0)) * 31) + this.userDetailsInfoBean.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProtectionApiResponse(familyPairingBean=");
        sbLIZ.append(this.familyPairingBean);
        sbLIZ.append(", digitalWellbeingBean=");
        sbLIZ.append(this.digitalWellbeingBean);
        sbLIZ.append(", userDetailsInfoBean=");
        sbLIZ.append(this.userDetailsInfoBean);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProtectionApiResponse() {
        this(new FamilyPairingBean(1, new GuardianRestrictionBean(0, 0, 0, new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new ScheduleBreakSettings(false, 0, 0, new ArrayList(), 0), null, 0), 0, 0, 0L), new DigitalWellbeingBean(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, null, new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), new DoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, new ArrayList(), new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE)), new UserDetailsInfoBean(Boolean.FALSE, 0));
    }

    public ProtectionApiResponse(FamilyPairingBean familyPairingBean, DigitalWellbeingBean digitalWellbeingBean, UserDetailsInfoBean userDetailsInfoBean) {
        this.familyPairingBean = familyPairingBean;
        this.digitalWellbeingBean = digitalWellbeingBean;
        this.userDetailsInfoBean = userDetailsInfoBean;
    }
}
