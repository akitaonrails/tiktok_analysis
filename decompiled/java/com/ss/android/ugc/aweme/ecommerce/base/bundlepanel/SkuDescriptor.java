package com.ss.android.ugc.aweme.ecommerce.base.bundlepanel;

import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C2188811AlT;
import X.C770702zh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.SkuDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuDescriptor implements Parcelable {

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sub_product_prop_value_ids")
    public final List<List<String>> subProductPropIds;
    public static final Parcelable.Creator<SkuDescriptor> CREATOR = new Parcelable.Creator<SkuDescriptor>() { // from class: X.03yn
        @Override // android.os.Parcelable.Creator
        public final SkuDescriptor createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.createStringArrayList());
                }
            }
            return new SkuDescriptor(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkuDescriptor[] newArray(int i) {
            return new SkuDescriptor[i];
        }
    };
    public static final int $stable = 8;

    public SkuDescriptor() {
        this(null, "");
    }

    public final SkuDescriptor copy(List<? extends List<String>> list, String str) {
        return new SkuDescriptor(list, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDescriptor)) {
            return false;
        }
        SkuDescriptor skuDescriptor = (SkuDescriptor) obj;
        return Intrinsics.LJFF(this.subProductPropIds, skuDescriptor.subProductPropIds) && Intrinsics.LJFF(this.skuId, skuDescriptor.skuId);
    }

    public int hashCode() {
        List<List<String>> list = this.subProductPropIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.skuId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuDescriptor(subProductPropIds=");
        sbLIZ.append(this.subProductPropIds);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<List<String>> list = this.subProductPropIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<List<String>> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeStringList(it2.next());
            }
        }
        parcel.writeString(this.skuId);
    }

    public final SkuDescriptor deepCopy() {
        ArrayList arrayList;
        List<List<String>> list = this.subProductPropIds;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<List<String>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C13LP.LLIIII(it2.next()));
            }
        } else {
            arrayList = null;
        }
        return new SkuDescriptor(arrayList, this.skuId);
    }

    public final boolean hasAllPropsSelected() {
        List<List<String>> list = this.subProductPropIds;
        if (list == null) {
            return false;
        }
        if (!list.isEmpty()) {
            for (List<String> list2 : list) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (!C770702zh.LIZIZ(it2.next())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final List<List<String>> getSubProductPropIds() {
        return this.subProductPropIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkuDescriptor(List<? extends List<String>> list, String str) {
        this.subProductPropIds = list;
        this.skuId = str;
    }
}
