package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C748002w2;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuInfo implements Parcelable {

    @C09CT("sale_props")
    public final List<SaleProp> salePropList;

    @C09CT("sku_common_config")
    public final SkuCommonConfig skuCommonConfig;

    @C09CT("skus")
    public final List<SkuItem> skuList;
    public static final Parcelable.Creator<SkuInfo> CREATOR = new Parcelable.Creator<SkuInfo>() { // from class: X.02w1
        @Override // android.os.Parcelable.Creator
        public final SkuInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            SkuCommonConfig skuCommonConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SkuItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SaleProp.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                skuCommonConfigCreateFromParcel = SkuCommonConfig.CREATOR.createFromParcel(parcel);
            }
            return new SkuInfo(arrayList, arrayList2, skuCommonConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SkuInfo[] newArray(int i) {
            return new SkuInfo[i];
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
        if (!(obj instanceof SkuInfo)) {
            return false;
        }
        SkuInfo skuInfo = (SkuInfo) obj;
        return Intrinsics.LJFF(this.skuList, skuInfo.skuList) && Intrinsics.LJFF(this.salePropList, skuInfo.salePropList) && Intrinsics.LJFF(this.skuCommonConfig, skuInfo.skuCommonConfig);
    }

    public final int hashCode() {
        List<SkuItem> list = this.skuList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SaleProp> list2 = this.salePropList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        return iHashCode2 + (skuCommonConfig != null ? skuCommonConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuInfo(skuList=");
        sbLIZ.append(this.skuList);
        sbLIZ.append(", salePropList=");
        sbLIZ.append(this.salePropList);
        sbLIZ.append(", skuCommonConfig=");
        sbLIZ.append(this.skuCommonConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SkuItem> list = this.skuList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SkuItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<SaleProp> list2 = this.salePropList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<SaleProp> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        if (skuCommonConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            skuCommonConfig.writeToParcel(parcel, i);
        }
    }

    public final boolean LIZ(Integer num) {
        List<SkuItem> list;
        if (!C748002w2.LIZ(num) || (list = this.skuList) == null || list.isEmpty() || ((SkuItem) ListProtector.get(this.skuList, 0)).originalImage == null) {
            return false;
        }
        return true;
    }

    public SkuInfo(List<SkuItem> list, List<SaleProp> list2, SkuCommonConfig skuCommonConfig) {
        this.skuList = list;
        this.salePropList = list2;
        this.skuCommonConfig = skuCommonConfig;
    }
}
