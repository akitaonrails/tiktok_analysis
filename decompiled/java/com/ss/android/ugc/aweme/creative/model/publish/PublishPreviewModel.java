package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishPreviewModel implements Parcelable {
    public static final Parcelable.Creator<PublishPreviewModel> CREATOR = new Parcelable.Creator<PublishPreviewModel>() { // from class: X.0nWy
        @Override // android.os.Parcelable.Creator
        public final PublishPreviewModel createFromParcel(Parcel parcel) {
            return new PublishPreviewModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PublishPreviewModel[] newArray(int i) {
            return new PublishPreviewModel[i];
        }
    };

    @C09CT("first_frame_path")
    public String firstFramePath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstFramePath);
    }

    public PublishPreviewModel() {
        this("");
    }

    public PublishPreviewModel(String str) {
        this.firstFramePath = str;
    }
}
