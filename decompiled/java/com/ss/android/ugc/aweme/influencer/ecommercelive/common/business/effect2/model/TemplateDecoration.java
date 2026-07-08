package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecorationPosition;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecorationTitle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateDecoration implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TemplateDecoration> CREATOR = new Parcelable.Creator<TemplateDecoration>() { // from class: X.0ux7
        @Override // android.os.Parcelable.Creator
        public final TemplateDecoration createFromParcel(Parcel parcel) {
            Integer numValueOf;
            TemplateDecorationTitle templateDecorationTitleCreateFromParcel;
            TemplateDecorationPosition templateDecorationPositionCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                templateDecorationTitleCreateFromParcel = null;
            } else {
                templateDecorationTitleCreateFromParcel = TemplateDecorationTitle.CREATOR.createFromParcel(parcel);
            }
            TemplateDecorationTitle templateDecorationTitle = templateDecorationTitleCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                templateDecorationPositionCreateFromParcel = TemplateDecorationPosition.CREATOR.createFromParcel(parcel);
            }
            return new TemplateDecoration(numValueOf, templateDecorationTitle, string, string2, string3, string4, templateDecorationPositionCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateDecoration[] newArray(int i) {
            return new TemplateDecoration[i];
        }
    };

    @C09CT("bg_image")
    public final String bgImage;

    @C09CT("bg_image_dark")
    public final String bgImageDark;

    @C09CT("bg_image_9_patch")
    public final String bgImageNinePatch;

    @C09CT("bg_image_dark_9_patch")
    public final String bgImageNinePatchDark;

    @C09CT("title")
    public final TemplateDecorationTitle decorationTitle;

    @C09CT("decoration_type")
    public final Integer decorationType;

    @C09CT("position")
    public final TemplateDecorationPosition position;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateDecoration)) {
            return false;
        }
        TemplateDecoration templateDecoration = (TemplateDecoration) obj;
        return Intrinsics.LJFF(this.decorationType, templateDecoration.decorationType) && Intrinsics.LJFF(this.decorationTitle, templateDecoration.decorationTitle) && Intrinsics.LJFF(this.bgImage, templateDecoration.bgImage) && Intrinsics.LJFF(this.bgImageDark, templateDecoration.bgImageDark) && Intrinsics.LJFF(this.bgImageNinePatch, templateDecoration.bgImageNinePatch) && Intrinsics.LJFF(this.bgImageNinePatchDark, templateDecoration.bgImageNinePatchDark) && Intrinsics.LJFF(this.position, templateDecoration.position);
    }

    public final int hashCode() {
        Integer num = this.decorationType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        TemplateDecorationTitle templateDecorationTitle = this.decorationTitle;
        int iHashCode2 = (iHashCode + (templateDecorationTitle == null ? 0 : templateDecorationTitle.hashCode())) * 31;
        String str = this.bgImage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgImageDark;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgImageNinePatch;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bgImageNinePatchDark;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TemplateDecorationPosition templateDecorationPosition = this.position;
        return iHashCode6 + (templateDecorationPosition != null ? templateDecorationPosition.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateDecoration(decorationType=");
        sbLIZ.append(this.decorationType);
        sbLIZ.append(", decorationTitle=");
        sbLIZ.append(this.decorationTitle);
        sbLIZ.append(", bgImage=");
        sbLIZ.append(this.bgImage);
        sbLIZ.append(", bgImageDark=");
        sbLIZ.append(this.bgImageDark);
        sbLIZ.append(", bgImageNinePatch=");
        sbLIZ.append(this.bgImageNinePatch);
        sbLIZ.append(", bgImageNinePatchDark=");
        sbLIZ.append(this.bgImageNinePatchDark);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.decorationType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        TemplateDecorationTitle templateDecorationTitle = this.decorationTitle;
        if (templateDecorationTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateDecorationTitle.writeToParcel(parcel, i);
        }
        parcel.writeString(this.bgImage);
        parcel.writeString(this.bgImageDark);
        parcel.writeString(this.bgImageNinePatch);
        parcel.writeString(this.bgImageNinePatchDark);
        TemplateDecorationPosition templateDecorationPosition = this.position;
        if (templateDecorationPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateDecorationPosition.writeToParcel(parcel, i);
        }
    }

    public TemplateDecoration(Integer num, TemplateDecorationTitle templateDecorationTitle, String str, String str2, String str3, String str4, TemplateDecorationPosition templateDecorationPosition) {
        this.decorationType = num;
        this.decorationTitle = templateDecorationTitle;
        this.bgImage = str;
        this.bgImageDark = str2;
        this.bgImageNinePatch = str3;
        this.bgImageNinePatchDark = str4;
        this.position = templateDecorationPosition;
    }
}
