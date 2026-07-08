package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;

/* JADX INFO: loaded from: classes23.dex */
public final class ProfileParametersModel implements Parcelable {
    public static final Parcelable.Creator<ProfileParametersModel> CREATOR = new Parcelable.Creator<ProfileParametersModel>() { // from class: X.0nXp
        @Override // android.os.Parcelable.Creator
        public final ProfileParametersModel createFromParcel(Parcel parcel) {
            return new ProfileParametersModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileParametersModel[] newArray(int i) {
            return new ProfileParametersModel[i];
        }
    };

    @C09CT("wording")
    public String guideWording;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.guideWording);
    }

    public ProfileParametersModel() {
        this("");
    }

    public ProfileParametersModel(String str) {
        this.guideWording = str;
    }
}
