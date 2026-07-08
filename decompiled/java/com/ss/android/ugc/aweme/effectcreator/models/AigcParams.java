package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.AigcParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AigcParams implements Parcelable {
    public static final Parcelable.Creator<AigcParams> CREATOR = new Parcelable.Creator<AigcParams>() { // from class: X.0vJx
        @Override // android.os.Parcelable.Creator
        public final AigcParams createFromParcel(Parcel parcel) {
            return new AigcParams(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AigcParams[] newArray(int i) {
            return new AigcParams[i];
        }
    };
    public final String aigcResult;
    public final String aigcResultLocalPath;
    public final String aigcServerTaskId;
    public final String aigcWorkflowId;
    public final int ameAigcState;

    public AigcParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AigcParams)) {
            return false;
        }
        AigcParams aigcParams = (AigcParams) obj;
        return this.ameAigcState == aigcParams.ameAigcState && Intrinsics.LJFF(this.aigcServerTaskId, aigcParams.aigcServerTaskId) && Intrinsics.LJFF(this.aigcResult, aigcParams.aigcResult) && Intrinsics.LJFF(this.aigcWorkflowId, aigcParams.aigcWorkflowId) && Intrinsics.LJFF(this.aigcResultLocalPath, aigcParams.aigcResultLocalPath);
    }

    public final int hashCode() {
        return (((((((this.ameAigcState * 31) + this.aigcServerTaskId.hashCode()) * 31) + this.aigcResult.hashCode()) * 31) + this.aigcWorkflowId.hashCode()) * 31) + this.aigcResultLocalPath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcParams(ameAigcState=");
        sbLIZ.append(this.ameAigcState);
        sbLIZ.append(", aigcServerTaskId=");
        sbLIZ.append(this.aigcServerTaskId);
        sbLIZ.append(", aigcResult=");
        sbLIZ.append(this.aigcResult);
        sbLIZ.append(", aigcWorkflowId=");
        sbLIZ.append(this.aigcWorkflowId);
        sbLIZ.append(", aigcResultLocalPath=");
        sbLIZ.append(this.aigcResultLocalPath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ameAigcState);
        parcel.writeString(this.aigcServerTaskId);
        parcel.writeString(this.aigcResult);
        parcel.writeString(this.aigcWorkflowId);
        parcel.writeString(this.aigcResultLocalPath);
    }

    public /* synthetic */ AigcParams(int i) {
        this(0, "", "", "", "");
    }

    public AigcParams(int i, String str, String str2, String str3, String str4) {
        this.ameAigcState = i;
        this.aigcServerTaskId = str;
        this.aigcResult = str2;
        this.aigcWorkflowId = str3;
        this.aigcResultLocalPath = str4;
    }

    public static AigcParams LIZ(AigcParams aigcParams, int i, String str, String str2, String str3, String str4, int i2) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = aigcParams.ameAigcState;
        }
        if ((i2 & 2) != 0) {
            str8 = aigcParams.aigcServerTaskId;
        }
        if ((i2 & 4) != 0) {
            str7 = aigcParams.aigcResult;
        }
        if ((i2 & 8) != 0) {
            str6 = aigcParams.aigcWorkflowId;
        }
        if ((i2 & 16) != 0) {
            str5 = aigcParams.aigcResultLocalPath;
        }
        aigcParams.getClass();
        return new AigcParams(i3, str8, str7, str6, str5);
    }
}
