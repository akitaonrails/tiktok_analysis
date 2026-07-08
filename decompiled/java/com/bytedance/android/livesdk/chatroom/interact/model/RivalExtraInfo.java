package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalsGameTag;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.chatroom.model.interact.UserSuggestionInfo;

/* JADX INFO: loaded from: classes.dex */
public class RivalExtraInfo {

    @C09CT("activity_badge_info")
    public ActivityBadgeInfo activityBadgeInfo;

    @C09CT("anchor_layer")
    public int anchorLayer;

    @C09CT("battle_info")
    public BattleInfo battleInfo;

    @C09CT("cohost_layout_mode")
    public int cohostLayoutMode;

    @C09CT("detail_block_reason")
    public int detailBlockReason;

    @C09CT("eoy_level")
    public long eoyLevel;

    @C09CT("friend_suggestion_info")
    public UserSuggestionInfo friendSuggestionInfo;

    @C09CT("game_tag")
    public RivalsGameTag gameTag;

    @C09CT("gift_gallery_badge_info")
    public GiftGalleryBadgeInfo giftGalleryBadgeInfo;

    @C09CT("invite_block_reason")
    public int inviteBlockReason;

    @C09CT("label")
    public String label;

    @C09CT("linker_info")
    public LinkerInfo linkerInfo;

    @C09CT("linkmic_user_settings")
    public AnchorLinkmicUserSettings linkmicUserSettings;

    @C09CT("offlive_invite_info")
    public OffliveInviteInfo offliveInviteInfo;

    @C09CT("opt_pair_info")
    public OptPairInfo optPairInfo;

    @C09CT("reserve_info")
    public ReserveInfo reserveInfo;

    @C09CT("show_play_type")
    public int showPlayType;

    @C09CT("tag")
    public Tag tag;

    @C09CT("tag_v2")
    public TagV2 tagV2;

    @C09CT("text")
    public String text;

    @C09CT("text_type")
    public int text_type;

    @C09CT("user_suggestion_info")
    public UserSuggestionInfo userSuggestionInfo;

    public static final class BattleInfo {

        @C09CT("info_type")
        public int infoType;

        @C09CT("value")
        public long value;
    }

    public static final class OffliveInviteInfo {

        @C09CT("inviter_timestamp")
        public long inviterTimestamp;
    }

    public static final class ReserveInfo {

        @C09CT("bubble_tip")
        public String bubbleTip = "";

        @C09CT("created_timestamp")
        public long createdTimestamp;

        @C09CT("is_reservation_sender")
        public boolean isReservationSender;

        @C09CT("reply_status")
        public int replyStatus;

        @C09CT("reservation_id")
        public long reservationId;

        @C09CT("response_time")
        public long responseTime;

        @C09CT("viewed")
        public boolean viewed;
    }

    public static class Tag {

        @C09CT("tag_text")
        public String tagText;

        @C09CT("tag_type")
        public int tagType;

        @C09CT("tag_value")
        public String tagValue;
    }
}
