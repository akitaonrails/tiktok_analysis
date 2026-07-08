package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.linkmic.common.GroupChannelAllUser;

/* JADX INFO: loaded from: classes16.dex */
public final class RechargeResult {
    public final long channelId;
    public final GroupChannelAllUser groupChannelAllUser;
    public final boolean isCrossArch;
    public final String logId;
    public final Function0<Unit> resumeAction;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeResult(groupChannelAllUser=");
        sbLIZ.append(this.groupChannelAllUser);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", isCrossArch=");
        sbLIZ.append(this.isCrossArch);
        sbLIZ.append(", resumeAction=");
        sbLIZ.append(this.resumeAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isCrossArch() {
        return this.isCrossArch;
    }

    public RechargeResult(GroupChannelAllUser groupChannelAllUser, String str, long j, boolean z, Function0<Unit> function0) {
        this.groupChannelAllUser = groupChannelAllUser;
        this.logId = str;
        this.channelId = j;
        this.isCrossArch = z;
        this.resumeAction = function0;
    }
}
