package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleShadow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStyleShadow implements Parcelable {

    @C09CT("color")
    public String color;

    @C09CT("offsetX")
    public final float offsetX;

    @C09CT("offsetY")
    public final float offsetY;

    @C09CT("smooth")
    public final float smooth;
    public static final Parcelable.Creator<TextStyleShadow> CREATOR = new Parcelable.Creator<TextStyleShadow>() { // from class: X.0F8V
        @Override // android.os.Parcelable.Creator
        public final TextStyleShadow createFromParcel(Parcel parcel) {
            return new TextStyleShadow(parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStyleShadow[] newArray(int i) {
            return new TextStyleShadow[i];
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
        if (!(obj instanceof TextStyleShadow)) {
            return false;
        }
        TextStyleShadow textStyleShadow = (TextStyleShadow) obj;
        return Intrinsics.LJFF(this.color, textStyleShadow.color) && Float.compare(this.offsetX, textStyleShadow.offsetX) == 0 && Float.compare(this.offsetY, textStyleShadow.offsetY) == 0 && Float.compare(this.smooth, textStyleShadow.smooth) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStyleShadow(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", offsetX=");
        sbLIZ.append(this.offsetX);
        sbLIZ.append(", offsetY=");
        sbLIZ.append(this.offsetY);
        sbLIZ.append(", smooth=");
        sbLIZ.append(this.smooth);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeFloat(this.smooth);
    }

    public TextStyleShadow() {
        this("", 0.0f, 0.0f, 0.0f);
    }

    public final int hashCode() {
        return (((((this.color.hashCode() * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + Float.floatToIntBits(this.smooth);
    }

    public TextStyleShadow(String str, float f, float f2, float f3) {
        this.color = str;
        this.offsetX = f;
        this.offsetY = f2;
        this.smooth = f3;
    }
}
