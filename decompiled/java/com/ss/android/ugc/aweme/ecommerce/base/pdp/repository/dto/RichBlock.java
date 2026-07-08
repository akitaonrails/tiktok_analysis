package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLEcRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.XLLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class RichBlock implements Parcelable {

    @C09CT("ec_rich_text")
    public final ECRichText ecRichText;

    @C09CT("image")
    public final Image image;

    @C09CT("link_rich_text")
    public final LogisticLinkRichText linkRichText;

    @C09CT("rich_block_type")
    public final Integer richBlockType;

    @C09CT("xl_ec_rich_text")
    public final XLEcRichText xlEcRichText;

    @C09CT("xl_link_rich_text")
    public final XLLinkRichText xlLinkRichText;
    public static final Parcelable.Creator<RichBlock> CREATOR = new Parcelable.Creator<RichBlock>() { // from class: X.0mg1
        @Override // android.os.Parcelable.Creator
        public final RichBlock createFromParcel(Parcel parcel) {
            Integer numValueOf;
            LogisticLinkRichText logisticLinkRichTextCreateFromParcel;
            XLLinkRichText xLLinkRichTextCreateFromParcel;
            XLEcRichText xLEcRichTextCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                logisticLinkRichTextCreateFromParcel = null;
            } else {
                logisticLinkRichTextCreateFromParcel = LogisticLinkRichText.CREATOR.createFromParcel(parcel);
            }
            LogisticLinkRichText logisticLinkRichText = logisticLinkRichTextCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(RichBlock.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(RichBlock.class.getClassLoader());
            if (parcel.readInt() == 0) {
                xLLinkRichTextCreateFromParcel = null;
            } else {
                xLLinkRichTextCreateFromParcel = XLLinkRichText.CREATOR.createFromParcel(parcel);
            }
            XLLinkRichText xLLinkRichText = xLLinkRichTextCreateFromParcel;
            if (parcel.readInt() != 0) {
                xLEcRichTextCreateFromParcel = XLEcRichText.CREATOR.createFromParcel(parcel);
            }
            return new RichBlock(numValueOf, logisticLinkRichText, eCRichText, image, xLLinkRichText, xLEcRichTextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RichBlock[] newArray(int i) {
            return new RichBlock[i];
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
        if (!(obj instanceof RichBlock)) {
            return false;
        }
        RichBlock richBlock = (RichBlock) obj;
        return Intrinsics.LJFF(this.richBlockType, richBlock.richBlockType) && Intrinsics.LJFF(this.linkRichText, richBlock.linkRichText) && Intrinsics.LJFF(this.ecRichText, richBlock.ecRichText) && Intrinsics.LJFF(this.image, richBlock.image) && Intrinsics.LJFF(this.xlLinkRichText, richBlock.xlLinkRichText) && Intrinsics.LJFF(this.xlEcRichText, richBlock.xlEcRichText);
    }

    public final int hashCode() {
        Integer num = this.richBlockType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        LogisticLinkRichText logisticLinkRichText = this.linkRichText;
        int iHashCode2 = (iHashCode + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        ECRichText eCRichText = this.ecRichText;
        int iHashCode3 = (iHashCode2 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        Image image = this.image;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        XLLinkRichText xLLinkRichText = this.xlLinkRichText;
        int iHashCode5 = (iHashCode4 + (xLLinkRichText == null ? 0 : xLLinkRichText.hashCode())) * 31;
        XLEcRichText xLEcRichText = this.xlEcRichText;
        return iHashCode5 + (xLEcRichText != null ? xLEcRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RichBlock(richBlockType=");
        sbLIZ.append(this.richBlockType);
        sbLIZ.append(", linkRichText=");
        sbLIZ.append(this.linkRichText);
        sbLIZ.append(", ecRichText=");
        sbLIZ.append(this.ecRichText);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(", xlLinkRichText=");
        sbLIZ.append(this.xlLinkRichText);
        sbLIZ.append(", xlEcRichText=");
        sbLIZ.append(this.xlEcRichText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.richBlockType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        LogisticLinkRichText logisticLinkRichText = this.linkRichText;
        if (logisticLinkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logisticLinkRichText.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.ecRichText, i);
        parcel.writeParcelable(this.image, i);
        XLLinkRichText xLLinkRichText = this.xlLinkRichText;
        if (xLLinkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xLLinkRichText.writeToParcel(parcel, i);
        }
        XLEcRichText xLEcRichText = this.xlEcRichText;
        if (xLEcRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xLEcRichText.writeToParcel(parcel, i);
        }
    }

    public RichBlock(Integer num, LogisticLinkRichText logisticLinkRichText, ECRichText eCRichText, Image image, XLLinkRichText xLLinkRichText, XLEcRichText xLEcRichText) {
        this.richBlockType = num;
        this.linkRichText = logisticLinkRichText;
        this.ecRichText = eCRichText;
        this.image = image;
        this.xlLinkRichText = xLLinkRichText;
        this.xlEcRichText = xLEcRichText;
    }
}
