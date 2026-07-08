package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutServerTaskOutput extends AbsTaskOutput {

    @C09CT("autopick_template_infos")
    public final List<AutoPickTaskResponse> autoPickTaskResponses;

    @C09CT("child_errorCode")
    public final int errorCode;

    @C09CT("child_errorMsg")
    public final String errorMsg;

    @C09CT("child_fail_reason_msg")
    public final String failReasonMsg;

    @C09CT("music_model")
    public final MusicInfo musicInfo;

    @C09CT("nle_draft")
    public final String nleDraft;

    @C09CT("child_requestId")
    public final String requestId;

    @C09CT("child_serverTaskId")
    public final String serverTaskId;

    @C09CT("child_status")
    public final String status;

    public AutoCutServerTaskOutput() {
        this("", 0, "", "", "", "", "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutServerTaskOutput)) {
            return false;
        }
        AutoCutServerTaskOutput autoCutServerTaskOutput = (AutoCutServerTaskOutput) obj;
        return Intrinsics.LJFF(this.status, autoCutServerTaskOutput.status) && this.errorCode == autoCutServerTaskOutput.errorCode && Intrinsics.LJFF(this.errorMsg, autoCutServerTaskOutput.errorMsg) && Intrinsics.LJFF(this.failReasonMsg, autoCutServerTaskOutput.failReasonMsg) && Intrinsics.LJFF(this.serverTaskId, autoCutServerTaskOutput.serverTaskId) && Intrinsics.LJFF(this.requestId, autoCutServerTaskOutput.requestId) && Intrinsics.LJFF(this.nleDraft, autoCutServerTaskOutput.nleDraft) && Intrinsics.LJFF(this.musicInfo, autoCutServerTaskOutput.musicInfo) && Intrinsics.LJFF(this.autoPickTaskResponses, autoCutServerTaskOutput.autoPickTaskResponses);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.status.hashCode() * 31) + this.errorCode) * 31) + this.errorMsg.hashCode()) * 31) + this.failReasonMsg.hashCode()) * 31) + this.serverTaskId.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.nleDraft.hashCode()) * 31;
        MusicInfo musicInfo = this.musicInfo;
        int iHashCode2 = (iHashCode + (musicInfo == null ? 0 : musicInfo.hashCode())) * 31;
        List<AutoPickTaskResponse> list = this.autoPickTaskResponses;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutServerTaskOutput(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.errorMsg);
        sbLIZ.append(", failReasonMsg=");
        sbLIZ.append(this.failReasonMsg);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.serverTaskId);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", nleDraft=");
        sbLIZ.append(this.nleDraft);
        sbLIZ.append(", musicInfo=");
        sbLIZ.append(this.musicInfo);
        sbLIZ.append(", autoPickTaskResponses=");
        sbLIZ.append(this.autoPickTaskResponses);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final int LIZ() {
        return this.errorCode;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZIZ() {
        return this.errorMsg;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LIZLLL() {
        return this.failReasonMsg;
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput
    public final String LJ() {
        return this.status;
    }

    public AutoCutServerTaskOutput(String str, int i, String str2, String str3, String str4, String str5, String str6, MusicInfo musicInfo, List<AutoPickTaskResponse> list) {
        super(str, i, str2, null, "");
        this.status = str;
        this.errorCode = i;
        this.errorMsg = str2;
        this.failReasonMsg = str3;
        this.serverTaskId = str4;
        this.requestId = str5;
        this.nleDraft = str6;
        this.musicInfo = musicInfo;
        this.autoPickTaskResponses = list;
    }
}
