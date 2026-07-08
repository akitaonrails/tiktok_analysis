package com.ss.android.ugc.asve.wrap;

import X.C1694140uBg;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;

/* JADX INFO: loaded from: classes26.dex */
public final class ASSimpleFaceInfo implements Parcelable {
    public static final C1694140uBg CREATOR = new Parcelable.Creator<ASSimpleFaceInfo>() { // from class: X.0uBg
        @Override // android.os.Parcelable.Creator
        public final ASSimpleFaceInfo createFromParcel(Parcel parcel) {
            return new ASSimpleFaceInfo(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ASSimpleFaceInfo[] newArray(int i) {
            return new ASSimpleFaceInfo[i];
        }
    };
    public float boyProb;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ASSimpleFaceInfo(float f) {
        this.boyProb = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.boyProb);
    }
}
