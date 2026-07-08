package com.ss.android.ugc.aweme.share.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class ShareModel implements Parcelable {
    public static final Parcelable.Creator<ShareModel> CREATOR = new Parcelable.Creator<ShareModel>() { // from class: X.0lyI
        @Override // android.os.Parcelable.Creator
        public final ShareModel createFromParcel(Parcel parcel) {
            return new ShareModel(parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareModel[] newArray(int i) {
            return new ShareModel[i];
        }
    };
    public final Serializable customModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.customModel);
    }

    public ShareModel(Serializable serializable) {
        this.customModel = serializable;
    }
}
