package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C09CS;
import X.C09CT;
import X.C0X12;
import X.C309430CAz;
import X.InterfaceC2753014t;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursInfoStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.base.share.ShareOperationInfo;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.commercialize.model.BrandedContentAccount;
import com.ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSearchGrowthInfo;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.editpost.DescTitleTranslatedText;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.CreationInfo;
import com.ss.android.ugc.aweme.feed.model.ad.BrandSafetyInfo;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceRerankInfo;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import com.ss.android.ugc.aweme.feed.model.interest.NewUserRecommendedReason;
import com.ss.android.ugc.aweme.feed.model.live.LiveExtraInfoStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.mention.VideoMentionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.offlinevideo.OfflineVideoInfo;
import com.ss.android.ugc.aweme.feed.model.prompt.InteractiveRecMatchInfo;
import com.ss.android.ugc.aweme.feed.model.prompt.PromptResult;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.feed.model.search.SearchAwemePoiDataExperiment;
import com.ss.android.ugc.aweme.feed.model.search.SearchExtraStruct;
import com.ss.android.ugc.aweme.feed.model.search.SmartSearchInfoStruct;
import com.ss.android.ugc.aweme.feed.model.search.TakoBubbleInfo;
import com.ss.android.ugc.aweme.feed.model.search.VisualSearchInfoStruct;
import com.ss.android.ugc.aweme.feed.model.similarvideo.SimilarVideoInfo;
import com.ss.android.ugc.aweme.feed.model.story.ShareToStoryStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryKt;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.feed.model.story.socialblob.SocialInteractionBlobProto;
import com.ss.android.ugc.aweme.feed.model.survey.OnboardingSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.PersonalizedOnboardingSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.PersonalizedSurveyUI;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.MDPTemplatePinReason;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDiscoveryInfo;
import com.ss.android.ugc.aweme.music.model.MusicPromoTagInfo;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.poi.LocalServiceInfo;
import com.ss.android.ugc.aweme.poi.PoiBoostData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiReTagInfo;
import com.ss.android.ugc.aweme.poi.PoiTrace;
import com.ss.android.ugc.aweme.poi.UgcPoiTicketDetail;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.caption.LinkMatch;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.LocalServiceLiveInfo;
import com.ss.android.ugc.aweme.search.model.SearchKeySegmentsInfo;
import com.ss.android.ugc.aweme.solaria.SolariaProfile;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.story.model.RevealStoryPromoCardInfo;
import com.ss.android.ugc.aweme.template.ICAssetInfo;
import com.ss.android.ugc.aweme.template.TemplateButtonConfig;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes36.dex */
public class Aweme implements Serializable, C0X12, Cloneable, InterfaceC2753014t {
    public static boolean canReplacePhotoData = true;

    @C09CT("promote_capcut_toggle")
    public int PromoteCapcutToggle;

    @C09CT("ab_roll")
    public AbRollStruct abRollStruct;

    @C09CT("activity")
    public AwemeActivity activity;

    @C09CT("activity_pendant")
    public CommerceActivityStruct activityPendant;

    @C09CT("ad_link_type")
    public int adLinkType;

    @C09CT("ad_schedule")
    public String adSchedule;

    @C09CT("add_yours_info")
    public AddYoursInfoStruct addYoursInfoStruct;

    @C09CT("add_yours_recommendation")
    public AddYoursRecommendation addYoursRecommendation;

    @C09CT("added_sound_music_info")
    public Music addedSoundMusicInfo;

    @C09CT("ai_alive_info")
    public AIAliveInfo aiAliveInfo;

    @C09CT("ai_portrait_info")
    public AIPortraitInfo aiPortraitInfo;

    @C09CT("ai_remix_info")
    public AIRemixInfo aiRemixInfo;

    @C09CT("ai_theater_info")
    public AITheaterInfo aiTheaterInfo;

    @C09CT("aweme_id")
    public String aid;

    @C09CT("item_allow_ai_remix")
    public int allowAIRemix;

    @C09CT("allow_gift")
    public boolean allowGift;

    @C09CT("allow_reuse_original_sound")
    public Boolean allowReuseOriginalSound;

    @C09CT("anchor")
    public Anchor anchor;

    @C09CT("anchor_info")
    public AnchorInfo anchorInfo;

    @C09CT("anchors")
    public List<AnchorCommonStruct> anchors;

    @C09CT("anchors_extras")
    public String anchorsExtras;

    @C09CT("animated_btn")
    public AnimatedBtnStruct animatedBtnStruct;

    @C09CT("audio")
    public Audio audio;

    @C09CT("author")
    public User author;

    @C09CT("is_author_live")
    public Boolean authorLive;

    @C09CT("aweme_acl")
    public AwemeACLShare awemeACLShareInfo;

    @C09CT("raw_ad_data")
    public AwemeRawAd awemeRawAd;

    @C09CT("risk_infos")
    public AwemeRiskModel awemeRiskModel;

    @C09CT("banner_tip")
    public BannerTip bannerTip;

    @C09CT("banners")
    public List<BannerCommonStruct> banners;

    @C09CT("batch_id")
    public String batchId;

    @C09CT("batch_index")
    public int batchIndex;

    @C09CT("behind_the_song_metadata")
    public BehindTheSongMetaData behindTheSongMetaData;

    @C09CT("behind_the_song_video_music_ids")
    public List<String> behindTheSongMusicIds;

    @C09CT("boost_tag_info")
    public Boost boost;

    @C09CT("bottom_bar")
    public BottomBarModel bottomBarModel;

    @C09CT("branded_content_accounts")
    public List<BrandedContentAccount> brandContentAccounts;

    @C09CT("brand_safety_info")
    public BrandSafetyInfo brandSafetyInfo;

    @C09CT("bubble_info")
    public AwemeBubbleInfo bubbleInfo;

    @C09CT("c2pa_info")
    public C2PAInfo c2paInfo;

    @C09CT("card")
    public CardInsertInfo cardInsertInfo;

    @C09CT("cc_template_info")
    public CCTemplateInfo ccTemplateInfo;

    @C09CT("celebration_metadata")
    public CelebrationMetaData celebrationMetaData;

    @C09CT("cha_list")
    public List<Challenge> challengeList;

    @C09CT("cmt_swt")
    public boolean cmtSwt;

    @C09CT("collab_info")
    public CollabInfo collabInfo;

    @C09CT("collect_stat")
    public int collectStatus;

    @C09CT("comment_at_tako_info")
    public CommentAtTakoInfo commentAtTakoInfo;

    @C09CT("comment_config")
    public AwemeCommentConfig commentConfig;

    @C09CT("comment_post_video")
    public CommentPostInfo commentPostInfo;

    @C09CT("item_comment_settings")
    public int commentSetting;

    @C09CT("suggest_words")
    public CommentSuggestWordList commentSuggestWordList;

    @C09CT("comment_topbar_info")
    public List<CommentTopBarStruct> commentTopBarStructList;

    @C09CT("commerce_config_data")
    public List<CommerceConfigData> commerceConfigDataList;

    @C09CT("commerce_rerank_info")
    public CommerceRerankInfo commerceRerankInfo;

    @C09CT("commerce_sticker_info")
    public CommerceStickerInfo commerceStickerInfo;

    @C09CT("commercial_video_info")
    public String commercialVideoInfo;
    public VideoMaskInfo contentClassificationMaskInfo;

    @C09CT("content_desc")
    public String contentDesc;

    @C09CT("content_desc_extra")
    public List<TextExtraStruct> contentDescExtra;

    @C09CT("content_model")
    public ContentModel contentModel;

    @C09CT("content_type")
    public String contentType;

    @C09CT("create_time")
    public long createTime;

    @C09CT("creation_info")
    public CreationInfo creationInfo;

    @C09CT("creator_ai_comment")
    public CreatorAIComment creatorAIComment;

    @C09CT("declaration_info")
    public List<DeclarationInfoStruct> declarationInfo;

    @C09CT("deduplication_type")
    public int deduplicationType;

    @C09CT("desc")
    public String desc;

    @C09CT("desc_language")
    public String descLanguage;

    @C09CT("desc_title_translated_text")
    public DescTitleTranslatedText descTitleTranslatedText;

    @C09CT("descendants")
    public DescendantsModel descendantsModel;

    @C09CT("detail_lynx_card_info")
    public DetailLynxCardStruct detailLynxCardStruct;
    public int detailPageItemType;

    @C09CT("detail_page_video_tag")
    public int detailPageVideoTag;

    @C09CT("on_device_ml_features")
    public String deviceMLFeatures;

    @C09CT("disable_search_trending_bar")
    public boolean disableSearchTrendingBar;

    @C09CT("distance")
    public String distance;

    @C09CT("distribute_type")
    public int distributeType;

    @C09CT("dou_discount_mix_info")
    public HotSearchInfo douDiscountMixInfo;

    @C09CT("without_watermark")
    public boolean downloadWithoutWatermark;

    @C09CT("music_dsp_info")
    public Dsp dsp;

    @C09CT("item_duet")
    public int duetSetting;

    @C09CT("duet_info")
    public DuetInfo duettedInfo;

    @C09CT("ttec_suggest_words")
    public EcFeedSuggestWordList ecFeedSuggestWordList;

    @C09CT("ttec_search_growth_info")
    public EcSearchGrowthInfo ecSearchGrowthInfo;

    @C09CT("ecom_anchor_live_style")
    public Integer ecomAnchorLiveStyle;

    @C09CT("ecom_anchor_view_object")
    public String ecomAnchorViewObject;

    @C09CT("ecosystem_perception_enhancement")
    public List<EcosystemPerceptionInfo> ecosystemPerceptionInfos;

    @C09CT("edit_post_permission")
    public EditPostPermission editPostPermission;

    @C09CT("explore_community_comment_show_type")
    public Integer exploreCommunityCommentShowType;

    @C09CT("muf_comment_info_v2")
    public List<ExposedCommentInfo> exposedCommentInfoList;

    @C09CT("extra")
    public String extra;

    @C09CT("feed_relation_label")
    public RelationLabelNew feedRelationLabel;

    @C09CT("filter_stranger_comments")
    public boolean filterStrangerComments;

    @C09CT("filter_unfriendly_user_comments")
    public boolean filterUnfriendlyUserComments;

    @C09CT("floating_card_content")
    public FloatingCardInfo floatingCardInfo;

    @C09CT("follow_up_first_item_id")
    public String followUpFirstItemId;

    @C09CT("follow_up_item_id_groups")
    public String followUpItemIdGroups;

    @C09CT("follow_up_publish_from_id")
    public long followUpPublishFromId;
    public boolean forceUseUniqueId;

    @C09CT("forward_comment_id")
    public String forwardCommentId;

    @C09CT("forward_item")
    public Aweme forwardItem;

    @C09CT("forward_item_id")
    public String forwardItemId;

    @C09CT("game_info")
    public GameInfo gameInfo;

    @C09CT("gecc_content_selling_point")
    public GeccContentSellingPoint geccContentSellingPoint;
    public VideoMaskInfo generalMaskInfo;
    public String genreType;

    @C09CT("geofencing_regions")
    public List<String> geofencingRegions;

    @C09CT("golden_cache_config")
    public GoldenCacheConfig goldenCacheConfig;

    @C09CT("green_screen_materials")
    public List<GreenScreenMaterial> greenScreenMaterialList;

    @C09CT("group_id")
    public String groupId;

    @C09CT("GroupIdList")
    public GroupIdListStruct groupIdList;

    @C09CT("has_danmaku")
    public boolean hasDanmaku;

    @C09CT("has_ever_advertised")
    public Boolean hasEverAdvertised;

    @C09CT("has_promote_entry")
    public int hasPromoteEntry;

    @C09CT("has_vs_entry")
    public boolean hasVisionSearchEntry;

    @C09CT("hot_list")
    public HotListStruct hotListStruct;

    @C09CT("hot_info")
    public HotSearchInfo hotSearchInfo;

    @C09CT("hybrid_label")
    public List<AwemeHybridLabelModel> hybridLabels;

    @C09CT("image_infos")
    public List<ImageInfo> imageInfos;

    @C09CT("video_insight_status")
    public int insightsEligibilityStatus;

    @C09CT("interact_permission")
    public InteractPermission interactPermission;

    @C09CT("interaction_stickers")
    public List<InteractStickerStruct> interactStickerStructs;

    @C09CT("interaction_tag_info")
    public InteractionTagInfo interactionTagInfo;

    @C09CT("interactive_rec_hit_instructions")
    public List<Long> interactiveInstructions;

    @C09CT("interactive_rec_match_info")
    public InteractiveRecMatchInfo interactiveRecMatchInfo;

    @C09CT("is_ads")
    public boolean isAd;

    @C09CT("is_client_cache")
    public boolean isClientCache;

    @C09CT("is_comment_post_video")
    public boolean isCommentPostVideo;

    @C09CT("is_description_translatable")
    public boolean isDescTranslatable;

    @C09CT("is_effect_designer")
    public boolean isEffectDesigner;

    @C09CT("is_familiar")
    public boolean isFamiliar;
    public boolean isFriendsTabFakeAweme;

    @C09CT("is_hash_tag")
    public int isHashTag;

    @C09CT("is_live_has_products")
    public boolean isLiveHasProduct;

    @C09CT("is_nff_or_nr")
    public boolean isNrNff;

    @C09CT("is_on_this_day")
    public int isOnThisDay;

    @C09CT("is_paid_content")
    public boolean isPaidContent;

    @C09CT("is_pgcshow")
    public boolean isPgcShow;

    @C09CT("is_title_translatable")
    public boolean isPhotoTitleTranslatable;

    @C09CT("is_pinned_by_artist")
    public boolean isPinnedByArtist;
    public boolean isPlayingTranslatedVideo;

    @C09CT("is_relieve")
    public boolean isRelieve;

    @C09CT("is_spark_plus")
    public boolean isSoftAd;

    @C09CT("is_story_to_normal")
    public boolean isStoryToNormal;

    @C09CT("is_streaks_post")
    public boolean isStreaksPost;

    @C09CT("is_sub_only_video")
    public boolean isSubOnlyVideo;

    @C09CT("support_danmaku")
    public boolean isSupportDanmaku;

    @C09CT("is_text_sticker_translatable")
    public boolean isTextStickerTranslatable;

    @C09CT("is_tiktok_story")
    public boolean isTikTokStory;

    @C09CT("is_top")
    public int isTop;

    @C09CT("is_unconsumed_resuse")
    public boolean isUnconsumedReuse;

    @C09CT("used_full_song")
    public boolean isUsedFullSong;

    @C09CT("is_vr")
    public boolean isVr;

    @C09CT("key_segments_info")
    public SearchKeySegmentsInfo keySegmentsInfo;

    @C09CT("label_large")
    public UrlModel labelLarge;

    @C09CT("label_private")
    public UrlModel labelPrivate;

    @C09CT("label_thumb")
    public UrlModel labelThumb;

    @C09CT("label_top")
    public UrlModel labelTop;

