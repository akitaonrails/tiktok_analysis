package com.facebook.share.model;

import X.C13BV;
import X.C13LP;
import X.C1D13;
import X.C2239331Ckl;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Object> {
    public final List<SharePhoto> photos;
    public static final C2239331Ckl Companion = new Object() { // from class: X.1Ckl
    };
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new C1D13(22);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    public SharePhotoContent(Parcel parcel) {
        ?? arrayList;
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (parcelableArray == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof ShareMedia) {
                    arrayList.add(parcelable);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof SharePhoto) {
                arrayList2.add(obj);
            }
        }
        this.photos = C13LP.LLIIII(arrayList2);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Object[] array = this.photos.toArray(new SharePhoto[0]);
        if (array != null) {
            parcel.writeParcelableArray((SharePhoto[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
