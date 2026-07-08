package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.TextStickerExtraModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class TextStickerExtraModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextStickerExtraModel> CREATOR = new Parcelable.Creator<TextStickerExtraModel>() { // from class: X.0Mhg
        @Override // android.os.Parcelable.Creator
        public final TextStickerExtraModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf = null;
            }
            return new TextStickerExtraModel(string, numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerExtraModel[] newArray(int i) {
            return new TextStickerExtraModel[i];
        }
    };

    @C09CT("border_color_hex")
    public String borderColorHex;

    @C09CT("canvas_color_hex")
    public String canvasColorHex;

    @C09CT("color_hex")
    public String colorHex;

    @C09CT("text")
    public String text;

    @C09CT("text_style")
    public Integer textStyle;

    public TextStickerExtraModel() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.text);
        Integer num = this.textStyle;
        if (num != null) {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.colorHex);
        parcel.writeString(this.borderColorHex);
        parcel.writeString(this.canvasColorHex);
    }

    public final String getBorderColorHex() {
        return this.borderColorHex;
    }

    public final String getCanvasColorHex() {
        return this.canvasColorHex;
    }

    public final String getColorHex() {
        return this.colorHex;
    }

    public final String getText() {
        return this.text;
    }

    public final Integer getTextStyle() {
        return this.textStyle;
    }

    public final void setBorderColorHex(String str) {
        this.borderColorHex = str;
    }

    public final void setCanvasColorHex(String str) {
        this.canvasColorHex = str;
    }

    public final void setColorHex(String str) {
        this.colorHex = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextStyle(Integer num) {
        this.textStyle = num;
    }

    public TextStickerExtraModel(String str, Integer num, String str2, String str3, String str4) {
        this.text = str;
        this.textStyle = num;
        this.colorHex = str2;
        this.borderColorHex = str3;
        this.canvasColorHex = str4;
    }
}
