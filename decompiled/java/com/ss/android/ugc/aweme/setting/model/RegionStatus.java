package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RegionStatus extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("is_change_region_enabled")
    public final Boolean enable;

    @C09CT("localized_country")
    public final String localizedCountry;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("status_event")
    public final String statusEvent;

    public final RegionStatus copy(String str, Boolean bool, String str2, String str3) {
        return new RegionStatus(str, bool, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionStatus)) {
            return false;
        }
        RegionStatus regionStatus = (RegionStatus) obj;
        return Intrinsics.LJFF(this.localizedCountry, regionStatus.localizedCountry) && Intrinsics.LJFF(this.enable, regionStatus.enable) && Intrinsics.LJFF(this.statusEvent, regionStatus.statusEvent) && Intrinsics.LJFF(this.redirectUrl, regionStatus.redirectUrl);
    }

    public int hashCode() {
        String str = this.localizedCountry;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enable;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.statusEvent;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.redirectUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegionStatus(localizedCountry=");
        sbLIZ.append(this.localizedCountry);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", statusEvent=");
        sbLIZ.append(this.statusEvent);
        sbLIZ.append(", redirectUrl=");
        sbLIZ.append(this.redirectUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RegionStatus() {
        this("", Boolean.FALSE, "", "");
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final String getLocalizedCountry() {
        return this.localizedCountry;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getStatusEvent() {
        return this.statusEvent;
    }

    public RegionStatus(String str, Boolean bool, String str2, String str3) {
        this.localizedCountry = str;
        this.enable = bool;
        this.statusEvent = str2;
        this.redirectUrl = str3;
    }
}
