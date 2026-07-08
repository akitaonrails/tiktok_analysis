package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PortraitUrlModel implements Parcelable {
    public static final Parcelable.Creator<PortraitUrlModel> CREATOR = new Parcelable.Creator<PortraitUrlModel>() { // from class: X.0MXt
        @Override // android.os.Parcelable.Creator
        public final PortraitUrlModel createFromParcel(Parcel parcel) {
            return new PortraitUrlModel(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final PortraitUrlModel[] newArray(int i) {
            return new PortraitUrlModel[i];
        }
    };

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("url_prefix")
    public final List<String> urlPrefix;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PortraitUrlModel)) {
            return false;
        }
        PortraitUrlModel portraitUrlModel = (PortraitUrlModel) obj;
        return Intrinsics.LJFF(this.uri, portraitUrlModel.uri) && Intrinsics.LJFF(this.urlList, portraitUrlModel.urlList) && Intrinsics.LJFF(this.urlPrefix, portraitUrlModel.urlPrefix);
    }

    public final int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.urlPrefix;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PortraitUrlModel(uri=");
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
        parcel.writeStringList(this.urlPrefix);
    }

    public PortraitUrlModel(String str, List<String> list, List<String> list2) {
        this.uri = str;
        this.urlList = list;
        this.urlPrefix = list2;
    }
}