    @C09CT("landing_page")
    public String landingPage;

    @C09CT("layout_info")
    public LayoutInfo layoutInfo;

    @C09CT("link_ad_data")
    @C09CS(StringJsonAdapterFactory.class)
    public LinkData linkAdData;

    @C09CT("link_match")
    public LinkMatch linkMatch;

    @C09CT("live_extra_info_struct")
    public LiveExtraInfoStruct liveExtraInfoStruct;

    @C09CT("live_id")
    public long liveId;

    @C09CT("live_reason")
    public String liveReaSon;

    @C09CT("live_room_stats_tag")
    public List<LiveRoomStatesTag> liveRoomStatesTags;

    @C09CT("live_type")
    public String liveType;

    @C09CT("live_window_show_time")
    public long liveWindowShowTime;

    @C09CT("local_service_info")
    public LocalServiceInfo localServiceInfo;

    @C09CT("ls_live_info")
    public LocalServiceLiveInfo localServiceLiveInfo;
    public LogPbBean logPb;

    @C09CT("long_video")
    public List<LongVideo> longVideos;

    @C09CT("animated_image_info")
    public AnimatedImageInfo mAnimatedImageInfo;

    @C09CT("commerce_info")
    public AwemeCommerceStruct mCommerceVideoAuthInfo;

