package com.ss.android.ugc.aweme.cutsame;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.SimpleImage;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SimpleImage implements Parcelable {

    @C09CT("height")
    public int height;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public int width;
    public static final Parcelable.Creator<SimpleImage> CREATOR = new Parcelable.Creator<SimpleImage>() { // from class: X.0mvj
        @Override // android.os.Parcelable.Creator
        public final SimpleImage createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new SimpleImage();
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleImage[] newArray(int i) {
            return new SimpleImage[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
