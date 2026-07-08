package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC706902pP;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PageSkuCommonConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PageSkuCommonConfig implements InterfaceC706902pP, Parcelable {

    @C09CT("default_unselected_quantity")
    public final Integer defaultUnselectedQuantity;
    public static final Parcelable.Creator<PageSkuCommonConfig> CREATOR = new Parcelable.Creator<PageSkuCommonConfig>() { // from class: X.02rG
        @Override // android.os.Parcelable.Creator
        public final PageSkuCommonConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PageSkuCommonConfig(numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PageSkuCommonConfig[] newArray(int i) {
            return new PageSkuCommonConfig[i];
        }
    };
    public static final int $stable = 8;

    public PageSkuCommonConfig() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageSkuCommonConfig) && Intrinsics.LJFF(this.defaultUnselectedQuantity, ((PageSkuCommonConfig) obj).defaultUnselectedQuantity);
    }

    public final int hashCode() {
        Integer num = this.defaultUnselectedQuantity;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageSkuCommonConfig(defaultUnselectedQuantity=");
        sbLIZ.append(this.defaultUnselectedQuantity);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.defaultUnselectedQuantity;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    @Override // X.InterfaceC706902pP
    public final Integer LIZ() {
        return this.defaultUnselectedQuantity;
    }

    public PageSkuCommonConfig(Integer num) {
        this.defaultUnselectedQuantity = num;
    }
}
