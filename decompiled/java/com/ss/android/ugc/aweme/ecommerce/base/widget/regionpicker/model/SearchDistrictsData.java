package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchDistrictsData implements Parcelable {

    @C09CT("districts")
    public final List<District> districts;

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;
    public static final Parcelable.Creator<SearchDistrictsData> CREATOR = new Parcelable.Creator<SearchDistrictsData>() { // from class: X.03uJ
        @Override // android.os.Parcelable.Creator
        public final SearchDistrictsData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(District.CREATOR.createFromParcel(parcel));
                }
            }
            return new SearchDistrictsData(arrayList, (ExceptionUX) parcel.readParcelable(SearchDistrictsData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchDistrictsData[] newArray(int i) {
            return new SearchDistrictsData[i];
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
        if (!(obj instanceof SearchDistrictsData)) {
            return false;
        }
        SearchDistrictsData searchDistrictsData = (SearchDistrictsData) obj;
        return Intrinsics.LJFF(this.districts, searchDistrictsData.districts) && Intrinsics.LJFF(this.exceptionUX, searchDistrictsData.exceptionUX);
    }

    public final int hashCode() {
        List<District> list = this.districts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        return iHashCode + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDistrictsData(districts=");
        sbLIZ.append(this.districts);
        sbLIZ.append(", exceptionUX=");
        sbLIZ.append(this.exceptionUX);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<District> list = this.districts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<District> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.exceptionUX, i);
    }

    public SearchDistrictsData(List<District> list, ExceptionUX exceptionUX) {
        this.districts = list;
        this.exceptionUX = exceptionUX;
    }
}
