package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ColorEntity;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import kotlin.text.u;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateFieldText implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TemplateFieldText> CREATOR = new Parcelable.Creator<TemplateFieldText>() { // from class: X.0v8z
        @Override // android.os.Parcelable.Creator
        public final TemplateFieldText createFromParcel(Parcel parcel) {
            ColorEntity colorEntityCreateFromParcel;
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                colorEntityCreateFromParcel = null;
            } else {
                colorEntityCreateFromParcel = ColorEntity.CREATOR.createFromParcel(parcel);
            }
            ColorEntity colorEntity = colorEntityCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TemplateFieldText(string, i, string2, string3, colorEntity, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateFieldText[] newArray(int i) {
            return new TemplateFieldText[i];
        }
    };

    @C09CT("bg_color")
    public final ColorEntity bgColor;

    @C09CT("item_color")
    public final String color;

    @C09CT("item_content")
    public final String content;

    @C09CT("default_content")
    public final String defaultContent;

    @C09CT("item_limit")
    public final int limit;

    @C09CT("line_limit")
    public final Integer lineLimit;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.content;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.limit) * 31;
        String str2 = this.color;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultContent;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ColorEntity colorEntity = this.bgColor;
        int iHashCode4 = (iHashCode3 + (colorEntity == null ? 0 : colorEntity.hashCode())) * 31;
        Integer num = this.lineLimit;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateFieldText(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", limit=");
        sbLIZ.append(this.limit);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", defaultContent=");
        sbLIZ.append(this.defaultContent);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", lineLimit=");
        sbLIZ.append(this.lineLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.content);
        parcel.writeInt(this.limit);
        parcel.writeString(this.color);
        parcel.writeString(this.defaultContent);
        ColorEntity colorEntity = this.bgColor;
        if (colorEntity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            colorEntity.writeToParcel(parcel, i);
        }
        Integer num = this.lineLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TemplateFieldText) || !u.LJIJI(this.content, ((TemplateFieldText) obj).content, false)) {
            return false;
        }
        return true;
    }

    public TemplateFieldText(String str, int i, String str2, String str3, ColorEntity colorEntity, Integer num) {
        this.content = str;
        this.limit = i;
        this.color = str2;
        this.defaultContent = str3;
        this.bgColor = colorEntity;
        this.lineLimit = num;
    }
}
