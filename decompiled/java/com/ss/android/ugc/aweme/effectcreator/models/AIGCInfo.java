package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.AIGCInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AIGCInfo implements Parcelable {
    public static final Parcelable.Creator<AIGCInfo> CREATOR = new Parcelable.Creator<AIGCInfo>() { // from class: X.0vJH
        @Override // android.os.Parcelable.Creator
        public final AIGCInfo createFromParcel(Parcel parcel) {
            return new AIGCInfo(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCInfo[] newArray(int i) {
            return new AIGCInfo[i];
        }
    };
    public final int aigcType;
    public final String generationType;
    public final String workflowTaskId;

    public AIGCInfo() {
        this(0, "", "online");
    }

    public final AIGCInfo copy(int i, String str, String str2) {
        return new AIGCInfo(i, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCInfo)) {
            return false;
        }
        AIGCInfo aIGCInfo = (AIGCInfo) obj;
        return this.aigcType == aIGCInfo.aigcType && Intrinsics.LJFF(this.workflowTaskId, aIGCInfo.workflowTaskId) && Intrinsics.LJFF(this.generationType, aIGCInfo.generationType);
    }

    public int hashCode() {
        return (((this.aigcType * 31) + this.workflowTaskId.hashCode()) * 31) + this.generationType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCInfo(aigcType=");
        sbLIZ.append(this.aigcType);
        sbLIZ.append(", workflowTaskId=");
        sbLIZ.append(this.workflowTaskId);
        sbLIZ.append(", generationType=");
        sbLIZ.append(this.generationType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aigcType);
        parcel.writeString(this.workflowTaskId);
        parcel.writeString(this.generationType);
    }

    public final int getAigcType() {
        return this.aigcType;
    }

    public final String getGenerationType() {
        return this.generationType;
    }

    public final String getWorkflowTaskId() {
        return this.workflowTaskId;
    }

    public AIGCInfo(int i, String str, String str2) {
        this.aigcType = i;
        this.workflowTaskId = str;
        this.generationType = str2;
    }
}
