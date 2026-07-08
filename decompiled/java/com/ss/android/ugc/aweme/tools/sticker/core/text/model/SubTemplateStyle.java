package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SubTemplateStyle implements Parcelable {

    @C09CT("align")
    public int align;

    @C09CT("color")
    public int color;

    @C09CT("font_model")
    public TextFontModel fontModel;

    @C09CT("line_spacing")
    public float lineSpacing;

    @C09CT("text_size")
    public float textSize;
    public static final Parcelable.Creator<SubTemplateStyle> CREATOR = new Parcelable.Creator<SubTemplateStyle>() { // from class: X.0F7I
        @Override // android.os.Parcelable.Creator
        public final SubTemplateStyle createFromParcel(Parcel parcel) {
            return new SubTemplateStyle(parcel.readInt(), TextFontModel.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SubTemplateStyle[] newArray(int i) {
            return new SubTemplateStyle[i];
        }
    };
    public static final int $stable = 8;

    public SubTemplateStyle() {
        this(-1, new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 15359, null), 2, 16.0f, 0.0f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTemplateStyle)) {
            return false;
        }
        SubTemplateStyle subTemplateStyle = (SubTemplateStyle) obj;
        return this.color == subTemplateStyle.color && Intrinsics.LJFF(this.fontModel, subTemplateStyle.fontModel) && this.align == subTemplateStyle.align && Float.compare(this.textSize, subTemplateStyle.textSize) == 0 && Float.compare(this.lineSpacing, subTemplateStyle.lineSpacing) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubTemplateStyle(color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", fontModel=");
        sbLIZ.append(this.fontModel);
        sbLIZ.append(", align=");
        sbLIZ.append(this.align);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.textSize);
        sbLIZ.append(", lineSpacing=");
        sbLIZ.append(this.lineSpacing);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.color);
        this.fontModel.writeToParcel(parcel, i);
        parcel.writeInt(this.align);
        parcel.writeFloat(this.textSize);
        parcel.writeFloat(this.lineSpacing);
    }

    public final int hashCode() {
        return (((((((this.color * 31) + this.fontModel.hashCode()) * 31) + this.align) * 31) + Float.floatToIntBits(this.textSize)) * 31) + Float.floatToIntBits(this.lineSpacing);
    }

    public SubTemplateStyle(int i, TextFontModel textFontModel, int i2, float f, float f2) {
        this.color = i;
        this.fontModel = textFontModel;
        this.align = i2;
        this.textSize = f;
        this.lineSpacing = f2;
    }
}
