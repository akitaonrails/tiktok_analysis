package com.facebook.share.model;

import X.C13BV;
import X.C1D13;
import X.C2239341Ckm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public final List<ShareMedia<?, ?>> media;
    public static final C2239341Ckm Companion = new Object() { // from class: X.1Ckm
    };
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new C1D13(19);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<com.facebook.share.model.ShareMedia<?, ?>>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.13BV] */
    public ShareMediaContent(Parcel parcel) {
        ?? arrayList;
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (parcelableArray == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable != null) {
                    arrayList.add(parcelable);
                }
            }
        }
        this.media = arrayList;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        Object[] array = this.media.toArray(new ShareMedia[0]);
        if (array != null) {
            parcel.writeParcelableArray((Parcelable[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
