package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.HDRModel;

/* JADX INFO: loaded from: classes23.dex */
public final class HDRModel implements Parcelable {
    public static final Parcelable.Creator<HDRModel> CREATOR = new Parcelable.Creator<HDRModel>() { // from class: X.0nWl
        @Override // android.os.Parcelable.Creator
        public final HDRModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new HDRModel(z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final HDRModel[] newArray(int i) {
            return new HDRModel[i];
        }
    };

    @C040H
    public boolean veCodecIsReady;

    @C040H
    public int videoCodeType;

    public HDRModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.veCodecIsReady ? 1 : 0);
        parcel.writeInt(this.videoCodeType);
    }

    public /* synthetic */ HDRModel(int i) {
        this(false, -1);
    }

    public HDRModel(boolean z, int i) {
        this.veCodecIsReady = z;
        this.videoCodeType = i;
    }
}
