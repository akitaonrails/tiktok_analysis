package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.PublishPushConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PublishPushConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishPushConfigModel> CREATOR = new Parcelable.Creator<PublishPushConfigModel>() { // from class: X.0Min
        @Override // android.os.Parcelable.Creator
        public final PublishPushConfigModel createFromParcel(Parcel parcel) {
            return new PublishPushConfigModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishPushConfigModel[] newArray(int i) {
            return new PublishPushConfigModel[i];
        }
    };

    @C09CT("publish_failed_toast")
    public String publishFailedToast;

    @C09CT("publish_success_toast")
    public String publishSuccessToast;

    public PublishPushConfigModel() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.publishSuccessToast);
        parcel.writeString(this.publishFailedToast);
    }

    public final String getPublishFailedToast() {
        return this.publishFailedToast;
    }

    public final String getPublishSuccessToast() {
        return this.publishSuccessToast;
    }

    public final void setPublishFailedToast(String str) {
        this.publishFailedToast = str;
    }

    public final void setPublishSuccessToast(String str) {
        this.publishSuccessToast = str;
    }

    public PublishPushConfigModel(String str, String str2) {
        this.publishSuccessToast = str;
        this.publishFailedToast = str2;
    }
}
