package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PdpBannerInfo implements Parcelable {

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("description")
    public final ECRichText description;

    @C09CT("display_duration_sec")
    public final Integer durationSec;

    @C09CT("icon")
    public final Icon icon;
    public static final Parcelable.Creator<PdpBannerInfo> CREATOR = new Parcelable.Creator<PdpBannerInfo>() { // from class: X.0mgd
        @Override // android.os.Parcelable.Creator
        public final PdpBannerInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Icon icon = (Icon) parcel.readParcelable(PdpBannerInfo.class.getClassLoader());
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PdpBannerInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PdpBannerInfo(icon, eCRichText, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpBannerInfo[] newArray(int i) {
            return new PdpBannerInfo[i];
        }
    };
    public static final int $stable = 8;

    public PdpBannerInfo() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpBannerInfo)) {
            return false;
        }
        PdpBannerInfo pdpBannerInfo = (PdpBannerInfo) obj;
        return Intrinsics.LJFF(this.icon, pdpBannerInfo.icon) && Intrinsics.LJFF(this.description, pdpBannerInfo.description) && Intrinsics.LJFF(this.durationSec, pdpBannerInfo.durationSec) && Intrinsics.LJFF(this.buttonText, pdpBannerInfo.buttonText) && Intrinsics.LJFF(this.daInfo, pdpBannerInfo.daInfo);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.description;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Integer num = this.durationSec;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.daInfo;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpBannerInfo(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", durationSec=");
        sbLIZ.append(this.durationSec);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.description, i);
        Integer num = this.durationSec;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.daInfo);
    }

    public PdpBannerInfo(Icon icon, ECRichText eCRichText, Integer num, String str, String str2) {
        this.icon = icon;
        this.description = eCRichText;
        this.durationSec = num;
        this.buttonText = str;
        this.daInfo = str2;
    }
}
