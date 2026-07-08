package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CouponPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CouponPromotion implements Parcelable {

    @C09CT("activity_terms_apply")
    public final LinkText activityTermsApply;

    @C09CT("promotion_item_list")
    public final List<PromotionItem> promotionItemList;

    @C09CT("promotion_see_all")
    public final LinkText seeAll;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    @C09CT("voucher_terms_apply")
    public final LinkText voucherTermsApply;
    public static final Parcelable.Creator<CouponPromotion> CREATOR = new Parcelable.Creator<CouponPromotion>() { // from class: X.02se
        @Override // android.os.Parcelable.Creator
        public final CouponPromotion createFromParcel(Parcel parcel) {
            LinkText linkTextCreateFromParcel;
            LinkText linkTextCreateFromParcel2;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            LinkText linkTextCreateFromParcel3 = null;
            if (parcel.readInt() == 0) {
                linkTextCreateFromParcel = null;
            } else {
                linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
            }
            LinkText linkText = linkTextCreateFromParcel;
            if (parcel.readInt() == 0) {
                linkTextCreateFromParcel2 = null;
            } else {
                linkTextCreateFromParcel2 = LinkText.CREATOR.createFromParcel(parcel);
            }
            LinkText linkText2 = linkTextCreateFromParcel2;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PromotionItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                linkTextCreateFromParcel3 = LinkText.CREATOR.createFromParcel(parcel);
            }
            return new CouponPromotion(string, string2, linkText, linkText2, arrayList, linkTextCreateFromParcel3);
        }

        @Override // android.os.Parcelable.Creator
        public final CouponPromotion[] newArray(int i) {
            return new CouponPromotion[i];
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
        if (!(obj instanceof CouponPromotion)) {
            return false;
        }
        CouponPromotion couponPromotion = (CouponPromotion) obj;
        return Intrinsics.LJFF(this.title, couponPromotion.title) && Intrinsics.LJFF(this.subTitle, couponPromotion.subTitle) && Intrinsics.LJFF(this.activityTermsApply, couponPromotion.activityTermsApply) && Intrinsics.LJFF(this.voucherTermsApply, couponPromotion.voucherTermsApply) && Intrinsics.LJFF(this.promotionItemList, couponPromotion.promotionItemList) && Intrinsics.LJFF(this.seeAll, couponPromotion.seeAll);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkText linkText = this.activityTermsApply;
        int iHashCode3 = (iHashCode2 + (linkText == null ? 0 : linkText.hashCode())) * 31;
        LinkText linkText2 = this.voucherTermsApply;
        int iHashCode4 = (iHashCode3 + (linkText2 == null ? 0 : linkText2.hashCode())) * 31;
        List<PromotionItem> list = this.promotionItemList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        LinkText linkText3 = this.seeAll;
        return iHashCode5 + (linkText3 != null ? linkText3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponPromotion(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.subTitle);
        sbLIZ.append(", activityTermsApply=");
        sbLIZ.append(this.activityTermsApply);
        sbLIZ.append(", voucherTermsApply=");
        sbLIZ.append(this.voucherTermsApply);
        sbLIZ.append(", promotionItemList=");
        sbLIZ.append(this.promotionItemList);
        sbLIZ.append(", seeAll=");
        sbLIZ.append(this.seeAll);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        LinkText linkText = this.activityTermsApply;
        if (linkText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText.writeToParcel(parcel, i);
        }
        LinkText linkText2 = this.voucherTermsApply;
        if (linkText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText2.writeToParcel(parcel, i);
        }
        List<PromotionItem> list = this.promotionItemList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromotionItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        LinkText linkText3 = this.seeAll;
        if (linkText3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText3.writeToParcel(parcel, i);
        }
    }

    public CouponPromotion(String str, String str2, LinkText linkText, LinkText linkText2, List<PromotionItem> list, LinkText linkText3) {
        this.title = str;
        this.subTitle = str2;
        this.activityTermsApply = linkText;
        this.voucherTermsApply = linkText2;
        this.promotionItemList = list;
        this.seeAll = linkText3;
    }
}
