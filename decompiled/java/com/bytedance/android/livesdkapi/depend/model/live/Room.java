package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import X.C2188811AlT;
import X.C293501Bt;
import X.C495520Jby;
import X.InterfaceC2262081DgM;
import X.InterfaceC468260IXw;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.game.model.DropsRoomInfo;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;
import com.bytedance.android.livesdk.game.model.GameTagDetail;
import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;
import com.bytedance.android.livesdk.game.model.GuessWidgets;
import com.bytedance.android.livesdk.game.model.PlayTogetherBasicInfo;
import com.bytedance.android.livesdk.game.model.PlayTogetherExtraInfo;
import com.bytedance.android.livesdk.message.proto.LiveProInfo;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameCategoryInfo;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model.LikeInfo;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.QuickChatInfo;
import com.bytedance.android.livesdk.model.RoomAuthMessage;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.TopFanTicket;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webcast.api.feed.SpecialCard;
import webcast.data.AILivePreviewHighlight;
import webcast.data.AILivePreviewHighlightExtra;
import webcast.data.AILiveSummary;
import webcast.data.EventCard;
import webcast.data.GameGiftGuideKeywordsConfig;
import webcast.data.PreviewCommentInfo;

/* JADX INFO: loaded from: classes.dex */
public class Room implements InterfaceC468260IXw {

    @C09CT("activity_toggle_info")
    public ActivityToggleInfo activityToggleInfo;

    @C09CT("add_ttls_product_ts")
    public long addTtlsProductTs;

    @C09CT("adjust_display_order")
    public long adjustDisplayOrder;

    @C09CT("admin_ec_show_permission")
    public Map<Long, Long> adminEcShowPermission;

    @C09CT("advanced_poll_info")
    public PollInfo advancedPollInfo;

    @C09CT("age_restricted")
    public AgeRestricted ageRestricted;

    @C09CT("aggregation_data")
    public AggregationData aggregationData;

    @C09CT("ai_live_preview_highlight")
    public AILivePreviewHighlight aiLivePreviewHighlight;

    @C09CT("ai_live_preview_highlight_expect")
    public AILivePreviewHighlight aiLivePreviewHighlightExpect;

    @C09CT("ai_live_preview_highlight_extra")
    public AILivePreviewHighlightExtra aiLivePreviewHighlightExtra;

    @C09CT("ai_live_summary")
    public AILiveSummary aiLiveSummary;

    @C09CT("aigc_self_disclosure_switch")
    public boolean aigcSelfDisclosureSwitch;

    @C09CT("all_emoji_list")
    public List<String> allEmojiList;

    @C09CT("anchor_live_pro_info")
    public LiveProInfo anchorLiveProInfo;

    @C09CT("answering_question_content")
    public String answeringQuestion;

    @C09CT("asr_summary")
    public ASRSummary asrSummary;

    @C09CT("audio_mute")
    public int audioMute;

    @C09CT("avoid_config")
    public MsgNotifyComAvoidConfig avoidConfig;

    @C09CT("ba_leads_gen_info")
    public BaLeadsGenInfo baLeadsGenInfo;

    @C09CT("ba_link_info")
    public BALinkStruct baLinkStruct;

    @C09CT("background")
    public ImageModel background;

    @C09CT("bc_toggle_info")
    public BcToggleInfo bcToggleInfo;
    public ArrayList<String> bgUrls;

    @C09CT("biz_sticker_list")
    public List<RoomSticker> bizStickerList;

    @C09CT("blurred_cover")
    public ImageModel blurredCover;

    @C09CT("board_using_info")
    public BoardUsingInfo boardUsingInfo;

    @C09CT("caption_info")
    public CaptionInfo captionInfo;

    @C09CT("client_version")
    public String clientVersion;

    @C09CT("comment_has_text_emoji_emote")
    public int commentHasTextEmojiEmote;

    @C09CT("commerce_info_backup")
    public CommerceStruct commerceInfoBackup;

    @C09CT("commerce_info")
    public CommerceStruct commerceStruct;

    @C09CT("commercial_content_toggle")
    public CommercialContentToggle commercialContentToggle;

    @C09CT("commercial_welcome_message")
    public ProtoMessageFetchResult.BaseProtoMessage commercialWelcomeMessage;

    @C09CT("content_spotlight_rank_info")
    public ContentSpotlightRankInfo contentSpotlightRankInfo;

    @C09CT("continuous_room_quota_config")
    public Map<Long, MsgNotifyWatchContinuousQuota> continuousRoomQuotaConfig;

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("cover_type")
    public long coverType;

    @C09CT("cpp_version")
    public int cppVersion;

    @C09CT("create_time")
    public long createTime;

    @C09CT("creator")
    public Creator creator;

    @C09CT("current_interaction_question")
    public CurrentInteractionQuestion currentInteractionQuestion;

    @C09CT("custom_tab_info")
    public CustomTabInfo customTabInfo;

    @C09CT("decisions")
    public EpiphronDecision decisions;

