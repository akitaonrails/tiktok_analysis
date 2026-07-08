package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinedSalesVolume implements Parcelable {

    @C09CT("sales_text")
    public LogisticLinkRichText salesText;

    @C09CT("sales_text_ec_richtext")
    public ECRichText salesTextECRichText;

    @C09CT("sales_specification_schema")
    public String sales_specification_schema;
    public static final Parcelable.Creator<CombinedSalesVolume> CREATOR = new Parcelable.Creator<CombinedSalesVolume>() { // from class: X.02mX
        @Override // android.os.Parcelable.Creator
        public final CombinedSalesVolume createFromParcel(Parcel parcel) {
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel = null;
            } else {
                logisticLinkRichTextCreateFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new CombinedSalesVolume(logisticLinkRichTextCreateFromParcel, (ECRichText) parcel.readParcelable(CombinedSalesVolume.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CombinedSalesVolume[] newArray(int i) {
            return new CombinedSalesVolume[i];
        }
    };
    public static final int $stable = 8;

    public CombinedSalesVolume() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedSalesVolume)) {
            return false;
        }
        CombinedSalesVolume combinedSalesVolume = (CombinedSalesVolume) obj;
        return Intrinsics.LJFF(this.salesText, combinedSalesVolume.salesText) && Intrinsics.LJFF(this.salesTextECRichText, combinedSalesVolume.salesTextECRichText) && Intrinsics.LJFF(this.sales_specification_schema, combinedSalesVolume.sales_specification_schema);
    }

    public final int hashCode() {
        LogisticLinkRichText logisticLinkRichText = this.salesText;
        int iHashCode = (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode()) * 31;
        ECRichText eCRichText = this.salesTextECRichText;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.sales_specification_schema;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CombinedSalesVolume(salesText=");
        sbLIZ.append(this.salesText);
        sbLIZ.append(", salesTextECRichText=");
        sbLIZ.append(this.salesTextECRichText);
        sbLIZ.append(", sales_specification_schema=");
        sbLIZ.append(this.sales_specification_schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LogisticLinkRichText logisticLinkRichText = this.salesText;
        if (logisticLinkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.salesTextECRichText, i);
        parcel.writeString(this.sales_specification_schema);
    }

    public CombinedSalesVolume(LogisticLinkRichText logisticLinkRichText, ECRichText eCRichText, String str) {
        this.salesText = logisticLinkRichText;
        this.salesTextECRichText = eCRichText;
        this.sales_specification_schema = str;
    }
}
