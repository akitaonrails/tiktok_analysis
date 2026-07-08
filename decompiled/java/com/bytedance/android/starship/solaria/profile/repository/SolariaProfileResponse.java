package com.bytedance.android.starship.solaria.profile.repository;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SolariaProfileResponse extends BaseResponse implements Serializable {

    @C09CT("data")
    public final SolariaProfileModel data;

    @C09CT("sword")
    public final String sword;

    public final SolariaProfileResponse copy(SolariaProfileModel solariaProfileModel, String str) {
        return new SolariaProfileResponse(solariaProfileModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolariaProfileResponse)) {
            return false;
        }
        SolariaProfileResponse solariaProfileResponse = (SolariaProfileResponse) obj;
        return Intrinsics.LJFF(this.data, solariaProfileResponse.data) && Intrinsics.LJFF(this.sword, solariaProfileResponse.sword);
    }

    public int hashCode() {
        SolariaProfileModel solariaProfileModel = this.data;
        int iHashCode = (solariaProfileModel == null ? 0 : solariaProfileModel.hashCode()) * 31;
        String str = this.sword;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SolariaProfileResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", sword=");
        sbLIZ.append(this.sword);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SolariaProfileModel getData() {
        return this.data;
    }

    public final String getSword() {
        return this.sword;
    }

    public SolariaProfileResponse(SolariaProfileModel solariaProfileModel, String str) {
        this.data = solariaProfileModel;
        this.sword = str;
    }
}
