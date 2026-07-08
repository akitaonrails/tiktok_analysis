package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.api.gift.GalleryAnchorInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GiftGalleryResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("all_lit_up_spend_time_sec")
        public long allLitUpSpendTimeSec;

        @C09CT("available_swap_card")
        public int availableSwapCard;

        @C09CT("campaign")
        public GiftGalleryCampaign campaign;

        @C09CT("campaign_banner")
        public CampaignBanner campaignBanner;

        @C09CT("can_change_sponsor")
        public boolean canChangeSponsor;

        @C09CT("class_type")
        public int classType;

        /* JADX INFO: renamed from: compliance, reason: collision with root package name */
        @C09CT("compliance")
        public Compliance f312compliance;

        @C09CT("current_period_ends_at")
        public long currentPeriodEndsAt;

        @C09CT("current_period_starts_at")
        public long currentPeriodStartsAt;

        @C09CT("current_timestamp")
        public long currentTimestamp;

        @C09CT("enigma_optout_status")
        public int enigmaOptoutStatus;

        @C09CT("gallery_duel_info")
        public GalleryDuelBaseInfo galleryDuelInfo;

        @C09CT("gallery_normal_gift_sub_league")
        public boolean galleryNormalGiftSubLeague;

        @C09CT("gallery_ranking_icon_url")
        public ImageModel galleryRankingIconUrl;

        @C09CT("gift_gallery_video_report")
        public GiftGalleryVideoReportInfo giftGalleryVideoReport;

        @C09CT("gift_gallery_video_report_status")
        public int giftGalleryVideoReportStatus;

        @C09CT("incoming_gifts_start_date")
        public long incomingGiftsStartDate;

        @C09CT("last_refunded_time")
        public int lastRefundedTime;

        @C09CT("last_visit_time")
        public long lastVisitTime;

        @C09CT("offset_date")
        public long offsetDate;

        @C09CT("ops_banner")
        public OpsBanner opsBanner;

        @C09CT("ops_info")
        public OpsInfo opsInfo;

        @C09CT("period")
        public long period;

        @C09CT("should_show_gallery_goal_button")
        public boolean shouldShowGalleryGoalButton;

        @C09CT("special_gift_banner")
        public SpecialGiftBannerInfo specialGiftBanner;

        @C09CT("sponsor_change_times_uplimit")
        public long sponsorChangeTimesUplimit;

        @C09CT("swap_campaign")
        public GiftGallerySwapCampaign swapCampaign;

        @C09CT("theme_info")
        public GalleryThemeInfo themeInfo;

        @C09CT("vault_top_sponsor_banner")
        public VaultTopSponsorBanner vaultTopSponsorBanner;

        @C09CT("viewer_optout_status")
        public int viewerOptoutStatus;

        @C09CT("viewer_optout_timestamp")
        public long viewerOptoutTimestamp;

        @C09CT("anchor_nick_name")
        public String anchorNickName = "";

        @C09CT("normal_gifts")
        public List<GiftInfo> normalGifts = new ArrayList();

        @C09CT("ops_gifts")
        public List<GiftInfo> opsGifts = new ArrayList();

        @C09CT("current_user_progress")
        public Map<Long, SponsorProgress> currentUserProgress = new LinkedHashMap();

        @C09CT("anchor_ranking_league")
        public String anchorRankingLeague = "";

        @C09CT("gallery_ranking_league")
        public String galleryRankingLeague = "";

        @C09CT("anchor_avatar_url")
        public String anchorAvatarUrl = "";

        @C09CT("card_expire_info")
        public Map<Long, Long> cardExpireInfo = new LinkedHashMap();

        @C09CT("incoming_gifts")
        public List<GiftInfo> incomingGifts = new ArrayList();

        @C09CT("special_gift_lists")
        public List<SpecialGiftListInfo> specialGiftLists = new ArrayList();

        public static final class GiftGalleryVideoReportInfo {

            @C09CT("anchor_highlight_id")
            public String anchorHighlightId = "";
        }
    }

    public static final class Extra {

        @C09CT("log_id")
        public String logId = "";
    }

    public static final class GalleryDuelBaseInfo {

        @C09CT("duel_status")
        public int duelStatus;

        @C09CT("opponent_info")
        public GalleryAnchorInfo opponentInfo;

        @C09CT("opt_out_all_time")
        public boolean optOutAllTime;

        @C09CT("self_info")
        public GalleryAnchorInfo selfInfo;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class GiftGalleryCampaign {

        @C09CT("current_level")
        public int currentLevel;

        @C09CT("num_required_gift")
        public int numRequiredGift;

        @C09CT("top_sponsors")
        public List<Sponsor> topSponsors = new ArrayList();
    }

    public static final class GiftGallerySwapCampaign {

        @C09CT("campaign_rank_info")
        public CampaignRankInfo campaignRankInfo;

        @C09CT("settle_reward_count")
        public int settleRewardCount;

        @C09CT("reward_point")
        public List<Integer> rewardPoint = new ArrayList();

        @C09CT("campaign_page_link")
        public String campaignPageLink = "";

        public static final class CampaignRankInfo {

            @C09CT("rank")
            public int rank;

            @C09CT("score_gap")
            public int scoreGap;
        }
    }

    public static final class OpsInfo {

        @C09CT("detailed_page_statuses")
        public Map<Long, Integer> detailedPageStatuses = new LinkedHashMap();

        @C09CT("period")
        public Period period;

        @C09CT("type")
        public int type;
    }

    public static final class Period {

        @C09CT("ends_at_s")
        public long endsAtS;

        @C09CT("starts_at_s")
        public long startsAtS;
    }

    public static final class SpecialGiftBannerInfo {

        @C09CT("banner_id")
        public long bannerId;

        @C09CT("end_s")
        public long endS;

        @C09CT("start_s")
        public long startS;

        @C09CT("gift_infos")
        public List<GiftInfo> giftInfos = new ArrayList();

        @C09CT("banner_text")
        public String bannerText = "";

        @C09CT("popup_title")
        public String popupTitle = "";

        @C09CT("popup_text")
        public String popupText = "";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class SpecialGiftListInfo {

        @C09CT("end_s")
        public long endS;

        @C09CT("start_s")
        public long startS;

        @C09CT("title")
        public String title = "";

        @C09CT("gift_list")
        public List<GiftInfo> giftList = new ArrayList();

        @C09CT("gift_source")
        public String giftSource = "";
    }

    public static final class Sponsor {

        @C09CT("num_lit_up")
        public int numLitUp;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("avatar_url")
        public String avatarUrl = "";
    }

    public static final class VaultTopSponsorBanner {

        @C09CT("redirect_page_url")
        public String redirectPageUrl = "";

        @C09CT("show_banner_type")
        public int showBannerType;

        @C09CT("vault_sponsor_info")
        public VaultSponsorInfo vaultSponsorInfo;

        public static final class VaultSponsorInfo {

            @C09CT("avatar_image")
            public String avatarImage = "";

            @C09CT("nickname")
            public String nickname = "";

            @C09CT("sponsor_id_str")
            public String sponsorIdStr = "";
        }
    }
}
