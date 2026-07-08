package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DigitalWellbeingResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("amber_alert")
    public final AmberAlert amberAlert;

    @C09CT("screen_time_setting")
    public final ScreenTimeSetting screenTimeSetting;

    public DigitalWellbeingResponse() {
        this(new ScreenTimeSetting(0), null);
    }

    public final DigitalWellbeingResponse copy(ScreenTimeSetting screenTimeSetting, AmberAlert amberAlert) {
        return new DigitalWellbeingResponse(screenTimeSetting, amberAlert);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DigitalWellbeingResponse)) {
            return false;
        }
        DigitalWellbeingResponse digitalWellbeingResponse = (DigitalWellbeingResponse) obj;
        return Intrinsics.LJFF(this.screenTimeSetting, digitalWellbeingResponse.screenTimeSetting) && Intrinsics.LJFF(this.amberAlert, digitalWellbeingResponse.amberAlert);
    }

    public int hashCode() {
        ScreenTimeSetting screenTimeSetting = this.screenTimeSetting;
        int iHashCode = (screenTimeSetting == null ? 0 : screenTimeSetting.hashCode()) * 31;
        AmberAlert amberAlert = this.amberAlert;
        return iHashCode + (amberAlert != null ? amberAlert.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DigitalWellbeingResponse(screenTimeSetting=");
        sbLIZ.append(this.screenTimeSetting);
        sbLIZ.append(", amberAlert=");
        sbLIZ.append(this.amberAlert);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AmberAlert getAmberAlert() {
        return this.amberAlert;
    }

    public final ScreenTimeSetting getScreenTimeSetting() {
        return this.screenTimeSetting;
    }

    public DigitalWellbeingResponse(ScreenTimeSetting screenTimeSetting, AmberAlert amberAlert) {
        this.screenTimeSetting = screenTimeSetting;
        this.amberAlert = amberAlert;
    }
}
