package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.PostButtonAppearance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class PostButtonAppearance implements Parcelable {
    public static final Parcelable.Creator<PostButtonAppearance> CREATOR = new Parcelable.Creator<PostButtonAppearance>() { // from class: X.18Wn
        @Override // android.os.Parcelable.Creator
        public final PostButtonAppearance createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new PostButtonAppearance(numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final PostButtonAppearance[] newArray(int i) {
            return new PostButtonAppearance[i];
        }
    };
    public final Integer icon;
    public final Integer text;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostButtonAppearance)) {
            return false;
        }
        PostButtonAppearance postButtonAppearance = (PostButtonAppearance) obj;
        return Intrinsics.LJFF(this.text, postButtonAppearance.text) && Intrinsics.LJFF(this.icon, postButtonAppearance.icon);
    }

    public final int hashCode() {
        Integer num = this.text;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.icon;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostButtonAppearance(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.text;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.icon;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public PostButtonAppearance(Integer num, Integer num2) {
        this.text = num;
        this.icon = num2;
    }
}
