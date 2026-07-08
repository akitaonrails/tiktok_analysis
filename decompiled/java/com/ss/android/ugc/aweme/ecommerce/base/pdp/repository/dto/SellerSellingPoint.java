package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SellerSellingPoint implements Parcelable {

    @C09CT("selling_points")
    public String sellingPoints;

    @C09CT("selling_tag")
    public LinkRichText sellingTag;
    public static final Parcelable.Creator<SellerSellingPoint> CREATOR = new Parcelable.Creator<SellerSellingPoint>() { // from class: X.02nn
        @Override // android.os.Parcelable.Creator
        public final SellerSellingPoint createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new SellerSellingPoint(string, linkRichTextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerSellingPoint[] newArray(int i) {
            return new SellerSellingPoint[i];
        }
    };
    public static final int $stable = 8;

    public SellerSellingPoint() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerSellingPoint)) {
            return false;
        }
        SellerSellingPoint sellerSellingPoint = (SellerSellingPoint) obj;
        return Intrinsics.LJFF(this.sellingPoints, sellerSellingPoint.sellingPoints) && Intrinsics.LJFF(this.sellingTag, sellerSellingPoint.sellingTag);
    }

    public final int hashCode() {
        String str = this.sellingPoints;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LinkRichText linkRichText = this.sellingTag;
        return iHashCode + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SellerSellingPoint(sellingPoints=");
        sbLIZ.append(this.sellingPoints);
        sbLIZ.append(", sellingTag=");
        sbLIZ.append(this.sellingTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sellingPoints);
        LinkRichText linkRichText = this.sellingTag;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
    }

    public SellerSellingPoint(String str, LinkRichText linkRichText) {
        this.sellingPoints = str;
        this.sellingTag = linkRichText;
    }
}