    @C09CT("deco_list")
    public List<RoomDecoration> decorationList;

    @C09CT("detect_anchor_leave")
    public long detectAnchorLeave;

    @C09CT("disable_preview_sub_only")
    public long disablePreviewSubOnly;

    @C09CT("disable_screen_record")
    public boolean disableScreenRecord;

    @C09CT("drawer_tab_position")
    public String drawerTabPosition;
    public int drmTypeFromPreview;

    @C09CT("drop_comment_group")
    public long dropCommentGroup;

    @C09CT("drops_info")
    public DropsRoomInfo dropsInfo;

    @C09CT("dynamic_cover")
    public ImageModel dynamicCover;

    @C09CT("dynamic_cover_low")
    public ImageModel dynamicCoverLow;

    @C09CT("dynamic_text_info")
    public PublicCommonDynamicText dynamicTextInfo;

    @C09CT("ec_age_interval")
    public int ecAgeInterval;

    @C09CT("ec_live_head_params")
    public ECLiveHeadToLiveRoomParams ecLiveHeadParams;

    @C09CT("ecom_rank_info")
    public EcomRankInfo ecomRankInfo;

    @C09CT("ecom_room_type")
    public long ecomRoomType;

    @C09CT("ecommerce_activity_info")
    public EcommerceActivityInfo ecommerceActivityInfo;

    @C09CT("ecommerce_room_head_tag")
    public EcommerceRoomHeadTag ecommerceRoomHeadTag;

    @C09CT("ecommerce_room_tags")
    public List<EcommerceRoomTag> ecommerceRoomTags;

    @C09CT("effect_frame_upload_demotion")
    public long effectFrameUploadDemotion;

    @C09CT("effect_info")
    public List<EffectInfo> effectInfo;

    @C09CT("emoji_list")
    public List<String> emojiList;

    @C09CT("enable_optimize_sensitive_word")
    public boolean enableOptimizeSensitiveWord;

    @C09CT("enable_server_drop")
    public long enableServerDrop;

    @C09CT("enable_stream_encryption")
    public boolean enableStreamEncryption;

    @C09CT("enable_stream_translation")
    public boolean enableStreamTranslation;

    @C09CT("enlarge_view_info")
    public EnlargeViewInfo enlargeViewInfo;

    @C09CT("enter_nearby_info")
    public EnterNearByInfo enterNearbyInfo;
    public transient EnterRoomExtra enterRoomBoostExtra;

    @C09CT("enter_room_boost_extra")
    public String enterRoomBoostExtraStr;

    @C09CT("existed_commerce_goods")
    public boolean existedCommerceGoods;

    @C09CT("existed_commerce_goods_ts")
    public long existedCommerceGoodsTs;

    @C09CT("existed_ttls_goods")
    public boolean existedTtlsGoods;

    @C09CT("feed_room_label")
    public ImageModel feedRoomLabel;

    @C09CT("feed_room_labels")
    public List<FeedRoomLabel> feedRoomLabelList;
    public transient long fetchTimeStamp;

    @C09CT("filter_msg_rules")
    public List<LiveFilterMsgRule> filterRule;

    @C09CT("final_anchor_type")
    public int finalAnchorType;

    @C09CT("finish_time")
    public long finishTime;

    @C09CT("forbidden_copy")
    public boolean forbiddenCopy;

    @C09CT("fyp_commerce_info")
    public FYPCommerceStruct fypCommerceInfo;

    @C09CT("fyp_skylight_avatar_refresh")
    public long fypSkylightAvatarRefresh;

    @C09CT("fyp_watch_reason")
    public WatchReason fypWatchReason;

    @C09CT("game_category")
    public GameCategoryInfo gameCategoryInfo;

    @C09CT("game_demo")
    public long gameDemo;

    @C09CT("game_emotes_tab")
    public GameEmotesTab gameEmotesTab;

    @C09CT("game_gift_guide_config")
    public GameGiftGuideKeywordsConfig gameGiftGuideConfig;

    @C09CT("game_tag_detail")
    public GameTagDetail gameTagDetail;

    @C09CT("game_tag")
    public List<GameTag> gameTags;
    public ArrayList<String> gaussianBgUrls;

    @C09CT("gift_msg_style")
    public int giftMessageStyle;

    @C09CT("gift_poll_vote_enabled")
    public boolean giftPollVoteEnabled;

    @C09CT("gift_suspension")
    public GiftSuspension giftSuspension;

    @C09CT("group_live_info")
    public GroupLiveInfo groupLiveInfo;

    @C09CT("group_live_session")
    public GroupLiveSession groupLiveSession;

    @C09CT("gs_guessing_xtab_ab_param")
    public long gsGuessingXtabAbParam;

    @C09CT("guess_task_pack_info")
    public GuessTaskPackInfo guessTaskPackInfo;

    @C09CT("guess_widgets")
    public GuessWidgets guessWidgets;

