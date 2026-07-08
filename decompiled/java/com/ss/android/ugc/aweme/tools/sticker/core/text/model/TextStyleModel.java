package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleBackground;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleShadow;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleStroke;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextStyleModel implements Parcelable {

    @C09CT("background")
    public final TextStyleBackground background;

    @C09CT("font_res_id")
    public final String fontResId;

    @C09CT("isEffectStyle")
    public final boolean isEffectStyle;

    @C09CT("path")
    public final String path;

    @C09CT("shadow")
    public final TextStyleShadow shadow;

    @C09CT("stroke")
    public final TextStyleStroke stroke;

    @C09CT("textStyleCategoryId")
    public final String styleCategoryId;

    @C09CT("textStyleId")
    public final String styleId;

    @C09CT("textStylePanel")
    public final String stylePanel;

    @C09CT("textStyleResId")
    public final String styleResId;

    @C09CT("textColor")
    public final String styleTextColor;
    public static final Parcelable.Creator<TextStyleModel> CREATOR = new Parcelable.Creator<TextStyleModel>() { // from class: X.0F8F
        @Override // android.os.Parcelable.Creator
        public final TextStyleModel createFromParcel(Parcel parcel) {
            TextStyleShadow textStyleShadowCreateFromParcel;
            TextStyleBackground textStyleBackgroundCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            TextStyleStroke textStyleStrokeCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                textStyleShadowCreateFromParcel = null;
            } else {
                textStyleShadowCreateFromParcel = TextStyleShadow.CREATOR.createFromParcel(parcel);
            }
            TextStyleShadow textStyleShadow = textStyleShadowCreateFromParcel;
            if (parcel.readInt() == 0) {
                textStyleBackgroundCreateFromParcel = null;
            } else {
                textStyleBackgroundCreateFromParcel = TextStyleBackground.CREATOR.createFromParcel(parcel);
            }
            TextStyleBackground textStyleBackground = textStyleBackgroundCreateFromParcel;
            if (parcel.readInt() != 0) {
                textStyleStrokeCreateFromParcel = TextStyleStroke.CREATOR.createFromParcel(parcel);
            }
            TextStyleStroke textStyleStroke = textStyleStrokeCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new TextStyleModel(string, string2, string3, string4, string5, textStyleShadow, textStyleBackground, textStyleStroke, z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStyleModel[] newArray(int i) {
            return new TextStyleModel[i];
        }
    };
    public static final int $stable = 8;

    public TextStyleModel() {
        this("", "", "", "", "#FFFFFFFF", null, null, null, false, "", "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyleModel)) {
            return false;
        }
        TextStyleModel textStyleModel = (TextStyleModel) obj;
        return Intrinsics.LJFF(this.stylePanel, textStyleModel.stylePanel) && Intrinsics.LJFF(this.styleId, textStyleModel.styleId) && Intrinsics.LJFF(this.styleCategoryId, textStyleModel.styleCategoryId) && Intrinsics.LJFF(this.styleResId, textStyleModel.styleResId) && Intrinsics.LJFF(this.styleTextColor, textStyleModel.styleTextColor) && Intrinsics.LJFF(this.shadow, textStyleModel.shadow) && Intrinsics.LJFF(this.background, textStyleModel.background) && Intrinsics.LJFF(this.stroke, textStyleModel.stroke) && this.isEffectStyle == textStyleModel.isEffectStyle && Intrinsics.LJFF(this.path, textStyleModel.path) && Intrinsics.LJFF(this.fontResId, textStyleModel.fontResId);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.stylePanel.hashCode() * 31) + this.styleId.hashCode()) * 31) + this.styleCategoryId.hashCode()) * 31) + this.styleResId.hashCode()) * 31;
        String str = this.styleTextColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        TextStyleShadow textStyleShadow = this.shadow;
        int iHashCode3 = (iHashCode2 + (textStyleShadow == null ? 0 : textStyleShadow.hashCode())) * 31;
        TextStyleBackground textStyleBackground = this.background;
        int iHashCode4 = (iHashCode3 + (textStyleBackground == null ? 0 : textStyleBackground.hashCode())) * 31;
        TextStyleStroke textStyleStroke = this.stroke;
        return ((((((iHashCode4 + (textStyleStroke != null ? textStyleStroke.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isEffectStyle)) * 31) + this.path.hashCode()) * 31) + this.fontResId.hashCode();
    }

    public final String toString() {
        return "TextStyleModel(stylePanel=" + this.stylePanel + ", styleId=" + this.styleId + ", styleCategoryId=" + this.styleCategoryId + ", styleResId=" + this.styleResId + ", styleTextColor=" + this.styleTextColor + ", shadow=" + this.shadow + ", background=" + this.background + ", stroke=" + this.stroke + ", isEffectStyle=" + this.isEffectStyle + ", path=" + this.path + ", fontResId=" + this.fontResId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.stylePanel);
        parcel.writeString(this.styleId);
        parcel.writeString(this.styleCategoryId);
        parcel.writeString(this.styleResId);
        parcel.writeString(this.styleTextColor);
        TextStyleShadow textStyleShadow = this.shadow;
        if (textStyleShadow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyleShadow.writeToParcel(parcel, i);
        }
        TextStyleBackground textStyleBackground = this.background;
        if (textStyleBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyleBackground.writeToParcel(parcel, i);
        }
        TextStyleStroke textStyleStroke = this.stroke;
        if (textStyleStroke == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyleStroke.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isEffectStyle ? 1 : 0);
        parcel.writeString(this.path);
        parcel.writeString(this.fontResId);
    }

    public static TextStyleModel LIZ(TextStyleModel textStyleModel, String str, String str2, String str3, String str4, boolean z, String str5, int i) {
        String str6;
        TextStyleShadow textStyleShadow;
        TextStyleBackground textStyleBackground;
        TextStyleStroke textStyleStroke;
        String str7 = str4;
        String str8 = str5;
        String str9 = str3;
        String str10 = str2;
        boolean z2 = z;
        String str11 = str;
        if ((i & 1) != 0) {
            str11 = textStyleModel.stylePanel;
        }
        if ((i & 2) != 0) {
            str10 = textStyleModel.styleId;
        }
        if ((i & 4) != 0) {
            str9 = textStyleModel.styleCategoryId;
        }
        if ((i & 8) != 0) {
            str7 = textStyleModel.styleResId;
        }
        String str12 = null;
        if ((i & 16) != 0) {
            str6 = textStyleModel.styleTextColor;
        } else {
            str6 = null;
        }
        if ((i & 32) != 0) {
            textStyleShadow = textStyleModel.shadow;
        } else {
            textStyleShadow = null;
        }
        if ((i & 64) != 0) {
            textStyleBackground = textStyleModel.background;
        } else {
            textStyleBackground = null;
        }
        if ((i & 128) != 0) {
            textStyleStroke = textStyleModel.stroke;
        } else {
            textStyleStroke = null;
        }
        if ((i & 256) != 0) {
            z2 = textStyleModel.isEffectStyle;
        }
        if ((i & 512) != 0) {
            str8 = textStyleModel.path;
        }
        if ((i & 1024) != 0) {
            str12 = textStyleModel.fontResId;
        }
        return new TextStyleModel(str11, str10, str9, str7, str6, textStyleShadow, textStyleBackground, textStyleStroke, z2, str8, str12);
    }

    public TextStyleModel(String str, String str2, String str3, String str4, String str5, TextStyleShadow textStyleShadow, TextStyleBackground textStyleBackground, TextStyleStroke textStyleStroke, boolean z, String str6, String str7) {
        this.stylePanel = str;
        this.styleId = str2;
        this.styleCategoryId = str3;
        this.styleResId = str4;
        this.styleTextColor = str5;
        this.shadow = textStyleShadow;
        this.background = textStyleBackground;
        this.stroke = textStyleStroke;
        this.isEffectStyle = z;
        this.path = str6;
        this.fontResId = str7;
    }
}
