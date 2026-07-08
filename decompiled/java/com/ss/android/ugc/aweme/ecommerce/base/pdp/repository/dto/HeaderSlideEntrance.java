package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class HeaderSlideEntrance implements Parcelable {

    @C09CT("schema_link")
    public final String schemaLink;

    @C09CT("schema_text")
    public final String schemaText;

    @C09CT("schema_type")
    public final Integer schemaType;
    public static final Parcelable.Creator<HeaderSlideEntrance> CREATOR = new Parcelable.Creator<HeaderSlideEntrance>() { // from class: X.0w0A
        @Override // android.os.Parcelable.Creator
        public final HeaderSlideEntrance createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new HeaderSlideEntrance(numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderSlideEntrance[] newArray(int i) {
            return new HeaderSlideEntrance[i];
        }
    };
    public static final int $stable = 8;

    public HeaderSlideEntrance() {
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
        if (!(obj instanceof HeaderSlideEntrance)) {
            return false;
        }
        HeaderSlideEntrance headerSlideEntrance = (HeaderSlideEntrance) obj;
        return Intrinsics.LJFF(this.schemaType, headerSlideEntrance.schemaType) && Intrinsics.LJFF(this.schemaLink, headerSlideEntrance.schemaLink) && Intrinsics.LJFF(this.schemaText, headerSlideEntrance.schemaText);
    }

    public final int hashCode() {
        Integer num = this.schemaType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.schemaLink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schemaText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderSlideEntrance(schemaType=");
        sbLIZ.append(this.schemaType);
        sbLIZ.append(", schemaLink=");
        sbLIZ.append(this.schemaLink);
        sbLIZ.append(", schemaText=");
        sbLIZ.append(this.schemaText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.schemaType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.schemaLink);
        parcel.writeString(this.schemaText);
    }

    public HeaderSlideEntrance(Integer num, String str, String str2) {
        this.schemaType = num;
        this.schemaLink = str;
        this.schemaText = str2;
    }
}
