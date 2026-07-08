package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Container;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Container implements Parcelable {

    @C09CT("data")
    public final String data;

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<Container> CREATOR = new Parcelable.Creator<Container>() { // from class: X.042m
        @Override // android.os.Parcelable.Creator
        public final Container createFromParcel(Parcel parcel) {
            return new Container(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Container[] newArray(int i) {
            return new Container[i];
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
        if (!(obj instanceof Container)) {
            return false;
        }
        Container container = (Container) obj;
        return Intrinsics.LJFF(this.schema, container.schema) && Intrinsics.LJFF(this.data, container.data);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.data;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Container(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
        parcel.writeString(this.data);
    }

    public Container(String str, String str2) {
        this.schema = str;
        this.data = str2;
    }
}
