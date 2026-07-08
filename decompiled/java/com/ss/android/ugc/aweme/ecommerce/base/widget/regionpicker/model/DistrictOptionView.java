package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictOptionView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictOptionViewItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictOptionView implements Parcelable {

    @C09CT("view_items")
    public final List<DistrictOptionViewItem> viewItems;
    public static final Parcelable.Creator<DistrictOptionView> CREATOR = new Parcelable.Creator<DistrictOptionView>() { // from class: X.0vV2
        @Override // android.os.Parcelable.Creator
        public final DistrictOptionView createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DistrictOptionViewItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new DistrictOptionView(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DistrictOptionView[] newArray(int i) {
            return new DistrictOptionView[i];
        }
    };
    public static final int $stable = 8;

    public DistrictOptionView() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DistrictOptionView) && Intrinsics.LJFF(this.viewItems, ((DistrictOptionView) obj).viewItems);
    }

    public final int hashCode() {
        List<DistrictOptionViewItem> list = this.viewItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistrictOptionView(viewItems=");
        sbLIZ.append(this.viewItems);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DistrictOptionView(List<DistrictOptionViewItem> list) {
        this.viewItems = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<DistrictOptionViewItem> list = this.viewItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<DistrictOptionViewItem> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().text);
        }
    }
}
