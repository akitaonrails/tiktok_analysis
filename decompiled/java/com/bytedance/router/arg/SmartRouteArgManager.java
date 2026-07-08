package com.bytedance.router.arg;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: loaded from: classes36.dex */
public final class SmartRouteArgManager {
    public static final SmartRouteArgManager INSTANCE;
    public static final Map<String, String> clazzToArgClsMap;
    public static final Map<String, String> urlToArgClsMap;

    private final void addClazzToArgClsPair(Map<String, String> map) {
        map.put("com.ss.android.ugc.aweme.anchor.AddAnchorFragment", "com.ss.android.ugc.aweme.anchor.AddAnchorParam");
        map.put("com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.RepaymentFragment", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.model.RepaymentArg");
        map.put("com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.RepaymentPrepareFragment", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.model.RepaymentArg");
        map.put("com.ss.android.ugc.aweme.biz.wallet.biz.processpage.ProcessPageFragment", "com.ss.android.ugc.aweme.biz.wallet.biz.processpage.ProcessPageRouteArg");
        map.put("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailFragment", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment", "com.ss.android.ugc.aweme.component.phone.PhoneRouteArg");
        map.put("com.ss.android.ugc.aweme.component.phone.ttmobile.CollectMobileFromTTFragment", "com.ss.android.ugc.aweme.component.phone.ttmobile.TTPhoneRouteArg");
        map.put("com.ss.android.ugc.aweme.component.verify.pin.set.PinSetFragment", "com.ss.android.ugc.aweme.component.verify.pin.model.PinSetRouteArg");
        map.put("com.ss.android.ugc.aweme.deeplink.UpdateTipActivity", "com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs");
        map.put("com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment", "com.ss.android.ugc.aweme.feed.param.DetailNavArgModel");
        map.put("com.ss.android.ugc.aweme.im.creative.common.impl.framework.IMCreativeContainerActivity", "com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeModel");
        map.put("com.ss.android.ugc.aweme.im.creative.common.impl.framework.IMCreativeTransparentBgContainerActivity", "com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeModel");
        map.put("com.ss.android.ugc.aweme.live.GameBroadcastAsCameraActivity", "com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs");
        map.put("com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivity", "com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs");
        map.put("com.ss.android.ugc.aweme.live.rank.LiveOfflineRankListActivity", "com.ss.android.ugc.aweme.live.rank.OfflineRankActivityArgs");
        map.put("com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity", "com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg");
        map.put("com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistActivity", "com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistActivityArg");
        map.put("com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragment", "com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragmentArg");
        map.put("com.ss.android.ugc.aweme.music.OriginMusicListNewFragment", "com.ss.android.ugc.aweme.music.OriginMusicArg");
        map.put("com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity", "com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
        map.put("com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsPageActivity", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("com.ss.android.ugc.aweme.relation.ffp.ui.FindFriendsTabActivity", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("com.ss.android.ugc.aweme.rss.feed.ui.RssFeedFragment", "com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam");
        map.put("com.ss.android.ugc.aweme.rss.link.ui.RssLinkFragment", "com.ss.android.ugc.aweme.rss.link.models.RssLinkParam");
        map.put("com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.ui.AggregationProsConsCardLandingPageFragment", "com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.ui.AggregationProsConsCardLandingPageNavArg");
        map.put("com.ss.android.ugc.aweme.search.pages.result.entitycard.ui.EntityCardLandingPageFragment", "com.ss.android.ugc.aweme.search.pages.result.entitycard.ui.EntityCardLandingPageNavArg");
        map.put("com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingFragment", "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingPageNavArg");
        map.put("com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.share.SearchPovCardLandingPageForRouteFragment", "com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.share.SearchPovCardLandingPageForRouteNavArg");
        map.put("com.ss.android.ugc.aweme.setting.ui.SettingContainerActivity", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeRvmpFragment", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("com.ss.android.ugc.aweme.veritas.veritas.fragment.idv.scan.VeritasIDVMainFragment", "com.ss.android.ugc.aweme.veritas.veritas.utils.idv.VeritasIdvRouteArg");
        map.put("com.ss.android.ugc.aweme.veritas.veritas.fragment.idv.welcome.VeritasIDVWelcomeFragment", "com.ss.android.ugc.aweme.veritas.veritas.utils.idv.VeritasIdvRouteArg");
        map.put("com.ss.android.ugc.aweme.veritas.veritas.fragment.selfie.scan.VeritasSelfieMainFragment", "com.ss.android.ugc.aweme.veritas.veritas.fragment.selfie.VeritasSelfieRouteArg");
        map.put("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseAvatarFragment", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragmentV2", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcMainActivity", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabActivity", "com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabArgs");
        map.put("com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareActivity", "com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg");
        map.put("com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.UserProfileFragment", "com.ss.android.ugc.profile.platform.framework.aweme.profile.arg.UserProfileArg");
    }

    private final void addUrlToArgClsPair(Map<String, String> map) {
        map.put("//aivatar", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("//aivatar/avatar", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("//aivatar/intro/v2", "com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg");
        map.put("//anchor/link", "com.ss.android.ugc.aweme.anchor.AddAnchorParam");
        map.put("//aweme/challenge/detail", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("//aweme/saf/detail", "com.ss.android.ugc.aweme.feed.param.DetailNavArgModel");
        map.put("//bnpl/bill/repayment", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.model.RepaymentArg");
        map.put("//bnpl/bill/repayment_prepare", "com.ss.android.ugc.aweme.biz.bnpl.biz.bill.repayment.model.RepaymentArg");
        map.put("//bnpl/onboarding/collect_mobile_from_tt", "com.ss.android.ugc.aweme.component.phone.ttmobile.TTPhoneRouteArg");
        map.put("//bnpl/onboarding/tel", "com.ss.android.ugc.aweme.component.phone.PhoneRouteArg");
        map.put("//challenge/detail", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("//challenge/detail_fragment", "com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam");
        map.put("//dual_device", "com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs");
        map.put("//friends/add_friends", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("//friends/ffp", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("//friends/find", "com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg");
        map.put("//im/creative/camera", "com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeModel");
        map.put("//im/creative/camera/transparent", "com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeModel");
        map.put("//main/update_tips", "com.ss.android.ugc.aweme.deeplink.UpdateTipsArgs");
        map.put("//mix/playlist/viewAll", "com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragmentArg");
        map.put("//notice/detail", "com.ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg");
        map.put("//offline_rank_activity", "com.ss.android.ugc.aweme.live.rank.OfflineRankActivityArgs");
        map.put("//origin/music_list", "com.ss.android.ugc.aweme.music.OriginMusicArg");
        map.put("//pipo/veritas/client/idv", "com.ss.android.ugc.aweme.veritas.veritas.utils.idv.VeritasIdvRouteArg");
        map.put("//pipo/veritas/client/selfie", "com.ss.android.ugc.aweme.veritas.veritas.fragment.selfie.VeritasSelfieRouteArg");
        map.put("//pipo/wallet/process_page", "com.ss.android.ugc.aweme.biz.wallet.biz.processpage.ProcessPageRouteArg");
        map.put("//playlist/edit", "com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivityArg");
        map.put("//playlist/manage", "com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistActivityArg");
        map.put("//playlist/view_all", "com.ss.android.ugc.aweme.mix.viewallplaylist.ViewAllPlaylistFragmentArg");
        map.put("//profile/follow_relation", "com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabArgs");
        map.put("//profile/followerlist", "com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabArgs");
        map.put("//rss/feed", "com.ss.android.ugc.aweme.rss.feed.models.RssFeedParam");
        map.put("//rss/link", "com.ss.android.ugc.aweme.rss.link.models.RssLinkParam");
        map.put("//search/search_pov_landing_page", "com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.share.SearchPovCardLandingPageForRouteNavArg");
        map.put("//setting", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("//setting_scoped_compose_fragment", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
        map.put("//tt_as_camera", "com.ss.android.ugc.aweme.live.LiveGameDualDeviceActivityArgs");
        map.put("//user/profile", "com.ss.android.ugc.profile.platform.framework.aweme.profile.arg.UserProfileArg");
        map.put("//user/social_avatar/download", "com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg");
        map.put("//verify_center/set_pin", "com.ss.android.ugc.aweme.component.verify.pin.model.PinSetRouteArg");
        map.put("//veritas/idv_welcome", "com.ss.android.ugc.aweme.veritas.veritas.utils.idv.VeritasIdvRouteArg");
        map.put("//veritas/selfie_welcome", "com.ss.android.ugc.aweme.veritas.veritas.utils.idv.VeritasIdvRouteArg");
        map.put("aweme://search/entity_card/landing", "com.ss.android.ugc.aweme.search.pages.result.entitycard.ui.EntityCardLandingPageNavArg");
        map.put("aweme://search/nimble/image_landing", "com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingPageNavArg");
        map.put("aweme://search/review_aggregation/landing", "com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.ui.AggregationProsConsCardLandingPageNavArg");
        map.put("setting_compose_fragment", "com.ss.android.ugc.aweme.setting.ui.SettingsNewVersionActivityArgs");
    }

    static {
        SmartRouteArgManager smartRouteArgManager = new SmartRouteArgManager();
        INSTANCE = smartRouteArgManager;
        HashMap map = new HashMap();
        clazzToArgClsMap = map;
        HashMap map2 = new HashMap();
        urlToArgClsMap = map2;
        smartRouteArgManager.addUrlToArgClsPair(map2);
        smartRouteArgManager.addClazzToArgClsPair(map);
    }

    private final String getRealRouteUrl(String str) {
        Uri uri = UriProtector.parse(str);
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                return "//" + uri.getAuthority() + uri.getPath();
            }
            return str;
        }
        return null;
    }

    private final String getRouteUrl(String str) {
        Uri uri = UriProtector.parse(str);
        if (uri.isHierarchical()) {
            if (!TextUtils.isEmpty(uri.getScheme())) {
                return uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
            }
            return "//" + uri.getAuthority() + uri.getPath();
        }
        return null;
    }

    public final Class<? extends IRouteArg> getArgClassByClazz(Class<?> cls) {
        try {
            String str = clazzToArgClsMap.get(cls.getName());
            if (str == null) {
                return null;
            }
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Class<? extends IRouteArg> getArgClassByUrl(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String realRouteUrl = getRealRouteUrl(str);
        Map<String, String> map = urlToArgClsMap;
        String str2 = map.get(realRouteUrl);
        if (str2 == null && realRouteUrl != null && u.LJIIZILJ(realRouteUrl, "/", false) && realRouteUrl.length() > 1) {
            realRouteUrl = realRouteUrl.substring(0, realRouteUrl.length() - 1);
            str2 = map.get(realRouteUrl);
        }
        if (str2 == null) {
            realRouteUrl = getRouteUrl(str);
            str2 = map.get(realRouteUrl);
        }
        if (str2 == null && realRouteUrl != null && u.LJIIZILJ(realRouteUrl, "/", false) && realRouteUrl.length() > 1) {
            str2 = map.get(realRouteUrl.substring(0, realRouteUrl.length() - 1));
        }
        if (str2 == null) {
            return null;
        }
        try {
            return Class.forName(str2);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
