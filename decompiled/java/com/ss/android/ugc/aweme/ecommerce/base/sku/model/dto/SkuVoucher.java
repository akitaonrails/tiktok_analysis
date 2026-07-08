package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuVoucher implements Parcelable {

    @C09CT("best_voucher_metas")
    public List<VoucherMeta> bestVoucherMetas;

    @C09CT("best_voucher_type_ids")
    public List<String> bestVoucherTypeIds;
    public static final Parcelable.Creator<SkuVoucher> CREATOR = new Parcelable.Creator<SkuVoucher>() { // from class: X.02lg
        @Override // android.os.Parcelable.Creator
        public final SkuVoucher createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(VoucherMeta.CREATOR.createFromParcel(parcel));
                }
            }
            return new SkuVoucher(arrayListCreateStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuVoucher[] newArray(int i) {
            return new SkuVoucher[i];
        }
    };
    public static final int $stable = 8;

    public SkuVoucher() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuVoucher)) {
            return false;
        }
        SkuVoucher skuVoucher = (SkuVoucher) obj;
        return Intrinsics.LJFF(this.bestVoucherTypeIds, skuVoucher.bestVoucherTypeIds) && Intrinsics.LJFF(this.bestVoucherMetas, skuVoucher.bestVoucherMetas);
    }

    public final int hashCode() {
        List<String> list = this.bestVoucherTypeIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<VoucherMeta> list2 = this.bestVoucherMetas;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuVoucher(bestVoucherTypeIds=");
        sbLIZ.append(this.bestVoucherTypeIds);
        sbLIZ.append(", bestVoucherMetas=");
        sbLIZ.append(this.bestVoucherMetas);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.bestVoucherTypeIds);
        List<VoucherMeta> list = this.bestVoucherMetas;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<VoucherMeta> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public SkuVoucher(List<String> list, List<VoucherMeta> list2) {
        this.bestVoucherTypeIds = list;
        this.bestVoucherMetas = list2;
    }
}
