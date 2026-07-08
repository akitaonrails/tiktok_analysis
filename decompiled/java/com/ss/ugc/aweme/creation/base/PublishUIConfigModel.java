package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.PublishPushConfigModel;
import com.ss.ugc.aweme.creation.base.PublishUIConfigModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class PublishUIConfigModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishUIConfigModel> CREATOR = new Parcelable.Creator<PublishUIConfigModel>() { // from class: X.0MTb
        @Override // android.os.Parcelable.Creator
        public final PublishUIConfigModel createFromParcel(Parcel parcel) {
            return new PublishUIConfigModel((PublishPushConfigModel) parcel.readParcelable(PublishUIConfigModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PublishUIConfigModel[] newArray(int i) {
            return new PublishUIConfigModel[i];
        }
    };

    @C09CT("push")
    public PublishPushConfigModel push;

    public PublishUIConfigModel() {
        this(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.push, i);
    }

    public final PublishPushConfigModel getPush() {
        return this.push;
    }

    public PublishUIConfigModel(PublishPushConfigModel publishPushConfigModel) {
        this.push = publishPushConfigModel;
    }

    public final void setPush(PublishPushConfigModel publishPushConfigModel) {
        this.push = publishPushConfigModel;
    }
}
