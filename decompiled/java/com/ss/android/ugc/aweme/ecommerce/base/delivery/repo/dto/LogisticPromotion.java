package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticItem;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticPromotion implements Parcelable {

    @C09CT("background_image")
    public Icon background;

    @C09CT("items")
    public List<LogisticItem> items;

    @C09CT("promotion_tips")
    public String tips;
    public static final Parcelable.Creator<LogisticPromotion> CREATOR = new Parcelable.Creator<LogisticPromotion>() { // from class: X.02mU
        @Override // android.os.Parcelable.Creator
        public final LogisticPromotion createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(LogisticItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new LogisticPromotion(arrayList, parcel.readString(), (Icon) parcel.readParcelable(LogisticPromotion.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticPromotion[] newArray(int i) {
            return new LogisticPromotion[i];
        }
    };
    public static final int $stable = 8;

    public LogisticPromotion() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticPromotion)) {
            return false;
        }
        LogisticPromotion logisticPromotion = (LogisticPromotion) obj;
        return Intrinsics.LJFF(this.items, logisticPromotion.items) && Intrinsics.LJFF(this.tips, logisticPromotion.tips) && Intrinsics.LJFF(this.background, logisticPromotion.background);
    }

    public final int hashCode() {
        List<LogisticItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.tips;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.background;
        return iHashCode2 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticPromotion(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", background=");
        sbLIZ.append(this.background);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<LogisticItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<LogisticItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.tips);
        parcel.writeParcelable(this.background, i);
    }

    public LogisticPromotion(List<LogisticItem> list, String str, Icon icon) {
        this.items = list;
        this.tips = str;
        this.background = icon;
    }
}
