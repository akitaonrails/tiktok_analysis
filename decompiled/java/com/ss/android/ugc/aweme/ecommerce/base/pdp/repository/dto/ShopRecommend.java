package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommend;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopRecommend implements Parcelable {

    @C09CT("enter_name")
    public String enterName;

    @C09CT("enter_schema")
    public String enterSchema;

    @C09CT("is_recommend")
    public Boolean isRecommend;

    @C09CT("model_title")
    public String modelTitle;
    public static final Parcelable.Creator<ShopRecommend> CREATOR = new Parcelable.Creator<ShopRecommend>() { // from class: X.02ot
        @Override // android.os.Parcelable.Creator
        public final ShopRecommend createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
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
            return new ShopRecommend(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShopRecommend[] newArray(int i) {
            return new ShopRecommend[i];
        }
    };
    public static final int $stable = 8;

    public ShopRecommend() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRecommend)) {
            return false;
        }
        ShopRecommend shopRecommend = (ShopRecommend) obj;
        return Intrinsics.LJFF(this.isRecommend, shopRecommend.isRecommend) && Intrinsics.LJFF(this.modelTitle, shopRecommend.modelTitle) && Intrinsics.LJFF(this.enterName, shopRecommend.enterName) && Intrinsics.LJFF(this.enterSchema, shopRecommend.enterSchema);
    }

    public final int hashCode() {
        Boolean bool = this.isRecommend;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.modelTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterSchema;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopRecommend(isRecommend=");
        sbLIZ.append(this.isRecommend);
        sbLIZ.append(", modelTitle=");
        sbLIZ.append(this.modelTitle);
        sbLIZ.append(", enterName=");
        sbLIZ.append(this.enterName);
        sbLIZ.append(", enterSchema=");
        sbLIZ.append(this.enterSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.isRecommend;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.modelTitle);
        parcel.writeString(this.enterName);
        parcel.writeString(this.enterSchema);
    }

    public ShopRecommend(Boolean bool, String str, String str2, String str3) {
        this.isRecommend = bool;
        this.modelTitle = str;
        this.enterName = str2;
        this.enterSchema = str3;
    }
}
