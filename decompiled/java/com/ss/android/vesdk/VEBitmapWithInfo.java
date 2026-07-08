package com.ss.android.vesdk;

import X.C2500009qw;
import X.EnumC1990007qs;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class VEBitmapWithInfo implements Parcelable {
    public static final Parcelable.Creator<VEBitmapWithInfo> CREATOR = new C2500009qw(3);
    public Bitmap bitmap;
    public int colorPrimary;
    public int colorSpace;
    public int colorTransfer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEBitmapWithInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorPrimary = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public VEBitmapWithInfo(Bitmap bitmap) {
        this.bitmap = bitmap;
        EnumC1990007qs enumC1990007qs = EnumC1990007qs.UNKNOWN;
        this.colorSpace = enumC1990007qs.ordinal();
        this.colorPrimary = enumC1990007qs.ordinal();
        this.colorTransfer = enumC1990007qs.ordinal();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorPrimary);
        parcel.writeInt(this.colorTransfer);
        parcel.writeParcelable(this.bitmap, i);
    }

    public void setColorInfo(int i, int i2, int i3) {
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }

    public VEBitmapWithInfo(Bitmap bitmap, int i, int i2, int i3) {
        this.bitmap = bitmap;
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }
}
