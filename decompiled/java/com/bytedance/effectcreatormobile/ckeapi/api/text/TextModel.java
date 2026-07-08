package com.bytedance.effectcreatormobile.ckeapi.api.text;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextAlign;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextStyle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public final class TextModel implements Parcelable {
    public static final Parcelable.Creator<TextModel> CREATOR = new Parcelable.Creator<TextModel>() { // from class: X.12FI
        @Override // android.os.Parcelable.Creator
        public final TextModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            TextStyle textStyleValueOf = TextStyle.valueOf(parcel.readString());
            TextAlign textAlignValueOf = TextAlign.valueOf(parcel.readString());
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new TextModel(string, string2, string3, textStyleValueOf, textAlignValueOf, string4, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TextModel[] newArray(int i) {
            return new TextModel[i];
        }
    };

    @C09CT("text_color")
    public final String color;

    @C09CT("text_font")
    public final String fontId;

    @C09CT("text_style")
    public final TextStyle style;

    @C09CT("text_content")
    public final String text;

    @C09CT("text_align")
    public final TextAlign textAlign;
    public final Long textFeatureId;

    @C09CT("text_sticker")
    public final String textSticker;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextModel)) {
            return false;
        }
        TextModel textModel = (TextModel) obj;
        return Intrinsics.LJFF(this.text, textModel.text) && Intrinsics.LJFF(this.color, textModel.color) && Intrinsics.LJFF(this.fontId, textModel.fontId) && this.style == textModel.style && this.textAlign == textModel.textAlign && Intrinsics.LJFF(this.textSticker, textModel.textSticker) && Intrinsics.LJFF(this.textFeatureId, textModel.textFeatureId);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + this.fontId.hashCode()) * 31) + this.style.hashCode()) * 31) + this.textAlign.hashCode()) * 31;
        String str = this.textSticker;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.textFeatureId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextModel(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", fontId=");
        sbLIZ.append(this.fontId);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", textAlign=");
        sbLIZ.append(this.textAlign);
        sbLIZ.append(", textSticker=");
        sbLIZ.append(this.textSticker);
        sbLIZ.append(", textFeatureId=");
        sbLIZ.append(this.textFeatureId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.color);
        parcel.writeString(this.fontId);
        parcel.writeString(this.style.name());
        parcel.writeString(this.textAlign.name());
        parcel.writeString(this.textSticker);
        Long l = this.textFeatureId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public final String LIZ() {
        return u.LJJIFFI(a0.LJLIIIL(this.text).toString(), "\n", "", false);
    }

    public TextModel(String str, String str2, String str3, TextStyle textStyle, TextAlign textAlign, String str4, Long l) {
        this.text = str;
        this.color = str2;
        this.fontId = str3;
        this.style = textStyle;
        this.textAlign = textAlign;
        this.textSticker = str4;
        this.textFeatureId = l;
    }
}
