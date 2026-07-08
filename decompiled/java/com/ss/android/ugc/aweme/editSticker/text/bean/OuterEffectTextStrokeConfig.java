package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OuterEffectTextStrokeConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextStrokeConfig> CREATOR = new Parcelable.Creator<OuterEffectTextStrokeConfig>() { // from class: X.12KJ
        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextStrokeConfig createFromParcel(Parcel parcel) {
            return new OuterEffectTextStrokeConfig(parcel.readFloat(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextStrokeConfig[] newArray(int i) {
            return new OuterEffectTextStrokeConfig[i];
        }
    };

    @C09CT("stroke_color")
    public final String strokeColor;

    @C09CT("stroke_join")
    public final int strokeJoin;

    @C09CT("stroke_width")
    public final float strokeWidth;

    public OuterEffectTextStrokeConfig() {
        this(0.0f, "#ff000000", Paint.Join.ROUND.ordinal());
    }

    public final OuterEffectTextStrokeConfig copy(float f, String str, int i) {
        return new OuterEffectTextStrokeConfig(f, str, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextStrokeConfig)) {
            return false;
        }
        OuterEffectTextStrokeConfig outerEffectTextStrokeConfig = (OuterEffectTextStrokeConfig) obj;
        return Float.compare(this.strokeWidth, outerEffectTextStrokeConfig.strokeWidth) == 0 && Intrinsics.LJFF(this.strokeColor, outerEffectTextStrokeConfig.strokeColor) && this.strokeJoin == outerEffectTextStrokeConfig.strokeJoin;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OuterEffectTextStrokeConfig(strokeWidth=");
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
        parcel.writeString(this.strokeColor);
        parcel.writeInt(this.strokeJoin);
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.strokeWidth) * 31) + this.strokeColor.hashCode()) * 31) + this.strokeJoin;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public OuterEffectTextStrokeConfig(float f, String str, int i) {
        this.strokeWidth = f;
        this.strokeColor = str;
        this.strokeJoin = i;
    }
}
