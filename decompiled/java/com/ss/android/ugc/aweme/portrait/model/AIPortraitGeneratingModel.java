package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitGeneratingModel implements Parcelable {
    public static final Parcelable.Creator<AIPortraitGeneratingModel> CREATOR = new Parcelable.Creator<AIPortraitGeneratingModel>() { // from class: X.0Lhu
        @Override // android.os.Parcelable.Creator
        public final AIPortraitGeneratingModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            GenerateFailedInfo generateFailedInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            GenerateStatus generateStatusCreateFromParcel = GenerateStatus.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                generateFailedInfoCreateFromParcel = GenerateFailedInfo.CREATOR.createFromParcel(parcel);
            }
            GenerateFailedInfo generateFailedInfo = generateFailedInfoCreateFromParcel;
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIPortraitGeneratingModel(string, string2, numValueOf, generateStatusCreateFromParcel, generateFailedInfo, j, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitGeneratingModel[] newArray(int i) {
            return new AIPortraitGeneratingModel[i];
        }
    };

    @C09CT("client_workflow_id")
    public String clientWorkflowId;

    @C09CT("generate_failed_info")
    public GenerateFailedInfo failedInfo;

    @C09CT("is_async")
    public boolean isAsync;

    @C09CT("progress")
    public Integer progress;

    @C09CT("server_workflow_id")
    public String serverWorkflowId;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public GenerateStatus status;

    public AIPortraitGeneratingModel() {
        this(null, null, 0, GenerateStatus.NOT_START, null, 0L, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitGeneratingModel)) {
            return false;
        }
        AIPortraitGeneratingModel aIPortraitGeneratingModel = (AIPortraitGeneratingModel) obj;
        return Intrinsics.LJFF(this.clientWorkflowId, aIPortraitGeneratingModel.clientWorkflowId) && Intrinsics.LJFF(this.serverWorkflowId, aIPortraitGeneratingModel.serverWorkflowId) && Intrinsics.LJFF(this.progress, aIPortraitGeneratingModel.progress) && this.status == aIPortraitGeneratingModel.status && Intrinsics.LJFF(this.failedInfo, aIPortraitGeneratingModel.failedInfo) && this.startTime == aIPortraitGeneratingModel.startTime && this.isAsync == aIPortraitGeneratingModel.isAsync;
    }

    public final int hashCode() {
        String str = this.clientWorkflowId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serverWorkflowId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.progress;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.status.hashCode()) * 31;
        GenerateFailedInfo generateFailedInfo = this.failedInfo;
        return ((((iHashCode3 + (generateFailedInfo != null ? generateFailedInfo.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Z2(this.isAsync);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitGeneratingModel(clientWorkflowId=");
        sbLIZ.append(this.clientWorkflowId);
        sbLIZ.append(", serverWorkflowId=");
        sbLIZ.append(this.serverWorkflowId);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", failedInfo=");
        sbLIZ.append(this.failedInfo);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", isAsync=");
        sbLIZ.append(this.isAsync);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientWorkflowId);
        parcel.writeString(this.serverWorkflowId);
        Integer num = this.progress;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.status.writeToParcel(parcel, i);
        GenerateFailedInfo generateFailedInfo = this.failedInfo;
        if (generateFailedInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            generateFailedInfo.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.startTime);
        parcel.writeInt(this.isAsync ? 1 : 0);
    }

    public AIPortraitGeneratingModel(String str, String str2, Integer num, GenerateStatus generateStatus, GenerateFailedInfo generateFailedInfo, long j, boolean z) {
        this.clientWorkflowId = str;
        this.serverWorkflowId = str2;
        this.progress = num;
        this.status = generateStatus;
        this.failedInfo = generateFailedInfo;
        this.startTime = j;
        this.isAsync = z;
    }
}
