package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OuterEffectTextShadowConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextShadowConfig> CREATOR = new Parcelable.Creator<OuterEffectTextShadowConfig>() { // from class: X.12KL
        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextShadowConfig createFromParcel(Parcel parcel) {
            return new OuterEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextShadowConfig[] newArray(int i) {
            return new OuterEffectTextShadowConfig[i];
        }
    };

    @C09CT("color")
    public final String color;

    @C09CT("offsetX")
    public final float offsetX;

    @C09CT("offsetY")
    public final float offsetY;

    @C09CT("radius")
    public final float radius;

    public OuterEffectTextShadowConfig() {
        this(0.0f, 0.0f, 0.0f, "#FF888888");
    }

    public final OuterEffectTextShadowConfig copy(float f, float f2, float f3, String str) {
        return new OuterEffectTextShadowConfig(f, f2, f3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextShadowConfig)) {
            return false;
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = (OuterEffectTextShadowConfig) obj;
        return Float.compare(this.radius, outerEffectTextShadowConfig.radius) == 0 && Float.compare(this.offsetX, outerEffectTextShadowConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextShadowConfig.offsetY) == 0 && Intrinsics.LJFF(this.color, outerEffectTextShadowConfig.color);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OuterEffectTextShadowConfig(radius=");
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
        parcel.writeString(this.color);
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.radius) * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + this.color.hashCode();
    }

    public final String getColor() {
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

    public OuterEffectTextShadowConfig(float f, float f2, float f3, String str) {
        this.radius = f;
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = str;
    }
}
