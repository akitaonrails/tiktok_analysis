package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DescDetailV2 implements Parcelable {

    @C09CT("rich_blocks")
    public final List<RichBlock> richBlocks;
    public static final Parcelable.Creator<DescDetailV2> CREATOR = new Parcelable.Creator<DescDetailV2>() { // from class: X.0mg2
        @Override // android.os.Parcelable.Creator
        public final DescDetailV2 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RichBlock.CREATOR.createFromParcel(parcel));
                }
            }
            return new DescDetailV2(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DescDetailV2[] newArray(int i) {
            return new DescDetailV2[i];
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
        return (obj instanceof DescDetailV2) && Intrinsics.LJFF(this.richBlocks, ((DescDetailV2) obj).richBlocks);
    }

    public final int hashCode() {
        List<RichBlock> list = this.richBlocks;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescDetailV2(richBlocks=");
        sbLIZ.append(this.richBlocks);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<RichBlock> list = this.richBlocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<RichBlock> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public DescDetailV2(List<RichBlock> list) {
        this.richBlocks = list;
    }
}
