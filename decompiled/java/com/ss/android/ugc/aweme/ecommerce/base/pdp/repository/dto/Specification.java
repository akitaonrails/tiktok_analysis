package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SpecificationLink;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Specification implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("name")
    public String name;

    @C09CT("specification_link")
    public SpecificationLink specificationLink;

    @C09CT("value")
    public String value;
    public static final Parcelable.Creator<Specification> CREATOR = new Parcelable.Creator<Specification>() { // from class: X.02kx
        @Override // android.os.Parcelable.Creator
        public final Specification createFromParcel(Parcel parcel) {
            SpecificationLink specificationLinkCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                specificationLinkCreateFromParcel = null;
            } else {
                specificationLinkCreateFromParcel = SpecificationLink.CREATOR.createFromParcel(parcel);
            }
            return new Specification(string, string2, specificationLinkCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Specification[] newArray(int i) {
            return new Specification[i];
        }
    };
    public static final int $stable = 8;

    public Specification() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Specification)) {
            return false;
        }
        Specification specification = (Specification) obj;
        return Intrinsics.LJFF(this.name, specification.name) && Intrinsics.LJFF(this.value, specification.value) && Intrinsics.LJFF(this.specificationLink, specification.specificationLink) && Intrinsics.LJFF(this.daInfo, specification.daInfo);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SpecificationLink specificationLink = this.specificationLink;
        int iHashCode3 = (iHashCode2 + (specificationLink == null ? 0 : specificationLink.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Specification(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", specificationLink=");
        sbLIZ.append(this.specificationLink);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        SpecificationLink specificationLink = this.specificationLink;
        if (specificationLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specificationLink.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public Specification(String str, String str2, SpecificationLink specificationLink, String str3) {
        this.name = str;
        this.value = str2;
        this.specificationLink = specificationLink;
        this.daInfo = str3;
    }
}
