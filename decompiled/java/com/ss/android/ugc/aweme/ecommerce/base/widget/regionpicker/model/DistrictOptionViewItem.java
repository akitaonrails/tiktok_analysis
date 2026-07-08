package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictOptionViewItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictOptionViewItem implements Parcelable {

    @C09CT("text")
    public final String text;
    public static final Parcelable.Creator<DistrictOptionViewItem> CREATOR = new Parcelable.Creator<DistrictOptionViewItem>() { // from class: X.0vV3
        @Override // android.os.Parcelable.Creator
        public final DistrictOptionViewItem createFromParcel(Parcel parcel) {
            return new DistrictOptionViewItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DistrictOptionViewItem[] newArray(int i) {
            return new DistrictOptionViewItem[i];
        }
    };
    public static final int $stable = 8;

    public DistrictOptionViewItem() {
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
        return (obj instanceof DistrictOptionViewItem) && Intrinsics.LJFF(this.text, ((DistrictOptionViewItem) obj).text);
    }

    public final int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistrictOptionViewItem(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public DistrictOptionViewItem(String str) {
        this.text = str;
    }
}
