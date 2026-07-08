package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadConfigData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class UploadConfigData implements Parcelable {

    @C09CT("access_key_id")
    public final String accessKey;

    @C09CT("imagex_host")
    public final String imagexHost;

    @C09CT("secret_access_key")
    public final String secretKey;

    @C09CT("service_id")
    public final String serviceId;

    @C09CT("session_token")
    public final String sessionToken;
    public static final Parcelable.Creator<UploadConfigData> CREATOR = new Parcelable.Creator<UploadConfigData>() { // from class: X.0v7F
        @Override // android.os.Parcelable.Creator
        public final UploadConfigData createFromParcel(Parcel parcel) {
            return new UploadConfigData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadConfigData[] newArray(int i) {
            return new UploadConfigData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadConfigData)) {
            return false;
        }
        UploadConfigData uploadConfigData = (UploadConfigData) obj;
        return Intrinsics.LJFF(this.accessKey, uploadConfigData.accessKey) && Intrinsics.LJFF(this.secretKey, uploadConfigData.secretKey) && Intrinsics.LJFF(this.sessionToken, uploadConfigData.sessionToken) && Intrinsics.LJFF(this.imagexHost, uploadConfigData.imagexHost) && Intrinsics.LJFF(this.serviceId, uploadConfigData.serviceId);
    }

    public final int hashCode() {
        return (((((((this.accessKey.hashCode() * 31) + this.secretKey.hashCode()) * 31) + this.sessionToken.hashCode()) * 31) + this.imagexHost.hashCode()) * 31) + this.serviceId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadConfigData(accessKey=");
        sbLIZ.append(this.accessKey);
        sbLIZ.append(", secretKey=");
        sbLIZ.append(this.secretKey);
        sbLIZ.append(", sessionToken=");
        sbLIZ.append(this.sessionToken);
        sbLIZ.append(", imagexHost=");
        sbLIZ.append(this.imagexHost);
        sbLIZ.append(", serviceId=");
        sbLIZ.append(this.serviceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.accessKey);
        parcel.writeString(this.secretKey);
        parcel.writeString(this.sessionToken);
        parcel.writeString(this.imagexHost);
        parcel.writeString(this.serviceId);
    }

    public UploadConfigData(String str, String str2, String str3, String str4, String str5) {
        this.accessKey = str;
        this.secretKey = str2;
        this.sessionToken = str3;
        this.imagexHost = str4;
        this.serviceId = str5;
    }
}
