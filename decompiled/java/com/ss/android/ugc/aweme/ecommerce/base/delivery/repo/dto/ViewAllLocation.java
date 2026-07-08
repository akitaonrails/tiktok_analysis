package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ViewAllLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAllLocation implements Parcelable {

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<ViewAllLocation> CREATOR = new Parcelable.Creator<ViewAllLocation>() { // from class: X.02hX
        @Override // android.os.Parcelable.Creator
        public final ViewAllLocation createFromParcel(Parcel parcel) {
            return new ViewAllLocation(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ViewAllLocation[] newArray(int i) {
            return new ViewAllLocation[i];
        }
    };
    public static final int $stable = 8;

    public ViewAllLocation() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewAllLocation)) {
            return false;
        }
        ViewAllLocation viewAllLocation = (ViewAllLocation) obj;
        return Intrinsics.LJFF(this.title, viewAllLocation.title) && Intrinsics.LJFF(this.schema, viewAllLocation.schema);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewAllLocation(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.schema);
    }

    public ViewAllLocation(String str, String str2) {
        this.title = str;
        this.schema = str2;
    }
}
