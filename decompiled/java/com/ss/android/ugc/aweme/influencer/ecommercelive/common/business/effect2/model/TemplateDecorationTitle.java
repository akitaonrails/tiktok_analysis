package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ColorEntity;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecorationTitle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateDecorationTitle implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TemplateDecorationTitle> CREATOR = new Parcelable.Creator<TemplateDecorationTitle>() { // from class: X.0ux8
        @Override // android.os.Parcelable.Creator
        public final TemplateDecorationTitle createFromParcel(Parcel parcel) {
            ColorEntity colorEntityCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                colorEntityCreateFromParcel = null;
            } else {
                colorEntityCreateFromParcel = ColorEntity.CREATOR.createFromParcel(parcel);
            }
            return new TemplateDecorationTitle(string, colorEntityCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateDecorationTitle[] newArray(int i) {
            return new TemplateDecorationTitle[i];
        }
    };

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final ColorEntity textColor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecorationTitle)) {
            return false;
        }
        TemplateDecorationTitle templateDecorationTitle = (TemplateDecorationTitle) obj;
        return Intrinsics.LJFF(this.text, templateDecorationTitle.text) && Intrinsics.LJFF(this.textColor, templateDecorationTitle.textColor);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ColorEntity colorEntity = this.textColor;
        return iHashCode + (colorEntity != null ? colorEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateDecorationTitle(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        ColorEntity colorEntity = this.textColor;
        if (colorEntity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            colorEntity.writeToParcel(parcel, i);
        }
    }

    public TemplateDecorationTitle(String str, ColorEntity colorEntity) {
        this.text = str;
        this.textColor = colorEntity;
    }
}
