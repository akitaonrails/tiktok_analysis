package com.ss.android.ugc.aweme.ecommerce.debug.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.debug.model.NetworkCaptureModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkCaptureModel implements Parcelable {
    public static final Parcelable.Creator<NetworkCaptureModel> CREATOR = new Parcelable.Creator<NetworkCaptureModel>() { // from class: X.0prc
        @Override // android.os.Parcelable.Creator
        public final NetworkCaptureModel createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new NetworkCaptureModel(string, string2, string3, string4, string5, string6, string7, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final NetworkCaptureModel[] newArray(int i) {
            return new NetworkCaptureModel[i];
        }
    };

    @C09CT("cost_time")
    public final String costTime;

    @C09CT("is_chunk")
    public final boolean isChunk;

    @C09CT("is_mock")
    public final boolean isMock;

    @C09CT("log_id")
    public final String logId;

    @C09CT("method")
    public final String method;

    @C09CT("path")
    public final String path;

    @C09CT("request_str")
    public final String requestStr;

    @C09CT("response_str")
    public final String responseStr;

    @C09CT("start_time")
    public final String startTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCaptureModel)) {
            return false;
        }
        NetworkCaptureModel networkCaptureModel = (NetworkCaptureModel) obj;
        return Intrinsics.LJFF(this.path, networkCaptureModel.path) && Intrinsics.LJFF(this.method, networkCaptureModel.method) && Intrinsics.LJFF(this.logId, networkCaptureModel.logId) && Intrinsics.LJFF(this.requestStr, networkCaptureModel.requestStr) && Intrinsics.LJFF(this.responseStr, networkCaptureModel.responseStr) && Intrinsics.LJFF(this.startTime, networkCaptureModel.startTime) && Intrinsics.LJFF(this.costTime, networkCaptureModel.costTime) && this.isChunk == networkCaptureModel.isChunk && this.isMock == networkCaptureModel.isMock;
    }

    public final int hashCode() {
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.method;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.requestStr;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.responseStr;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.startTime;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.costTime;
        return ((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isChunk)) * 31) + C786410Ut5.Z2(this.isMock);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkCaptureModel(path=");
        sbLIZ.append(this.path);
        sbLIZ.append(", method=");
        sbLIZ.append(this.method);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", requestStr=");
        sbLIZ.append(this.requestStr);
        sbLIZ.append(", responseStr=");
        sbLIZ.append(this.responseStr);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", costTime=");
        sbLIZ.append(this.costTime);
        sbLIZ.append(", isChunk=");
        sbLIZ.append(this.isChunk);
        sbLIZ.append(", isMock=");
        sbLIZ.append(this.isMock);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.method);
        parcel.writeString(this.logId);
        parcel.writeString(this.requestStr);
        parcel.writeString(this.responseStr);
        parcel.writeString(this.startTime);
        parcel.writeString(this.costTime);
        parcel.writeInt(this.isChunk ? 1 : 0);
        parcel.writeInt(this.isMock ? 1 : 0);
    }

    public NetworkCaptureModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.path = str;
        this.method = str2;
        this.logId = str3;
        this.requestStr = str4;
        this.responseStr = str5;
        this.startTime = str6;
        this.costTime = str7;
        this.isChunk = z;
        this.isMock = z2;
    }
}
