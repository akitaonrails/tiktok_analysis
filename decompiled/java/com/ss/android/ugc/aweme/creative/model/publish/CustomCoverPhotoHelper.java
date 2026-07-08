package com.ss.android.ugc.aweme.creative.model.publish;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.CustomCoverPhotoHelper;

/* JADX INFO: loaded from: classes23.dex */
public final class CustomCoverPhotoHelper implements Parcelable {
    public static int isFirstPhotoCover;
    public static final CustomCoverPhotoHelper INSTANCE = new CustomCoverPhotoHelper();
    public static final Parcelable.Creator<CustomCoverPhotoHelper> CREATOR = new Parcelable.Creator<CustomCoverPhotoHelper>() { // from class: X.0mbe
        @Override // android.os.Parcelable.Creator
        public final CustomCoverPhotoHelper createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CustomCoverPhotoHelper.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final CustomCoverPhotoHelper[] newArray(int i) {
            return new CustomCoverPhotoHelper[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public static int LIZ() {
        return isFirstPhotoCover;
    }

    public static void LIZIZ(int i) {
        isFirstPhotoCover = i;
    }
}
