package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectTextShadowConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextShadowConfig> CREATOR = new Parcelable.Creator<InnerEffectTextShadowConfig>() { // from class: X.12KK
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextShadowConfig createFromParcel(Parcel parcel) {
            return new InnerEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextShadowConfig[] newArray(int i) {
            return new InnerEffectTextShadowConfig[i];
        }
    };
    public final int color;
    public final float offsetX;
    public final float offsetY;
    public final float radius;

    public InnerEffectTextShadowConfig() {
        this(0.0f, 0.0f, 0.0f, -7829368);
    }

    public final InnerEffectTextShadowConfig copy(float f, float f2, float f3, int i) {
        return new InnerEffectTextShadowConfig(f, f2, f3, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextShadowConfig)) {
            return false;
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = (InnerEffectTextShadowConfig) obj;
        return Float.compare(this.radius, innerEffectTextShadowConfig.radius) == 0 && Float.compare(this.offsetX, innerEffectTextShadowConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextShadowConfig.offsetY) == 0 && this.color == innerEffectTextShadowConfig.color;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerEffectTextShadowConfig(radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", offsetX=");
        sbLIZ.append(this.offsetX);
        sbLIZ.append(", offsetY=");
        sbLIZ.append(this.offsetY);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.radius);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeInt(this.color);
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.radius) * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + this.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final InnerEffectTextShadowConfig genInstance(float f) {
        return new InnerEffectTextShadowConfig(this.radius * f, this.offsetX * f, this.offsetY * f, this.color);
    }

    public InnerEffectTextShadowConfig(float f, float f2, float f3, int i) {
        this.radius = f;
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = i;
    }
}
