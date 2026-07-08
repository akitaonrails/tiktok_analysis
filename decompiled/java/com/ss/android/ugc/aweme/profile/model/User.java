package com.ss.android.ugc.aweme.profile.model;

import X.C09CS;
import X.C09CT;
import X.C2188811AlT;
import X.C616570OGh;
import X.C736450Suh;
import X.InterfaceC570470MYz;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commerce.EnterpriseUserInfo;
import com.ss.android.ugc.aweme.commerce.PotentialBizAccountInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.music.OriginalMusician;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.utils.IntKeyMapAdapter;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public class User implements Serializable, Cloneable {
    public static final int UNLIVE = 0;

    @C09CT("accept_private_policy")
    public boolean acceptPrivatePolicy;

    @C09CT("account_labels")
    public List<AccountLabelInfo> accountLabelInfos;

    @C09CT("account_region")
    public String accountRegion;

    @C09CT("account_type")
    public int accountType;
    public int activityStatusSetting;

    @C09CT("description")
    public String adAuthorDesc;

    @C09CT("ad_cover_title")
    public AdCoverTitle adCoverTitle;

    @C09CT("ad_cover_url")
    public List<UrlModel> adCoverUrl;

    @C09CT("ad_order_id")
    public String adOrderId;
    public String addBioGuideIconColor;
    public String addBioGuideIconRes;
    public String addBioGuideText;

    @C09CT("add_yours_invited")
    public Boolean addYoursInvited;

    @C09CT("advanced_feature_info")
    public AdvancedFeatureInfo[] advancedFeatureInfo;

    @C09CT("affinity_score")
    public float affinityScore;

    @C09CT("age_gate_action")
    public int ageGateAction;

    @C09CT("age_gate_info")
    public AgeGateInfo ageGateInfo;

    @C09CT("age_gate_post_action")
    public int ageGatePostAction;

    @C09CT("age_gate_time")
    public long ageGateTime;

    @C09CT("ags_warning")
    public AGSWarning agsWarning;

    @C09CT("user_all_story_metadata")
    public UserAllStoryMetadata allStoryMetadata;

    @C09CT("allowStatus")
    public int allowStatus;

    @C09CT("anchor_schedule_guide_txt")
    public String anchorScheduleGuideTxt;

    @C09CT("audience_control_viewer_mode")
    public int audienceControlViewerMode;

    @C09CT("authentication_info")
    public LiveAuthenticationInfo authenticationInfo;

    @C09CT("authority_status")
    public long authorityStatus;

    @C09CT("avatar_168x168")
    public UrlModel avatar168;

    @C09CT("avatar_300x300")
    public UrlModel avatar300;

    @C09CT("avatar_decoration")
    public AvatarDecoration avatarDecoration;

    @C09CT("avatar_larger")
    public UrlModel avatarLarger;

    @C09CT("avatar_medium")
    public UrlModel avatarMedium;

    @C09CT("avatar_meta_info")
    public AvatarMetaInfo avatarMeta;

    @C09CT("avatar_meta_info_list")
    public List<AvatarMetaInfoWithCategory> avatarMetaInfoList;

    @C09CT("avatar_pendant_larger")
    public UrlModel avatarPendantLarger;

    @C09CT("avatar_pendant_medium")
    public UrlModel avatarPendantMedium;

    @C09CT("avatar_pendant_thumb")
    public UrlModel avatarPendantThumb;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;

    @C09CT("avatar_update_reminder")
    public boolean avatarUpdateReminder;

    @C09CT("video_icon")
    public UrlModel avatarVideoUri;

    @C09CT("aweme_count")
    public int awemeCount;

    @C09CT("aweme_cover")
    public UserAwemeCover awemeCover;

    @C09CT("creator_fund_info_struct")
    public CreatorFundBannerSetting bannerSetting;

    @C09CT("bind_phone")
    public String bindPhone;

    @C09CT("bio_email")
    public String bioEmail;

    @C09CT("bio_link_click_action")
    public int bioLinkClickAction;

    @C09CT("bio_location")
    public String bioLocation;

    @C09CT("bio_permission")
    public UserBioPermission bioPermission;

    @C09CT("bio_phone")
    public String bioPhone;

    @C09CT("bio_secure_url")
    public String bioSecureUrl;

    @C09CT("bio_url")
    public String bioUrl;

    @C09CT("birthday")
    public String birthday;

    @C09CT("biz_account_info")
    public BizAccountInfo bizAccountInfo;

    @C09CT("block_status")
    public int blockStatus;

    @C09CT("bold_fields")
    public List<String> boldFields;

    @C09CT("brand_info")
    public BlueVBrandInfo brandInfo;

    @C09CT("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @C09CT("can_modify_school_info")
    public boolean canModifySchoolInfo;

    @C09CT("can_set_geofencing")
    public boolean canSetGeoFencing;

    @C09CT("cancel_type")
    public int cancelType;

    @C09CT("category")
    public String category;

    @C09CT("cha_list")
    public List<Challenge> challengeList;

    @C09CT("city")
    public String cityName;

    @C09CT("collect_count")
    public int collectCount;

    @C09CT("comment_filter_status")
    public int commentFilterStatus;

    @C09CT("comment_setting")
    public int commentSetting;

    @C09CT("commerce_info")
    public CommerceInfo commerceInfo;

    @C09CT("commerce_permissions")
    public CommercePermissionStruct commercePermission;

    @C09CT("commerce_user_info")
    public CommerceUserInfo commerceUserInfo;

    @C09CT("commerce_user_level")
    public int commerceUserLevel;

    @C09CT("complete_profile_guide_strategy")
    public int completeProfileGuideStrategy;

    @C09CT("constellation")
    public int constellation;

    @C09CT("contact_name")
    public String contactName;

    @C09CT("contacts_sync_status")
    public boolean contactsSyncStatus;

    @C09CT("country")
    public String country;

    @C09CT("cover_url")
    public List<UrlModel> coverUrls;

    @C09CT("create_time")
    public Long createTime;

    @C09CT("custom_verify")
    public String customVerify;

    @C09CT("display_addyours_on_profile")
    public int displayAddYoursOnProfile;

    @C09CT("display_qna_on_profile")
    public Integer displayQnaOnProfile;

    @C09CT("display_wvalantine_activity_entry")
    public boolean displayWvalantineActivityEntry;

    @C09CT("district")
    public String district;

    @C09CT("download_setting")
    public int downloadSetting;

    @C09CT("dsp_profile")
    public DspProfile dspProfile;

    @C09CT("duet_setting")
    public int duetSetting;

    @C09CT("dynamic_social_avatar")
    public AvatarSizeUrlStruct dynamicSocialAvatar;

    @C09CT("education")
    public int education;

    @C09CT("effect_detail")
    public EffectArtistDetail effectArtistDetail;

    @C09CT("email")
    public String email;
    public boolean enableAdOfficialLiveAuthor;

    @C09CT("enable_direct_message")
    public boolean enableDirectMessage;

    @C09CT("enable_subscription")
    public boolean enableSubscription;

    @C09CT("enabled_filter_all_comments")
    public boolean enabledFilterAllComments;

    @C09CT("enterprise_user_info")
    @C09CS(StringJsonAdapterFactory.class)
    public EnterpriseUserInfo enterpriseUserInfo;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    @C09CT("external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;

    @C09CT("fake_data_info")
    public FakeDataInfo fakeDataInfo;
    public long fakeRoomId;

    @C09CT("mplatform_followers_count")
    public int fansCount;

    @C09CT("favoriting_count")
    public int favoritingCount;

    @C09CT("fb_expire_time")
    public long fbExpireTime;

    @C09CT("follow_from")
    public int followFrom;

    @C09CT("follow_from_msg")
    public String followFromMsg;

    @C09CT("follow_note")
    public String followNote;

    @C09CT("follow_status")
    public int followStatus;

    @C09CT("follower_count")
    public int followerCount;

    @C09CT("followers_detail")
    public List<FollowerDetail> followerDetailList;

    @C09CT("follower_status")
    public int followerStatus;

    @C09CT("following_count")
    public int followingCount;

    @C09CT("force_private_account")
    public boolean forcePrivateAccount;

    @C09CT("family_pairing_blocking_by_type")
    public int fpBlockByType;

    @C09CT("friend_count")
    public int friendCount;

    @C09CT("friend_type_str")
    public String friendTypeStr;

    @C09CT("friends_status")
    public int friendsStatus;

    @C09CT("friend_tab_related_user_info")
    public FriendsTabRelatedUserInfo friendsTabInfo;

    @C09CT("gift_bag_status")
    public int giftBagStatus;

    @C09CT("analytics_status")
    public boolean hasAnalyticsMetrics;

    @C09CT("has_email")
    public boolean hasEmail;

    @C09CT("has_facebook_token")
    public boolean hasFacebookToken;

    @C09CT("has_open_favorite")
    public boolean hasOpenFavorite;

    @C09CT("has_orders")
    public boolean hasOrders;

    @C09CT("has_twitter_token")
    public boolean hasTwitterToken;

    @C09CT("has_youtube_token")
    public boolean hasYoutubeToken;

    @C09CT("hide_following_follower_list")
    public int hideFollowingFollowerList;

    @C09CT("hide_lemon8_edit_link")
    public boolean hideLemon8EditLink;

    @C09CT("hide_search")
    public boolean hideSearch;

    @C09CT("hide_shoot_button")
    public boolean hideShootButton;

    @C09CT("history_max_follower_count")
    public int historyMaxFollowerCount;

    @C09CT("homepage_bottom_toast")
    public List<HomePageBottomToast> homepageBottomToast;

    @C09CT("honor_info")
    public HonorStruct honorStruct;

    @C09CT("ins_id")
    public String insId;

    @C09CT("is_acquaintance")
    public boolean isAcquaintance;

    @C09CT("is_activity_user")
    public boolean isActivityUser;

    @C09CT("is_ad_fake")
    public boolean isAdFake;

    @C09CT("ad_virtual")
    public boolean isAdVirtual;

    @C09CT("is_block")
    public boolean isBlock;

    @C09CT("is_blocked")
    public boolean isBlocked;

    @C09CT("content_language_already_popup")
    public boolean isContentLanguageDialogShown;

    @C09CT("has_insights")
    public boolean isCreater;

    @C09CT("is_discipline_member")
    public boolean isDisciplineMember;

    @C09CT("is_effect_artist")
    public boolean isEffectArtist;

    @C09CT("is_email_verified")
    public boolean isEmailVerified;
    public boolean isFromProfileRefresh;

    @C09CT("is_geo_blocked_profile")
    public boolean isGeoBlocked;

    @C09CT("is_mute")
    public int isMute;

    @C09CT("is_mute_lives")
    public int isMuteLives;

    @C09CT("is_mute_non_story_post")
    public int isMuteNonStoryPost;

    @C09CT("is_mute_story")
    public int isMuteStory;
    public boolean isNewRecommend;

    @C09CT("douplus_old_user")
    public boolean isOldDouplusUser;

    @C09CT("family_pairing_is_pending_unblock_request")
    public boolean isPendingUnblockRequest;

    @C09CT("is_phone_binded")
    public boolean isPhoneBinded;

    @C09CT("is_private_account")
    public boolean isPrivateAccount;

    @C09CT("is_pro_account")
    public boolean isProAccount;

    @C09CT("is_star")
    public boolean isStar;

    @C09CT("is_translator")
    public boolean isTranslator;

    @C09CT("is_verified_tako")
    public int isVerifiedTako;

    @C09CT("iso_country_code")
    public String isoCountryCode;

    @C09CT("language")
    public String language;

    @C09CT("latest_order_time")
    public Long latestOrderTime;

    @C09CT("latest_unread_video_info")
    public LatestUnreadVideoInfo latestUnreadVideoInfo;

    @C09CT("lemon8_account_type")
    public int lemon8AccountType;

    @C09CT("lemon8_open_id")
    public String lemon8OpenId;

    @C09CT("lemon8_profile_settings")
    public int lemon8ProfileSettings;

    @C09CT("lemon8_store_region")
    public String lemon8StoreRegion;

    @C09CT("lemon8_user_name")
    public String lemon8UserName;

    @C09CT("live_agreement")
    public int liveAgreement;

    @C09CT("anchor_info")
    public LiveAnchorInfo liveAnchorInfo;

    @C09CT("live_commerce")
    public boolean liveCommerce;

    @C09CT("live_room_crop_info")
    public LiveRoomCropInfoStruct liveRoomCropInfo;

    @C09CT("live_stream_height")
    public int liveStreamHeight;

    @C09CT("live_stream_need_adjust")
    public boolean liveStreamNeedAdjust;

    @C09CT("live_stream_width")
    public int liveStreamWidth;

    @C09CT("login_platform")
    public int loginPlatform;
    public int mAtType;

    @C09CT("general_permission")
    public GeneralPermission mGeneralPermission;

    @C09CT("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @C09CT("hot_list")
    public HotListStruct mHotListStruct;

    @C09CT("events")
    public List<LiveEventStruct> mLiveEventStructList;
    public boolean mMentionEnabled;

    @C09CT("mutual_relation")
    public MutualStruct mMutualStruct;

    @C09CT("badge_info")
    public ProfileBadgeStruct mProfileBadgeStruct;

    @C09CT("supporting_ngo")
    public ProfileNgoStruct mProfileNgoStruct;

    @C09CT("pronouns_info")
    public UserPronounsInfo mPronounsInfo;

    @C09CT("maf_count")
    public int mafRedCount;

    @C09CT("tt_mall_tab_related_user_info")
    public TTMallTabRelatedUserInfo mallTabUserInfo;

    @C09CT("matched_friend_available")
    public boolean matchedFriendAvailable;

    @C09CT("matched_friend")
    public MatchedFriendStruct matchedFriendStruct;

    @C09CT("message_config")
    public int messageConfig;
    public int mixListNum;

    @C09CT("playlist_status")
    public int mixListStatus;

    @C09CS(IntKeyMapAdapter.class)
    public Map<Integer, String> moreAdvancedFeatureTextMap;

    @C09CT("more_advance_feature_item_order")
    public List<Integer> moreAdvancedFeaturesOrder;

    @C09CT("music_compliance_account")
    public int musicComplianceAccount;

    @C09CT("music_tab_info")
    public MusicTabInfo musicTabInfo;

    @C09CT("mutual_relation_avatars")
    public List<UrlModel> mutualRelationAvatars;

    @C09CT("mutual_relation_num")
    public int mutualRelationNumber;

    @C09CT("mutual_relation_tag")
    public String mutualRelationTag;

    @C09CT("name_field")
    public String nameField;

    @C09CT("navi_id")
    public String naviId;

    @C09CT("need_addr_card")
    public boolean needAddrCard;

    @C09CT("need_points")
    public List<NeedPointStruct> needPoints;

    @C09CT("need_recommend")
    public boolean needRecommend;

    @C09CT("new_follower_count")
    public int newFollowerCount;

    @C09CT("new_friend_count")
    public int newFriendsCount;

    @C09CT("new_message_in_inbox_follow_status_list")
    public List<Integer> newMessageInInboxFollowStatusList;

    @C09CT("new_post_count")
    public int newPostCount;

    @C09CT("nickname_modify_time")
    public int nickNameModifyTs;

    @C09CT("nickname")
    public String nickname;

    @C09CT("nickname_update_reminder")
    public boolean nicknameUpdateReminder;

    @C09CT("normal_top_comment_permission")
    public int normalTopCommentPermission;

    @C09CT("notify_private_account")
    public int notifyPrivateAccount;

    @C09CT("notify_minor_private_policy")
    public boolean notifyPrivatePolicy;

    @C09CT("original_musician")
    public OriginalMusician originalMusician;

    @C09CT("paid_content_awareness_banner_info")
    public PaidContentAwareBannerSetting paidContentAwareBannerSetting;

    @C09CT("paid_content_banner_info_struct")
    public PaidContentBannerSetting paidContentBannerSetting;

    @C09CT("platform_sync_info")
    public PlatformInfo[] platformInfos;

    @C09CT("post_count")
    public int postCount;

    @C09CT("post_default_download_setting")
    public boolean postDefaultDownloadSetting;

    @C09CT("potential_biz_account_info")
    public PotentialBizAccountInfo potentialBizAccountInfo;

    @C09CT("prevent_download")
    public boolean preventDownload;

    @C09CT("privacy_setting")
    public PrivacySetting privacySetting;

    @C09CT("private_aweme_count")
    public int privateAwemeCount;

    @C09CT("pro_account_tcm_red_dot")
    public boolean proAccountTcmRedDot;

    @C09CT("proaccount_update_notification_status")
    public int proAccountUpdateNotificationStatus;

    @InterfaceC570470MYz
    @C09CT("aweme_info")
    public Aweme profileBackgroundAweme;

    @C09CT("image_url_list")
    public List<String> profileBackgroundImageUrlList;

    @C09CT("media_type")
    public int profileBackgroundMediaType;

    @C09CT("profile_completion")
    public float profileCompletion;

    @C09CT("profile_link_item_order")
    public List<Integer> profileLinkOrderList;
    public Map<Integer, String> profileLinksMap;

    @C09CT("profile_pv")
    public long profilePv;

    @C09CT("user_experiments")
    public ProfileUserExperiments profileUserExperiments;

    @C09CT("province")
    public String province;

    @C09CT("qa_status")
    public int qnaStatus;

    @C09CT("quick_shop_info")
    public QuickShopInfo quickShopInfo;

    @C09CT("r_fans_group_info")
    public RocketFansGroupInfo rFansGroupInfo;

    @C09CT("rec_type")
    public String recType;

    @C09CT("item_list")
    public List<RecommendAwemeItem> recommendAwemeItems;

    @C09CT("recommend_reason")
    public String recommendReason;

    @C09CT("recommend_reason_relation")
    public String recommendReasonRelation;

    @C09CT("recommend_score")
    public double recommendScore;

    @C09CT("region")
    public String region;

    @C09CT("register_from")
    public String registerFrom;

    @C09CT("registerStatus")
    public int registerStatus;

    @C09CT("register_time")
    public long registerTime;

    @C09CT("relation_label")
    public String relationLabel;

    @C09CT("relation_ship")
    public String relationShip;

    @C09CT("relative_users")
    public List<RelativeUserInfo> relativeUserInfos;

    @C09CT("remark_name")
    public String remarkName;

    @C09CT("forward_count")
    public int repostCount;

    @C09CT("rid")
    public String requestId;
    public transient List<User> revealDisplayUsers;

    @C09CT("room_cover")
    public UrlModel roomCover;

    @C09CT("room_data")
    public String roomData;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_id_str")
    public String roomIdStr;

    @C09CT("room_title")
    public String roomTitle;

    @C09CT("room_title_ai_summary")
    public String roomTitleAiSummary;

    @C09CT("room_type_tag")
    public String roomTypeTag;

    @C09CT("school_info")
    public List<SchoolInfo> schoolInfo;

    @C09CT("school_visible")
    public int schoolInfoShowRange;

    @C09CT("search_user_desc")
    public String searchUserDesc;

    @C09CT("search_user_name")
    public String searchUserName;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("secret")
    public boolean secret;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("shield_comment_notice")
    public int shieldCommentNotice;

    @C09CT("shield_digg_notice")
    public int shieldDiggNotice;

    @C09CT("shield_edit_field_info")
    public List<ShieldEditFieldInfo> shieldEditFieldInfoList;

    @C09CT("shield_follow_notice")
    public int shieldFollowNotice;

    @C09CT("shop_entrance")
    public ShopEntranceInfo shopEntrance;

    @C09CT("shop_micro_app")
    public String shopMicroApp;

    @C09CT("short_id")
    public String shortId;

    @C09CT("should_write_impr")
    public boolean shouldWriteImpr;

    @C09CT("shoutouts_status")
    public int shoutoutsStatus;

    @C09CT("show_artist_playlist")
    public int showArtistPlaylist;

    @C09CT("show_effect_list")
    public boolean showEffectList;

    @C09CT("show_favorite_list")
    public boolean showFavoriteList;

    @C09CT("show_image_bubble")
    public boolean showImageBubble;

    @C09CT("show_tip_entry")
    public boolean showTipEntry;

    @C09CT("show_user_ban_dialog")
    public boolean showUserBanDialog;

    @C09CT("signature")
    public String signature;

    @C09CT("signature_extra")
    public List<SignatureExtraInfo> signatureExtra;

    @C09CT("signature_language")
    public String signatureLanguage;

    @C09CT("signature_modify_time")
    public int signatureModifyTime;

    @C09CT("social_avatar_with_background")
    public AvatarSizeUrlStruct socialAvatarWithBackground;

    @C09CT("social_avatar_without_background")
    public AvatarSizeUrlStruct socialAvatarWithoutBackground;

    @C09CT("social_data")
    public SocialDataStruct socialData;

    @C09CT("social_info")
    public String socialInfo;

    @C09CT("special_account")
    public SpecialAccount specialAccount;

    @C09CT("sprint_support_user_info")
    public HotSearchSprintStruct sprintSupportUserInfo;

    @C09CT("star_billboard_rank")
    public int starBillboardRank;

    @C09CT("static_avatar")
    public AvatarSizeUrlStruct staticAvatar;

    @C09CT("stitch_setting")
    public int stitchSetting;

    @C09CT("life_story_block")
    public StoryBlockInfo storyBlockInfo;
    public StoryNoteDataCollection storyNoteData;

    @C09CT("tab_settings")
    public TabSetting tabSetting;

    @C09CT("profile_tab_type")
    public int tabType;
    public int taggedBAInvitationStatus;
    public boolean taggedIsBA;

    @C09CT("third_name")
    public String thirdName;

    @C09CT("total_favorited")
    public long totalFavorited;

    @C09CT("tw_expire_time")
    public long twExpireTime;

    @C09CT("twitter_id")
    public String twitterId;

    @C09CT("twitter_name")
    public String twitterName;

    @C09CT("type_label")
    public long[] typeLabels;

    @C09CT("uid")
    public String uid;

    @C09CT("video_unread_info")
    public UnReadVideoInfo unReadVideoInfo;

    @C09CT("unique_id")
    public String uniqueId;

    @C09CT("unique_id_modify_time")
    public long uniqueIdModifyTime;

    @C09CT("urge_detail")
    public UrgeStruct urgeDetail;

    @C09CS(IntKeyMapAdapter.class)
    public Map<Integer, String> userAdvancedFeatureTextMap;

    @C09CT("advance_feature_item_order")
    public List<Integer> userAdvancedFeaturesOrder;

    @C09CT("user_canceled")
    public boolean userCancelled;

    @C09CT("pay_grade")
    public UserHonor userHonor;

    @C09CT("user_inactive")
    public boolean userInactive;

    @C09CT("user_period")
    public int userPeriod;

    @C09CT("user_profile_activity_guide")
    public UserProfileActivityGuide userProfileActivityGuide;

    @C09CT("user_profile_guide")
    public List<UserProfileGuide> userProfileGuide;

    @C09CT("user_profile_guide_v2")
    public List<UserProfileGuideDataV2> userProfileGuideV2;

    @C09CT("user_rate")
    public int userRate;

    @C09CT("user_rate_remind_info")
    public UserRateRemindInfo userRateRemindInfo;

    @C09CT("vcd_schema_url")
    public String vcdSchemaUrl;

    @C09CT("verification_badge_type")
    public int verificationBadgeType;

    @C09CT("verification_type")
    public int verificationType;

    @C09CT("verify_info")
    public String verifyInfo;

    @C09CT("video_cover")
    public VideoCover videoCover;

    @C09CT("video_gift_status")
    public int videoGiftStatus;

    @C09CT("video_view_is_auth")
    public boolean videoViewIsAuth;

    @C09CT("viewer_entrance_info")
    public ViewerEntranceInfo viewerEntranceInfo;

    @C09CT("video_view_type")
    public int viewerType;

    @C09CT("visible_videos_count")
    public int visibleVideosCount;

    @C09CT("watch_status")
    public int watchStatus;

    @C09CT("white_cover_url")
    public List<UrlModel> whiteCoverUrl;

    @C09CT("with_commerce_enterprise_tab_entry")
    public boolean withCommerceEnterpriseTabEntry;

    @C09CT("with_commerce_entry")
    public boolean withCommerceEntry;

    @C09CT("with_commerce_newbie_task")
    public boolean withCommerceNewbieTask;

    @C09CT("with_douplus_entry")
    public boolean withDouplusEntry;

    @C09CT("with_item_commerce_entry")
    public boolean withItemCommerceEntry;

    @C09CT("with_new_goods")
    public boolean withNewGoods;

    @C09CT("with_shop_entry")
    public boolean withShopEntry;

    @C09CT("with_star_atlas_entry")
    public boolean withStarAtlasEntry;

    @C09CT("xmas_unlock_count")
    public int xmasUnlockCount;

    @C09CT("youtube_last_refresh_time")
    public long youTubeLastRefreshTime;

    @C09CT("youtube_refresh_token")
    public String youTubeRefreshToken;

    @C09CT("youtube_channel_id")
    public String youtubeChannelId;

    @C09CT("youtube_channel_title")
    public String youtubeChannelTitle;

    @C09CT("youtube_expire_time")
    public long youtubeExpireTime;

    @C09CT("yt_raw_token")
    public String youtubeRawRefreshToken;

    @C09CT("message_chat_entry")
    public boolean showMessageButton = true;

    @C09CT("predicted_age_group")
    public String predictedAgeGroup = "";

    @C09CT("last_active_time")
    public Long lastActiveTime = 0L;

    @C09CT("user_mode")
    public int userMode = -1;
    public transient String userDisplayName = "";

    @C09CT("live_push_notification_status")
    public int livePushNotificationStatus = 2;

    @C09CT("post_push_notification_status")
    public int postNotificationStatus = 2;

    @C09CT("story_status")
    public int storyStatus = -1;
    public transient boolean checkDMPermission = false;

    @C09CT("user_now_info")
    public UserNowInfo userNowInfo = null;

    @C09CT("user_now_pack_info")
    public UserNowPackStruct userNowPackStruct = null;

    @C09CT("show_messaging_entrance_on_profile")
    public boolean isShowMessageEntrance = false;

    @C09CT("blocking_by_type")
    public int blockingByType = 0;

    @C09CT("is_user_data_miss")
    public boolean isUserDataMiss = false;

    @C09CT("aweme_unread_info")
    public AwemeUnreadInfo awemeUnreadInfo = null;
    public boolean isFeatureVideoChanged = false;

    @C09CT("offset_y_ratio")
    public float profileBackgroundOffsetRatio = 0.5f;

    public interface AccountType {
    }

    public interface LivePushNotificationStatus {
    }

    public interface PostPushNotificationStatus {
    }

    public interface ProfileTabType {
    }

    public interface ShowArtistListType {
    }

    public interface ShowPrivateTabType {
    }

    public interface VerificationType {
        public static final int DEFAULT = 1;
    }

    public interface VerifyStatus {
    }

    public boolean canMessageByConfig() {
        int i = this.messageConfig;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.followStatus == 2;
        }
        if (i != 4) {
            return false;
        }
        return this.followStatus == 2 || this.isAcquaintance;
    }

    public String getAccurateRecType() {
        String str = this.recType;
        if (str != null) {
            return str;
        }
        MatchedFriendStruct matchedFriendStruct = this.matchedFriendStruct;
        if (matchedFriendStruct != null) {
            return matchedFriendStruct.recType;
        }
        return null;
    }

    public boolean getAdAuthorization() {
        CommerceUserInfo commerceUserInfo = this.commerceUserInfo;
        return commerceUserInfo != null && commerceUserInfo.adAuthorization;
    }

    public long getCreateTime() {
        Long l = this.createTime;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public int getCreatorFundBannerVersion() {
        CreatorFundBannerSetting creatorFundBannerSetting = this.bannerSetting;
        if (creatorFundBannerSetting != null) {
            return creatorFundBannerSetting.bannerVersion;
        }
        return 0;
    }

    public UrlModel getDefaultAdCoverUrl() {
        if (C616570OGh.LIZ(this.adCoverUrl)) {
            return null;
        }
        return (UrlModel) ListProtector.get(this.adCoverUrl, 0);
    }

    public Boolean getIsFeatureVideoChanged() {
        return Boolean.valueOf(this.isFeatureVideoChanged);
    }

    public long getLatestOrderTime() {
        Long l = this.latestOrderTime;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public SocialDataStruct getSocialData() {
        SocialDataStruct socialDataStruct = this.socialData;
        if (socialDataStruct == null || socialDataStruct.getSocialPlatformSettings() == null || this.socialData.getSocialPlatformSettings().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SocialPlatformSetting(1, false, 0, true, new SocialPlatformAccessInfo(), false, false, new ArrayList()));
            arrayList.add(new SocialPlatformSetting(2, false, 0, true, new SocialPlatformAccessInfo(), false, false, new ArrayList()));
            arrayList.add(new SocialPlatformSetting(6, false, 0, true, new SocialPlatformAccessInfo(), false, false, new ArrayList()));
            SocialDataStruct socialDataStruct2 = this.socialData;
            if (socialDataStruct2 != null) {
                this.socialData = new SocialDataStruct(arrayList, true, socialDataStruct2.isNewFollower(), this.socialData.isNewFriend());
            } else {
                this.socialData = new SocialDataStruct(arrayList, true, false, false);
            }
        }
        return this.socialData;
    }

    public Long getUnReadLastTime() {
        UnReadVideoInfo unReadVideoInfo = this.unReadVideoInfo;
        if (unReadVideoInfo == null) {
            return 0L;
        }
        return Long.valueOf(unReadVideoInfo.latestUnreadVideoCreatedTime);
    }

    public int getUnReadVideoCount() {
        UnReadVideoInfo unReadVideoInfo = this.unReadVideoInfo;
        if (unReadVideoInfo == null) {
            return 0;
        }
        return unReadVideoInfo.unReadCount;
    }

    public boolean hasAdEntry() {
        CommerceUserInfo commerceUserInfo = this.commerceUserInfo;
        return commerceUserInfo != null && commerceUserInfo.hasAdEntry;
    }

    public boolean hasSignLiveAgreement() {
        return this.liveAgreement == 1;
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shortId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.remarkName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.signature;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.birthday;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        UrlModel urlModel = this.avatarLarger;
        int iHashCode7 = (iHashCode6 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.avatarThumb;
        int iHashCode8 = (iHashCode7 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.avatarMedium;
        int iHashCode9 = (iHashCode8 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        UrlModel urlModel4 = this.avatarVideoUri;
        int iHashCode10 = (iHashCode9 + (urlModel4 != null ? urlModel4.hashCode() : 0)) * 31;
        AvatarMetaInfo avatarMetaInfo = this.avatarMeta;
        int iHashCode11 = (iHashCode10 + (avatarMetaInfo != null ? avatarMetaInfo.hashCode() : 0)) * 31;
        List<AvatarMetaInfoWithCategory> list = this.avatarMetaInfoList;
        int iHashCode12 = (((((((((((((((((((((((((((((((((iHashCode11 + (list != null ? list.hashCode() : 0)) * 31) + this.allowStatus) * 31) + this.followStatus) * 31) + this.followerStatus) * 31) + this.friendsStatus) * 31) + this.watchStatus) * 31) + this.awemeCount) * 31) + this.followingCount) * 31) + this.followerCount) * 31) + this.newFollowerCount) * 31) + this.collectCount) * 31) + this.friendCount) * 31) + this.favoritingCount) * 31) + this.registerStatus) * 31) + (this.hideSearch ? 1 : 0)) * 31) + this.mAtType) * 31) + this.constellation) * 31;
        String str7 = this.customVerify;
        int iHashCode13 = (iHashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.uniqueId;
        int iHashCode14 = (iHashCode13 + (str8 != null ? str8.hashCode() : 0)) * 31;
        ShareInfo shareInfo = this.shareInfo;
        int iHashCode15 = (iHashCode14 + (shareInfo != null ? shareInfo.hashCode() : 0)) * 31;
        String str9 = this.bindPhone;
        int iHashCode16 = (((iHashCode15 + (str9 != null ? str9.hashCode() : 0)) * 31) + (this.hasEmail ? 1 : 0)) * 31;
        Long l = this.createTime;
        int iHashCode17 = (((((((((((((((((iHashCode16 + (l != null ? l.hashCode() : 0)) * 31) + (this.needRecommend ? 1 : 0)) * 31) + (this.secret ? 1 : 0)) * 31) + (this.isPrivateAccount ? 1 : 0)) * 31) + (this.preventDownload ? 1 : 0)) * 31) + (this.showImageBubble ? 1 : 0)) * 31) + this.commentSetting) * 31) + this.duetSetting) * 31) + this.downloadSetting) * 31;
        String str10 = this.region;
        int iHashCode18 = (iHashCode17 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.language;
        int iHashCode19 = (iHashCode18 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.roomTypeTag;
        int iHashCode20 = (iHashCode19 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Long l2 = this.latestOrderTime;
        return ((iHashCode20 + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.isTranslator ? 1 : 0);
    }

    public boolean isAccuratePrivateAccount() {
        return this.isPrivateAccount || this.secret;
    }

    public boolean isFacebookExpire() {
        return checkExpire(this.fbExpireTime);
    }

    public boolean isLive() {
        return this.roomId != 0;
    }

    public boolean isMuted() {
        return this.isMute == 1;
    }

    public boolean isMutedLives() {
        return this.isMuteLives == 1;
    }

    public boolean isMutedNonStoryPost() {
        return this.isMuteNonStoryPost == 1;
    }

    public boolean isMutedStory() {
        return this.isMuteStory == 1;
    }

    public boolean isNormalTopCommentPermissionGranted() {
        return this.normalTopCommentPermission == 1;
    }

    public boolean isTwitterExpire() {
        return checkExpire(this.twExpireTime);
    }

    public boolean isYoutubeExpire() {
        return checkExpire(this.youtubeExpireTime);
    }

    public boolean showBAPendingTag() {
        return this.taggedIsBA && this.taggedBAInvitationStatus != 2;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public User m307clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public int getFollowStatusRelation() {
        return C736450Suh.LIZ(this);
    }

    public String getLiveUid() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live");
        sbLIZ.append(this.uid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean avatarUpdateReminder() {
        return this.avatarUpdateReminder;
    }

    public List<AccountLabelInfo> getAccountLabelInfos() {
        return this.accountLabelInfos;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public int getAccountType() {
        return this.accountType;
    }

    public int getActivityStatusSetting() {
        return this.activityStatusSetting;
    }

    public String getAdAuthorDesc() {
        return this.adAuthorDesc;
    }

    public AdCoverTitle getAdCoverTitle() {
        return this.adCoverTitle;
    }

    public List<UrlModel> getAdCoverUrl() {
        return this.adCoverUrl;
    }

    public String getAdOrderId() {
        return this.adOrderId;
    }

    public Boolean getAddYoursInvited() {
        return this.addYoursInvited;
    }

    public float getAffinityScore() {
        return this.affinityScore;
    }

    public int getAgeGateAction() {
        return this.ageGateAction;
    }

    public AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public long getAgeGateTime() {
        return this.ageGateTime;
    }

    public AGSWarning getAgsWarning() {
        return this.agsWarning;
    }

    public UserAllStoryMetadata getAllStoryMetadata() {
        return this.allStoryMetadata;
    }

    public int getAllowStatus() {
        return this.allowStatus;
    }

    public String getAnchorScheduleGuideTxt() {
        return this.anchorScheduleGuideTxt;
    }

    public int getAtType() {
        return this.mAtType;
    }

    public long getAuthorityStatus() {
        return this.authorityStatus;
    }

    public UrlModel getAvatar168() {
        return this.avatar168;
    }

    public UrlModel getAvatar300() {
        return this.avatar300;
    }

    public AvatarDecoration getAvatarDecoration() {
        return this.avatarDecoration;
    }

    public UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public AvatarMetaInfo getAvatarMeta() {
        return this.avatarMeta;
    }

    public List<AvatarMetaInfoWithCategory> getAvatarMetaInfoList() {
        return this.avatarMetaInfoList;
    }

    public UrlModel getAvatarPendantLarger() {
        return this.avatarPendantLarger;
    }

    public UrlModel getAvatarPendantMedium() {
        return this.avatarPendantMedium;
    }

    public UrlModel getAvatarPendantThumb() {
        return this.avatarPendantThumb;
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public UrlModel getAvatarVideoUri() {
        return this.avatarVideoUri;
    }

    public int getAwemeCount() {
        return this.awemeCount;
    }

    public UserAwemeCover getAwemeCover() {
        return this.awemeCover;
    }

    public AwemeUnreadInfo getAwemeUnreadInfo() {
        return this.awemeUnreadInfo;
    }

    public CreatorFundBannerSetting getBannerSetting() {
        return this.bannerSetting;
    }

    public String getBindPhone() {
        return this.bindPhone;
    }

    public String getBioEmail() {
        return this.bioEmail;
    }

    public String getBioLocation() {
        return this.bioLocation;
    }

    public UserBioPermission getBioPermission() {
        return this.bioPermission;
    }

    public String getBioPhone() {
        return this.bioPhone;
    }

    public String getBioSecureUrl() {
        return this.bioSecureUrl;
    }

    public String getBioUrl() {
        return this.bioUrl;
    }

    public BizAccountInfo getBizAccountInfo() {
        return this.bizAccountInfo;
    }

    public int getBlockStatus() {
        return this.blockStatus;
    }

    public int getBlockingByType() {
        return this.blockingByType;
    }

    public List<String> getBoldFields() {
        return this.boldFields;
    }

    public BlueVBrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public int getCancelType() {
        return this.cancelType;
    }

    public String getCategory() {
        return this.category;
    }

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getCollectCount() {
        return this.collectCount;
    }

    public int getCommentFilterStatus() {
        return this.commentFilterStatus;
    }

    public int getCommentSetting() {
        return this.commentSetting;
    }

    public CommerceInfo getCommerceInfo() {
        return this.commerceInfo;
    }

    public CommercePermissionStruct getCommercePermission() {
        return this.commercePermission;
    }

    public CommerceUserInfo getCommerceUserInfo() {
        return this.commerceUserInfo;
    }

    public int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public int getCompleteProfileGuideStrategy() {
        return this.completeProfileGuideStrategy;
    }

    public int getConstellation() {
        return this.constellation;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getCountry() {
        return this.country;
    }

    public List<UrlModel> getCoverUrls() {
        return this.coverUrls;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public int getDisplayAddYoursOnProfile() {
        return this.displayAddYoursOnProfile;
    }

    public Integer getDisplayQnaOnProfile() {
        return this.displayQnaOnProfile;
    }

    public String getDistrict() {
        return this.district;
    }

    public int getDownloadSetting() {
        return this.downloadSetting;
    }

    public DspProfile getDspProfile() {
        return this.dspProfile;
    }

    public int getDuetSetting() {
        return this.duetSetting;
    }

    public AvatarSizeUrlStruct getDynamicSocialAvatar() {
        return this.dynamicSocialAvatar;
    }

    public int getEducation() {
        return this.education;
    }

    public EffectArtistDetail getEffectArtistDetail() {
        return this.effectArtistDetail;
    }

    public String getEmail() {
        return this.email;
    }

    public EnterpriseUserInfo getEnterpriseUserInfo() {
        return this.enterpriseUserInfo;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public ExternalRecommendReasonStruct getExternalRecommendReasonStruct() {
        return this.externalRecommendReasonStruct;
    }

    public FakeDataInfo getFakeDataInfo() {
        return this.fakeDataInfo;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public int getFavoritingCount() {
        return this.favoritingCount;
    }

    public long getFbExpireTime() {
        return this.fbExpireTime;
    }

    public int getFollowFrom() {
        return this.followFrom;
    }

    public String getFollowFromMsg() {
        return this.followFromMsg;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public int getFollowerCount() {
        return this.followerCount;
    }

    public List<FollowerDetail> getFollowerDetailList() {
        return this.followerDetailList;
    }

    public int getFollowerStatus() {
        return this.followerStatus;
    }

    public int getFollowingCount() {
        return this.followingCount;
    }

    public int getFpBlockByType() {
        return this.fpBlockByType;
    }

    public int getFriendCount() {
        return this.friendCount;
    }

    public String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public int getFriendsStatus() {
        return this.friendsStatus;
    }

    public FriendsTabRelatedUserInfo getFriendsTabInfo() {
        return this.friendsTabInfo;
    }

    public GeneralPermission getGeneralPermission() {
        return this.mGeneralPermission;
    }

    public int getGiftBagStatus() {
        return this.giftBagStatus;
    }

    public long getHandleModified() {
        return this.uniqueIdModifyTime;
    }

    public boolean getHasAnalyticsMetrics() {
        return this.hasAnalyticsMetrics;
    }

    public int getHideFollowingFollowerList() {
        return this.hideFollowingFollowerList;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public List<HomePageBottomToast> getHomepageBottomToast() {
        return this.homepageBottomToast;
    }

    public HonorStruct getHonorStruct() {
        return this.honorStruct;
    }

    public String getInsId() {
        return this.insId;
    }

    public boolean getIsCreater() {
        return this.isCreater;
    }

    public boolean getIsOldDouPlusUser() {
        return this.isOldDouplusUser;
    }

    public boolean getIsUserDataMiss() {
        return this.isUserDataMiss;
    }

    public int getIsVerifiedTako() {
        return this.isVerifiedTako;
    }

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public String getLanguage() {
        return this.language;
    }

    public Long getLastActiveTime() {
        return this.lastActiveTime;
    }

    public LatestUnreadVideoInfo getLatestUnreadVideoInfo() {
        return this.latestUnreadVideoInfo;
    }

    public int getLemon8AccountType() {
        return this.lemon8AccountType;
    }

    public String getLemon8OpenId() {
        return this.lemon8OpenId;
    }

    public int getLemon8ProfileSettings() {
        return this.lemon8ProfileSettings;
    }

    public String getLemon8StoreRegion() {
        return this.lemon8StoreRegion;
    }

    public String getLemon8UserName() {
        return this.lemon8UserName;
    }

    public int getLiveAgreement() {
        return this.liveAgreement;
    }

    public LiveAnchorInfo getLiveAnchorInfo() {
        return this.liveAnchorInfo;
    }

    public List<LiveEventStruct> getLiveEventStructList() {
        return this.mLiveEventStructList;
    }

    public int getLivePushNotificationStatus() {
        return this.livePushNotificationStatus;
    }

    public LiveRoomCropInfoStruct getLiveRoomCropInfo() {
        return this.liveRoomCropInfo;
    }

    public int getLiveStreamHeight() {
        return this.liveStreamHeight;
    }

    public boolean getLiveStreamNeedAdjust() {
        return this.liveStreamNeedAdjust;
    }

    public int getLiveStreamWidth() {
        return this.liveStreamWidth;
    }

    public int getLoginPlatform() {
        return this.loginPlatform;
    }

    public TTMallTabRelatedUserInfo getMallTabUserInfo() {
        return this.mallTabUserInfo;
    }

    public MatchedFriendStruct getMatchedFriendStruct() {
        return this.matchedFriendStruct;
    }

    public int getMixListNum() {
        return this.mixListNum;
    }

    public int getMixListStatus() {
        return this.mixListStatus;
    }

    public Map<Integer, String> getMoreAdvancedFeatureTextMap() {
        return this.moreAdvancedFeatureTextMap;
    }

    public List<Integer> getMoreAdvancedFeaturesOrder() {
        return this.moreAdvancedFeaturesOrder;
    }

    public int getMusicComplianceAccount() {
        return this.musicComplianceAccount;
    }

    public MusicTabInfo getMusicTabInfo() {
        return this.musicTabInfo;
    }

    public List<UrlModel> getMutualRelationAvatars() {
        return this.mutualRelationAvatars;
    }

    public int getMutualRelationNumber() {
        return this.mutualRelationNumber;
    }

    public String getMutualRelationTag() {
        return this.mutualRelationTag;
    }

    public MutualStruct getMutualStruct() {
        return this.mMutualStruct;
    }

    public String getNameField() {
        return this.nameField;
    }

    public List<NeedPointStruct> getNeedPoints() {
        return this.needPoints;
    }

    public int getNewFollowerCount() {
        return this.newFollowerCount;
    }

    public List<Integer> getNewMessageInInboxFollowStatusList() {
        return this.newMessageInInboxFollowStatusList;
    }

    public int getNewPostCount() {
        return this.newPostCount;
    }

    public int getNickNameModifyTs() {
        return this.nickNameModifyTs;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public OriginalMusician getOriginalMusician() {
        return this.originalMusician;
    }

    public PaidContentAwareBannerSetting getPaidContentAwareBannerSetting() {
        return this.paidContentAwareBannerSetting;
    }

    public PaidContentBannerSetting getPaidContentBannerSetting() {
        return this.paidContentBannerSetting;
    }

    public PlatformInfo[] getPlatformInfos() {
        return this.platformInfos;
    }

    public int getPostCount() {
        return this.postCount;
    }

    public int getPostNotificationStatus() {
        return this.postNotificationStatus;
    }

    public PotentialBizAccountInfo getPotentialBizAccountInfo() {
        return this.potentialBizAccountInfo;
    }

    public String getPredictedAgeGroup() {
        return this.predictedAgeGroup;
    }

    public PrivacySetting getPrivacySetting() {
        return this.privacySetting;
    }

    public boolean getPrivateAccountForMonitor() {
        return this.isPrivateAccount;
    }

    public int getPrivateAwemeCount() {
        return this.privateAwemeCount;
    }

    public int getProAccountUpdateNotificationStatus() {
        return this.proAccountUpdateNotificationStatus;
    }

    public Aweme getProfileBackgroundAweme() {
        return this.profileBackgroundAweme;
    }

    public List<String> getProfileBackgroundImageUrlList() {
        return this.profileBackgroundImageUrlList;
    }

    public int getProfileBackgroundMediaType() {
        return this.profileBackgroundMediaType;
    }

    public float getProfileBackgroundOffsetRatio() {
        return this.profileBackgroundOffsetRatio;
    }

    public ProfileBadgeStruct getProfileBadge() {
        return this.mProfileBadgeStruct;
    }

    public float getProfileCompletion() {
        return this.profileCompletion;
    }

    public List<Integer> getProfileLinkOrderList() {
        return this.profileLinkOrderList;
    }

    public Map<Integer, String> getProfileLinksMap() {
        return this.profileLinksMap;
    }

    public ProfileNgoStruct getProfileNgoStruct() {
        return this.mProfileNgoStruct;
    }

    public long getProfilePv() {
        return this.profilePv;
    }

    public UserPronounsInfo getPronounsInfo() {
        return this.mPronounsInfo;
    }

    public String getProvince() {
        return this.province;
    }

    public int getQnaStatus() {
        return this.qnaStatus;
    }

    public QuickShopInfo getQuickShopInfo() {
        return this.quickShopInfo;
    }

    public String getRecType() {
        return this.recType;
    }

    public List<RecommendAwemeItem> getRecommendAwemeItems() {
        return this.recommendAwemeItems;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public String getRecommendReasonRelation() {
        return this.recommendReasonRelation;
    }

    public double getRecommendScore() {
        return this.recommendScore;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegisterFrom() {
        return this.registerFrom;
    }

    public int getRegisterStatus() {
        return this.registerStatus;
    }

    public long getRegisterTime() {
        return this.registerTime;
    }

    public String getRelationLabel() {
        return this.relationLabel;
    }

    public String getRelationShip() {
        return this.relationShip;
    }

    public List<RelativeUserInfo> getRelativeUserInfos() {
        return this.relativeUserInfos;
    }

    public String getRemarkName() {
        return this.remarkName;
    }

    public int getRepostCount() {
        return this.repostCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<User> getRevealDisplayUsers() {
        return this.revealDisplayUsers;
    }

    public String getRoomTitle() {
        return this.roomTitle;
    }

    public String getRoomTitleAiSummary() {
        return this.roomTitleAiSummary;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public String getRooomData() {
        return this.roomData;
    }

    public List<SchoolInfo> getSchoolInfo() {
        return this.schoolInfo;
    }

    public int getSchoolInfoShowRange() {
        return this.schoolInfoShowRange;
    }

    public String getSearchUserDesc() {
        return this.searchUserDesc;
    }

    public String getSearchUserName() {
        return this.searchUserName;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public boolean getSecretForMonitor() {
        return this.secret;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public int getShieldCommentNotice() {
        return this.shieldCommentNotice;
    }

    public int getShieldDiggNotice() {
        return this.shieldDiggNotice;
    }

    public List<ShieldEditFieldInfo> getShieldEditFieldInfoList() {
        return this.shieldEditFieldInfoList;
    }

    public int getShieldFollowNotice() {
        return this.shieldFollowNotice;
    }

    public ShopEntranceInfo getShopEntrance() {
        return this.shopEntrance;
    }

    public String getShopMicroApp() {
        return this.shopMicroApp;
    }

    public String getShortId() {
        return this.shortId;
    }

    public int getShowArtistPlaylist() {
        return this.showArtistPlaylist;
    }

    public boolean getShowTipEntry() {
        return this.showTipEntry;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<SignatureExtraInfo> getSignatureExtra() {
        return this.signatureExtra;
    }

    public String getSignatureLanguage() {
        return this.signatureLanguage;
    }

    public int getSignatureModifyTime() {
        return this.signatureModifyTime;
    }

    public AvatarSizeUrlStruct getSocialAvatarWithBackground() {
        return this.socialAvatarWithBackground;
    }

    public AvatarSizeUrlStruct getSocialAvatarWithoutBackground() {
        return this.socialAvatarWithoutBackground;
    }

    public String getSocialInfo() {
        return this.socialInfo;
    }

    public HotSearchSprintStruct getSprintSupportUserInfo() {
        return this.sprintSupportUserInfo;
    }

    public int getStarBillboardRank() {
        return this.starBillboardRank;
    }

    public AvatarSizeUrlStruct getStaticAvatar() {
        return this.staticAvatar;
    }

    public int getStitchSetting() {
        return this.stitchSetting;
    }

    public StoryBlockInfo getStoryBlockInfo() {
        return this.storyBlockInfo;
    }

    public int getStoryStatus() {
        return this.storyStatus;
    }

    public TabSetting getTabSetting() {
        return this.tabSetting;
    }

    public int getTabType() {
        return this.tabType;
    }

    public int getTaggedBAInvitationStatus() {
        return this.taggedBAInvitationStatus;
    }

    public boolean getTaggedIsBA() {
        return this.taggedIsBA;
    }

    public long getTotalFavorited() {
        return this.totalFavorited;
    }

    public long getTwExpireTime() {
        return this.twExpireTime;
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    public String getTwitterName() {
        return this.twitterName;
    }

    public long[] getTypeLabels() {
        return this.typeLabels;
    }

    public String getUid() {
        return this.uid;
    }

    public UnReadVideoInfo getUnReadVideoInfo() {
        return this.unReadVideoInfo;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public UrgeStruct getUrgeDetail() {
        return this.urgeDetail;
    }

    public Map<Integer, String> getUserAdvancedFeatureTextMap() {
        return this.userAdvancedFeatureTextMap;
    }

    public List<Integer> getUserAdvancedFeaturesOrder() {
        return this.userAdvancedFeaturesOrder;
    }

    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public UserHonor getUserHonor() {
        return this.userHonor;
    }

    public int getUserMode() {
        return this.userMode;
    }

    public UserNowPackStruct getUserNowPackStruct() {
        return this.userNowPackStruct;
    }

    public int getUserPeriod() {
        return this.userPeriod;
    }

    public UserProfileActivityGuide getUserProfileActivityGuide() {
        return this.userProfileActivityGuide;
    }

    public List<UserProfileGuide> getUserProfileGuide() {
        return this.userProfileGuide;
    }

    public List<UserProfileGuideDataV2> getUserProfileGuideV2() {
        return this.userProfileGuideV2;
    }

    public int getUserRate() {
        return this.userRate;
    }

    public UserRateRemindInfo getUserRateRemindInfo() {
        return this.userRateRemindInfo;
    }

    public int getVerificationBadgeType() {
        return this.verificationBadgeType;
    }

    public int getVerificationType() {
        return this.verificationType;
    }

    public String getVerifyInfo() {
        return this.verifyInfo;
    }

    public VideoCover getVideoCover() {
        return this.videoCover;
    }

    public int getVideoGiftStatus() {
        return this.videoGiftStatus;
    }

    public int getViewerType() {
        return this.viewerType;
    }

    public int getWatchwStatus() {
        return this.watchStatus;
    }

    public List<UrlModel> getWhiteCoverUrl() {
        return this.whiteCoverUrl;
    }

    public int getXmasUnlockCount() {
        return this.xmasUnlockCount;
    }

    public long getYouTubeLastRefreshTime() {
        return this.youTubeLastRefreshTime;
    }

    public String getYouTubeRefreshToken() {
        return this.youTubeRefreshToken;
    }

    public String getYoutubeChannelId() {
        return this.youtubeChannelId;
    }

    public String getYoutubeChannelTitle() {
        return this.youtubeChannelTitle;
    }

    public long getYoutubeExpireTime() {
        return this.youtubeExpireTime;
    }

    public String getYoutubeRawRefreshToken() {
        return this.youtubeRawRefreshToken;
    }

    public HotListStruct getmHotListStruct() {
        return this.mHotListStruct;
    }

    public RocketFansGroupInfo getrFansGroupInfo() {
        return this.rFansGroupInfo;
    }

    public boolean isAcceptPrivatePolicy() {
        return this.acceptPrivatePolicy;
    }

    public boolean isActivityUser() {
        return this.isActivityUser;
    }

    public boolean isAdFake() {
        return this.isAdFake;
    }

    public boolean isAdVirtual() {
        return this.isAdVirtual;
    }

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public boolean isCanModifySchoolInfo() {
        return this.canModifySchoolInfo;
    }

    public boolean isCanSetGeoFencing() {
        return this.canSetGeoFencing;
    }

    public boolean isCheckDMPermission() {
        return this.checkDMPermission;
    }

    public boolean isContactsSyncStatus() {
        return this.contactsSyncStatus;
    }

    public boolean isContentLanguageDialogShown() {
        return this.isContentLanguageDialogShown;
    }

    public boolean isDisciplineMember() {
        return this.isDisciplineMember;
    }

    public boolean isDisplayWvalantineActivityEntry() {
        return this.displayWvalantineActivityEntry;
    }

    public boolean isEffectArtist() {
        return this.isEffectArtist;
    }

    public boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public boolean isEnableAdOfficialLiveAuthor() {
        return this.enableAdOfficialLiveAuthor;
    }

    public boolean isEnableDirectMessage() {
        return this.enableDirectMessage;
    }

    public boolean isEnableSubscription() {
        return this.enableSubscription;
    }

    public boolean isEnabledFilterAllComments() {
        return this.enabledFilterAllComments;
    }

    public boolean isForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public boolean isFromProfileRefresh() {
        return this.isFromProfileRefresh;
    }

    public boolean isGeoBlocked() {
        return this.isGeoBlocked;
    }

    public boolean isHasEmail() {
        return this.hasEmail;
    }

    public boolean isHasFacebookToken() {
        return this.hasFacebookToken;
    }

    public boolean isHasOrders() {
        return this.hasOrders;
    }

    public boolean isHasTwitterToken() {
        return this.hasTwitterToken;
    }

    public boolean isHasYoutubeToken() {
        return this.hasYoutubeToken;
    }

    public boolean isHideLemon8EditLink() {
        return this.hideLemon8EditLink;
    }

    public boolean isHideSearch() {
        return this.hideSearch;
    }

    public boolean isHideShootButton() {
        return this.hideShootButton;
    }

    public boolean isLiveCommerce() {
        return this.liveCommerce;
    }

    public boolean isMatchedFriendAvailable() {
        return this.matchedFriendAvailable;
    }

    public boolean isMentionEnabled() {
        return this.mMentionEnabled;
    }

    public boolean isNeedAddrCard() {
        return this.needAddrCard;
    }

    public boolean isNeedRecommend() {
        return this.needRecommend;
    }

    public boolean isNewRecommend() {
        return this.isNewRecommend;
    }

    public boolean isPendingUnblockRequest() {
        return this.isPendingUnblockRequest;
    }

    public boolean isPhoneBinded() {
        return this.isPhoneBinded;
    }

    public boolean isPostDefaultDownloadSetting() {
        return this.postDefaultDownloadSetting;
    }

    public boolean isPreventDownload() {
        return this.preventDownload;
    }

    public boolean isPrivateAccount() {
        return this.isPrivateAccount;
    }

    public boolean isProAccount() {
        return this.isProAccount;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public boolean isShould_write_impr() {
        return this.shouldWriteImpr;
    }

    public boolean isShowEffectList() {
        return this.showEffectList;
    }

    public boolean isShowFavoriteList() {
        return this.showFavoriteList;
    }

    public boolean isShowImageBubble() {
        return this.showImageBubble;
    }

    public boolean isShowMessageButton() {
        return this.showMessageButton;
    }

    public boolean isStar() {
        return this.isStar;
    }

    public boolean isTranslator() {
        return this.isTranslator;
    }

    public boolean isUserCancelled() {
        return this.userCancelled;
    }

    public boolean isUserInactive() {
        return this.userInactive;
    }

    public boolean isVideoViewIsAuth() {
        return this.videoViewIsAuth;
    }

    public boolean isWithCommerceEnterpriseTabEntry() {
        return this.withCommerceEnterpriseTabEntry;
    }

    public boolean isWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public boolean isWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public boolean isWithDouplusEntry() {
        return this.withDouplusEntry;
    }

    public boolean isWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public boolean isWithNewGoods() {
        return this.withNewGoods;
    }

    public boolean isWithShopEntry() {
        return this.withShopEntry;
    }

    public boolean isWithStarAtlasEntry() {
        return this.withStarAtlasEntry;
    }

    public boolean nicknameUpdateReminder() {
        return this.nicknameUpdateReminder;
    }

    private boolean checkExpire(long j) {
        if ((System.currentTimeMillis() / 1000) - j > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        if (this.allowStatus != user.allowStatus || this.followStatus != user.followStatus || this.followerStatus != user.followerStatus || this.friendsStatus != user.friendsStatus || this.watchStatus != user.watchStatus || this.awemeCount != user.awemeCount || this.followingCount != user.followingCount || this.followerCount != user.followerCount || this.newFollowerCount != user.newFollowerCount || this.collectCount != user.collectCount || this.friendCount != user.friendCount || this.totalFavorited != user.totalFavorited || this.favoritingCount != user.favoritingCount || this.registerStatus != user.registerStatus || this.hideSearch != user.hideSearch || this.mAtType != user.mAtType || this.constellation != user.constellation || this.needRecommend != user.needRecommend || this.secret != user.secret || this.isPrivateAccount != user.isPrivateAccount || this.isBlocked != user.isBlocked || this.isBlock != user.isBlock || this.livePushNotificationStatus != user.livePushNotificationStatus) {
            return false;
        }
        String str = this.uid;
        if (str != null) {
            if (!str.equals(user.uid)) {
                return false;
            }
        } else if (user.uid != null) {
            return false;
        }
        String str2 = this.shortId;
        if (str2 != null) {
            if (!str2.equals(user.shortId)) {
                return false;
            }
        } else if (user.shortId != null) {
            return false;
        }
        String str3 = this.nickname;
        if (str3 != null) {
            if (!str3.equals(user.nickname)) {
                return false;
            }
        } else if (user.nickname != null) {
            return false;
        }
        String str4 = this.remarkName;
        if (str4 != null) {
            if (!str4.equals(user.remarkName)) {
                return false;
            }
        } else if (user.remarkName != null) {
            return false;
        }
        String str5 = this.signature;
        if (str5 != null) {
            if (!str5.equals(user.signature)) {
                return false;
            }
        } else if (user.signature != null) {
            return false;
        }
        String str6 = this.birthday;
        if (str6 != null) {
            if (!str6.equals(user.birthday)) {
                return false;
            }
        } else if (user.birthday != null) {
            return false;
        }
        UrlModel urlModel = this.avatarLarger;
        if (urlModel != null) {
            if (!urlModel.equals(user.avatarLarger)) {
                return false;
            }
        } else if (user.avatarLarger != null) {
            return false;
        }
        UrlModel urlModel2 = this.avatarThumb;
        if (urlModel2 != null) {
            if (!urlModel2.equals(user.avatarThumb)) {
                return false;
            }
        } else if (user.avatarThumb != null) {
            return false;
        }
        UrlModel urlModel3 = this.avatarMedium;
        if (urlModel3 != null) {
            if (!urlModel3.equals(user.avatarMedium)) {
                return false;
            }
        } else if (user.avatarMedium != null) {
            return false;
        }
        UrlModel urlModel4 = this.avatarVideoUri;
        if (urlModel4 != null) {
            if (!urlModel4.equals(user.avatarVideoUri)) {
                return false;
            }
        } else if (user.avatarVideoUri != null) {
            return false;
        }
        AvatarMetaInfo avatarMetaInfo = this.avatarMeta;
        if (avatarMetaInfo != null) {
            if (!avatarMetaInfo.equals(user.avatarMeta)) {
                return false;
            }
        } else if (user.avatarMeta != null) {
            return false;
        }
        List<AvatarMetaInfoWithCategory> list = this.avatarMetaInfoList;
        if (list != null) {
            if (!list.equals(user.avatarMetaInfoList)) {
                return false;
            }
        } else if (user.avatarMetaInfoList != null) {
            return false;
        }
        String str7 = this.thirdName;
        if (str7 != null) {
            if (!str7.equals(user.thirdName)) {
                return false;
            }
        } else if (user.thirdName != null) {
            return false;
        }
        String str8 = this.customVerify;
        if (str8 != null) {
            if (!str8.equals(user.customVerify)) {
                return false;
            }
        } else if (user.customVerify != null) {
            return false;
        }
        String str9 = this.uniqueId;
        if (str9 != null) {
            if (!str9.equals(user.uniqueId)) {
                return false;
            }
        } else if (user.uniqueId != null) {
            return false;
        }
        ShareInfo shareInfo = this.shareInfo;
        if (shareInfo != null) {
            if (!shareInfo.equals(user.shareInfo)) {
                return false;
            }
        } else if (user.shareInfo != null) {
            return false;
        }
        Long l = this.createTime;
        if (l != null) {
            if (!l.equals(user.createTime)) {
                return false;
            }
        } else if (user.createTime != null) {
            return false;
        }
        if (this.preventDownload != user.preventDownload || this.showImageBubble != user.showImageBubble || this.acceptPrivatePolicy != user.acceptPrivatePolicy || this.commentSetting != user.commentSetting || this.duetSetting != user.duetSetting || this.stitchSetting != user.stitchSetting || this.hasEmail != user.hasEmail || this.downloadSetting != user.downloadSetting) {
            return false;
        }
        String str10 = this.region;
        if (str10 != null) {
            if (!str10.equals(user.region)) {
                return false;
            }
        } else if (user.region != null) {
            return false;
        }
        String str11 = this.language;
        if (str11 != null) {
            if (!str11.equals(user.language)) {
                return false;
            }
        } else if (user.language != null) {
            return false;
        }
        String str12 = this.roomTypeTag;
        if (str12 != null) {
            if (!str12.equals(user.roomTypeTag)) {
                return false;
            }
        } else if (user.roomTypeTag != null) {
            return false;
        }
        Long l2 = this.latestOrderTime;
        if (l2 != null) {
            if (!l2.equals(user.latestOrderTime)) {
                return false;
            }
        } else if (user.latestOrderTime != null) {
            return false;
        }
        if (this.isTranslator != user.isTranslator || this.storyStatus != user.storyStatus) {
            return false;
        }
        String str13 = this.bindPhone;
        String str14 = user.bindPhone;
        if (str13 != null) {
            return str13.equals(str14);
        }
        if (str14 == null) {
            return true;
        }
        return false;
    }

    public UrlModel getCoverUrlWithMode(boolean z) {
        if (z) {
            return (UrlModel) ListProtector.get(getCoverUrls(), 0);
        }
        return (UrlModel) ListProtector.get(getWhiteCoverUrl(), 0);
    }

    public PlatformInfo getPlatformInfo(String str) {
        PlatformInfo[] platformInfoArr;
        if (!TextUtils.isEmpty(str) && (platformInfoArr = this.platformInfos) != null) {
            for (PlatformInfo platformInfo : platformInfoArr) {
                if (str.equals(platformInfo.getPatformName())) {
                    return platformInfo;
                }
            }
            return null;
        }
        return null;
    }

    public void setAcceptPrivatePolicy(boolean z) {
        this.acceptPrivatePolicy = z;
    }

    public void setAccountLabelInfos(List<AccountLabelInfo> list) {
        this.accountLabelInfos = list;
    }

    public void setAccountRegion(String str) {
        this.accountRegion = str;
    }

    public void setAccountType(int i) {
        this.accountType = i;
    }

    public void setActivityStatusSetting(int i) {
        this.activityStatusSetting = i;
    }

    public void setActivityUser(boolean z) {
        this.isActivityUser = z;
    }

    public void setAdAuthorDesc(String str) {
        this.adAuthorDesc = str;
    }

    public void setAdAuthorization(boolean z) {
        if (this.commerceUserInfo == null) {
            this.commerceUserInfo = new CommerceUserInfo();
        }
        this.commerceUserInfo.adAuthorization = z;
    }

    public void setAdCoverTitle(AdCoverTitle adCoverTitle) {
        this.adCoverTitle = adCoverTitle;
    }

    public void setAdCoverUrl(List<UrlModel> list) {
        this.adCoverUrl = list;
    }

    public void setAdFake(boolean z) {
        this.isAdFake = z;
    }

    public void setAdOrderId(String str) {
        this.adOrderId = str;
    }

    public void setAdVirtual(boolean z) {
        this.isAdVirtual = z;
    }

    public void setAddYoursInvited(Boolean bool) {
        this.addYoursInvited = bool;
    }

    public void setAffinityScore(float f) {
        this.affinityScore = f;
    }

    public void setAgeGateAction(int i) {
        this.ageGateAction = i;
    }

    public void setAgeGateInfo(AgeGateInfo ageGateInfo) {
        this.ageGateInfo = ageGateInfo;
    }

    public void setAgeGatePostAction(int i) {
        this.ageGatePostAction = i;
    }

    public void setAgeGateTime(int i) {
        this.ageGateTime = i;
    }

    public void setAllStoryMetadata(UserAllStoryMetadata userAllStoryMetadata) {
        this.allStoryMetadata = StoryMetadataKt.updateStoryMetadata(this.allStoryMetadata, userAllStoryMetadata);
    }

    public void setAllowStatus(int i) {
        this.allowStatus = i;
    }

    public void setAnchorScheduleGuideTxt(String str) {
        this.anchorScheduleGuideTxt = str;
    }

    public void setAtType(int i) {
        this.mAtType = i;
    }

    public void setAuthorityStatus(long j) {
        this.authorityStatus = j;
    }

    public void setAvatar168(UrlModel urlModel) {
        this.avatar168 = urlModel;
    }

    public void setAvatar300(UrlModel urlModel) {
        this.avatar300 = urlModel;
    }

    public void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public void setAvatarMeta(AvatarMetaInfo avatarMetaInfo) {
        this.avatarMeta = avatarMetaInfo;
    }

    public void setAvatarMetaInfoList(List<AvatarMetaInfoWithCategory> list) {
        this.avatarMetaInfoList = list;
    }

    public void setAvatarPendantLarger(UrlModel urlModel) {
        this.avatarPendantLarger = urlModel;
    }

    public void setAvatarPendantMedium(UrlModel urlModel) {
        this.avatarPendantMedium = urlModel;
    }

    public void setAvatarPendantThumb(UrlModel urlModel) {
        this.avatarPendantThumb = urlModel;
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setAvatarUpdateReminder(boolean z) {
        this.avatarUpdateReminder = z;
    }

    public void setAvatarVideoUri(UrlModel urlModel) {
        this.avatarVideoUri = urlModel;
    }

    public void setAwemeCount(int i) {
        this.awemeCount = i;
    }

    public void setAwemeCover(UserAwemeCover userAwemeCover) {
        this.awemeCover = userAwemeCover;
    }

    public void setAwemeUnreadInfo(AwemeUnreadInfo awemeUnreadInfo) {
        this.awemeUnreadInfo = awemeUnreadInfo;
    }

    public void setBannerSetting(CreatorFundBannerSetting creatorFundBannerSetting) {
        this.bannerSetting = creatorFundBannerSetting;
    }

    public void setBindPhone(String str) {
        this.bindPhone = str;
    }

    public void setBioEmail(String str) {
        this.bioEmail = str;
    }

    public void setBioLocation(String str) {
        this.bioLocation = str;
    }

    public void setBioPermission(UserBioPermission userBioPermission) {
        this.bioPermission = userBioPermission;
    }

    public void setBioPhone(String str) {
        this.bioPhone = str;
    }

    public void setBioSecureUrl(String str) {
        this.bioSecureUrl = str;
    }

    public void setBioUrl(String str) {
        this.bioUrl = str;
    }

    public void setBizAccountInfo(BizAccountInfo bizAccountInfo) {
        this.bizAccountInfo = bizAccountInfo;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlockStatus(int i) {
        this.blockStatus = i;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public void setBlockingByType(int i) {
        this.blockingByType = i;
    }

    public void setBoldFields(List<String> list) {
        this.boldFields = list;
    }

    public void setBrandInfo(BlueVBrandInfo blueVBrandInfo) {
        this.brandInfo = blueVBrandInfo;
    }

    public void setBroadcasterRoomId(long j) {
        this.roomId = j;
    }

    public void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public void setCanModifySchoolInfo(boolean z) {
        this.canModifySchoolInfo = z;
    }

    public void setCanSetGeoFencing(boolean z) {
        this.canSetGeoFencing = z;
    }

    public void setCancelType(int i) {
        this.cancelType = i;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setChallengeList(List<Challenge> list) {
        this.challengeList = list;
    }

    public void setCheckDMPermission(boolean z) {
        this.checkDMPermission = z;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCollectCount(int i) {
        this.collectCount = i;
    }

    public void setCommentFilterStatus(int i) {
        this.commentFilterStatus = i;
    }

    public void setCommentSetting(int i) {
        this.commentSetting = i;
    }

    public void setCommerceInfo(CommerceInfo commerceInfo) {
        this.commerceInfo = commerceInfo;
    }

    public void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public void setCompleteProfileGuideStrategy(int i) {
        this.completeProfileGuideStrategy = i;
    }

    public void setConstellation(int i) {
        this.constellation = i;
    }

    public void setContactName(String str) {
        this.contactName = str;
    }

    public void setContactsSyncStatus(boolean z) {
        this.contactsSyncStatus = z;
    }

    public void setContentLanguageDialogShown(boolean z) {
        this.isContentLanguageDialogShown = z;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCoverUrls(List<UrlModel> list) {
        this.coverUrls = list;
    }

    public void setCreateTime(Long l) {
        this.createTime = l;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setDisciplineMember(boolean z) {
        this.isDisciplineMember = z;
    }

    public void setDisplayAddYoursOnProfile(int i) {
        this.displayAddYoursOnProfile = i;
    }

    public void setDisplayQnaOnProfile(Integer num) {
        this.displayQnaOnProfile = num;
    }

    public void setDisplayWvalantineActivityEntry(boolean z) {
        this.displayWvalantineActivityEntry = z;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setDownloadSetting(int i) {
        this.downloadSetting = i;
    }

    public void setDspProfile(DspProfile dspProfile) {
        this.dspProfile = dspProfile;
    }

    public void setDuetSetting(int i) {
        this.duetSetting = i;
    }

    public void setDynamicSocialAvatar(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.dynamicSocialAvatar = avatarSizeUrlStruct;
    }

    public void setEducation(int i) {
        this.education = i;
    }

    public void setEffectArtist(boolean z) {
        this.isEffectArtist = z;
    }

    public void setEffectArtistDetail(EffectArtistDetail effectArtistDetail) {
        this.effectArtistDetail = effectArtistDetail;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailVerified(boolean z) {
        this.isEmailVerified = z;
    }

    public void setEnableAdOfficialLiveAuthor(boolean z) {
        this.enableAdOfficialLiveAuthor = z;
    }

    public void setEnableDirectMessage(boolean z) {
        this.enableDirectMessage = z;
    }

    public void setEnableSubscription(boolean z) {
        this.enableSubscription = z;
    }

    public void setEnabledFilterAllComments(boolean z) {
        this.enabledFilterAllComments = z;
    }

    public void setEnterpriseUserInfo(EnterpriseUserInfo enterpriseUserInfo) {
        this.enterpriseUserInfo = enterpriseUserInfo;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct;
    }

    public void setFakeDataInfo(FakeDataInfo fakeDataInfo) {
        this.fakeDataInfo = fakeDataInfo;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setFavoritingCount(int i) {
        this.favoritingCount = i;
    }

    public void setFbExpireTime(long j) {
        this.fbExpireTime = j;
    }

    public void setFollowFrom(int i) {
        this.followFrom = i;
    }

    public void setFollowFromMsg(String str) {
        this.followFromMsg = str;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setFollowerCount(int i) {
        this.followerCount = i;
    }

    public void setFollowerDetailList(List<FollowerDetail> list) {
        this.followerDetailList = list;
    }

    public void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public void setFollowingCount(int i) {
        this.followingCount = i;
    }

    public void setForcePrivateAccount(boolean z) {
        this.forcePrivateAccount = z;
    }

    public void setFpBlockByType(int i) {
        this.fpBlockByType = i;
    }

    public void setFriendCount(int i) {
        this.friendCount = i;
    }

    public void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public void setFriendsStatus(int i) {
        this.friendsStatus = i;
    }

    public void setFriendsTabInfo(FriendsTabRelatedUserInfo friendsTabRelatedUserInfo) {
        this.friendsTabInfo = friendsTabRelatedUserInfo;
    }

    public void setFromProfile(boolean z) {
        this.isFromProfileRefresh = z;
    }

    public void setGeneralPermission(GeneralPermission generalPermission) {
        this.mGeneralPermission = generalPermission;
    }

    public void setGeoBlocked(boolean z) {
        this.isGeoBlocked = z;
    }

    public void setGiftBagStatus(int i) {
        this.giftBagStatus = i;
    }

    public void setHandleModified(long j) {
        this.uniqueIdModifyTime = j;
    }

    public void setHasEmail(boolean z) {
        this.hasEmail = z;
    }

    public void setHasFacebookToken(boolean z) {
        this.hasFacebookToken = z;
    }

    public void setHasOrders(boolean z) {
        this.hasOrders = z;
    }

    public void setHasTwitterToken(boolean z) {
        this.hasTwitterToken = z;
    }

    public void setHasYoutubeToken(boolean z) {
        this.hasYoutubeToken = z;
    }

    public void setHideFollowingFollowerList(int i) {
        this.hideFollowingFollowerList = i;
    }

    public void setHideLemon8EditLink(boolean z) {
        this.hideLemon8EditLink = z;
    }

    public void setHideSearch(boolean z) {
        this.hideSearch = z;
    }

    public void setHideShootButton(boolean z) {
        this.hideShootButton = z;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setHonorStruct(HonorStruct honorStruct) {
        this.honorStruct = honorStruct;
    }

    public void setInsId(String str) {
        this.insId = str;
    }

    public void setIsCreater(boolean z) {
        this.isCreater = z;
    }

    public void setIsFeatureVideoChanged(Boolean bool) {
        this.isFeatureVideoChanged = bool.booleanValue();
    }

    public void setIsMute(boolean z) {
        if (z) {
            this.isMute = 1;
        } else {
            this.isMute = 0;
        }
    }

    public void setIsMuteLives(boolean z) {
        this.isMuteLives = z ? 1 : 0;
    }

    public void setIsMuteNonStoryPost(boolean z) {
        this.isMuteNonStoryPost = z ? 1 : 0;
    }

    public void setIsMuteStory(boolean z) {
        this.isMuteStory = z ? 1 : 0;
    }

    public void setIsOldDouplusUser(boolean z) {
        this.isOldDouplusUser = z;
    }

    public void setIsPotentialBA(PotentialBizAccountInfo potentialBizAccountInfo) {
        this.potentialBizAccountInfo = potentialBizAccountInfo;
    }

    public void setIsTranslator(boolean z) {
        this.isTranslator = z;
    }

    public void setIsVerifiedTako(int i) {
        this.isVerifiedTako = i;
    }

    public void setIsoCountryCode(String str) {
        this.isoCountryCode = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLatestOrderTime(Long l) {
        this.latestOrderTime = l;
    }

    public void setLemon8AccountType(int i) {
        this.lemon8AccountType = i;
    }

    public void setLemon8OpenId(String str) {
        this.lemon8OpenId = str;
    }

    public void setLemon8ProfileSettings(int i) {
        this.lemon8ProfileSettings = i;
    }

    public void setLemon8StoreRegion(String str) {
        this.lemon8StoreRegion = str;
    }

    public void setLemon8UserName(String str) {
        this.lemon8UserName = str;
    }

    public void setLiveAgreement(int i) {
        this.liveAgreement = i;
    }

    public void setLiveAnchorInfo(LiveAnchorInfo liveAnchorInfo) {
        this.liveAnchorInfo = liveAnchorInfo;
    }

    public void setLiveEventStructList(List<LiveEventStruct> list) {
        this.mLiveEventStructList = list;
    }

    public void setLivePushNotificationStatus(int i) {
        this.livePushNotificationStatus = i;
    }

    public void setLiveRoomCropInfo(LiveRoomCropInfoStruct liveRoomCropInfoStruct) {
        this.liveRoomCropInfo = liveRoomCropInfoStruct;
    }

    public void setLiveStreamHeight(int i) {
        this.liveStreamHeight = i;
    }

    public void setLiveStreamNeedAdjust(boolean z) {
        this.liveStreamNeedAdjust = z;
    }

    public void setLiveStreamWidth(int i) {
        this.liveStreamWidth = i;
    }

    public void setLoginPlatform(int i) {
        this.loginPlatform = i;
    }

    public void setMallTabUserInfo(TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo) {
        this.mallTabUserInfo = tTMallTabRelatedUserInfo;
    }

    public void setMatchedFriendAvailable(boolean z) {
        this.matchedFriendAvailable = z;
    }

    public void setMatchedFriendStruct(MatchedFriendStruct matchedFriendStruct) {
        this.matchedFriendStruct = matchedFriendStruct;
    }

    public void setMentionEnabled(boolean z) {
        this.mMentionEnabled = z;
    }

    public void setMixListNum(int i) {
        this.mixListNum = i;
    }

    public void setMoreAdvancedFeatureTextMap(Map<Integer, String> map) {
        this.moreAdvancedFeatureTextMap = map;
    }

    public void setMoreAdvancedFeaturesOrder(List<Integer> list) {
        this.moreAdvancedFeaturesOrder = list;
    }

    public void setMusicComplianceAccount(int i) {
        this.musicComplianceAccount = i;
    }

    public void setMusicTabInfo(MusicTabInfo musicTabInfo) {
        this.musicTabInfo = musicTabInfo;
    }

    public void setMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public void setNameField(String str) {
        this.nameField = str;
    }

    public void setNeedAddrCard(boolean z) {
        this.needAddrCard = z;
    }

    public void setNeedPoints(List<NeedPointStruct> list) {
        this.needPoints = list;
    }

    public void setNeedRecommend(boolean z) {
        this.needRecommend = z;
    }

    public void setNewFollowerCount(int i) {
        this.newFollowerCount = i;
    }

    public void setNewMessageInInboxFollowStatusList(List<Integer> list) {
        this.newMessageInInboxFollowStatusList = list;
    }

    public void setNewPostCount(int i) {
        this.newPostCount = i;
    }

    public void setNewRecommend(boolean z) {
        this.isNewRecommend = z;
    }

    public void setNickNameModifyTs(int i) {
        this.nickNameModifyTs = i;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNicknameUpdateReminder(boolean z) {
        this.nicknameUpdateReminder = z;
    }

    public void setNormalTopCommentPermission(int i) {
        this.normalTopCommentPermission = i;
    }

    public void setNotifyPrivateAccount(int i) {
        this.notifyPrivateAccount = i;
    }

    public void setOriginalMusician(OriginalMusician originalMusician) {
        this.originalMusician = originalMusician;
    }

    public void setPaidContentAwareBannerSetting(PaidContentAwareBannerSetting paidContentAwareBannerSetting) {
        this.paidContentAwareBannerSetting = paidContentAwareBannerSetting;
    }

    public void setPaidContentBannerSetting(PaidContentBannerSetting paidContentBannerSetting) {
        this.paidContentBannerSetting = paidContentBannerSetting;
    }

    public void setPendingUnblockRequest(boolean z) {
        this.isPendingUnblockRequest = z;
    }

    public void setPhoneBinded(boolean z) {
        this.isPhoneBinded = z;
    }

    public void setPlatformInfos(PlatformInfo[] platformInfoArr) {
        this.platformInfos = platformInfoArr;
    }

    public void setPostCount(int i) {
        this.postCount = i;
    }

    public void setPostDefaultDownloadSetting(boolean z) {
        this.postDefaultDownloadSetting = z;
    }

    public void setPostNotificationStatus(int i) {
        this.postNotificationStatus = i;
    }

    public void setPredictedAgeGroup(String str) {
        this.predictedAgeGroup = str;
    }

    public void setPreventDownload(boolean z) {
        this.preventDownload = z;
    }

    public void setPrivacySetting(PrivacySetting privacySetting) {
        this.privacySetting = privacySetting;
    }

    public void setPrivateAccount(boolean z) {
        this.isPrivateAccount = z;
    }

    public void setPrivateAwemeCount(int i) {
        this.privateAwemeCount = i;
    }

    public void setProAccountUpdateNotificationStatus(int i) {
        this.proAccountUpdateNotificationStatus = i;
    }

    public void setProfileBackgroundAweme(Aweme aweme) {
        this.profileBackgroundAweme = aweme;
    }

    public void setProfileBackgroundImageUrlList(List<String> list) {
        this.profileBackgroundImageUrlList = list;
    }

    public void setProfileBackgroundMediaType(int i) {
        this.profileBackgroundMediaType = i;
    }

    public void setProfileBackgroundOffsetRatio(float f) {
        this.profileBackgroundOffsetRatio = f;
    }

    public void setProfileBadgeStruct(ProfileBadgeStruct profileBadgeStruct) {
        this.mProfileBadgeStruct = profileBadgeStruct;
    }

    public void setProfileLinkOrderList(List<Integer> list) {
        this.profileLinkOrderList = list;
    }

    public void setProfileLinksMap(Map<Integer, String> map) {
        this.profileLinksMap = map;
    }

    public void setProfileNgoStruct(ProfileNgoStruct profileNgoStruct) {
        this.mProfileNgoStruct = profileNgoStruct;
    }

    public void setPronouns(UserPronounsInfo userPronounsInfo) {
        this.mPronounsInfo = userPronounsInfo;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setQnaStatus(int i) {
        this.qnaStatus = i;
    }

    public void setQuickShopInfo(QuickShopInfo quickShopInfo) {
        this.quickShopInfo = quickShopInfo;
    }

    public void setRecType(String str) {
        this.recType = str;
    }

    public void setRecommendAwemeItems(List<RecommendAwemeItem> list) {
        this.recommendAwemeItems = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendReasonRelation(String str) {
        this.recommendReasonRelation = str;
    }

    public void setRecommendScore(double d) {
        this.recommendScore = d;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setRegisterFrom(String str) {
        this.registerFrom = str;
    }

    public void setRegisterStatus(int i) {
        this.registerStatus = i;
    }

    public void setRegisterTime(long j) {
        this.registerTime = j;
    }

    public void setRelationLabel(String str) {
        this.relationLabel = str;
    }

    public void setRelativeUserInfos(List<RelativeUserInfo> list) {
        this.relativeUserInfos = list;
    }

    public void setRemarkName(String str) {
        this.remarkName = str;
    }

    public void setRepostCount(int i) {
        this.repostCount = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRevealDisplayUsers(List<User> list) {
        this.revealDisplayUsers = list;
    }

    public void setRoomData(String str) {
        this.roomData = str;
    }

    public void setSchoolInfo(List<SchoolInfo> list) {
        this.schoolInfo = list;
    }

    public void setSchoolInfoShowRange(int i) {
        this.schoolInfoShowRange = i;
    }

    public void setSearchUserDesc(String str) {
        this.searchUserDesc = str;
    }

    public void setSearchUserName(String str) {
        this.searchUserName = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(boolean z) {
        this.secret = z;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setShieldCommentNotice(int i) {
        this.shieldCommentNotice = i;
    }

    public void setShieldDiggNotice(int i) {
        this.shieldDiggNotice = i;
    }

    public void setShieldEditFieldInfoList(List<ShieldEditFieldInfo> list) {
        this.shieldEditFieldInfoList = list;
    }

    public void setShieldFollowNotice(int i) {
        this.shieldFollowNotice = i;
    }

    public void setShopEntrance(ShopEntranceInfo shopEntranceInfo) {
        this.shopEntrance = shopEntranceInfo;
    }

    public void setShortId(String str) {
        this.shortId = str;
    }

    public void setShould_write_impr(boolean z) {
        this.shouldWriteImpr = z;
    }

    public void setShowArtistPlaylist(int i) {
        this.showArtistPlaylist = i;
    }

    public void setShowEffectList(boolean z) {
        this.showEffectList = z;
    }

    public void setShowFavoriteList(boolean z) {
        this.showFavoriteList = z;
    }

    public void setShowImageBubble(boolean z) {
        this.showImageBubble = z;
    }

    public void setShowMessageButton(boolean z) {
        this.showMessageButton = z;
    }

    public void setShowTipEntry(boolean z) {
        this.showTipEntry = z;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSignatureExtra(List<SignatureExtraInfo> list) {
        this.signatureExtra = list;
    }

    public void setSignatureLanguage(String str) {
        this.signatureLanguage = str;
    }

    public void setSignatureModifyTime(int i) {
        this.signatureModifyTime = i;
    }

    public void setSocialAvatarWithBackground(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.socialAvatarWithBackground = avatarSizeUrlStruct;
    }

    public void setSocialAvatarWithoutBackground(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.socialAvatarWithoutBackground = avatarSizeUrlStruct;
    }

    public void setSocialData(SocialDataStruct socialDataStruct) {
        this.socialData = socialDataStruct;
    }

    public void setSocialInfo(String str) {
        this.socialInfo = str;
    }

    public void setSprintSupportUserInfo(HotSearchSprintStruct hotSearchSprintStruct) {
        this.sprintSupportUserInfo = hotSearchSprintStruct;
    }

    public void setStar(boolean z) {
        this.isStar = z;
    }

    public void setStarBillboardRank(int i) {
        this.starBillboardRank = i;
    }

    public void setStaticAvatar(AvatarSizeUrlStruct avatarSizeUrlStruct) {
        this.staticAvatar = avatarSizeUrlStruct;
    }

    public void setStitchSetting(int i) {
        this.stitchSetting = i;
    }

    public void setStoryBlockInfo(StoryBlockInfo storyBlockInfo) {
        this.storyBlockInfo = storyBlockInfo;
    }

    public void setStoryStatus(int i) {
        this.storyStatus = i;
    }

    public void setTabSetting(TabSetting tabSetting) {
        this.tabSetting = tabSetting;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setTaggedBAInvitationStatus(int i) {
        this.taggedBAInvitationStatus = i;
    }

    public void setTaggedIsBA(boolean z) {
        this.taggedIsBA = z;
    }

    public void setTotalFavorited(long j) {
        this.totalFavorited = j;
    }

    public void setTwExpireTime(long j) {
        this.twExpireTime = j;
    }

    public void setTwitterId(String str) {
        this.twitterId = str;
    }

    public void setTwitterName(String str) {
        this.twitterName = str;
    }

    public void setTypeLabels(long[] jArr) {
        this.typeLabels = jArr;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUnReadVideoCount(int i) {
        UnReadVideoInfo unReadVideoInfo = this.unReadVideoInfo;
        if (unReadVideoInfo != null) {
            unReadVideoInfo.setUnReadCount(i);
        }
    }

    public void setUnReadVideoInfo(UnReadVideoInfo unReadVideoInfo) {
        this.unReadVideoInfo = unReadVideoInfo;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUrgeDetail(UrgeStruct urgeStruct) {
        this.urgeDetail = urgeStruct;
    }

    public void setUserAdvancedFeatureTextMap(Map<Integer, String> map) {
        this.userAdvancedFeatureTextMap = map;
    }

    public void setUserAdvancedFeaturesOrder(List<Integer> list) {
        this.userAdvancedFeaturesOrder = list;
    }

    public void setUserCancelled(boolean z) {
        this.userCancelled = z;
    }

    public void setUserDisplayName(String str) {
        this.userDisplayName = str;
    }

    public void setUserHonor(UserHonor userHonor) {
        this.userHonor = userHonor;
    }

    public void setUserInactive(boolean z) {
        this.userInactive = z;
    }

    public void setUserMode(int i) {
        this.userMode = i;
    }

    public void setUserNowPackStruct(UserNowPackStruct userNowPackStruct) {
        this.userNowPackStruct = userNowPackStruct;
    }

    public void setUserPeriod(int i) {
        this.userPeriod = i;
    }

    public void setUserProfileActivityGuide(UserProfileActivityGuide userProfileActivityGuide) {
        this.userProfileActivityGuide = userProfileActivityGuide;
    }

    public void setUserProfileGuide(List<UserProfileGuide> list) {
        this.userProfileGuide = list;
    }

    public void setUserProfileGuideV2(List<UserProfileGuideDataV2> list) {
        this.userProfileGuideV2 = list;
    }

    public void setUserRate(int i) {
        this.userRate = i;
    }

    public void setUserRateRemindInfo(UserRateRemindInfo userRateRemindInfo) {
        this.userRateRemindInfo = userRateRemindInfo;
    }

    public void setVerificationType(int i) {
        this.verificationType = i;
    }

    public void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public void setVideoCover(VideoCover videoCover) {
        this.videoCover = videoCover;
    }

    public void setVideoGiftStatus(int i) {
        this.videoGiftStatus = i;
    }

    public void setWatchStatus(int i) {
        this.watchStatus = i;
    }

    public void setWhiteCoverUrl(List<UrlModel> list) {
        this.whiteCoverUrl = list;
    }

    public void setWithCommerceEnterpriseTabEntry(boolean z) {
        this.withCommerceEnterpriseTabEntry = z;
    }

    public void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }

    public void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public void setWithDouplusEntry(boolean z) {
        this.withDouplusEntry = z;
    }

    public void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public void setXmasUnlockCount(int i) {
        this.xmasUnlockCount = i;
    }

    public void setYouTubeLastRefreshTime(long j) {
        this.youTubeLastRefreshTime = j;
    }

    public void setYouTubeRefreshToken(String str) {
        this.youTubeRefreshToken = str;
    }

    public void setYoutubeChannelId(String str) {
        this.youtubeChannelId = str;
    }

    public void setYoutubeChannelTitle(String str) {
        this.youtubeChannelTitle = str;
    }

    public void setYoutubeExpireTime(long j) {
        this.youtubeExpireTime = j;
    }

    public void setYoutubeRawRefreshToken(String str) {
        this.youtubeRawRefreshToken = str;
    }

    public void setmHotListStruct(HotListStruct hotListStruct) {
        this.mHotListStruct = hotListStruct;
    }

    public void setrFansGroupInfo(RocketFansGroupInfo rocketFansGroupInfo) {
        this.rFansGroupInfo = rocketFansGroupInfo;
    }
}
