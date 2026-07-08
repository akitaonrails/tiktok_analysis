package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionExtraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionExtraInfo implements Parcelable {

    @C09CT("da_info")
    public String daInfo;

    @C09CT("price_additional")
    public List<LinkRichText> priceAdditionalList;

    @C09CT("promotion_type")
    public Integer promotionType;

    @C09CT("voucher_reminder")
    public DeductibleVoucherReminder voucherReminder;
    public static final Parcelable.Creator<PromotionExtraInfo> CREATOR = new Parcelable.Creator<PromotionExtraInfo>() { // from class: X.02lm
        @Override // android.os.Parcelable.Creator
        public final PromotionExtraInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            DeductibleVoucherReminder deductibleVoucherReminderCreateFromParcel;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LinkRichText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                deductibleVoucherReminderCreateFromParcel = null;
            } else {
                deductibleVoucherReminderCreateFromParcel = DeductibleVoucherReminder.CREATOR.createFromParcel(parcel);
            }
            DeductibleVoucherReminder deductibleVoucherReminder = deductibleVoucherReminderCreateFromParcel;
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PromotionExtraInfo(arrayList, deductibleVoucherReminder, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionExtraInfo[] newArray(int i) {
            return new PromotionExtraInfo[i];
        }
    };
    public static final int $stable = 8;

    public PromotionExtraInfo() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionExtraInfo)) {
            return false;
        }
        PromotionExtraInfo promotionExtraInfo = (PromotionExtraInfo) obj;
        return Intrinsics.LJFF(this.priceAdditionalList, promotionExtraInfo.priceAdditionalList) && Intrinsics.LJFF(this.voucherReminder, promotionExtraInfo.voucherReminder) && Intrinsics.LJFF(this.promotionType, promotionExtraInfo.promotionType) && Intrinsics.LJFF(this.daInfo, promotionExtraInfo.daInfo);
    }

    public final int hashCode() {
        List<LinkRichText> list = this.priceAdditionalList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        DeductibleVoucherReminder deductibleVoucherReminder = this.voucherReminder;
        int iHashCode2 = (iHashCode + (deductibleVoucherReminder == null ? 0 : deductibleVoucherReminder.hashCode())) * 31;
        Integer num = this.promotionType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionExtraInfo(priceAdditionalList=");
        sbLIZ.append(this.priceAdditionalList);
        sbLIZ.append(", voucherReminder=");
        sbLIZ.append(this.voucherReminder);
        sbLIZ.append(", promotionType=");
        sbLIZ.append(this.promotionType);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LinkRichText> list = this.priceAdditionalList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LinkRichText> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        DeductibleVoucherReminder deductibleVoucherReminder = this.voucherReminder;
        if (deductibleVoucherReminder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deductibleVoucherReminder.writeToParcel(parcel, i);
        }
        Integer num = this.promotionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.daInfo);
    }

    public PromotionExtraInfo(List<LinkRichText> list, DeductibleVoucherReminder deductibleVoucherReminder, Integer num, String str) {
        this.priceAdditionalList = list;
        this.voucherReminder = deductibleVoucherReminder;
        this.promotionType = num;
        this.daInfo = str;
    }
}
