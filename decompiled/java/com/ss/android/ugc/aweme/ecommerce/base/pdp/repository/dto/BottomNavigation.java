package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class BottomNavigation implements Parcelable {

    @C09CT("checkout_hint")
    public final String checkOutHint;

    @C09CT("bottom_nav_buttons")
    public final List<NavButton> items;
    public static final Parcelable.Creator<BottomNavigation> CREATOR = new Parcelable.Creator<BottomNavigation>() { // from class: X.0wQv
        @Override // android.os.Parcelable.Creator
        public final BottomNavigation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(NavButton.CREATOR.createFromParcel(parcel));
                }
            }
            return new BottomNavigation(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BottomNavigation[] newArray(int i) {
            return new BottomNavigation[i];
        }
    };
    public static final int $stable = 8;

    public BottomNavigation() {
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
        if (!(obj instanceof BottomNavigation)) {
            return false;
        }
        BottomNavigation bottomNavigation = (BottomNavigation) obj;
        return Intrinsics.LJFF(this.items, bottomNavigation.items) && Intrinsics.LJFF(this.checkOutHint, bottomNavigation.checkOutHint);
    }

    public final int hashCode() {
        List<NavButton> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.checkOutHint;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomNavigation(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", checkOutHint=");
        sbLIZ.append(this.checkOutHint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<NavButton> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<NavButton> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.checkOutHint);
    }

    public BottomNavigation(List<NavButton> list, String str) {
        this.items = list;
        this.checkOutHint = str;
    }
}
