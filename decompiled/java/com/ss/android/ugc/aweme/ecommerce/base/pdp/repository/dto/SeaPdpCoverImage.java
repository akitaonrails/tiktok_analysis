package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPdpCoverImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpCoverImage implements Parcelable {

    @C09CT("height")
    public final Integer height;

    @C09CT("uri")
    public final String uri;

    @C09CT("url_list")
    public final List<String> urlList;

    @C09CT("width")
    public final Integer width;
    public static final Parcelable.Creator<SeaPdpCoverImage> CREATOR = new Parcelable.Creator<SeaPdpCoverImage>() { // from class: X.02vw
        @Override // android.os.Parcelable.Creator
        public final SeaPdpCoverImage createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new SeaPdpCoverImage(numValueOf, string, arrayListCreateStringArrayList, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpCoverImage[] newArray(int i) {
            return new SeaPdpCoverImage[i];
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
        if (!(obj instanceof SeaPdpCoverImage)) {
            return false;
        }
        SeaPdpCoverImage seaPdpCoverImage = (SeaPdpCoverImage) obj;
        return Intrinsics.LJFF(this.height, seaPdpCoverImage.height) && Intrinsics.LJFF(this.uri, seaPdpCoverImage.uri) && Intrinsics.LJFF(this.urlList, seaPdpCoverImage.urlList) && Intrinsics.LJFF(this.width, seaPdpCoverImage.width);
    }

    public final int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.urlList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.width;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpCoverImage(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public SeaPdpCoverImage(Integer num, String str, List<String> list, Integer num2) {
        this.height = num;
        this.uri = str;
        this.urlList = list;
        this.width = num2;
    }
}
