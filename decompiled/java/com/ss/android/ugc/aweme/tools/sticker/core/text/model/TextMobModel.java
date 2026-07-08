package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextMobModel implements Parcelable {

    @C09CT("is_editorpro_adjust_text_color")
    public String adjustTextColorInEditorPro;

    @C09CT("is_editorpro_adjust_text_font")
    public String adjustTextFontInEditorPro;

    @C09CT("is_editorpro_adjust_text_paragraph")
    public String adjustTextParagraph;

    @C09CT("is_editorpro_adjust_text_position")
    public String adjustTextPositionInEditorPro;

    @C09CT("is_editorpro_adjust_text_style")
    public String adjustTextStyleInEditorPro;

    @C09CT("is_editorpro_copy_text")
    public String isEditorProCopyText;

    @C09CT("is_editorpro_trim_text_length")
    public String isEditorProTrimLength;
    public static final Parcelable.Creator<TextMobModel> CREATOR = new Parcelable.Creator<TextMobModel>() { // from class: X.0EMI
        @Override // android.os.Parcelable.Creator
        public final TextMobModel createFromParcel(Parcel parcel) {
            return new TextMobModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextMobModel[] newArray(int i) {
            return new TextMobModel[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMobModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMobModel)) {
            return false;
        }
        TextMobModel textMobModel = (TextMobModel) obj;
        return Intrinsics.LJFF(this.adjustTextStyleInEditorPro, textMobModel.adjustTextStyleInEditorPro) && Intrinsics.LJFF(this.adjustTextParagraph, textMobModel.adjustTextParagraph) && Intrinsics.LJFF(this.adjustTextFontInEditorPro, textMobModel.adjustTextFontInEditorPro) && Intrinsics.LJFF(this.adjustTextColorInEditorPro, textMobModel.adjustTextColorInEditorPro) && Intrinsics.LJFF(this.adjustTextPositionInEditorPro, textMobModel.adjustTextPositionInEditorPro) && Intrinsics.LJFF(this.isEditorProTrimLength, textMobModel.isEditorProTrimLength) && Intrinsics.LJFF(this.isEditorProCopyText, textMobModel.isEditorProCopyText);
    }

    public final int hashCode() {
        return (((((((((((this.adjustTextStyleInEditorPro.hashCode() * 31) + this.adjustTextParagraph.hashCode()) * 31) + this.adjustTextFontInEditorPro.hashCode()) * 31) + this.adjustTextColorInEditorPro.hashCode()) * 31) + this.adjustTextPositionInEditorPro.hashCode()) * 31) + this.isEditorProTrimLength.hashCode()) * 31) + this.isEditorProCopyText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextMobModel(adjustTextStyleInEditorPro=");
        sbLIZ.append(this.adjustTextStyleInEditorPro);
        sbLIZ.append(", adjustTextParagraph=");
        sbLIZ.append(this.adjustTextParagraph);
        sbLIZ.append(", adjustTextFontInEditorPro=");
        sbLIZ.append(this.adjustTextFontInEditorPro);
        sbLIZ.append(", adjustTextColorInEditorPro=");
        sbLIZ.append(this.adjustTextColorInEditorPro);
        sbLIZ.append(", adjustTextPositionInEditorPro=");
        sbLIZ.append(this.adjustTextPositionInEditorPro);
        sbLIZ.append(", isEditorProTrimLength=");
        sbLIZ.append(this.isEditorProTrimLength);
        sbLIZ.append(", isEditorProCopyText=");
        sbLIZ.append(this.isEditorProCopyText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.adjustTextStyleInEditorPro);
        parcel.writeString(this.adjustTextParagraph);
        parcel.writeString(this.adjustTextFontInEditorPro);
        parcel.writeString(this.adjustTextColorInEditorPro);
        parcel.writeString(this.adjustTextPositionInEditorPro);
        parcel.writeString(this.isEditorProTrimLength);
        parcel.writeString(this.isEditorProCopyText);
    }

    public TextMobModel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.adjustTextStyleInEditorPro = str;
        this.adjustTextParagraph = str2;
        this.adjustTextFontInEditorPro = str3;
        this.adjustTextColorInEditorPro = str4;
        this.adjustTextPositionInEditorPro = str5;
        this.isEditorProTrimLength = str6;
        this.isEditorProCopyText = str7;
    }

    public /* synthetic */ TextMobModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : str2, (i & 4) != 0 ? CardStruct.IStatusCode.DEFAULT : str3, (i & 8) != 0 ? CardStruct.IStatusCode.DEFAULT : str4, (i & 16) != 0 ? CardStruct.IStatusCode.DEFAULT : str5, (i & 32) != 0 ? CardStruct.IStatusCode.DEFAULT : str6, (i & 64) == 0 ? str7 : CardStruct.IStatusCode.DEFAULT);
    }
}
