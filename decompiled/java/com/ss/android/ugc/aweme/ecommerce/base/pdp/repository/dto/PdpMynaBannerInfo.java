package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpMynaBannerInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PdpMynaBannerInfo implements Parcelable {

    @C09CT("pdp_banner_info")
    public final PdpBannerInfo bannerData;

    @C09CT("page_schema")
    public final String schema;
    public static final Parcelable.Creator<PdpMynaBannerInfo> CREATOR = new Parcelable.Creator<PdpMynaBannerInfo>() { // from class: X.0mge
        @Override // android.os.Parcelable.Creator
        public final PdpMynaBannerInfo createFromParcel(Parcel parcel) {
            PdpBannerInfo pdpBannerInfoCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                pdpBannerInfoCreateFromParcel = null;
            } else {
                pdpBannerInfoCreateFromParcel = PdpBannerInfo.CREATOR.createFromParcel(parcel);
            }
            return new PdpMynaBannerInfo(string, pdpBannerInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpMynaBannerInfo[] newArray(int i) {
            return new PdpMynaBannerInfo[i];
        }
    };
    public static final int $stable = 8;

    public PdpMynaBannerInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpMynaBannerInfo)) {
            return false;
        }
        PdpMynaBannerInfo pdpMynaBannerInfo = (PdpMynaBannerInfo) obj;
        return Intrinsics.LJFF(this.schema, pdpMynaBannerInfo.schema) && Intrinsics.LJFF(this.bannerData, pdpMynaBannerInfo.bannerData);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PdpBannerInfo pdpBannerInfo = this.bannerData;
        return iHashCode + (pdpBannerInfo != null ? pdpBannerInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpMynaBannerInfo(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", bannerData=");
        sbLIZ.append(this.bannerData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        PdpBannerInfo pdpBannerInfo = this.bannerData;
        if (pdpBannerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pdpBannerInfo.writeToParcel(parcel, i);
        }
    }

    public PdpMynaBannerInfo(String str, PdpBannerInfo pdpBannerInfo) {
        this.schema = str;
        this.bannerData = pdpBannerInfo;
    }
}
