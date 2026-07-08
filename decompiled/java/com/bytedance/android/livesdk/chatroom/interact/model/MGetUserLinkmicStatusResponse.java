package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MGetUserLinkmicStatusResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }

    public static final class LinkmicStatus {

        @C09CT("block_reason")
        public int blockReason;

        @C09CT("cohost_layout_mode")
        public int cohostLayoutMode;

        @C09CT("detail_block_reason")
        public int detailBlockReason;

        @C09CT("linker_info")
        public LinkerInfo linkerInfo;

        @C09CT("opt_pair_info")
        public OptPairInfo optPairInfo;

        @C09CT("play_type")
        public int playType;

        @C09CT("reserve_info")
        public RivalExtraInfo.ReserveInfo reserveInfo;
    }

    public static final class OptPairLinkmicStatus {

        @C09CT("block_reason")
        public int blockReason;

        @C09CT("is_in_linkmic")
        public Map<Long, Boolean> isInLinkmic;

        @C09CT("opt_pair_info")
        public OptPairInfo optPairInfo;

        @C09CT("play_type")
        public int playType;

        @C09CT("request_room_list")
        public List<Long> requestRoomList;

        @C09CT("request_room_list_str")
        public List<String> requestRoomListStr;

        @C09CT("show_view_button")
        public boolean showViewButton;
    }

    public static final class RemindStatus {

        @C09CT("can_remind")
        public boolean canRemind;

        @C09CT("is_online")
        public boolean isOnline;

        @C09CT("reason")
        public int reason;
    }

    public static final class ResponseData {

        @C09CT("linkmic_status_map")
        public Map<Long, LinkmicStatus> linkmicStatusMap;

        @C09CT("new_rivals_room")
        public List<RivalsRoom> newRivalsRoom;

        @C09CT("opt_pair_linkmic_status")
        public Map<Long, OptPairLinkmicStatus> optPairLinkmicStatus;

        @C09CT("rivals_extra_info")
        public Map<Long, RivalExtraInfo> rivalsExtraInfo;

        @C09CT("rivals_room_info")
        public Map<Long, RivalsRoom> rivalsRoomInfo;

        @C09CT("room_info")
        public Map<Long, Room> roomInfo;

        @C09CT("status_text_type")
        public int statusTextType;

        @C09CT("user_remind_status")
        public Map<Long, RemindStatus> userRemindStatus;

        @C09CT("refresh_session_id")
        public String refreshSessionId = "";

        @C09CT("status_text")
        public String statusText = "";
    }

    public static final class RivalsRoom {

        @C09CT("cover")
        public ImageModel cover;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("link_mic")
        public RoomLinkInfo linkMic;

        @C09CT("owner")
        public User owner;

        @C09CT("start_time")
        public long startTime;

        @C09CT("user_count")
        public long userCount;

        @C09CT("with_linkmic")
        public boolean withLinkmic;

        @C09CT("id_str")
        public String idStr = "";

        @C09CT("title")
        public String title = "";
    }
}
