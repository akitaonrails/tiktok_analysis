package com.ss.android.ugc.aweme.aikit.api.common;

import X.C09CT;
import X.C0LQY;
import X.C2188811AlT;
import X.C547650Ldr;
import X.C786410Ut5;
import X.InterfaceC546090LbL;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCDraft {

    @C09CT("aigc_entrance_info")
    public final AIGCEntranceInfo aigcEntranceInfo;

    @C09CT("business_key")
    public final InterfaceC546090LbL businessKey;

    @C09CT("draft_info")
    public final CameoDraft cameoDraft;

    @C09CT("local_file_path")
    public String localFilePath;

    @C09CT("server_task_id")
    public final String serverTaskId;

    @C09CT("success")
    public final boolean success;

    public AIGCDraft() {
        this(C547650Ldr.LIZ, true, "", new AIGCEntranceInfo(C0LQY.AI_THEATER, null, 0, null, null, null, false, false, false, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.RefPageName.NoNeed.INSTANCE, null, null, null, null, false, false, null, null, null), null, null);
    }

    public final AIGCDraft copy(InterfaceC546090LbL interfaceC546090LbL, boolean z, String str, AIGCEntranceInfo aIGCEntranceInfo, CameoDraft cameoDraft, String str2) {
        return new AIGCDraft(interfaceC546090LbL, z, str, aIGCEntranceInfo, cameoDraft, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCDraft)) {
            return false;
        }
        AIGCDraft aIGCDraft = (AIGCDraft) obj;
        return Intrinsics.LJFF(this.businessKey, aIGCDraft.businessKey) && this.success == aIGCDraft.success && Intrinsics.LJFF(this.serverTaskId, aIGCDraft.serverTaskId) && Intrinsics.LJFF(this.aigcEntranceInfo, aIGCDraft.aigcEntranceInfo) && Intrinsics.LJFF(this.cameoDraft, aIGCDraft.cameoDraft) && Intrinsics.LJFF(this.localFilePath, aIGCDraft.localFilePath);
    }

    public int hashCode() {
        int iHashCode = ((((((this.businessKey.hashCode() * 31) + C786410Ut5.Z2(this.success)) * 31) + this.serverTaskId.hashCode()) * 31) + this.aigcEntranceInfo.hashCode()) * 31;
        CameoDraft cameoDraft = this.cameoDraft;
        int iHashCode2 = (iHashCode + (cameoDraft == null ? 0 : cameoDraft.hashCode())) * 31;
        String str = this.localFilePath;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{business=");
        sbLIZ.append(this.businessKey);
        sbLIZ.append(",success=");
        sbLIZ.append(this.success);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setLocalFilePath(String str) {
        this.localFilePath = str;
    }

    public AIGCDraft(InterfaceC546090LbL interfaceC546090LbL, boolean z, String str, AIGCEntranceInfo aIGCEntranceInfo, CameoDraft cameoDraft, String str2) {
        this.businessKey = interfaceC546090LbL;
        this.success = z;
        this.serverTaskId = str;
        this.aigcEntranceInfo = aIGCEntranceInfo;
        this.cameoDraft = cameoDraft;
        this.localFilePath = str2;
    }
}
