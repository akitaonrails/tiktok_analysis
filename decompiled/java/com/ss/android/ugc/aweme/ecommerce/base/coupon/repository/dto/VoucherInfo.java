package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherInfo implements Parcelable, Serializable {

    @C09CT("best_voucher_type_ids")
    public final List<String> bestVoucherTypeIds;

    @C09CT("coupon_schema")
    public final String coupon_schema;

    @C09CT("lowest_price")
    public final Price lowestPrice;

    @C09CT("vouchers")
    public List<Voucher> vouchers;
    public static final Parcelable.Creator<VoucherInfo> CREATOR = new Parcelable.Creator<VoucherInfo>() { // from class: X.02oU
        @Override // android.os.Parcelable.Creator
        public final VoucherInfo createFromParcel(Parcel parcel) {
            Price priceCreateFromParcel;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                priceCreateFromParcel = null;
            } else {
                priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            }
            Price price = priceCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Voucher.CREATOR.createFromParcel(parcel));
                }
            }
            return new VoucherInfo(price, arrayList, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherInfo[] newArray(int i) {
            return new VoucherInfo[i];
        }
    };
    public static final int $stable = 8;

    public VoucherInfo() {
        this(null, null, null, null);
    }

    public final VoucherInfo copy(Price price, List<Voucher> list, List<String> list2, String str) {
        return new VoucherInfo(price, list, list2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return Intrinsics.LJFF(this.lowestPrice, voucherInfo.lowestPrice) && Intrinsics.LJFF(this.vouchers, voucherInfo.vouchers) && Intrinsics.LJFF(this.bestVoucherTypeIds, voucherInfo.bestVoucherTypeIds) && Intrinsics.LJFF(this.coupon_schema, voucherInfo.coupon_schema);
    }

    public int hashCode() {
        Price price = this.lowestPrice;
        int iHashCode = (price == null ? 0 : price.hashCode()) * 31;
        List<Voucher> list = this.vouchers;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.bestVoucherTypeIds;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.coupon_schema;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherInfo(lowestPrice=");
        sbLIZ.append(this.lowestPrice);
        sbLIZ.append(", vouchers=");
        sbLIZ.append(this.vouchers);
        sbLIZ.append(", bestVoucherTypeIds=");
        sbLIZ.append(this.bestVoucherTypeIds);
        sbLIZ.append(", coupon_schema=");
        sbLIZ.append(this.coupon_schema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Price price = this.lowestPrice;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
        List<Voucher> list = this.vouchers;
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
        parcel.writeStringList(this.bestVoucherTypeIds);
        parcel.writeString(this.coupon_schema);
    }

    public final List<String> getBestVoucherTypeIds() {
        return this.bestVoucherTypeIds;
    }

    public final String getCoupon_schema() {
        return this.coupon_schema;
    }

    public final Price getLowestPrice() {
        return this.lowestPrice;
    }

    public final List<Voucher> getVouchers() {
        return this.vouchers;
    }

    public final void setVouchers(List<Voucher> list) {
        this.vouchers = list;
    }

    public VoucherInfo(Price price, List<Voucher> list, List<String> list2, String str) {
        this.lowestPrice = price;
        this.vouchers = list;
        this.bestVoucherTypeIds = list2;
        this.coupon_schema = str;
    }
}