    @C09CT("has_commerce_goods")
    public boolean hasCommerceGoods;

    @C09CT("has_more_history_comment")
    public boolean hasMoreHistoryComment;

    @C09CT("has_ttls_goods")
    public boolean hasTtlsGoods;

    @C09CT("has_ttls_live_permission")
    public boolean hasTtlsLivePermission;

    @C09CT("has_used_music")
    public boolean hasUsedMusic;

    @C09CT("has_viewer_wishes_game_tricks")
    public boolean hasViewerWishesGameTricks;

    @C09CT("hashtag")
    public Hashtag hashtag;

    @C09CT("have_wishlist")
    public boolean haveWishList;

    @C09CT("highlight_fragment_info")
    public HighlightFragmentInfo highlightFragmentInfo;

    @C09CT("history_comment_list")
    public List<ProtoMessageFetchResult.BaseProtoMessage> historyCommentList;

    @C09CT("host_board_status")
    public long hostBoardStatus;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("inner_watch_reason")
    public WatchReason innerWatchReason;

    @C09CT("interaction_question")
    public InteractionQuestionInfo interactionQuestion;

    @C09CT("interception")
    public boolean interception;
    public boolean isDouPlusPromotion;
    public boolean isFlare;
    public boolean isFromRecommendCard;

    @C09CT("is_game")
    public long isGame;
    public transient boolean isOfficialChannel;

    @C09CT("is_reposted_expect")
    public long isRepostedExpect;

    @C09CT("live_type_screenshot")
    public boolean isScreenshot;
    public boolean isShow;

    @C09CT("is_stream_low_latency")
    public boolean isStreamLowLatency;

    @C09CT("is_tag2_sfv_relation_pair")
    public boolean isTag2SfvRelationPair;

    @C09CT("live_type_third_party")
    public boolean isThirdParty;

    @C09CT("karaoke_info")
    public KaraokeInfo karaokeInfo;

    @C09CT("layout")
    public long layout;

    @C09CT("leads_ads_pin_card")
    public SubPinCard leadsAdsPinCard;

    @C09CT("like_agg_optimize_group")
    public long likeAggOptimizeGroup;

    @C09CT("like_count")
    public long likeCount;

    @C09CT("like_effect")
    public LikeEffect likeEffect;

    @C09CT("like_icon_info")
    public LikeIconInfo likeIconInfo;

    @C09CT("like_info")
    public LikeInfo likeInfo;

    @C09CT("link_mic")
    public RoomLinkInfo linkMicInfoGson;

    @C09CT("linker_map")
    public Map<String, Long> linkerMap;
    public transient int linkmicLayout;

    @C09CT("lite_user_not_visible")
    public boolean liteUserNotVisible;

    @C09CT("lite_user_visible")
    public boolean liteUserVisible;

    @C09CT("live_chain_info")
    public LiveChain liveChainInfo;

    @C09CT("live_event_card")
    public EventCard liveEventCard;

    @C09CT("live_event_info")
    public LiveEventInfo liveEventInfo;

    @C09CT("live_record_config")
    public LiveRecordConfig liveRecordConfig;

    @C09CT("live_room_mode")
    public int liveRoomMode;

    @C09CT("live_sub_only_month")
    public long liveSubOnlyMonth;

    @C09CT("live_sub_only_tier")
    public long liveSubOnlyTier;

    @C09CT("live_sub_only_use_music")
    public long liveSubOnlyUseMusic;

    @C09CT("live_type_audio")
    public boolean liveTypeAudio;

    @C09CT("live_type_sandbox")
    public boolean liveTypeSandbox;
    public String logPb;

    @C09CT("m2_guide_info")
    public M2GuideInfo m2GuideInfo;

    @C09CT("boost_status")
    public LiveGiftBoostCardRoomStatus mBoostCardRoomStatus;
    public String mFeatureItemId;
    public String mGuestRequestId;

    @C09CT("comment_name_mode")
    public int mNameMode;
    public String mRequestId;

    @C09CT("room_auth_message")
    public RoomAuthMessage mRoomAuthMessage;

    @C09CT("room_auth")
    public RoomAuthStatus mRoomAuthStatus;
    public String mUniqueItemId;
    public long mUserFrom;

    @C09CT("mask_layer")
    public MaskLayer maskLayer;

    @C09CT("max_continue_watch_mill_seconds")
    public long maxContinueWatchMillSeconds;

    @C09CT("max_preview_time")
    public long maxPreviewTime;

    @C09CT("mosaic_status")
    public int mosaicStatus;

    @C09CT("social_interaction")
    public MultiLiveUserSettings multiLiveUserSettings;

    @C09CT("multi_stream_id")
    public long multiStreamId;

    @C09CT("multi_stream_net_mode")
    public long multiStreamNetMode;

    @C09CT("multi_stream_source")
    public int multiStreamSource;

    @C09CT("multi_stream_url")
    public StreamUrl multiStreamUrl;

    @C09CT("nearby_info")
    public NearbyInfo nearbyInfo;

