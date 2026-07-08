package com.bytedance.android.livesdk.model.message.ext;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GImage implements Serializable, Parcelable {
    public static final Parcelable.Creator<GImage> CREATOR = new Parcelable.Creator<GImage>() { // from class: X.02Xa
        @Override // android.os.Parcelable.Creator
        public final GImage createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new GImage(numValueOf, numValueOf2, parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final GImage[] newArray(int i) {
            return new GImage[i];
        }
    };

    @C09CT("height")
    public Integer height;

    @C09CT("mimetype")
    public String mimetype;

    @C09CT("thumb_uri")
    public String thumbUri;

    @C09CT("thumb_url_list")
    public List<String> thumbUrls;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urls;

    @C09CT("width")
    public Integer width;

    public GImage() {
    }

    public final GImage copy(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        return new GImage(num, num2, str, str2, list, str3, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GImage)) {
            return false;
        }
        GImage gImage = (GImage) obj;
        return Intrinsics.LJFF(this.width, gImage.width) && Intrinsics.LJFF(this.height, gImage.height) && Intrinsics.LJFF(this.mimetype, gImage.mimetype) && Intrinsics.LJFF(this.uri, gImage.uri) && Intrinsics.LJFF(this.urls, gImage.urls) && Intrinsics.LJFF(this.thumbUri, gImage.thumbUri) && Intrinsics.LJFF(this.thumbUrls, gImage.thumbUrls);
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.mimetype;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uri;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.urls;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.thumbUri;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.thumbUrls;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GImage(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", mimetype=");
        sbLIZ.append(this.mimetype);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urls=");
        sbLIZ.append(this.urls);
        sbLIZ.append(", thumbUri=");
        sbLIZ.append(this.thumbUri);
        sbLIZ.append(", thumbUrls=");
        sbLIZ.append(this.thumbUrls);
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
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.mimetype);
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urls);
        parcel.writeString(this.thumbUri);
        parcel.writeStringList(this.thumbUrls);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getMimetype() {
        return this.mimetype;
    }

    public final String getThumbUri() {
        return this.thumbUri;
    }

    public final List<String> getThumbUrls() {
        return this.thumbUrls;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public GImage(Integer num, Integer num2, String str, String str2, List<String> list, String str3, List<String> list2) {
        this.width = num;
        this.height = num2;
        this.mimetype = str;
        this.uri = str2;
        this.urls = list;
        this.thumbUri = str3;
        this.thumbUrls = list2;
    }
}
