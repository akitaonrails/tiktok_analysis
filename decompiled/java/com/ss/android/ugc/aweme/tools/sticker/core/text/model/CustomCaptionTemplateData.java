package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CustomCaptionTemplateData implements Parcelable {

    @C09CT("font_model")
    public TextFontModel fontModel;

    @C09CT("has_edited")
    public boolean hasEdited;

    @C09CT("style_mode")
    public final int mode;

    @C09CT("text_color")
    public final int textColor;

    @C09CT("text_motion_model")
    public TextMotionModel textMotionModel;

    @C09CT("text_style")
    public TextStyleModel textStyle;
    public static final Parcelable.Creator<CustomCaptionTemplateData> CREATOR = new Parcelable.Creator<CustomCaptionTemplateData>() { // from class: X.0F7N
        @Override // android.os.Parcelable.Creator
        public final CustomCaptionTemplateData createFromParcel(Parcel parcel) {
            boolean z;
            TextStyleModel textStyleModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            TextMotionModel textMotionModelCreateFromParcel = TextMotionModel.CREATOR.createFromParcel(parcel);
            TextFontModel textFontModelCreateFromParcel = TextFontModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                textStyleModelCreateFromParcel = null;
            } else {
                textStyleModelCreateFromParcel = TextStyleModel.CREATOR.createFromParcel(parcel);
            }
            return new CustomCaptionTemplateData(z, i, i2, textMotionModelCreateFromParcel, textFontModelCreateFromParcel, textStyleModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CustomCaptionTemplateData[] newArray(int i) {
            return new CustomCaptionTemplateData[i];
        }
    };
    public static final int $stable = 8;

    public CustomCaptionTemplateData() {
        this(false, -1, 4, new TextMotionModel("", 0.0f, 0, "", "", "", 3, false, true, false), new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 16383, null), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCaptionTemplateData)) {
            return false;
        }
        CustomCaptionTemplateData customCaptionTemplateData = (CustomCaptionTemplateData) obj;
        return this.hasEdited == customCaptionTemplateData.hasEdited && this.textColor == customCaptionTemplateData.textColor && this.mode == customCaptionTemplateData.mode && Intrinsics.LJFF(this.textMotionModel, customCaptionTemplateData.textMotionModel) && Intrinsics.LJFF(this.fontModel, customCaptionTemplateData.fontModel) && Intrinsics.LJFF(this.textStyle, customCaptionTemplateData.textStyle);
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.hasEdited) * 31) + this.textColor) * 31) + this.mode) * 31) + this.textMotionModel.hashCode()) * 31) + this.fontModel.hashCode()) * 31;
        TextStyleModel textStyleModel = this.textStyle;
        return iZ2 + (textStyleModel == null ? 0 : textStyleModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomCaptionTemplateData(hasEdited=");
        sbLIZ.append(this.hasEdited);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.mode);
        sbLIZ.append(", textMotionModel=");
        sbLIZ.append(this.textMotionModel);
        sbLIZ.append(", fontModel=");
        sbLIZ.append(this.fontModel);
        sbLIZ.append(", textStyle=");
        sbLIZ.append(this.textStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasEdited ? 1 : 0);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.mode);
        this.textMotionModel.writeToParcel(parcel, i);
        this.fontModel.writeToParcel(parcel, i);
        TextStyleModel textStyleModel = this.textStyle;
        if (textStyleModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyleModel.writeToParcel(parcel, i);
        }
    }

    public static CustomCaptionTemplateData LIZ(CustomCaptionTemplateData customCaptionTemplateData, boolean z, int i) {
        int i2;
        int i3;
        TextMotionModel textMotionModel;
        TextFontModel textFontModel;
        boolean z2 = z;
        if ((i & 1) != 0) {
            z2 = customCaptionTemplateData.hasEdited;
        }
        if ((i & 2) != 0) {
            i2 = customCaptionTemplateData.textColor;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = customCaptionTemplateData.mode;
        } else {
            i3 = 0;
        }
        TextStyleModel textStyleModel = null;
        if ((i & 8) != 0) {
            textMotionModel = customCaptionTemplateData.textMotionModel;
        } else {
            textMotionModel = null;
        }
        if ((i & 16) != 0) {
            textFontModel = customCaptionTemplateData.fontModel;
        } else {
            textFontModel = null;
        }
        if ((i & 32) != 0) {
            textStyleModel = customCaptionTemplateData.textStyle;
        }
        customCaptionTemplateData.getClass();
        return new CustomCaptionTemplateData(z2, i2, i3, textMotionModel, textFontModel, textStyleModel);
    }

    public CustomCaptionTemplateData(boolean z, int i, int i2, TextMotionModel textMotionModel, TextFontModel textFontModel, TextStyleModel textStyleModel) {
        this.hasEdited = z;
        this.textColor = i;
        this.mode = i2;
        this.textMotionModel = textMotionModel;
        this.fontModel = textFontModel;
        this.textStyle = textStyleModel;
    }
}
