package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRsp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ReminderRsp implements Parcelable {

    @C09CT("pdp_h5_schema")
    public final String pdpH5Schema;
    public static final Parcelable.Creator<ReminderRsp> CREATOR = new Parcelable.Creator<ReminderRsp>() { // from class: X.0NNT
        @Override // android.os.Parcelable.Creator
        public final ReminderRsp createFromParcel(Parcel parcel) {
            return new ReminderRsp(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReminderRsp[] newArray(int i) {
            return new ReminderRsp[i];
        }
    };
    public static final int $stable = 8;

    public ReminderRsp() {
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
        return (obj instanceof ReminderRsp) && Intrinsics.LJFF(this.pdpH5Schema, ((ReminderRsp) obj).pdpH5Schema);
    }

    public final int hashCode() {
        String str = this.pdpH5Schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReminderRsp(pdpH5Schema=");
        sbLIZ.append(this.pdpH5Schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pdpH5Schema);
    }

    public ReminderRsp(String str) {
        this.pdpH5Schema = str;
    }
}