    @C09CT("net_mode")
    public long netMode;

    @C09CT("notice_fc_config")
    public NotifyFCConfig noticeFcConfig;
    public long nowTime;

    @C09CT("official_channel_anchor_live_pro_info")
    public LiveProInfo officialChannelAnchorLiveProInfo;

    @C09CT("official_channel_bc_toggle_info")
    public BcToggleInfo officialChannelBcToggleInfo;

    @C09CT("official_channel")
    public OfficialChannelInfo officialChannelInfo;

    @C09CT("online_audience")
    public OnlineAudience onlineAudience;

    @C09CT("orientation")
    public int orientation;

    @C09CT("owner")
    public User owner;

    @C09CT("owner_user_id")
    public long ownerUserId;

    @C09CT("paid_content_info")
    public PaidContentInfo paidContentInfo;

    @C09CT("paid_event")
    public PaidEvent paidEvent;

    @C09CT("parallel_pull_stream_info")
    public ParallelPullStreamInfo parallelPullStreamInfo;

    @C09CT("pico_live_type")
    public int picoLiveType;

    @C09CT("pictionary_info")
    public PictionaryFullInfo pictionaryFullInfo;

    @C09CT("pin_info")
    public PinInfo pinInfo;

    @C09CT("os_type")
    public int platform;

    @C09CT("play_together_extra_info")
    public PlayTogetherExtraInfo playTogetherExtraInfo;

    @C09CT("play_together_info")
    public PlayTogetherBasicInfo playTogetherInfo;

    @C09CT("poll_conf")
    public PollConf pollConf;

    @C09CT("polling_star_comment")
    public boolean pollingStarComment;

    @C09CT("preview_card_comment_box")
    public PreviewCardCommentBox previewCardCommentBox;

    @C09CT("preview_comment_info")
    public PreviewCommentInfo previewCommentInfo;

    @C09CT("preview_cta")
    public PreviewCTA previewCta;

    @C09CT("interaction_question_version")
    public int questionVersion;

    @C09CT("queue_info")
    public QueueInfo queueInfo;

    @C09CT("quick_chat_info")
    public QuickChatInfo quickChatInfo;

    @C09CT("quick_gift")
    public QuickGift quickGift;

    @C09CT("quota_config")
    public Map<Long, MsgNotifyQuota> quotaConfig;

    @C09CT("rank_comment_groups")
    public List<String> rankCommentGroups;

    @C09CT("rectangle_cover_img")
    public ImageModel rectangleCoverImg;

    @C09CT("regional_restricted")
    public RegionalRestricted regionalRestricted;

    @C09CT("repost_info")
    public RepostInfo repostInfo;

    @C09CT("reposted")
    public boolean reposted;

    @C09CT("room_banner")
    public BannerInRoomCollection roomBanner;

    @C09CT("room_create_user_info")
    public RoomCreateUserInfo roomCreateUserInfo;

    @C09CT("room_diff_fields_index")
    public List<Long> roomDiffFieldsIndex;
    public String roomFirstOrientation;

    @C09CT("room_layout")
    public int roomLayout;
    public String roomOrientation;

    @C09CT("room_pcu")
    public long roomPcu;

    @C09CT("room_sticker_list")
    public List<RoomSticker> roomStickerList;

    @C09CT("secret_room_access")
    public boolean secretRoomAccess;

    @C09CT("short_touch_items")
    public List<ShortTouchItem> shortTouchItems;

    @C09CT("show_emoji_list")
    public boolean showEmojiList;

    @C09CT("show_star_comment_entrance")
    public boolean showStarCommentEntrance;

    @C09CT("show_watch_live_cta")
    public boolean showWatchLiveCta;

    @C09CT("skin")
    public Skin skin;

    @C09CT("smb_board_id")
    public long smbBoardId;

    @C09CT("smb_industry_info")
    public SMBIndustryInfo smbIndustryInfo;

    @C09CT("smb_info")
    public SMBInfo smbInfo;

    @C09CT("smb_live_preview")
    public SMBLivePreview smbLivePreview;

    @C09CT("smb_tool_info")
    public SMBToolInfo smbToolInfo;
    public String sourceFrom;

    @C09CT("special_card")
    public SpecialCard specialCard;

    @C09CT("square_cover_img")
    public ImageModel squareCoverImg;

    @C09CT("star_comment_config")
    public StarCommentConfig starCommentConfig;

    @C09CT("start_time")
    public long startTime;

    @C09CT("stats")
    public RoomStats stats;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("strategy_platform_features")
    public StrategyPlatformFeatures strategyPlatformFeatures;

    @C09CT("stream_cover")
    public ImageModel streamCover;

    @C09CT("stream_features")
    public List<StreamFeature> streamFeatures;

    @C09CT("stream_id")
    public long streamId;

    @C09CT("stream_snapshot")
    public StreamSnapShot streamSnapshot;

    @C09CT("stream_snapshot_cover")
    public ImageModel streamSnapshotCover;

