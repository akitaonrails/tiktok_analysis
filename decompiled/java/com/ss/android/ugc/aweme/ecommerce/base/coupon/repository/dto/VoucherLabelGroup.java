package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabel;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherLabelGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherLabelGroup implements Parcelable, Serializable {

    @C09CT("position")
    public Integer position;

    @C09CT("voucher_label_list")
    public List<VoucherLabel> voucherLabelList;
    public static final Parcelable.Creator<VoucherLabelGroup> CREATOR = new Parcelable.Creator<VoucherLabelGroup>() { // from class: X.02aB
        @Override // android.os.Parcelable.Creator
        public final VoucherLabelGroup createFromParcel(Parcel parcel) {
            Integer numValueOf;
            VoucherLabel voucherLabelCreateFromParcel;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    if (parcel.readInt() == 0) {
                        voucherLabelCreateFromParcel = null;
                    } else {
                        voucherLabelCreateFromParcel = VoucherLabel.CREATOR.createFromParcel(parcel);
                    }
                    arrayList2.add(voucherLabelCreateFromParcel);
                }
                arrayList = arrayList2;
            }
            return new VoucherLabelGroup(numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VoucherLabelGroup[] newArray(int i) {
            return new VoucherLabelGroup[i];
        }
    };
    public static final int $stable = 8;

    public VoucherLabelGroup() {
        this(0, null);
    }

    public final VoucherLabelGroup copy(Integer num, List<VoucherLabel> list) {
        return new VoucherLabelGroup(num, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherLabelGroup)) {
            return false;
        }
        VoucherLabelGroup voucherLabelGroup = (VoucherLabelGroup) obj;
        return Intrinsics.LJFF(this.position, voucherLabelGroup.position) && Intrinsics.LJFF(this.voucherLabelList, voucherLabelGroup.voucherLabelList);
    }

    public int hashCode() {
        Integer num = this.position;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VoucherLabel> list = this.voucherLabelList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherLabelGroup(position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", voucherLabelList=");
        sbLIZ.append(this.voucherLabelList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<VoucherLabel> list = this.voucherLabelList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (VoucherLabel voucherLabel : list) {
            if (voucherLabel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                voucherLabel.writeToParcel(parcel, i);
            }
        }
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final List<VoucherLabel> getVoucherLabelList() {
        return this.voucherLabelList;
    }

    public VoucherLabelGroup(Integer num, List<VoucherLabel> list) {
        this.position = num;
        this.voucherLabelList = list;
    }
}
