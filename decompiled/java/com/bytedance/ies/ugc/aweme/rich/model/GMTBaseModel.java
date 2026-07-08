package com.bytedance.ies.ugc.aweme.rich.model;

import X.C09CS;
import X.C09CT;
import X.C09DE;
import X.C1216604pQ;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.feed.anchor.AnchorInfoStruct;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.feed.preload.PreloadData;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AboutAdInfo;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.Ad4adModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdDescriptiveCTAStruct;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdDisclaimer;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdDislikeInfo;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdDislikeModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdFeInteractionModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdHintData;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdLynxEntryData;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdPaidContent;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdProductTile;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdPromptInfoModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdQuestionnaire;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdStickerData;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdStyleActionModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.AdWebUrlDataFromJsb;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.DouPlusLinkData;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.FakeAuthor;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.FollowButtonData;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.LandingPageSurveyModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.LeftSlideGuideConfig;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.NativeCardInfo;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.NativeSiteConfig;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.OmVast;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.PhotoCarouselInfoStruct;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.ShakeModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AdCarouselColorInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AdInteractionData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AdLive;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AggregationSdk;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AutofillModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AwemeLinkLabel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AwemePlayFunModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AwemeSplashInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.AwemeTextLabelModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.BrowserConfig;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.CallToActionBarInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.CardStruct;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.DynamicVideo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.EcUgVSAData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.IndicatorData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.LandingPageConfig;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.LeftSlideMiddlePageModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.MiniCardModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.NativeAuthorInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.PromotePageModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdAIGCLabel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.AdRewardData;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.DMFormCardConfig;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.DetailBottomBanner;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.FeatureCenterModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.InterstitialAdInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.LandingPageNetworkOptimization;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.ad.OverlayNativeConfig;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.live.EcommerceInfo;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.search.AwemeSearchAdModel;
import com.bytedance.ies.ugc.aweme.rich.model.utils.JsonToStringAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class GMTBaseModel extends CommonAdData {
    public transient boolean LLJ;
    public AdWebUrlDataFromJsb LLJILJIL;

    @C09CT("ace_scene")
    public int aceSceneType;

    @C09CT("action_extra")
    public String actionExtra;

    @C09CT("ad4ad")
    public Ad4adModel ad4adModel;

    @C09CT("aigc_label")
    public AdAIGCLabel adAigcLabel;

    @C09CT("descriptive_cta")
    public AdDescriptiveCTAStruct adDescriptiveCTA;

    @C09CT("dislike")
    public AdDislikeModel adDislikeModel;

    @C09CT("interaction_form")
    public AdFeInteractionModel adFeInteractionModel;

    @C09CT("hint_data")
    public AdHintData adHintData;

    @C09CT("ad_id")
    public Long adId;

    @C09CT("interaction_data")
    public AdInteractionData adInteractionData;

    @C09CT("live")
    public AdLive adLive;

    @C09CT("ad_more_textual")
    public String adMoreTextual;

    @C09CT("play_node_track_url")
    public List<Object> adNodeTrackUrlList;

    @C09CT("paid_content")
    public AdPaidContent adPaidContent;

    @C09CT("ad_questionnaire")
    public AdQuestionnaire adQuestionnaire;

    @C09CT("ad_reward_data")
    public AdRewardData adRewardData;

    @C09CT("ad_source_type")
    public int adSourceType;

    @C09CT("style_action")
    public AdStyleActionModel adStyleActionModel;

    @C09CT("ad_tag_position")
    public int adTagPosition;

    @C09CT("recommendation_tags")
    public List<Object> adTags;

    @C09CT("top_icon_list")
    public UrlModel adTopIcon;

    @C09CT("ad_type")
    public int adType;

    @C09CT("ad_url_type")
    public int adUrlType;

    @C09CT("advertiser_id")
    public String advId;

    @C09CT("aggregation_sdk")
    public AggregationSdk aggregationSdk;

    @C09CT("allow_dsp_autojump")
    public boolean allowDspAutoJump;

    @C09CT("amazon_data")
    public AmazonCheckoutAdModel amazonCheckoutData;

    @C09CT("anchor_ad_info")
    public AnchorInfoStruct anchorAdInfo;

    @C09CT("anchor_click_type")
    public int anchorClickType;

    @C09CT("animation_type")
    public int animationType;

    @C09CT("app_category")
    public String appCategory;

    @C09CT("app_data")
    public String appData;

    @C09CT("app_like")
    public String appLike;

    @C09CT("author_supports_auto_message")
    public boolean authorSupportsAutoMessage;

    @C09CT("author_url")
    public String authorUrl;

    @C09CT("autofill")
    public AutofillModel autofillModel;

    @C09CT("avatar_icon")
    public UrlModel avatarIcon;

    @C09CT("avatar_url")
    public String avatarUrl;

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("browser_config")
    public BrowserConfig browserConfig;

    @C09CT("button_font_size")
    public int buttonFontSize;

    @C09CT("button_height")
    public int buttonHeight;

    @C09CT("button_icon_url")
    public String buttonIcon;

    @C09CT("button_style")
    public int buttonStyle;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("button_icon_tux_name")
    public String buttonTuxIcon;

    @C09CT("button_type")
    public int buttonType;

    @C09CT("call_to_action_bar")
    public CallToActionBarInfo callToActionBarInfo;

    @C09CT("card_interaction_type")
    public int cardInteractionType;

    @C09CT("carousel_color_info")
    public AdCarouselColorInfo carouselColorInfo;

    @C09CT("web_channel_name")
    public String channelName;

    @C09CT("click_id")
    public String clickId;

    @C09CT("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @C09CT("comment_area_switch")
    public boolean commentAreaSwitch;

    @C09CT("comment_extra")
    @C09CS(JsonToStringAdapter.class)
    public String commentExtra;

    @C09CT("ace_layer")
    public CommerceAceSurveyInfo commerceAceSurveyInfo;

    @C09CT("component_type")
    public int componentType;

    @C09CT("consult_url")
    public String consultUrl;

    @C09CT("context_track_url_list")
    public UrlModel contextTrack;

    @C09CT("description")
    public String description;

    @C09CT("detail_bottom_banner")
    public DetailBottomBanner detailBottomBanner;

    @C09CT("direct_message_landing_popup")
    public boolean directMessageLandingPopup;

    @C09CT("disable_show_ad_link")
    public boolean disableAdLink;

    @C09CT("disable_ad_show_filter")
    public boolean disableAdShowFilter;

    @C09CT("disable_follow_to_click")
    public int disableFollowToClick;

    @C09CT("disable_like_type")
    public boolean disableLikeType;

    @C09CT("disable_authorpage_button")
    public boolean disableUserprofileAdLabel;

    @C09CT("disclaimer")
    public AdDisclaimer disclaimer;

    @C09CT("dislike_info")
    public AdDislikeInfo dislikeInfo;

    @C09CT("display_type")
    public Long displayType;

    @C09CT("dm_form_card_config")
    public DMFormCardConfig dmFormCardConfig;

    @C09CT("link_data")
    public DouPlusLinkData douPlusLinkData;

    @C09CT("download_url")
    public String downloadUrl;

    @C09CT("dynamic_video")
    public DynamicVideo dynamicVideo;

    @C09CT("e_ad_info")
    public String eAdInfo;

    @C09CT("vsa_for_tt_mall")
    public EcUgVSAData ecUgVSAData;

    @C09CT("ecom_card_type")
    public int ecomCardType;

    @C09CT("ecommerce_info")
    public EcommerceInfo ecommerceInfo;

    @C09CT("effective_play_time")
    public Float effectivePlayTime;

    @C09CT("effective_play_track_url_list")
    public UrlModel effectivePlayTrackUrlList;

    @C09CT("enable_click_id_attach")
    public int enableClickIdAttach;

    @C09CT("enable_title_click")
    public int enableDescClick;

    @C09CT("enable_favorite_button")
    public boolean enableFavoriteButton;

    @C09CT("enable_full_screen_profile_landing_page")
    public boolean enableFullScreenProfileLandingPage;

    @C09CT("enable_icon_under_avatar")
    public boolean enableIconUnderAvatar;

    @C09CT("enable_jump_to_product")
    public int enableJumpToProduct;

    @C09CT("enable_left_slide_guide")
    public boolean enableLeftSlideGuide;

    @C09CT("enable_soft_ad_anchor_click")
    public boolean enableSoftAdAnchorClick;

    @C09CT("enable_video_resume")
    public boolean enableVideoResume;

    @C09CT("enable_web_google_login")
    public boolean enableWebGoogleLogin;

    @C09CT("enable_web_report")
    public boolean enableWebReport;

    @C09CT("enter_from_merge")
    public String enterFromMerge;

    @C09CT("expire_seconds")
    public Long expireSeconds;

    @C09CT("external_type")
    public int externalType;

    @C09CT("extra_effective_play_action")
    public int extraEffectivePlayAction;

    @C09CT("fake_author")
    public FakeAuthor fakeAuthor;

    @C09CT("features")
    public FeatureCenterModel feature;

    @C09CT("feature_label")
    public String featureLabel;

    @C09CT("featured_label")
    public List<AwemeTextLabelModel> featuredLabel;

    @C09CT("follower_label")
    public AwemeTextLabelModel followerLabel;

    @C09CT("form_height")
    public int formHeight;

    @C09CT("form_url")
    public String formUrl;

    @C09CT("form_width")
    public int formWidth;

    @C09CT("frontend_data")
    public Object frontendData;

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT("get_ad_status")
    public int getAdStatus;

    @C09CT("get_ad_time")
    public int getAdTime;

    @C09CT("has_default_conversation")
    public boolean hasDefaultConversation;

    @C09CT("hide_if_exists")
    public int hideIfExists;

    @C09CT("hide_web_button")
    public boolean hideWebButton;

    @C09CT("high_light_color")
    public String highLightColor;

    @C09CT("high_light_position")
    public List<Object> highLightPosition;

    @C09CT("homepage_bottom_textual")
    public String homepageBottomTextual;

    @C09CT("iab_auto_jump_allow_list")
    public List<String> iabAutoJumpAllowList;

    @C09CT("icon_image_list")
    public List<UrlModel> iconImageList;

    @C09CT("image_list")
    public List<UrlModel> imageList;

    @C09CT("image_url")
    public UrlModel imageUrl;

    @C09CT("incentive_info")
    public String incentiveInfo;

    @C09CT("indicator_data")
    public IndicatorData indicatorData;

    @C09CT("insert_ad")
    public boolean insertAd;

    @C09CT("instance_phone_id")
    public long instancePhoneId;

    @C09CT("interaction_seconds")
    public int interactionSeconds;

    @C09CT("interesting_play")
    public AwemePlayFunModel interestingPlay;

    @C09CT("interstitial_ad_info")
    public InterstitialAdInfo interstitialAdInfo;

    @C09CT("is_ad4ad")
    public boolean isAd4ad;

    @C09CT("is_amazon_ad")
    public Boolean isAmazonAd;

    @C09CT("is_dsp")
    public boolean isDsp;

    @C09CT("from_search")
    public boolean isFromSearch;

    @C09CT("hide_music_disc")
    public boolean isHideMusicDisk;

    @C09CT("is_open_url_support_pull_up")
    public boolean isOpenUrlSupportPullUp;

    @C09CT("is_preview")
    public boolean isPreview;

    @C09CT("is_promote_page")
    public boolean isPromotePage;

    @C09CT("is_soft_ad")
    public boolean isSoftAd;

    @C09CT("item_id")
    public String itemId;

    @C09CT("js_actlog_url")
    public String jsActLogUrl;

    @C09CT("label")
    public AwemeTextLabelModel label;

    @C09CT("landing_page_config")
    public LandingPageConfig landingPageConfig;

    @C09CT("landing_page_info")
    public String landingPageInfo;

    @C09CT("landingpage_network_optimization")
    public LandingPageNetworkOptimization landingPageNetworkOptimization;

    @C09CT("landing_page_survey")
    public LandingPageSurveyModel landingPageSurvey;

    @C09CT("learn_more_bg_color")
    public String learnMoreBgColor;

    @C09CT("left_slide_click_time")
    public int leftSlideClickDuration;

    @C09CT("left_slide_click_type")
    public int leftSlideClickType;

    @C09CT("left_slide_guide_config")
    public LeftSlideGuideConfig leftSlideGuideConfig;

    @C09CT("left_slide_middle_page_model")
    public LeftSlideMiddlePageModel leftSlideMiddlePageModel;

    @C09CT("light_web_url")
    public String lightWebUrl;

    @C09CT("link_label")
    public AwemeLinkLabel linkLabel;

    @C09CT("live_ad_type")
    public int liveAdType;

    @C09CT("live_card_incentive_info")
    public Object liveCardIncentiveInfo;

    @C09CT("live_room")
    public int liveRoom;

    @C09CT("lynx_button_position")
    public int lynxButtonPosition;

    @C09CT("template_url")
    public String lynxButtonUrl;

    @C09CT("lynx_entry_data")
    public AdLynxEntryData lynxEntryData;

    @C09CT("lynx_raw_data")
    @C09CS(JsonToStringAdapter.class)
    public String lynxRawData;

    @C09CT("download_mode")
    public int mDownloadMode;

    @C09CT("auto_open")
    public int mLinkMode;

    @C09CT("support_multiple")
    public int mSupportMultiple;

    @C09CT("mask_form_style")
    public int maskFormStyle;

    @C09CT("mp_url")
    public String microAppUrl;

    @C09CT("mini_card")
    public MiniCardModel miniCardModel;

    @C09CT("native_author")
    public NativeAuthorInfo nativeAuthor;

    @C09CT("native_card_info")
    public NativeCardInfo nativeCardInfo;

    @C09CT("native_header")
    public String nativeHeader;

    @C09CT("native_site_ad_info")
    public String nativeSiteAdInfo;

    @C09CT("native_site_config")
    public NativeSiteConfig nativeSiteConfig;

    @C09CT("native_site_custom_data")
    public String nativeSiteCustomData;

    @C09CT("non_native_click")
    public int nonNativeClick;

    @C09CT("notification_config")
    public int notificationConfig;

    @C09CT("vast")
    public OmVast omVast;

    @C09CT("onsite_click_id")
    public String onsiteClickId;

    @C09CT("open_system_browser")
    public boolean openSystemBrowser;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("origin_price")
    public String originPrice;

    @C09CT("original_web_url")
    public String originalWebUrl;

    @C09CT("outflow_button_style")
    public int outFlowButtonStyle;

    @C09CT("overlay_native_config")
    public OverlayNativeConfig overlayNativeConfig;

    @C09CT("package")
    public String packageName;

    @C09CT("page_id")
    public String pageId;

    @C09CT("phone_key")
    public String phoneKey;

    @C09CT("phone_number")
    public String phoneNumber;

    @C09CT("photo_carousel_info")
    public PhotoCarouselInfoStruct photoCarouselInfo;

    @C09CT("long_text_format_type")
    public int photoLongTextFormatType;

    @C09CT("playover_track_url_list")
    public UrlModel playOverTrackUrlList;

    @C09CT("play_track_url_list")
    public UrlModel playTrackUrlList;

    @C09CT("pop_ups")
    public boolean popUps;

    @C09CT("pos_max_delta")
    public int posMaxDelta;

    @C09CT("position")
    public int position;

    @C09CT("preload_ad_expire_timestamp")
    public Long preloadAdExpireTimestamp;

    @C09CT("preload_data")
    public PreloadData preloadData;

    @C09CT("preload_extra_web")
    public int preloadExtraWeb;

    @C09CT("preload_web")
    public int preloadWeb;

    @C09CT("preload_web_new")
    public int preloadWebNew;

    @C09CT("preload_web_second_page")
    public int preloadWebSecondPage;

    @C09CT("price")
    public String price;

    @C09CT("product_tile")
    public AdProductTile productTile;

    @C09CT("profile_with_webview")
    public int profileWithWebview;

    @C09CT("promote_page")
    public PromotePageModel promotePageModel;

    @C09CT("promotion_label")
    public String promotionLabel;

    @C09CT("quick_app_url")
    public String quickAppUrl;

    @C09CT("recommend_extra")
    public String recommendExtra;

    @C09CT("recommend_title")
    public String recommendTitle;

    @C09CT("red_mp_url")
    public String redMpUrl;

    @C09CT("red_open_url")
    public String redOpenUrl;

    @C09CT("red_url")
    public String redUrl;

    @C09CT("report_ad_type")
    public int reportAdType;

    @C09CT("report_enable")
    public boolean reportEnable;

    @C09CT("req_id")
    public String reqId;

    @C09CT("rit")
    public int rit;

    @C09CT("roll_type")
    public int rollType;

    @C09CT("schema_name")
    public String schemaName;

    @C09CT("search")
    public AwemeSearchAdModel searchAdInfo;

    @C09CT("shake")
    public ShakeModel shakeModel;

    @C09CT("shop_ad_data")
    public String shopAdData;

    @C09CT("shopify_data")
    public ShopifyCheckoutEntity shopifyData;

    @C09CT("should_web_url_jump_third_app")
    public boolean shouldWebUrlJumpThirdApp;

    @C09CT("show_ad_after_interaction")
    public boolean showAdAfterInteraction;

    @C09CT("show_button_color_seconds")
    public int showButtonColorSeconds;

    @C09CT("show_button_seconds")
    public int showButtonSeconds;

    @C09CT("show_label_rows")
    public int showLabelRows;

    @C09CT("show_label_seconds")
    public int showLabelSeconds;

    @C09CT("show_lynx_card")
    public int showLynxCard;

    @C09CT("show_mask_recycle")
    public boolean showMaskRecycle;

    @C09CT("show_mask_times")
    public int showMaskTimes;

    @C09CT("show_outflow_mask_times")
    public int showOutflowMaskTimes;

    @C09CT("show_type")
    public int showType;

    @C09CT("skip_time")
    public int skipTime;

    @C09CT("slide_action")
    public int slideAction;

    @C09CT("slide_back_info")
    public AdPromptInfoModel slideBackInfoModel;

    @C09CT("soft_ad_type")
    public int softAdType;

    @C09CT("source")
    public String source;

    @C09CT("splash_info")
    public AwemeSplashInfo splashInfo;

    @C09CT("sticker_data")
    public AdStickerData stickerData;

    @C09CT("tiktok_page_type")
    public int tiktokPageType;

    @C09CT("title")
    public String title;

    @C09CT("top_title")
    public String topTitle;

    @C09CT("track_url_list")
    public UrlModel trackUrlList;

    @C09CT("ttclid")
    public String ttclid;

    @C09CT("type")
    public String type;

    @C09CT("user_interact_info")
    public AdPromptInfoModel userInteractInfo;

    @C09CT("video")
    public List<Video> videoList;

    @C09CT("video_transpose")
    public Long videoTranspose;

    @C09CT("web_apply_camera")
    public boolean webApplyCamera;

    @C09CT("web_title")
    public String webTitle;

    @C09CT("web_type")
    public int webType;

    @C09CT("web_url")
    public String webUrl;

    @C09CT("webview_pannel_style")
    public int webviewPannelStyle;

    @C09CT("webview_progress_bar")
    public int webviewProgressBar;

    @C09CT("webview_type")
    public int webviewType;

    @C09CT("white_high_light_color")
    public String whiteHighLightColor;

    @C09CT("is_redirect_web_url")
    public Boolean isRedirectWebUrl = Boolean.FALSE;

    @C09CT("disable_left_slide_follow")
    public boolean disableLeftSlideFollow = false;

    @C09CT("app_name")
    public String appName = "";

    @C09CT("button_have_arrow")
    public boolean buttonHaveArrow = true;

    @C09CT("app_install")
    public String appInstall = "";

    @C09CT("landing_page_native_type")
    public int landingPageNativeType = 0;

    @C09DE(deserialize = false, serialize = false)
    public volatile String LL = "";

    @C09DE(deserialize = false, serialize = false)
    public volatile String LLILLJJLI = "";

    @C09DE(deserialize = false, serialize = false)
    public transient boolean LLILLL = false;

    @C09DE(deserialize = false, serialize = false)
    public transient boolean LLILZ = false;

    @C09DE(deserialize = false, serialize = false)
    public transient boolean LLILZIL = false;

    @C09DE(deserialize = false, serialize = false)
    public transient boolean LLILZLL = false;

    @C09DE(deserialize = false, serialize = false)
    public boolean LLIZ = false;

    @C09CT("use_default_color")
    public boolean useDefaultColor = false;

    @C09CT("disable_download_dialog")
    public int disableDownloadDialog = 1;

    @C09CT("native_card_type")
    public int nativeCardType = 0;

    @C09CT("card_interaction_seconds")
    public int cardInteractionSeconds = 0;

    @C09CT("card_infos")
    public Map<String, CardStruct> cardInfos = null;

    @C09CT("enable_filter_same_video")
    public boolean enableFilterSameVideo = true;

    @C09CT("live_icon_url")
    public UrlModel bottomIcon = null;

    @C09CT("preload_h5_type")
    public int preloadH5Type = 0;

    @C09CT("tips_type")
    public int tipsType = 0;

    @C09CT("disable_auto_track_click")
    public boolean disableAutoTrackClick = false;
    public String LLIZLLLIL = "";

    @C09CT("use_ordinary_web")
    public Boolean useOrdinaryWeb = null;

    @C09CT("playback_seconds_track_url")
    public List<Object> playbackSecondsTrackList = new ArrayList();

    @C09CT("carousel_left_guide")
    public int photoModeSlideHint = 2;

    @C09CT("carousel_interaction_optimize_type")
    public int photoModeInteractionOptimizeType = 0;

    @C09CT("skip_ad_time")
    public int skipAdTime = -1;

    @C09CT("show_special_avatar_style")
    public int adAvatarLinkTagStyle = 0;

    @C09CT("is_ack_action")
    public int isAckAction = 0;

    @C09CT("disable_show_link_label")
    public boolean disableShowLinkLabel = false;

    @C09CT("similar_animation")
    public int similarAnimation = 0;

    @C09CT("piv_opt")
    public int pivOpt = 0;

    @C09CT("button_icon_animation_repeat_times")
    public int buttonIconAnimationRepeatTimes = 0;

    @C09CT("about_this_ad_info")
    public AboutAdInfo aboutThisAdInfo = null;

    @C09CT("follow_button")
    public FollowButtonData followButton = null;
    public Map<String, String> LLJI = null;

    @C09DE(deserialize = false, serialize = false)
    public volatile ConcurrentHashMap<String, Object> LLJIJIL = new ConcurrentHashMap<>();

    @C09CT("brand_safety_type")
    public int brandSafetyType = 0;

    public boolean allowJumpToPlayStore() {
        return this.slideAction == 1;
    }

    public boolean canShowLynxBtn2CardAnim() {
        return this.showLynxCard == 1;
    }

    public boolean enableEnterPhotoFullPage() {
        return this.photoLongTextFormatType == 1;
    }

    public String[] getAppCategory() {
        return TextUtils.isEmpty(this.appCategory) ? new String[0] : this.appCategory.split(" ");
    }

    public float getAppLike() {
        if (TextUtils.isEmpty(this.appLike)) {
            return 0.0f;
        }
        return CastFloatProtector.parseFloat(this.appLike);
    }

    public CardStruct getDefaultCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("3")) {
            return null;
        }
        return this.cardInfos.get("3");
    }

    public Float getEffectivePlayTime() {
        Float f = this.effectivePlayTime;
        return (f == null || f.floatValue() <= 0.001f) ? Float.valueOf(3.0f) : this.effectivePlayTime;
    }

    public boolean getEnableDescClick() {
        return this.enableDescClick != 0;
    }

    public String getFetchFrom() {
        return this.LL != null ? this.LL : "";
    }

    public CardStruct getFollowCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("7")) {
            return null;
        }
        return this.cardInfos.get("7");
    }

    public CardStruct getLiveCardInfo() {
        Map<String, CardStruct> map = this.cardInfos;
        if (map == null || !map.containsKey("live_card")) {
            return null;
        }
        return this.cardInfos.get("live_card");
    }

    public String getOriginalWebUrl() {
        String str = this.originalWebUrl;
        return (str == null || str.isEmpty()) ? this.webUrl : this.originalWebUrl;
    }

    public UrlModel getRedImageUrl() {
        List<UrlModel> list = this.iconImageList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (UrlModel) ListProtector.get(this.iconImageList, 0);
    }

    public String getRedirectOriginUrl() {
        return this.isRedirectWebUrl.booleanValue() ? getOriginalWebUrl() : this.webUrl;
    }

    public String getReqId() {
        String str = this.reqId;
        return str == null ? "" : str;
    }

    public String getUniqueId() {
        return this.LLILLJJLI != null ? this.LLILLJJLI : "";
    }

    public boolean isAckAction() {
        return this.isAckAction == 1;
    }

    public boolean isClickTrackUrlListValid() {
        UrlModel urlModel = this.clickTrackUrlList;
        return (urlModel == null || urlModel.getUrlList() == null || this.clickTrackUrlList.getUrlList().isEmpty()) ? false : true;
    }

    public boolean isDisableDownloadDialog() {
        return this.disableDownloadDialog == 1;
    }

    public boolean isHardAd() {
        return this.adSourceType == 1;
    }

    public boolean isHideIfExists() {
        return this.hideIfExists == 1;
    }

    public boolean isImageValid() {
        List<UrlModel> list = this.imageList;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isNewStyleAd() {
        return this.showType == 1;
    }

    public boolean isPhotoModeSlideOptimizeEnable() {
        return this.photoModeInteractionOptimizeType == 1;
    }

    public boolean isPreloadExtraWeb() {
        return this.preloadExtraWeb == 1;
    }

    public boolean isSearchPreciseAd() {
        AwemeSearchAdModel awemeSearchAdModel = this.searchAdInfo;
        return (awemeSearchAdModel == null || awemeSearchAdModel.isPreciseAd() == null || !this.searchAdInfo.isPreciseAd().booleanValue()) ? false : true;
    }

    public boolean isShowPhotoModeSlideHint() {
        return this.photoModeSlideHint == 1;
    }

    public boolean isShowWebViewBottomLynxButton() {
        return (this.lynxButtonPosition & 1) == 1;
    }

    public boolean isSupportMultiple() {
        return this.mSupportMultiple > 0;
    }

    public boolean isVisibleSearchAdsToggle() {
        Integer num;
        AwemeSearchAdModel awemeSearchAdModel = this.searchAdInfo;
        return (awemeSearchAdModel == null || (num = awemeSearchAdModel.searchDeliveryType) == null || num.intValue() != 3) ? false : true;
    }

    public boolean useEffectivePlayAction() {
        return this.extraEffectivePlayAction == 1;
    }

    public JSONObject getFrontendData() {
        try {
            return new JSONObject(C1216604pQ.LIZ().LJIILL(this.frontendData));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public boolean isRightStyle() {
        AwemeTextLabelModel awemeTextLabelModel;
        return (getAdTagPosition() != 2 || (awemeTextLabelModel = this.label) == null || TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) ? false : true;
    }

    public AboutAdInfo getAboutThisAd() {
        return this.aboutThisAdInfo;
    }

    public int getAceSceneType() {
        return this.aceSceneType;
    }

    public Ad4adModel getAd4adModel() {
        return this.ad4adModel;
    }

    public AdAIGCLabel getAdAigcLabel() {
        return this.adAigcLabel;
    }

    public int getAdAvatarLinkTagStyle() {
        return this.adAvatarLinkTagStyle;
    }

    public AdDescriptiveCTAStruct getAdDescriptiveCTA() {
        return this.adDescriptiveCTA;
    }

    public AdDislikeModel getAdDislikeModel() {
        return this.adDislikeModel;
    }

    public AdHintData getAdHintData() {
        return this.adHintData;
    }

    public Long getAdId() {
        return this.adId;
    }

    public AdInteractionData getAdInteractionData() {
        return this.adInteractionData;
    }

    public AdLive getAdLive() {
        return this.adLive;
    }

    public String getAdMoreTextual() {
        return this.adMoreTextual;
    }

    public List<Object> getAdNodeTrackUrlList() {
        return this.adNodeTrackUrlList;
    }

    public AdPaidContent getAdPaidContent() {
        return this.adPaidContent;
    }

    public AdQuestionnaire getAdQuestionnaire() {
        return this.adQuestionnaire;
    }

    public AdRewardData getAdRewardData() {
        return this.adRewardData;
    }

    public int getAdSourceType() {
        return this.adSourceType;
    }

    public AdStyleActionModel getAdStyleActionModel() {
        return this.adStyleActionModel;
    }

    public int getAdTagPosition() {
        return this.adTagPosition;
    }

    public List<Object> getAdTags() {
        return this.adTags;
    }

    public UrlModel getAdTopIcon() {
        return this.adTopIcon;
    }

    public int getAdType() {
        return this.adType;
    }

    public int getAdUrlType() {
        return this.adUrlType;
    }

    public AdWebUrlDataFromJsb getAdWebUrlDataFromJsb() {
        return this.LLJILJIL;
    }

    public String getAdvId() {
        return this.advId;
    }

    public AggregationSdk getAggregationSdk() {
        return this.aggregationSdk;
    }

    public AmazonCheckoutAdModel getAmazonCheckoutData() {
        return this.amazonCheckoutData;
    }

    public AnchorInfoStruct getAnchorAdInfo() {
        return this.anchorAdInfo;
    }

    public int getAnchorClickType() {
        return this.anchorClickType;
    }

    public int getAnimationType() {
        return this.animationType;
    }

    public String getAppData() {
        return this.appData;
    }

    public String getAppInstall() {
        return this.appInstall;
    }

    public String getAppName() {
        return this.appName;
    }

    public boolean getAuthorSupportsAutoMessage() {
        return this.authorSupportsAutoMessage;
    }

    public String getAuthorUrl() {
        return this.authorUrl;
    }

    public AutofillModel getAutofillModel() {
        return this.autofillModel;
    }

    public UrlModel getAvatarIcon() {
        return this.avatarIcon;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public int getBrandSafetyType() {
        return this.brandSafetyType;
    }

    public BrowserConfig getBrowserConfig() {
        return this.browserConfig;
    }

    public int getButtonFontSize() {
        return this.buttonFontSize;
    }

    public int getButtonHeight() {
        return this.buttonHeight;
    }

    public String getButtonIcon() {
        return this.buttonIcon;
    }

    public int getButtonIconAnimationRepeatTimes() {
        return this.buttonIconAnimationRepeatTimes;
    }

    public int getButtonStyle() {
        return this.buttonStyle;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getButtonTuxIcon() {
        return this.buttonTuxIcon;
    }

    public int getButtonType() {
        return this.buttonType;
    }

    public CallToActionBarInfo getCallToActionBarInfo() {
        return this.callToActionBarInfo;
    }

    public Map<String, CardStruct> getCardInfos() {
        return this.cardInfos;
    }

    public int getCardInteractionSeconds() {
        return this.cardInteractionSeconds;
    }

    public int getCardInteractionType() {
        return this.cardInteractionType;
    }

    public AdCarouselColorInfo getCarouselColorInfo() {
        return this.carouselColorInfo;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public String getClickId() {
        return this.clickId;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public String getCommentExtra() {
        return this.commentExtra;
    }

    public CommerceAceSurveyInfo getCommerceAceSurveyInfo() {
        return this.commerceAceSurveyInfo;
    }

    public int getComponentType() {
        return this.componentType;
    }

    public String getConsultUrl() {
        return this.consultUrl;
    }

    public UrlModel getContextTrack() {
        return this.contextTrack;
    }

    public String getDescription() {
        return this.description;
    }

    public DetailBottomBanner getDetailBottomBanner() {
        return this.detailBottomBanner;
    }

    public boolean getDisableAutoTrackClick() {
        return this.disableAutoTrackClick;
    }

    public int getDisableFollowToClick() {
        return this.disableFollowToClick;
    }

    public AdDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public AdDislikeInfo getDislikeInfo() {
        return this.dislikeInfo;
    }

    public Long getDisplayType() {
        return this.displayType;
    }

    public DMFormCardConfig getDmFormCardConfig() {
        return this.dmFormCardConfig;
    }

    public DouPlusLinkData getDouPlusLinkData() {
        return this.douPlusLinkData;
    }

    public int getDownloadMode() {
        return this.mDownloadMode;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DynamicVideo getDynamicVideo() {
        return this.dynamicVideo;
    }

    public String getEAdInfo() {
        return this.eAdInfo;
    }

    public EcUgVSAData getEcUgVSAData() {
        return this.ecUgVSAData;
    }

    public int getEcomCardType() {
        return this.ecomCardType;
    }

    public EcommerceInfo getEcommerceInfo() {
        return this.ecommerceInfo;
    }

    public UrlModel getEffectivePlayTrackUrlList() {
        return this.effectivePlayTrackUrlList;
    }

    public int getEnableClickIdAttach() {
        return this.enableClickIdAttach;
    }

    public boolean getEnableIconUnderAvatar() {
        return this.enableIconUnderAvatar;
    }

    public int getEnableJumpToProduct() {
        return this.enableJumpToProduct;
    }

    public boolean getEnableSoftAdAnchorClick() {
        return this.enableSoftAdAnchorClick;
    }

    public boolean getEnableWebGoogleLogin() {
        return this.enableWebGoogleLogin;
    }

    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    public int getExternalType() {
        return this.externalType;
    }

    public FakeAuthor getFakeAuthor() {
        return this.fakeAuthor;
    }

    public FeatureCenterModel getFeature() {
        return this.feature;
    }

    public String getFeatureLabel() {
        return this.featureLabel;
    }

    public List<AwemeTextLabelModel> getFeaturedLabel() {
        return this.featuredLabel;
    }

    public FollowButtonData getFollowButtonData() {
        return this.followButton;
    }

    public AwemeTextLabelModel getFollowerLabel() {
        return this.followerLabel;
    }

    public int getFormHeight() {
        return this.formHeight;
    }

    public String getFormUrl() {
        return this.formUrl;
    }

    public int getFormWidth() {
        return this.formWidth;
    }

    public List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public int getGetAdStatus() {
        return this.getAdStatus;
    }

    public int getGetAdTime() {
        return this.getAdTime;
    }

    public String getHomepageBottomTextual() {
        return this.homepageBottomTextual;
    }

    public List<String> getIabAutoJumpAllowList() {
        return this.iabAutoJumpAllowList;
    }

    public List<UrlModel> getIconImageList() {
        return this.iconImageList;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getIncentiveInfo() {
        return this.incentiveInfo;
    }

    public IndicatorData getIndicatorData() {
        return this.indicatorData;
    }

    public long getInstancePhoneId() {
        return this.instancePhoneId;
    }

    public AdFeInteractionModel getInteractionFormModel() {
        return this.adFeInteractionModel;
    }

    public int getInteractionSeconds() {
        return this.interactionSeconds;
    }

    public InterstitialAdInfo getInterstitialAdInfo() {
        return this.interstitialAdInfo;
    }

    public String getItemId() {
        return this.itemId;
    }

    public String getJsActLogUrl() {
        return this.jsActLogUrl;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public LandingPageConfig getLandingPageConfig() {
        return this.landingPageConfig;
    }

    public String getLandingPageInfo() {
        return this.landingPageInfo;
    }

    public int getLandingPageNativeType() {
        return this.landingPageNativeType;
    }

    public LandingPageNetworkOptimization getLandingPageNetworkOptimization() {
        return this.landingPageNetworkOptimization;
    }

    public LandingPageSurveyModel getLandingPageSurvey() {
        return this.landingPageSurvey;
    }

    public String getLearnMoreBgColor() {
        return this.learnMoreBgColor;
    }

    public int getLeftSlideClickDuration() {
        return this.leftSlideClickDuration;
    }

    public int getLeftSlideClickType() {
        return this.leftSlideClickType;
    }

    public LeftSlideGuideConfig getLeftSlideGuideConfig() {
        return this.leftSlideGuideConfig;
    }

    public LeftSlideMiddlePageModel getLeftSlideMiddlePageModel() {
        return this.leftSlideMiddlePageModel;
    }

    public String getLightWebUrl() {
        return this.lightWebUrl;
    }

    public AwemeLinkLabel getLinkLabel() {
        return this.linkLabel;
    }

    public int getLinkMode() {
        return this.mLinkMode;
    }

    public int getLiveAdType() {
        return this.liveAdType;
    }

    public Object getLiveCardIncentiveInfo() {
        return this.liveCardIncentiveInfo;
    }

    public String getLiveEnterFromMerge() {
        return this.enterFromMerge;
    }

    public String getLynxButtonUrl() {
        return this.lynxButtonUrl;
    }

    public AdLynxEntryData getLynxEntryData() {
        return this.lynxEntryData;
    }

    public String getLynxRawData() {
        return this.lynxRawData;
    }

    public int getMaskFormStyle() {
        return this.maskFormStyle;
    }

    public String getMicroAppUrl() {
        return this.microAppUrl;
    }

    public MiniCardModel getMiniCardModel() {
        return this.miniCardModel;
    }

    public NativeAuthorInfo getNativeAuthorInfo() {
        return this.nativeAuthor;
    }

    public NativeCardInfo getNativeCardInfo() {
        return this.nativeCardInfo;
    }

    public int getNativeCardType() {
        return this.nativeCardType;
    }

    public String getNativeHeader() {
        return this.nativeHeader;
    }

    public String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public NativeSiteConfig getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public int getNonNativeClick() {
        return this.nonNativeClick;
    }

    public int getNotificationConfig() {
        return this.notificationConfig;
    }

    public OmVast getOmVast() {
        return this.omVast;
    }

    public String getOnsiteClickId() {
        return this.onsiteClickId;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }

    public int getOutFlowButtonStyle() {
        return this.outFlowButtonStyle;
    }

    public OverlayNativeConfig getOverlayNativeConfig() {
        return this.overlayNativeConfig;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPageFrom() {
        return this.LLIZLLLIL;
    }

    public String getPageId() {
        return this.pageId;
    }

    public String getPhoneKey() {
        return this.phoneKey;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PhotoCarouselInfoStruct getPhotoCarouselInfo() {
        return this.photoCarouselInfo;
    }

    public int getPivOption() {
        return this.pivOpt;
    }

    public AwemePlayFunModel getPlayFunModel() {
        return this.interestingPlay;
    }

    public UrlModel getPlayOverTrackUrlList() {
        return this.playOverTrackUrlList;
    }

    public UrlModel getPlayTrackUrlList() {
        return this.playTrackUrlList;
    }

    public List<Object> getPlaybackSecondsTrackList() {
        return this.playbackSecondsTrackList;
    }

    public int getPosMaxDelta() {
        return this.posMaxDelta;
    }

    public int getPosition() {
        return this.position;
    }

    public Long getPreloadAdExpireTimestamp() {
        return this.preloadAdExpireTimestamp;
    }

    public PreloadData getPreloadData() {
        return this.preloadData;
    }

    public int getPreloadH5Type() {
        return this.preloadH5Type;
    }

    public int getPreloadWeb() {
        return this.preloadWeb;
    }

    public int getPreloadWebNew() {
        return this.preloadWebNew;
    }

    public int getPreloadWebSecondPage() {
        return this.preloadWebSecondPage;
    }

    public String getPrice() {
        return this.price;
    }

    public AdProductTile getProductTile() {
        return this.productTile;
    }

    public int getProfileWithWebview() {
        return this.profileWithWebview;
    }

    public PromotePageModel getPromotePageModel() {
        return this.promotePageModel;
    }

    public String getPromotionLabel() {
        return this.promotionLabel;
    }

    public String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public String getRecommendExtra() {
        return this.recommendExtra;
    }

    public String getRedMpUrl() {
        return this.redMpUrl;
    }

    public String getRedOpenUrl() {
        return this.redOpenUrl;
    }

    public String getRedUrl() {
        return this.redUrl;
    }

    public int getReportAdType() {
        return this.reportAdType;
    }

    public int getRit() {
        return this.rit;
    }

    public int getRollType() {
        return this.rollType;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public Map<String, String> getSearchAdExtraParams() {
        return this.LLJI;
    }

    public AwemeSearchAdModel getSearchAdInfo() {
        return this.searchAdInfo;
    }

    public ShakeModel getShakeModel() {
        return this.shakeModel;
    }

    public String getShopAdData() {
        return this.shopAdData;
    }

    public ShopifyCheckoutEntity getShopifyData() {
        return this.shopifyData;
    }

    public boolean getShouldWebUrlJumpThirdApp() {
        return this.shouldWebUrlJumpThirdApp;
    }

    public int getShowButtonColorSeconds() {
        return this.showButtonColorSeconds;
    }

    public int getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public int getShowLabelRows() {
        return this.showLabelRows;
    }

    public int getShowLabelSeconds() {
        return this.showLabelSeconds;
    }

    public int getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public int getShowOutflowMaskTimes() {
        return this.showOutflowMaskTimes;
    }

    public int getSimilarAnimation() {
        return this.similarAnimation;
    }

    public int getSkipAdTime() {
        return this.skipAdTime;
    }

    public int getSkipTime() {
        return this.skipTime;
    }

    public int getSlideAction() {
        return this.slideAction;
    }

    public AdPromptInfoModel getSlideBackInfoModel() {
        return this.slideBackInfoModel;
    }

    public String getSource() {
        return this.source;
    }

    public AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public AdStickerData getStickerData() {
        return this.stickerData;
    }

    public int getTiktokPageType() {
        return this.tiktokPageType;
    }

    public int getTipsType() {
        return this.tipsType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopTitle() {
        return this.topTitle;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getTtclid() {
        return this.ttclid;
    }

    public String getType() {
        return this.type;
    }

    public Boolean getUseOrdinaryWeb_() {
        return this.useOrdinaryWeb;
    }

    public AdPromptInfoModel getUserInteractInfo() {
        return this.userInteractInfo;
    }

    public List<Video> getVideoList() {
        return this.videoList;
    }

    public Long getVideoTranspose() {
        return this.videoTranspose;
    }

    public boolean getWebApplyCamera() {
        return this.webApplyCamera;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public int getWebType() {
        return this.webType;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public int getWebviewPannelStyle() {
        return this.webviewPannelStyle;
    }

    public int getWebviewProgressBar() {
        return this.webviewProgressBar;
    }

    public int getWebviewType() {
        return this.webviewType;
    }

    public boolean isAd4ad() {
        return this.isAd4ad;
    }

    public boolean isAllowDspAutoJump() {
        return this.allowDspAutoJump;
    }

    public Boolean isAmazonAd() {
        return this.isAmazonAd;
    }

    public boolean isButtonHaveArrow() {
        return this.buttonHaveArrow;
    }

    public boolean isCTAFirstShown() {
        return this.LLILZLL;
    }

    public boolean isCardOnceClick() {
        return this.LLIZ;
    }

    public boolean isCommentAreaSwitch() {
        return this.commentAreaSwitch;
    }

    public boolean isContextTrackSent() {
        return this.LLJ;
    }

    public boolean isDiableAdShowFilter() {
        return this.disableAdShowFilter;
    }

    public boolean isDirectMessageLandingPopup() {
        return this.directMessageLandingPopup;
    }

    public boolean isDisableAdLink() {
        return this.disableAdLink;
    }

    public boolean isDisableLeftSlideFollow() {
        return this.disableLeftSlideFollow;
    }

    public boolean isDisableLikeType() {
        return this.disableLikeType;
    }

    public boolean isDisableUserprofileAdLabel() {
        return this.disableUserprofileAdLabel;
    }

    public boolean isDsp() {
        return this.isDsp;
    }

    public boolean isEnableFavoriteButton() {
        return this.enableFavoriteButton;
    }

    public boolean isEnableFilterSameVideo() {
        return this.enableFilterSameVideo;
    }

    public boolean isEnableFullScreenProfileLandingPage() {
        return this.enableFullScreenProfileLandingPage;
    }

    public boolean isEnableLeftSlideGuide() {
        return this.enableLeftSlideGuide;
    }

    public boolean isEnableVideoResume() {
        return this.enableVideoResume;
    }

    public boolean isEnableWebGoogleLogin() {
        return this.enableWebGoogleLogin;
    }

    public boolean isEnableWebReport() {
        return this.enableWebReport;
    }

    public boolean isFromSearch() {
        return this.isFromSearch;
    }

    public boolean isHasDefaultConversation() {
        return this.hasDefaultConversation;
    }

    public boolean isHideMusicDisk() {
        return this.isHideMusicDisk;
    }

    public boolean isHideWebButton() {
        return this.hideWebButton;
    }

    public boolean isInsertAd() {
        return this.insertAd;
    }

    public boolean isOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public boolean isOpenUrlSupportPullUp() {
        return this.isOpenUrlSupportPullUp;
    }

    public boolean isPopUps() {
        return this.popUps;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isPromotePage() {
        return this.isPromotePage;
    }

    public boolean isReportEnable() {
        return this.reportEnable;
    }

    public boolean isReportTopviewShown() {
        return this.LLILLL;
    }

    public boolean isReshowAd() {
        return this.LLILZ;
    }

    public boolean isReshowFormat() {
        return this.LLILZIL;
    }

    public Boolean isServerRedirection() {
        return this.isRedirectWebUrl;
    }

    public boolean isShowAdAfterInteraction() {
        return this.showAdAfterInteraction;
    }

    public boolean isUseDefaultColor() {
        return this.useDefaultColor;
    }

    public int softAdType() {
        return this.softAdType;
    }

    public Object getReusableExtraParam(String str) {
        if (TextUtils.isEmpty(str) || this.LLJIJIL == null) {
            return null;
        }
        return this.LLJIJIL.get(str);
    }

    public boolean isTypeOf(String str) {
        return TextUtils.equals(this.type, str);
    }

    public Object removeReusableExtraParam(String str) {
        if (TextUtils.isEmpty(str) || this.LLJIJIL == null) {
            return null;
        }
        return this.LLJIJIL.remove(str);
    }

    public void setAdAigcLabel(AdAIGCLabel adAIGCLabel) {
        this.adAigcLabel = adAIGCLabel;
    }

    public void setAdDescriptiveCTA(AdDescriptiveCTAStruct adDescriptiveCTAStruct) {
        this.adDescriptiveCTA = adDescriptiveCTAStruct;
    }

    public void setAdHintData(AdHintData adHintData) {
        this.adHintData = adHintData;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdLive(AdLive adLive) {
        this.adLive = adLive;
    }

    public void setAdMoreTextual(String str) {
        this.adMoreTextual = str;
    }

    public void setAdPaidContent(AdPaidContent adPaidContent) {
        this.adPaidContent = adPaidContent;
    }

    public void setAdRewardData(AdRewardData adRewardData) {
        this.adRewardData = adRewardData;
    }

    public void setAdTagPosition(int i) {
        this.adTagPosition = i;
    }

    public void setAdTags(List<Object> list) {
        this.adTags = list;
    }

    public void setAdTopIcon(UrlModel urlModel) {
        this.adTopIcon = urlModel;
    }

    public void setAdUrlType(int i) {
        this.adUrlType = i;
    }

    public void setAdWebUrlDataFromJsb(AdWebUrlDataFromJsb adWebUrlDataFromJsb) {
        this.LLJILJIL = adWebUrlDataFromJsb;
    }

    public void setAdvId(String str) {
        this.advId = str;
    }

    public void setAllowDspAutoJump(boolean z) {
        this.allowDspAutoJump = z;
    }

    public void setAnchorAdInfo(AnchorInfoStruct anchorInfoStruct) {
        this.anchorAdInfo = anchorInfoStruct;
    }

    public void setAnimationType(int i) {
        this.animationType = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAutofillModel(AutofillModel autofillModel) {
        this.autofillModel = autofillModel;
    }

    public void setAvatarIcon(UrlModel urlModel) {
        this.avatarIcon = urlModel;
    }

    public void setBrandSafetyType(int i) {
        this.brandSafetyType = i;
    }

    public void setBrowserConfig(BrowserConfig browserConfig) {
        this.browserConfig = browserConfig;
    }

    public void setButtonStyle(int i) {
        this.buttonStyle = i;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setCallToActionBarInfo(CallToActionBarInfo callToActionBarInfo) {
        this.callToActionBarInfo = callToActionBarInfo;
    }

    public void setCardOnceClick(boolean z) {
        this.LLIZ = z;
    }

    public void setCarouselColorInfo(AdCarouselColorInfo adCarouselColorInfo) {
        this.carouselColorInfo = adCarouselColorInfo;
    }

    public void setChannelName(String str) {
        this.channelName = str;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCommentAreaSwitch(boolean z) {
        this.commentAreaSwitch = z;
    }

    public void setContextTrack(UrlModel urlModel) {
        this.contextTrack = urlModel;
    }

    public void setContextTrackSent(boolean z) {
        this.LLJ = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetailBottomBanner(DetailBottomBanner detailBottomBanner) {
        this.detailBottomBanner = detailBottomBanner;
    }

    public void setDiableAdShowFilter(boolean z) {
        this.disableAdShowFilter = z;
    }

    public void setDirectMessageLandingPopup(boolean z) {
        this.directMessageLandingPopup = z;
    }

    public void setDisableAdLink(boolean z) {
        this.disableAdLink = z;
    }

    public void setDisableDownloadDialog(int i) {
        this.disableDownloadDialog = i;
    }

    public void setDisableFollowToClick(int i) {
        this.disableFollowToClick = i;
    }

    public void setDisableLeftSlideFollow(boolean z) {
        this.disableLeftSlideFollow = z;
    }

    public void setDisableUserprofileAdLabel(boolean z) {
        this.disableUserprofileAdLabel = z;
    }

    public void setDisplayType(Long l) {
        this.displayType = l;
    }

    public void setDmFormCardConfig(DMFormCardConfig dMFormCardConfig) {
        this.dmFormCardConfig = dMFormCardConfig;
    }

    public void setDownloadMode(int i) {
        this.mDownloadMode = i;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setDsp(boolean z) {
        this.isDsp = z;
    }

    public void setDynamicVideo(DynamicVideo dynamicVideo) {
        this.dynamicVideo = dynamicVideo;
    }

    public void setEcUgVSAData(EcUgVSAData ecUgVSAData) {
        this.ecUgVSAData = ecUgVSAData;
    }

    public void setEcommerceInfo(EcommerceInfo ecommerceInfo) {
        this.ecommerceInfo = ecommerceInfo;
    }

    public void setEffectivePlayTrackUrlList(UrlModel urlModel) {
        this.effectivePlayTrackUrlList = urlModel;
    }

    public void setEnableFilterSameVideo(boolean z) {
        this.enableFilterSameVideo = z;
    }

    public void setEnableFullScreenProfileLandingPage(boolean z) {
        this.enableFullScreenProfileLandingPage = z;
    }

    public void setEnableLeftSlideGuide(boolean z) {
        this.enableLeftSlideGuide = z;
    }

    public void setExpireSeconds(Long l) {
        this.expireSeconds = l;
    }

    public void setExternalType(int i) {
        this.externalType = i;
    }

    public void setFakeAuthor(FakeAuthor fakeAuthor) {
        this.fakeAuthor = fakeAuthor;
    }

    public void setFeatureLabel(String str) {
        this.featureLabel = str;
    }

    public void setFetchFrom(String str) {
        this.LL = str;
    }

    public void setFollowerLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.followerLabel = awemeTextLabelModel;
    }

    public void setFormHeight(int i) {
        this.formHeight = i;
    }

    public void setFormUrl(String str) {
        this.formUrl = str;
    }

    public void setFormWidth(int i) {
        this.formWidth = i;
    }

    public void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public void setGetAdStatus(int i) {
        this.getAdStatus = i;
    }

    public void setGetAdTime(int i) {
        this.getAdTime = i;
    }

    public void setHasDefaultConversation(boolean z) {
        this.hasDefaultConversation = z;
    }

    public void setHideIfExists(boolean z) {
        this.hideIfExists = z ? 1 : 0;
    }

    public void setHomepageBottomTextual(String str) {
        this.homepageBottomTextual = str;
    }

    public void setIconImageList(List<UrlModel> list) {
        this.iconImageList = list;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setIndicatorData(IndicatorData indicatorData) {
        this.indicatorData = indicatorData;
    }

    public void setInterstitialAdInfo(InterstitialAdInfo interstitialAdInfo) {
        this.interstitialAdInfo = interstitialAdInfo;
    }

    public void setIsCTAFirstShown(boolean z) {
        this.LLILZLL = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setJsActLogUrl(String str) {
        this.jsActLogUrl = str;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLearnMoreBgColor(String str) {
        this.learnMoreBgColor = str;
    }

    public void setLeftSlideGuideConfig(LeftSlideGuideConfig leftSlideGuideConfig) {
        this.leftSlideGuideConfig = leftSlideGuideConfig;
    }

    public void setLightWebUrl(String str) {
        this.lightWebUrl = str;
    }

    public void setLinkMode(int i) {
        this.mLinkMode = i;
    }

    public void setLiveCardInfo(CardStruct cardStruct) {
        if (cardStruct == null) {
            Map<String, CardStruct> map = this.cardInfos;
            if (map != null && map.containsKey("live_card")) {
                this.cardInfos.remove("live_card");
                return;
            }
            return;
        }
        if (this.cardInfos == null) {
            this.cardInfos = new HashMap();
        }
        this.cardInfos.put("live_card", cardStruct);
    }

    public void setMaskFormStyle(int i) {
        this.maskFormStyle = i;
    }

    public void setMicroAppUrl(String str) {
        this.microAppUrl = str;
    }

    public void setMiniCardModel(MiniCardModel miniCardModel) {
        this.miniCardModel = miniCardModel;
    }

    public void setNativeSiteConfig(NativeSiteConfig nativeSiteConfig) {
        this.nativeSiteConfig = nativeSiteConfig;
    }

    public void setOmVast(OmVast omVast) {
        this.omVast = omVast;
    }

    public void setOnsiteClickId(String str) {
        this.onsiteClickId = str;
    }

    public void setOpenSystemBrowser(boolean z) {
        this.openSystemBrowser = z;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setOriginPrice(String str) {
        this.originPrice = str;
    }

    public void setOverlayNativeConfig(OverlayNativeConfig overlayNativeConfig) {
        this.overlayNativeConfig = overlayNativeConfig;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPageFrom(String str) {
        this.LLIZLLLIL = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhotoCarouselInfo(PhotoCarouselInfoStruct photoCarouselInfoStruct) {
        this.photoCarouselInfo = photoCarouselInfoStruct;
    }

    public void setPlayOverTrackUrlList(UrlModel urlModel) {
        this.playOverTrackUrlList = urlModel;
    }

    public void setPlayTrackUrlList(UrlModel urlModel) {
        this.playTrackUrlList = urlModel;
    }

    public void setPopUps(boolean z) {
        this.popUps = z;
    }

    public void setPreloadAdExpireTimestamp(Long l) {
        this.preloadAdExpireTimestamp = l;
    }

    public void setPreloadData(PreloadData preloadData) {
        this.preloadData = preloadData;
    }

    public void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public void setPreloadWebNew(int i) {
        this.preloadWebNew = i;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProductTile(AdProductTile adProductTile) {
        this.productTile = adProductTile;
    }

    public void setProfileWithWebview(int i) {
        this.profileWithWebview = i;
    }

    public void setRecommendExtra(String str) {
        this.recommendExtra = str;
    }

    public void setRedMpUrl(String str) {
        this.redMpUrl = str;
    }

    public void setRedUrl(String str) {
        this.redUrl = str;
    }

    public void setReportAdType(int i) {
        this.reportAdType = i;
    }

    public void setReportTopviewShown(boolean z) {
        this.LLILLL = z;
    }

    public void setReqId(String str) {
        this.reqId = str;
    }

    public void setReshowAd(boolean z) {
        this.LLILZ = z;
    }

    public void setReshowFormat(boolean z) {
        this.LLILZIL = z;
    }

    public void setSearchAdInfo(AwemeSearchAdModel awemeSearchAdModel) {
        this.searchAdInfo = awemeSearchAdModel;
    }

    public void setShopAdData(String str) {
        this.shopAdData = str;
    }

    public void setShowAdAfterInteraction(boolean z) {
        this.showAdAfterInteraction = z;
    }

    public void setShowButtonColorSeconds(int i) {
        this.showButtonColorSeconds = i;
    }

    public void setShowButtonSeconds(int i) {
        this.showButtonSeconds = i;
    }

    public void setShowMaskTimes(int i) {
        this.showMaskTimes = i;
    }

    public void setShowOutflowMaskTimes(int i) {
        this.showOutflowMaskTimes = i;
    }

    public void setSimilarAnimation(int i) {
        this.similarAnimation = i;
    }

    public void setSkipTime(int i) {
        this.skipTime = i;
    }

    public void setSlideAction(int i) {
        this.slideAction = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSplashInfo(AwemeSplashInfo awemeSplashInfo) {
        this.splashInfo = awemeSplashInfo;
    }

    public void setSupportMultiple(int i) {
        this.mSupportMultiple = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUniqueId(String str) {
        if (!TextUtils.isEmpty(this.LLILLJJLI)) {
            return;
        }
        this.LLILLJJLI = str;
    }

    public void setVideoTranspose(Long l) {
        this.videoTranspose = l;
    }

    public void setWebApplyCamera(boolean z) {
        this.webApplyCamera = z;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebType(int i) {
        this.webType = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebviewProgressBar(int i) {
        this.webviewProgressBar = i;
    }

    public void setWebviewType(int i) {
        this.webviewType = i;
    }

    public void addReusableExtraParam(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (this.LLJIJIL == null) {
                this.LLJIJIL = new ConcurrentHashMap<>();
            }
            this.LLJIJIL.put(str, obj);
        }
    }

    public void appendExtraParamInCommercializeSearch(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            if (this.LLJI == null) {
                this.LLJI = new HashMap();
            }
            this.LLJI.put(str, str2);
        }
    }
}
