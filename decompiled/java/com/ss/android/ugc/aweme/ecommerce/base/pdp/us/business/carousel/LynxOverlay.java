package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.LynxOverlay;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxOverlay implements Parcelable {

    @C09CT("schema")
    public final String schema;
    public static final Parcelable.Creator<LynxOverlay> CREATOR = new Parcelable.Creator<LynxOverlay>() { // from class: X.0vxE
        @Override // android.os.Parcelable.Creator
        public final LynxOverlay createFromParcel(Parcel parcel) {
            return new LynxOverlay(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LynxOverlay[] newArray(int i) {
            return new LynxOverlay[i];
        }
    };
    public static final int $stable = 8;

    public LynxOverlay() {
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
        return (obj instanceof LynxOverlay) && Intrinsics.LJFF(this.schema, ((LynxOverlay) obj).schema);
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
        sbLIZ.append("LynxOverlay(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schema);
    }

    public LynxOverlay(String str) {
        this.schema = str;
    }
}
