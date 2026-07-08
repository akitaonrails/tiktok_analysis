package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpSellingPoint implements Parcelable {

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @C09CT("click_action")
    public final Integer clickAction;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("image")
    public final Image image;

    @C09CT("text")
    public final ECRichText text;
    public static final Parcelable.Creator<PdpSellingPoint> CREATOR = new Parcelable.Creator<PdpSellingPoint>() { // from class: X.02yh
        @Override // android.os.Parcelable.Creator
        public final PdpSellingPoint createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PdpSellingPoint.class.getClassLoader());
            CommonColor commonColorCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new PdpSellingPoint(eCRichText, numValueOf, commonColorCreateFromParcel, (Image) parcel.readParcelable(PdpSellingPoint.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpSellingPoint[] newArray(int i) {
            return new PdpSellingPoint[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpSellingPoint)) {
            return false;
        }
        PdpSellingPoint pdpSellingPoint = (PdpSellingPoint) obj;
        return Intrinsics.LJFF(this.text, pdpSellingPoint.text) && Intrinsics.LJFF(this.clickAction, pdpSellingPoint.clickAction) && Intrinsics.LJFF(this.backgroundColor, pdpSellingPoint.backgroundColor) && Intrinsics.LJFF(this.image, pdpSellingPoint.image) && Intrinsics.LJFF(this.daInfo, pdpSellingPoint.daInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.text;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Integer num = this.clickAction;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        CommonColor commonColor = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        Image image = this.image;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpSellingPoint(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", clickAction=");
        sbLIZ.append(this.clickAction);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
        Integer num = this.clickAction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        CommonColor commonColor = this.backgroundColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.daInfo);
    }

    public PdpSellingPoint(ECRichText eCRichText, Integer num, CommonColor commonColor, Image image, String str) {
        this.text = eCRichText;
        this.clickAction = num;
        this.backgroundColor = commonColor;
        this.image = image;
        this.daInfo = str;
    }
}
