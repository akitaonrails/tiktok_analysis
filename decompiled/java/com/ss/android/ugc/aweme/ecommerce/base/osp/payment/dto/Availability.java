package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Availability implements Serializable {
    public static final int $stable = 8;

    @C09CT("is_available")
    public Boolean isAvailable;

    @C09CT("status_code")
    public String statusCode;

    @C09CT("unavailable_code")
    public String unavailableCode;

    @C09CT("unavailable_popup_title")
    public String unavailablePopupTitle;

    @C09CT("unavailable_reason")
    public String unavailableReason;

    public Availability() {
    }

    public final Availability copy(Boolean bool, String str, String str2, String str3, String str4) {
        return new Availability(bool, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Availability)) {
            return false;
        }
        Availability availability = (Availability) obj;
        return Intrinsics.LJFF(this.isAvailable, availability.isAvailable) && Intrinsics.LJFF(this.unavailableCode, availability.unavailableCode) && Intrinsics.LJFF(this.unavailableReason, availability.unavailableReason) && Intrinsics.LJFF(this.unavailablePopupTitle, availability.unavailablePopupTitle) && Intrinsics.LJFF(this.statusCode, availability.statusCode);
    }

    public int hashCode() {
        Boolean bool = this.isAvailable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.unavailableCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unavailableReason;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unavailablePopupTitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statusCode;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Availability(isAvailable=");
        sbLIZ.append(this.isAvailable);
        sbLIZ.append(", unavailableCode=");
        sbLIZ.append(this.unavailableCode);
        sbLIZ.append(", unavailableReason=");
        sbLIZ.append(this.unavailableReason);
        sbLIZ.append(", unavailablePopupTitle=");
        sbLIZ.append(this.unavailablePopupTitle);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public final void setAvailable(Boolean bool) {
        this.isAvailable = bool;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public Availability(Boolean bool, String str, String str2, String str3, String str4) {
        this.isAvailable = bool;
        this.unavailableCode = str;
        this.unavailableReason = str2;
        this.unavailablePopupTitle = str3;
        this.statusCode = str4;
    }
}
