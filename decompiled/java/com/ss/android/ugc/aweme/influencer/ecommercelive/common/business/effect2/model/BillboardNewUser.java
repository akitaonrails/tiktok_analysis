package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardNewUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardNewUser implements Parcelable {

    @C09CT("is_new_user")
    public final Boolean isNewUser;
    public static final Parcelable.Creator<BillboardNewUser> CREATOR = new Parcelable.Creator<BillboardNewUser>() { // from class: X.0v5v
        @Override // android.os.Parcelable.Creator
        public final BillboardNewUser createFromParcel(Parcel parcel) {
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
            return new BillboardNewUser(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BillboardNewUser[] newArray(int i) {
            return new BillboardNewUser[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillboardNewUser) && Intrinsics.LJFF(this.isNewUser, ((BillboardNewUser) obj).isNewUser);
    }

    public final int hashCode() {
        Boolean bool = this.isNewUser;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BillboardNewUser(isNewUser=");
        sbLIZ.append(this.isNewUser);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.isNewUser;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public BillboardNewUser(Boolean bool) {
        this.isNewUser = bool;
    }
}
