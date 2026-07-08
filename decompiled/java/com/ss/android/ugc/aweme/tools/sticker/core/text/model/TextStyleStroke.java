package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleStroke;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStyleStroke implements Parcelable {

    @C09CT("color")
    public String color;

    @C09CT("width")
    public final float width;
    public static final Parcelable.Creator<TextStyleStroke> CREATOR = new Parcelable.Creator<TextStyleStroke>() { // from class: X.0F8G
        @Override // android.os.Parcelable.Creator
        public final TextStyleStroke createFromParcel(Parcel parcel) {
            return new TextStyleStroke(parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStyleStroke[] newArray(int i) {
            return new TextStyleStroke[i];
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
        if (!(obj instanceof TextStyleStroke)) {
            return false;
        }
        TextStyleStroke textStyleStroke = (TextStyleStroke) obj;
        return Intrinsics.LJFF(this.color, textStyleStroke.color) && Float.compare(this.width, textStyleStroke.width) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStyleStroke(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeFloat(this.width);
    }

    public TextStyleStroke() {
        this("", 0.0f);
    }

    public final int hashCode() {
        return (this.color.hashCode() * 31) + Float.floatToIntBits(this.width);
    }

    public TextStyleStroke(String str, float f) {
        this.color = str;
        this.width = f;
    }
}
