package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinkInRoomReplyResponse {

    @C09CT("access_key")
    public String accessKey;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("from_room_id")
    public long fromRoomId;

    @C09CT("from_uid")
    public long fromUid;

    @C09CT("link_mic_id")
    public long linkMicId;

    @C09CT("linkmic_id_str")
    public String linkMicIdStr;

    @C09CT("rival_linkmic_id")
    public String rivalLinkMicId;

    @C09CT("rival_linkmic_id_str")
    public String rivalLinkMicIdStr;

    @C09CT("rtc_app_id")
    public String rtcAppId;

    @C09CT("rtc_app_sign")
    public String rtcAppSign;

    @C09CT("rtc_ext_info")
    public String rtcExtInfo;

    @C09CT("to_room_id")
    public long toRoomId;

    @C09CT("to_uid")
    public long toUid;

    @C09CT("mic_idx_to_user_id_map")
    public HashMap<Long, Long> micIndexToUidMap = new HashMap<>();

    @C09CT("anchor_use_multi_live_new_layout")
    public boolean userMultiLiveLayout = false;

    @C09CT("anchor_new_layout")
    public int anchorNewLayout = 0;

    @C09CT("anchor_new_fix_mic_num")
    public int fixSwitchOn = 0;

    @C09CT("link_type_permission")
    public long linkTypePermission = 0;

    @C09CT("reply_im_msg_id")
    public long replyId = 0;
}
