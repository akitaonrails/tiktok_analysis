package com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.PlatformLinkInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformLinkInfo implements Parcelable {

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("is_platform_product")
    public final boolean isPlatformProduct;
    public static final Parcelable.Creator<PlatformLinkInfo> CREATOR = new Parcelable.Creator<PlatformLinkInfo>() { // from class: X.04IQ
        @Override // android.os.Parcelable.Creator
        public final PlatformLinkInfo createFromParcel(Parcel parcel) {
            boolean z;
            Integer numValueOf;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PlatformLinkInfo(z, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PlatformLinkInfo[] newArray(int i) {
            return new PlatformLinkInfo[i];
        }
    };
    public static final int $stable = 8;

    public PlatformLinkInfo() {
        this(false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformLinkInfo)) {
            return false;
        }
        PlatformLinkInfo platformLinkInfo = (PlatformLinkInfo) obj;
        return this.isPlatformProduct == platformLinkInfo.isPlatformProduct && Intrinsics.LJFF(this.bizType, platformLinkInfo.bizType);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isPlatformProduct) * 31;
        Integer num = this.bizType;
        return iZ2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlatformLinkInfo(isPlatformProduct=");
        sbLIZ.append(this.isPlatformProduct);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.bizType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeInt(this.isPlatformProduct ? 1 : 0);
        Integer num = this.bizType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public PlatformLinkInfo(boolean z, Integer num) {
        this.isPlatformProduct = z;
        this.bizType = num;
    }
}
