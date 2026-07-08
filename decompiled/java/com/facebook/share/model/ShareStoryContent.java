package com.facebook.share.model;

import X.C13LP;
import X.C1D13;
import X.C2239351Ckn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public final String attributionLink;
    public final ShareMedia<?, ?> backgroundAsset;
    public final List<String> backgroundColorList;
    public final SharePhoto stickerAsset;
    public static final C2239351Ckn Companion = new Object() { // from class: X.1Ckn
    };
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C1D13(23);

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ShareStoryContent(Parcel parcel) {
        List<String> listLLIIII;
        super(parcel);
        this.backgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.stickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            listLLIIII = null;
        } else {
            listLLIIII = C13LP.LLIIII(arrayList);
        }
        this.backgroundColorList = listLLIIII;
        this.attributionLink = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<String> listLLIIII;
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.backgroundAsset, 0);
        parcel.writeParcelable(this.stickerAsset, 0);
        List<String> list = this.backgroundColorList;
        if (list == null) {
            listLLIIII = null;
        } else {
            listLLIIII = C13LP.LLIIII(list);
        }
        parcel.writeStringList(listLLIIII);
        parcel.writeString(this.attributionLink);
    }
}
