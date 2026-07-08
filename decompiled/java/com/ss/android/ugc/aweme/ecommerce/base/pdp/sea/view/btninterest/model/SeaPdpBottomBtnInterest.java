package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterestItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBtnInterest implements Parcelable {

    @C09CT("desc")
    public final List<SeaPdpBottomBtnInterestItem> desc;

    @C09CT("sub_desc")
    public final List<SeaPdpBottomBtnInterestItem> subDesc;
    public static final Parcelable.Creator<SeaPdpBottomBtnInterest> CREATOR = new Parcelable.Creator<SeaPdpBottomBtnInterest>() { // from class: X.0460
        @Override // android.os.Parcelable.Creator
        public final SeaPdpBottomBtnInterest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItemCreateFromParcel;
            SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItemCreateFromParcel2;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    if (parcel.readInt() == 0) {
                        seaPdpBottomBtnInterestItemCreateFromParcel = null;
                    } else {
                        seaPdpBottomBtnInterestItemCreateFromParcel = SeaPdpBottomBtnInterestItem.CREATOR.createFromParcel(parcel);
                    }
                    arrayList.add(seaPdpBottomBtnInterestItemCreateFromParcel);
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    if (parcel.readInt() == 0) {
                        seaPdpBottomBtnInterestItemCreateFromParcel2 = null;
                    } else {
                        seaPdpBottomBtnInterestItemCreateFromParcel2 = SeaPdpBottomBtnInterestItem.CREATOR.createFromParcel(parcel);
                    }
                    arrayList3.add(seaPdpBottomBtnInterestItemCreateFromParcel2);
                }
                arrayList2 = arrayList3;
            }
            return new SeaPdpBottomBtnInterest(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpBottomBtnInterest[] newArray(int i) {
            return new SeaPdpBottomBtnInterest[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpBottomBtnInterest() {
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
        if (!(obj instanceof SeaPdpBottomBtnInterest)) {
            return false;
        }
        SeaPdpBottomBtnInterest seaPdpBottomBtnInterest = (SeaPdpBottomBtnInterest) obj;
        return Intrinsics.LJFF(this.desc, seaPdpBottomBtnInterest.desc) && Intrinsics.LJFF(this.subDesc, seaPdpBottomBtnInterest.subDesc);
    }

    public final int hashCode() {
        List<SeaPdpBottomBtnInterestItem> list = this.desc;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SeaPdpBottomBtnInterestItem> list2 = this.subDesc;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBtnInterest(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", subDesc=");
        sbLIZ.append(this.subDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SeaPdpBottomBtnInterestItem> list = this.desc;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItem : list) {
                if (seaPdpBottomBtnInterestItem == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    seaPdpBottomBtnInterestItem.writeToParcel(parcel, i);
                }
            }
        }
        List<SeaPdpBottomBtnInterestItem> list2 = this.subDesc;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        for (SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItem2 : list2) {
            if (seaPdpBottomBtnInterestItem2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                seaPdpBottomBtnInterestItem2.writeToParcel(parcel, i);
            }
        }
    }

    public SeaPdpBottomBtnInterest(List<SeaPdpBottomBtnInterestItem> list, List<SeaPdpBottomBtnInterestItem> list2) {
        this.desc = list;
        this.subDesc = list2;
    }
}