    @C09CT("stream_status")
    public int streamStatus;

    @C09CT("stream_url")
    public StreamUrl streamUrl;

    @C09CT("sub_pin_card")
    public SubPinCard subPinCard;

    @C09CT("sub_tag")
    public long subTag;

    @C09CT("sub_upsell_info")
    public SubUpsellInfo subUpsellInfo;

    @C09CT("taxonomy_tag_info")
    public TaxonomyTagInfo taxonomyTagInfo;

    @C09CT("toolbar_config")
    public ToolbarConfig toolbarConfig;

    @C09CT("top_fans")
    public List<TopFanTicket> topFanTickets;

    @C09CT("top_frame_summary")
    public TopFrameSummary topFrameSummary;

    @C09CT("top_frame_v2_summary")
    public TopFrameV2Summary topFrameV2Summary;

    @C09CT("ttls_live_type")
    public long ttlsLiveType;

    @C09CT("ttls_room_info")
    public TTLSRoomInfo ttlsRoomInfo;

    @C09CT("use_filter")
    public boolean unusedEffect;

    @C09CT("user_count")
    public int userCount;

    @C09CT("visible_scope_type")
    public long visibleScopeType;

    @C09CT("warning_tag")
    public WarningTag warningTag;

    @C09CT("watch_day_cnt_layer")
    public long watchDayCntLayer;

    @C09CT("watch_early_quota_config")
    public Map<Long, MsgNotifyWatchEarlyQuota> watchEarlyQuotaConfig;

    @C09CT("watch_reason_v2")
    public WatchReasonV2 watchReasonV2;

    @C09CT("webcast_sdk_version")
    public long webcastSdkVersion;

    @C09CT("with_linkmic")
    public boolean withLinkMic;

    @C09CT("log_id")
    public String logId = "";

    @C09CT("repost_note")
    public String repostNote = "";

    @C09CT("intended_drm")
    public String intendedDrm = "";

    @C09CT("room_llm_title")
    public String roomLlmTitle = "";

    @C09CT("history_comment_cursor")
    public String historyCommentCursor = "";

    @C09CT("rtc_app_id")
    public String rtcAppId = "";

    @C09CT("idc_region")
    public String idcRegion = "";

    @C09CT("multi_stream_id_str")
    public String multiStreamIdStr = "";

    @C09CT("anchor_tab_type")
    public long anchorTabType = -1;

    @C09CT("title")
    public String title = "";

    @C09CT("share_url")
    public String shareUrl = "";

    @C09CT("common_label_list")
    public String labels = "";

    @C09CT("source_type")
    public String sourceType = "";

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("message")
    public String message = "";

    @C09CT("prompts")
    public String prompts = "";

    @C09CT("finish_url")
    public String finish_url = "";

    @C09CT("finish_url_v2")
    public String finishUrlLynx = "";
    public String pullStreamData = "";
    public String defaultQualitySdkKey = "";
    public String authenticationValue = "";

    @C09CT("room_create_ab_param")
    public String roomCreateAbParam = "";

    @C09CT("user_share_text")
    public String userShareText = "";

    @C09CT("anchor_share_text")
    public String anchorShareText = "";

    @C09CT("partnership_info")
    public PartnershipInfo partnershipInfo = new PartnershipInfo();

    @C09CT("indicators")
    public List<String> mIndicators = new ArrayList();

    @C09CT("live_sub_only")
    public long liveSubOnly = 0;

    @C09CT("support_quiz")
    public long supportQuiz = 0;

    @C09CT("allow_preview_time")
    public long allowPreviewTime = 0;

    @C09CT("multi_stream_scene")
    public long multiStreamScene = 0;

    public String getVideoUrl() {
        return "";
    }

    public String subtitle() {
        return "";
    }

