package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageThumb implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageThumb> CREATOR = new Creator();

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    public static final class Creator implements Parcelable.Creator<ImageThumb> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageThumb createFromParcel(Parcel parcel) {
            return new ImageThumb(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageThumb[] newArray(int i) {
            return new ImageThumb[i];
        }
    }

    public ImageThumb() {
    }

    public final ImageThumb copy(String str, List<String> list) {
        return new ImageThumb(str, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageThumb)) {
            return false;
        }
        ImageThumb imageThumb = (ImageThumb) obj;
        return Intrinsics.LJFF(this.uri, imageThumb.uri) && Intrinsics.LJFF(this.urlList, imageThumb.urlList);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageThumb(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public ImageThumb(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