    @C09CT("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @C09CT("item_distribute_source")
    public String mItemDistributeSource;

    @C09CT("label_music_starter_text")
    public String mLabelMusicStarterText;

    @C09CT("cny_info")
    public LiveAwesomeSplashInfo mLiveAwesomeSplashInfo;
    public HashMap<String, String> mMobParams;

    @C09CT("new_user_recommended_reason")
    public NewUserRecommendedReason mNewUserRecommendedReason;

    @C09CT("onboarding_survey")
    public OnboardingSurvey mOnboardingSurvey;

    @C09CT("paid_content_info")
    public PaidContentInfo mPaidContentInfo;

    @C09CT("personalized_onboarding_survey")
    public PersonalizedOnboardingSurvey mPersonalizedOnboardingSurvey;

    @C09CT("personalized_survey_ui")
    public PersonalizedSurveyUI mPersonalizedSurveyUI;

    @C09CT("search_info_struct")
    public List<PostSearchInfo> mPostSearchInfoList;

    @C09CT("cell_room")
    public RoomFeedCellStruct mRoomFeedCellStruct;

    @C09CT("main_arch_common")
    @C09CS(StringJsonAdapterFactory.class)
    public MainArchCommon mainArchCommon;

    @C09CT("market_drop_strategy")
    public int marketDropStrategy;

    @C09CT("market_sub_type")
    public int marketSubType;

    @C09CT("match_text")
    public String matchText;

    @C09CT("mdp_template_pin_reason")
    public MDPTemplatePinReason mdpTemplatePinReason;

    @C09CT("meme_reg_info")
    public MemeRegInfo memeRegInfo;

    @C09CT("micro_app_info")
    public MicroAppInfo microAppInfo;

    @C09CT("mix_info")
    public MixStruct mixInfo;

    @C09CT("moderation_aigc_info")
    public ModerationAigcInfo moderationAigcInfo;

    @C09CT("music")
    public Music music;

    @C09CT("music_discovery_info")
    public MusicDiscoveryInfo musicDiscoveryInfo;

    @C09CT("music_promo_id")
    public String musicPromoId;

    @C09CT("music_promo_tag_info")
    public MusicPromoTagInfo musicPromoTagInfo;

    @C09CT("music_retriever_flag")
    public int musicRecallReasonFlag;

    @C09CT("music_selected_from")
    public String musicSelectedFrom;

    @C09CT("label_music_starter")
    public UrlModel musicStarter;

    @C09CT("music_title_style")
    public int musicTitleStyle;

    @C09CT("music_volume")
    public String musicVolume;

    @C09CT("mutual_relation")
    public MutualStruct mutualRelation;

    @C09CT("nearby_info")
    public NearbyInfo nearbyInfo;

    @C09CT("should_add_creator_tts_watermark_when_downloading")
    public boolean needTTSWatermarkWhenDownload;

    @C09CT("need_vs_entry")
    public boolean needVisionSearchEntry;

    @C09CT("rawdata")
    @C09CS(StringJsonAdapterFactory.class)
    public NewLiveRoomStruct newLiveRoomData;

    @C09CT("nickname_position")
    public List<Position> nicknamePosition;
    public ConcurrentHashMap<String, AwemeBizData> normalBizFields;

    @C09CT("now_posts")
    public NowPostInfo nowPostInfo;

    @C09CT("ocean_group_info")
    public String oceanGroupInfo;

    @C09CT("offline_video_info")
    public OfflineVideoInfo offlineVideoInfo;

    @C09CT("operator_boost_info")
    public List<OperatorBoost> operatorBoosts;

    @C09CT("label_origin_author")
    public UrlModel originAuthor;

    @C09CT("origin_comment_ids")
    public List<String> originCommentIds;

    @C09CT("origin_volume")
    public String originVolume;

    @C09CT("original_audio")
    public OriginalAudioStruct originalAudio;

    @C09CT("original_client_text")
    public ClientText originalClientText;

    @C09CT("part_n")
    public String partN;

    @C09CT("image_post_info")
    public PhotoModeImageInfo photoModeImageInfo;

    @C09CT("text_consumption_info")
    public PhotoModeTextInfo photoModeTextInfo;

    @C09CT("title_language")
    public String photoTitleLanguageCode;
    public VideoMaskInfo photosensitiveMaskInfo;

    @C09CT("playlist_blocked")
    public boolean playlistBlocked;

    @C09CT("playlist_info")
    public PlayListInfo playlist_info;

    @C09CT("podcast_info")
    public PodcastInfo podcastInfo;

    @C09CT("poi_boost")
    public PoiBoostData poiBoostData;

    @C09CT("poi_data")
    public PoiDataStruct poiDataStruct;

    @C09CT("poi_re_tag_info")
    public PoiReTagInfo poiReTagInfo;

    @C09CT("poi_re_tag_signal")
    public int poiReTagSignal;

    @C09CT("poi_re_tag_text")
    public String poiReTagText;

    @C09CT("poi_trace")
    public PoiTrace poiTrace;

    @C09CT("position")
    public List<Position> position;

    @C09CT("pre_forward_id")
    public String preForwardId;

    @C09CT("preload")
    public Preload preload;

    @C09CT("prevent_download")
    public boolean preventDownload;

    @C09CT("ttt_product_recall_type")
    public int productRecallType;

    @C09CT("products_count")
    public int productsCount;

    @C09CT("products_info")
    public List<Product> productsInfo;

    @C09CT("promote_icon_text")
    public String promoteIconText;

    @C09CT("promote")
    public PromoteModel promoteModel;

    @C09CT("promote_toast")
    public String promoteToast;

    @C09CT("promote_toast_key")
    public String promoteToastKey;

    @C09CT("prompt_result")
    public PromptResult promptResult;

    @C09CT("psp_info")
    public PSPInfo pspInfo;

    @C09CT("question_list")
    public List<QuestionInfo> questionInfo;

    @C09CT("internal_share")
    public QuickShareAIInfo quickShareAIInfo;

    @C09CT("item_react")
    public int reactSetting;

    @C09CT("realtime_fcp_config")
    public RealtimeFcpConfig realtimeFcpConfig;

    @C09CT("rec_reason_tag")
    public RecReasonEntry recReasonTag;

    @C09CT("rec_reason")
    public RecReasonsStruct recReasonsStruct;

    @C09CT("recommend_card_type")
    public int recommendCardType;

    @C09CT("region")
    public String region;

    @C09CT("related_live")
    public RelatedLiveTagStruct relatedLiveTagStruct;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("relation_recommend_info")
    public AwemeRelationRecommendModel relationRecommendInfo;
    public VideoMaskInfo reportMaskInfo;

    @C09CT("request_id")
    public String requestId;

    @C09CT("reveal_story_promo_card_info")
    public RevealStoryPromoCardInfo revealStoryPromoCardInfo;

    @C09CT("room")
    public RoomStruct room;

    @C09CT("schedule_time")
    public long scheduleTime;

    @C09CT("search_desc")
    public String searchDesc;

    @C09CT("search_extra")
    public SearchExtraStruct searchExtraStruct;

    @C09CT("search_info")
    public SearchInfo searchInfo;

    @C09CT("outflow_poi_data")
    public PoiDataStruct searchPoiDataStruct;

    @C09CT("share_to_story_info")
    public ShareToStoryStruct share2StoryStruct;

    @C09CT("share_to_video_info")
    public ShareToVideoStruct share2VideoStruct;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("share_operation_info")
    public ShareOperationInfo shareOperationInfo;

    @C09CT("share_url")
    public String shareUrl;

    @C09CT("shoot_tab_name")
    public String shootTabName;

    @C09CT("show_quick_dm_box")
    public boolean showQuickDMBox;

    @C09CT("similar_video_info")
    public SimilarVideoInfo similarVideoInfo;

    @C09CT("smart_search_info")
    public SmartSearchInfoStruct smartSearchInfo;

    @C09CT("social_interaction_blob")
    public SocialInteractionBlobProto socialInteractionBlobProto;

    @C09CT("solaria_profile")
    public SolariaProfile solariaProfile;

    @C09CT("sp_sticker")
    public SpecialSticker specialSticker;

    @C09CT("standard_component_info")
    public StandardComponentInfo standardComponentInfo;

    @C09CT("star_atlas_order_id")
    public long starAtlasOrderId;

    @C09CT("statistics")
    public AwemeStatistics statistics;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public AwemeStatus status;

    @C09CT("sticker_detail")
    public NewFaceStickerBean stickerEntranceInfo;

    @C09CT("stickers")
    public String stickerIDs;

    @C09CT("story_metadata")
    public Story story;

    @C09CT("story_highlight_info")
    public StoryHighlightInfo storyHighlightInfo;

    @C09CT("ad_story_video")
    public StoryVideo storyModel;

    @C09CT("story_note_info")
    public StoryNoteInfo storyNoteInfo;

    @C09CT("story_type")
    public int storyType;

    @C09CT("streaks_meta")
    public StreaksMeta streaksMeta;

    @C09CT("stream_url")
    public StreamUrlModel streamUrlModel;

    @C09CT("audio_after_strip")
    public OriginalAudioStruct strippedOriginalAudio;

    @C09CT("real_survey_info")
    public com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo surveyInfo;

    @C09CT("survey_info")
    public List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> surveyInfos;

    @C09CT("survey_key")
    public String surveyKey;

    @C09CT("take_down_desc")
    public String takeDownDesc;

    @C09CT("take_down_reason")
    public int takeDownReason;

    @C09CT("tako_bubble_info")
    public TakoBubbleInfo takoBubbleInfo;

    @C09CT("ic_asset_info")
    public ICAssetInfo[] templateAssetInfo;

    @C09CT("template_config")
    public TemplateButtonConfig templateButtonConfig;

    @C09CT("text_extra")
    public List<TextExtraStruct> textExtra;

    @C09CT("text_sticker_major_lang")
    public String textStickerMajorityLang;

    @C09CT("label_top_text")
    public List<AwemeTextLabelModel> textTopLabels;

    @C09CT("video_text")
    public List<AwemeTextLabelModel> textVideoLabels;

    @C09CT("time_portal")
    public long timePortal;

    @C09CT("title")
    public String title;

    @C09CT("title_limited_rows")
    public int titleLimitedRows;

    @C09CT("trans_params")
    public String transParams;
    public transient ConcurrentHashMap<String, AwemeBizData> transientBizFields;

    @C09CT("translated_video")
    public TranslatedVideo translatedVideo;

    @C09CT("trash_bin_remaining_time")
    public long trashBinRemainingTime;

    @C09CT("trending_bar")
    public AwemeTrendingBar trendingBar;

    @C09CT("trending_bar_fyp")
    public AwemeTrendingBar trendingBarFYP;

    @C09CT("ttm_info")
    public TTMInfo ttmInfo;

    @C09CT("tts_voice_ids")
    public List<String> ttsVoiceIDs;

    @C09CT("reference_tts_voice_ids")
    public List<String> ttsVoiceRefIDs;

    @C09CT("tns_ue_feed_info")
    public TnSUserExperienceFeedInfo ueFeedInfo;

    @C09CT("ugc_poi_ticket_detail")
    public UgcPoiTicketDetail ugcPoiTicketDetail;

    @C09CT("uniqid_position")
    public List<Position> uniqidPosition;
    public String uniqueId;

    @C09CT("misc_info")
    public String uploadMiscInfoStructStr;

    @C09CT("upvote_info")
    public UpvoteInfo upvoteInfo;

    @C09CT("upvote_preload")
    public UpvotePreloadStruct upvotePreload;

    @C09CT("upvote_reason")
    public UpvoteReason upvoteReason;

    @C09CT("use_aweme_cache")
    public boolean useAwemeCache;

    @C09CT("user_affinity_score")
    public double userAffinityScore;

    @C09CT("user_digged")
    public int userDigg;

    @C09CT("user_now_post")
    public UserNowPost userNowPost;

    @C09CT("user_profile_init_info")
    public UserProfileInitInfo userProfileInitInfo;

    @C09CT("user_story")
    public UserStory userStory;

    @C09CT("voice_filter_ids")
    public List<String> vcVoiceIDs;

    @C09CT("reference_voice_filter_ids")
    public List<String> vcVoiceRefIDs;

    @C09CT("video")
    public Video video;

    @C09CT("video_control")
    public VideoControl videoControl;

    @C09CT("video_feed_tag")
    public String videoFeedTag;

    @C09CT("video_labels")
    public List<AwemeLabelModel> videoLabels;

    @C09CT("mask_info")
    public VideoMaskInfo videoMaskInfo;

    @C09CT("video_mention_info")
    public VideoMentionInfoStruct videoMentionInfoStruct;

    @C09CT("video_reply_info")
    public VideoReplyStruct videoReplyStruct;

    @C09CT("visual_search_info")
    public VisualSearchInfoStruct visualSearchInfo;

    @C09CT("with_promotional_music")
    public boolean withPromotionalMusic;

    @C09CT("with_survey")
    public boolean withSurvey;

    @C09CT("rate")
    public int rate = 1;

    @C09CT("aweme_control")
    public AwemeControl awemeControl = new AwemeControl();

    @C09CT("item_stitch")
    public int stitchSetting = 0;

    @C09CT("sound_exemption")
    public int soundExemption = 0;

    @C09CT("item_source_category")
    public int mItemSourceCategory = 0;

    @C09CT("music_begin_time_in_ms")
    public int musicBeginTime = 0;

    @C09CT("music_end_time_in_ms")
    public int musicEndTime = 0;

    @C09CT("retry_type")
    public int retryType = 0;

    @C09CT("content_original_type")
    public int contentOriginalType = 0;

    @C09CT("content_size_type")
    public int contentSizeType = 0;

    @C09CT("parameterized_speed")
    public float parameterizedSpeed = -1.0f;

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo = new AIGCInfo();

    @C09CT("share_story_status")
    public int shareStoryStatus = 0;

    @C09CT("imagine_sticker_info")
    public MixStickerInfo mixStickerInfo = new MixStickerInfo();

    @C09CT("mask_infos")
    public List<VideoMaskInfo> videoMaskInfos = new ArrayList();

    @C09CT("picked_users")
    public List<User> pickedUsers = null;

    @C09CT("quick_reply_emojis")
    public List<String> quickReplyEmojis = null;

    @C09CT("aweme_type")
    public int awemeType = 0;

    @C09CT("ad_aweme_source")
    public int adAwemeSource = 0;

    @C09CT("tcm_info")
    public TCMInfo tcmInfo = null;

    @C09CT("external_video_type")
    public int externalType = 0;

    @C09CT("match_type")
    public int matchType = 0;

    @C09CT("can_play")
    public boolean canPlay = true;

    @C09CT("have_dashboard")
    public boolean haveDashboard = false;

    @C09CT("is_live_replay")
    public boolean isLiveReplay = false;

    @C09CT("new_label")
    public int newLabel = 0;

    public String getSourceId() {
        return "aweme";
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Aweme m199clone() {
        Aweme aweme = new Aweme();
        ConcurrentHashMap<String, AwemeBizData> concurrentHashMap = this.transientBizFields;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, AwemeBizData> entry : concurrentHashMap.entrySet()) {
                AwemeBizData value = entry.getValue();
                if (value.joinClone) {
                    aweme.getTransientBizFields().put(entry.getKey(), value);
                }
            }
        }
        ConcurrentHashMap<String, AwemeBizData> concurrentHashMap2 = this.normalBizFields;
        if (concurrentHashMap2 != null) {
            for (Map.Entry<String, AwemeBizData> entry2 : concurrentHashMap2.entrySet()) {
                AwemeBizData value2 = entry2.getValue();
                if (value2.joinClone) {
                    aweme.getNormalBizFields().put(entry2.getKey(), value2);
                }
            }
        }
        aweme.aid = this.aid;
        aweme.commerceConfigDataList = this.commerceConfigDataList;
        aweme.starAtlasOrderId = this.starAtlasOrderId;
        aweme.tcmInfo = this.tcmInfo;
        aweme.desc = this.desc;
        aweme.originalClientText = this.originalClientText;
        aweme.createTime = this.createTime;
        aweme.author = this.author;
        aweme.music = this.music;
        aweme.addedSoundMusicInfo = this.addedSoundMusicInfo;
        aweme.musicVolume = this.musicVolume;
        aweme.musicBeginTime = this.musicBeginTime;
        aweme.originVolume = this.originVolume;
        aweme.challengeList = this.challengeList;
        aweme.originalAudio = this.originalAudio;
        aweme.strippedOriginalAudio = this.strippedOriginalAudio;
        aweme.greenScreenMaterialList = this.greenScreenMaterialList;
        aweme.video = this.video;
        aweme.audio = this.audio;
        aweme.longVideos = this.longVideos;
        aweme.shareUrl = this.shareUrl;
        aweme.userDigg = this.userDigg;
        AwemeStatistics awemeStatistics = this.statistics;
        aweme.statistics = awemeStatistics == null ? null : awemeStatistics.m200clone();
        AwemeStatus awemeStatus = this.status;
        aweme.status = awemeStatus == null ? null : awemeStatus.m201clone();
        aweme.isSubOnlyVideo = this.isSubOnlyVideo;
        aweme.filterStrangerComments = this.filterStrangerComments;
        aweme.filterUnfriendlyUserComments = this.filterUnfriendlyUserComments;
        aweme.commerceStickerInfo = this.commerceStickerInfo;
        aweme.videoControl = this.videoControl;
        aweme.distributeType = this.distributeType;
        aweme.insightsEligibilityStatus = this.insightsEligibilityStatus;
        aweme.extra = this.extra;
        aweme.photoModeImageInfo = this.photoModeImageInfo;
        aweme.abRollStruct = this.abRollStruct;
        aweme.photoModeTextInfo = this.photoModeTextInfo;
        aweme.rate = this.rate;
        aweme.shareInfo = this.shareInfo;
        aweme.shareOperationInfo = this.shareOperationInfo;
        aweme.textVideoLabels = this.textVideoLabels;
        aweme.textTopLabels = this.textTopLabels;
        aweme.videoLabels = this.videoLabels;
        aweme.isSupportDanmaku = this.isSupportDanmaku;
        aweme.hasDanmaku = this.hasDanmaku;
        aweme.isHashTag = this.isHashTag;
        aweme.awemeType = this.awemeType;
        aweme.adAwemeSource = this.adAwemeSource;
        aweme.awemeRawAd = this.awemeRawAd;
        aweme.specialSticker = this.specialSticker;
        aweme.relationLabel = this.relationLabel;
        aweme.cmtSwt = this.cmtSwt;
        aweme.streamUrlModel = this.streamUrlModel;
        aweme.title = this.title;
        aweme.isPgcShow = this.isPgcShow;
        aweme.imageInfos = this.imageInfos;
        aweme.awemeRiskModel = this.awemeRiskModel;
        aweme.bottomBarModel = this.bottomBarModel;
        aweme.descendantsModel = this.descendantsModel;
        aweme.collectStatus = this.collectStatus;
        aweme.canPlay = this.canPlay;
        aweme.commentSetting = this.commentSetting;
        aweme.commentConfig = this.commentConfig;
        aweme.allowAIRemix = this.allowAIRemix;
        aweme.reactSetting = this.reactSetting;
        aweme.duetSetting = this.duetSetting;
        aweme.stitchSetting = this.stitchSetting;
        aweme.activityPendant = this.activityPendant;
        aweme.interactPermission = this.interactPermission;
        aweme.position = this.position;
        aweme.uniqidPosition = this.uniqidPosition;
        aweme.nicknamePosition = this.nicknamePosition;
        aweme.room = this.room;
        aweme.deduplicationType = this.deduplicationType;
        aweme.stickerIDs = this.stickerIDs;
        aweme.uploadMiscInfoStructStr = this.uploadMiscInfoStructStr;
        aweme.takeDownReason = this.takeDownReason;
        aweme.takeDownDesc = this.takeDownDesc;
        aweme.forwardItem = this.forwardItem;
        aweme.forwardItemId = this.forwardItemId;
        aweme.forwardCommentId = this.forwardCommentId;
        aweme.preForwardId = this.preForwardId;
        aweme.preventDownload = this.preventDownload;
        aweme.region = this.region;
        aweme.microAppInfo = this.microAppInfo;
        aweme.gameInfo = this.gameInfo;
        aweme.hotSearchInfo = this.hotSearchInfo;
        aweme.hotListStruct = this.hotListStruct;
        aweme.downloadWithoutWatermark = this.downloadWithoutWatermark;
        aweme.linkAdData = this.linkAdData;
        aweme.adLinkType = this.adLinkType;
        aweme.allowReuseOriginalSound = this.allowReuseOriginalSound;
        aweme.labelLarge = this.labelLarge;
        aweme.labelPrivate = this.labelPrivate;
        aweme.labelThumb = this.labelThumb;
        aweme.textExtra = this.textExtra;
        aweme.isTop = this.isTop;
        aweme.labelTop = this.labelTop;
        aweme.originAuthor = this.originAuthor;
        aweme.musicStarter = this.musicStarter;
        aweme.mLabelMusicStarterText = this.mLabelMusicStarterText;
        aweme.distance = this.distance;
        aweme.landingPage = this.landingPage;
        aweme.isAd = this.isAd;
        aweme.isSoftAd = this.isSoftAd;
        aweme.isVr = this.isVr;
        aweme.isRelieve = this.isRelieve;
        aweme.adSchedule = this.adSchedule;
        aweme.preload = this.preload;
        aweme.isEffectDesigner = this.isEffectDesigner;
        aweme.withPromotionalMusic = this.withPromotionalMusic;
        aweme.stickerEntranceInfo = this.stickerEntranceInfo;
        aweme.anchors = this.anchors;
        aweme.ecomAnchorViewObject = this.ecomAnchorViewObject;
        aweme.ecomAnchorLiveStyle = this.ecomAnchorLiveStyle;
        aweme.banners = this.banners;
        aweme.standardComponentInfo = this.standardComponentInfo;
        aweme.contentModel = this.contentModel;
        aweme.interactStickerStructs = this.interactStickerStructs;
        aweme.descLanguage = this.descLanguage;
        aweme.floatingCardInfo = this.floatingCardInfo;
        aweme.originCommentIds = this.originCommentIds;
        aweme.requestId = this.requestId;
        aweme.uniqueId = this.uniqueId;
        aweme.awemeControl = this.awemeControl;
        aweme.hasVisionSearchEntry = this.hasVisionSearchEntry;
        aweme.anchor = this.anchor;
        aweme.anchorsExtras = this.anchorsExtras;
        AwemeCommerceStruct awemeCommerceStruct = this.mCommerceVideoAuthInfo;
        aweme.mCommerceVideoAuthInfo = awemeCommerceStruct != null ? awemeCommerceStruct.m172clone() : null;
        aweme.isClientCache = this.isClientCache;
        aweme.videoReplyStruct = this.videoReplyStruct;
        aweme.linkMatch = this.linkMatch;
        aweme.marketSubType = this.marketSubType;
        aweme.marketDropStrategy = this.marketDropStrategy;
        aweme.liveWindowShowTime = this.liveWindowShowTime;
        aweme.hybridLabels = this.hybridLabels;
        aweme.mutualRelation = this.mutualRelation;
        aweme.newLiveRoomData = this.newLiveRoomData;
        aweme.relationRecommendInfo = this.relationRecommendInfo;
        aweme.recommendCardType = this.recommendCardType;
        aweme.withSurvey = this.withSurvey;
        aweme.surveyKey = this.surveyKey;
        aweme.isLiveReplay = this.isLiveReplay;
        aweme.geofencingRegions = this.geofencingRegions;
        aweme.haveDashboard = this.haveDashboard;
        aweme.groupId = this.groupId;
        aweme.hasPromoteEntry = this.hasPromoteEntry;
        aweme.promoteToastKey = this.promoteToastKey;
        aweme.promoteIconText = this.promoteIconText;
        aweme.promoteToast = this.promoteToast;
        aweme.videoMaskInfo = this.videoMaskInfo;
        aweme.videoMaskInfos = this.videoMaskInfos;
        aweme.generalMaskInfo = this.generalMaskInfo;
        aweme.photosensitiveMaskInfo = this.photosensitiveMaskInfo;
        aweme.contentClassificationMaskInfo = this.contentClassificationMaskInfo;
        aweme.reportMaskInfo = this.reportMaskInfo;
        aweme.bubbleInfo = this.bubbleInfo;
        aweme.allowGift = this.allowGift;
        aweme.userStory = UserStoryKt.copyUserStory(this.userStory);
        aweme.story = StoryKt.copyStory(this.story);
        aweme.batchId = this.batchId;
        aweme.batchIndex = this.batchIndex;
        aweme.userAffinityScore = this.userAffinityScore;
        aweme.isFriendsTabFakeAweme = this.isFriendsTabFakeAweme;
        aweme.isDescTranslatable = this.isDescTranslatable;
        aweme.isTextStickerTranslatable = this.isTextStickerTranslatable;
        aweme.textStickerMajorityLang = this.textStickerMajorityLang;
        aweme.isPhotoTitleTranslatable = this.isPhotoTitleTranslatable;
        aweme.photoTitleLanguageCode = this.photoTitleLanguageCode;
        aweme.contentDesc = this.contentDesc;
        aweme.contentDescExtra = this.contentDescExtra;
        aweme.productsInfo = this.productsInfo;
        aweme.productsCount = this.productsCount;
        aweme.nearbyInfo = this.nearbyInfo;
        aweme.share2StoryStruct = this.share2StoryStruct;
        aweme.poiReTagSignal = this.poiReTagSignal;
        aweme.poiReTagText = this.poiReTagText;
        aweme.poiReTagInfo = this.poiReTagInfo;
        aweme.poiDataStruct = this.poiDataStruct;
        aweme.poiTrace = this.poiTrace;
        aweme.ugcPoiTicketDetail = this.ugcPoiTicketDetail;
        aweme.ccTemplateInfo = this.ccTemplateInfo;
        aweme.musicSelectedFrom = this.musicSelectedFrom;
        aweme.musicPromoId = this.musicPromoId;
        aweme.musicPromoTagInfo = this.musicPromoTagInfo;
        aweme.musicDiscoveryInfo = this.musicDiscoveryInfo;
        aweme.musicRecallReasonFlag = this.musicRecallReasonFlag;
        aweme.musicTitleStyle = this.musicTitleStyle;
        aweme.ttsVoiceIDs = this.ttsVoiceIDs;
        aweme.ttsVoiceRefIDs = this.ttsVoiceRefIDs;
        aweme.vcVoiceIDs = this.vcVoiceIDs;
        aweme.vcVoiceRefIDs = this.vcVoiceRefIDs;
        aweme.isPinnedByArtist = this.isPinnedByArtist;
        aweme.transParams = this.transParams;
        aweme.awemeACLShareInfo = this.awemeACLShareInfo;
        aweme.memeRegInfo = this.memeRegInfo;
        aweme.photoModeImageInfo = this.photoModeImageInfo;
        aweme.photoModeTextInfo = this.photoModeTextInfo;
        aweme.surveyInfo = this.surveyInfo;
        aweme.surveyInfos = this.surveyInfos;
        aweme.interactiveInstructions = this.interactiveInstructions;
        aweme.interactiveRecMatchInfo = this.interactiveRecMatchInfo;
        aweme.promptResult = this.promptResult;
        aweme.behindTheSongMusicIds = this.behindTheSongMusicIds;
        aweme.behindTheSongMetaData = this.behindTheSongMetaData;
        aweme.detailPageVideoTag = this.detailPageVideoTag;
        aweme.mainArchCommon = this.mainArchCommon;
        aweme.isTikTokStory = this.isTikTokStory;
        aweme.isStoryToNormal = this.isStoryToNormal;
        aweme.playlist_info = this.playlist_info;
        aweme.aigcInfo = this.aigcInfo;
        aweme.moderationAigcInfo = this.moderationAigcInfo;
        aweme.addYoursRecommendation = this.addYoursRecommendation;
        aweme.addYoursInfoStruct = this.addYoursInfoStruct;
        aweme.pickedUsers = this.pickedUsers;
        aweme.commentTopBarStructList = this.commentTopBarStructList;
        aweme.declarationInfo = this.declarationInfo;
        aweme.trashBinRemainingTime = this.trashBinRemainingTime;
        aweme.storyNoteInfo = this.storyNoteInfo;
        aweme.videoMentionInfoStruct = this.videoMentionInfoStruct;
        aweme.hasEverAdvertised = this.hasEverAdvertised;
        aweme.searchInfo = this.searchInfo;
        aweme.detailLynxCardStruct = this.detailLynxCardStruct;
        aweme.isStreaksPost = this.isStreaksPost;
        aweme.streaksMeta = this.streaksMeta;
        aweme.quickReplyEmojis = this.quickReplyEmojis;
        aweme.celebrationMetaData = this.celebrationMetaData;
        aweme.isUnconsumedReuse = this.isUnconsumedReuse;
        aweme.solariaProfile = this.solariaProfile;
        aweme.templateButtonConfig = this.templateButtonConfig;
        aweme.templateAssetInfo = this.templateAssetInfo;
        aweme.visualSearchInfo = this.visualSearchInfo;
        aweme.takoBubbleInfo = this.takoBubbleInfo;
        aweme.commentAtTakoInfo = this.commentAtTakoInfo;
        aweme.socialInteractionBlobProto = this.socialInteractionBlobProto;
        aweme.detailPageItemType = this.detailPageItemType;
        aweme.mAnimatedImageInfo = this.mAnimatedImageInfo;
        aweme.smartSearchInfo = this.smartSearchInfo;
        aweme.geccContentSellingPoint = this.geccContentSellingPoint;
        aweme.revealStoryPromoCardInfo = this.revealStoryPromoCardInfo;
        aweme.mPaidContentInfo = this.mPaidContentInfo;
        aweme.mixStickerInfo = this.mixStickerInfo;
        aweme.ueFeedInfo = this.ueFeedInfo;
        aweme.ecosystemPerceptionInfos = this.ecosystemPerceptionInfos;
        aweme.mdpTemplatePinReason = this.mdpTemplatePinReason;
        aweme.musicBeginTime = this.musicBeginTime;
        aweme.musicEndTime = this.musicEndTime;
        aweme.storyHighlightInfo = this.storyHighlightInfo;
        aweme.translatedVideo = this.translatedVideo;
        aweme.aiTheaterInfo = this.aiTheaterInfo;
        aweme.aiRemixInfo = this.aiRemixInfo;
        aweme.isPaidContent = this.isPaidContent;
        aweme.aiPortraitInfo = this.aiPortraitInfo;
        return aweme;
    }

