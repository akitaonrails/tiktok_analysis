package com.ss.android.ugc.aweme.api.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorIcon implements Parcelable {
    public static final Parcelable.Creator<AnchorIcon> CREATOR = new Parcelable.Creator<AnchorIcon>() { // from class: X.119E
        @Override // android.os.Parcelable.Creator
        public final AnchorIcon createFromParcel(Parcel parcel) {
            return new AnchorIcon(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AnchorIcon[] newArray(int i) {
            return new AnchorIcon[i];
        }
    };

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public ArrayList<String> urlList;

    public AnchorIcon() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeStringList(this.urlList);
    }

    public AnchorIcon(String str, ArrayList<String> arrayList) {
        this.uri = str;
        this.urlList = arrayList;
    }
}
