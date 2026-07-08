package com.ss.android.ugc.aweme.im.creative.recrod.api.factory;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import com.ss.android.ugc.aweme.im.creative.recrod.api.factory.CameraEventParameters;
import com.ss.android.ugc.aweme.im.creative.recrod.api.factory.IMCameraBuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class IMCameraBuildConfig implements Parcelable {
    public static final Parcelable.Creator<IMCameraBuildConfig> CREATOR = new Parcelable.Creator<IMCameraBuildConfig>() { // from class: X.18m1
        @Override // android.os.Parcelable.Creator
        public final IMCameraBuildConfig createFromParcel(Parcel parcel) {
            CameraEventParameters cameraEventParametersCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                cameraEventParametersCreateFromParcel = null;
            } else {
                cameraEventParametersCreateFromParcel = CameraEventParameters.CREATOR.createFromParcel(parcel);
            }
            return new IMCameraBuildConfig(string, string2, cameraEventParametersCreateFromParcel, (IMGameCameraInfo) parcel.readParcelable(IMCameraBuildConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IMCameraBuildConfig[] newArray(int i) {
            return new IMCameraBuildConfig[i];
        }
    };
    public final String conversationId;
    public final String creationId;
    public final CameraEventParameters eventParameters;
    public final IMGameCameraInfo gameInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMCameraBuildConfig)) {
            return false;
        }
        IMCameraBuildConfig iMCameraBuildConfig = (IMCameraBuildConfig) obj;
        return Intrinsics.LJFF(this.conversationId, iMCameraBuildConfig.conversationId) && Intrinsics.LJFF(this.creationId, iMCameraBuildConfig.creationId) && Intrinsics.LJFF(this.eventParameters, iMCameraBuildConfig.eventParameters) && Intrinsics.LJFF(this.gameInfo, iMCameraBuildConfig.gameInfo);
    }

    public final int hashCode() {
        int iHashCode = ((this.conversationId.hashCode() * 31) + this.creationId.hashCode()) * 31;
        CameraEventParameters cameraEventParameters = this.eventParameters;
        int iHashCode2 = (iHashCode + (cameraEventParameters == null ? 0 : cameraEventParameters.hashCode())) * 31;
        IMGameCameraInfo iMGameCameraInfo = this.gameInfo;
        return iHashCode2 + (iMGameCameraInfo != null ? iMGameCameraInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMCameraBuildConfig(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", eventParameters=");
        sbLIZ.append(this.eventParameters);
        sbLIZ.append(", gameInfo=");
        sbLIZ.append(this.gameInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conversationId);
        parcel.writeString(this.creationId);
        CameraEventParameters cameraEventParameters = this.eventParameters;
        if (cameraEventParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cameraEventParameters.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.gameInfo, i);
    }

    public IMCameraBuildConfig(String str, String str2, CameraEventParameters cameraEventParameters, IMGameCameraInfo iMGameCameraInfo) {
        this.conversationId = str;
        this.creationId = str2;
        this.eventParameters = cameraEventParameters;
        this.gameInfo = iMGameCameraInfo;
    }
}
