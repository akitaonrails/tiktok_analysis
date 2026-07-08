package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;

/* JADX INFO: loaded from: classes30.dex */
public final class TypefaceStyle extends InlineRichTextStyle {
    public static final Parcelable.Creator<TypefaceStyle> CREATOR = new Parcelable.Creator<TypefaceStyle>() { // from class: X.125t
        @Override // android.os.Parcelable.Creator
        public final TypefaceStyle createFromParcel(Parcel parcel) {
            return new TypefaceStyle(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TypefaceStyle[] newArray(int i) {
            return new TypefaceStyle[i];
        }
    };

    @C09CT("font_id")
    public final String fontId;

    @C09CT("font_path")
    public final String fontPath;

    @C09CT("font_res_id")
    public String fontResId;

    @C09CT("font_name")
    public final String fontType;

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyle, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fontType);
        parcel.writeString(this.fontId);
        parcel.writeString(this.fontResId);
        parcel.writeString(this.fontPath);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypefaceStyle(fontType='");
        sbLIZ.append(this.fontType);
        sbLIZ.append("', fontId='");
        sbLIZ.append(this.fontId);
        sbLIZ.append("', fontResId='");
        sbLIZ.append(this.fontResId);
        sbLIZ.append("', fontPath='");
        sbLIZ.append(this.fontPath);
        sbLIZ.append("', type='");
        sbLIZ.append(this.type);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TypefaceStyle(String str, String str2, String str3, String str4) {
        super("TypefaceStyle");
        this.fontType = str;
        this.fontId = str2;
        this.fontResId = str3;
        this.fontPath = str4;
    }
}
