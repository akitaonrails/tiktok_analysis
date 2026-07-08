package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ConvenientSubmitOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ConvenientSubmitOrder implements Parcelable {

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<ConvenientSubmitOrder> CREATOR = new Parcelable.Creator<ConvenientSubmitOrder>() { // from class: X.03uK
        @Override // android.os.Parcelable.Creator
        public final ConvenientSubmitOrder createFromParcel(Parcel parcel) {
            return new ConvenientSubmitOrder(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ConvenientSubmitOrder[] newArray(int i) {
            return new ConvenientSubmitOrder[i];
        }
    };
    public static final int $stable = 8;

    public ConvenientSubmitOrder() {
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
        return (obj instanceof ConvenientSubmitOrder) && Intrinsics.LJFF(this.schema, ((ConvenientSubmitOrder) obj).schema);
    }

    public final int hashCode() {
        String str = this.schema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvenientSubmitOrder(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
    }

    public ConvenientSubmitOrder(String str) {
        this.schema = str;
    }
}
