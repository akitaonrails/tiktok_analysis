package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PriceDescDetailItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceDescDetailItem implements Parcelable {

    @C09CT("sub_title")
    public ECRichText subTitle;

    @C09CT("terms_content")
    public String termsContent;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<PriceDescDetailItem> CREATOR = new Parcelable.Creator<PriceDescDetailItem>() { // from class: X.02Hl
        @Override // android.os.Parcelable.Creator
        public final PriceDescDetailItem createFromParcel(Parcel parcel) {
            return new PriceDescDetailItem(parcel.readString(), (ECRichText) parcel.readParcelable(PriceDescDetailItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceDescDetailItem[] newArray(int i) {
            return new PriceDescDetailItem[i];
        }
    };
    public static final int $stable = 8;

    public PriceDescDetailItem() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDescDetailItem)) {
            return false;
        }
        PriceDescDetailItem priceDescDetailItem = (PriceDescDetailItem) obj;
        return Intrinsics.LJFF(this.title, priceDescDetailItem.title) && Intrinsics.LJFF(this.subTitle, priceDescDetailItem.subTitle) && Intrinsics.LJFF(this.termsContent, priceDescDetailItem.termsContent);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.subTitle;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str2 = this.termsContent;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceDescDetailItem(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", termsContent=");
        sbLIZ.append(this.termsContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.subTitle, i);
        parcel.writeString(this.termsContent);
    }

    public PriceDescDetailItem(String str, ECRichText eCRichText, String str2) {
        this.title = str;
        this.subTitle = eCRichText;
        this.termsContent = str2;
    }
}
