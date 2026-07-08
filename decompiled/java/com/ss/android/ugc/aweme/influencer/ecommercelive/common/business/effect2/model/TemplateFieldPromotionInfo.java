package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardRichText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldPromotionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateFieldPromotionInfo implements Parcelable {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("activity_type")
    public final Integer activityType;

    @C09CT("max_count")
    public final Integer maxCount;

    @C09CT("rich_text")
    public final BillboardRichText richText;

    @C09CT("sort")
    public final Integer sort;
    public static final Parcelable.Creator<TemplateFieldPromotionInfo> CREATOR = new Parcelable.Creator<TemplateFieldPromotionInfo>() { // from class: X.0v90
        @Override // android.os.Parcelable.Creator
        public final TemplateFieldPromotionInfo createFromParcel(Parcel parcel) {
            BillboardRichText billboardRichTextCreateFromParcel;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                billboardRichTextCreateFromParcel = null;
            } else {
                billboardRichTextCreateFromParcel = BillboardRichText.CREATOR.createFromParcel(parcel);
            }
            BillboardRichText billboardRichText = billboardRichTextCreateFromParcel;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new TemplateFieldPromotionInfo(billboardRichText, string, numValueOf, numValueOf2, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateFieldPromotionInfo[] newArray(int i) {
            return new TemplateFieldPromotionInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        BillboardRichText billboardRichText = this.richText;
        int iHashCode = (billboardRichText == null ? 0 : billboardRichText.hashCode()) * 31;
        String str = this.activityId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.activityType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sort;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxCount;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateFieldPromotionInfo(richText=");
        sbLIZ.append(this.richText);
        sbLIZ.append(", activityId=");
        sbLIZ.append(this.activityId);
        sbLIZ.append(", activityType=");
        sbLIZ.append(this.activityType);
        sbLIZ.append(", sort=");
        sbLIZ.append(this.sort);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.maxCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BillboardRichText billboardRichText = this.richText;
        if (billboardRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billboardRichText.writeToParcel(parcel, i);
        }
        parcel.writeString(this.activityId);
        Integer num = this.activityType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.sort;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.maxCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof TemplateFieldPromotionInfo)) {
            TemplateFieldPromotionInfo templateFieldPromotionInfo = (TemplateFieldPromotionInfo) obj;
            if (Intrinsics.LJFF(this.richText, templateFieldPromotionInfo.richText) && Intrinsics.LJFF(this.activityId, templateFieldPromotionInfo.activityId) && Intrinsics.LJFF(this.activityType, templateFieldPromotionInfo.activityType) && Intrinsics.LJFF(this.sort, templateFieldPromotionInfo.sort)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public TemplateFieldPromotionInfo(BillboardRichText billboardRichText, String str, Integer num, Integer num2, Integer num3) {
        this.richText = billboardRichText;
        this.activityId = str;
        this.activityType = num;
        this.sort = num2;
        this.maxCount = num3;
    }
}
