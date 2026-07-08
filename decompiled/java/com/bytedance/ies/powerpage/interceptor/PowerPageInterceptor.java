package com.bytedance.ies.powerpage.interceptor;

import X.C1074030e3V;
import X.C1074050e3X;
import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes36.dex */
public class PowerPageInterceptor implements IInterceptor {
    public final HashMap<String, String> LL;

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public PowerPageInterceptor() {
        HashMap<String, String> map = new HashMap<>();
        this.LL = map;
        map.put("//Post-push-setting", "com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsFragment");
        map.put("//about_activity", "com.ss.android.ugc.aweme.setting.page.about.AboutPage");
        map.put("//account/2sv_upsell", "com.ss.android.ugc.aweme.account.loginapproval.TwoStepPromoteFragment");
        map.put("//account/device_approval", "com.ss.android.ugc.aweme.account.loginapproval.ConfirmLoginPageFragment");
        map.put("//account/login/qrCodeVerify", "com.ss.android.ugc.aweme.account.login.auth.ui.login.QRCodeLoginVerifyFragment");
        map.put("//account/org_accounts", "com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment");
        map.put("//add_yours/hub", "com.ss.android.ugc.tiktok.addyours.hub.AddYoursHubFragment");
        map.put("//ads/preview", "com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment");
        map.put("//ai_portrait/detail", "com.ss.android.ugc.aweme.aiportrait.detail.AIPortraitDetailFragment");
        map.put("//ai_remix/create", "com.ss.android.ugc.airemix.impl.fragment.AIRemixFragment");
        map.put("//aigc/style", "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseStyleFragment");
        map.put("//airemix/chat_list/fullpage", "com.ss.android.ugc.airemix.impl.fragment.AIRemixChatListInFullPageFragment");
        map.put("//aiuikit/image_preview", "com.ss.android.ugc.aweme.aiuikit.impl.imagepreview.ImagePreviewFragment");
        map.put("//aivatar/avatar", "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseAvatarFragment");
        map.put("//aivatar/intro/v2", "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragmentV2");
        map.put("//aivatar/progress", "com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressFragment");
        map.put("//ame/cover_edit", "com.bytedance.effectcreatormobile.creatortiktok.cover.AMECoverEditFragment");
        map.put("//anchor/link", "com.ss.android.ugc.aweme.anchor.AddAnchorFragment");
        map.put("//authmanagement", "com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
        map.put("//bnpl/bill/detail", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.detail.DetailsFragment");
        map.put("//bnpl/bill/homepage", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.home.BillHomeFragment");
        map.put("//bnpl/bill/limit_increase_result", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.limit.LimitIncreaseResultFragment");
        map.put("//bnpl/bill/list", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.statements.StatementsTabFragment");
        map.put("//bnpl/bill/repayment", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.RepaymentFragment");
        map.put("//bnpl/bill/repayment_prepare", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.RepaymentPrepareFragment");
        map.put("//bnpl/bill/result", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.result.RepaymentRetFragment");
        map.put("//bnpl/entry", "com.ss.android.ugc.aweme.biz.bnpl.biz.entry.BNPLEntryFragment");
        map.put("//bnpl/independent_sign_agreement", "com.ss.android.ugc.aweme.biz.bnpl.biz.credit.agreement.IndependentSignAgreementFragment");
        map.put("//bnpl/onboarding/collect_mobile_from_tt", "com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTFragment");
        map.put("//bnpl/onboarding/intro", "com.ss.android.ugc.aweme.biz.bnpl.biz.credit.landing.LandingFragment");
        map.put("//bnpl/onboarding/landing", "com.ss.android.ugc.aweme.biz.bnpl.biz.credit.landing.LandingContainerFragment");
        map.put("//bnpl/onboarding/step", "com.ss.android.ugc.aweme.biz.bnpl.biz.credit.progress.ProgressFragment");
        map.put("//bnpl/onboarding/tel", "com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment");
        map.put("//bulletin_board", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment");
        map.put("//change_account_region/kr_terms_conditions", "com.ss.android.ugc.aweme.compliance.consent.termsconditions.changeregion.ChangeAccountRegionTermsConditionsPage");
        map.put("//chatcontrol/setting/keywords", "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.RiskyKeywordsSettingFragment");
        map.put("//collection/collaborative/list", "com.ss.android.ugc.aweme.favorites.business.collection.collaborative.CollaborativeCollectionListFragment");
        map.put("//collection/detail", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment");
        map.put("//compliance/privacy_highlights_for_teens_feed", "com.ss.android.ugc.aweme.compliance.privacy.phl.feed.PhlFeedFragment");
        map.put("//content_preferences/manage_topics", "com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentPage");
        map.put("//content_preferences/personalized_feeds", "com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedfeed.PersonalizedFeedsPage");
        map.put("//content_preferences/personalized_search", "com.ss.android.ugc.aweme.compliance.business.contentpreferences.personalizedsearch.PersonalizedSearchPage");
        map.put("//contentpreference", "com.ss.android.ugc.aweme.compliance.business.contentpreferences.ContentPreferencesPage");
        map.put("//creativetool/detail", "com.ss.android.ugc.aweme.creativedetail.CreativeToolDetailFragment");
        map.put("//creator_care_mode/simplify_settings", "com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.CreatorCareModeNewDesignFragment");
        map.put("//creatorcenter", "com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment");
        map.put("//creatorcenter/settings", "com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterSettingsFragment");
        map.put("//creatorstudioinapp", "com.ss.android.ugc.aweme.creatorcenter.fragment.CreatorCenterFragment");
        map.put("//display/caption/setting_compose", "com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionComposePage");
        map.put("//display/setting", "com.ss.android.ugc.trill.setting.DisplaySettingPage");
        map.put("//do_not_translate/language/setting", "com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage");
        map.put("//do_not_translate/language/settingv2", "com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2");
        map.put("//effect/featurevideo/awemelist", "com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui.FeatureVideoAwemeListFragment");
        map.put("//favorite", "com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2");
        map.put("//favorite/videos/collections/content", "com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment");
        map.put("//filtercomments/keywords", "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentFilterKeywordsPageV2");
        map.put("//filtercomments/keywords/v1", "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentFilterKeywordsPageV2");
        map.put("//filtercomments/keywords/v2", "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentFilterKeywordsPageV2");
        map.put("//friend/find", "com.ss.android.ugc.aweme.relation.fp.FacebookFriendsPage");
        map.put("//friends/connect_now", "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment");
        map.put("//friends/contact", "com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage");
        map.put("//friends/contacts", "com.ss.android.ugc.aweme.relation.fp.ContactFriendsPage");
        map.put("//friends/facebook", "com.ss.android.ugc.aweme.relation.fp.FacebookFriendsPage");
        map.put("//friends/invite", "com.ss.android.ugc.aweme.relation.fp.InviteFriendsPage");
        map.put("//friends/invite_new", "com.ss.android.ugc.aweme.relation.fp.InviteFriendsPage");
        map.put("//helper_center", "com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage");
        map.put("//highlight/select", "com.ss.android.ugc.aweme.music.highlight.HighlightSelectFragment");
        map.put("//im/aimoji-sunsetting/detail", "com.ss.android.ugc.aweme.im.sticker.df.aimoji.ui.AiMojiSunsettingFragment");
        map.put("//im/b2c/switch_creator_inbox", "com.ss.android.ugc.aweme.inbox.professional.switchcreatorinbox.ui.SwitchCreatorInboxRootFragment");
        map.put("//im/contact_selector", "com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment.ContactSelectorFragment");
        map.put("//im/creation/sticker", "com.ss.android.ugc.aweme.im.sticker.df.creation.IMStickerCreationFragment");
        map.put("//im/detail/audit_request", "com.ss.android.ugc.aweme.detailpage.audit.fragment.AuditRequestFragment");
        map.put("//im/detail/group", "com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.GroupDetailFragment");
        map.put("//im/detail/manage/edit_join_question", "com.ss.android.ugc.aweme.manage.joinquestion.EditJoinQuestionFragment");
        map.put("//im/detail/manage_admin", "com.ss.android.ugc.aweme.detailpage.manageadmin.fragment.ManageAdminFragment");
        map.put("//im/detail/single", "SingleDetailFragment");
        map.put("//im/fan_group_choose_group", "com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment");
        map.put("//im/fan_group_list/self", "com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListSelfFragment");
        map.put("//im/fan_group_list_inner", "com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListFragment");
        map.put("//im/game/challenge/selection", "com.ss.android.ugc.aweme.effects.aigroupshot.selecttemplate.GameEffectTemplateSelectionPanel");
        map.put("//im/game/gamescenter", "com.ss.android.ugc.aweme.interactive.task.minigames.GamesCenterFragment");
        map.put("//im/game/results", "com.ss.android.ugc.aweme.interactive.task.game.result.GameEffectResultPageFragment");
        map.put("//im/game_viewall_page", "com.ss.android.ugc.aweme.interactive.task.minigames.GamesCenterViewAllActivity");
        map.put("//im/group/creation/unified", "com.ss.android.ugc.aweme.groupcreation.fragment.UnifiedGroupCreationFragment");
        map.put("//im/inbox/follower", "com.ss.android.ugc.aweme.inbox.followerv2.InboxFollowerFragmentV2");
        map.put("//im/new/customize/df", "com.ss.android.ugc.aweme.ui.ChatCustomizeFragment");
        map.put("//im/new/detail", "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailFragment");
        map.put("//im/new/detail/change_name", "com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.fragment.EditGroupNameFragment");
        map.put("//im/new/detail/edit_info", "com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo.EditGroupInfoFragment");
        map.put("//im/new/detail/invite_link", "com.ss.android.ugc.aweme.share.invitelink.InviteLinkFragment");
        map.put("//im/new/detail/manage_group", "com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.ManageGroupFragment");
        map.put("//im/notice/sticker_creators", "com.ss.android.ugc.aweme.im.sticker.df.stickerstore.notification.fragment.VideoStickerNotificationFragment");
        map.put("//im/notifacation/result", "com.ss.android.ugc.aweme.notification.v2.NotificationResultFragment");
        map.put("//im/notifacation/tones_settings", "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment");
        map.put("//im/notification_settings", "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationFragment");
        map.put("//im/notification_settings/alert_tones", "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneMsgTypeFragment");
        map.put("//im/notification_settings/permissions", "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationPermissionFragment");
        map.put("//im/public_group_create_inner", "com.ss.android.ugc.aweme.publicgroup.fragment.PublicGroupCreationFragment");
        map.put("//im/public_group_list_inner", "com.ss.android.ugc.aweme.publicgroup.fragment.GroupListFragment");
        map.put("//im/search/detail", "com.ss.android.ugc.aweme.im.ui.IMSearchDetailFragment");
        map.put("//im/search/history", "com.ss.android.ugc.aweme.im.ui.IMHistorySearchFragment");
        map.put("//im/search/media_grid", "com.ss.android.ugc.aweme.im.ui.ChatSearchMediaGridFragment");
        map.put("//im/select/chat/msg", "com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.SelectChatMsgFragment");
        map.put("//im/smart_reply/instructions", "com.ss.android.ugc.aweme.im.ai.impl.smartreply.instruction.SmartReplyInstructionFragment");
        map.put("//im/smart_reply_create_page", "com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation.IMAIBotCreateFragment");
        map.put("//im/ssh_friends", "com.ss.android.ugc.profile.business.ur.following.ui.ProfileMufSshListFragment");
        map.put("//inbox/activity", "com.ss.android.ugc.aweme.notification.creator.NotificationContainerFragment");
        map.put("//live/activity_notification_hub", "com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationFragment");
        map.put("//live/watch_later_history", "com.ss.android.ugc.aweme.live.toplives.watchlater.LiveWatchLaterHistoryFragment");
        map.put("//manage_following", "com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowFragment");
        map.put("//map/position/selection", "com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionFragment");
        map.put("//minis_instant_play_preview", "com.ss.android.ugc.aweme.minis.feed.instantplay.preview.MinisInstantPlayPreviewFragment");
        map.put("//minis_notification/settings", "com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingFragment");
        map.put("//mix/playlist/viewAll", "com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragment");
        map.put("//music/artist/awemelist", "com.ss.android.ugc.aweme.music.artist.ui.ArtistMusicAwemeListFragment");
        map.put("//music/platform/ticketing", "com.ss.android.ugc.aweme.music.addtodsp.setting.page.MusicTicketPlatformSyncPage");
        map.put("//nearby/collect/list", "com.ss.android.ugc.aweme.favorite.NearbyFavoritePOIFragment");
        map.put("//news/anchor_publish", "com.ss.android.ugc.aweme.ogc.news.anchor.producer.NewsAnchorPublishPage");
        map.put("//photomode/explore/preview_light_weight", "com.ss.android.ugc.aweme.explore.common.ExplorePreviewFragment");
        map.put("//pipo/clientaiocr", "com.ss.android.ugc.aweme.clientaiocr.fragment.PipoClientCcdcOcrFragment");
        map.put("//pipo/collect_info_page_step", "com.ss.android.ugc.aweme.component.collect.CollectInfoPageFragment");
        map.put("//pipo/common/blank", "com.ss.android.ugc.aweme.foundation.fragment.CommonBlankFragment");
        map.put("//pipo/creator_wallet/entry", "com.ss.android.ugc.aweme.pipo.bnpl.WalletEntryFragmentDF");
        map.put("//pipo/creator_wallet/entry/real", "com.ss.android.ugc.aweme.biz.wallet.biz.landing.creatorwallet.CreatorWalletLandingFragment");
        map.put("//pipo/gift_card/checkout", "com.ss.android.ugc.aweme.giftcard.checkout.GiftCardCheckoutFragment");
        map.put("//pipo/googlepay", "com.bytedance.pipo.googlepay.pushprovisioning.TokenizeGooglePayFragment");
        map.put("//pipo/infra/error_code_sdk/full_page", "com.ss.android.ugc.aweme.pipo.errorsdk.fragment.ErrorCodeSdkFullFragment");
        map.put("//pipo/native/venmo", "com.ss.android.ugc.aweme.pipo.payments.braintree.VenmoTransitionActivity");
        map.put("//pipo/payment/entry", "com.ss.android.ugc.aweme.home.WalletHomeFragment");
        map.put("//pipo/phone/change", "com.ss.android.ugc.aweme.pipo.bnpl.WalletEntryFragmentDF");
        map.put("//pipo/phone/change/real", "com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingFragment");
        map.put("//pipo/post_payment/action_host", "com.ss.android.ugc.aweme.pipo.postpayment.impl.PostPaymentActionHostFragment");
        map.put("//pipo/qr_code", "com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment");
        map.put("//pipo/recharge", "com.bytedance.pipo.ttpay.recharge.RechargeFragment");
        map.put("//pipo/refund_wallet/entry", "com.ss.android.ugc.aweme.pipo.bnpl.WalletEntryFragmentDF");
        map.put("//pipo/refund_wallet/entry/real", "com.ss.android.ugc.aweme.biz.wallet.biz.landing.refundwallet.RefundWalletLandingFragment");
        map.put("//pipo/stellar_page", "com.bytedance.pipo.stellar.base.page.StellarPageFragment");
        map.put("//pipo/stellarfragment", "com.bytedance.pipo.stellar.base.fragment.StellarFragment");
        map.put("//pipo/veritas/client/idv", "com.ss.android.ugc.aweme.veritas.veritas.fragment.idv.scan.VeritasIDVMainFragment");
        map.put("//pipo/veritas/client/native_camera", "com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraMainFragment");
        map.put("//pipo/veritas/client/selfie", "com.ss.android.ugc.aweme.veritas.veritas.fragment.selfie.scan.VeritasSelfieMainFragment");
        map.put("//pipo/wallet/common_step", "com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepFragment");
        map.put("//pipo/wallet/entry", "com.ss.android.ugc.aweme.pipo.bnpl.WalletEntryFragmentDF");
        map.put("//pipo/wallet/entry/real", "com.ss.android.ugc.aweme.biz.wallet.biz.landing.creatorkyc.CreatorKYCLandingFragment");
        map.put("//pipo/wallet/finish_page", "com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment");
        map.put("//pipo/wallet/openca_sync", "com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncFragment");
        map.put("//pipo/wallet/process_page", "com.ss.android.ugc.aweme.biz.wallet.biz.processpage.ProcessPageFragment");
        map.put("//pipo/wallet/result_page", "com.ss.android.ugc.aweme.biz.wallet.biz.result.WalletAccountResultFragment");
        map.put("//playlist/view_all", "com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragment");
        map.put("//pns/activity_center/biometrics_lock", "com.ss.android.ugc.tiktok.pns.activitycenter.bimetricslock.toggle.ui.ACEntranceUnlockToggleSettingFragment");
        map.put("//pns/breathing_exercise", "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.MeditationExerciseActivity");
        map.put("//pns/fundraiser/page", "com.ss.android.ugc.aweme.compliance.business.fundraiser.native.FundraiserContainerFragment");
        map.put("//pns/white_noise", "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.WhiteNoiseActivity");
        map.put("//poi/add_poi_campaign/main", "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment");
        map.put("//poi/album", "com.ss.android.ugc.aweme.poi.album.PoiAlbumFragment");
        map.put("//poi/album_mix", "com.ss.android.ugc.aweme.poi.albummix.PoiAlbumMixFragment");
        map.put("//poi/creator", "com.ss.android.ugc.aweme.poi.creator.PoiCreatorFragment");
        map.put("//poi/creator/disclaimer", "com.ss.android.ugc.aweme.poi.creator.PoiCreatorDisclaimerFragment");
        map.put("//poi/creator/stores_promote", "com.ss.android.ugc.aweme.poi.creator.PoiCreatorPromoteStoresFragment");
        map.put("//poi/favorite", "com.ss.android.ugc.aweme.favorite.NearbyFavoritePOIFragment");
        map.put("//poi/map", "com.ss.android.ugc.aweme.poi.map.PoiLocationDetailFragment");
        map.put("//poi/order/submit", "com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitSlashFragment");
        map.put("//poi/post", "com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment");
        map.put("//poi/publish/gps/education", "com.ss.android.ugc.aweme.poi.videopublish.PoiPublishGpsEducationFragment");
        map.put("//poi/recommend_feature_detail", "com.ss.android.ugc.aweme.poi.recommendfeature.detail.PoiCategoryFeatureDetailFragment");
        map.put("//poi/recommend_feature_list", "com.ss.android.ugc.aweme.poi.recommendfeature.list.PoiCategoryFeatureListFragment");
        map.put("//poi/requestAweme", "com.ss.android.ugc.aweme.poi.videopublish.retag.PoiRequestAwemeFragment");
        map.put("//poi/review_list", "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListFragment");
        map.put("//poi/search", "com.ss.android.ugc.aweme.poi.search.PoiSearchFragment");
        map.put("//preferred/language/setting", "com.ss.android.ugc.trill.setting.PreferredLanguageSettingPage");
        map.put("//privacy/checkup", "com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupContainerFragment");
        map.put("//privacy/checkup_page", "com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupContainerFragment");
        map.put("//privacy/pause_interactions", "com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.PauseInteractionsPage");
        map.put("//privacy/setting/default", "com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.BasePrivacySettingFragmentV2");
        map.put("//privacy/setting/friends_list", "com.ss.android.ugc.aweme.compliance.privacy.friendlist.SimpleFriendsListPage");
        map.put("//privacy/setting/v2/main", "com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.MainPrivacySettingFragmentV2");
        map.put("//profile/viewer", "com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerFragment");
        map.put("//push-setting", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage");
        map.put("//push_setting_sub_manager_compose", "com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsCommonComposeSubFragment");
        map.put("//qrcodev2", "com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
        map.put("//rss/feed", "com.ss.android.ugc.aweme.rss.feed.ui.RssFeedFragment");
        map.put("//rss/link", "com.ss.android.ugc.aweme.rss.link.ui.RssLinkFragment");
        map.put("//search/search_pov_landing_page", "com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.share.SearchPovCardLandingPageForRouteFragment");
        map.put("//security/ttk_authorized_apps", "com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
        map.put("//setting/about", "com.ss.android.ugc.aweme.setting.page.AboutPage");
        map.put("//setting/accessibility", "com.ss.android.ugc.aweme.setting.page.accessibility.AccessibilitySettingPage");
        map.put("//setting/audience_control", "com.ss.android.ugc.aweme.compliance.audiencecontrol.creator.AudienceControlFragment");
        map.put("//setting/background_audio", "com.ss.android.ugc.aweme.setting.page.backgroundaudio.BackgroundAudioPage");
        map.put("//setting/beta_explain", "com.ss.android.ugc.aweme.setting.ui.beta.BetaExplainPage");
        map.put("//setting/beta_info", "com.ss.android.ugc.aweme.setting.ui.beta.BetaTesterInfoPage");
        map.put("//setting/beta_register_internal", "com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage");
        map.put("//setting/blocklist", "com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage");
        map.put("//setting/datasaver", "com.ss.android.ugc.aweme.setting.page.datasave.DataSaverSettingPage");
        map.put("//setting/diskmanager_compose", "com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerComposePage");
        map.put("//setting/favorite", "com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2");
        map.put("//setting/findcontact", "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage");
        map.put("//setting/lite_mode/learn_more", "com.ss.android.ugc.aweme.setting.page.litemode.LiteModeLearnMorePage");
        map.put("//setting/lite_mode/switch", "com.ss.android.ugc.aweme.setting.page.litemode.LiteModeSwitchPage");
        map.put("//setting/live", "com.ss.android.ugc.aweme.setting.page.LivePage");
        map.put("//setting/playback", "com.ss.android.ugc.aweme.setting.page.playback.PlaybackSettingPage");
        map.put("//setting/reportproblem/detail", "com.ss.android.ugc.trill.feedback.FaqDetailFragment");
        map.put("//setting/reportproblem/home", "com.ss.android.ugc.trill.feedback.CSPFragment");
        map.put("//setting/security", "com.ss.android.ugc.aweme.setting.page.security.SecurityPage");
        map.put("//setting/shortcut", "com.ss.android.ugc.aweme.setting.page.shortcut.ShortcutManagerSettingPage");
        map.put("//setting/support", "com.ss.android.ugc.aweme.setting.page.SupportPage");
        map.put("//setting/theme", "com.ss.android.ugc.aweme.setting.page.theme.ThemeSettingPage");
        map.put("//settings/music", "com.ss.android.ugc.aweme.music.addtodsp.setting.page.MusicSettingPage");
        map.put("//settings/music/auth", "com.ss.android.ugc.aweme.music.addtodsp.setting.page.MusicAuthPlatformsSettingPage");
        map.put("//share/user_qrcode", "com.ss.android.ugc.aweme.share.qrcode.UserQrCodeComposeActivity");
        map.put("//sharedfeed/digg_agg", "com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeFeedDiggDetailFragment");
        map.put("//sharedfeed/intro", "com.ss.android.ugc.aweme.vibefeed.feed.component.VibeFeedInviteFragment");
        map.put("//sharedfeed/like_history", "com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeFeedDiggDetailFragment");
        map.put("//sharedfeed/open", "com.ss.android.ugc.aweme.vibefeed.feed.component.VibeFeedInviteFragment");
        map.put("//social/collab/edit", "com.ss.android.ugc.aweme.ui.page.CollabEditPage");
        map.put("//social/mention/publish", "com.ss.android.ugc.aweme.mention.ui.page.VideoCaptionMentionPanel");
        map.put("//social/nows/archive", "com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveCalendarFragment");
        map.put("//social/nows/archive/feed", "com.ss.android.ugc.aweme.nows.archive.ui.NowArchiveFeedFragment");
        map.put("//social/taglist", "com.ss.android.ugc.aweme.tag.VideoTagPage");
        map.put("//story/archive", "com.ss.android.ugc.aweme.story.archive.StoryArchiveFragment");
        map.put("//story/archive_v2", "com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2Fragment");
        map.put("//suggest/contact", "com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage");
        map.put("//suggest/facebook", "com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage");
        map.put("//tako/bot/center", "com.ss.android.ugc.aweme.tako.ui.TakoBotCenterFragment");
        map.put("//tako/detal/image_preview", "com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewFragment");
        map.put("//tako/settings", "com.ss.android.ugc.aweme.tako.otherpage.settings.ui.TakoSettingsFragment");
        map.put("//third-party-oauth/music", "com.ss.android.ugc.aweme.music.app.auth.addtodsp.auth.ThirdPartyOAuthMusicReceiver");
        map.put("//tns/hidden_accounts", "com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountPage");
        map.put("//tools/mentionvideo/fragment", "com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoFragment");
        map.put("//topic/book", "com.ss.android.ugc.aweme.topic.book.detail.BookDetailPage");
        map.put("//topic/book/info", "com.ss.android.ugc.aweme.topic.book.info.BookInfoPage");
        map.put("//topic/book/search", "com.ss.android.ugc.aweme.topic.book.creator.BookSearchPage");
        map.put("//topic/movie", "com.ss.android.ugc.aweme.topic.movie.detail.MovieDetailPage");
        map.put("//topic/movie/info", "com.ss.android.ugc.aweme.topic.movie.info.MovieInfoPage");
        map.put("//topic/movie/search", "com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchPage");
        map.put("//topic/recommend", "com.ss.android.ugc.aweme.topic.recommend.ui.TopicRecommendSearchPage");
        map.put("//translation/language/setting", "com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage");
        map.put("//trends/video", "com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicFragment");
        map.put("//ttop/iab", "com.ss.android.ugc.aweme.iab.TtopIABActivity");
        map.put("//ttpay/landing", "com.bytedance.pipo.ttpay.landing.WelcomePageFragment");
        map.put("//ttpay/portal", "com.bytedance.pipo.ttpay.portal.TiktokPayFragment");
        map.put("//user/profile", "com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.UserProfileFragment");
        map.put("//usercontact/setting", "com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxSettingPage");
        map.put("//verify_center/change_pin", "com.ss.android.ugc.aweme.component.verify.pin.change.PinChangeFragment");
        map.put("//verify_center/confirm_pin", "com.ss.android.ugc.aweme.component.verify.pin.set.PinConfirmFragment");
        map.put("//verify_center/forget_pin", "com.ss.android.ugc.aweme.component.verify.pin.forgot.PinForgotFragment");
        map.put("//verify_center/offline_pin", "com.ss.android.ugc.aweme.component.verify.pin.offline.PinOfflineFragment");
        map.put("//verify_center/set_pin", "com.ss.android.ugc.aweme.component.verify.pin.set.PinSetFragment");
        map.put("//verify_center/verify_id", "com.ss.android.ugc.aweme.verify.id.IDVerifyFragment");
        map.put("//verify_center/verify_ocr", "com.ss.android.ugc.aweme.verify.ocr.OCRVerifyGuideFragment");
        map.put("//verify_center/verify_ocr_scanner_page", "com.ss.android.ugc.aweme.verify.ocr.OCRScannedFragment");
        map.put("//verify_center/verify_otp", "com.ss.android.ugc.aweme.verify.otp.OtpFragment");
        map.put("//verify_center/verify_pi", "com.ss.android.ugc.aweme.verify.pi.PiVerifyFragment");
        map.put("//verify_center/verify_pin", "com.ss.android.ugc.aweme.verify.pin.PinVerifyFragment");
        map.put("//veritas/idv_welcome", "com.ss.android.ugc.aweme.veritas.veritas.fragment.idv.welcome.VeritasIDVWelcomeFragment");
        map.put("//veritas/selfie_welcome", "com.ss.android.ugc.aweme.veritas.veritas.fragment.idv.welcome.VeritasIDVWelcomeFragment");
        map.put("//video/creation/tail", "com.ss.android.ugc.aweme.im.sticker.df.stickerstore.stickercreation.fragment.VideoCreationTailFragment");
        map.put("//video/sticker", "com.ss.android.ugc.aweme.im.sticker.df.stickerstore.videoselection.fragment.VideoSelectionTabFragment");
        map.put("//webcast_highlight_page", "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment");
        map.put("//webcast_replay_highlight_faq_guide", "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightIntroDialogFragment");
        map.put("//webcast_replay_highlight_intro_guide", "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightGuideDialogFragment");
        map.put("//webcast_replay_list_v2", "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.LiveReplayListV2Fragment");
        map.put("//webcast_replay_setting", "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.LiveReplaySettingPageFragment");
        map.put("//webcast_replay_video", "com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment");
        map.put("aweme://ad_activity_history", "com.ss.android.ugc.aweme.history.AdsActivityHistoryFragment");
        map.put("aweme://add_date_and_location", "com.ss.android.ugc.aweme.ogc.declaration.page.AddDateAndLocationPage");
        map.put("aweme://ai_remix/create", "com.ss.android.ugc.airemix.impl.fragment.AIRemixFragment");
        map.put("aweme://autodubbing/about", "com.ss.android.ugc.aweme.feed.assem.desc.autodubbing.AutoDubbingAboutFragment");
        map.put("aweme://blocklist", "com.ss.android.ugc.aweme.setting.page.privacy.BlackListPage");
        map.put("aweme://ec/shop_message_fragment", "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MsgPageFragment");
        map.put("aweme://ec/shop_tts_message_fragment", "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment");
        map.put("aweme://favorite/videos/collections/add/video", "com.ss.android.ugc.aweme.favorites.business.collection.AddVideosFragment");
        map.put("aweme://im/archive_settings", "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.settings.ArchiveSettingFragment");
        map.put("aweme://inbox/aggregate_detail", "com.ss.android.ugc.aweme.notification.aggnotice.AggregateNoticeFragment");
        map.put("aweme://inbox/archive", "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.InboxArchiveFragment");
        map.put("aweme://inbox/bulletin_board", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment");
        map.put("aweme://inbox/bulletin_board/create", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinProfileEditFragment");
        map.put("aweme://inbox/bulletin_board/invite", "com.ss.android.ugc.aweme.notification.aggregate.BulletinInviteListFragment");
        map.put("aweme://inbox/bulletin_board/member_list", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinMemberListFragment");
        map.put("aweme://inbox/bulletin_board/photo/detail", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinPhotoDetailFragment");
        map.put("aweme://inbox/bulletin_board/post_poll", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinPollCreateFragment");
        map.put("aweme://inbox/bulletin_board/post_text", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinEditFragment");
        map.put("aweme://inbox/bulletin_board/profile", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinProfileFragment");
        map.put("aweme://inbox/bulletin_board/setting_child", "com.ss.android.ugc.aweme.inbox.bulletin.BulletinSettingsChildFragment");
        map.put("aweme://inbox/followers", "com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment");
        map.put("aweme://inbox/merged_activity_followers", "com.ss.android.ugc.aweme.notification.v2.MergedNotificationFragment");
        map.put("aweme://inbox/search", "com.ss.android.ugc.aweme.inbox.search.InboxSearchFragment");
        map.put("aweme://inbox/system_notice", "com.ss.android.ugc.aweme.notification.sysnotice.SystemNotificationContainerFragment");
        map.put("aweme://inbox/system_notice/unsubscribe_setting", "com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeSettingFragment");
        map.put("aweme://inbox/system_notice/unsubscribe_setting_new", "com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeSettingFragmentNew");
        map.put("aweme://inbox/system_notice/unsubscribe_setting_new/detail", "com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeDetailSettingFragment");
        map.put("aweme://inbox/workbench", "com.ss.android.ugc.aweme.inbox.workbench.WorkBenchMainFragment");
        map.put("aweme://inbox/workbench_setting", "com.ss.android.ugc.aweme.inbox.workbench.WorkBenchSettingFragment");
        map.put("aweme://location/permisstion_setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment");
        map.put("aweme://location_services/setting", "com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment");
        map.put("aweme://music/artist/awemelist", "com.ss.android.ugc.aweme.music.artist.ui.ArtistMusicAwemeListFragment");
        map.put("aweme://paidcontent/anchor_collections_selection", "com.ss.android.ugc.aweme.series.serieslist.fragment.SeriesListFragment");
        map.put("aweme://paidcontent/collections", "com.ss.android.ugc.aweme.series.serieslist.fragment.SeriesListFragment");
        map.put("aweme://paidcontent/collections/detail", "com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailFragment");
        map.put("aweme://paidcontent/drama/center", "com.ss.android.ugc.aweme.series.feed.seriescenter.SeriesCenterFragment");
        map.put("aweme://paidcontent/drama/innerfeed_discover_center", "com.ss.android.ugc.aweme.series.feed.seriescenter.InnerFeedDiscoverSeriesCenterFragment");
        map.put("aweme://paidcontent/drama/mylist", "com.ss.android.ugc.aweme.series.feed.mylist.HistoryListFragment");
        map.put("aweme://paidcontent/drama/subscription", "com.ss.android.ugc.aweme.series.vip.fragment.SeriesVipSubscriptionFragment");
        map.put("aweme://paidcontent/promote", "com.ss.android.ugc.aweme.paidcontent.activity.SeriesPromoteFragment");
        map.put("aweme://pipo/refund_wallet/entry/silent", "com.ss.android.ugc.aweme.pipo.bnpl.WalletEntryFragmentDF");
        map.put("aweme://poi/add_poi_campaign/add_location", "com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.MyMomentsAddLocationFragment");
        map.put("aweme://poi/anchordesc", "com.ss.android.ugc.aweme.poi.anchor.tag.PoiTagDescFragment");
        map.put("aweme://poi/claim", "com.ss.android.ugc.aweme.poi.claim.view.PoiClaimFragment");
        map.put("aweme://poi/detail", "com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment");
        map.put("aweme://poi/map_detail", "com.ss.android.ugc.aweme.poi.mapdetail.PoiMapDetailFragment");
        map.put("aweme://poi/map_mode", "com.ss.android.ugc.aweme.poi.mapmode.PoiMapModeFragment");
        map.put("aweme://poi/quiz", "com.ss.android.ugc.aweme.poi.quiz.fragment.PoiQuizFragment");
        map.put("aweme://poi/revisit", "com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment");
        map.put("aweme://profile/bio_mention", "com.ss.android.ugc.aweme.notification.BioMentionListFragment");
        map.put("aweme://push_setting_manager", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage");
        map.put("aweme://saf/poi/detail", "com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment");
        map.put("aweme://search/entity_card/landing", "com.ss.android.ugc.aweme.search.pages.result.entitycard.ui.EntityCardLandingPageFragment");
        map.put("aweme://search/nimble/image_landing", "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingFragment");
        map.put("aweme://search/review_aggregation/landing", "com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.ui.AggregationProsConsCardLandingPageFragment");
        map.put("aweme://settings/lite_mode", "com.ss.android.ugc.aweme.setting.page.litemode.LiteModeSwitchPage");
        map.put("aweme://slash/poi/detail", "com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment");
        map.put("aweme://social_avatar/like/detail", "com.ss.android.ugc.aweme.notification.SocialAvatarLikeListFragment");
        map.put("aweme://user/inbox/follower", "com.ss.android.ugc.aweme.inbox.newfollowerpage.InboxNewFollowerTabFragment");
        map.put("aweme://user/notification", "com.ss.android.ugc.aweme.notification.creator.NotificationContainerFragment");
    }

    public final String LIZ(RouteIntent routeIntent) {
        String strSubstring;
        String str = null;
        if (routeIntent == null) {
            return null;
        }
        String url = routeIntent.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        Uri uri = UriProtector.parse(url);
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                strSubstring = "//" + uri.getAuthority() + uri.getPath();
            } else {
                strSubstring = url;
            }
        } else {
            strSubstring = null;
        }
        String str2 = this.LL.get(strSubstring);
        if (TextUtils.isEmpty(str2) && strSubstring.endsWith("/") && strSubstring.length() > 1) {
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            str2 = this.LL.get(strSubstring);
        }
        if (TextUtils.isEmpty(str2)) {
            Uri uri2 = UriProtector.parse(url);
            if (uri2.isHierarchical()) {
                if (!TextUtils.isEmpty(uri2.getScheme())) {
                    str = uri2.getScheme() + "://" + uri2.getAuthority() + uri2.getPath();
                } else {
                    str = "//" + uri2.getAuthority() + uri2.getPath();
                }
            }
            str2 = this.LL.get(str);
            strSubstring = str;
        }
        if (TextUtils.isEmpty(str2) && strSubstring.endsWith("/") && strSubstring.length() > 1) {
            return this.LL.get(strSubstring.substring(0, strSubstring.length() - 1));
        }
        return str2;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        try {
            return !TextUtils.isEmpty(LIZ(routeIntent));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strLIZ;
        int flags;
        Bundle extras;
        Uri data;
        Intent extra;
        if (context == null || routeIntent == null || routeIntent.getClass() != RouteIntent.class) {
            return false;
        }
        C1074050e3X c1074050e3X = null;
        try {
            try {
                try {
                    strLIZ = LIZ(routeIntent);
                } catch (ClassNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (TextUtils.isEmpty(strLIZ)) {
            return false;
        }
        Class<?> cls = Class.forName(strLIZ);
        if (cls != null && Fragment.class.isAssignableFrom(cls)) {
            if (routeIntent.getExtra() != null) {
                extra = routeIntent.getExtra();
                try {
                    extras = extra.getExtras();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    extras = null;
                }
                data = extra.getData();
                flags = extra.getFlags();
            } else {
                flags = 0;
                extras = null;
                data = null;
                extra = null;
            }
            if (routeIntent.getOnActivityResultCallback() != null) {
                c1074050e3X = new C1074050e3X(routeIntent);
            }
            Intent intentLIZJ = C1074030e3V.LIZ.LIZJ(context, cls, extras, routeIntent.getRequestCode(), c1074050e3X, data, Integer.valueOf(flags));
            if (intentLIZJ != null && extra != null) {
                extra.setComponent(intentLIZJ.getComponent());
                extra.putExtra("power_page_fragment_class_name", cls.getCanonicalName());
                return true;
            }
            return true;
        }
        return false;
    }
}
