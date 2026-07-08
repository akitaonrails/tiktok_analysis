package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC547660Lds;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationResultInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCCreationResultInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIGCCreationResultInfo> CREATOR = new Parcelable.Creator<AIGCCreationResultInfo>() { // from class: X.0Leg
        @Override // android.os.Parcelable.Creator
        public final AIGCCreationResultInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new AIGCCreationResultInfo(boolValueOf, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCCreationResultInfo[] newArray(int i) {
            return new AIGCCreationResultInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("cost_time")
    public final long duration;

    @InterfaceC553020LmW
    @C09CT("gen_pl")
    public String genType;

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("result")
    public final Boolean result;

    @InterfaceC553020LmW
    @C09CT("result_code")
    public final String resultCode;

    @InterfaceC553020LmW
    @C09CT("server_task_id")
    public final String taskId;

    public AIGCCreationResultInfo() {
        this(null, null, 0L, null, EnumC547660Lds.UNKNOWN.getValue());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCCreationResultInfo)) {
            return false;
        }
        AIGCCreationResultInfo aIGCCreationResultInfo = (AIGCCreationResultInfo) obj;
        return Intrinsics.LJFF(this.result, aIGCCreationResultInfo.result) && Intrinsics.LJFF(this.resultCode, aIGCCreationResultInfo.resultCode) && this.duration == aIGCCreationResultInfo.duration && Intrinsics.LJFF(this.taskId, aIGCCreationResultInfo.taskId) && Intrinsics.LJFF(this.genType, aIGCCreationResultInfo.genType);
    }

    public final int hashCode() {
        Boolean bool = this.result;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.resultCode;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.duration)) * 31;
        String str2 = this.taskId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.genType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCCreationResultInfo(result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", resultCode=");
        sbLIZ.append(this.resultCode);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", genType=");
        sbLIZ.append(this.genType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.result;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.resultCode);
        parcel.writeLong(this.duration);
        parcel.writeString(this.taskId);
        parcel.writeString(this.genType);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public AIGCCreationResultInfo(Boolean bool, String str, long j, String str2, String str3) {
        this.result = bool;
        this.resultCode = str;
        this.duration = j;
        this.taskId = str2;
        this.genType = str3;
        this.name = "AIGCCreationResultInfo";
    }
}
