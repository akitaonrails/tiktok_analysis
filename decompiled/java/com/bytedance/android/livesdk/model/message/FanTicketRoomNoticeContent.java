package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FanTicketRoomNoticeContent {

    @C09CT("event_time")
    public long eventTime;

    @C09CT("fan_ticket_icon_url")
    public String fanTicketIconUrl = "";

    @C09CT("match_id")
    public long matchId;

    @C09CT("play_id")
    public long playId;

    @C09CT("play_scene")
    public int playScene;

    @C09CT("score_type")
    public int scoreType;

    @C09CT("total_linkmic_fan_ticket")
    public long totalLinkmicFanTicket;

    @C09CT("user_fan_ticket")
    public List<UserFanTicket> userFanTicket;

    @C09CT("version")
    public long version;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanTicketRoomNoticeContent{scoreType=");
        sbLIZ.append(this.scoreType);
        sbLIZ.append(", playScene=");
        sbLIZ.append(this.playScene);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", userFanTicket=");
        sbLIZ.append(this.userFanTicket);
        sbLIZ.append(", totalLinkmicFanTicket=");
        sbLIZ.append(this.totalLinkmicFanTicket);
        sbLIZ.append(", matchId=");
        sbLIZ.append(this.matchId);
        sbLIZ.append(", eventTime=");
        sbLIZ.append(this.eventTime);
        sbLIZ.append(", fanTicketIconUrl='");
        sbLIZ.append(this.fanTicketIconUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", playId=");
        sbLIZ.append(this.playId);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
