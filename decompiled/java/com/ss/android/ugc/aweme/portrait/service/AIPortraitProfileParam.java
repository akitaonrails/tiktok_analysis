package com.ss.android.ugc.aweme.portrait.service;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AIPortraitProfileParam {
    public final String cameoCreationId;
    public final String creationId;
    public final AIGCEntranceInfo entranceInfo;
    public final String eventPage;
    public final String sceneName;
    public final String textType;

    public AIPortraitProfileParam() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitProfileParam)) {
            return false;
        }
        AIPortraitProfileParam aIPortraitProfileParam = (AIPortraitProfileParam) obj;
        return Intrinsics.LJFF(this.entranceInfo, aIPortraitProfileParam.entranceInfo) && Intrinsics.LJFF(this.creationId, aIPortraitProfileParam.creationId) && Intrinsics.LJFF(this.sceneName, aIPortraitProfileParam.sceneName) && Intrinsics.LJFF(this.textType, aIPortraitProfileParam.textType) && Intrinsics.LJFF(this.eventPage, aIPortraitProfileParam.eventPage) && Intrinsics.LJFF(this.cameoCreationId, aIPortraitProfileParam.cameoCreationId);
    }

    public int hashCode() {
        AIGCEntranceInfo aIGCEntranceInfo = this.entranceInfo;
        int iHashCode = (aIGCEntranceInfo == null ? 0 : aIGCEntranceInfo.hashCode()) * 31;
        String str = this.creationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sceneName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventPage;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cameoCreationId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitProfileParam(entranceInfo=");
        sbLIZ.append(this.entranceInfo);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", sceneName=");
        sbLIZ.append(this.sceneName);
        sbLIZ.append(", textType=");
        sbLIZ.append(this.textType);
        sbLIZ.append(", eventPage=");
        sbLIZ.append(this.eventPage);
        sbLIZ.append(", cameoCreationId=");
        sbLIZ.append(this.cameoCreationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIPortraitProfileParam(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, String str3, String str4, String str5) {
        this.entranceInfo = aIGCEntranceInfo;
        this.creationId = str;
        this.sceneName = str2;
        this.textType = str3;
        this.eventPage = str4;
        this.cameoCreationId = str5;
    }
}
