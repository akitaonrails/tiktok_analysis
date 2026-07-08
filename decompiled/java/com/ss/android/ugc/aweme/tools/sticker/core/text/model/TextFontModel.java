package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C385010F7r;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextFontModel implements Parcelable {

    @C09CT("child_index")
    public int childIndex;

    @C09CT("enable_bg_color")
    public final boolean enableBgColor;

    @C09CT("enable_maskblur_light_color")
    public final boolean enableMaskBlurLightColor;

    @C09CT("file_name")
    public final String fileName;

    @C09CT("font_category_id")
    public final String fontCategoryId;

    @C09CT("font_id")
    public final String fontId;

    @C09CT("font_name")
    public final String fontName;

    @C09CT("font_panel")
    public final String fontPanel;

    @C09CT("font_res_id")
    public final String fontResId;

    @C09CT("font_size")
    public final int fontSize;

    @C09CT("font_size_unit")
    public final int fontSizeUnit;

    @C09CT("font_title")
    public final String fontTitle;

    @C09CT("is_font_from_global")
    public boolean isFontFromGlobal;

    @C09CT("local_path")
    public final String localPath;
    public static final C385010F7r Companion = new Object() { // from class: X.0F7r
    };
    public static final Parcelable.Creator<TextFontModel> CREATOR = new Parcelable.Creator<TextFontModel>() { // from class: X.0F7q
        @Override // android.os.Parcelable.Creator
        public final TextFontModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new TextFontModel(string, string2, string3, string4, string5, string6, i, i2, string7, string8, z, z2, z3, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TextFontModel[] newArray(int i) {
            return new TextFontModel[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFontModel() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, 0, 0 == true ? 1 : 0, objArr6, objArr7, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, objArr8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFontModel)) {
            return false;
        }
        TextFontModel textFontModel = (TextFontModel) obj;
        return Intrinsics.LJFF(this.fontId, textFontModel.fontId) && Intrinsics.LJFF(this.fontResId, textFontModel.fontResId) && Intrinsics.LJFF(this.fontPanel, textFontModel.fontPanel) && Intrinsics.LJFF(this.fontCategoryId, textFontModel.fontCategoryId) && Intrinsics.LJFF(this.fontName, textFontModel.fontName) && Intrinsics.LJFF(this.fontTitle, textFontModel.fontTitle) && this.fontSize == textFontModel.fontSize && this.fontSizeUnit == textFontModel.fontSizeUnit && Intrinsics.LJFF(this.fileName, textFontModel.fileName) && Intrinsics.LJFF(this.localPath, textFontModel.localPath) && this.enableBgColor == textFontModel.enableBgColor && this.enableMaskBlurLightColor == textFontModel.enableMaskBlurLightColor && this.isFontFromGlobal == textFontModel.isFontFromGlobal && this.childIndex == textFontModel.childIndex;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.fontId.hashCode() * 31) + this.fontResId.hashCode()) * 31) + this.fontPanel.hashCode()) * 31) + this.fontCategoryId.hashCode()) * 31) + this.fontName.hashCode()) * 31) + this.fontTitle.hashCode()) * 31) + this.fontSize) * 31) + this.fontSizeUnit) * 31) + this.fileName.hashCode()) * 31) + this.localPath.hashCode()) * 31) + C786410Ut5.Z2(this.enableBgColor)) * 31) + C786410Ut5.Z2(this.enableMaskBlurLightColor)) * 31) + C786410Ut5.Z2(this.isFontFromGlobal)) * 31) + this.childIndex;
    }

    public final String toString() {
        return "TextFontModel(fontId=" + this.fontId + ", fontResId=" + this.fontResId + ", fontPanel=" + this.fontPanel + ", fontCategoryId=" + this.fontCategoryId + ", fontName=" + this.fontName + ", fontTitle=" + this.fontTitle + ", fontSize=" + this.fontSize + ", fontSizeUnit=" + this.fontSizeUnit + ", fileName=" + this.fileName + ", localPath=" + this.localPath + ", enableBgColor=" + this.enableBgColor + ", enableMaskBlurLightColor=" + this.enableMaskBlurLightColor + ", isFontFromGlobal=" + this.isFontFromGlobal + ", childIndex=" + this.childIndex + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fontId);
        parcel.writeString(this.fontResId);
        parcel.writeString(this.fontPanel);
        parcel.writeString(this.fontCategoryId);
        parcel.writeString(this.fontName);
        parcel.writeString(this.fontTitle);
        parcel.writeInt(this.fontSize);
        parcel.writeInt(this.fontSizeUnit);
        parcel.writeString(this.fileName);
        parcel.writeString(this.localPath);
        parcel.writeInt(this.enableBgColor ? 1 : 0);
        parcel.writeInt(this.enableMaskBlurLightColor ? 1 : 0);
        parcel.writeInt(this.isFontFromGlobal ? 1 : 0);
        parcel.writeInt(this.childIndex);
    }

    public TextFontModel(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, String str8, boolean z, boolean z2, boolean z3, int i3) {
        this.fontId = str;
        this.fontResId = str2;
        this.fontPanel = str3;
        this.fontCategoryId = str4;
        this.fontName = str5;
        this.fontTitle = str6;
        this.fontSize = i;
        this.fontSizeUnit = i2;
        this.fileName = str7;
        this.localPath = str8;
        this.enableBgColor = z;
        this.enableMaskBlurLightColor = z2;
        this.isFontFromGlobal = z3;
        this.childIndex = i3;
    }

    public static TextFontModel LIZ(TextFontModel textFontModel, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, String str8, boolean z, boolean z2, int i3, int i4) {
        boolean z3;
        int i5 = i3;
        boolean z4 = z2;
        boolean z5 = z;
        String str9 = str8;
        String str10 = str7;
        int i6 = i2;
        int i7 = i;
        String str11 = str6;
        String str12 = str5;
        String str13 = str4;
        String str14 = str3;
        String str15 = str2;
        String str16 = str;
        if ((i4 & 1) != 0) {
            str16 = textFontModel.fontId;
        }
        if ((i4 & 2) != 0) {
            str15 = textFontModel.fontResId;
        }
        if ((i4 & 4) != 0) {
            str14 = textFontModel.fontPanel;
        }
        if ((i4 & 8) != 0) {
            str13 = textFontModel.fontCategoryId;
        }
        if ((i4 & 16) != 0) {
            str12 = textFontModel.fontName;
        }
        if ((i4 & 32) != 0) {
            str11 = textFontModel.fontTitle;
        }
        if ((i4 & 64) != 0) {
            i7 = textFontModel.fontSize;
        }
        if ((i4 & 128) != 0) {
            i6 = textFontModel.fontSizeUnit;
        }
        if ((i4 & 256) != 0) {
            str10 = textFontModel.fileName;
        }
        if ((i4 & 512) != 0) {
            str9 = textFontModel.localPath;
        }
        if ((i4 & 1024) != 0) {
            z5 = textFontModel.enableBgColor;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = textFontModel.enableMaskBlurLightColor;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z3 = textFontModel.isFontFromGlobal;
        } else {
            z3 = false;
        }
        if ((i4 & 8192) != 0) {
            i5 = textFontModel.childIndex;
        }
        textFontModel.getClass();
        return new TextFontModel(str16, str15, str14, str13, str12, str11, i7, i6, str10, str9, z5, z4, z3, i5);
    }

    public /* synthetic */ TextFontModel(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, String str8, boolean z, boolean z2, boolean z3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "trending" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? 28 : i, (i4 & 128) != 0 ? 2 : i2, (i4 & 256) != 0 ? "" : str7, (i4 & 512) == 0 ? str8 : "", (i4 & 1024) != 0 ? true : z, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z3 : false, (i4 & 8192) != 0 ? -1 : i3);
    }
}
