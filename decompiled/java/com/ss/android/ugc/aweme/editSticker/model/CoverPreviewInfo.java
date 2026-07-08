package com.ss.android.ugc.aweme.editSticker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CoverPreviewInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CoverPreviewInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverPreviewInfo> CREATOR = new Parcelable.Creator<CoverPreviewInfo>() { // from class: X.0nNk
        @Override // android.os.Parcelable.Creator
        public final CoverPreviewInfo createFromParcel(Parcel parcel) {
            return new CoverPreviewInfo(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CoverPreviewInfo[] newArray(int i) {
            return new CoverPreviewInfo[i];
        }
    };

    @C09CT("actual_height")
    public float actualVideoPreviewHeight;

    @C09CT("actual_width")
    public float actualVideoPreviewWidth;

    @C09CT("init_height")
    public int initHeight;

    @C09CT("init_width")
    public int initWidth;

    @C09CT("left_offset")
    public float leftOffset;

    @C09CT("scale")
    public float scale;

    @C09CT("final_preview_height")
    public float showPreviewHeight;

    @C09CT("final_preview_width")
    public float showPreviewWidth;

    @C09CT("top_offset")
    public float topOffset;

    public CoverPreviewInfo() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0, 0);
    }

    public final CoverPreviewInfo copy(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        return new CoverPreviewInfo(f, f2, f3, f4, f5, f6, f7, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverPreviewInfo)) {
            return false;
        }
        CoverPreviewInfo coverPreviewInfo = (CoverPreviewInfo) obj;
        return Float.compare(this.leftOffset, coverPreviewInfo.leftOffset) == 0 && Float.compare(this.topOffset, coverPreviewInfo.topOffset) == 0 && Float.compare(this.showPreviewWidth, coverPreviewInfo.showPreviewWidth) == 0 && Float.compare(this.showPreviewHeight, coverPreviewInfo.showPreviewHeight) == 0 && Float.compare(this.actualVideoPreviewWidth, coverPreviewInfo.actualVideoPreviewWidth) == 0 && Float.compare(this.actualVideoPreviewHeight, coverPreviewInfo.actualVideoPreviewHeight) == 0 && Float.compare(this.scale, coverPreviewInfo.scale) == 0 && this.initWidth == coverPreviewInfo.initWidth && this.initHeight == coverPreviewInfo.initHeight;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverPreviewInfo(leftOffset=");
        sbLIZ.append(this.leftOffset);
        sbLIZ.append(", topOffset=");
        sbLIZ.append(this.topOffset);
        sbLIZ.append(", showPreviewWidth=");
        sbLIZ.append(this.showPreviewWidth);
        sbLIZ.append(", showPreviewHeight=");
        sbLIZ.append(this.showPreviewHeight);
        sbLIZ.append(", actualVideoPreviewWidth=");
        sbLIZ.append(this.actualVideoPreviewWidth);
        sbLIZ.append(", actualVideoPreviewHeight=");
        sbLIZ.append(this.actualVideoPreviewHeight);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.scale);
        sbLIZ.append(", initWidth=");
        sbLIZ.append(this.initWidth);
        sbLIZ.append(", initHeight=");
        sbLIZ.append(this.initHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.leftOffset);
        parcel.writeFloat(this.topOffset);
        parcel.writeFloat(this.showPreviewWidth);
        parcel.writeFloat(this.showPreviewHeight);
        parcel.writeFloat(this.actualVideoPreviewWidth);
        parcel.writeFloat(this.actualVideoPreviewHeight);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.initWidth);
        parcel.writeInt(this.initHeight);
    }

    public int hashCode() {
        return (((((((((((((((Float.floatToIntBits(this.leftOffset) * 31) + Float.floatToIntBits(this.topOffset)) * 31) + Float.floatToIntBits(this.showPreviewWidth)) * 31) + Float.floatToIntBits(this.showPreviewHeight)) * 31) + Float.floatToIntBits(this.actualVideoPreviewWidth)) * 31) + Float.floatToIntBits(this.actualVideoPreviewHeight)) * 31) + Float.floatToIntBits(this.scale)) * 31) + this.initWidth) * 31) + this.initHeight;
    }

    public final float getActualVideoPreviewHeight() {
        return this.actualVideoPreviewHeight;
    }

    public final float getActualVideoPreviewWidth() {
        return this.actualVideoPreviewWidth;
    }

    public final int getInitHeight() {
        return this.initHeight;
    }

    public final int getInitWidth() {
        return this.initWidth;
    }

    public final float getLeftOffset() {
        return this.leftOffset;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getShowPreviewHeight() {
        return this.showPreviewHeight;
    }

    public final float getShowPreviewWidth() {
        return this.showPreviewWidth;
    }

    public final float getTopOffset() {
        return this.topOffset;
    }

    public final void setActualVideoPreviewHeight(float f) {
        this.actualVideoPreviewHeight = f;
    }

    public final void setActualVideoPreviewWidth(float f) {
        this.actualVideoPreviewWidth = f;
    }

    public final void setInitHeight(int i) {
        this.initHeight = i;
    }

    public final void setInitWidth(int i) {
        this.initWidth = i;
    }

    public final void setLeftOffset(float f) {
        this.leftOffset = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setShowPreviewHeight(float f) {
        this.showPreviewHeight = f;
    }

    public final void setShowPreviewWidth(float f) {
        this.showPreviewWidth = f;
    }

    public final void setTopOffset(float f) {
        this.topOffset = f;
    }

    public CoverPreviewInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
        this.leftOffset = f;
        this.topOffset = f2;
        this.showPreviewWidth = f3;
        this.showPreviewHeight = f4;
        this.actualVideoPreviewWidth = f5;
        this.actualVideoPreviewHeight = f6;
        this.scale = f7;
        this.initWidth = i;
        this.initHeight = i2;
    }
}
