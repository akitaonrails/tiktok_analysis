package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.model.CoverModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CoverModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverModel> CREATOR = new Parcelable.Creator<CoverModel>() { // from class: X.02tV
        @Override // android.os.Parcelable.Creator
        public final CoverModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new CoverModel(numValueOf, arrayListCreateStringArrayList, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CoverModel[] newArray(int i) {
            return new CoverModel[i];
        }
    };

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;

    public CoverModel() {
        this(null, null, null, null, 15, null);
    }

    public final CoverModel copy(Integer num, List<String> list, Integer num2, String str) {
        return new CoverModel(num, list, num2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverModel)) {
            return false;
        }
        CoverModel coverModel = (CoverModel) obj;
        return Intrinsics.LJFF(this.width, coverModel.width) && Intrinsics.LJFF(this.urlList, coverModel.urlList) && Intrinsics.LJFF(this.height, coverModel.height) && Intrinsics.LJFF(this.uri, coverModel.uri);
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.uri;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoverModel(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.urlList);
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.uri);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public CoverModel(Integer num, List<String> list, Integer num2, String str) {
        this.width = num;
        this.urlList = list;
        this.height = num2;
        this.uri = str;
    }

    public CoverModel(Integer num, List list, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? null : str);
    }
}
