package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMStickerFontData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMStickerFontData implements Serializable, Parcelable {
    public static final Parcelable.Creator<IMStickerFontData> CREATOR = new Parcelable.Creator<IMStickerFontData>() { // from class: X.0nhq
        @Override // android.os.Parcelable.Creator
        public final IMStickerFontData createFromParcel(Parcel parcel) {
            return new IMStickerFontData(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IMStickerFontData[] newArray(int i) {
            return new IMStickerFontData[i];
        }
    };

    @C09CT("color")
    public final int color;

    @C09CT("fontResId")
    public final String fontResId;

    @C09CT("style")
    public final int style;

    @C09CT("text")
    public final String text;

    @C09CT("translationY")
    public final float translationY;

    public IMStickerFontData() {
        this("", null, 0, 0.5f, -1);
    }

    public final IMStickerFontData copy(String str, String str2, int i, float f, int i2) {
        return new IMStickerFontData(str, str2, i, f, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMStickerFontData)) {
            return false;
        }
        IMStickerFontData iMStickerFontData = (IMStickerFontData) obj;
        return Intrinsics.LJFF(this.text, iMStickerFontData.text) && Intrinsics.LJFF(this.fontResId, iMStickerFontData.fontResId) && this.style == iMStickerFontData.style && Float.compare(this.translationY, iMStickerFontData.translationY) == 0 && this.color == iMStickerFontData.color;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMStickerFontData(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", fontResId=");
        sbLIZ.append(this.fontResId);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", translationY=");
        sbLIZ.append(this.translationY);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.fontResId);
        parcel.writeInt(this.style);
        parcel.writeFloat(this.translationY);
        parcel.writeInt(this.color);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.fontResId;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.style) * 31) + Float.floatToIntBits(this.translationY)) * 31) + this.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getFontResId() {
        return this.fontResId;
    }

    public final int getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public IMStickerFontData(String str, String str2, int i, float f, int i2) {
        this.text = str;
        this.fontResId = str2;
        this.style = i;
        this.translationY = f;
        this.color = i2;
    }
}
