package com.facebook.share.model;

import X.AbstractC2239391Ckr;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareMedia;

/* JADX INFO: loaded from: classes35.dex */
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends AbstractC2239391Ckr<M, B>> implements ShareModel {
    public final Bundle params;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareMedia(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.params = bundle == null ? new Bundle() : bundle;
    }

    public ShareMedia(AbstractC2239391Ckr<M, B> abstractC2239391Ckr) {
        this.params = new Bundle(abstractC2239391Ckr.LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }
}
