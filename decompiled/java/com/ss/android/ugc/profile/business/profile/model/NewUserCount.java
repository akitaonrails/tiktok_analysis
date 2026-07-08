package com.ss.android.ugc.profile.business.profile.model;

import X.C1D13;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes35.dex */
public class NewUserCount extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<NewUserCount> CREATOR = new C1D13(27);
    public int count;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public NewUserCount() {
    }

    public int getCount() {
        return this.count;
    }

    public NewUserCount(Parcel parcel) {
        this.count = parcel.readInt();
    }

    public void setCount(int i) {
        this.count = i;
    }

    public NewUserCount(int i) {
        this.count = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
    }
}
