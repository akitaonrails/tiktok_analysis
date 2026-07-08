package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PopUp implements Parcelable {

    @C09CT("fc_second")
    public final Long fcSecond;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<PopUp> CREATOR = new Parcelable.Creator<PopUp>() { // from class: X.03yy
        @Override // android.os.Parcelable.Creator
        public final PopUp createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new PopUp(string, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PopUp[] newArray(int i) {
            return new PopUp[i];
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
        if (!(obj instanceof PopUp)) {
            return false;
        }
        PopUp popUp = (PopUp) obj;
        return Intrinsics.LJFF(this.schema, popUp.schema) && Intrinsics.LJFF(this.fcSecond, popUp.fcSecond);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.fcSecond;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopUp(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", fcSecond=");
        sbLIZ.append(this.fcSecond);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        Long l = this.fcSecond;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public PopUp(String str, Long l) {
        this.schema = str;
        this.fcSecond = l;
    }
}
