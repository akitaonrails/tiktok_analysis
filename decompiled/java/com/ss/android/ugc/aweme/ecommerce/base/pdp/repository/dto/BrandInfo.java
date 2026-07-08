package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrandInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BrandInfo implements Parcelable {

    @C09CT("brand_labels")
    public final List<StoreLabel> brandLabels;

    @C09CT("prefix")
    public final String prefix;
    public static final Parcelable.Creator<BrandInfo> CREATOR = new Parcelable.Creator<BrandInfo>() { // from class: X.02p8
        @Override // android.os.Parcelable.Creator
        public final BrandInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(BrandInfo.class.getClassLoader()));
                }
            }
            return new BrandInfo(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BrandInfo[] newArray(int i) {
            return new BrandInfo[i];
        }
    };
    public static final int $stable = 8;

    public BrandInfo() {
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
        if (!(obj instanceof BrandInfo)) {
            return false;
        }
        BrandInfo brandInfo = (BrandInfo) obj;
        return Intrinsics.LJFF(this.prefix, brandInfo.prefix) && Intrinsics.LJFF(this.brandLabels, brandInfo.brandLabels);
    }

    public final int hashCode() {
        String str = this.prefix;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<StoreLabel> list = this.brandLabels;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BrandInfo(prefix=");
        sbLIZ.append(this.prefix);
        sbLIZ.append(", brandLabels=");
        sbLIZ.append(this.brandLabels);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.prefix);
        List<StoreLabel> list = this.brandLabels;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<StoreLabel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public BrandInfo(String str, List<StoreLabel> list) {
        this.prefix = str;
        this.brandLabels = list;
    }
}
