package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C736602uC;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionDiscount implements Parcelable {
    public static final int DEFAULT = 0;

    @C09CT("default_voucher_type_ids")
    public final List<String> defaultVoucherTypeIds;

    @C09CT("discount_price")
    public final String discountPrice;

    @C09CT("discounts")
    public List<Voucher> discounts;

    @C09CT("pdp_coupon_module_style")
    public final Integer pdpCouponModuleStyle;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("schema")
    public final String schema;

    @C09CT("pdp_coupon_module_claim_style")
    public final Integer style;

    @C09CT("title")
    public final String title;
    public static final C736602uC DiscountScene = new Object() { // from class: X.02uC
    };
    public static final Parcelable.Creator<PromotionDiscount> CREATOR = new Parcelable.Creator<PromotionDiscount>() { // from class: X.02uA
        @Override // android.os.Parcelable.Creator
        public final PromotionDiscount createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Voucher.CREATOR.createFromParcel(parcel));
                }
            }
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
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new PromotionDiscount(string, string2, string3, arrayList, numValueOf, numValueOf2, arrayListCreateStringArrayList, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionDiscount[] newArray(int i) {
            return new PromotionDiscount[i];
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
        if (!(obj instanceof PromotionDiscount)) {
            return false;
        }
        PromotionDiscount promotionDiscount = (PromotionDiscount) obj;
        return Intrinsics.LJFF(this.title, promotionDiscount.title) && Intrinsics.LJFF(this.schema, promotionDiscount.schema) && Intrinsics.LJFF(this.discountPrice, promotionDiscount.discountPrice) && Intrinsics.LJFF(this.discounts, promotionDiscount.discounts) && Intrinsics.LJFF(this.scene, promotionDiscount.scene) && Intrinsics.LJFF(this.style, promotionDiscount.style) && Intrinsics.LJFF(this.defaultVoucherTypeIds, promotionDiscount.defaultVoucherTypeIds) && Intrinsics.LJFF(this.pdpCouponModuleStyle, promotionDiscount.pdpCouponModuleStyle);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schema;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discountPrice;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Voucher> list = this.discounts;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.scene;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.style;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.defaultVoucherTypeIds;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.pdpCouponModuleStyle;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionDiscount(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", discountPrice=");
        sbLIZ.append(this.discountPrice);
        sbLIZ.append(", discounts=");
        sbLIZ.append(this.discounts);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", defaultVoucherTypeIds=");
        sbLIZ.append(this.defaultVoucherTypeIds);
        sbLIZ.append(", pdpCouponModuleStyle=");
        sbLIZ.append(this.pdpCouponModuleStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.schema);
        parcel.writeString(this.discountPrice);
        List<Voucher> list = this.discounts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Voucher> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.scene;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.style;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeStringList(this.defaultVoucherTypeIds);
        Integer num3 = this.pdpCouponModuleStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public PromotionDiscount(String str, String str2, String str3, List<Voucher> list, Integer num, Integer num2, List<String> list2, Integer num3) {
        this.title = str;
        this.schema = str2;
        this.discountPrice = str3;
        this.discounts = list;
        this.scene = num;
        this.style = num2;
        this.defaultVoucherTypeIds = list2;
        this.pdpCouponModuleStyle = num3;
    }
}
