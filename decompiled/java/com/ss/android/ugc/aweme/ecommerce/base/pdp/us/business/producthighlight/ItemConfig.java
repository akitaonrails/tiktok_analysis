package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.ItemConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.MaxWidthRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ItemConfig implements Parcelable {

    @C09CT("horizontal_max_display_lines")
    public final Integer horizontalMaxDisplayLines;

    @C09CT("horizontal_max_width_rules")
    public final List<MaxWidthRule> maxWidthRules;
    public static final Parcelable.Creator<ItemConfig> CREATOR = new Parcelable.Creator<ItemConfig>() { // from class: X.0mhJ
        @Override // android.os.Parcelable.Creator
        public final ItemConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MaxWidthRule.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new ItemConfig(arrayList, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemConfig[] newArray(int i) {
            return new ItemConfig[i];
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
        if (!(obj instanceof ItemConfig)) {
            return false;
        }
        ItemConfig itemConfig = (ItemConfig) obj;
        return Intrinsics.LJFF(this.maxWidthRules, itemConfig.maxWidthRules) && Intrinsics.LJFF(this.horizontalMaxDisplayLines, itemConfig.horizontalMaxDisplayLines);
    }

    public final int hashCode() {
        List<MaxWidthRule> list = this.maxWidthRules;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.horizontalMaxDisplayLines;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemConfig(maxWidthRules=");
        sbLIZ.append(this.maxWidthRules);
        sbLIZ.append(", horizontalMaxDisplayLines=");
        sbLIZ.append(this.horizontalMaxDisplayLines);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MaxWidthRule> list = this.maxWidthRules;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MaxWidthRule> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.horizontalMaxDisplayLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public ItemConfig(List<MaxWidthRule> list, Integer num) {
        this.maxWidthRules = list;
        this.horizontalMaxDisplayLines = num;
    }
}
