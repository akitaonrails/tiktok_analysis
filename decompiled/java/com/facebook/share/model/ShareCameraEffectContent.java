package com.facebook.share.model;

import X.C2259731DcZ;
import X.C2259741Dca;
import X.C2259771Dcd;
import X.C2325341G0m;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public final class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public CameraEffectArguments arguments;
    public String effectId;
    public CameraEffectTextures textures;
    public static final C2259771Dcd Companion = new Object() { // from class: X.1Dcd
    };
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C2325341G0m(8);

    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.effectId = parcel.readString();
        C2259731DcZ c2259731DcZ = new C2259731DcZ();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            C786410Ut5.LJJIIJZLJL(c2259731DcZ.LIZ, cameraEffectArguments.params);
        }
        this.arguments = new CameraEffectArguments(c2259731DcZ);
        C2259741Dca c2259741Dca = new C2259741Dca();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            C786410Ut5.LJJIIJZLJL(c2259741Dca.LIZ, cameraEffectTextures.textures);
        }
        this.textures = new CameraEffectTextures(c2259741Dca);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.arguments, 0);
        parcel.writeParcelable(this.textures, 0);
    }
}
