package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentArea;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpComponentArea implements Parcelable {

    @C09CT("components")
    public final List<PdpComponent> components;

    @C09CT("container_alignment")
    public final Integer containerAlignment;
    public static final Parcelable.Creator<PdpComponentArea> CREATOR = new Parcelable.Creator<PdpComponentArea>() { // from class: X.0vtY
        @Override // android.os.Parcelable.Creator
        public final PdpComponentArea createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PdpComponent.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new PdpComponentArea(arrayList, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PdpComponentArea[] newArray(int i) {
            return new PdpComponentArea[i];
        }
    };
    public static final int $stable = 8;

    public PdpComponentArea() {
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
        if (!(obj instanceof PdpComponentArea)) {
            return false;
        }
        PdpComponentArea pdpComponentArea = (PdpComponentArea) obj;
        return Intrinsics.LJFF(this.components, pdpComponentArea.components) && Intrinsics.LJFF(this.containerAlignment, pdpComponentArea.containerAlignment);
    }

    public final int hashCode() {
        List<PdpComponent> list = this.components;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.containerAlignment;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpComponentArea(components=");
        sbLIZ.append(this.components);
        sbLIZ.append(", containerAlignment=");
        sbLIZ.append(this.containerAlignment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<PdpComponent> list = this.components;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PdpComponent> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.containerAlignment;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public PdpComponentArea(List<PdpComponent> list, Integer num) {
        this.components = list;
        this.containerAlignment = num;
    }
}
