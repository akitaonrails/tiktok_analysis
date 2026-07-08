package com.ss.android.ugc.aweme.creative.model.photomode;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.photomode.GenItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class GenItem implements Parcelable {
    public static final Parcelable.Creator<GenItem> CREATOR = new Parcelable.Creator<GenItem>() { // from class: X.0mh8
        @Override // android.os.Parcelable.Creator
        public final GenItem createFromParcel(Parcel parcel) {
            return new GenItem(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GenItem[] newArray(int i) {
            return new GenItem[i];
        }
    };

    @C040H
    public final int position;

    @C040H
    public final String text;

    @C040H
    public final String tip;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenItem)) {
            return false;
        }
        GenItem genItem = (GenItem) obj;
        return Intrinsics.LJFF(this.text, genItem.text) && Intrinsics.LJFF(this.tip, genItem.tip) && this.position == genItem.position;
    }

    public final int hashCode() {
        return (((this.text.hashCode() * 31) + this.tip.hashCode()) * 31) + this.position;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenItem(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", tip=");
        sbLIZ.append(this.tip);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.tip);
        parcel.writeInt(this.position);
    }

    public GenItem(String str, String str2, int i) {
        this.text = str;
        this.tip = str2;
        this.position = i;
    }
}
