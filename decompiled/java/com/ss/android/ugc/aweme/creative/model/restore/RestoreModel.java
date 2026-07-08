package com.ss.android.ugc.aweme.creative.model.restore;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.restore.RestoreModel;

/* JADX INFO: loaded from: classes23.dex */
public final class RestoreModel implements Parcelable {
    public static final Parcelable.Creator<RestoreModel> CREATOR = new Parcelable.Creator<RestoreModel>() { // from class: X.0nWw
        @Override // android.os.Parcelable.Creator
        public final RestoreModel createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new RestoreModel(i, z);
        }

        @Override // android.os.Parcelable.Creator
        public final RestoreModel[] newArray(int i) {
            return new RestoreModel[i];
        }
    };

    @C040H
    public boolean isFromRestoreRecover;

    @C040H
    public int restoreType;

    public RestoreModel() {
        this(0, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.restoreType);
        parcel.writeInt(this.isFromRestoreRecover ? 1 : 0);
    }

    public /* synthetic */ RestoreModel(int i) {
        this(0, false);
    }

    public RestoreModel(int i, boolean z) {
        this.restoreType = i;
        this.isFromRestoreRecover = z;
    }
}
