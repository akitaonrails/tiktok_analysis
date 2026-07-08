package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class UserFanTicket {

    @C09CT("completion_progress_percent")
    public int completionProgressPercent;

    @C09CT("countdown_info")
    public UserCountdownInfo countdownInfo;

    @C09CT("fan_ticket")
    public long fanTicket;

    @C09CT("match_rank")
    public int matchRank;

    @C09CT("match_total_score")
    public long matchTotalScore;

    @C09CT("play_info")
    public UserPlayInfo playInfo;

    @C09CT("top_guest_rank")
    public int topGuestRank;

    @C09CT("user_id")
    public long userId;

    @C09CT("ticket_ui_style_v2")
    public String ticketUiStyleV2 = "";

    @C09CT("animation_name")
    public String animationName = "";

    @C09CT("ticket_ui_style")
    public String ticketUiStyle = "";

    @C09CT("icon_name")
    public String iconName = "";
    public String LIZ = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserFanTicket{completionProgressPercent=");
        sbLIZ.append(this.completionProgressPercent);
        sbLIZ.append(", animationName='");
        sbLIZ.append(this.animationName);
        sbLIZ.append('\'');
        sbLIZ.append(", ticketUiStyle='");
        sbLIZ.append(this.ticketUiStyle);
        sbLIZ.append('\'');
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", fanTicket=");
        sbLIZ.append(this.fanTicket);
        sbLIZ.append(", matchTotalScore=");
        sbLIZ.append(this.matchTotalScore);
        sbLIZ.append(", matchRank=");
        sbLIZ.append(this.matchRank);
        sbLIZ.append(", countdownInfo=");
        sbLIZ.append(this.countdownInfo);
        sbLIZ.append(", playInfo=");
        sbLIZ.append(this.playInfo);
        sbLIZ.append(", iconName='");
        sbLIZ.append(this.iconName);
        sbLIZ.append('\'');
        sbLIZ.append(", linkMicId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
