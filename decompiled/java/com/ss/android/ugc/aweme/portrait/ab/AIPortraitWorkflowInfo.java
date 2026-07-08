package com.ss.android.ugc.aweme.portrait.ab;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.ab.AIPortraitWorkflowInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitWorkflowInfo implements Parcelable {
    public static final Parcelable.Creator<AIPortraitWorkflowInfo> CREATOR = new Parcelable.Creator<AIPortraitWorkflowInfo>() { // from class: X.0LiM
        @Override // android.os.Parcelable.Creator
        public final AIPortraitWorkflowInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AIPortraitWorkflowInfo(lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitWorkflowInfo[] newArray(int i) {
            return new AIPortraitWorkflowInfo[i];
        }
    };

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("server_workflow_id")
    public final Long serverWorkflowId;

    @C09CT("task_type")
    public final String taskType;

    public AIPortraitWorkflowInfo() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitWorkflowInfo)) {
            return false;
        }
        AIPortraitWorkflowInfo aIPortraitWorkflowInfo = (AIPortraitWorkflowInfo) obj;
        return Intrinsics.LJFF(this.serverWorkflowId, aIPortraitWorkflowInfo.serverWorkflowId) && Intrinsics.LJFF(this.businessScene, aIPortraitWorkflowInfo.businessScene) && Intrinsics.LJFF(this.taskType, aIPortraitWorkflowInfo.taskType);
    }

    public final int hashCode() {
        Long l = this.serverWorkflowId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.businessScene;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitWorkflowInfo(serverWorkflowId=");
        sbLIZ.append(this.serverWorkflowId);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.businessScene);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.serverWorkflowId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.businessScene);
        parcel.writeString(this.taskType);
    }

    public AIPortraitWorkflowInfo(Long l, String str, String str2) {
        this.serverWorkflowId = l;
        this.businessScene = str;
        this.taskType = str2;
    }
}
