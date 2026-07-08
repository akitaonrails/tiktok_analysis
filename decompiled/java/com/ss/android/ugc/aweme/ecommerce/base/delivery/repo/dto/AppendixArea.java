package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.AppendixArea;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AppendixArea implements Parcelable {

    @C09CT("additional_logistics_descriptions")
    public List<ECRichText> additionalLogisticsDescriptions;
    public static final Parcelable.Creator<AppendixArea> CREATOR = new Parcelable.Creator<AppendixArea>() { // from class: X.02ku
        @Override // android.os.Parcelable.Creator
        public final AppendixArea createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(AppendixArea.class.getClassLoader()));
                }
            }
            return new AppendixArea(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppendixArea[] newArray(int i) {
            return new AppendixArea[i];
        }
    };
    public static final int $stable = 8;

    public AppendixArea() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppendixArea) && Intrinsics.LJFF(this.additionalLogisticsDescriptions, ((AppendixArea) obj).additionalLogisticsDescriptions);
    }

    public final int hashCode() {
        List<ECRichText> list = this.additionalLogisticsDescriptions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppendixArea(additionalLogisticsDescriptions=");
        sbLIZ.append(this.additionalLogisticsDescriptions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ECRichText> list = this.additionalLogisticsDescriptions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<ECRichText> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public AppendixArea(List<ECRichText> list) {
        this.additionalLogisticsDescriptions = list;
    }
}
