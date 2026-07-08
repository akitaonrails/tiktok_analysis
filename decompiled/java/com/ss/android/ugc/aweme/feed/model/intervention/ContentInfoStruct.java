package com.ss.android.ugc.aweme.feed.model.intervention;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentInfoStruct {
    public static final int $stable = 8;

    @C09CT("aweme_id")
    public String awemeId;

    @C09CT("is_client_seen")
    public boolean isClientSeen;

    @C09CT("market_sub_type")
    public int marketSubType;

    @C09CT("operator_info_list")
    public List<OperatorInfoStruct> operatorInfoList;

    @C09CT("server_extra_info")
    public String serverExtraInfo;

    @C09CT("log_id")
    public String logId = "";

    @C09CT("last_seen_pos")
    public int lastSeenPos = -1;

    @C09CT("sl_pos")
    public int slPos = -1;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Info(aid=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", op=");
        sbLIZ.append(this.operatorInfoList);
        sbLIZ.append(", type=");
        sbLIZ.append(this.marketSubType);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.serverExtraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getLastSeenPos() {
        return this.lastSeenPos;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final int getMarketSubType() {
        return this.marketSubType;
    }

    public final List<OperatorInfoStruct> getOperatorInfoList() {
        return this.operatorInfoList;
    }

    public final String getServerExtraInfo() {
        return this.serverExtraInfo;
    }

    public final int getSlPos() {
        return this.slPos;
    }

    public final boolean isClientSeen() {
        return this.isClientSeen;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setClientSeen(boolean z) {
        this.isClientSeen = z;
    }

    public final void setLastSeenPos(int i) {
        this.lastSeenPos = i;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setMarketSubType(int i) {
        this.marketSubType = i;
    }

    public final void setOperatorInfoList(List<OperatorInfoStruct> list) {
        this.operatorInfoList = list;
    }

    public final void setServerExtraInfo(String str) {
        this.serverExtraInfo = str;
    }

    public final void setSlPos(int i) {
        this.slPos = i;
    }
}
