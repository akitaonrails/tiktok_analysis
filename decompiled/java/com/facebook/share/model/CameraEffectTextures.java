package com.facebook.share.model;

import X.C2259741Dca;
import X.C2259761Dcc;
import X.C2325341G0m;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public final class CameraEffectTextures implements ShareModel {
    public final Bundle textures;
    public static final C2259761Dcc Companion = new Object() { // from class: X.1Dcc
    };
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new C2325341G0m(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraEffectTextures(Parcel parcel) {
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }

    public CameraEffectTextures(C2259741Dca c2259741Dca) {
        this.textures = c2259741Dca.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.textures);
    }
}
