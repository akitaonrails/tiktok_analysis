package com.ss.android.ugc.aweme.photo;

import X.C2471909mP;
import android.net.Uri;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoContext implements Serializable {
    public int mHeight;
    public String mPhotoLocalPath;
    public int mWidth;

    public Uri getPhotoUri() {
        return C2471909mP.LJIILIIL(this.mPhotoLocalPath);
    }

    public static PhotoContext fromUpload(String str, int i, int i2) {
        str.getClass();
        PhotoContext photoContext = new PhotoContext();
        photoContext.mPhotoLocalPath = str;
        photoContext.mWidth = i;
        photoContext.mHeight = i2;
        return photoContext;
    }
}
