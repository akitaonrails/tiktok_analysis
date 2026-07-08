package com.facebook.share.model;

import X.C2239361Cko;
import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B> implements ShareModel {
    public final Uri contentUrl;
    public final String pageId;
    public final List<String> peopleIds;
    public final String placeId;
    public final String ref;
    public final ShareHashtag shareHashtag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareContent(Parcel parcel) {
        List<String> listUnmodifiableList;
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.peopleIds = listUnmodifiableList;
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        C2239361Cko c2239361Cko = new C2239361Cko();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            c2239361Cko.LIZ = shareHashtag.hashtag;
        }
        this.shareHashtag = new ShareHashtag(c2239361Cko);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.shareHashtag, 0);
    }
}
