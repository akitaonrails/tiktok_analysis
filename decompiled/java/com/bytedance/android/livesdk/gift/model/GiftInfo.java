package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftInfo {

    @C09CT("activity_info")
    public ActivityInfo activityInfo;

    @C09CT("button_info")
    public GalleryGiftButtonInfo buttonInfo;

    @C09CT("can_sponsor")
    public boolean canSponsor;

    @C09CT("coin_price")
    public long coinPrice;

    @C09CT("current_sent_count")
    public long currentSentCount;

    @C09CT("gallery_gift_tag_type")
    public int galleryGiftTagType;

    @C09CT("goal_count")
    public long goalCount;

    @C09CT("is_sponsor")
    public boolean isSponsor;

    @C09CT("sponsor_info")
    public SponsorInfo sponsorInfo;

    @C09CT("sponsored")
    public boolean sponsored;

    @C09CT("sponsorship_require_count")
    public long sponsorshipRequireCount;

    @C09CT("swapped")
    public boolean swapped;

    @C09CT("gift_id")
    public String giftId = "";

    @C09CT("image_url")
    public String imageUrl = "";

    @C09CT("unlighted_image_url")
    public String unlightedImageUrl = "";

    @C09CT("name")
    public String name = "";

    @C09CT("sponsor_rank")
    public List<SponsorInfo> sponsorRank = new ArrayList();

    @C09CT("biz_extra")
    public Map<Long, String> bizExtra = new LinkedHashMap();

    @C09CT("gallery_gift_tag_url")
    public String galleryGiftTagUrl = "";

    public static final class SponsorInfo {

        @C09CT("anchor_has_followed")
        public boolean anchorHasFollowed;

        @C09CT("became_sponsor_times")
        public long becameSponsorTimes;

        @C09CT("enigma_info")
        public User.EnigmaInfo enigmaInfo;

        @C09CT("last_send_time_sec")
        public long lastSendTimeSec;

        @C09CT("persona_info")
        public SponsorPersonaInfo personaInfo;

        @C09CT("sent_count")
        public long sentCount;

        @C09CT("user_has_optout")
        public boolean userHasOptout;

        @C09CT("avatar_image")
        public String avatarImage = "";

        @C09CT("nickname")
        public String nickname = "";

        @C09CT("sponsor_id")
        public String sponsorId = "";
    }
}