    public String buildExtraSreamPullUrl() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        String str = streamUrl.qualityMap.get(streamUrl.LJ);
        if (str == null) {
            return null;
        }
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZ(this.platform, "anchor_device_platform");
        c495520Jby.LIZJ("anchor_version", this.clientVersion);
        c495520Jby.LIZIZ(this.id, "room_id");
        c495520Jby.LIZIZ(this.ownerUserId, "anchor_id");
        return c495520Jby.LIZLLL();
    }

    public String buildPullUrl() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return buildPullUrl(streamUrl.LJ);
    }

    public CommerceStruct getCommerceStruct() {
        CommerceStruct commerceStruct;
        CommerceStruct commerceStruct2 = this.commerceStruct;
        return ((commerceStruct2 == null || commerceStruct2.commercePermission != 1) && (commerceStruct = this.commerceInfoBackup) != null && commerceStruct.commercePermission == 1) ? commerceStruct : commerceStruct2;
    }

    public int getDrmType() {
        StreamUrl streamUrl = this.streamUrl;
        return streamUrl == null ? this.drmTypeFromPreview : streamUrl.drmType;
    }

    public String getExtraSdkParams() {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getExtraSdkParams(streamUrl.LJ);
    }

    public String getExtraStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getExtraStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.multiStreamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public StreamUrlExtra getExtraStreamUrlExtra() {
        StreamUrlExtra streamUrlExtra;
        StreamUrl streamUrl = this.multiStreamUrl;
        return (streamUrl == null || (streamUrlExtra = streamUrl.extra) == null) ? new StreamUrlExtra() : streamUrlExtra;
    }

    public String getFeaturedItemId() {
        if (this.mRequestId == null) {
            return null;
        }
        if (this.mFeatureItemId == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mRequestId);
            sbLIZ.append("-");
            sbLIZ.append(this.id);
            this.mFeatureItemId = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.mFeatureItemId;
    }

    public String getIdStr() {
        String str = this.idStr;
        return str == null ? "" : str;
    }

    public String getLabels() {
        String str = this.labels;
        return str == null ? "" : str;
    }

    public String getMixId() {
        return String.valueOf(this.id);
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public Map<String, String> getMultiStreamLogParams() {
        String str;
        HashMap map = new HashMap();
        if (this.multiStreamScene != 1) {
            map.put("is_multi_stream_room", CardStruct.IStatusCode.DEFAULT);
            map.put("main_stream_orientation", "portrait");
            return map;
        }
        map.put("is_multi_stream_room", "1");
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null || (str = streamUrl.idStr) == null) {
            str = "";
        }
        map.put("multi_stream_id", str);
        if (isMainStreamHorizontal()) {
            map.put("main_stream_orientation", "landscape");
            return map;
        }
        map.put("main_stream_orientation", "portrait");
        return map;
    }

    public LiveCoreSDKData.Options getOptions() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null) {
            return null;
        }
        return this.streamUrl.liveCoreSDKData.getPullData().getOptions();
    }

    public String getSdkParams() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return getSdkParams(streamUrl.LJ);
    }

    public LiveMode getStreamType() {
        if (this.layout == 1) {
            return LiveMode.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        int i = this.liveRoomMode;
        return i == 6 ? LiveMode.LIVE_STUDIO : this.isThirdParty ? LiveMode.THIRD_PARTY : this.liveTypeAudio ? LiveMode.AUDIO : i == 7 ? LiveMode.LIVE_VOICE : LiveMode.VIDEO;
    }

    public StreamUrlExtra getStreamUrlExtra() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.extra;
    }

    public String getUniqueItemId() {
        if (this.mRequestId == null) {
            return null;
        }
        if (this.mUniqueItemId == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.id);
            sbLIZ.append("_");
            sbLIZ.append(this.mRequestId);
            this.mUniqueItemId = C2188811AlT.LIZIZ(sbLIZ);
        }
        return this.mUniqueItemId;
    }

    public boolean hasMultiLivePermissionAnchorSide() {
        MultiLiveUserSettings multiLiveUserSettings = this.multiLiveUserSettings;
        return multiLiveUserSettings != null && multiLiveUserSettings.hasMultiGuestPermissionAnchorSide();
    }

    public void init() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl != null) {
            streamUrl.LJIIIIZZ();
            StreamUrl streamUrl2 = this.streamUrl;
            if (streamUrl2.liveCoreSDKData != null) {
                streamUrl2.LJII();
            }
        }
        StreamUrl streamUrl3 = this.multiStreamUrl;
        if (streamUrl3 != null) {
            streamUrl3.LJIIIIZZ();
            StreamUrl streamUrl4 = this.multiStreamUrl;
            if (streamUrl4.liveCoreSDKData != null) {
                streamUrl4.LJII();
            }
        }
        String str = this.enterRoomBoostExtraStr;
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.enterRoomBoostExtra = (EnterRoomExtra) C293501Bt.LIZ().LJII(this.enterRoomBoostExtraStr, EnterRoomExtra.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public boolean isForcedLowLatency() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        return (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null || !this.streamUrl.liveCoreSDKData.getPullData().getOptions().forcedLowLatency) ? false : true;
    }

    public boolean isKoiRoom() {
        return this.layout == 3;
    }

    public boolean isMainStreamHorizontal() {
        return 1 == this.multiStreamScene && this.multiStreamSource == 0;
    }

    public boolean isMediaRoom() {
        return this.roomLayout == 1;
    }

    public boolean isMultiLiveAutoStart() {
        MultiLiveUserSettings multiLiveUserSettings = this.multiLiveUserSettings;
        return multiLiveUserSettings != null && multiLiveUserSettings.isMultiLiveEnable();
    }

    public boolean isMultiPullDataValid() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || streamUrl.liveCoreSDKData == null) {
            return false;
        }
        streamUrl.LJII();
        return streamUrl.qualityList.isEmpty() ^ true;
    }

    public boolean isOfficial() {
        return this.layout == 1;
    }

    public boolean isPullUrlValid() {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return false;
        }
        streamUrl.LJIIIIZZ();
        return streamUrl.qualityMap.isEmpty() ^ true;
    }

    public boolean isQuizRoom() {
        return 1 == this.supportQuiz;
    }

    public boolean isStar() {
        return this.layout == 2;
    }

    public boolean isSupportLowLatency() {
        LiveCoreSDKData liveCoreSDKData;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (liveCoreSDKData = streamUrl.liveCoreSDKData) == null || liveCoreSDKData.getPullData() == null || this.streamUrl.liveCoreSDKData.getPullData().getOptions() == null) {
            return false;
        }
        LiveCoreSDKData.Options options = this.streamUrl.liveCoreSDKData.getPullData().getOptions();
        if (options.forcedLowLatency) {
            return true;
        }
        return options.supportLowLatency;
    }

    public boolean isVariantCard() {
        SpecialCard specialCard = this.specialCard;
        return (specialCard == null || specialCard.type == 0) ? false : true;
    }

    public String toString() {
        return "roomid:" + this.idStr + " ; \nRoomAuthStatus info: " + this.mRoomAuthStatus;
    }

    public StreamUrlExtra.SrConfig getStreamSrConfig() {
        StreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return null;
        }
        return streamUrlExtra.srConfig;
    }

    public StreamUrlExtra getStreamUrlExtraSafely() {
        StreamUrlExtra streamUrlExtra = getStreamUrlExtra();
        return streamUrlExtra == null ? new StreamUrlExtra() : streamUrlExtra;
    }

    public boolean isGameLiveStreamType() {
        LiveMode streamType = getStreamType();
        if (streamType != null) {
            return streamType == LiveMode.SCREEN_RECORD || streamType == LiveMode.LIVE_STUDIO || streamType == LiveMode.THIRD_PARTY;
        }
        return false;
    }

    @Override // X.InterfaceC468260IXw
    public InterfaceC2262081DgM author() {
        return this.owner;
    }

    @Override // X.InterfaceC468260IXw
    public ImageModel cover() {
        return this.cover;
    }

    public String getAnchorShareText() {
        return this.anchorShareText;
    }

    public long getAnchorTabType() {
        return this.anchorTabType;
    }

    public BALinkStruct getBALinkStruct() {
        return this.baLinkStruct;
    }

    public BcToggleInfo getBcToggleInfo() {
        return this.bcToggleInfo;
    }

    public String getClientVersion() {
        return this.clientVersion;
    }

    public ImageModel getCover() {
        return this.cover;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public List<RoomDecoration> getDecorationList() {
        return this.decorationList;
    }

    public ImageModel getDynamicCover() {
        return this.dynamicCover;
    }

    public ImageModel getDynamicCoverLow() {
        return this.dynamicCoverLow;
    }

    public ImageModel getFeedRoomLabel() {
        return this.feedRoomLabel;
    }

    public List<FeedRoomLabel> getFeedRoomLabelList() {
        return this.feedRoomLabelList;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public GuessTaskPackInfo getGuessTaskPackInfo() {
        return this.guessTaskPackInfo;
    }

    public GuessWidgets getGuessWidgets() {
        return this.guessWidgets;
    }

    public String getGuestRequestId() {
        return this.mGuestRequestId;
    }

    public Hashtag getHashtag() {
        return this.hashtag;
    }

    public long getHostWebcastSdkVersion() {
        return this.webcastSdkVersion;
    }

    @Override // X.InterfaceC468260IXw
    public long getId() {
        return this.id;
    }

    public long getLikeCount() {
        return this.likeCount;
    }

    public RoomLinkInfo getLinkMicInfo() {
        return this.linkMicInfoGson;
    }

    public int getLinkmicLayout() {
        return this.linkmicLayout;
    }

    public String getLog_pb() {
        return this.logPb;
    }

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public int getNameMode() {
        return this.mNameMode;
    }

    public OfficialChannelInfo getOfficialChannelInfo() {
        return this.officialChannelInfo;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public User getOwner() {
        return this.owner;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public PictionaryFullInfo getPictionaryFullInfo() {
        return this.pictionaryFullInfo;
    }

    public PinInfo getPinInfo() {
        return this.pinInfo;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public RoomAuthStatus getRoomAuthStatus() {
        return this.mRoomAuthStatus;
    }

    public String getRoomFirstOrientation() {
        return this.roomFirstOrientation;
    }

    public int getRoomLayout() {
        return this.roomLayout;
    }

    public String getRoomOrientation() {
        return this.roomOrientation;
    }

    public List<RoomSticker> getRoomStickerList() {
        return this.roomStickerList;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public ImageModel getSquareCoverImg() {
        return this.squareCoverImg;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public RoomStats getStats() {
        return this.stats;
    }

    public int getStatus() {
        return this.status;
    }

    public ImageModel getStreamCover() {
        return this.streamCover;
    }

    public long getStreamId() {
        return this.streamId;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public List<TopFanTicket> getTopFanTickets() {
        return this.topFanTickets;
    }

    public TopFrameSummary getTopFrameSummary() {
        return this.topFrameSummary;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public String getUserShareText() {
        return this.userShareText;
    }

    public boolean hasCommerceGoods() {
        return this.hasCommerceGoods;
    }

    public boolean isLiveTypeAudio() {
        return this.liveTypeAudio;
    }

    public boolean isOfficialChannel() {
        return this.isOfficialChannel;
    }

    public boolean isUnusedEffect() {
        return this.unusedEffect;
    }

    public boolean isWithLinkMic() {
        return this.withLinkMic;
    }

    public String title() {
        return this.title;
    }

    public static boolean isValid(Room room) {
        if (room != null && room.getId() > 0 && room.getOwner() != null) {
            return true;
        }
        return false;
    }

    public String buildPullUrl(String str) {
        String str2;
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null || (str2 = streamUrl.qualityMap.get(str)) == null) {
            return null;
        }
        C495520Jby c495520Jby = new C495520Jby(str2);
        c495520Jby.LIZ(this.platform, "anchor_device_platform");
        c495520Jby.LIZJ("anchor_version", this.clientVersion);
        c495520Jby.LIZIZ(this.id, "room_id");
        c495520Jby.LIZIZ(this.ownerUserId, "anchor_id");
        return c495520Jby.LIZLLL();
    }

    public String getExtraSdkParams(String str) {
        StreamUrl streamUrl = this.multiStreamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public String getSdkParams(String str) {
        StreamUrl streamUrl = this.streamUrl;
        if (streamUrl == null) {
            return null;
        }
        return streamUrl.sdkParamsMap.get(str);
    }

    public void setAnchorShareText(String str) {
        this.anchorShareText = str;
    }

    public void setAnchorTabType(long j) {
        this.anchorTabType = j;
    }

    public void setBALinkStruct(BALinkStruct bALinkStruct) {
        this.baLinkStruct = bALinkStruct;
    }

    public void setBcToggleInfo(BcToggleInfo bcToggleInfo) {
        this.bcToggleInfo = bcToggleInfo;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setCommerceStruct(CommerceStruct commerceStruct) {
        this.commerceStruct = commerceStruct;
    }

    @C09CT("cover")
    public void setCover(ImageModel imageModel) {
        this.cover = imageModel;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDecorationList(List<RoomDecoration> list) {
        this.decorationList = list;
    }

    public void setDynamicCover(ImageModel imageModel) {
        this.dynamicCover = imageModel;
    }

    public void setDynamicCoverLow(ImageModel imageModel) {
        this.dynamicCoverLow = imageModel;
    }

    public void setFeedRoomLabel(ImageModel imageModel) {
        this.feedRoomLabel = imageModel;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setGuessTaskPackInfo(GuessTaskPackInfo guessTaskPackInfo) {
        this.guessTaskPackInfo = guessTaskPackInfo;
    }

    public void setGuessWidgets(GuessWidgets guessWidgets) {
        this.guessWidgets = guessWidgets;
    }

    public void setGuestRequestId(String str) {
        this.mGuestRequestId = str;
    }

    public void setHashtag(Hashtag hashtag) {
        this.hashtag = hashtag;
    }

    public void setHostWebcastSdkVersion(long j) {
        this.webcastSdkVersion = j;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLinkMicInfo(RoomLinkInfo roomLinkInfo) {
        this.linkMicInfoGson = roomLinkInfo;
    }

    public void setLiveTypeAudio(boolean z) {
        this.liveTypeAudio = z;
    }

    public void setLog_pb(String str) {
        this.logPb = str;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setOfficialChannel(boolean z) {
        this.isOfficialChannel = z;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwner(User user) {
        this.owner = user;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPictionaryFullInfo(PictionaryFullInfo pictionaryFullInfo) {
        this.pictionaryFullInfo = pictionaryFullInfo;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setRoomAuthStatus(RoomAuthStatus roomAuthStatus) {
        this.mRoomAuthStatus = roomAuthStatus;
    }

    public void setRoomOrientation(String str) {
        if (this.roomOrientation == null) {
            this.roomFirstOrientation = str;
        }
        this.roomOrientation = str;
    }

    public void setRoomStickerList(List<RoomSticker> list) {
        this.roomStickerList = list;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setSourceType(String str) {
        this.sourceType = str;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStats(RoomStats roomStats) {
        this.stats = roomStats;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStreamCover(ImageModel imageModel) {
        this.streamCover = imageModel;
    }

    public void setStreamId(long j) {
        this.streamId = j;
    }

    @C09CT("stream_url")
    public void setStreamUrl(StreamUrl streamUrl) {
        this.streamUrl = streamUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopFanTickets(List<TopFanTicket> list) {
        this.topFanTickets = list;
    }

    public void setUnusedEffect(boolean z) {
        this.unusedEffect = z;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public void setUserShareText(String str) {
        this.userShareText = str;
    }

    public void setWithLinkMic(boolean z) {
        this.withLinkMic = z;
    }
}
