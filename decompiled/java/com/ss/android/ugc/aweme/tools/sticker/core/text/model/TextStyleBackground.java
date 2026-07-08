package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStyleBackground implements Parcelable {

    @C09CT("color")
    public String color;

    @C09CT("paddingHorizontal")
    public final float paddingHorizontal;

    @C09CT("paddingVertical")
    public final float paddingVertical;

    @C09CT("radius")
    public final float radius;
    public static final Parcelable.Creator<TextStyleBackground> CREATOR = new Parcelable.Creator<TextStyleBackground>() { // from class: X.0F8U
        @Override // android.os.Parcelable.Creator
        public final TextStyleBackground createFromParcel(Parcel parcel) {
            return new TextStyleBackground(parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStyleBackground[] newArray(int i) {
            return new TextStyleBackground[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyleBackground)) {
            return false;
        }
        TextStyleBackground textStyleBackground = (TextStyleBackground) obj;
        return Intrinsics.LJFF(this.color, textStyleBackground.color) && Float.compare(this.radius, textStyleBackground.radius) == 0 && Float.compare(this.paddingHorizontal, textStyleBackground.paddingHorizontal) == 0 && Float.compare(this.paddingVertical, textStyleBackground.paddingVertical) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStyleBackground(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.radius);
        sbLIZ.append(", paddingHorizontal=");
        sbLIZ.append(this.paddingHorizontal);
        sbLIZ.append(", paddingVertical=");
        sbLIZ.append(this.paddingVertical);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeFloat(this.radius);
        parcel.writeFloat(this.paddingHorizontal);
        parcel.writeFloat(this.paddingVertical);
    }

    public TextStyleBackground() {
        this("", 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((this.color.hashCode() * 31) + Float.floatToIntBits(this.radius)) * 31) + Float.floatToIntBits(this.paddingHorizontal)) * 31) + Float.floatToIntBits(this.paddingVertical);
    }

    public TextStyleBackground(String str, float f, float f2, float f3) {
        this.color = str;
        this.radius = f;
        this.paddingHorizontal = f2;
        this.paddingVertical = f3;
    }
}
