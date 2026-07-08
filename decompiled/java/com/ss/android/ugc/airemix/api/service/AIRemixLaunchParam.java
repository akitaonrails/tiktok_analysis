package com.ss.android.ugc.airemix.api.service;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.api.model.AIRemixAwemeEntranceModel;
import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixLaunchParam implements Parcelable {
    public static final Parcelable.Creator<AIRemixLaunchParam> CREATOR = new Parcelable.Creator<AIRemixLaunchParam>() { // from class: X.0Ly2
        @Override // android.os.Parcelable.Creator
        public final AIRemixLaunchParam createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AIRemixAwemeEntranceModel aIRemixAwemeEntranceModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = (AIRemixCommonEntranceInfo) parcel.readParcelable(AIRemixLaunchParam.class.getClassLoader());
            if (parcel.readInt() != 0) {
                aIRemixAwemeEntranceModelCreateFromParcel = AIRemixAwemeEntranceModel.CREATOR.createFromParcel(parcel);
            }
            AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel = aIRemixAwemeEntranceModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIRemixLaunchParam(string, string2, lValueOf, string3, aIRemixCommonEntranceInfo, aIRemixAwemeEntranceModel, z, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixLaunchParam[] newArray(int i) {
            return new AIRemixLaunchParam[i];
        }
    };
    public final AIRemixCommonEntranceInfo aiRemixCommonEntranceInfo;
    public final Long autoScrollMsgId;
    public final String awemeId;
    public final long clickTimestamp;
    public final String conversationId;
    public final String cover;
    public final AIRemixAwemeEntranceModel originAwemeInfo;
    public final boolean skipRouterIntercept;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixLaunchParam)) {
            return false;
        }
        AIRemixLaunchParam aIRemixLaunchParam = (AIRemixLaunchParam) obj;
        return Intrinsics.LJFF(this.awemeId, aIRemixLaunchParam.awemeId) && Intrinsics.LJFF(this.conversationId, aIRemixLaunchParam.conversationId) && Intrinsics.LJFF(this.autoScrollMsgId, aIRemixLaunchParam.autoScrollMsgId) && Intrinsics.LJFF(this.cover, aIRemixLaunchParam.cover) && Intrinsics.LJFF(this.aiRemixCommonEntranceInfo, aIRemixLaunchParam.aiRemixCommonEntranceInfo) && Intrinsics.LJFF(this.originAwemeInfo, aIRemixLaunchParam.originAwemeInfo) && this.skipRouterIntercept == aIRemixLaunchParam.skipRouterIntercept && this.clickTimestamp == aIRemixLaunchParam.clickTimestamp;
    }

    public final int hashCode() {
        int iHashCode = this.awemeId.hashCode() * 31;
        String str = this.conversationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.autoScrollMsgId;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.cover;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = this.aiRemixCommonEntranceInfo;
        int iHashCode5 = (iHashCode4 + (aIRemixCommonEntranceInfo == null ? 0 : aIRemixCommonEntranceInfo.hashCode())) * 31;
        AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel = this.originAwemeInfo;
        return ((((iHashCode5 + (aIRemixAwemeEntranceModel != null ? aIRemixAwemeEntranceModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.skipRouterIntercept)) * 31) + C786410Ut5.Y2(this.clickTimestamp);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixLaunchParam(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", autoScrollMsgId=");
        sbLIZ.append(this.autoScrollMsgId);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", aiRemixCommonEntranceInfo=");
        sbLIZ.append(this.aiRemixCommonEntranceInfo);
        sbLIZ.append(", originAwemeInfo=");
        sbLIZ.append(this.originAwemeInfo);
        sbLIZ.append(", skipRouterIntercept=");
        sbLIZ.append(this.skipRouterIntercept);
        sbLIZ.append(", clickTimestamp=");
        sbLIZ.append(this.clickTimestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.awemeId);
        parcel.writeString(this.conversationId);
        Long l = this.autoScrollMsgId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.cover);
        parcel.writeParcelable(this.aiRemixCommonEntranceInfo, i);
        AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel = this.originAwemeInfo;
        if (aIRemixAwemeEntranceModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIRemixAwemeEntranceModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.skipRouterIntercept ? 1 : 0);
        parcel.writeLong(this.clickTimestamp);
    }

    public static AIRemixLaunchParam LIZ(AIRemixLaunchParam aIRemixLaunchParam, AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel, boolean z, long j, int i) {
        String str;
        String str2;
        Long l;
        String str3;
        long j2 = j;
        boolean z2 = z;
        AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel2 = aIRemixAwemeEntranceModel;
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = null;
        if ((i & 1) != 0) {
            str = aIRemixLaunchParam.awemeId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = aIRemixLaunchParam.conversationId;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = aIRemixLaunchParam.autoScrollMsgId;
        } else {
            l = null;
        }
        if ((i & 8) != 0) {
            str3 = aIRemixLaunchParam.cover;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            aIRemixCommonEntranceInfo = aIRemixLaunchParam.aiRemixCommonEntranceInfo;
        }
        if ((i & 32) != 0) {
            aIRemixAwemeEntranceModel2 = aIRemixLaunchParam.originAwemeInfo;
        }
        if ((i & 64) != 0) {
            z2 = aIRemixLaunchParam.skipRouterIntercept;
        }
        if ((i & 128) != 0) {
            j2 = aIRemixLaunchParam.clickTimestamp;
        }
        aIRemixLaunchParam.getClass();
        return new AIRemixLaunchParam(str, str2, l, str3, aIRemixCommonEntranceInfo, aIRemixAwemeEntranceModel2, z2, j2);
    }

    public /* synthetic */ AIRemixLaunchParam(String str, String str2, Long l, String str3, AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo, AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : aIRemixCommonEntranceInfo, (i & 32) == 0 ? aIRemixAwemeEntranceModel : null, false, 0L);
    }

    public AIRemixLaunchParam(String str, String str2, Long l, String str3, AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo, AIRemixAwemeEntranceModel aIRemixAwemeEntranceModel, boolean z, long j) {
        this.awemeId = str;
        this.conversationId = str2;
        this.autoScrollMsgId = l;
        this.cover = str3;
        this.aiRemixCommonEntranceInfo = aIRemixCommonEntranceInfo;
        this.originAwemeInfo = aIRemixAwemeEntranceModel;
        this.skipRouterIntercept = z;
        this.clickTimestamp = j;
    }
}
