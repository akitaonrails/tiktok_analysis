package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.aigc.asynctask.GenerateExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutAgentTaskBody {
    public static final int $stable = 8;

    @C09CT("asset_infos_json")
    public final String assetInfosJson;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("extra_info")
    public final GenerateExtraInfo extraInfo;

    @C09CT("pick_id")
    public final String pickId;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("theme_str")
    public final String themeStr;

    @C09CT("thread_id")
    public final String threadId;

    @C09CT("ver_num")
    public final int verNum;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentTaskBody)) {
            return false;
        }
        AutoCutAgentTaskBody autoCutAgentTaskBody = (AutoCutAgentTaskBody) obj;
        return Intrinsics.LJFF(this.assetInfosJson, autoCutAgentTaskBody.assetInfosJson) && Intrinsics.LJFF(this.requestId, autoCutAgentTaskBody.requestId) && Intrinsics.LJFF(this.threadId, autoCutAgentTaskBody.threadId) && Intrinsics.LJFF(this.creationId, autoCutAgentTaskBody.creationId) && Intrinsics.LJFF(this.extraInfo, autoCutAgentTaskBody.extraInfo) && Intrinsics.LJFF(this.themeStr, autoCutAgentTaskBody.themeStr) && this.verNum == autoCutAgentTaskBody.verNum && Intrinsics.LJFF(this.pickId, autoCutAgentTaskBody.pickId);
    }

    public int hashCode() {
        int iHashCode = ((((((this.assetInfosJson.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.threadId.hashCode()) * 31) + this.creationId.hashCode()) * 31;
        GenerateExtraInfo generateExtraInfo = this.extraInfo;
        return ((((((iHashCode + (generateExtraInfo == null ? 0 : generateExtraInfo.hashCode())) * 31) + this.themeStr.hashCode()) * 31) + this.verNum) * 31) + this.pickId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentTaskBody(assetInfosJson=");
        sbLIZ.append(this.assetInfosJson);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.requestId);
        sbLIZ.append(", threadId=");
        sbLIZ.append(this.threadId);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(", themeStr=");
        sbLIZ.append(this.themeStr);
        sbLIZ.append(", verNum=");
        sbLIZ.append(this.verNum);
        sbLIZ.append(", pickId=");
        sbLIZ.append(this.pickId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AutoCutAgentTaskBody(String str, String str2, String str3, String str4, GenerateExtraInfo generateExtraInfo, String str5, int i, String str6) {
        this.assetInfosJson = str;
        this.requestId = str2;
        this.threadId = str3;
        this.creationId = str4;
        this.extraInfo = generateExtraInfo;
        this.themeStr = str5;
        this.verNum = i;
        this.pickId = str6;
    }
}
