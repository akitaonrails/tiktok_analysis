package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CountdownAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.SpaceAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ECRichTextAttribute implements Parcelable {
    public static final Parcelable.Creator<ECRichTextAttribute> CREATOR = new Parcelable.Creator<ECRichTextAttribute>() { // from class: X.02mk
        @Override // android.os.Parcelable.Creator
        public final ECRichTextAttribute createFromParcel(Parcel parcel) {
            Integer numValueOf;
            TextAttribute textAttributeCreateFromParcel;
            IconAttribute iconAttributeCreateFromParcel;
            SpaceAttribute spaceAttributeCreateFromParcel;
            CountdownAttribute countdownAttributeCreateFromParcel;
            ECRichTextExtraInfo eCRichTextExtraInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                textAttributeCreateFromParcel = null;
            } else {
                textAttributeCreateFromParcel = TextAttribute.CREATOR.createFromParcel(parcel);
            }
            TextAttribute textAttribute = textAttributeCreateFromParcel;
            if (parcel.readInt() == 0) {
                iconAttributeCreateFromParcel = null;
            } else {
                iconAttributeCreateFromParcel = IconAttribute.CREATOR.createFromParcel(parcel);
            }
            IconAttribute iconAttribute = iconAttributeCreateFromParcel;
            if (parcel.readInt() == 0) {
                spaceAttributeCreateFromParcel = null;
            } else {
                spaceAttributeCreateFromParcel = SpaceAttribute.CREATOR.createFromParcel(parcel);
            }
            SpaceAttribute spaceAttribute = spaceAttributeCreateFromParcel;
            if (parcel.readInt() == 0) {
                countdownAttributeCreateFromParcel = null;
            } else {
                countdownAttributeCreateFromParcel = CountdownAttribute.CREATOR.createFromParcel(parcel);
            }
            CountdownAttribute countdownAttribute = countdownAttributeCreateFromParcel;
            if (parcel.readInt() != 0) {
                eCRichTextExtraInfoCreateFromParcel = ECRichTextExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new ECRichTextAttribute(numValueOf, textAttribute, iconAttribute, spaceAttribute, countdownAttribute, eCRichTextExtraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ECRichTextAttribute[] newArray(int i) {
            return new ECRichTextAttribute[i];
        }
    };

    @C09CT("countdown_attribute")
    public CountdownAttribute countdownAttribute;

    @C09CT("extra_info")
    public ECRichTextExtraInfo extraInfo;

    @C09CT("icon_attribute")
    public IconAttribute iconAttribute;

    @C09CT("link_text_type")
    public Integer linkTextType;

    @C09CT("space_attribute")
    public SpaceAttribute spaceAttribute;

    @C09CT("text_attribute")
    public TextAttribute textAttribute;

    public ECRichTextAttribute() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECRichTextAttribute)) {
            return false;
        }
        ECRichTextAttribute eCRichTextAttribute = (ECRichTextAttribute) obj;
        return Intrinsics.LJFF(this.linkTextType, eCRichTextAttribute.linkTextType) && Intrinsics.LJFF(this.textAttribute, eCRichTextAttribute.textAttribute) && Intrinsics.LJFF(this.iconAttribute, eCRichTextAttribute.iconAttribute) && Intrinsics.LJFF(this.spaceAttribute, eCRichTextAttribute.spaceAttribute) && Intrinsics.LJFF(this.countdownAttribute, eCRichTextAttribute.countdownAttribute) && Intrinsics.LJFF(this.extraInfo, eCRichTextAttribute.extraInfo);
    }

    public final int hashCode() {
        Integer num = this.linkTextType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        TextAttribute textAttribute = this.textAttribute;
        int iHashCode2 = (iHashCode + (textAttribute == null ? 0 : textAttribute.hashCode())) * 31;
        IconAttribute iconAttribute = this.iconAttribute;
        int iHashCode3 = (iHashCode2 + (iconAttribute == null ? 0 : iconAttribute.hashCode())) * 31;
        SpaceAttribute spaceAttribute = this.spaceAttribute;
        int iHashCode4 = (iHashCode3 + (spaceAttribute == null ? 0 : spaceAttribute.hashCode())) * 31;
        CountdownAttribute countdownAttribute = this.countdownAttribute;
        int iHashCode5 = (iHashCode4 + (countdownAttribute == null ? 0 : countdownAttribute.hashCode())) * 31;
        ECRichTextExtraInfo eCRichTextExtraInfo = this.extraInfo;
        return iHashCode5 + (eCRichTextExtraInfo != null ? eCRichTextExtraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECRichTextAttribute(linkTextType=");
        sbLIZ.append(this.linkTextType);
        sbLIZ.append(", textAttribute=");
        sbLIZ.append(this.textAttribute);
        sbLIZ.append(", iconAttribute=");
        sbLIZ.append(this.iconAttribute);
        sbLIZ.append(", spaceAttribute=");
        sbLIZ.append(this.spaceAttribute);
        sbLIZ.append(", countdownAttribute=");
        sbLIZ.append(this.countdownAttribute);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.linkTextType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        TextAttribute textAttribute = this.textAttribute;
        if (textAttribute == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textAttribute.writeToParcel(parcel, i);
        }
        IconAttribute iconAttribute = this.iconAttribute;
        if (iconAttribute == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconAttribute.writeToParcel(parcel, i);
        }
        SpaceAttribute spaceAttribute = this.spaceAttribute;
        if (spaceAttribute == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spaceAttribute.writeToParcel(parcel, i);
        }
        CountdownAttribute countdownAttribute = this.countdownAttribute;
        if (countdownAttribute == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countdownAttribute.writeToParcel(parcel, i);
        }
        ECRichTextExtraInfo eCRichTextExtraInfo = this.extraInfo;
        if (eCRichTextExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCRichTextExtraInfo.writeToParcel(parcel, i);
        }
    }

    public static ECRichTextAttribute LIZ(ECRichTextAttribute eCRichTextAttribute, TextAttribute textAttribute) {
        return new ECRichTextAttribute(eCRichTextAttribute.linkTextType, textAttribute, eCRichTextAttribute.iconAttribute, eCRichTextAttribute.spaceAttribute, eCRichTextAttribute.countdownAttribute, eCRichTextAttribute.extraInfo);
    }

    public ECRichTextAttribute(Integer num, TextAttribute textAttribute, IconAttribute iconAttribute, SpaceAttribute spaceAttribute, CountdownAttribute countdownAttribute, ECRichTextExtraInfo eCRichTextExtraInfo) {
        this.linkTextType = num;
        this.textAttribute = textAttribute;
        this.iconAttribute = iconAttribute;
        this.spaceAttribute = spaceAttribute;
        this.countdownAttribute = countdownAttribute;
        this.extraInfo = eCRichTextExtraInfo;
    }
}
