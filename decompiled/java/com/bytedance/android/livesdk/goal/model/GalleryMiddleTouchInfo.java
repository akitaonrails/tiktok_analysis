package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class GalleryMiddleTouchInfo {

    @C09CT("all_gallery_gift_count")
    public long allGalleryGiftCount;

    @C09CT("all_gift_lit_up_info")
    public AllGiftLitUpInfo allGiftLitUpInfo;

    @C09CT("gallery_lit_up_gift_count")
    public long galleryLitUpGiftCount;

    @C09CT("gallery_period")
    public long galleryPeriod;

    @C09CT("period_end_time")
    public long periodEndTime;

    @C09CT("region")
    public String region = "";

    @C09CT("show_gallery_mid_touch")
    public boolean showGalleryMidTouch;

    @C09CT("single_lit_up_info")
    public SingleGiftLitUpInfo singleLitUpInfo;

    @C09CT("sponsorship_change_info")
    public SponsorshipChangeInfo sponsorshipChangeInfo;

    @C09CT("timing")
    public int timing;

    public static final class AllGiftLitUpInfo {

        @C09CT("last_lit_up_gift")
        public GiftInfo lastLitUpGift;

        @C09CT("last_sponsorship")
        public SponsorshipInfo lastSponsorship;
    }

    public static final class GiftInfo {

        @C09CT("gift_icon")
        public ImageModel giftIcon;

        @C09CT("gift_id")
        public long giftId;
    }

    public static final class SingleGiftLitUpInfo {

        @C09CT("lit_up_gift")
        public GiftInfo litUpGift;

        @C09CT("sponsorship")
        public SponsorshipInfo sponsorship;
    }

    public static final class SponsorshipChangeInfo {

        @C09CT("current_sponsorship")
        public SponsorshipInfo currentSponsorship;

        @C09CT("lit_up_gift")
        public GiftInfo litUpGift;

        @C09CT("previous_sponsorship")
        public SponsorshipInfo previousSponsorship;
    }

    public static final class SponsorshipInfo {

        @C09CT("sponsor_avatar")
        public ImageModel sponsorAvatar;

        @C09CT("user_id")
        public long userId;
    }
}
