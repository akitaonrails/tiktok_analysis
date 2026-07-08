package com.ss.android.ugc.cut_ui;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.ItemCrop;

/* JADX INFO: loaded from: classes9.dex */
public final class ItemCrop implements Parcelable {
    public static final Parcelable.Creator<ItemCrop> CREATOR = new Parcelable.Creator<ItemCrop>() { // from class: X.0L87
        @Override // android.os.Parcelable.Creator
        public final ItemCrop createFromParcel(Parcel parcel) {
            return new ItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemCrop[] newArray(int i) {
            return new ItemCrop[i];
        }
    };
    public final float lowerRightX;
    public final float lowerRightY;
    public final float upperLeftX;
    public final float upperLeftY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemCrop)) {
            return false;
        }
        ItemCrop itemCrop = (ItemCrop) obj;
        return Float.compare(this.upperLeftX, itemCrop.upperLeftX) == 0 && Float.compare(this.upperLeftY, itemCrop.upperLeftY) == 0 && Float.compare(this.lowerRightX, itemCrop.lowerRightX) == 0 && Float.compare(this.lowerRightY, itemCrop.lowerRightY) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemCrop(upperLeftX=");
        sbLIZ.append(this.upperLeftX);
        sbLIZ.append(", upperLeftY=");
        sbLIZ.append(this.upperLeftY);
        sbLIZ.append(", lowerRightX=");
        sbLIZ.append(this.lowerRightX);
        sbLIZ.append(", lowerRightY=");
        sbLIZ.append(this.lowerRightY);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.upperLeftX);
        parcel.writeFloat(this.upperLeftY);
        parcel.writeFloat(this.lowerRightX);
        parcel.writeFloat(this.lowerRightY);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.upperLeftX) * 31) + Float.floatToIntBits(this.upperLeftY)) * 31) + Float.floatToIntBits(this.lowerRightX)) * 31) + Float.floatToIntBits(this.lowerRightY);
    }

    public ItemCrop(float f, float f2, float f3, float f4) {
        this.upperLeftX = f;
        this.upperLeftY = f2;
        this.lowerRightX = f3;
        this.lowerRightY = f4;
    }
}
