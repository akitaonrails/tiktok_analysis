package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextContainer;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Spacing;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ECRichTextContainer implements Parcelable {
    public static final Parcelable.Creator<ECRichTextContainer> CREATOR = new Parcelable.Creator<ECRichTextContainer>() { // from class: X.0mgn
        @Override // android.os.Parcelable.Creator
        public final ECRichTextContainer createFromParcel(Parcel parcel) {
            Spacing spacingCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(ECRichTextContainer.class.getClassLoader());
            Spacing spacingCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                spacingCreateFromParcel = null;
            } else {
                spacingCreateFromParcel = Spacing.CREATOR.createFromParcel(parcel);
            }
            Spacing spacing = spacingCreateFromParcel;
            if (parcel.readInt() != 0) {
                spacingCreateFromParcel2 = Spacing.CREATOR.createFromParcel(parcel);
            }
            return new ECRichTextContainer(eCRichText, spacing, spacingCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final ECRichTextContainer[] newArray(int i) {
            return new ECRichTextContainer[i];
        }
    };

    @C09CT("ec_rich_text")
    public final ECRichText ecRichText;

    @C09CT("margin")
    public final Spacing margin;

    @C09CT("padding")
    public final Spacing padding;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECRichTextContainer)) {
            return false;
        }
        ECRichTextContainer eCRichTextContainer = (ECRichTextContainer) obj;
        return Intrinsics.LJFF(this.ecRichText, eCRichTextContainer.ecRichText) && Intrinsics.LJFF(this.padding, eCRichTextContainer.padding) && Intrinsics.LJFF(this.margin, eCRichTextContainer.margin);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.ecRichText;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Spacing spacing = this.padding;
        int iHashCode2 = (iHashCode + (spacing == null ? 0 : spacing.hashCode())) * 31;
        Spacing spacing2 = this.margin;
        return iHashCode2 + (spacing2 != null ? spacing2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECRichTextContainer(ecRichText=");
        sbLIZ.append(this.ecRichText);
        sbLIZ.append(", padding=");
        sbLIZ.append(this.padding);
        sbLIZ.append(", margin=");
        sbLIZ.append(this.margin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ecRichText, i);
        Spacing spacing = this.padding;
        if (spacing == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacing.writeToParcel(parcel, i);
        }
        Spacing spacing2 = this.margin;
        if (spacing2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            spacing2.writeToParcel(parcel, i);
        }
    }

    public ECRichTextContainer(ECRichText eCRichText, Spacing spacing, Spacing spacing2) {
        this.ecRichText = eCRichText;
        this.padding = spacing;
        this.margin = spacing2;
    }
}
