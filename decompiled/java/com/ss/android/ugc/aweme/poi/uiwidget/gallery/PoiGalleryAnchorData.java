package com.ss.android.ugc.aweme.poi.uiwidget.gallery;

import X.C1183010gtH;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGalleryAnchorData implements Parcelable {
    public static final C1183010gtH CREATOR = new Parcelable.Creator<PoiGalleryAnchorData>() { // from class: X.0gtH
        @Override // android.os.Parcelable.Creator
        public final PoiGalleryAnchorData createFromParcel(Parcel parcel) {
            return new PoiGalleryAnchorData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PoiGalleryAnchorData[] newArray(int i) {
            return new PoiGalleryAnchorData[i];
        }
    };
    public final int h;
    public final int visibleH;
    public final int visibleW;
    public final int visibleX;
    public final int visibleY;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Illegal instructions before constructor call */
    public PoiGalleryAnchorData() {
        int i = 0;
        this(i, i, i, i, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiGalleryAnchorData)) {
            return false;
        }
        PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) obj;
        return this.w == poiGalleryAnchorData.w && this.h == poiGalleryAnchorData.h && this.x == poiGalleryAnchorData.x && this.y == poiGalleryAnchorData.y && this.visibleX == poiGalleryAnchorData.visibleX && this.visibleY == poiGalleryAnchorData.visibleY && this.visibleW == poiGalleryAnchorData.visibleW && this.visibleH == poiGalleryAnchorData.visibleH;
    }

    public final int hashCode() {
        return (((((((((((((this.w * 31) + this.h) * 31) + this.x) * 31) + this.y) * 31) + this.visibleX) * 31) + this.visibleY) * 31) + this.visibleW) * 31) + this.visibleH;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiGalleryAnchorData(w=");
        sbLIZ.append(this.w);
        sbLIZ.append(", h=");
        sbLIZ.append(this.h);
        sbLIZ.append(", x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(", visibleX=");
        sbLIZ.append(this.visibleX);
        sbLIZ.append(", visibleY=");
        sbLIZ.append(this.visibleY);
        sbLIZ.append(", visibleW=");
        sbLIZ.append(this.visibleW);
        sbLIZ.append(", visibleH=");
        sbLIZ.append(this.visibleH);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.w);
        parcel.writeInt(this.h);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.visibleX);
        parcel.writeInt(this.visibleY);
        parcel.writeInt(this.visibleW);
        parcel.writeInt(this.visibleH);
    }

    public /* synthetic */ PoiGalleryAnchorData(int i, int i2, int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, 0, 0, 0, 0);
    }

    public PoiGalleryAnchorData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.w = i;
        this.h = i2;
        this.x = i3;
        this.y = i4;
        this.visibleX = i5;
        this.visibleY = i6;
        this.visibleW = i7;
        this.visibleH = i8;
    }
}
