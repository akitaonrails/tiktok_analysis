package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AnonymousClass0971;
import X.AnonymousClass0972;
import X.C099Z;
import X.C09A4;
import X.C09AE;
import X.C09AY;
import X.C09I6;
import X.C09IA;
import X.C0CNO;
import X.C0DKC;
import X.C0DL2;
import X.C0HN1;
import X.C0PEM;
import X.C0TTZ;
import X.C0VSJ;
import X.C0XPD;
import X.C1007730cKZ;
import X.C1165500gR2;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C13LP;
import X.C15438062q;
import X.C1622320sJq;
import X.C1697810uHb;
import X.C189200o6;
import X.C19328810je;
import X.C1DFH;
import X.C2018307vR;
import X.C201955140j;
import X.C201967140v;
import X.C20441214yg;
import X.C20600815jK;
import X.C20639615pa;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2166708eH;
import X.C2188811AlT;
import X.C2207008km;
import X.C2243608qg;
import X.C2252611DEt;
import X.C2296808zG;
import X.C23250099c;
import X.C23260099m;
import X.C2399709al;
import X.C2402509bD;
import X.C2501709rD;
import X.C259800zU;
import X.C339800DTu;
import X.C621180OYa;
import X.C699340Rbw;
import X.C786410Ut5;
import X.EnumC2174471A8f;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC20236714Gf;
import X.InterfaceC2024807wU;
import X.InterfaceC23272099y;
import X.RunnableC168400kk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishPkgSizeMonitorAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AccountVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.AnalyticsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.MyQrCodeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.OrdersVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.PrivacyVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ReferralInviteFriendsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SecurityAndPermissionsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.ShareProfileVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.SignUpVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.TiktokPlusVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.cell.WalletVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.CheckUpdateSettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.ClearCacheVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.DataSaverVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LiteModeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LocalLiveWallpaperVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AccessibilitySettingsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ActivityCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AdsVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.AudienceControlVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.BackgroundAudioVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.CommercialContentVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContactsAndLocationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.DisplayVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FamilyPairingVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.FavoriteCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.JoinAmplifyVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LiveVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.MusicVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.NotificationVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.PlaybackVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ScreenTimeVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ShortcutManagerVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.LogoutVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AboutCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.AccountDeletionVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.BetaCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.FeedbackCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.OpenDebugCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PolicyUpdateVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCenterVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.PrivacyCheckupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.SupportCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.cells.WhatsNewCellVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.cell.ManagePostsVM;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AwS617S0100000_3 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS617S0100000_3(C259800zU c259800zU, C259800zU<String> c259800zU2) {
        super(2);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C23260099m c23260099m, int i) {
        super(2);
        this.$t = i;
        this.l0 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS617S0100000_3(C09A4 c09a4, C09A4<?> c09a42) {
        super(2);
        this.$t = c09a42;
        this.l0 = c09a4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C0DKC c0dkc, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0dkc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C0DL2 c0dl2, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0dl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C0HN1 c0hn1, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0hn1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C699340Rbw c699340Rbw, int i) {
        super(2);
        this.$t = i;
        this.l0 = c699340Rbw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C1007730cKZ c1007730cKZ, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1007730cKZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C20639615pa c20639615pa, int i) {
        super(2);
        this.$t = i;
        this.l0 = c20639615pa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(KaraokeViewModel karaokeViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = karaokeViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(SmartImageView smartImageView, int i) {
        super(2);
        this.$t = i;
        this.l0 = smartImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(StoreMixViewModel storeMixViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = storeMixViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(Aweme aweme, int i) {
        super(2);
        this.$t = i;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(EffectPublishPkgSizeMonitorAssem effectPublishPkgSizeMonitorAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = effectPublishPkgSizeMonitorAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AccountVM accountVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = accountVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AnalyticsVM analyticsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = analyticsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(MyQrCodeVM myQrCodeVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = myQrCodeVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(OrdersVM ordersVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = ordersVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(PrivacyVM privacyVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = privacyVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ReferralInviteFriendsVM referralInviteFriendsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = referralInviteFriendsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(SecurityAndPermissionsVM securityAndPermissionsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = securityAndPermissionsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ShareProfileVM shareProfileVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = shareProfileVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(SignUpVM signUpVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = signUpVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(TiktokPlusVM tiktokPlusVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = tiktokPlusVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(WalletVM walletVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = walletVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(CheckUpdateSettingsVM checkUpdateSettingsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = checkUpdateSettingsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ClearCacheVM clearCacheVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = clearCacheVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(DataSaverVM dataSaverVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = dataSaverVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(LiteModeVM liteModeVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = liteModeVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(LocalLiveWallpaperVM localLiveWallpaperVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = localLiveWallpaperVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AccessibilitySettingsVM accessibilitySettingsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = accessibilitySettingsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ActivityCenterVM activityCenterVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = activityCenterVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AdsVM adsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = adsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AudienceControlVM audienceControlVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = audienceControlVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(BackgroundAudioVM backgroundAudioVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = backgroundAudioVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(CommercialContentVM commercialContentVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = commercialContentVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ContactsAndLocationVM contactsAndLocationVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = contactsAndLocationVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ContentPreferenceVM contentPreferenceVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = contentPreferenceVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(DisplayVM displayVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = displayVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(FamilyPairingVM familyPairingVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = familyPairingVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(FavoriteCellVM favoriteCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = favoriteCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(JoinAmplifyVM joinAmplifyVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = joinAmplifyVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(LanguageVM languageVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = languageVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(LiveVM liveVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(MusicVM musicVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(NotificationVM notificationVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = notificationVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(PlaybackVM playbackVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = playbackVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ScreenTimeVM screenTimeVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = screenTimeVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ShortcutManagerVM shortcutManagerVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = shortcutManagerVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(LogoutVM logoutVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = logoutVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(SwitchAccountVM switchAccountVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = switchAccountVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AboutCellVM aboutCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = aboutCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AccountDeletionVM accountDeletionVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = accountDeletionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(BetaCellVM betaCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = betaCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(FeedbackCellVM feedbackCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = feedbackCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(OpenDebugCellVM openDebugCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = openDebugCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(PolicyUpdateVM policyUpdateVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = policyUpdateVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(PrivacyCenterVM privacyCenterVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = privacyCenterVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(PrivacyCheckupVM privacyCheckupVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = privacyCheckupVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(SupportCellVM supportCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = supportCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(WhatsNewCellVM whatsNewCellVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = whatsNewCellVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(ManagePostsVM managePostsVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = managePostsVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(MvChoosePhotoScene mvChoosePhotoScene, int i) {
        super(2);
        this.$t = i;
        this.l0 = mvChoosePhotoScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(Effect effect, int i) {
        super(2);
        this.$t = i;
        this.l0 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(CorrectSchoolPageAssem correctSchoolPageAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = correctSchoolPageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS617S0100000_3(ArrayList arrayList, ArrayList<SearchMixFeed> arrayList2) {
        super(2);
        this.$t = arrayList2;
        this.l0 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS617S0100000_3(Map map, Map<String, Object> map2) {
        super(2);
        this.$t = map2;
        this.l0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS617S0100000_3(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap<Integer, LinkedList<SoftReference<View>>> concurrentHashMap2) {
        super(2);
        this.$t = concurrentHashMap2;
        this.l0 = concurrentHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS617S0100000_3(AwS605S0100000_26 awS605S0100000_26, int i) {
        super(2);
        this.$t = i;
        this.l0 = awS605S0100000_26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$0(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ?? arrayList;
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0DKC c0dkc = (C0DKC) awS617S0100000_3.l0;
        if (jCurrentTimeMillis - c0dkc.LLILZIL > 1000) {
            c0dkc.LLILZIL = System.currentTimeMillis();
            Function1<String, Unit> function1 = ((C0DKC) awS617S0100000_3.l0).LLILLJJLI;
            if (function1 != null) {
                function1.invoke(obj2);
            }
            C0DKC c0dkc2 = (C0DKC) awS617S0100000_3.l0;
            List<Pair<Integer, Boolean>> list = c0dkc2.LLILLL;
            if (iIntValue >= 0 && iIntValue < list.size() && 1 != 0 && list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                int i = 0;
                for (Pair<Integer, Boolean> pair : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Integer first = pair.getFirst();
                        if (i == iIntValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new Pair(first, Boolean.valueOf(z)));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList = c0dkc2.LLILLL;
            }
            c0dkc2.LLILLL = arrayList;
            c0dkc2.notifyDataSetChanged();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        C0CNO.LIZLLL(0L, new AwS404S0200000_3((C0HN1) awS617S0100000_3.l0, (List) obj, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((SupportCellVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((WhatsNewCellVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((FeedbackCellVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((OpenDebugCellVM) awS617S0100000_3.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        int iIntValue = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download song test ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(": progress: ");
        sbLIZ.append(iIntValue);
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((KaraokeViewModel) awS617S0100000_3.l0), C0PEM.LIZJ, null, new AnonymousClass0971((KaraokeViewModel) awS617S0100000_3.l0, jLongValue, iIntValue, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        int iIntValue = ((Number) obj2).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download song test ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(": progress: ");
        sbLIZ.append(iIntValue);
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope((KaraokeViewModel) awS617S0100000_3.l0), C0PEM.LIZJ, null, new AnonymousClass0972((KaraokeViewModel) awS617S0100000_3.l0, jLongValue, iIntValue, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((Number) obj).intValue();
        JSONObject jSONObject = (JSONObject) obj2;
        ((Map) awS617S0100000_3.l0).put(JSONObjectProtectorUtils.getString(jSONObject, "name"), jSONObject.get("cost"));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        long jLongValue = ((Number) obj2).longValue();
        if (jLongValue > ((EffectPublishPkgSizeMonitorAssem) awS617S0100000_3.l0).hp()) {
            C339800DTu c339800DTu = C339800DTu.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Effect zip size ");
            sbLIZ.append(jLongValue);
            sbLIZ.append(" (");
            ((EffectPublishPkgSizeMonitorAssem) awS617S0100000_3.l0).getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C786410Ut5.k4(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue / 1024.0d)}, 1)));
            sbLIZ2.append("KB");
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            sbLIZ.append(") exceed max size: ");
            sbLIZ.append(((EffectPublishPkgSizeMonitorAssem) awS617S0100000_3.l0).hp());
            C201955140j.LJIJJ(c339800DTu, "AMEPackageSizeMonitor", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJLLLLLL(0, uIAssem.LJJIJL());
        } else {
            C786410Ut5.LJLLLLLL(8, uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AccountVM) awS617S0100000_3.l0).wQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C2243608qg.LIZ(new Pair(Boolean.valueOf(zBooleanValue), obj2), (InterfaceC1364105Vn) awS617S0100000_3.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.String] */
    public static final Object invoke$2(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((C259800zU) awS617S0100000_3.l0).element = ((PlaceholderInfoModel) obj).transValue;
        return obj2;
    }

    public static final Object invoke$20(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTemplateUrl, Id =");
        sbLIZ.append(((MvChoosePhotoScene) awS617S0100000_3.l0).ugcTemplateId);
        sbLIZ.append(" errorMeg=");
        sbLIZ.append((String) obj);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C2243608qg.LIZ(new Pair(Boolean.valueOf(zBooleanValue), obj2), (InterfaceC1364105Vn) awS617S0100000_3.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        List list = (List) obj2;
        if (C09IA.LIZ[((C09I6) obj).ordinal()] == 2 && (!list.isEmpty())) {
            DiyPropParser.LJIILJJIL(C1622320sJq.LIZIZ, (Effect) awS617S0100000_3.l0, (Bitmap[]) list.toArray(new Bitmap[0]), AFwS189S0000000_3.get$arr$(1294));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        C20600815jK<InterfaceC1891350zJl> state;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        Collection collection = (Collection) obj2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((CorrectSchoolPageAssem) awS617S0100000_3.l0).LLJJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((CorrectSchoolPageAssem) awS617S0100000_3.l0).LLJJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(0);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C2207008km((CorrectSchoolPageAssem) awS617S0100000_3.l0, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ManagePostsVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        C2402509bD c2402509bD = (C2402509bD) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C20639615pa c20639615pa = (C20639615pa) awS617S0100000_3.l0;
        c20639615pa.LLJJJJLIIL = c2402509bD.LL;
        c20639615pa.LLLLIILL(c2402509bD, zBooleanValue);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C20639615pa c20639615pa = (C20639615pa) awS617S0100000_3.l0;
        c20639615pa.LLJJJJLIIL = c20639615pa.LLJJJIL;
        c20639615pa.LLLLIILL((C2402509bD) obj, zBooleanValue);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final Object invoke$27(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ?? arrayList;
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        Function1<String, Unit> function1 = ((C0DL2) awS617S0100000_3.l0).LLILLL;
        if (function1 != null) {
            function1.invoke(obj2);
        }
        C0DL2 c0dl2 = (C0DL2) awS617S0100000_3.l0;
        List<Pair<Integer, Boolean>> list = c0dl2.LLILZ;
        if (iIntValue >= 0 && iIntValue < list.size() && 1 != 0 && list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (Pair<Integer, Boolean> pair : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Integer first = pair.getFirst();
                    if (i == iIntValue) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new Pair(first, Boolean.valueOf(z)));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = c0dl2.LLILZ;
        }
        c0dl2.LLILZ = arrayList;
        c0dl2.notifyDataSetChanged();
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        String absolutePath;
        File file = (File) obj;
        Throwable th = (Throwable) obj2;
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadPhotoModeImage disk failed: ");
            sbLIZ.append(((Aweme) awS617S0100000_3.l0).getAid());
            sbLIZ.append(", err=");
            sbLIZ.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preloadPhotoModeImage disk success: ");
            sbLIZ2.append(((Aweme) awS617S0100000_3.l0).getAid());
            sbLIZ2.append(", file=");
            if (file != null) {
                absolutePath = file.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            sbLIZ2.append(absolutePath);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindSlotStrategy prepared, boundRuleCount=");
        sbLIZ.append(((List) obj).size());
        sbLIZ.append(", boundSlotIds=");
        sbLIZ.append(C13LP.LLIIII(((C699340Rbw) awS617S0100000_3.l0).LJIILIIL));
        sbLIZ.append(", shouldRebindObservers=");
        sbLIZ.append(zBooleanValue);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue() && C123100dR.LIZ(str)) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            c1331670kl3LJII.LJJ((SmartImageView) awS617S0100000_3.l0);
            c1331670kl3LJII.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Boolean.valueOf(((ArrayList) awS617S0100000_3.l0).contains(obj2));
    }

    public static final Object invoke$31(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        String str = (String) obj;
        n nVar = (n) obj2;
        if (C1165500gR2.LIZ.preloadSparkEnable) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope((StoreMixViewModel) awS617S0100000_3.l0), C0PEM.LIZJ, null, new C2399709al(str, nVar, (StoreMixViewModel) awS617S0100000_3.l0, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$32(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        LinkedList linkedList = (LinkedList) ((ConcurrentHashMap) awS617S0100000_3.l0).get(Integer.valueOf(iIntValue));
        if (linkedList != null) {
            if (linkedList.size() <= iIntValue2) {
                ((ConcurrentHashMap) awS617S0100000_3.l0).remove(Integer.valueOf(iIntValue));
            } else {
                synchronized (linkedList) {
                    int i = 0;
                    while (true) {
                        if (i >= iIntValue2) {
                            break;
                        }
                        try {
                            if (((SoftReference) linkedList.poll()) == null) {
                                break;
                            }
                            i++;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2166708eH((C1007730cKZ) awS617S0100000_3.l0, (Integer) obj, (String) obj2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        Throwable th = (Throwable) obj2;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS617S0100000_3.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        if (th != null) {
            th.printStackTrace();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ReferralInviteFriendsVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$36(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AnalyticsVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$37(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((SecurityAndPermissionsVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AnalyticsVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ShareProfileVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((PolicyUpdateVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((SignUpVM) awS617S0100000_3.l0).getClass();
        Activity activityLIZ = C1388190mED.LIZ((Context) obj);
        if (activityLIZ != null) {
            C0XPD.LIZIZ(activityLIZ, "settings_page", "click_setting", null, new C2501709rD(activityLIZ, 0));
            C2018307vR.LIZ.getClass();
            C2018307vR.LIZ("settings_page", "click_setting");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((TiktokPlusVM) awS617S0100000_3.l0).getClass();
        ComplianceServiceProvider.LJIILIIL().LJJIJL((Context) obj, "main_settings");
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((WalletVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        Activity activityLIZ;
        Context context = (Context) obj;
        String str = (String) obj2;
        ((MyQrCodeVM) awS617S0100000_3.l0).getClass();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C621180OYa.LIZ.LJJLJ(activityLIZ, str, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        InterfaceC2024807wU interfaceC2024807wU = ((OrdersVM) awS617S0100000_3.l0).LL;
        Activity activityLIZ = C1388190mED.LIZ((Context) obj);
        if (activityLIZ != null) {
            interfaceC2024807wU.LIZ(activityLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((PrivacyVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        InterfaceC23272099y<?> key = element.getKey();
        CoroutineContext.Element element2 = ((C09A4) awS617S0100000_3.l0).collectContext.get(key);
        if (key != C09AE.LJJLJ) {
            if (element != element2) {
                i = Integer.MIN_VALUE;
            } else {
                i = iIntValue + 1;
            }
            return Integer.valueOf(i);
        }
        C09AE parent = (C09AE) element;
        while (true) {
            if (parent == null) {
                parent = null;
                break;
            }
            if (parent == element2 || !(parent instanceof C099Z)) {
                break;
            }
            parent = parent.getParent();
        }
        if (parent == element2) {
            if (element2 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
        sbLIZ.append(parent);
        sbLIZ.append(", expected child of ");
        sbLIZ.append(element2);
        sbLIZ.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public static final Object invoke$47(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((Function1) awS617S0100000_3.l0).invoke(Integer.valueOf(((Number) obj).intValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((CheckUpdateSettingsVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$49(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ClearCacheVM clearCacheVM = (ClearCacheVM) awS617S0100000_3.l0;
        clearCacheVM.getClass();
        clearCacheVM.withState(new AwS582S0100000_3(clearCacheVM, 152));
        SmartRouter.buildRoute((Context) obj, "//setting/diskmanager_compose").open();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AboutCellVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$50(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((DataSaverVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$51(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((LiteModeVM) awS617S0100000_3.l0).getClass();
        SmartRouter.buildRoute((Context) obj, "aweme://settings/lite_mode?enter_from=settings").open();
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((LocalLiveWallpaperVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ShortcutManagerVM) awS617S0100000_3.l0).getClass();
        SmartRouter.buildRoute((Context) obj, "aweme://setting/shortcut").open();
        return Unit.LIZ;
    }

    public static final Object invoke$54(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((JoinAmplifyVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$55(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AccessibilitySettingsVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$56(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ActivityCenterVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$57(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((LanguageVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$58(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AdsVM) awS617S0100000_3.l0).getClass();
        ComplianceServiceProvider.LJIILIIL().LJJIL((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$59(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((LiveVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        Activity activityLIZ;
        Context context = (Context) obj;
        ((PrivacyCenterVM) awS617S0100000_3.l0).getClass();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C0TTZ.LIZ.getClass();
            C0TTZ.LIZIZ(activityLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ContactsAndLocationVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$61(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        Context context = (Context) obj;
        ((AudienceControlVM) awS617S0100000_3.l0).getClass();
        if (context != null) {
            ComplianceServiceProvider.LJI().LJJIZ(context);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((MusicVM) awS617S0100000_3.l0).getClass();
        SmartRouter.buildRoute((Context) obj, "//settings/music").open();
        return Unit.LIZ;
    }

    public static final Object invoke$63(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((BackgroundAudioVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$64(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ContentPreferenceVM) awS617S0100000_3.l0).wQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$65(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((NotificationVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$66(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((CommercialContentVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$67(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        Context context = (Context) obj;
        ((DisplayVM) awS617S0100000_3.l0).getClass();
        if (context != null) {
            SmartRouter.buildRoute(context, "aweme://setting/theme").open();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$68(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((PlaybackVM) awS617S0100000_3.l0).getClass();
        C19328810je.LIZ(EnumC2174471A8f.PLAYBACK_SETTINGS.getTag());
        SmartRouter.buildRoute((Context) obj, "aweme://setting/playback").open();
        return Unit.LIZ;
    }

    public static final Object invoke$69(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        Context context = (Context) obj;
        ((FamilyPairingVM) awS617S0100000_3.l0).getClass();
        if (context != null) {
            ComplianceServiceProvider.LJIIJJI().LJIILLIIL(C1388190mED.LIZ(context), "", false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((AccountDeletionVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$70(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((ScreenTimeVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$71(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((FavoriteCellVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$72(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((LogoutVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$73(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((SwitchAccountVM) awS617S0100000_3.l0).vQ2((Context) obj, (String) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((PrivacyCheckupVM) awS617S0100000_3.l0).getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) obj, "//privacy/checkup");
        smartRouteBuildRoute.withParam("enter_from", "support_page");
        smartRouteBuildRoute.open();
        C20684815ws.LJFF().submit(RunnableC168400kk.LL);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS617S0100000_3 awS617S0100000_3, Object obj, Object obj2) {
        ((BetaCellVM) awS617S0100000_3.l0).vQ2((Context) obj);
        return Unit.LIZ;
    }
}
