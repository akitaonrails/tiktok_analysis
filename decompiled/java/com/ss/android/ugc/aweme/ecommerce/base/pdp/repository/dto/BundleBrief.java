package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleBrief implements Parcelable {

    @C09CT("bundle_id_list")
    public final List<String> bundleIdList;

    @C09CT("position")
    public final Integer position;
    public static final Parcelable.Creator<BundleBrief> CREATOR = new Parcelable.Creator<BundleBrief>() { // from class: X.03yx
        @Override // android.os.Parcelable.Creator
        public final BundleBrief createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BundleBrief(arrayListCreateStringArrayList, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BundleBrief[] newArray(int i) {
            return new BundleBrief[i];
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
        if (!(obj instanceof BundleBrief)) {
            return false;
        }
        BundleBrief bundleBrief = (BundleBrief) obj;
        return Intrinsics.LJFF(this.bundleIdList, bundleBrief.bundleIdList) && Intrinsics.LJFF(this.position, bundleBrief.position);
    }

    public final int hashCode() {
        List<String> list = this.bundleIdList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.position;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BundleBrief(bundleIdList=");
        sbLIZ.append(this.bundleIdList);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeStringList(this.bundleIdList);
        Integer num = this.position;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public BundleBrief(List<String> list, Integer num) {
        this.bundleIdList = list;
        this.position = num;
    }
}
