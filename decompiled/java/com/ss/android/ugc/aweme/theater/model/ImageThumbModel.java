package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.model.ImageThumbModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageThumbModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageThumbModel> CREATOR = new Parcelable.Creator<ImageThumbModel>() { // from class: X.02tt
        @Override // android.os.Parcelable.Creator
        public final ImageThumbModel createFromParcel(Parcel parcel) {
            return new ImageThumbModel(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageThumbModel[] newArray(int i) {
            return new ImageThumbModel[i];
        }
    };

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final String urlPrefix;

    public ImageThumbModel() {
        this(null, null, null, 7, null);
    }

    public final ImageThumbModel copy(String str, List<String> list, String str2) {
        return new ImageThumbModel(str, list, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageThumbModel)) {
            return false;
        }
        ImageThumbModel imageThumbModel = (ImageThumbModel) obj;
        return Intrinsics.LJFF(this.uri, imageThumbModel.uri) && Intrinsics.LJFF(this.urlList, imageThumbModel.urlList) && Intrinsics.LJFF(this.urlPrefix, imageThumbModel.urlPrefix);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.urlPrefix;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageThumbModel(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", urlPrefix=");
        sbLIZ.append(this.urlPrefix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
        parcel.writeString(this.urlPrefix);
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final String getUrlPrefix() {
        return this.urlPrefix;
    }

    public ImageThumbModel(String str, List<String> list, String str2) {
        this.uri = str;
        this.urlList = list;
        this.urlPrefix = str2;
    }

    public ImageThumbModel(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2);
    }
}
