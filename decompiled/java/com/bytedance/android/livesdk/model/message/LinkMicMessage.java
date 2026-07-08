package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public class LinkMicMessage extends AbstractC1136060ffY {

    @C09CT("access_key")
    public String accessKey;

    @C09CT("anchor_linkmic_id")
    public int anchorLinkMicId;

    @C09CT("anchor_linkmic_id_str")
    public String anchorLinkMicIdStr;

    @C09CT("app_id")
    public String appId;

    @C09CT("app_sign")
    public String appSign;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("confluence_type")
    public int confluenceType;

    @C09CT("dimension")
    public int dimension;

    @C09CT("duration")
    public int duration;

    @C09CT("fan_ticket")
    public long fanTicket;

    @C09CT("fan_ticket_icon_type")
    public int fanTicketType;

    @C09CT("from_room_id")
    public long fromRoomId;

    @C09CT("invite_type")
    public int inviteType;

    @C09CT("invite_uid")
    public long inviteUid;

    @C09CT("layout")
    public int layout;

    @C09CT("message_type")
    public int mType;

    @C09CT("match_type")
    public int matchType;

    @C09CT("prompts")
    public String prompts;

    @C09CT("answer")
    public int reply;

    @C09CT("rival_anchor_id")
    public long rivalAnchorId;

    @C09CT("rival_linkmic_id")
    public int rivalLinkmicId;

    @C09CT("rival_linkmic_id_str")
    public String rivalLinkmicIdStr;

    @C09CT("rtc_ext_info")
    public String rtcExtInfo;

    @C09CT("rtc_join_channel")
    public boolean rtcJoinChannel;

    @C09CT("show_popup")
    public boolean shouldShowPopup;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("sub_type")
    public long subType;

    @C09CT("theme")
    public String theme;

    @C09CT("tips")
    public String tips;

    @C09CT("to_user_id")
    public long toUserId;

    @C09CT("total_linkmic_fan_ticket")
    public long totalFanTicket;

    @C09CT("user_id")
    public long userId;

    @C09CT("vendor")
    public int vendor;

    @C09CT("win")
    public boolean win;

    public LinkMicMessage() {
        this.type = C001A.LINK_MIC;
    }
}
