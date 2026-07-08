package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CheckPointModel;

/* JADX INFO: loaded from: classes23.dex */
public final class CheckPointModel implements Parcelable {
    public static final Parcelable.Creator<CheckPointModel> CREATOR = new Parcelable.Creator<CheckPointModel>() { // from class: X.0nX2
        @Override // android.os.Parcelable.Creator
        public final CheckPointModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CheckPointModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckPointModel[] newArray(int i) {
            return new CheckPointModel[i];
        }
    };

    @C040H
    public boolean enableCheckPoint;

    public CheckPointModel() {
        this(true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enableCheckPoint ? 1 : 0);
    }

    public CheckPointModel(boolean z) {
        this.enableCheckPoint = z;
    }

    public /* synthetic */ CheckPointModel(int i) {
        this(true);
    }
}
