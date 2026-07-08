package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AISelfScanFaceModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AISelfScanFaceModel implements Parcelable {
    public static final Parcelable.Creator<AISelfScanFaceModel> CREATOR = new Parcelable.Creator<AISelfScanFaceModel>() { // from class: X.0nWz
        @Override // android.os.Parcelable.Creator
        public final AISelfScanFaceModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new AISelfScanFaceModel(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AISelfScanFaceModel[] newArray(int i) {
            return new AISelfScanFaceModel[i];
        }
    };

    @C040H
    public boolean aiSelfScanFaceEntry;

    @C040H
    public boolean hideCameraUIOnStartRecord;

    public AISelfScanFaceModel() {
        this(false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aiSelfScanFaceEntry ? 1 : 0);
        parcel.writeInt(this.hideCameraUIOnStartRecord ? 1 : 0);
    }

    public /* synthetic */ AISelfScanFaceModel(int i) {
        this(false, false);
    }

    public AISelfScanFaceModel(boolean z, boolean z2) {
        this.aiSelfScanFaceEntry = z;
        this.hideCameraUIOnStartRecord = z2;
    }
}