    public AIGCInfo getAigcInfo() {
        if (this.aigcInfo == null) {
            this.aigcInfo = new AIGCInfo();
        }
        return this.aigcInfo;
    }

    public AwemeControl getAwemeControl() {
        if (this.awemeControl == null) {
            this.awemeControl = new AwemeControl();
        }
        return this.awemeControl;
    }

    public VideoMaskInfo getContentClassificationMaskInfo() {
        if (this.contentClassificationMaskInfo == null) {
            this.contentClassificationMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 5);
        }
        return this.contentClassificationMaskInfo;
    }

    public VideoTag getDetailPageVideoTag() {
        return VideoTag.getTag(this.detailPageVideoTag);
    }

    public FootNoteInfo getFootNoteInfo() {
        TnSUserExperienceFeedInfo tnSUserExperienceFeedInfo = this.ueFeedInfo;
        if (tnSUserExperienceFeedInfo == null) {
            return null;
        }
        return tnSUserExperienceFeedInfo.footNoteInfo;
    }

    public VideoMaskInfo getGeneralMaskInfo() {
        if (this.generalMaskInfo == null) {
            this.generalMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 3);
        }
        return this.generalMaskInfo;
    }

    public String getItemDistributeSource() {
        return !TextUtils.isEmpty(this.mItemDistributeSource) ? this.mItemDistributeSource : "";
    }

    public List<LiveRoomStatesTag> getLiveExtraInfoStruct() {
        LiveExtraInfoStruct liveExtraInfoStruct = this.liveExtraInfoStruct;
        if (liveExtraInfoStruct != null) {
            return liveExtraInfoStruct.liveRoomStatesTagsForClientFunc;
        }
        return null;
    }

    public String getLogPbString() {
        LogPbBean logPbBean = this.logPb;
        return logPbBean == null ? "" : logPbBean.toJsonString();
    }

    public MemeVideoReg getMemeRegInfo() {
        MemeRegInfo memeRegInfo = this.memeRegInfo;
        if (memeRegInfo == null) {
            return null;
        }
        return memeRegInfo.memeVideoReg;
    }

    public MixStickerInfo getMixStickerInfo() {
        if (this.mixStickerInfo == null) {
            this.mixStickerInfo = new MixStickerInfo();
        }
        return this.mixStickerInfo;
    }

    public ConcurrentHashMap<String, AwemeBizData> getNormalBizFields() {
        if (this.normalBizFields == null) {
            this.normalBizFields = new ConcurrentHashMap<>();
        }
        return this.normalBizFields;
    }

    public VideoMaskInfo getPhotosensitiveMaskInfo() {
        if (this.photosensitiveMaskInfo == null) {
            this.photosensitiveMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 4);
        }
        return this.photosensitiveMaskInfo;
    }

    public PoiDataStruct getPoiDataStruct() {
        return (this.searchPoiDataStruct == null || SearchAwemePoiDataExperiment.INSTANCE.isEnable()) ? this.poiDataStruct : this.searchPoiDataStruct;
    }

    public VideoMaskInfo getReportMaskInfo() {
        if (this.reportMaskInfo == null) {
            this.reportMaskInfo = VideoMaskUtil.INSTANCE.getMaskInfo(getVideoMaskInfos(), 1);
        }
        return this.reportMaskInfo;
    }

    public ConcurrentHashMap<String, AwemeBizData> getTransientBizFields() {
        if (this.transientBizFields == null) {
            this.transientBizFields = new ConcurrentHashMap<>();
        }
        return this.transientBizFields;
    }

    public Video getVideo() {
        TranslatedVideo translatedVideo;
        return (!this.isPlayingTranslatedVideo || (translatedVideo = this.translatedVideo) == null) ? this.video : translatedVideo.getVideo();
    }

    public List<VideoMaskInfo> getVideoMaskInfos() {
        if (this.videoMaskInfos == null) {
            this.videoMaskInfos = new ArrayList();
        }
        return this.videoMaskInfos;
    }

    public boolean hasTrendingBar() {
        return this.trendingBar != null;
    }

    public boolean hasTrendingBarFYP() {
        return this.trendingBarFYP != null;
    }

    public boolean isAd() {
        return this.isAd && this.awemeRawAd != null;
    }

    public boolean isHashTag() {
        return this.isHashTag == 1;
    }

    public boolean isLike() {
        return this.userDigg == 1;
    }

    public boolean isSoftAd() {
        return this.isSoftAd && this.awemeRawAd != null;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.challengeList);
        String strValueOf2 = String.valueOf(this.greenScreenMaterialList);
        String strValueOf3 = String.valueOf(this.textExtra);
        String strValueOf4 = String.valueOf(this.videoLabels);
        StringBuilder sb = new StringBuilder(C309430CAz.LIZ);
        StringBuilder sb2 = new StringBuilder();
        ConcurrentHashMap<String, AwemeBizData> concurrentHashMap = this.transientBizFields;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, AwemeBizData> entry : concurrentHashMap.entrySet()) {
                AwemeBizData value = entry.getValue();
                Object obj = value.fieldData;
                if (value.joinToString && obj != null) {
                    if (obj instanceof String) {
                        sb2.append(", ");
                        sb2.append(entry.getKey());
                        sb2.append("='");
                        sb2.append(obj);
                        sb2.append('\'');
                    } else {
                        sb2.append(", ");
                        sb2.append(entry.getKey());
                        sb2.append("=");
                        sb2.append(obj);
                    }
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap<String, AwemeBizData> concurrentHashMap2 = this.normalBizFields;
        if (concurrentHashMap2 != null) {
            for (Map.Entry<String, AwemeBizData> entry2 : concurrentHashMap2.entrySet()) {
                AwemeBizData value2 = entry2.getValue();
                Object obj2 = value2.fieldData;
                if (value2.joinToString && obj2 != null) {
                    if (obj2 instanceof String) {
                        sb3.append(", ");
                        sb3.append(entry2.getKey());
                        sb3.append("='");
                        sb3.append(obj2);
                        sb3.append('\'');
                    } else {
                        sb3.append(", ");
                        sb3.append(entry2.getKey());
                        sb3.append("=");
                        sb3.append(obj2);
                    }
                }
            }
        }
        sb.append("Aweme{aid='");
        sb.append(this.aid);
        sb.append("', desc='");
        sb.append(this.desc);
        sb.append("', createTime=");
        sb.append(this.createTime);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", addedSoundMusicInfo=");
        sb.append(this.addedSoundMusicInfo);
        sb.append(", musicVolume=");
        sb.append(this.musicVolume);
        sb.append(", originVolume=");
        sb.append(this.originVolume);
        sb.append(", challengeList=");
        sb.append(strValueOf);
        sb.append(", greenScreenMaterialList=");
        sb.append(strValueOf2);
        sb.append(", video=");
        sb.append(this.video);
        sb.append(", audio=");
        sb.append(this.audio);
        sb.append(", shareUrl='");
        sb.append(this.shareUrl);
        sb.append("', userDigg=");
        sb.append(this.userDigg);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", extra='");
        sb.append(this.extra);
        sb.append("', rate=");
        sb.append(this.rate);
        sb.append(", shareInfo=");
        sb.append(this.shareInfo);
        sb.append(", shareOperationInfo=");
        sb.append(this.shareOperationInfo);
        sb.append(", labelLarge=");
        sb.append(this.labelLarge);
        sb.append(", labelThumb=");
        sb.append(this.labelThumb);
        sb.append(", textExtra=");
        sb.append(strValueOf3);
        sb.append(", isTop=");
        sb.append(this.isTop);
        sb.append(", labelTop=");
        sb.append(this.labelTop);
        sb.append(", isAd=");
        sb.append(this.isAd);
        sb.append(", isSoftAd=");
        sb.append(this.isSoftAd);
        sb.append(", awemeType=");
        sb.append(this.awemeType);
        sb.append(", awemeRawAd=");
        sb.append(this.awemeRawAd);
        sb.append(", specialSticker=");
        sb.append(this.specialSticker);
        sb.append(", videoLabels=");
        sb.append(strValueOf4);
        sb.append(", cmtSwt=");
        sb.append(this.cmtSwt);
        sb.append(", adSchedule=");
        sb.append(this.adSchedule);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", recommendCardType=");
        sb.append(this.recommendCardType);
        sb.append(", detailPageVideoTag=");
        sb.append(this.detailPageVideoTag);
        sb.append(", isTikTokStory=");
        sb.append(this.isTikTokStory);
        sb.append(", isStoryToNormal=");
        sb.append(this.isStoryToNormal);
        sb.append(", addYoursRecommendation=");
        sb.append(this.addYoursRecommendation);
        sb.append(", addYoursInfoStruct=");
        sb.append(this.addYoursInfoStruct);
        sb.append(", batchId=");
        sb.append(this.batchId);
        sb.append(", batchIndex=");
        sb.append(this.batchIndex);
        sb.append(", userAffinityScore=");
        sb.append(this.userAffinityScore);
        sb.append(", hasEverAdvertised");
        sb.append(this.hasEverAdvertised);
        sb.append(", searchInfo=");
        sb.append(this.searchInfo);
        sb.append((CharSequence) sb2);
        sb.append((CharSequence) sb3);
        sb.append('}');
        return sb.toString();
    }

    public Aweme() {
        int i = VideoTag.DEFAULT.videoTag;
        this.detailPageVideoTag = i;
        this.detailPageItemType = i;
        this.exposedCommentInfoList = null;
        this.mdpTemplatePinReason = null;
        this.isPinnedByArtist = false;
        this.isOnThisDay = 0;
        this.poiBoostData = null;
        this.poiReTagSignal = 0;
        this.genreType = "";
        this.isPlayingTranslatedVideo = false;
        this.generalMaskInfo = null;
        this.photosensitiveMaskInfo = null;
        this.reportMaskInfo = null;
        this.contentClassificationMaskInfo = null;
    }

    public int hashCode() {
        return (AwemeSaaSExtKt.canUseUniqueId(this) ? AwemeSaaSExtKt.getUniqueId(this) : this.aid).hashCode();
    }

    /* JADX INFO: loaded from: classes.dex */
    public enum ExploreCommunityCommentShowType {
        EXPLORE_COMMUNITY_COMMENT_SHOW_TYPE_NONE(0),
        EXPLORE_COMMUNITY_COMMENT_SHOW_TYPE_LOGO(1);

        public final int value;

        public int getValue() {
            return this.value;
        }

        public static ExploreCommunityCommentShowType fromValue(int i) {
            for (ExploreCommunityCommentShowType exploreCommunityCommentShowType : values()) {
                if (exploreCommunityCommentShowType.value == i) {
                    return exploreCommunityCommentShowType;
                }
            }
            return EXPLORE_COMMUNITY_COMMENT_SHOW_TYPE_NONE;
        }

        public static ExploreCommunityCommentShowType valueOf(String str) {
            return (ExploreCommunityCommentShowType) C08FF.LIZ(ExploreCommunityCommentShowType.class, str);
        }

        ExploreCommunityCommentShowType(int i) {
            this.value = i;
        }
    }

    public AbRollStruct getAbRollStruct() {
        return this.abRollStruct;
    }

    public CommerceActivityStruct getActivityPendant() {
        return this.activityPendant;
    }

    public int getAdAwemeSource() {
        return this.adAwemeSource;
    }

    public int getAdLinkType() {
        return this.adLinkType;
    }

    public String getAdSchedule() {
        return this.adSchedule;
    }

    public AddYoursInfoStruct getAddYoursInfoStruct() {
        return this.addYoursInfoStruct;
    }

    public AddYoursRecommendation getAddYoursRecommendation() {
        return this.addYoursRecommendation;
    }

    public Music getAddedSoundMusicInfo() {
        return this.addedSoundMusicInfo;
    }

    public AIAliveInfo getAiAliveInfo() {
        return this.aiAliveInfo;
    }

    public String getAid() {
        return this.aid;
    }

    public int getAllowAIRemix() {
        return this.allowAIRemix;
    }

    public boolean getAllowGift() {
        return this.allowGift;
    }

    public Boolean getAllowReuseOriginalSound() {
        return this.allowReuseOriginalSound;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public List<AnchorCommonStruct> getAnchors() {
        return this.anchors;
    }

    public String getAnchorsExtras() {
        return this.anchorsExtras;
    }

    public AnimatedBtnStruct getAnimatedBtnStruct() {
        return this.animatedBtnStruct;
    }

    public AnimatedImageInfo getAnimatedImageInfo() {
        return this.mAnimatedImageInfo;
    }

    public Audio getAudio() {
        return this.audio;
    }

    public User getAuthor() {
        return this.author;
    }

    public Boolean getAuthorLive() {
        return this.authorLive;
    }

    public AwemeACLShare getAwemeACLShareInfo() {
        return this.awemeACLShareInfo;
    }

    public AwemeActivity getAwemeActivity() {
        return this.activity;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public AwemeRiskModel getAwemeRiskModel() {
        return this.awemeRiskModel;
    }

    public int getAwemeType() {
        return this.awemeType;
    }

    public BannerTip getBannerTip() {
        return this.bannerTip;
    }

    public List<BannerCommonStruct> getBanners() {
        return this.banners;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public int getBatchIndex() {
        return this.batchIndex;
    }

    public BehindTheSongMetaData getBehindTheSongMetaData() {
        return this.behindTheSongMetaData;
    }

    public List<String> getBehindTheSongMusicIds() {
        return this.behindTheSongMusicIds;
    }

    public Boost getBoost() {
        return this.boost;
    }

    public BottomBarModel getBottomBarModel() {
        return this.bottomBarModel;
    }

    public List<BrandedContentAccount> getBrandContentAccounts() {
        return this.brandContentAccounts;
    }

    public BrandSafetyInfo getBrandSafetyInfo() {
        return this.brandSafetyInfo;
    }

    public AwemeBubbleInfo getBubbleInfo() {
        return this.bubbleInfo;
    }

    public C2PAInfo getC2paInfo() {
        return this.c2paInfo;
    }

    public CardInsertInfo getCardInsertInfo() {
        return this.cardInsertInfo;
    }

    public CCTemplateInfo getCcTemplateInfo() {
        return this.ccTemplateInfo;
    }

    public CelebrationMetaData getCelebrationMetaData() {
        return this.celebrationMetaData;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public CollabInfo getCollabInfo() {
        return this.collabInfo;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public CommentAtTakoInfo getCommentAtTakoInfo() {
        return this.commentAtTakoInfo;
    }

    public AwemeCommentConfig getCommentConfig() {
        return this.commentConfig;
    }

    public CommentPostInfo getCommentPostInfo() {
        return this.commentPostInfo;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public CommentSuggestWordList getCommentSuggestWordList() {
        return this.commentSuggestWordList;
    }

    public List<CommentTopBarStruct> getCommentTopBarStructList() {
        return this.commentTopBarStructList;
    }

    public List<CommerceConfigData> getCommerceConfigDataList() {
        return this.commerceConfigDataList;
    }

    public CommerceRerankInfo getCommerceRerankInfo() {
        return this.commerceRerankInfo;
    }

    public CommerceStickerInfo getCommerceStickerInfo() {
        return this.commerceStickerInfo;
    }

    public AwemeCommerceStruct getCommerceVideoAuthInfo() {
        return this.mCommerceVideoAuthInfo;
    }

    public String getCommercialVideoInfo() {
        return this.commercialVideoInfo;
    }

    public String getContentDesc() {
        return this.contentDesc;
    }

    public List<TextExtraStruct> getContentDescExtra() {
        return this.contentDescExtra;
    }

    public ContentModel getContentModel() {
        return this.contentModel;
    }

    public int getContentOriginalType() {
        return this.contentOriginalType;
    }

    public int getContentSizeType() {
        return this.contentSizeType;
    }

    public String getContentType() {
        return this.contentType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public CreationInfo getCreationInfo() {
        return this.creationInfo;
    }

    public CreatorAIComment getCreatorAIComment() {
        return this.creatorAIComment;
    }

    public List<DeclarationInfoStruct> getDeclarationInfo() {
        return this.declarationInfo;
    }

    public int getDeduplicationType() {
        return this.deduplicationType;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDescLanguage() {
        return this.descLanguage;
    }

    public DescTitleTranslatedText getDescTitleTranslatedText() {
        return this.descTitleTranslatedText;
    }

    public DescendantsModel getDescendantsModel() {
        return this.descendantsModel;
    }

    public int getDetailPageItemType() {
        return this.detailPageItemType;
    }

    public String getDeviceMLFeatures() {
        return this.deviceMLFeatures;
    }

    public String getDistance() {
        return this.distance;
    }

    public int getDistributeType() {
        return this.distributeType;
    }

    public HotSearchInfo getDouDiscountMixInfo() {
        return this.douDiscountMixInfo;
    }

    public boolean getDownloadWithoutWatermark() {
        return this.downloadWithoutWatermark;
    }

    public Dsp getDsp() {
        return this.dsp;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public DuetInfo getDuettedInfo() {
        return this.duettedInfo;
    }

    public EcFeedSuggestWordList getEcFeedSuggestWordList() {
        return this.ecFeedSuggestWordList;
    }

    public EcSearchGrowthInfo getEcSearchGrowthInfo() {
        return this.ecSearchGrowthInfo;
    }

    public Integer getEcomAnchorLiveStyle() {
        return this.ecomAnchorLiveStyle;
    }

    public String getEcomAnchorViewObject() {
        return this.ecomAnchorViewObject;
    }

    public List<EcosystemPerceptionInfo> getEcosystemPerceptionInfos() {
        return this.ecosystemPerceptionInfos;
    }

    public EditPostPermission getEditPostPermission() {
        return this.editPostPermission;
    }

    public Integer getExploreCommunityCommentShowType() {
        return this.exploreCommunityCommentShowType;
    }

    public List<ExposedCommentInfo> getExposedCommentInfoList() {
        return this.exposedCommentInfoList;
    }

    public String getExtra() {
        return this.extra;
    }

    public RelationLabelNew getFeedRelationLabel() {
        return this.feedRelationLabel;
    }

    public FloatingCardInfo getFloatingCardInfo() {
        return this.floatingCardInfo;
    }

    public String getFollowUpFirstItemId() {
        return this.followUpFirstItemId;
    }

    public String getFollowUpItemIdGroups() {
        return this.followUpItemIdGroups;
    }

    public long getFollowUpPublishFromId() {
        return this.followUpPublishFromId;
    }

    public String getForwardCommentId() {
        return this.forwardCommentId;
    }

    public Aweme getForwardItem() {
        return this.forwardItem;
    }

    public String getForwardItemId() {
        return this.forwardItemId;
    }

    public GameInfo getGameInfo() {
        return this.gameInfo;
    }

    public GeccContentSellingPoint getGeccContentSellingPoint() {
        return this.geccContentSellingPoint;
    }

    public List<String> getGeofencingRegions() {
        return this.geofencingRegions;
    }

    public List<GreenScreenMaterial> getGreenScreenMaterials() {
        return this.greenScreenMaterialList;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public GroupIdListStruct getGroupIdList() {
        return this.groupIdList;
    }

    public Boolean getHasEverAdvertised() {
        return this.hasEverAdvertised;
    }

    public int getHasPromoteEntry() {
        return this.hasPromoteEntry;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HotListStruct getHotListStruct() {
        return this.hotListStruct;
    }

    public HotSearchInfo getHotSearchInfo() {
        return this.hotSearchInfo;
    }

    public List<AwemeHybridLabelModel> getHybridLabels() {
        return this.hybridLabels;
    }

    public List<ImageInfo> getImageInfos() {
        return this.imageInfos;
    }

    public InteractPermission getInteractPermission() {
        return this.interactPermission;
    }

    public List<InteractStickerStruct> getInteractStickerStructs() {
        return this.interactStickerStructs;
    }

    public InteractionTagInfo getInteractionTagInfo() {
        return this.interactionTagInfo;
    }

    public List<Long> getInteractiveInstructions() {
        return this.interactiveInstructions;
    }

    public InteractiveRecMatchInfo getInteractiveRecMatchInfo() {
        return this.interactiveRecMatchInfo;
    }

    public boolean getIsCommentPostVideo() {
        return this.isCommentPostVideo;
    }

    public boolean getIsLiveHasProduct() {
        return this.isLiveHasProduct;
    }

    public boolean getIsPlayingTranslatedVideo() {
        return this.isPlayingTranslatedVideo;
    }

    public boolean getIsStoryToNormal() {
        return this.isStoryToNormal;
    }

    public boolean getIsTikTokStory() {
        return this.isTikTokStory;
    }

    public int getIsTop() {
        return this.isTop;
    }

    public boolean getIsUnconsumedReuse() {
        return this.isUnconsumedReuse;
    }

    public int getItemSourceCategory() {
        return this.mItemSourceCategory;
    }

    public SearchKeySegmentsInfo getKeySegmentsInfo() {
        return this.keySegmentsInfo;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public String getLabelMusicStarterText() {
        return this.mLabelMusicStarterText;
    }

    public UrlModel getLabelPrivate() {
        return this.labelPrivate;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public UrlModel getLabelTop() {
        return this.labelTop;
    }

    public String getLandingPage() {
        return this.landingPage;
    }

    public LayoutInfo getLayoutInfo() {
        return this.layoutInfo;
    }

    public LinkData getLinkAdData() {
        return this.linkAdData;
    }

    public LinkMatch getLinkMatch() {
        return this.linkMatch;
    }

    public LiveAwesomeSplashInfo getLiveAwesomeSplashInfo() {
        return this.mLiveAwesomeSplashInfo;
    }

    public long getLiveId() {
        return this.liveId;
    }

    public String getLiveReaSon() {
        return this.liveReaSon;
    }

    public List<LiveRoomStatesTag> getLiveRoomStatesTags() {
        return this.liveRoomStatesTags;
    }

    public String getLiveType() {
        return this.liveType;
    }

    public long getLiveWindowShowTime() {
        return this.liveWindowShowTime;
    }

    public LocalServiceInfo getLocalServiceInfo() {
        return this.localServiceInfo;
    }

    public LocalServiceLiveInfo getLocalServiceLiveInfo() {
        return this.localServiceLiveInfo;
    }

    public LogPbBean getLogPbBean() {
        return this.logPb;
    }

    public List<LongVideo> getLongVideos() {
        return this.longVideos;
    }

    public DetailLynxCardStruct getLynxCardStruct() {
        return this.detailLynxCardStruct;
    }

    public PaidContentInfo getMPaidContentInfo() {
        return this.mPaidContentInfo;
    }

    public MainArchCommon getMainArchCommon() {
        return this.mainArchCommon;
    }

    public int getMarketDropStrategy() {
        return this.marketDropStrategy;
    }

    public int getMarketSubType() {
        return this.marketSubType;
    }

    public String getMatchText() {
        return this.matchText;
    }

    public int getMatchType() {
        return this.matchType;
    }

    public MDPTemplatePinReason getMdpTemplatePinReason() {
        return this.mdpTemplatePinReason;
    }

    public MicroAppInfo getMicroAppInfo() {
        return this.microAppInfo;
    }

    public MixStruct getMixInfo() {
        return this.mixInfo;
    }

    public HashMap<String, String> getMobParams() {
        return this.mMobParams;
    }

    public ModerationAigcInfo getModerationAigcInfo() {
        return this.moderationAigcInfo;
    }

    public Music getMusic() {
        return this.music;
    }

    public int getMusicBeginTime() {
        return this.musicBeginTime;
    }

    public MusicDiscoveryInfo getMusicDiscoveryInfo() {
        return this.musicDiscoveryInfo;
    }

    public int getMusicEndTime() {
        return this.musicEndTime;
    }

    public String getMusicPromoId() {
        return this.musicPromoId;
    }

    public MusicPromoTagInfo getMusicPromoTagInfo() {
        return this.musicPromoTagInfo;
    }

    public int getMusicRecallReasonFlag() {
        return this.musicRecallReasonFlag;
    }

    public String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public UrlModel getMusicStarter() {
        return this.musicStarter;
    }

    public int getMusicTitleStyle() {
        return this.musicTitleStyle;
    }

    public String getMusicVolume() {
        return this.musicVolume;
    }

    public MutualStruct getMutualRelation() {
        return this.mutualRelation;
    }

    public NearbyInfo getNearbyInfo() {
        return this.nearbyInfo;
    }

    public int getNewLabel() {
        return this.newLabel;
    }

    public NewUserRecommendedReason getNewUserRecommendedReason() {
        return this.mNewUserRecommendedReason;
    }

    public List<Position> getNicknamePosition() {
        return this.nicknamePosition;
    }

    public NowPostInfo getNowPostInfo() {
        return this.nowPostInfo;
    }

    public String getOceanGroupInfo() {
        return this.oceanGroupInfo;
    }

    public OfflineVideoInfo getOfflineVideoInfo() {
        return this.offlineVideoInfo;
    }

    public OnboardingSurvey getOnboardingSurvey() {
        return this.mOnboardingSurvey;
    }

    public List<OperatorBoost> getOperatorBoosts() {
        return this.operatorBoosts;
    }

    public UrlModel getOriginAuthor() {
        return this.originAuthor;
    }

    public List<String> getOriginCommentIds() {
        return this.originCommentIds;
    }

    public String getOriginVolume() {
        return this.originVolume;
    }

    public ClientText getOriginalClientText() {
        return this.originalClientText;
    }

    public Video getOriginalVideo() {
        return this.video;
    }

    public float getParameterizedSpeed() {
        return this.parameterizedSpeed;
    }

    public String getPartN() {
        return this.partN;
    }

    public PersonalizedOnboardingSurvey getPersonalizedOnboardingSurvey() {
        return this.mPersonalizedOnboardingSurvey;
    }

    public PersonalizedSurveyUI getPersonalizedSurveyUI() {
        return this.mPersonalizedSurveyUI;
    }

    public PhotoModeImageInfo getPhotoModeImageInfo() {
        return this.photoModeImageInfo;
    }

    public PhotoModeTextInfo getPhotoModeTextInfo() {
        return this.photoModeTextInfo;
    }

    public String getPhotoTitleLanguageCode() {
        return this.photoTitleLanguageCode;
    }

    public List<User> getPickedUsers() {
        return this.pickedUsers;
    }

    public boolean getPlaylistBlocked() {
        return this.playlistBlocked;
    }

    public PlayListInfo getPlaylist_info() {
        return this.playlist_info;
    }

    public PodcastInfo getPodcastInfo() {
        return this.podcastInfo;
    }

    public PoiBoostData getPoiBoostData() {
        return this.poiBoostData;
    }

    public PoiReTagInfo getPoiReTagInfo() {
        return this.poiReTagInfo;
    }

    public int getPoiReTagSignal() {
        return this.poiReTagSignal;
    }

    public String getPoiReTagText() {
        return this.poiReTagText;
    }

    public PoiTrace getPoiTrace() {
        return this.poiTrace;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public List<PostSearchInfo> getPostSearchInfoList() {
        return this.mPostSearchInfoList;
    }

    public String getPreForwardId() {
        return this.preForwardId;
    }

    public Preload getPreload() {
        return this.preload;
    }

    public int getProductRecallType() {
        return this.productRecallType;
    }

    public int getProductsCount() {
        return this.productsCount;
    }

    public List<Product> getProductsInfo() {
        return this.productsInfo;
    }

    public int getPromoteCapcutToggle() {
        return this.PromoteCapcutToggle;
    }

    public String getPromoteIconText() {
        return this.promoteIconText;
    }

    public PromoteModel getPromoteModel() {
        return this.promoteModel;
    }

    public String getPromoteToast() {
        return this.promoteToast;
    }

    public String getPromoteToastKey() {
        return this.promoteToastKey;
    }

    public PromptResult getPromptResult() {
        return this.promptResult;
    }

    public PSPInfo getPspInfo() {
        return this.pspInfo;
    }

    public QuickShareAIInfo getQuickShareAIInfo() {
        return this.quickShareAIInfo;
    }

    public int getRate() {
        return this.rate;
    }

    public PoiDataStruct getRawPoiDataStruct() {
        return this.poiDataStruct;
    }

    public int getReactSetting() {
        return this.reactSetting;
    }

    public RealtimeFcpConfig getRealtimeConfig() {
        return this.realtimeFcpConfig;
    }

    public RecReasonEntry getRecReasonTag() {
        return this.recReasonTag;
    }

    public RecReasonsStruct getRecReasonsStruct() {
        return this.recReasonsStruct;
    }

    public int getRecommendCardType() {
        return this.recommendCardType;
    }

    public String getRegion() {
        return this.region;
    }

    public RelatedLiveTagStruct getRelatedLiveTag() {
        return this.relatedLiveTagStruct;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public AwemeRelationRecommendModel getRelationRecommendInfo() {
        return this.relationRecommendInfo;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public int getRetryType() {
        return this.retryType;
    }

    public RevealStoryPromoCardInfo getRevealStoryPromoCardInfo() {
        return this.revealStoryPromoCardInfo;
    }

    public RoomStruct getRoom() {
        return this.room;
    }

    public RoomFeedCellStruct getRoomFeedCellStruct() {
        return this.mRoomFeedCellStruct;
    }

    public long getScheduleTime() {
        return this.scheduleTime;
    }

    public String getSearchDesc() {
        return this.searchDesc;
    }

    public SearchExtraStruct getSearchExtraStruct() {
        return this.searchExtraStruct;
    }

    public SearchInfo getSearchInfo() {
        return this.searchInfo;
    }

    public PoiDataStruct getSearchPoiDataStruct() {
        return this.searchPoiDataStruct;
    }

    public ShareToStoryStruct getShare2StoryStruct() {
        return this.share2StoryStruct;
    }

    public ShareToVideoStruct getShare2VideoStruct() {
        return this.share2VideoStruct;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public ShareOperationInfo getShareOperationInfo() {
        return this.shareOperationInfo;
    }

    public int getShareStoryStatus() {
        return this.shareStoryStatus;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getShootTabName() {
        return this.shootTabName;
    }

    public boolean getShowQuickDMBox() {
        return this.showQuickDMBox;
    }

    public SimilarVideoInfo getSimilarVideoInfo() {
        return this.similarVideoInfo;
    }

    public SmartSearchInfoStruct getSmartSearchInfo() {
        return this.smartSearchInfo;
    }

    public SocialInteractionBlobProto getSocialInteractionBlob() {
        return this.socialInteractionBlobProto;
    }

    public SolariaProfile getSolariaProfile() {
        return this.solariaProfile;
    }

    public int getSoundExemption() {
        return this.soundExemption;
    }

    public SpecialSticker getSpecialSticker() {
        return this.specialSticker;
    }

    public StandardComponentInfo getStandardComponentInfo() {
        return this.standardComponentInfo;
    }

    public long getStarAtlasOrderId() {
        return this.starAtlasOrderId;
    }

    public AwemeStatistics getStatistics() {
        return this.statistics;
    }

    public NewFaceStickerBean getStickerEntranceInfo() {
        return this.stickerEntranceInfo;
    }

    public String getStickerIDs() {
        return this.stickerIDs;
    }

    public int getStitchSetting() {
        return this.stitchSetting;
    }

    public Story getStory() {
        return this.story;
    }

    public StoryVideo getStoryModel() {
        return this.storyModel;
    }

    public StoryNoteInfo getStoryNoteInfo() {
        return this.storyNoteInfo;
    }

    public int getStoryType() {
        return this.storyType;
    }

    public StreaksMeta getStreaksMeta() {
        return this.streaksMeta;
    }

    public StreamUrlModel getStreamUrlModel() {
        return this.streamUrlModel;
    }

    public com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo getSurveyInfo() {
        return this.surveyInfo;
    }

    public List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> getSurveyInfos() {
        return this.surveyInfos;
    }

    public String getSurveyKey() {
        return this.surveyKey;
    }

    public String getTakeDownDesc() {
        return this.takeDownDesc;
    }

    public int getTakeDownReason() {
        return this.takeDownReason;
    }

    public TakoBubbleInfo getTakoBubbleInfo() {
        return this.takoBubbleInfo;
    }

    public TCMInfo getTcmInfo() {
        return this.tcmInfo;
    }

    public ICAssetInfo[] getTemplateAssetInfo() {
        return this.templateAssetInfo;
    }

    public TemplateButtonConfig getTemplateButtonConfig() {
        return this.templateButtonConfig;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public String getTextStickerMajorityLang() {
        return this.textStickerMajorityLang;
    }

    public List<AwemeTextLabelModel> getTextTopLabels() {
        return this.textTopLabels;
    }

    public List<AwemeTextLabelModel> getTextVideoLabels() {
        return this.textVideoLabels;
    }

    public long getTimePortalTimeStamp() {
        return this.timePortal;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleLimitedRows() {
        return this.titleLimitedRows;
    }

    public TnSUserExperienceFeedInfo getTnSUserExperienceFeedInfo() {
        return this.ueFeedInfo;
    }

    public String getTransParams() {
        return this.transParams;
    }

    public TranslatedVideo getTranslatedVideo() {
        return this.translatedVideo;
    }

    public long getTrashBinRemainingTime() {
        return this.trashBinRemainingTime;
    }

    public AwemeTrendingBar getTrendingBar() {
        return this.trendingBar;
    }

    public AwemeTrendingBar getTrendingBarFYP() {
        return this.trendingBarFYP;
    }

    public TTMInfo getTtmInfo() {
        return this.ttmInfo;
    }

    public List<String> getTtsVoiceIDs() {
        return this.ttsVoiceIDs;
    }

    public List<String> getTtsVoiceRefIDs() {
        return this.ttsVoiceRefIDs;
    }

    public TnSUserExperienceFeedInfo getUeFeedInfo() {
        return this.ueFeedInfo;
    }

    public UgcPoiTicketDetail getUgcPoiTicketDetail() {
        return this.ugcPoiTicketDetail;
    }

    public List<Position> getUniqidPosition() {
        return this.uniqidPosition;
    }

    public UpvoteInfo getUpvoteInfo() {
        return this.upvoteInfo;
    }

    public UpvotePreloadStruct getUpvotePreload() {
        return this.upvotePreload;
    }

    public UpvoteReason getUpvoteReason() {
        return this.upvoteReason;
    }

    public double getUserAffinityScore() {
        return this.userAffinityScore;
    }

    public int getUserDigg() {
        return this.userDigg;
    }

    public UserProfileInitInfo getUserProfileInitInfo() {
        return this.userProfileInitInfo;
    }

    public UserStory getUserStory() {
        return this.userStory;
    }

    public List<String> getVcVoiceIDs() {
        return this.vcVoiceIDs;
    }

    public List<String> getVcVoiceRefIDs() {
        return this.vcVoiceRefIDs;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public String getVideoFeedTag() {
        return this.videoFeedTag;
    }

    public List<AwemeLabelModel> getVideoLabels() {
        return this.videoLabels;
    }

    public VideoMaskInfo getVideoMaskInfo() {
        return this.videoMaskInfo;
    }

    public VideoMentionInfoStruct getVideoMentionInfoStruct() {
        return this.videoMentionInfoStruct;
    }

    public VideoReplyStruct getVideoReplyStruct() {
        return this.videoReplyStruct;
    }

    public VisualSearchInfoStruct getVisualSearchInfo() {
        return this.visualSearchInfo;
    }

    public boolean getWithSurvey() {
        return this.withSurvey;
    }

    public boolean hasVisionSearchEntry() {
        return this.hasVisionSearchEntry;
    }

    public boolean isCanPlay() {
        return this.canPlay;
    }

    public boolean isClientCache() {
        return this.isClientCache;
    }

    public boolean isCmtSwt() {
        return this.cmtSwt;
    }

    public boolean isDescTranslatable() {
        return this.isDescTranslatable;
    }

    public boolean isDisableSearchTrendingBar() {
        return this.disableSearchTrendingBar;
    }

    public boolean isEffectDesigner() {
        return this.isEffectDesigner;
    }

    public boolean isFamiliar() {
        return this.isFamiliar;
    }

    public boolean isFilterStrangerComments() {
        return this.filterStrangerComments;
    }

    public boolean isFilterUnfriendlyUserComments() {
        return this.filterUnfriendlyUserComments;
    }

    public boolean isFriendsTabFakeAweme() {
        return this.isFriendsTabFakeAweme;
    }

    public boolean isHasDanmaku() {
        return this.hasDanmaku;
    }

    public boolean isHaveDashboard() {
        return this.haveDashboard;
    }

    public boolean isLiveReplay() {
        return this.isLiveReplay;
    }

    public boolean isNrNff() {
        return this.isNrNff;
    }

    public boolean isPaidContent() {
        return this.isPaidContent;
    }

    public boolean isPgcShow() {
        return this.isPgcShow;
    }

    public boolean isPhotoTitleTranslatable() {
        return this.isPhotoTitleTranslatable;
    }

    public boolean isPinnedByArtist() {
        return this.isPinnedByArtist;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isRelieve() {
        return this.isRelieve;
    }

    public boolean isStreaksPost() {
        return this.isStreaksPost;
    }

    public boolean isSubOnlyVideo() {
        return this.isSubOnlyVideo;
    }

    public boolean isSupportDanmaku() {
        return this.isSupportDanmaku;
    }

    public boolean isTextStickerTranslatable() {
        return this.isTextStickerTranslatable;
    }

    public boolean isUseAwemeCache() {
        return this.useAwemeCache;
    }

    public boolean isUsedFullSong() {
        return this.isUsedFullSong;
    }

    public boolean isVr() {
        return this.isVr;
    }

    public boolean isWithPromotionalMusic() {
        return this.withPromotionalMusic;
    }

    public boolean needTTSWatermarkWhenDownload() {
        return this.needTTSWatermarkWhenDownload;
    }

    public boolean needVisionSearchEntry() {
        return this.needVisionSearchEntry;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.Aweme.equals(java.lang.Object):boolean");
    }

    public void setActivity(AwemeActivity awemeActivity) {
        this.activity = awemeActivity;
    }

    public void setAd(boolean z) {
        this.isAd = z;
    }

    public void setAdAwemeSource(int i) {
        this.adAwemeSource = i;
    }

    public void setAdLinkType(int i) {
        this.adLinkType = i;
    }

    public void setAdSchedule(String str) {
        this.adSchedule = str;
    }

    public void setAddYoursInfoStruct(AddYoursInfoStruct addYoursInfoStruct) {
        this.addYoursInfoStruct = addYoursInfoStruct;
    }

    public void setAddYoursRecommendation(AddYoursRecommendation addYoursRecommendation) {
        this.addYoursRecommendation = addYoursRecommendation;
    }

    public void setAddedSoundMusicInfo(Music music) {
        this.addedSoundMusicInfo = music;
    }

    public void setAiAliveInfo(AIAliveInfo aIAliveInfo) {
        this.aiAliveInfo = aIAliveInfo;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public void setAllowAIRemix(int i) {
        this.allowAIRemix = i;
    }

    public void setAllowGift(boolean z) {
        this.allowGift = z;
    }

    public void setAllowReuseOriginalSound(Boolean bool) {
        this.allowReuseOriginalSound = bool;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setAnchorInfo(AnchorInfo anchorInfo) {
        this.anchorInfo = anchorInfo;
    }

    public void setAnchors(List<AnchorCommonStruct> list) {
        this.anchors = list;
    }

    public void setAnchorsExtras(String str) {
        this.anchorsExtras = str;
    }

    public void setAnimatedBtnStruct(AnimatedBtnStruct animatedBtnStruct) {
        this.animatedBtnStruct = animatedBtnStruct;
    }

    public void setAnimatedImageInfo(AnimatedImageInfo animatedImageInfo) {
        this.mAnimatedImageInfo = animatedImageInfo;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAuthorLive(Boolean bool) {
        this.authorLive = bool;
    }

    public void setAwemeACLShareInfo(AwemeACLShare awemeACLShare) {
        this.awemeACLShareInfo = awemeACLShare;
    }

    public void setAwemeControl(AwemeControl awemeControl) {
        this.awemeControl = awemeControl;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.awemeRawAd = awemeRawAd;
    }

    public void setAwemeRiskModel(AwemeRiskModel awemeRiskModel) {
        this.awemeRiskModel = awemeRiskModel;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setBannerTip(BannerTip bannerTip) {
        this.bannerTip = bannerTip;
    }

    public void setBanners(List<BannerCommonStruct> list) {
        this.banners = list;
    }

    public void setBatchId(String str) {
        this.batchId = str;
    }

    public void setBatchIndex(int i) {
        this.batchIndex = i;
    }

    public void setBoost(Boost boost) {
        this.boost = boost;
    }

    public void setBottomBarModel(BottomBarModel bottomBarModel) {
        this.bottomBarModel = bottomBarModel;
    }

    public void setBrandSafetyInfo(BrandSafetyInfo brandSafetyInfo) {
        this.brandSafetyInfo = brandSafetyInfo;
    }

    public void setBubbleInfo(AwemeBubbleInfo awemeBubbleInfo) {
        this.bubbleInfo = awemeBubbleInfo;
    }

    public void setC2paInfo(C2PAInfo c2PAInfo) {
        this.c2paInfo = c2PAInfo;
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setCardInsertInfo(CardInsertInfo cardInsertInfo) {
        this.cardInsertInfo = cardInsertInfo;
    }

    public void setCcTemplateInfo(CCTemplateInfo cCTemplateInfo) {
        this.ccTemplateInfo = cCTemplateInfo;
    }

    public void setCelebrationMetaData(CelebrationMetaData celebrationMetaData) {
        this.celebrationMetaData = celebrationMetaData;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setClientCache(boolean z) {
        this.isClientCache = z;
    }

    public void setCmtSwt(boolean z) {
        this.cmtSwt = z;
    }

    public void setCollabInfo(CollabInfo collabInfo) {
        this.collabInfo = collabInfo;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommentAtTakoInfo(CommentAtTakoInfo commentAtTakoInfo) {
        this.commentAtTakoInfo = commentAtTakoInfo;
    }

    public void setCommentConfig(AwemeCommentConfig awemeCommentConfig) {
        this.commentConfig = awemeCommentConfig;
    }

    public void setCommentPostInfo(CommentPostInfo commentPostInfo) {
        this.commentPostInfo = commentPostInfo;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommentSuggestWordList(CommentSuggestWordList commentSuggestWordList) {
        this.commentSuggestWordList = commentSuggestWordList;
    }

    public void setCommentTopBarStructList(List<CommentTopBarStruct> list) {
        this.commentTopBarStructList = list;
    }

    public void setCommerceConfigDataList(List<CommerceConfigData> list) {
        this.commerceConfigDataList = list;
    }

    public void setCommerceRerankInfo(CommerceRerankInfo commerceRerankInfo) {
        this.commerceRerankInfo = commerceRerankInfo;
    }

    public void setCommerceStickerInfo(CommerceStickerInfo commerceStickerInfo) {
        this.commerceStickerInfo = commerceStickerInfo;
    }

    public void setCommerceVideoAuthInfo(AwemeCommerceStruct awemeCommerceStruct) {
        this.mCommerceVideoAuthInfo = awemeCommerceStruct;
    }

    public void setCommercialVideoInfo(String str) {
        this.commercialVideoInfo = str;
    }

    public void setContentClassificationMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.contentClassificationMaskInfo = videoMaskInfo;
    }

    public void setContentDesc(String str) {
        this.contentDesc = str;
    }

    public void setContentDescExtra(List<TextExtraStruct> list) {
        this.contentDescExtra = list;
    }

    public void setContentModel(ContentModel contentModel) {
        this.contentModel = contentModel;
    }

    public void setContentOriginalType(int i) {
        this.contentOriginalType = i;
    }

    public void setContentSizeType(int i) {
        this.contentSizeType = i;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setCreationInfo(CreationInfo creationInfo) {
        this.creationInfo = creationInfo;
    }

    public void setCreatorAIComment(CreatorAIComment creatorAIComment) {
        this.creatorAIComment = creatorAIComment;
    }

    public void setDeclarationInfo(List<DeclarationInfoStruct> list) {
        this.declarationInfo = list;
    }

    public void setDeduplicationType(int i) {
        this.deduplicationType = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDescLanguage(String str) {
        this.descLanguage = str;
    }

    public void setDescTitleTranslatedText(DescTitleTranslatedText descTitleTranslatedText) {
        this.descTitleTranslatedText = descTitleTranslatedText;
    }

    public void setDescendantsModel(DescendantsModel descendantsModel) {
        this.descendantsModel = descendantsModel;
    }

    public void setDetailPageItemType(int i) {
        this.detailPageItemType = i;
    }

    public void setDeviceMLFeatures(String str) {
        this.deviceMLFeatures = str;
    }

    public void setDisableSearchTrendingBar(boolean z) {
        this.disableSearchTrendingBar = z;
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public void setDistributeType(int i) {
        this.distributeType = i;
    }

    public void setDouDiscountMixInfo(HotSearchInfo hotSearchInfo) {
        this.douDiscountMixInfo = hotSearchInfo;
    }

    public void setDownloadWithoutWatermark(boolean z) {
        this.downloadWithoutWatermark = z;
    }

    public void setDsp(Dsp dsp) {
        this.dsp = dsp;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setDuettedInfo(DuetInfo duetInfo) {
        this.duettedInfo = duetInfo;
    }

    public void setEcFeedSuggestWordList(EcFeedSuggestWordList ecFeedSuggestWordList) {
        this.ecFeedSuggestWordList = ecFeedSuggestWordList;
    }

    public void setEcSearchGrowthInfo(EcSearchGrowthInfo ecSearchGrowthInfo) {
        this.ecSearchGrowthInfo = ecSearchGrowthInfo;
    }

    public void setEcomAnchorLiveStyle(Integer num) {
        this.ecomAnchorLiveStyle = num;
    }

    public void setEcomAnchorViewObject(String str) {
        this.ecomAnchorViewObject = str;
    }

    public void setEcosystemPerceptionInfos(List<EcosystemPerceptionInfo> list) {
        this.ecosystemPerceptionInfos = list;
    }

    public void setEditPostPermission(EditPostPermission editPostPermission) {
        this.editPostPermission = editPostPermission;
    }

    public void setEffectDesigner(boolean z) {
        this.isEffectDesigner = z;
    }

    public void setExposedCommentInfoList(List<ExposedCommentInfo> list) {
        this.exposedCommentInfoList = list;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFamiliar(boolean z) {
        this.isFamiliar = z;
    }

    public void setFeedRelationLabel(RelationLabelNew relationLabelNew) {
        this.feedRelationLabel = relationLabelNew;
    }

    public void setFilterStrangerComments(boolean z) {
        this.filterStrangerComments = z;
    }

    public void setFilterUnfriendlyUserComments(boolean z) {
        this.filterUnfriendlyUserComments = z;
    }

    public void setFloatingCardInfo(FloatingCardInfo floatingCardInfo) {
        this.floatingCardInfo = floatingCardInfo;
    }

    public void setFollowUpFirstItemId(String str) {
        this.followUpFirstItemId = str;
    }

    public void setFollowUpItemIdGroups(String str) {
        this.followUpItemIdGroups = str;
    }

    public void setFollowUpPublishFromId(long j) {
        this.followUpPublishFromId = j;
    }

    public void setForwardCommentId(String str) {
        this.forwardCommentId = str;
    }

    public void setForwardItem(Aweme aweme) {
        this.forwardItem = aweme;
    }

    public void setForwardItemId(String str) {
        this.forwardItemId = str;
    }

    public void setFriendsTabFakeAweme(boolean z) {
        this.isFriendsTabFakeAweme = z;
    }

    public void setGameInfo(GameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }

    public void setGeccContentSellingPoint(GeccContentSellingPoint geccContentSellingPoint) {
        this.geccContentSellingPoint = geccContentSellingPoint;
    }

    public void setGeneralMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.generalMaskInfo = videoMaskInfo;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupIdList(GroupIdListStruct groupIdListStruct) {
        this.groupIdList = groupIdListStruct;
    }

    public void setHasDanmaku(boolean z) {
        this.hasDanmaku = z;
    }

    public void setHasPromoteEntry(int i) {
        this.hasPromoteEntry = i;
    }

    public void setHasVisionSearchEntry(boolean z) {
        this.hasVisionSearchEntry = z;
    }

    public void setHashTag(int i) {
        this.isHashTag = i;
    }

    public void setHaveDashboard(boolean z) {
        this.haveDashboard = z;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setHotListStruct(HotListStruct hotListStruct) {
        this.hotListStruct = hotListStruct;
    }

    public void setHotSearchInfo(HotSearchInfo hotSearchInfo) {
        this.hotSearchInfo = hotSearchInfo;
    }

    public void setHybridLabels(List<AwemeHybridLabelModel> list) {
        this.hybridLabels = list;
    }

    public void setImageInfos(List<ImageInfo> list) {
        this.imageInfos = list;
    }

    public void setInteractPermission(InteractPermission interactPermission) {
        this.interactPermission = interactPermission;
    }

    public void setInteractStickerStructs(List<InteractStickerStruct> list) {
        this.interactStickerStructs = list;
    }

    public void setInteractionTagInfo(InteractionTagInfo interactionTagInfo) {
        this.interactionTagInfo = interactionTagInfo;
    }

    public void setInteractiveRecMatchInfo(InteractiveRecMatchInfo interactiveRecMatchInfo) {
        this.interactiveRecMatchInfo = interactiveRecMatchInfo;
    }

    public void setIsCommentPostVideo(boolean z) {
        this.isCommentPostVideo = z;
    }

    public void setIsDescTranslatable(boolean z) {
        this.isDescTranslatable = z;
    }

    public void setIsLiveHasProduct(boolean z) {
        this.isLiveHasProduct = z;
    }

    public void setIsPaidContent(boolean z) {
        this.isPaidContent = z;
    }

    public void setIsPhotoTitleTranslatable(boolean z) {
        this.isPhotoTitleTranslatable = z;
    }

    public void setIsPlayingTranslatedVideo(boolean z) {
        this.isPlayingTranslatedVideo = z;
    }

    public void setIsStoryToNormal(boolean z) {
        this.isStoryToNormal = z;
    }

    public void setIsStreaksPost(boolean z) {
        this.isStreaksPost = z;
    }

    public void setIsTextStickerTranslatable(boolean z) {
        this.isTextStickerTranslatable = z;
    }

    public void setIsTikTokStory(boolean z) {
        this.isTikTokStory = z;
    }

    public void setIsTop(int i) {
        this.isTop = i;
    }

    public void setIsUnconsumedReuse(boolean z) {
        this.isUnconsumedReuse = z;
    }

    public void setItemDistributeSource(String str) {
        this.mItemDistributeSource = str;
    }

    public void setItemSourceCategory(int i) {
        this.mItemSourceCategory = i;
    }

    public void setKeySegmentsInfo(SearchKeySegmentsInfo searchKeySegmentsInfo) {
        this.keySegmentsInfo = searchKeySegmentsInfo;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelMusicStarterText(String str) {
        this.mLabelMusicStarterText = str;
    }

    public void setLabelPrivate(UrlModel urlModel) {
        this.labelPrivate = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLabelTop(UrlModel urlModel) {
        this.labelTop = urlModel;
    }

    public void setLandingPage(String str) {
        this.landingPage = str;
    }

    public void setLayoutInfo(LayoutInfo layoutInfo) {
        this.layoutInfo = layoutInfo;
    }

    public void setLike(boolean z) {
        this.userDigg = z ? 1 : 0;
    }

    public void setLinkAdData(LinkData linkData) {
        this.linkAdData = linkData;
    }

    public void setLinkMatch(LinkMatch linkMatch) {
        this.linkMatch = linkMatch;
    }

    public void setLiveAwesomeSplashInfo(LiveAwesomeSplashInfo liveAwesomeSplashInfo) {
        this.mLiveAwesomeSplashInfo = liveAwesomeSplashInfo;
    }

    public void setLiveExtraInfoStruct(LiveExtraInfoStruct liveExtraInfoStruct) {
        this.liveExtraInfoStruct = liveExtraInfoStruct;
    }

    public void setLiveId(long j) {
        this.liveId = j;
    }

    public void setLiveReaSon(String str) {
        this.liveReaSon = str;
    }

    public void setLiveReplay(boolean z) {
        this.isLiveReplay = z;
    }

    public void setLiveType(String str) {
        this.liveType = str;
    }

    public void setLiveWindowShowTime(long j) {
        this.liveWindowShowTime = j;
    }

    public void setLocalServiceInfo(LocalServiceInfo localServiceInfo) {
        this.localServiceInfo = localServiceInfo;
    }

    public void setLocalServiceLiveInfo(LocalServiceLiveInfo localServiceLiveInfo) {
        this.localServiceLiveInfo = localServiceLiveInfo;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setLongVideos(List<LongVideo> list) {
        this.longVideos = list;
    }

    public void setLynxCardStruct(DetailLynxCardStruct detailLynxCardStruct) {
        this.detailLynxCardStruct = detailLynxCardStruct;
    }

    public void setMPaidContentInfo(PaidContentInfo paidContentInfo) {
        this.mPaidContentInfo = paidContentInfo;
    }

    public void setMPersonalizedOnboardingSurvey(PersonalizedOnboardingSurvey personalizedOnboardingSurvey) {
        this.mPersonalizedOnboardingSurvey = personalizedOnboardingSurvey;
    }

    public void setMPersonalizedSurveyUI(PersonalizedSurveyUI personalizedSurveyUI) {
        this.mPersonalizedSurveyUI = personalizedSurveyUI;
    }

    public void setMainArchCommon(MainArchCommon mainArchCommon) {
        this.mainArchCommon = mainArchCommon;
    }

    public void setMarketDropStrategy(int i) {
        this.marketDropStrategy = i;
    }

    public void setMarketSubType(int i) {
        this.marketSubType = i;
    }

    public void setMatchText(String str) {
        this.matchText = str;
    }

    public void setMatchType(int i) {
        this.matchType = i;
    }

    public void setMdpTemplatePinReason(MDPTemplatePinReason mDPTemplatePinReason) {
        this.mdpTemplatePinReason = mDPTemplatePinReason;
    }

    public void setMemeRegInfo(MemeRegInfo memeRegInfo) {
        this.memeRegInfo = memeRegInfo;
    }

    public void setMicroAppInfo(MicroAppInfo microAppInfo) {
        this.microAppInfo = microAppInfo;
    }

    public void setMixInfo(MixStruct mixStruct) {
        this.mixInfo = mixStruct;
    }

    public void setMixStickerInfo(MixStickerInfo mixStickerInfo) {
        this.mixStickerInfo = mixStickerInfo;
    }

    public void setModerationAigcInfo(ModerationAigcInfo moderationAigcInfo) {
        this.moderationAigcInfo = moderationAigcInfo;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicBeginTime(int i) {
        this.musicBeginTime = i;
    }

    public void setMusicDiscoveryInfo(MusicDiscoveryInfo musicDiscoveryInfo) {
        this.musicDiscoveryInfo = musicDiscoveryInfo;
    }

    public void setMusicEndTime(int i) {
        this.musicEndTime = i;
    }

    public void setMusicPromoId(String str) {
        this.musicPromoId = str;
    }

    public void setMusicPromoTagInfo(MusicPromoTagInfo musicPromoTagInfo) {
        this.musicPromoTagInfo = musicPromoTagInfo;
    }

    public void setMusicRecallReasonFlag(int i) {
        this.musicRecallReasonFlag = i;
    }

    public void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public void setMusicStarter(UrlModel urlModel) {
        this.musicStarter = urlModel;
    }

    public void setMusicTitleStyle(int i) {
        this.musicTitleStyle = i;
    }

    public void setMusicVolume(String str) {
        this.musicVolume = str;
    }

    public void setMutualRelation(MutualStruct mutualStruct) {
        this.mutualRelation = mutualStruct;
    }

    public void setNearbyInfo(NearbyInfo nearbyInfo) {
        this.nearbyInfo = nearbyInfo;
    }

    public void setNeedTTSWatermarkWhenDownload(boolean z) {
        this.needTTSWatermarkWhenDownload = z;
    }

    public void setNeedVisionSearchEntry(boolean z) {
        this.needVisionSearchEntry = z;
    }

    public void setNewUserRecommendedReason(NewUserRecommendedReason newUserRecommendedReason) {
        this.mNewUserRecommendedReason = newUserRecommendedReason;
    }

    public void setNicknamePosition(List<Position> list) {
        this.nicknamePosition = list;
    }

    public void setNowPostInfo(NowPostInfo nowPostInfo) {
        this.nowPostInfo = nowPostInfo;
    }

    public void setNrNff(boolean z) {
        this.isNrNff = z;
    }

    public void setOceanGroupInfo(String str) {
        this.oceanGroupInfo = str;
    }

    public void setOfflineVideoInfo(OfflineVideoInfo offlineVideoInfo) {
        this.offlineVideoInfo = offlineVideoInfo;
    }

    public void setOnboardingSurvey(OnboardingSurvey onboardingSurvey) {
        this.mOnboardingSurvey = onboardingSurvey;
    }

    public void setOperatorBoosts(List<OperatorBoost> list) {
        this.operatorBoosts = list;
    }

    public void setOriginAuthor(UrlModel urlModel) {
        this.originAuthor = urlModel;
    }

    public void setOriginCommentIds(List<String> list) {
        this.originCommentIds = list;
    }

    public void setOriginVolume(String str) {
        this.originVolume = str;
    }

    public void setOriginalClientText(ClientText clientText) {
        this.originalClientText = clientText;
    }

    public void setParameterizedSpeed(float f) {
        this.parameterizedSpeed = f;
    }

    public void setPartN(String str) {
        this.partN = str;
    }

    public void setPgcShow(boolean z) {
        this.isPgcShow = z;
    }

    public void setPhotoModeImageInfo(PhotoModeImageInfo photoModeImageInfo) {
        this.photoModeImageInfo = photoModeImageInfo;
    }

    public void setPhotoModeTextInfo(PhotoModeTextInfo photoModeTextInfo) {
        this.photoModeTextInfo = photoModeTextInfo;
    }

    public void setPhotoTitleLanguageCode(String str) {
        this.photoTitleLanguageCode = str;
    }

    public void setPhotosensitiveMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.photosensitiveMaskInfo = videoMaskInfo;
    }

    public void setPickedUsers(List<User> list) {
        this.pickedUsers = list;
    }

    public void setPinnedByArtist(boolean z) {
        this.isPinnedByArtist = z;
    }

    public void setPlaylistBlocked(boolean z) {
        this.playlistBlocked = z;
    }

    public void setPlaylist_info(PlayListInfo playListInfo) {
        this.playlist_info = playListInfo;
    }

    public void setPodcastInfo(PodcastInfo podcastInfo) {
        this.podcastInfo = podcastInfo;
    }

    public void setPoiDataStruct(PoiDataStruct poiDataStruct) {
        this.poiDataStruct = poiDataStruct;
    }

    public void setPoiReTagSignal(int i) {
        this.poiReTagSignal = i;
    }

    public void setPoiReTagText(String str) {
        this.poiReTagText = str;
    }

    public void setPoiTrace(PoiTrace poiTrace) {
        this.poiTrace = poiTrace;
    }

    public void setPosition(List<Position> list) {
        this.position = list;
    }

    public void setPostSearchInfoList(List<PostSearchInfo> list) {
        this.mPostSearchInfoList = list;
    }

    public void setPreForwardId(String str) {
        this.preForwardId = str;
    }

    public void setPreload(Preload preload) {
        this.preload = preload;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setProductRecallType(int i) {
        this.productRecallType = i;
    }

    public void setProductsCount(int i) {
        this.productsCount = i;
    }

    public void setProductsInfo(List<Product> list) {
        this.productsInfo = list;
    }

    public void setPromoteIconText(String str) {
        this.promoteIconText = str;
    }

    public void setPromoteToast(String str) {
        this.promoteToast = str;
    }

    public void setPromoteToastKey(String str) {
        this.promoteToastKey = str;
    }

    public void setPromptResult(PromptResult promptResult) {
        this.promptResult = promptResult;
    }

    public void setPspInfo(PSPInfo pSPInfo) {
        this.pspInfo = pSPInfo;
    }

    public void setQuickShareAIInfo(QuickShareAIInfo quickShareAIInfo) {
        this.quickShareAIInfo = quickShareAIInfo;
    }

    public void setRate(int i) {
        this.rate = i;
    }

    public void setReactSetting(int i) {
        this.reactSetting = i;
    }

    public void setRealtimeConfig(RealtimeFcpConfig realtimeFcpConfig) {
        this.realtimeFcpConfig = realtimeFcpConfig;
    }

    public void setRecReasonTag(RecReasonEntry recReasonEntry) {
        this.recReasonTag = recReasonEntry;
    }

    public void setRecReasonsStruct(RecReasonsStruct recReasonsStruct) {
        this.recReasonsStruct = recReasonsStruct;
    }

    public void setRecommendCardType(int i) {
        this.recommendCardType = i;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRelatedLiveTag(RelatedLiveTagStruct relatedLiveTagStruct) {
        this.relatedLiveTagStruct = relatedLiveTagStruct;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setRelationRecommendInfo(AwemeRelationRecommendModel awemeRelationRecommendModel) {
        this.relationRecommendInfo = awemeRelationRecommendModel;
    }

    public void setRelieve(boolean z) {
        this.isRelieve = z;
    }

    public void setReportMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.reportMaskInfo = videoMaskInfo;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        Aweme aweme;
        if (str != null && !str.isEmpty()) {
            this.requestId = str;
            AwemeSaaSExtKt.buildUniqueId(this);
            if (AwemeSaaSExtKt.isForwardAweme(this) && (aweme = this.forwardItem) != null) {
                aweme.setRequestId(str);
            }
            User user = this.author;
            if (user != null) {
                user.setRequestId(str);
            }
        }
    }

    public void setRetryType(int i) {
        this.retryType = i;
    }

    public void setRevealStoryPromoCardInfo(RevealStoryPromoCardInfo revealStoryPromoCardInfo) {
        this.revealStoryPromoCardInfo = revealStoryPromoCardInfo;
    }

    public void setRoom(RoomStruct roomStruct) {
        this.room = roomStruct;
    }

    public void setRoomFeedCellStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.mRoomFeedCellStruct = roomFeedCellStruct;
    }

    public void setSearchExtraStruct(SearchExtraStruct searchExtraStruct) {
        this.searchExtraStruct = searchExtraStruct;
    }

    public void setSearchPoiDataStruct(PoiDataStruct poiDataStruct) {
        this.searchPoiDataStruct = poiDataStruct;
    }

    public void setShare2VideoStruct(ShareToVideoStruct shareToVideoStruct) {
        this.share2VideoStruct = shareToVideoStruct;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setShareOperationInfo(ShareOperationInfo shareOperationInfo) {
        this.shareOperationInfo = shareOperationInfo;
    }

    public void setShareStoryStatus(int i) {
        this.shareStoryStatus = i;
    }

    public void setShareToStoryInfo(ShareToStoryStruct shareToStoryStruct) {
        this.share2StoryStruct = shareToStoryStruct;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setShootTabName(String str) {
        this.shootTabName = str;
    }

    public void setShowQuickDMBox(boolean z) {
        this.showQuickDMBox = z;
    }

    public void setSimilarVideoInfo(SimilarVideoInfo similarVideoInfo) {
        this.similarVideoInfo = similarVideoInfo;
    }

    public void setSmartSearchInfo(SmartSearchInfoStruct smartSearchInfoStruct) {
        this.smartSearchInfo = smartSearchInfoStruct;
    }

    public void setSocialInteractionBlob(SocialInteractionBlobProto socialInteractionBlobProto) {
        this.socialInteractionBlobProto = socialInteractionBlobProto;
    }

    public void setSoftAd(boolean z) {
        this.isSoftAd = z;
    }

    public void setSolariaProfile(SolariaProfile solariaProfile) {
        this.solariaProfile = solariaProfile;
    }

    public void setSoundExemption(int i) {
        this.soundExemption = i;
    }

    public void setSpecialSticker(SpecialSticker specialSticker) {
        this.specialSticker = specialSticker;
    }

    public void setStandardComponentInfo(StandardComponentInfo standardComponentInfo) {
        this.standardComponentInfo = standardComponentInfo;
    }

    public void setStarAtlasOrderId(long j) {
        this.starAtlasOrderId = j;
    }

    public void setStatistics(AwemeStatistics awemeStatistics) {
        this.statistics = awemeStatistics;
    }

    public void setStatus(AwemeStatus awemeStatus) {
        this.status = awemeStatus;
    }

    public void setStickerEntranceInfo(NewFaceStickerBean newFaceStickerBean) {
        this.stickerEntranceInfo = newFaceStickerBean;
    }

    public void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public void setStitchSetting(int i) {
        this.stitchSetting = i;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public void setStoryModel(StoryVideo storyVideo) {
        this.storyModel = storyVideo;
    }

    public void setStoryNoteInfo(StoryNoteInfo storyNoteInfo) {
        this.storyNoteInfo = storyNoteInfo;
    }

    public void setStoryType(int i) {
        this.storyType = i;
    }

    public void setStreaksMeta(StreaksMeta streaksMeta) {
        this.streaksMeta = streaksMeta;
    }

    public void setStreamUrlModel(StreamUrlModel streamUrlModel) {
        this.streamUrlModel = streamUrlModel;
    }

    public void setSubOnlyVideo(boolean z) {
        this.isSubOnlyVideo = z;
    }

    public void setSupportDanmaku(boolean z) {
        this.isSupportDanmaku = z;
    }

    public void setSurveyInfo(com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo surveyInfo) {
        if (surveyInfo == null) {
            return;
        }
        this.surveyInfo = surveyInfo;
        if (this.surveyInfos == null) {
            this.surveyInfos = new ArrayList();
        }
        try {
            if (this.surveyInfos.size() > 0) {
                ListProtector.set(this.surveyInfos, 0, surveyInfo);
            } else {
                this.surveyInfos.add(surveyInfo);
            }
        } catch (UnsupportedOperationException e) {
            TryCatchGuardChecker.doCheck(e);
            ArrayList arrayList = new ArrayList(this.surveyInfos);
            if (arrayList.size() > 0) {
                ListProtector.set(arrayList, 0, surveyInfo);
            } else {
                arrayList.add(surveyInfo);
            }
            this.surveyInfos = arrayList;
        }
    }

    public void setSurveyInfos(List<com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo> list) {
        this.surveyInfos = list;
    }

    public void setSurveyKey(String str) {
        this.surveyKey = str;
    }

    public void setTakeDownDesc(String str) {
        this.takeDownDesc = str;
    }

    public void setTakeDownReason(int i) {
        this.takeDownReason = i;
    }

    public void setTakoBubbleInfo(TakoBubbleInfo takoBubbleInfo) {
        this.takoBubbleInfo = takoBubbleInfo;
    }

    public void setTcmInfo(TCMInfo tCMInfo) {
        this.tcmInfo = tCMInfo;
    }

    public void setTemplateAssetInfo(ICAssetInfo[] iCAssetInfoArr) {
        this.templateAssetInfo = iCAssetInfoArr;
    }

    public void setTemplateButtonConfig(TemplateButtonConfig templateButtonConfig) {
        this.templateButtonConfig = templateButtonConfig;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextStickerMajorityLang(String str) {
        this.textStickerMajorityLang = str;
    }

    public void setTextTopLabels(List<AwemeTextLabelModel> list) {
        this.textTopLabels = list;
    }

    public void setTextVideoLabels(List<AwemeTextLabelModel> list) {
        this.textVideoLabels = list;
    }

    public void setTimePortal(long j) {
        this.timePortal = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleLimitedRows(int i) {
        this.titleLimitedRows = i;
    }

    public void setTnSUserExperienceFeedInfo(TnSUserExperienceFeedInfo tnSUserExperienceFeedInfo) {
        this.ueFeedInfo = tnSUserExperienceFeedInfo;
    }

    public void setTransParams(String str) {
        this.transParams = str;
    }

    public void setTranslatedVideo(TranslatedVideo translatedVideo) {
        this.translatedVideo = translatedVideo;
    }

    public void setTrashBinRemainingTime(long j) {
        this.trashBinRemainingTime = j;
    }

    public void setTrendingBar(AwemeTrendingBar awemeTrendingBar) {
        this.trendingBar = awemeTrendingBar;
    }

    public void setTrendingBarFYP(AwemeTrendingBar awemeTrendingBar) {
        this.trendingBarFYP = awemeTrendingBar;
    }

    public void setTtmInfo(TTMInfo tTMInfo) {
        this.ttmInfo = tTMInfo;
    }

    public void setTtsVoiceIDs(List<String> list) {
        this.ttsVoiceIDs = list;
    }

    public void setTtsVoiceRefIDs(List<String> list) {
        this.ttsVoiceRefIDs = list;
    }

    public void setUeFeedInfo(TnSUserExperienceFeedInfo tnSUserExperienceFeedInfo) {
        this.ueFeedInfo = tnSUserExperienceFeedInfo;
    }

    public void setUgcPoiTicketDetail(UgcPoiTicketDetail ugcPoiTicketDetail) {
        this.ugcPoiTicketDetail = ugcPoiTicketDetail;
    }

    public void setUniqidPosition(List<Position> list) {
        this.uniqidPosition = list;
    }

    public void setUpvoteInfo(UpvoteInfo upvoteInfo) {
        this.upvoteInfo = upvoteInfo;
    }

    public void setUpvotePreload(UpvotePreloadStruct upvotePreloadStruct) {
        this.upvotePreload = upvotePreloadStruct;
    }

    public void setUpvoteReason(UpvoteReason upvoteReason) {
        this.upvoteReason = upvoteReason;
    }

    public void setUseAwemeCache(boolean z) {
        this.useAwemeCache = z;
    }

    public void setUsedFullSong(boolean z) {
        this.isUsedFullSong = z;
    }

    public void setUserAffinityScore(double d) {
        this.userAffinityScore = d;
    }

    public void setUserDigg(int i) {
        this.userDigg = i;
    }

    public void setUserProfileInitInfo(UserProfileInitInfo userProfileInitInfo) {
        this.userProfileInitInfo = userProfileInitInfo;
    }

    public void setUserStory(UserStory userStory) {
        this.userStory = userStory;
    }

    public void setVcVoiceIDs(List<String> list) {
        this.vcVoiceIDs = list;
    }

    public void setVcVoiceRefIDs(List<String> list) {
        this.vcVoiceRefIDs = list;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setVideoControl(VideoControl videoControl) {
        this.videoControl = videoControl;
    }

    public void setVideoFeedTag(String str) {
        this.videoFeedTag = str;
    }

    public void setVideoLabels(List<AwemeLabelModel> list) {
        this.videoLabels = list;
    }

    public void setVideoMaskInfo(VideoMaskInfo videoMaskInfo) {
        this.videoMaskInfo = videoMaskInfo;
    }

    public void setVideoMaskInfos(List<VideoMaskInfo> list) {
        this.videoMaskInfos = list;
    }

    public void setVideoMentionInfoStruct(VideoMentionInfoStruct videoMentionInfoStruct) {
        this.videoMentionInfoStruct = videoMentionInfoStruct;
    }

    public void setVideoReplyStruct(VideoReplyStruct videoReplyStruct) {
        this.videoReplyStruct = videoReplyStruct;
    }

    public void setVisualSearchInfo(VisualSearchInfoStruct visualSearchInfoStruct) {
        this.visualSearchInfo = visualSearchInfoStruct;
    }

    public void setVr(boolean z) {
        this.isVr = z;
        Video video = this.video;
        if (video != null) {
            setVr(video.getPlayAddrH264(), z);
            setVr(this.video.getPlayAddrBytevc1(), z);
        }
    }

    public void setWithPromotionalMusic(boolean z) {
        this.withPromotionalMusic = z;
    }

    public void setWithSurvey(boolean z) {
        this.withSurvey = z;
    }

    private void setVr(VideoUrlModel videoUrlModel, boolean z) {
        if (videoUrlModel != null) {
            videoUrlModel.setVr(z);
        }
    }
}
