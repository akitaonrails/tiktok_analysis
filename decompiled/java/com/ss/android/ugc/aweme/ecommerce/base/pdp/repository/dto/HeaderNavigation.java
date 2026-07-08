package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderNavigation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NavButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class HeaderNavigation implements Parcelable {

    @C09CT("header_nav_buttons")
    public final List<NavButton> headerNavButtons;

    @C09CT("more_buttons")
    public final List<NavButton> moreButtons;
    public static final Parcelable.Creator<HeaderNavigation> CREATOR = new Parcelable.Creator<HeaderNavigation>() { // from class: X.0wQw
        @Override // android.os.Parcelable.Creator
        public final HeaderNavigation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(NavButton.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(NavButton.CREATOR.createFromParcel(parcel));
                }
            }
            return new HeaderNavigation(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderNavigation[] newArray(int i) {
            return new HeaderNavigation[i];
        }
    };
    public static final int $stable = 8;

    public HeaderNavigation() {
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
        if (!(obj instanceof HeaderNavigation)) {
            return false;
        }
        HeaderNavigation headerNavigation = (HeaderNavigation) obj;
        return Intrinsics.LJFF(this.headerNavButtons, headerNavigation.headerNavButtons) && Intrinsics.LJFF(this.moreButtons, headerNavigation.moreButtons);
    }

    public final int hashCode() {
        List<NavButton> list = this.headerNavButtons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NavButton> list2 = this.moreButtons;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HeaderNavigation(headerNavButtons=");
        sbLIZ.append(this.headerNavButtons);
        sbLIZ.append(", moreButtons=");
        sbLIZ.append(this.moreButtons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<NavButton> list = this.headerNavButtons;
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
        List<NavButton> list2 = this.moreButtons;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<NavButton> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public HeaderNavigation(List<NavButton> list, List<NavButton> list2) {
        this.headerNavButtons = list;
        this.moreButtons = list2;
    }
}
