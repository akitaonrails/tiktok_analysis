package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C2188811AlT;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectTextStrokeConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextStrokeConfig> CREATOR = new Parcelable.Creator<InnerEffectTextStrokeConfig>() { // from class: X.12KH
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextStrokeConfig createFromParcel(Parcel parcel) {
            return new InnerEffectTextStrokeConfig(parcel.readFloat(), parcel.readInt(), Paint.Join.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextStrokeConfig[] newArray(int i) {
            return new InnerEffectTextStrokeConfig[i];
        }
    };
    public final int strokeColor;
    public final Paint.Join strokeJoin;
    public final float strokeWidth;

    public InnerEffectTextStrokeConfig() {
        this(0.0f, -16777216, Paint.Join.ROUND);
    }

    public final InnerEffectTextStrokeConfig copy(float f, int i, Paint.Join join) {
        return new InnerEffectTextStrokeConfig(f, i, join);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextStrokeConfig)) {
            return false;
        }
        InnerEffectTextStrokeConfig innerEffectTextStrokeConfig = (InnerEffectTextStrokeConfig) obj;
        return Float.compare(this.strokeWidth, innerEffectTextStrokeConfig.strokeWidth) == 0 && this.strokeColor == innerEffectTextStrokeConfig.strokeColor && this.strokeJoin == innerEffectTextStrokeConfig.strokeJoin;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerEffectTextStrokeConfig(strokeWidth=");
        sbLIZ.append(this.strokeWidth);
        sbLIZ.append(", strokeColor=");
        sbLIZ.append(this.strokeColor);
        sbLIZ.append(", strokeJoin=");
        sbLIZ.append(this.strokeJoin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.strokeWidth);
        parcel.writeInt(this.strokeColor);
        parcel.writeString(this.strokeJoin.name());
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.strokeWidth) * 31) + this.strokeColor) * 31) + this.strokeJoin.hashCode();
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final Paint.Join getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public InnerEffectTextStrokeConfig(float f, int i, Paint.Join join) {
        this.strokeWidth = f;
        this.strokeColor = i;
        this.strokeJoin = join;
    }
}
