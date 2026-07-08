package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* JADX INFO: loaded from: classes.dex */
public final class BizApplyResponseData {

    @C09CT("execute_link_source")
    public int executeLinkSource;

    @C09CT("execute_reason")
    public int executeReason;

    @C09CT("host_perception_info")
    public PerceptionMessage hostPerceptionInfo;

    @C09CT("link_type_permission")
    public long linkTypePermission;

    @C09CT("perception_info")
    public PerceptionMessage perceptionInfo;

    public BizApplyResponseData() {
        this(0L, null, null, 0, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizApplyResponseData(linkTypePermission=");
        sbLIZ.append(this.linkTypePermission);
        sbLIZ.append(", perceptionInfo=");
        sbLIZ.append(this.perceptionInfo);
        sbLIZ.append(", hostPerceptionInfo=");
        sbLIZ.append(this.hostPerceptionInfo);
        sbLIZ.append(", executeReason=");
        sbLIZ.append(this.executeReason);
        sbLIZ.append(", executeLinkSource=");
        sbLIZ.append(this.executeLinkSource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BizApplyResponseData(long j, PerceptionMessage perceptionMessage, PerceptionMessage perceptionMessage2, int i, int i2) {
        this.linkTypePermission = j;
        this.perceptionInfo = perceptionMessage;
        this.hostPerceptionInfo = perceptionMessage2;
        this.executeReason = i;
        this.executeLinkSource = i2;
    }
}
