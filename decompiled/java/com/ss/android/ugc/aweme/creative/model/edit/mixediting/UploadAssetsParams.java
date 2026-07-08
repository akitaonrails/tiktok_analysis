package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.UploadAssetsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadAssetsParams implements Parcelable {
    public static final Parcelable.Creator<UploadAssetsParams> CREATOR = new Parcelable.Creator<UploadAssetsParams>() { // from class: X.08v0
        @Override // android.os.Parcelable.Creator
        public final UploadAssetsParams createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new UploadAssetsParams(string, j, string2, z, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UploadAssetsParams[] newArray(int i) {
            return new UploadAssetsParams[i];
        }
    };

    @C09CT("mix_editing_upload_assets_rec_config")
    public String assetsRecConfig;

    @C040H
    public String defaultRecConfig;

    @C040H
    public int failureStatus;

    @C040H
    public boolean isFallBack;

    @C09CT("mix_editing_upload_zip_url")
    public String zipUrl;

    @C09CT("mix_editing_upload_zip_url_timestamp")
    public long zipUrlTimestamp;

    public UploadAssetsParams() {
        this(null, 0L, null, false, -1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadAssetsParams)) {
            return false;
        }
        UploadAssetsParams uploadAssetsParams = (UploadAssetsParams) obj;
        return Intrinsics.LJFF(this.zipUrl, uploadAssetsParams.zipUrl) && this.zipUrlTimestamp == uploadAssetsParams.zipUrlTimestamp && Intrinsics.LJFF(this.assetsRecConfig, uploadAssetsParams.assetsRecConfig) && this.isFallBack == uploadAssetsParams.isFallBack && this.failureStatus == uploadAssetsParams.failureStatus && Intrinsics.LJFF(this.defaultRecConfig, uploadAssetsParams.defaultRecConfig);
    }

    public final int hashCode() {
        String str = this.zipUrl;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.zipUrlTimestamp)) * 31;
        String str2 = this.assetsRecConfig;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.isFallBack)) * 31) + this.failureStatus) * 31;
        String str3 = this.defaultRecConfig;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadAssetsParams(zipUrl=");
        sbLIZ.append(this.zipUrl);
        sbLIZ.append(", zipUrlTimestamp=");
        sbLIZ.append(this.zipUrlTimestamp);
        sbLIZ.append(", assetsRecConfig=");
        sbLIZ.append(this.assetsRecConfig);
        sbLIZ.append(", isFallBack=");
        sbLIZ.append(this.isFallBack);
        sbLIZ.append(", failureStatus=");
        sbLIZ.append(this.failureStatus);
        sbLIZ.append(", defaultRecConfig=");
        sbLIZ.append(this.defaultRecConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zipUrl);
        parcel.writeLong(this.zipUrlTimestamp);
        parcel.writeString(this.assetsRecConfig);
        parcel.writeInt(this.isFallBack ? 1 : 0);
        parcel.writeInt(this.failureStatus);
        parcel.writeString(this.defaultRecConfig);
    }

    public UploadAssetsParams(String str, long j, String str2, boolean z, int i, String str3) {
        this.zipUrl = str;
        this.zipUrlTimestamp = j;
        this.assetsRecConfig = str2;
        this.isFallBack = z;
        this.failureStatus = i;
        this.defaultRecConfig = str3;
    }
}
