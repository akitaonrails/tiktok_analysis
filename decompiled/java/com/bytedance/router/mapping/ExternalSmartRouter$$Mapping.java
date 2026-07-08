package com.bytedance.router.mapping;

import com.bytedance.router.IMappingInitializer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ExternalSmartRouter$$Mapping implements IMappingInitializer {
    @Override // com.bytedance.router.IMappingInitializer
    public int getMapSize() {
        return 107;
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void init(Map<String, String> map) {
        map.put("//account/setting/self", "com.ss.android.ugc.aweme.deeplink.actions.AccountSettingAction");
        map.put("//ad_webview", "com.ss.android.ugc.aweme.router.IABRouterAction");
        map.put("//ai_creation/ai_theater", "com.ss.android.ugc.aweme.theater.navigation.AITheaterCreationDeeplinkRouter");
        map.put("//ai_remix/create", "com.ss.android.ugc.aweme.deeplink.actions.AIRemixDeepLinkAction");
        map.put("//aime/creation", "com.ss.android.ugc.aweme.deeplink.actions.AiSelfAction");
        map.put("//aime/creation/result", "com.ss.android.ugc.aweme.deeplink.actions.AiSelfAction");
        map.put("//aime/sideTask/creation/result", "com.ss.android.ugc.aweme.deeplink.actions.AiSelfAction");
        map.put("//aime/style/detail", "com.ss.android.ugc.aweme.deeplink.actions.AiSelfAction");
        map.put("//aime/style/result", "com.ss.android.ugc.aweme.deeplink.actions.AiSelfAction");
        map.put("//aivatar", "com.ss.android.ugc.aweme.deeplink.actions.AIGCProfileAction");
        map.put("//assmusic/category", "com.ss.android.ugc.aweme.deeplink.actions.PlaylistAction");
        map.put("//bulletin_board", "com.ss.android.ugc.aweme.deeplink.actions.BulletinBoardPageAction");
        map.put("//cameo/profile/record", "com.ss.android.ugc.aweme.theater.profile.navigation.AITheaterProfileDeeplinkRouter");
        map.put("//celebration/create", "com.ss.android.ugc.aweme.deeplink.actions.story.CelebrationPushAction");
        map.put("//chatting/message", "com.ss.android.ugc.aweme.deeplink.actions.OpenChatPageAction");
        map.put("//collection/detail", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailAction");
        map.put("//creator_lynxview", "com.ss.android.ugc.aweme.deeplink.actions.CreatorToolAction");
        map.put("//drama/tab", "com.ss.android.ugc.aweme.series.deeplink.DramaTabAction");
        map.put("//dual_device", "com.ss.android.ugc.aweme.deeplink.actions.GameDualDeviceAction");
        map.put("//ec/bnpl/middle", "com.ss.android.ugc.aweme.deeplink.actions.EcBnplMiddleAction");
        map.put("//ec/lynxview", "com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router.EcUgDeeplinkAction");
        map.put("//ec/webview", "com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router.EcUgDeeplinkAction");
        map.put("//favorite/videos/collections/content", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailAction");
        map.put("//feed", "com.ss.android.ugc.aweme.deeplink.actions.FeedAction");
        map.put("//friends_tab", "com.ss.android.ugc.aweme.deeplink.actions.OpenFriendsFeedAction");
        map.put("//gec/search", "com.ss.android.ugc.aweme.ecommerce.search.deeplink.ECSearchDeeplinkAction");
        map.put("//growth_activity_dialog/IT_Referral", "com.ss.android.ugc.aweme.deeplink.actions.MoneyGrowthAction");
        map.put("//im/chat_room", "com.ss.android.ugc.aweme.im.b2c.scheme.IMChatRoomScheme");
        map.put("//im/ssh_friends", "com.ss.android.ugc.aweme.deeplink.actions.OpenSshFriendListAction");
        map.put("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass", "com.ss.android.ugc.aweme.deeplink.actions.RedirectUriReceiverAction");
        map.put("//inapp.tiktokv.com/alliance/creator/tool/create-account-sg-singpass-test", "com.ss.android.ugc.aweme.deeplink.actions.RedirectUriReceiverAction");
        map.put("//incentive/diversion", "com.ss.android.ugc.aweme.specact.touchpoints.deeplink.DiversionAction");
        map.put("//live/pcs_unify", "com.ss.android.ugc.aweme.deeplink.actions.LivePCSUnifyAction");
        map.put("//live/subonlylive", "com.ss.android.ugc.aweme.deeplink.actions.SubscriptionOnlyAction");
        map.put("//live/subscription/unique_sku", "com.ss.android.ugc.aweme.deeplink.actions.SubscriptionUniqueSkuAction");
        map.put("//live/subscription_unify", "com.ss.android.ugc.aweme.deeplink.actions.SubscriptionBusinessUnifyAction");
        map.put("//messages/group", "com.ss.android.ugc.aweme.deeplink.actions.OpenChatInviteAction");
        map.put("//minis", "com.ss.android.ugc.aweme.minis.route.deeplink.MinisLinkHandler");
        map.put("//mix/detail", "com.ss.android.ugc.aweme.deeplink.actions.MixVideosAction");
        map.put("//mix_studio", "com.ss.android.ugc.aweme.socialavatar.mixstudio.push.MixStudioReadyAction");
        map.put("//music/auth", "com.ss.android.ugc.aweme.auth.MusicAuthorizationAction");
        map.put("//music_lynxview", "com.ss.android.ugc.aweme.deeplink.actions.music.MusicLynxviewAction");
        map.put("//offline_mode", "com.ss.android.ugc.aweme.deeplink.actions.OfflineModeAction");
        map.put("//openVideoEdit", "com.ss.android.ugc.aweme.deeplink.actions.OpenVideoEditAction");
        map.put("//outreach", "com.ss.android.ugc.aweme.deeplink.actions.OutReachAction");
        map.put("//passkey/wizard/create", "com.ss.android.ugc.aweme.deeplink.actions.PasskeyWizardAction");
        map.put("//pipo/cashier/iab_transition_page", "com.ss.android.ugc.aweme.deeplink.actions.PIPOIABTransitionAction");
        map.put("//pipo/cashier/transition_page", "com.ss.android.ugc.aweme.deeplink.actions.PaymentTransitionAction");
        map.put("//pipo/native/paypal", "com.ss.android.ugc.aweme.pipo.payments.braintree.PayPalTransitionAction");
        map.put("//pipopay/payin_checkout", "com.ss.android.ugc.aweme.biz.bnpl.biz.checkout.CheckoutAction");
        map.put("//pipopay/payin_checkout_bind", "com.ss.android.ugc.aweme.biz.bnpl.biz.checkout.CheckoutAction");
        map.put("//pipopay/payin_pi_management", "com.ss.android.ugc.aweme.biz.bnpl.biz.checkout.PIManagementAction");
        map.put("//poi/add_poi_campaign/main", "com.ss.android.ugc.aweme.deeplink.actions.PoiCampaignAction");
        map.put("//poi/claim", "com.ss.android.ugc.aweme.deeplink.actions.PoiClaimAction");
        map.put("//poi/detail", "com.ss.android.ugc.aweme.deeplink.actions.PoiDetailAction");
        map.put("//previewDraftVideo", "com.ss.android.ugc.aweme.preview.WebPreviewAction");
        map.put("//privacy/setting/ad_personalization", "com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalityLinkAction");
        map.put("//profile", "com.ss.android.ugc.aweme.deeplink.actions.UserProfileAction");
        map.put("//profile/followerlist", "com.ss.android.ugc.aweme.deeplink.actions.ProfileFollowerListAction");
        map.put("//profile/viewer", "com.ss.android.ugc.aweme.deeplink.actions.ProfileViewerAction");
        map.put("//push-setting", "com.ss.android.ugc.aweme.deeplink.actions.PushSettingsAction");
        map.put("//push_setting_notification_choice", "com.ss.android.ugc.aweme.deeplink.actions.LivePushSettingsAction");
        map.put("//qna/detail/", "com.ss.android.ugc.aweme.deeplink.actions.QnAAction");
        map.put("//revenue/subscription/invitation", "com.ss.android.ugc.aweme.deeplink.actions.OpenSubscribeInviteAction");
        map.put("//search/search_pov_landing_page", "com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.share.SearchPovCardLandingPageLinkAction");
        map.put("//session_complete", "com.ss.android.ugc.aweme.passkey.AdActTransitionAction");
        map.put("//setting", "com.ss.android.ugc.aweme.deeplink.actions.OpenSettingAction");
        map.put("//setting/security", "com.ss.android.ugc.aweme.deeplink.actions.SecuritySettingAction");
        map.put("//settings/music/auth", "com.ss.android.ugc.aweme.deeplink.actions.music.MusicSettingAuthAction");
        map.put("//share/ttn_content", "com.ss.android.ugc.aweme.deeplink.actions.TTNContentShareLinkAction");
        map.put("//shortcut/proxy", "com.ss.android.ugc.aweme.deeplink.actions.ShortcutLinkAction");
        map.put("//shortdrama/episode", "com.ss.android.ugc.aweme.series.deeplink.DramaInnerFeedAction");
        map.put("//spark/intro", "com.ss.android.ugc.aweme.deeplink.actions.PhotoSparkIntroAction");
        map.put("//startTemplatePreview", "com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateFeedAction");
        map.put("//startUseTemplate", "com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.TemplateUseAction");
        map.put("//startWWAAddYoursCampaign", "com.ss.android.ugc.aweme.deeplink.actions.internal.WWACampaignAction");
        map.put("//story/highlight", "com.ss.android.ugc.aweme.deeplink.actions.StoryHighlightsDetailAction");
        map.put("//streak/invite", "com.ss.android.ugc.aweme.deeplink.actions.OpenStreakInviteAction");
        map.put("//studio/ai_video_tool", "com.ss.android.ugc.aweme.aigc.aiplayground.navigate.AIVideoToolLinkAction");
        map.put("//studio/aigc", "com.ss.android.ugc.aweme.deeplink.actions.OpenAIGCEditAction");
        map.put("//studio/aigc/notify", "com.ss.android.ugc.aweme.aigc.AIGCNotifyDeepLinkAction");
        map.put("//studio/aigc/quota_refresh", "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoCreateAction");
        map.put("//studio/editor_pro", "com.ss.android.ugc.aweme.deeplink.actions.EditorProLinkAction");
        map.put("//tako/host", "com.ss.android.ugc.aweme.deeplink.actions.TakoChatAction");
        map.put("//third-party-oauth-redirect/commerce/buy-with-amazon", "com.ss.android.ugc.aweme.deeplink.actions.commerce.BuyWithAmazonAuthAction");
        map.put("//third-party-oauth-redirect/music/amazon", "com.ss.android.ugc.aweme.deeplink.actions.music.AmazonMusicAuthAction");
        map.put("//third-party-oauth-redirect/music/anghami", "com.ss.android.ugc.aweme.deeplink.actions.music.AnghamiMusicAuthAction");
        map.put("//third-party-oauth-redirect/music/deezer", "com.ss.android.ugc.aweme.deeplink.actions.music.DeezerMusicAuthAction");
        map.put("//third-party-oauth-redirect/music/melon", "com.ss.android.ugc.aweme.deeplink.actions.music.MelonMusicAuthAction");
        map.put("//third-party-oauth-redirect/music/soundcloud", "com.ss.android.ugc.aweme.deeplink.actions.music.SoundCloudMusicAuthAction");
        map.put("//third-party-oauth/music/amazon", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/anghami", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/apple", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/deezer", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/melon", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/soundcloud", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/spotify", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//third-party-oauth/music/youtubemusic", "com.ss.android.ugc.aweme.deeplink.actions.music.ThirdPartyOauthMusicAction");
        map.put("//tt_as_camera", "com.ss.android.ugc.aweme.deeplink.actions.GamePhoneAsCameraAction");
        map.put("//ucenter_web/deeplink/account/risk_notification", "com.ss.android.ugc.aweme.deeplink.actions.RiskNotificationAction");
        map.put("//ucenter_web/deeplink/email_verification", "com.ss.android.ugc.aweme.deeplink.actions.EmailVerificationAction");
        map.put("//user/imfans", "com.ss.android.ugc.aweme.deeplink.actions.ImFansAction");
        map.put("//user/recommend/push", "com.ss.android.ugc.aweme.deeplink.actions.UserRecommendAction");
        map.put("//user/social_avatar/edit/first_time", "com.ss.android.ugc.aweme.deeplink.actions.SocialAvatarReadyAction");
        map.put("//v2/authorize", "com.ss.android.ugc.aweme.deeplink.actions.AuthorizationAction");
        map.put("//webcast_game_detail", "com.ss.android.ugc.aweme.deeplink.actions.WebcastGameDetailAction");
        map.put("//webcast_rank_dialog", "com.ss.android.ugc.aweme.deeplink.actions.LiveOfflineRankAction");
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void initInterceptorMap(Map<String, List<String>> map) {
    }

    @Override // com.bytedance.router.IMappingInitializer
    public void initVersionMap(Map<String, String> map) {
    }
}
