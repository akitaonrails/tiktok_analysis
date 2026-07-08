package com.facebook.share.model;

import X.C2259731DcZ;
import X.C2259751Dcb;
import X.C2325341G0m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public final class CameraEffectArguments implements ShareModel {
    public final Bundle params;
    public static final C2259751Dcb Companion = new Object() { // from class: X.1Dcb
    };
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new C2325341G0m(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraEffectArguments(Parcel parcel) {
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }

    public CameraEffectArguments(C2259731DcZ c2259731DcZ) {
        this.params = c2259731DcZ.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }
}
