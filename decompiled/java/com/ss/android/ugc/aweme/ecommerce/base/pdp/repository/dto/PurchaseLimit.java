package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1023203zK;
import X.C123100dR;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseLimit implements Parcelable {

    @C09CT("default_show")
    public final Boolean defaultShow;

    @C09CT("limited_sku_ids")
    public final List<String> limitedSkuIds;

    @C09CT("text")
    public final String text;
    public static final C1023203zK Companion = new C1023203zK();
    public static final Parcelable.Creator<PurchaseLimit> CREATOR = new Parcelable.Creator<PurchaseLimit>() { // from class: X.03zJ
        @Override // android.os.Parcelable.Creator
        public final PurchaseLimit createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new PurchaseLimit(string, boolValueOf, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final PurchaseLimit[] newArray(int i) {
            return new PurchaseLimit[i];
        }
    };
    public static final int $stable = 8;

    public PurchaseLimit() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseLimit)) {
            return false;
        }
        PurchaseLimit purchaseLimit = (PurchaseLimit) obj;
        return Intrinsics.LJFF(this.text, purchaseLimit.text) && Intrinsics.LJFF(this.defaultShow, purchaseLimit.defaultShow) && Intrinsics.LJFF(this.limitedSkuIds, purchaseLimit.limitedSkuIds);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.defaultShow;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.limitedSkuIds;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseLimit(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", defaultShow=");
        sbLIZ.append(this.defaultShow);
        sbLIZ.append(", limitedSkuIds=");
        sbLIZ.append(this.limitedSkuIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.text);
        Boolean bool = this.defaultShow;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeStringList(this.limitedSkuIds);
    }

    public final String LIZ(String str) {
        if (C123100dR.LIZ(str)) {
            List<String> list = this.limitedSkuIds;
            if (list == null || !list.contains(str)) {
                return null;
            }
            return this.text;
        }
        if (!Intrinsics.LJFF(this.defaultShow, Boolean.TRUE)) {
            return null;
        }
        return this.text;
    }

    public PurchaseLimit(String str, Boolean bool, List<String> list) {
        this.text = str;
        this.defaultShow = bool;
        this.limitedSkuIds = list;
    }
}
