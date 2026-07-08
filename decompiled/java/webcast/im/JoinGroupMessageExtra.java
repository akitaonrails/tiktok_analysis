package webcast.im;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.OptPairInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalsGameTag;
import com.bytedance.android.livesdk.chatroom.model.interact.TopHostInfo;
import com.bytedance.android.livesdk.model.Hashtag;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class JoinGroupMessageExtra {

    @C09CT("extra")
    public RivalExtra extra;

    @C09CT("invitation_reorder_extra")
    public InvitationReorderExtra invitationReorderExtra;

    @C09CT("is_from_cohost_over_issue")
    public boolean isFromCohostOverIssue;

    @C09CT("other_users")
    public List<RivalExtra> otherUsers = new ArrayList();

    @C09CT("rival_guests_map")
    public Map<Long, RivalGuestExtras> rivalGuestsMap = new LinkedHashMap();

    @C09CT("source_type")
    public long sourceType;

    public static final class InvitationReorderExtra {

        @C09CT("strategy_name")
        public String strategyName = "";

        @C09CT("strategy_number")
        public long strategyNumber;

        @C09CT("strategy_score")
        public double strategyScore;
    }

    public static final class RivalExtra {

        @C09CT("activity_badge_info")
        public ActivityBadgeInfo activityBadgeInfo;

        @C09CT("authentication_info")
        public AuthenticationInfo authenticationInfo;

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("eoy_level")
        public long eoyLevel;

        @C09CT("follow_status")
        public long followStatus;

        @C09CT("follower_count")
        public long followerCount;

        @C09CT("game_tag")
        public RivalsGameTag gameTag;

        @C09CT("gift_gallery_badge_info")
        public GiftGalleryBadgeInfo giftGalleryBadgeInfo;

        @C09CT("hashtag")
        public Hashtag hashtag;

        @C09CT("is_best_teammate")
        public boolean isBestTeammate;

        @C09CT("nudge_info")
        public int nudgeInfo;

        @C09CT("opt_pair_info")
        public OptPairInfo optPairInfo;

        @C09CT("reservation_id")
        public long reservationId;

        @C09CT("room_id")
        public long roomId;

        @C09CT("top_host_info")
        public TopHostInfo topHostInfo;

        @C09CT("user_count")
        public long userCount;

        @C09CT("user_id")
        public long userId;

        @C09CT("display_id")
        public String displayId = "";

        @C09CT("nickname")
        public String nickname = "";

        public static final class AuthenticationInfo {

            @C09CT("authentication_badge")
            public ImageModel authenticationBadge;

            @C09CT("custom_verify")
            public String customVerify = "";

            @C09CT("enterprise_verify_reason")
            public String enterpriseVerifyReason = "";
        }
    }

    public static final class RivalGuestExtra {

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("nickname")
        public String nickname = "";

        @C09CT("user_id")
        public long userId;
    }

    public static final class RivalGuestExtras {

        @C09CT("rival_guests")
        public List<RivalGuestExtra> rivalGuests = new ArrayList();
    }
}
