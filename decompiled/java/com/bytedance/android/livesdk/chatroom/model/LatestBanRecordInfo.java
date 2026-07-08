package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public class LatestBanRecordInfo {

    @C09CT("ban_count")
    public int banCount;

    @C09CT("ban_duration")
    public long banDuration;

    @C09CT("ban_reason")
    public String banReason;

    @C09CT("ban_source")
    public int banSource = 1;

    @C09CT("ban_time")
    public long banTime;

    @C09CT("ban_time_left")
    public long banTimeLeft;

    @C09CT("detail_url")
    public String detailUrl;

    @C09CT("is_banned_forever")
    public boolean isBannedForever;

    @C09CT("log_id")
    public long logId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LatestBanRecordInfo{isBannedForever=");
        sbLIZ.append(this.isBannedForever);
        sbLIZ.append(", banTimeLeft=");
        sbLIZ.append(this.banTimeLeft);
        sbLIZ.append(", banTime=");
        sbLIZ.append(this.banTime);
        sbLIZ.append(", banDuration=");
        sbLIZ.append(this.banDuration);
        sbLIZ.append(", banSource=");
        sbLIZ.append(this.banSource);
        sbLIZ.append(", detailUrl=");
        sbLIZ.append(this.detailUrl);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
