package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionalInfoItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AdditionInfo implements Parcelable {

    @C09CT("info_items")
    public final List<AdditionalInfoItem> items;

    @C09CT("info_title")
    public final String title;

    @C09CT("type")
    public final Integer type;
    public static final Parcelable.Creator<AdditionInfo> CREATOR = new Parcelable.Creator<AdditionInfo>() { // from class: X.0mgU
        @Override // android.os.Parcelable.Creator
        public final AdditionInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AdditionalInfoItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new AdditionInfo(numValueOf, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionInfo[] newArray(int i) {
            return new AdditionInfo[i];
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
        if (!(obj instanceof AdditionInfo)) {
            return false;
        }
        AdditionInfo additionInfo = (AdditionInfo) obj;
        return Intrinsics.LJFF(this.type, additionInfo.type) && Intrinsics.LJFF(this.title, additionInfo.title) && Intrinsics.LJFF(this.items, additionInfo.items);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AdditionalInfoItem> list = this.items;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdditionInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.title);
        List<AdditionalInfoItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AdditionalInfoItem> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public AdditionInfo(Integer num, String str, List<AdditionalInfoItem> list) {
        this.type = num;
        this.title = str;
        this.items = list;
    }
}
