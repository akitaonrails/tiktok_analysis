package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.AbstractC21673619ry;
import X.AbstractC767840UAc;
import X.C01GW;
import X.C01U6;
import X.C098200Yq;
import X.C09AY;
import X.C0CZU;
import X.C0IHY;
import X.C0IJT;
import X.C0KAJ;
import X.C0KPJ;
import X.C0TF8;
import X.C0TJW;
import X.C0TNT;
import X.C0U17;
import X.C0U22;
import X.C0U23;
import X.C0U2N;
import X.C0U57;
import X.C0U58;
import X.C0U6J;
import X.C0U6S;
import X.C0U78;
import X.C0U7H;
import X.C0U7R;
import X.C0U8F;
import X.C0UA1;
import X.C0UAP;
import X.C0UAV;
import X.C0UBH;
import X.C0UC4;
import X.C0UC5;
import X.C0UD4;
import X.C0UEU;
import X.C0UEY;
import X.C0UKC;
import X.C0Z2Q;
import X.C0ZQ3;
import X.C1078030e9x;
import X.C1095630ecL;
import X.C10GR;
import X.C10ZL;
import X.C1102070emj;
import X.C1107460evQ;
import X.C1107850ew3;
import X.C1161920gLG;
import X.C1222570hv5;
import X.C123100dR;
import X.C1240120iNO;
import X.C1240150iNR;
import X.C1240160iNS;
import X.C1240210iNX;
import X.C1240220iNY;
import X.C1308910kAL;
import X.C1338270kvh;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C15438062q;
import X.C162100jj;
import X.C16F5;
import X.C16FS;
import X.C1836150xsj;
import X.C189200o6;
import X.C1906580ziK;
import X.C197039127h;
import X.C19748512Ol;
import X.C19EG;
import X.C20441214yg;
import X.C211000rc;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C23260099m;
import X.C259800zU;
import X.C291001Au;
import X.C343970De7;
import X.C473410IhP;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C531650Kt9;
import X.C740720T3u;
import X.C740730T3v;
import X.C743770TFn;
import X.C745370TLr;
import X.C755530TkN;
import X.C758470Tp7;
import X.C758510TpB;
import X.C759320TqU;
import X.C761590Tu9;
import X.C761610TuB;
import X.C761680TuI;
import X.C762500Tvc;
import X.C763230Twn;
import X.C766590U5h;
import X.C767250U7v;
import X.C767850UAd;
import X.C767880UAg;
import X.C768350UCb;
import X.C768460UCm;
import X.C768560UCw;
import X.C770190UJd;
import X.C770200UJe;
import X.C770630UKv;
import X.C773390UVl;
import X.C776040UcM;
import X.C776050UcN;
import X.C778030UfZ;
import X.C779880UiY;
import X.C780600Uji;
import X.C780620Ujk;
import X.C780630Ujl;
import X.C780920UkE;
import X.C781270Ukn;
import X.C781670UlR;
import X.C784630UqD;
import X.C785440UrW;
import X.C786410Ut5;
import X.C951990asf;
import X.DialogC1389620mGW;
import X.EnumC2011707uN;
import X.EnumC761670TuH;
import X.EnumC764770TzH;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.EnumC774100UYe;
import X.EnumC780830Uk5;
import X.EnumC964170bCJ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1680500tpg;
import X.InterfaceC1914010zuJ;
import X.InterfaceC745390TLt;
import X.InterfaceC767730U9r;
import X.InterfaceC768510UCr;
import X.InterfaceC769000UEo;
import X.InterfaceC772190UQv;
import X.InterfaceC780590Ujh;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS76S0200000_7;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.broadcast.stablemode.ModuleDecision;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.effect.music.BGMListFragment;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.LiveBGMPlaylistFragment;
import com.bytedance.android.live.effect.navi.NaviAvatarListPresenter;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeature;
import com.bytedance.android.live.effect.navi.model.ProfileNaviStaticImage;
import com.bytedance.android.live.effect.navi.model.ProfileNaviUploadDataModel;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import com.bytedance.android.live.effect.sticker.LivePreviewableEffectSheet;
import com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerListView;
import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.AbsMultiGuestEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestGuestPropsPageFragment;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRuleDurationFragmentSheet;
import com.bytedance.android.livesdk.api.revenue.IRevenueService;
import com.bytedance.android.livesdk.api.revenue.asr.ILiveAsrHostService;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.debug.MockImageVideoWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.pause.PauseLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.task_animation.TaskFinishAnimationWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewStickerHelper;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewBannerWidget;
import com.bytedance.android.livesdk.broadcast.setting.LiveExtendScreenOfflineSetting;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog;
import com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveCloseWidget;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.gamelist.DataChannelAbility;
import com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelReplaceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRBlockListSetting;
import com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.android.livesdk.settings.customtab.KevaTestDialog;
import com.bytedance.android.livesdk.usercard.LiveProfileManageDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widget.LiveAnchorDebugInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment;
import com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpAssem;
import com.ss.android.ugc.aweme.commerce.tools.music.viewmodel.CommerceMusicLegalViewModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardTemplateFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.LiveReplayVideoClipActivity;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerFragment;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardRootAssem;
import com.ss.android.ugc.aweme.rss.link.ui.RssLinkAssem;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import webcast.api.smb.BoardInfo;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public class AwS626S0100000_12 extends C09AY implements Function2 {
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
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            case 76:
                return invoke$76(this, obj, obj2);
            case 77:
                return invoke$77(this, obj, obj2);
            case 78:
                return invoke$78(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS626S0100000_12(C259800zU c259800zU, C259800zU<String> c259800zU2) {
        super(2);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C23260099m c23260099m, int i) {
        super(2);
        this.$t = i;
        this.l0 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C0TJW c0tjw, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0tjw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C759320TqU c759320TqU, int i) {
        super(2);
        this.$t = i;
        this.l0 = c759320TqU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C0U57 c0u57, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0u57;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C766590U5h c766590U5h, int i) {
        super(2);
        this.$t = i;
        this.l0 = c766590U5h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C0U6S c0u6s, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0u6s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C0U7H c0u7h, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0u7h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C0UAP c0uap, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0uap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C0UAV c0uav, int i) {
        super(2);
        this.$t = i;
        this.l0 = c0uav;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(AbstractC767840UAc abstractC767840UAc, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC767840UAc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C767850UAd c767850UAd, int i) {
        super(2);
        this.$t = i;
        this.l0 = c767850UAd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C767880UAg c767880UAg, int i) {
        super(2);
        this.$t = i;
        this.l0 = c767880UAg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C770190UJd c770190UJd, int i) {
        super(2);
        this.$t = i;
        this.l0 = c770190UJd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C770200UJe c770200UJe, int i) {
        super(2);
        this.$t = i;
        this.l0 = c770200UJe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C773390UVl c773390UVl, int i) {
        super(2);
        this.$t = i;
        this.l0 = c773390UVl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C776040UcM c776040UcM, int i) {
        super(2);
        this.$t = i;
        this.l0 = c776040UcM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C779880UiY c779880UiY, int i) {
        super(2);
        this.$t = i;
        this.l0 = c779880UiY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(InterfaceC780590Ujh interfaceC780590Ujh, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC780590Ujh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C784630UqD c784630UqD, int i) {
        super(2);
        this.$t = i;
        this.l0 = c784630UqD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1095630ecL c1095630ecL, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1095630ecL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1240120iNO c1240120iNO, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1240120iNO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1240150iNR c1240150iNR, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1240150iNR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1240160iNS c1240160iNS, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1240160iNS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1240210iNX c1240210iNX, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1240210iNX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1240220iNY c1240220iNY, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1240220iNY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C1836150xsj c1836150xsj, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1836150xsj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(C19EG c19eg, int i) {
        super(2);
        this.$t = i;
        this.l0 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(KaraokeSongListFragment karaokeSongListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = karaokeSongListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(BGMListFragment bGMListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = bGMListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(LiveBGMPlaylistFragment liveBGMPlaylistFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveBGMPlaylistFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(NaviAvatarListPresenter naviAvatarListPresenter, int i) {
        super(2);
        this.$t = i;
        this.l0 = naviAvatarListPresenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(SoundEffectFragment soundEffectFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = soundEffectFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(SoundEffectMiniWidget soundEffectMiniWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = soundEffectMiniWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(LivePreviewableEffectSheet livePreviewableEffectSheet, int i) {
        super(2);
        this.$t = i;
        this.l0 = livePreviewableEffectSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(BaseMultiGuestStickerView baseMultiGuestStickerView, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseMultiGuestStickerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(MultiGuestStickerListView multiGuestStickerListView, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestStickerListView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(StickerShortCutWidget stickerShortCutWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = stickerShortCutWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(MultiGuestGuestPropsPageFragment multiGuestGuestPropsPageFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = multiGuestGuestPropsPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(LiveMuteRuleDurationFragmentSheet liveMuteRuleDurationFragmentSheet, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveMuteRuleDurationFragmentSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(LiveBroadcastEndFragment liveBroadcastEndFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveBroadcastEndFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(PreviewMoreWidget previewMoreWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = previewMoreWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(PreviewRevisionMoreWidget previewRevisionMoreWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = previewRevisionMoreWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(PreviewStickerHelper previewStickerHelper, int i) {
        super(2);
        this.$t = i;
        this.l0 = previewStickerHelper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(LiveStickerPropsDialog liveStickerPropsDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveStickerPropsDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(SinglePropsSelectorDialog singlePropsSelectorDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = singlePropsSelectorDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(GameTopicListAssem gameTopicListAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = gameTopicListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(KevaDebugFragment kevaDebugFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = kevaDebugFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(LiveProfileManageDialog liveProfileManageDialog, int i) {
        super(2);
        this.$t = i;
        this.l0 = liveProfileManageDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(OrgAccountsListFragment orgAccountsListFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = orgAccountsListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(CreateOrResetPINFragment createOrResetPINFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = createOrResetPINFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(SecurityCheckUpAssem securityCheckUpAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = securityCheckUpAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(CommerceMusicLegalViewModel commerceMusicLegalViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = commerceMusicLegalViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(PreviewHotCommentWidget previewHotCommentWidget, int i) {
        super(2);
        this.$t = i;
        this.l0 = previewHotCommentWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(BaseQuickChatRoomFragment baseQuickChatRoomFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = baseQuickChatRoomFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(BillboardTemplateFragment billboardTemplateFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = billboardTemplateFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(MixFeedManagerFragment mixFeedManagerFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = mixFeedManagerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(PerformanceUserCardRootAssem performanceUserCardRootAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = performanceUserCardRootAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(RssLinkAssem rssLinkAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = rssLinkAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(PaidContentVideoPanel paidContentVideoPanel, int i) {
        super(2);
        this.$t = i;
        this.l0 = paidContentVideoPanel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(SpecActServiceImpl specActServiceImpl, int i) {
        super(2);
        this.$t = i;
        this.l0 = specActServiceImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(StoryThoughtAvatarCreationFragment storyThoughtAvatarCreationFragment, int i) {
        super(2);
        this.$t = i;
        this.l0 = storyThoughtAvatarCreationFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS626S0100000_12(TakoMultipleSelectVM takoMultipleSelectVM, int i) {
        super(2);
        this.$t = i;
        this.l0 = takoMultipleSelectVM;
    }

    public static final Object invoke$0(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ModuleDecision moduleDecision = (ModuleDecision) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("brightnessDowngradeAction isDowngrade=");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("BrightnessDowngrade", C2188811AlT.LIZIZ(sbLIZ));
        C776040UcM c776040UcM = (C776040UcM) awS626S0100000_12.l0;
        if (c776040UcM.LIZIZ) {
            C20441214yg.LIZIZ("BrightnessDowngrade", "brightnessDowngradeAction ignored due to manual adjustment");
        } else {
            try {
                if (zBooleanValue) {
                    Float fLIZ = C0CZU.LIZ(moduleDecision, EnumC774100UYe.BRIGHTNESS_DOWNGRADE.getFeatureName());
                    WindowManager.LayoutParams attributes = ((C776040UcM) awS626S0100000_12.l0).LIZ.getWindow().getAttributes();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("brightnessDowngradeAction currentBrightness=");
                    sbLIZ2.append(C785440UrW.LIZ(((C776040UcM) awS626S0100000_12.l0).LIZ));
                    C20441214yg.LIZIZ("BrightnessDowngrade", C2188811AlT.LIZIZ(sbLIZ2));
                    if (fLIZ != null && !Intrinsics.LIZ(attributes.screenBrightness, fLIZ)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("params.screenBrightness=");
                        sbLIZ3.append(attributes.screenBrightness);
                        C20441214yg.LIZIZ("BrightnessDowngrade", C2188811AlT.LIZIZ(sbLIZ3));
                        attributes.screenBrightness = fLIZ.floatValue();
                        ((C776040UcM) awS626S0100000_12.l0).LIZ.getWindow().setAttributes(attributes);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("brightnessDowngradeAction applied target=");
                        sbLIZ4.append(fLIZ);
                        C20441214yg.LIZIZ("BrightnessDowngrade", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    try {
                        ((C776040UcM) awS626S0100000_12.l0).LIZ.getContentResolver().registerContentObserver(Settings.System.getUriFor("screen_brightness"), true, (C776050UcN) ((C776040UcM) awS626S0100000_12.l0).LIZJ.getValue());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJFF("BrightnessDowngrade", "register brightnessObserver error", e);
                    }
                } else {
                    C776040UcM.LIZ(c776040UcM.LIZ);
                    try {
                        ((C776040UcM) awS626S0100000_12.l0).LIZ.getContentResolver().unregisterContentObserver((C776050UcN) ((C776040UcM) awS626S0100000_12.l0).LIZJ.getValue());
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20441214yg.LJFF("BrightnessDowngrade", "brightnessDowngradeAction error", e3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((C759320TqU) awS626S0100000_12.l0).LLILZ.setText((SpannableStringBuilder) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((LiveMuteRuleDurationFragmentSheet) awS626S0100000_12.l0).uS().setText((SpannableStringBuilder) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        ((Boolean) obj2).booleanValue();
        C16F5 c16f5 = ((C0TJW) awS626S0100000_12.l0).LL;
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        BoardInfo boardInfo = (BoardInfo) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewMoreWidget.onWidgetCreated ");
        sbLIZ.append((String) obj2);
        sbLIZ.append(" SMBGoLivePermission");
        C20441214yg.LIZIZ("GoLivePageApi", C2188811AlT.LIZIZ(sbLIZ));
        PreviewMoreWidget previewMoreWidget = (PreviewMoreWidget) awS626S0100000_12.l0;
        previewMoreWidget.getClass();
        if (boardInfo.hasRecommendBoard) {
            LiveMode liveMode = (LiveMode) previewMoreWidget.dataChannel.gg0(LiveModeChannel.class);
            Long lLIZIZ = C0KPJ.f123mf.LIZIZ();
            if (lLIZIZ.longValue() <= 0 && boardInfo.latestGenBoardTimeSec > 0) {
                C473410IhP.LIZJ(new ARunnableS76S0200000_7(previewMoreWidget, liveMode, 62), 1000L);
            } else {
                lLIZIZ.longValue();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        BoardInfo boardInfo = (BoardInfo) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewRevisionMoreWidget.onWidgetCreated ");
        sbLIZ.append((String) obj2);
        sbLIZ.append(" SMBGoLivePermission");
        C20441214yg.LIZIZ("GoLivePageApi", C2188811AlT.LIZIZ(sbLIZ));
        PreviewRevisionMoreWidget previewRevisionMoreWidget = (PreviewRevisionMoreWidget) awS626S0100000_12.l0;
        previewRevisionMoreWidget.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PreviewRevisionMoreWidget.handleBoardReddotAndBubble BoardInfo=");
        sbLIZ2.append(boardInfo);
        C20441214yg.LIZIZ("GoLivePageApi", C2188811AlT.LIZIZ(sbLIZ2));
        if (boardInfo.hasRecommendBoard) {
            C20441214yg.LIZIZ("GoLivePageApi", "PreviewRevisionMoreWidget.handleBoardReddotAndBubble hasRecommendBoard");
            LiveMode liveMode = (LiveMode) previewRevisionMoreWidget.dataChannel.gg0(LiveModeChannel.class);
            Long lLIZIZ = C0KPJ.f123mf.LIZIZ();
            if (lLIZIZ.longValue() <= 0 && boardInfo.latestGenBoardTimeSec > 0) {
                C473410IhP.LIZJ(new ARunnableS76S0200000_7(previewRevisionMoreWidget, liveMode, 63), 1000L);
            } else {
                lLIZIZ.longValue();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((LiveStickerPropsDialog) awS626S0100000_12.l0).SR((RoomSticker) obj);
        ((LiveStickerPropsDialog) awS626S0100000_12.l0).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ImageModel imageModel;
        RoomSticker roomSticker = (RoomSticker) obj;
        if (((Number) obj2).intValue() >= 0 && (imageModel = roomSticker.image) != null) {
            Function2<String, ImageModel, Unit> function2 = ((SinglePropsSelectorDialog) awS626S0100000_12.l0).LLILLJJLI;
            if (function2 != null) {
                function2.invoke(roomSticker.LIZ, imageModel);
            }
        } else {
            Function2<String, ImageModel, Unit> function22 = ((SinglePropsSelectorDialog) awS626S0100000_12.l0).LLILLJJLI;
            if (function22 != null) {
                function22.invoke(null, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        Room room;
        Long lValueOf;
        User owner;
        Long lValueOf2;
        long id;
        User owner2;
        int i;
        Sticker sticker;
        TreeMap treeMap = (TreeMap) obj2;
        LiveStickerPropsDialog liveStickerPropsDialog = (LiveStickerPropsDialog) awS626S0100000_12.l0;
        DataChannel dataChannel = liveStickerPropsDialog.dataChannel;
        C0U6J c0u6j = liveStickerPropsDialog.LLILZIL;
        if (c0u6j == null) {
            c0u6j = null;
        }
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            if (c0u6j != null) {
                int i2 = ((C781670UlR) entry.getValue()).LIZ;
                if (c0u6j.getItemViewType(i2) != 1) {
                    int i3 = 2;
                    if (c0u6j.LLLII() >= 3 && i2 > c0u6j.LLLIILIL() - 2) {
                        i3 = 3;
                    } else {
                        if (c0u6j.LLLII() >= 2) {
                            i = 1;
                            if (i2 <= c0u6j.LLLIIIIL() - 1) {
                            }
                        } else {
                            i = 1;
                        }
                        if (c0u6j.LLLII() >= i && i2 > 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                    }
                    int i4 = i2 - i3;
                    if (i4 >= 0 && i4 < ((ArrayList) c0u6j.LLILLL).size() && (sticker = (Sticker) ListProtector.get(c0u6j.LLILLL, i4)) != null) {
                        int i5 = sticker.type;
                        String str = "";
                        if (i5 == 4) {
                            arrayList.add(Integer.valueOf(c0u6j.LLLI(((C781670UlR) entry.getValue()).LIZ) + 1));
                            arrayList2.add(Long.valueOf(sticker.id));
                            String str2 = sticker.LIZ;
                            if (str2 != null) {
                                str = str2;
                            }
                            arrayList3.add(str);
                        } else if (i5 == 5 || i5 == 6) {
                            arrayList4.add(Integer.valueOf(c0u6j.LLLI(((C781670UlR) entry.getValue()).LIZ) + 1));
                            arrayList5.add(Long.valueOf(sticker.id));
                            String str3 = sticker.LIZ;
                            if (str3 != null) {
                                str = str3;
                            }
                            arrayList6.add(str);
                        }
                    }
                }
            }
        }
        long id2 = 0;
        if ((!arrayList5.isEmpty()) && (!arrayList6.isEmpty())) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_picture_prop_panel_show");
            if (room != null && (owner2 = room.getOwner()) != null) {
                lValueOf2 = Long.valueOf(owner2.getId());
            } else {
                lValueOf2 = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "anchor_id");
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
            c474500IjALIZ.LJJII("video_live", "live_type");
            c474500IjALIZ.LJIILJJIL("live_take_detail");
            c474500IjALIZ.LJJII(arrayList4.toString(), "prop_position");
            c474500IjALIZ.LJJII(arrayList5.toString(), "prop_id_set");
            c474500IjALIZ.LJJII(arrayList6.toString(), "resource_id_set");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LIZ();
        }
        if ((!arrayList2.isEmpty()) && (!arrayList3.isEmpty())) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_character_prop_panel_show");
            if (room != null && (owner = room.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ2.LJJII(String.valueOf(lValueOf), "anchor_id");
            if (room != null) {
                id2 = room.getId();
            }
            c474500IjALIZ2.LJJII(Long.valueOf(id2), "room_id");
            c474500IjALIZ2.LJJII("video_live", "live_type");
            c474500IjALIZ2.LJIILJJIL("live_take_detail");
            c474500IjALIZ2.LJJII(arrayList.toString(), "prop_position");
            c474500IjALIZ2.LJJII(arrayList2.toString(), "prop_id_set");
            c474500IjALIZ2.LJJII(arrayList3.toString(), "resource_id_set");
            c474500IjALIZ2.LJIJJLI(dataChannel);
            c474500IjALIZ2.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$17(kotlin.jvm.internal.AwS626S0100000_12 r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS626S0100000_12.invoke$17(kotlin.jvm.internal.AwS626S0100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$18(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        DataChannelAbility dataChannelAbility;
        if (obj2 != null && (dataChannelAbility = ((GameTopicListAssem) awS626S0100000_12.l0).LLJJI) != null) {
            dataChannelAbility.zW(HashTagResp.class, obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        final Keva keva;
        final C745370TLr c745370TLr = (C745370TLr) obj;
        int iIntValue = ((Number) obj2).intValue();
        FragmentManager fragmentManager = ((KevaDebugFragment) awS626S0100000_12.l0).getFragmentManager();
        if (fragmentManager != null) {
            KevaDebugFragment kevaDebugFragment = (KevaDebugFragment) awS626S0100000_12.l0;
            String str = KevaTestDialog._pnsPageId;
            String str2 = c745370TLr.LIZJ;
            kevaDebugFragment.getClass();
            if (Intrinsics.LJFF(str2, "live_sdk_core")) {
                keva = kevaDebugFragment.LLILZLL;
            } else {
                keva = kevaDebugFragment.LLIZ;
            }
            final AwS120S0101000_12 awS120S0101000_12 = new AwS120S0101000_12(kevaDebugFragment, iIntValue, 1);
            KevaTestDialog.LLILZIL = c745370TLr;
            final KevaTestDialog kevaTestDialog = new KevaTestDialog();
            kevaTestDialog.show(fragmentManager, "KevaTestDialog");
            kevaTestDialog.LL = new InterfaceC745390TLt() { // from class: X.0TLs
                @Override // X.InterfaceC745390TLt
                public final void LIZ(Editable editable) {
                    String string;
                    if (editable == null || (string = editable.toString()) == null) {
                        string = "";
                    }
                    boolean z = true;
                    try {
                        try {
                            keva.storeString(c745370TLr.LIZ, string);
                            C766270U4b.LJIIJJI("save success!!");
                            awS120S0101000_12.invoke(string);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            z = false;
                            C766270U4b.LJIIJJI("save error, because your value is not right!");
                        }
                        kevaTestDialog.x4();
                        kevaTestDialog.dismiss();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (z) {
                            C766270U4b.LJIIJJI("save success!!");
                            awS120S0101000_12.invoke(string);
                        }
                        kevaTestDialog.x4();
                        kevaTestDialog.dismiss();
                        throw th;
                    }
                }
            };
            C16FS c16fs = kevaTestDialog.LLILLJJLI;
            if (c16fs != null) {
                C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(kevaTestDialog, 367));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String str = (String) obj2;
        if (C123100dR.LIZ(str)) {
            C1389890mGx c1389890mGx = new C1389890mGx((BillboardTemplateFragment) awS626S0100000_12.l0);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$20(kotlin.jvm.internal.AwS626S0100000_12 r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r6 = r10
            X.0TLc r6 = (X.C745220TLc) r6
            X.0TLc r11 = (X.C745220TLc) r11
            java.lang.Class<com.bytedance.android.live.usermanage.IUserManageService> r0 = com.bytedance.android.live.usermanage.IUserManageService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.usermanage.IUserManageService r2 = (com.bytedance.android.live.usermanage.IUserManageService) r2
            java.lang.Object r0 = r9.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r0 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r0
            com.bytedance.android.live.base.model.user.User r5 = r0.LLJ
            r8 = 0
            if (r5 != 0) goto L17
            r5 = r8
        L17:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LLIZLLLIL
            if (r0 != 0) goto L1c
            r0 = r8
        L1c:
            long r3 = r0.getId()
            java.lang.Object r7 = r9.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r7 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r7
            r2.B22(r3, r5, r6, r7, r8)
            java.lang.Object r3 = r9.l0
            com.bytedance.android.livesdk.usercard.LiveProfileManageDialog r3 = (com.bytedance.android.livesdk.usercard.LiveProfileManageDialog) r3
            r3.getClass()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            if (r0 == 0) goto Lb4
            long r4 = r0.getCurrentUserId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.LLIZLLLIL
            if (r0 != 0) goto L41
            r0 = r8
        L41:
            long r1 = r0.getOwnerUserId()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb4
            java.lang.String r1 = "anchor"
        L4b:
            java.lang.String r0 = "livesdk_mute_set"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.dataChannel
            r2.LJIJJLI(r0)
            java.lang.String r0 = "admin_type"
            r2.LJJII(r1, r0)
            long r0 = r11.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "default_mute_set"
            r2.LJJII(r1, r0)
            long r0 = r6.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "mute_duration"
            r2.LJJII(r1, r0)
            com.bytedance.android.live.base.model.user.User r0 = r3.LLJ
            if (r0 != 0) goto L76
            r0 = r8
        L76:
            long r0 = r0.getId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "to_user_id"
            r2.LJJII(r1, r0)
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "profile_card"
            r2.LJJII(r0, r1)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.LLIZLLLIL
            if (r0 != 0) goto L8f
            r0 = r8
        L8f:
            long r0 = r0.getOwnerUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.LLIZLLLIL
            if (r0 == 0) goto La1
            r8 = r0
        La1:
            long r0 = r8.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "room_id"
            r2.LJJII(r1, r0)
            r2.LIZ()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb4:
            java.lang.String r1 = "admin"
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS626S0100000_12.invoke$20(kotlin.jvm.internal.AwS626S0100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((OrgAccountsListFragment) awS626S0100000_12.l0).VR(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            ((CreateOrResetPINFragment) awS626S0100000_12.l0).ZR(interfaceC1680500tpg, 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            ((C19EG) awS626S0100000_12.l0).finish();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        if (((Boolean) obj2).booleanValue()) {
            C786410Ut5.J4((DialogC1389620mGW) ((SecurityCheckUpAssem) awS626S0100000_12.l0).LLJI.getValue());
        } else {
            C786410Ut5.LJIIJ((DialogC1389620mGW) ((SecurityCheckUpAssem) awS626S0100000_12.l0).LLJI.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        Integer numValueOf;
        LiveData liveData = (LiveData) obj;
        Object value = ((LiveData) ((CommerceMusicLegalViewModel) awS626S0100000_12.l0).LLJ.getValue()).getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(value, bool)) {
            numValueOf = Integer.valueOf(C0TF8.NONE.getValue());
        } else if (Intrinsics.LJFF(((CommerceMusicLegalViewModel) awS626S0100000_12.l0).LLIZLLLIL.getValue(), bool)) {
            numValueOf = Integer.valueOf(C0TF8.CHECKED.getValue());
        } else {
            numValueOf = Integer.valueOf(C0TF8.CHECKED.getValue());
        }
        liveData.setValue(numValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((TextView) ((PreviewHotCommentWidget) awS626S0100000_12.l0).LLJJJJ.getValue()).setText((SpannableStringBuilder) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C1107460evQ c1107460evQ;
        if (((C773390UVl) awS626S0100000_12.l0).LL != null && (c1107460evQ = C1107850ew3.LLILLL) != null) {
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, c1107460evQ.LIZJ, C1107850ew3.LL, C1107850ew3.LLJI, C0KAJ.MANUALLY_ROUTE, null, null, 112);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        IntRange intRange = new IntRange(((Number) obj).intValue(), ((Number) obj2).intValue());
        C1836150xsj c1836150xsj = (C1836150xsj) awS626S0100000_12.l0;
        ArrayList arrayList = new ArrayList();
        C531650Kt9 it2 = intRange.iterator();
        while (it2.LLILLL) {
            Object next = it2.next();
            int iIntValue = ((Number) next).intValue();
            if (iIntValue >= 0 && iIntValue < c1836150xsj.LJIJJLI.LIZIZ.size()) {
                if (iIntValue == c1836150xsj.LJIJJLI.LIZIZ.size() - 1) {
                    int i = iIntValue - 1;
                    if (((CharSequence) ListProtector.get(c1836150xsj.LJIJJLI.LIZIZ, i)).length() > 0) {
                        List<String> list = c1836150xsj.LJIJJLI.LIZIZ;
                        ListProtector.set(list, iIntValue, ListProtector.get(list, i));
                        c1836150xsj.LJIJJLI.LIZ();
                        RecyclerView recyclerView = c1836150xsj.LJJII;
                        if (recyclerView == null) {
                            recyclerView = null;
                        }
                        AbstractC21673619ry adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
                if (((CharSequence) ListProtector.get(c1836150xsj.LJIJJLI.LIZIZ, iIntValue)).length() == 0) {
                    arrayList.add(next);
                }
            }
        }
        AwS591S0100000_12 awS591S0100000_12 = ((C1836150xsj) awS626S0100000_12.l0).LJJJ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(awS591S0100000_12.invoke(it3.next()));
        }
        return C13LP.LLIIJI(arrayList2);
    }

    public static final Object invoke$29(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        Pair pair = (Pair) ((LiveReplayVideoClipActivity) ((C1836150xsj) awS626S0100000_12.l0).LIZ).LLLIIII.invoke();
        return Integer.valueOf((int) (((Number) pair.getSecond()).longValue() - ((Number) pair.getFirst()).longValue()));
    }

    public static final Object invoke$3(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List<MusicSong> list;
        TreeMap treeMap = (TreeMap) obj2;
        BGMListFragment bGMListFragment = (BGMListFragment) awS626S0100000_12.l0;
        DataChannel dataChannel = bGMListFragment.LL;
        C762500Tvc c762500Tvc = bGMListFragment.LLILZLL;
        if (c762500Tvc != null) {
            list = c762500Tvc.LLJI;
        } else {
            list = null;
        }
        C763230Twn.LJFF(dataChannel, treeMap, list, false);
        return Unit.LIZ;
    }

    public static final Object invoke$30(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        boolean z;
        List list = (List) obj2;
        C0TNT c0tnt = ((MixFeedManagerFragment) awS626S0100000_12.l0).LLILLJJLI;
        if (c0tnt == null) {
            c0tnt = null;
        }
        C197039127h removeView = c0tnt.getRemoveView();
        if (removeView != null) {
            if (list != null && list.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            removeView.setEnabled(!z);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$31(kotlin.jvm.internal.AwS626S0100000_12 r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto La
            int r0 = r6.intValue()
            if (r0 == 0) goto L89
        La:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel r0 = (com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel) r0
            com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM r0 = r0.v1()
            r3 = 0
            if (r0 == 0) goto L8e
            X.002o r0 = r0.getState()
            X.0s3X r0 = (X.C1612210s3X) r0
            if (r0 == 0) goto L8e
            java.lang.String r2 = r0.LLJJJIL
        L1f:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel r0 = (com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel) r0
            X.0SR4 r0 = r0.LLJL
            if (r0 == 0) goto L69
            java.util.List r0 = r0.LJJJLZIJ()
            if (r0 == 0) goto L69
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel r0 = (com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel) r0
            X.0SR4 r0 = r0.LLJL
            if (r0 == 0) goto L8c
            java.util.List r0 = r0.LJJJLZIJ()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = X.C13LP.LJJJJZI(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L8c
            java.lang.String r1 = r0.getAid()
        L4d:
            com.ss.android.ugc.aweme.series.feed.ISeriesFeedService r0 = X.C0RRR.LIZIZ()
            if (r0 == 0) goto L63
            X.0r9C r0 = r0.LIZ()
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJIILLIIL()
            if (r0 == 0) goto L63
            java.lang.String r3 = r0.getAid()
        L63:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L89
        L69:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel r0 = (com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel) r0
            android.app.Activity r1 = r0.activity
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L89
            if (r1 == 0) goto L89
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L86
            X.0mGw r0 = new X.0mGw
            r0.<init>(r1)
            r0.LJIIIZ(r2)
            r0.LJIIJ()
        L86:
            r1.finish()
        L89:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8c:
            r1 = r3
            goto L4d
        L8e:
            r2 = r3
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS626S0100000_12.invoke$31(kotlin.jvm.internal.AwS626S0100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$32(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS626S0100000_12.l0;
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            C189200o6.m2constructorimpl(boolValueOf);
            interfaceC1364105Vn.resumeWith(boolValueOf);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) awS626S0100000_12.l0;
            C098200Yq c098200Yq = new C098200Yq(new Exception("fail to save"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn2.resumeWith(c098200Yq);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).floatValue();
        ((StoryThoughtAvatarCreationFragment) awS626S0100000_12.l0).WR().LLJI.setValue(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$34(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String str;
        String str2;
        TreeMap<Integer, C781670UlR> treeMap = (TreeMap) obj2;
        String str3 = ((AbstractC767840UAc) awS626S0100000_12.l0).LJIILJJIL;
        String str4 = "";
        if (Intrinsics.LJFF(str3, C0UD4.LIZIZ)) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            AbstractC767840UAc abstractC767840UAc = (AbstractC767840UAc) awS626S0100000_12.l0;
            DataChannel dataChannel = abstractC767840UAc.LIZIZ;
            C0UBH c0ubh = abstractC767840UAc.LJI;
            if (c0ubh != null && (str2 = c0ubh.LIZIZ) != null) {
                str4 = str2;
            }
            C0UC4.LJIJI(dataChannel, str4, treeMap, abstractC767840UAc.LIZJ.LL, false);
        } else if (Intrinsics.LJFF(str3, C0UD4.LJ)) {
            C0UC5 c0uc5 = C0UC5.LIZ;
            AbstractC767840UAc abstractC767840UAc2 = (AbstractC767840UAc) awS626S0100000_12.l0;
            C0UBH c0ubh2 = abstractC767840UAc2.LJI;
            if (c0ubh2 != null && (str = c0ubh2.LIZIZ) != null) {
                str4 = str;
            }
            c0uc5.LJI(str4, treeMap, abstractC767840UAc2.LIZJ.LL, abstractC767840UAc2.LIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String str;
        TreeMap treeMap = (TreeMap) obj2;
        if (C500260Jjc.LJJJJIZL(((C767850UAd) awS626S0100000_12.l0).LJIIIZ)) {
            C0UC4 c0uc4 = C0UC4.LIZ;
            C767850UAd c767850UAd = (C767850UAd) awS626S0100000_12.l0;
            DataChannel dataChannel = c767850UAd.LIZIZ;
            C0UBH c0ubh = c767850UAd.LJI;
            if (c0ubh == null || (str = c0ubh.LIZIZ) == null) {
                str = "";
            }
            C0UC4.LJIJI(dataChannel, str, treeMap, c767850UAd.LIZJ.LL, false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$36(kotlin.jvm.internal.AwS626S0100000_12 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS626S0100000_12.invoke$36(kotlin.jvm.internal.AwS626S0100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$37(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        final RssLinkAssem rssLinkAssem;
        final Context context;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ() != null && (context = (rssLinkAssem = (RssLinkAssem) awS626S0100000_12.l0).getContext()) != null) {
            rssLinkAssem.getActualLifecycleOwner();
            final AwS378S0200000_12 awS378S0200000_12 = new AwS378S0200000_12(context, rssLinkAssem, 43);
            PopupManager.LJIJI(new C10GR(context, rssLinkAssem, awS378S0200000_12) { // from class: X.0TMw
                public final Context LL;
                public final LifecycleOwner LLILLJJLI;
                public final Function1<C20656615sK, Unit> LLILLL;
                public final int LLILZ = 2540;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    return new C688120Qyw(this.LL, this.LLILLJJLI, null);
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILZ;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LLILLL.invoke(c20656615sK);
                }

                {
                    this.LL = context;
                    this.LLILLJJLI = rssLinkAssem;
                    this.LLILLL = awS378S0200000_12;
                }
            }, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String enterMethodForMob;
        Activity activityLIZIZ;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ() != null) {
            BaseQuickChatRoomFragment baseQuickChatRoomFragment = (BaseQuickChatRoomFragment) awS626S0100000_12.l0;
            baseQuickChatRoomFragment.LLJJL = "close_button";
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(baseQuickChatRoomFragment, C343970De7.LIZ);
            EnterChatParams enterChatParams = ((BaseQuickChatRoomFragment) awS626S0100000_12.l0).LLJ;
            if (enterChatParams != null) {
                enterMethodForMob = enterChatParams.getEnterMethodForMob();
            } else {
                enterMethodForMob = null;
            }
            if (Intrinsics.LJFF(enterMethodForMob, "share_toast")) {
                if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                    ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(ActivityStack.getTopActivity(), "share_im_finish", new InterfaceC1914010zuJ() { // from class: X.0Te4
                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZ() {
                            String strLIZ = C10ZL.LIZ(C2211631BhB.LJII());
                            if (AddOptionForGuidanceExp.LIZJ > 0) {
                                C19212010Ec.LIZJ.LJIILJJIL(ActivityStack.getTopActivity(), new C1917290zzb(AddOptionForGuidanceExp.LIZIZ("in_app_share"), strLIZ, "click_toast", "in_app_share", null, null, null, null, null, 8176));
                            } else {
                                C19212010Ec.LIZJ.LJJLIIIJILLIZJL(ActivityStack.getTopActivity(), new C1917290zzb(null, strLIZ, "click_toast", "in_app_share", null, null, null, null, null, 8177));
                            }
                        }
                    });
                } else {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                        String strLIZ = C10ZL.LIZ(C2211631BhB.LJII());
                        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("share_im_finish");
                        C740720T3u.LIZ.getClass();
                        C740730T3v c740730T3v = C740720T3u.LIZIZ;
                        if (c740730T3v != null) {
                            if (System.currentTimeMillis() - C740720T3u.LIZJ > 10000) {
                                C740720T3u.LIZIZ = null;
                                C740720T3u.LIZJ = 0L;
                            } else {
                                C740720T3u.LIZIZ = null;
                                C740720T3u.LIZJ = 0L;
                                if (c740730T3v.LIZ.length() > 0) {
                                    unifiedAuthPopupConfigLIZJ.setTargetUserName(c740730T3v.LIZ);
                                }
                                String str2 = c740730T3v.LIZIZ;
                                if (str2 != null && str2.length() != 0) {
                                    unifiedAuthPopupConfigLIZJ.setAvatar(c740730T3v.LIZIZ);
                                }
                            }
                        }
                        unifiedAuthPopupConfigLIZJ.setSceneId("share_im_finish_click_toast");
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                        if (c19egLIZIZ != null) {
                            String strLJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LJ(c19egLIZIZ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("EnterFrom: ");
                            sbLIZ.append(strLIZ);
                            sbLIZ.append("; TabName: ");
                            sbLIZ.append(strLJ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C211000rc.LIZ("[Push]");
                            unifiedAuthPopupConfigLIZJ.setSubSceneId(strLJ);
                        }
                        unifiedAuthPopupConfigLIZJ.setEnterFrom(strLIZ);
                        unifiedAuthPopupConfigLIZJ.setEnterMethod("click_toast");
                        unifiedAuthPopupConfigLIZJ.setPopupTriggerId("ug_338_in_app_share");
                        unifiedAuthPopupConfigLIZJ.setSysPage("share_im_finish");
                        ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(activityLIZIZ, null, unifiedAuthPopupConfigLIZJ);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0KPJ.uf.LJFF(Boolean.TRUE);
        C758470Tp7 c758470Tp7LIZ = C758510TpB.LIZ();
        if (c758470Tp7LIZ != null) {
            c758470Tp7LIZ.LJFF = true;
        }
        ((C259800zU) awS626S0100000_12.l0).element = "accept";
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TreeMap treeMap = (TreeMap) obj2;
        DataChannel dataChannelLJ = C475510Ikn.LJ((LiveBGMPlaylistFragment) awS626S0100000_12.l0);
        BGMPlaylistViewModel bGMPlaylistViewModel = ((LiveBGMPlaylistFragment) awS626S0100000_12.l0).LLILZLL;
        if (bGMPlaylistViewModel == null) {
            bGMPlaylistViewModel = null;
        }
        C763230Twn.LJFF(dataChannelLJ, treeMap, bGMPlaylistViewModel.yQ2(), true);
        return Unit.LIZ;
    }

    public static final Object invoke$40(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((C259800zU) awS626S0100000_12.l0).element = "reject";
        return Unit.LIZ;
    }

    public static final Object invoke$41(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String strLJIJI;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        if (((C0UAV) awS626S0100000_12.l0).LLILZIL) {
            strLJIJI = C497740JfY.LJIJI(2131824461);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131823290);
        }
        accessibilityNodeInfoCompat.setContentDescription(strLJIJI);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((C0UAP) awS626S0100000_12.l0).LJJIJIL((LiveEffect) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$43(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        return C01U6.LJ(new AwS66S2100000_28((SpecActServiceImpl) awS626S0100000_12.l0, (String) obj, (String) obj2, 2), Boolean.FALSE);
    }

    public static final Object invoke$44(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0UC4 c0uc4 = C0UC4.LIZ;
        C767880UAg c767880UAg = (C767880UAg) awS626S0100000_12.l0;
        C0UC4.LJIJI(c767880UAg.LLILLJJLI, "search", (TreeMap) obj2, c767880UAg.LLJILJILJ.LL, false);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0UC4 c0uc4 = C0UC4.LIZ;
        StickerShortCutWidget stickerShortCutWidget = (StickerShortCutWidget) awS626S0100000_12.l0;
        C0UC4.LJIJI(stickerShortCutWidget.dataChannel, "", (TreeMap) obj2, stickerShortCutWidget.LLIZ, true);
        return Unit.LIZ;
    }

    public static final Object invoke$46(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        InterfaceC767730U9r interfaceC767730U9r;
        IBroadcastService iBroadcastService;
        InterfaceC767730U9r interfaceC767730U9r2;
        LiveEffect liveEffect = (LiveEffect) obj;
        LiveEffect liveEffect2 = (LiveEffect) obj2;
        boolean z = false;
        if (LiveEffectShortcutPanelReplaceSetting.INSTANCE.getValue()) {
            if (liveEffect2 == null) {
                C0UA1.LIZ().lr(C0UD4.LIZIZ);
                StickerShortCutWidget stickerShortCutWidget = (StickerShortCutWidget) awS626S0100000_12.l0;
                LiveEffect liveEffect3 = stickerShortCutWidget.LLJJI;
                if (liveEffect3 != null && (interfaceC767730U9r2 = stickerShortCutWidget.LLJILJIL) != null) {
                    interfaceC767730U9r2.LJIILJJIL(liveEffect3);
                }
                if (((StickerShortCutWidget) awS626S0100000_12.l0).LLJJI == null) {
                    z = true;
                }
                if (z && PlaybookAutoRunTypeSetting.INSTANCE.enable() && (iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)) != null) {
                    iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.EFFECTS, EnumC771230UNd.APPLY_FINISH, null);
                }
                ((StickerShortCutWidget) awS626S0100000_12.l0).LLJJI = null;
            } else {
                C0U8F c0u8f = C0U8F.LIZ;
                LiveEffect liveEffectLIZJ = C0U8F.LIZJ(liveEffect2);
                liveEffectLIZJ.getLogParams().LIZJ = true;
                C0UC4 c0uc4 = C0UC4.LIZ;
                DataChannel dataChannel = ((StickerShortCutWidget) awS626S0100000_12.l0).dataChannel;
                String str = C0UD4.LIZIZ;
                C0UC4.LJJIII(dataChannel, false, liveEffectLIZJ, str);
                if (C767250U7v.LIZLLL(liveEffect)) {
                    C20441214yg.LIZIZ("EffectMonitor#ComposerRemove", "");
                    C0UA1.LIZ().lr(str);
                }
                InterfaceC767730U9r interfaceC767730U9r3 = ((StickerShortCutWidget) awS626S0100000_12.l0).LLJILJIL;
                if (interfaceC767730U9r3 != null) {
                    interfaceC767730U9r3.LJIIL(liveEffectLIZJ);
                }
                if (!C767250U7v.LIZLLL(liveEffectLIZJ)) {
                    C20441214yg.LIZIZ("EffectMonitor#ComposerReplace", "");
                    C0UA1.LIZ().Gr(str, liveEffect, liveEffectLIZJ);
                }
                InterfaceC767730U9r interfaceC767730U9r4 = ((StickerShortCutWidget) awS626S0100000_12.l0).LLJILJIL;
                if (interfaceC767730U9r4 != null) {
                    interfaceC767730U9r4.LJFF(liveEffectLIZJ);
                }
                ((StickerShortCutWidget) awS626S0100000_12.l0).LLJJI = liveEffectLIZJ;
            }
        } else {
            C0U78 c0u78LIZ = C0UA1.LIZ();
            String str2 = C0UD4.LIZIZ;
            c0u78LIZ.lr(str2);
            if (liveEffect2 == null) {
                StickerShortCutWidget stickerShortCutWidget2 = (StickerShortCutWidget) awS626S0100000_12.l0;
                LiveEffect liveEffect4 = stickerShortCutWidget2.LLJJI;
                if (liveEffect4 != null && (interfaceC767730U9r = stickerShortCutWidget2.LLJILJIL) != null) {
                    interfaceC767730U9r.LJIILJJIL(liveEffect4);
                }
            } else {
                C0U8F c0u8f2 = C0U8F.LIZ;
                LiveEffect liveEffectLIZJ2 = C0U8F.LIZJ(liveEffect2);
                liveEffectLIZJ2.getLogParams().LIZJ = true;
                C0UC4 c0uc42 = C0UC4.LIZ;
                C0UC4.LJJIII(((StickerShortCutWidget) awS626S0100000_12.l0).dataChannel, false, liveEffectLIZJ2, str2);
                liveEffect2.getLogParams().LIZJ = true;
                InterfaceC767730U9r interfaceC767730U9r5 = ((StickerShortCutWidget) awS626S0100000_12.l0).LLJILJIL;
                if (interfaceC767730U9r5 != null) {
                    interfaceC767730U9r5.LJIIL(liveEffectLIZJ2);
                }
                C0UA1.LIZ().kr(liveEffectLIZJ2, str2);
                InterfaceC767730U9r interfaceC767730U9r6 = ((StickerShortCutWidget) awS626S0100000_12.l0).LLJILJIL;
                if (interfaceC767730U9r6 != null) {
                    interfaceC767730U9r6.LJFF(liveEffectLIZJ2);
                }
            }
            ((StickerShortCutWidget) awS626S0100000_12.l0).LLJJI = liveEffect2;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List<LiveEffect> list;
        DataChannel dataChannel;
        C0UEY liveMultiGuestStickerLogManager;
        TreeMap<Integer, C781670UlR> treeMap = (TreeMap) obj2;
        MultiGuestGuestPropsPageFragment multiGuestGuestPropsPageFragment = (MultiGuestGuestPropsPageFragment) awS626S0100000_12.l0;
        C0UEU c0ueu = multiGuestGuestPropsPageFragment.LLILLJJLI;
        if (c0ueu != null && (list = c0ueu.LL) != null) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = multiGuestGuestPropsPageFragment.LLILLL;
            if (absMultiGuestEffectViewModel != null) {
                dataChannel = absMultiGuestEffectViewModel.LLILLJJLI;
            } else {
                dataChannel = null;
            }
            if (treeMap != null && (liveMultiGuestStickerLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveMultiGuestStickerLogManager()) != null) {
                liveMultiGuestStickerLogManager.LJI("props", treeMap, list, dataChannel);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ViewParent parent;
        View view = (View) obj;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        Intrinsics.LJFF(parent, ((C770200UJe) awS626S0100000_12.l0).getFlowLayoutFromXml());
        return Boolean.TRUE;
    }

    public static final Object invoke$49(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        int iIntValue;
        int iIntValue2 = ((Number) obj).intValue();
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = iIntValue2;
        }
        PreviewBannerWidget previewBannerWidget = (PreviewBannerWidget) C0UKC.LJFF(C13LE.LIZ(PreviewBannerWidget.class));
        if (previewBannerWidget != null) {
            previewBannerWidget.I1(iIntValue);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewLiveTabCapsuleColorThemeChangeEvent: ");
        sbLIZ.append(((C770190UJd) awS626S0100000_12.l0).LLLLL);
        sbLIZ.append(", update color: ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(", ");
        sbLIZ.append(num);
        C20441214yg.LIZIZ("VideoModeContainer", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List<ProfileNaviFeature> list;
        List<String> list2 = (List) obj;
        String str = (String) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadNaviAsset: ");
        sbLIZ.append(list2);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("auto_creation", C2188811AlT.LIZIZ(sbLIZ));
        if (list2.isEmpty() && str.length() == 0) {
            C20441214yg.LJ("auto_creation", "uploadNaviAsset failed");
            ((NaviAvatarListPresenter) awS626S0100000_12.l0).LJ();
        } else {
            C768350UCb c768350UCb = ((NaviAvatarListPresenter) awS626S0100000_12.l0).LLJJIII;
            List listSingletonList = null;
            if (c768350UCb != null) {
                UrlModel urlModel = new UrlModel();
                urlModel.uri = str;
                urlModel.urlList = list2;
                c768350UCb.LIZJ = new ProfileNaviStaticImage("webp", null, urlModel);
            }
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            Gson gson = C19748512Ol.LIZJ;
            String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
            C768350UCb c768350UCb2 = ((NaviAvatarListPresenter) awS626S0100000_12.l0).LLJJIII;
            if (c768350UCb2 != null) {
                list = c768350UCb2.LIZIZ;
                ProfileNaviStaticImage profileNaviStaticImage = c768350UCb2.LIZJ;
                if (profileNaviStaticImage != null) {
                    listSingletonList = Collections.singletonList(profileNaviStaticImage);
                }
            } else {
                list = null;
            }
            iHostAction.createNewNavi(GsonProtectorUtils.toJson(gson, new ProfileNaviUploadDataModel(null, strValueOf, "#A5E6FF", list, listSingletonList, 0, 32, null)), new AwS591S0100000_12((NaviAvatarListPresenter) awS626S0100000_12.l0, 91));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$50(kotlin.jvm.internal.AwS626S0100000_12 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r2.l0
            X.0ecL r0 = (X.C1095630ecL) r0
            r0.getClass()
            java.lang.String r2 = "spark_perf_biz"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r3)     // Catch: java.lang.Exception -> L31
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L35
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r2)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L35
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L35
            java.lang.String r0 = "JoinFansClubBiz"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L35:
            r0 = 0
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS626S0100000_12.invoke$50(kotlin.jvm.internal.AwS626S0100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$51(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String string;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj2;
        accessibilityNodeInfoCompat.setClassName(Button.class.getName());
        Context context = ((PerformanceUserCardRootAssem) awS626S0100000_12.l0).getContext();
        if (context != null) {
            string = context.getString(2131823239);
        } else {
            string = null;
        }
        accessibilityNodeInfoCompat.setContentDescription(string);
        return Unit.LIZ;
    }

    public static final Object invoke$52(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0U2N c0u2nUR;
        List<C0U22> list;
        Integer numFQ2;
        TreeMap treeMap = (TreeMap) obj2;
        if (((KaraokeSongListFragment) awS626S0100000_12.l0).isResumed() && (c0u2nUR = ((KaraokeSongListFragment) awS626S0100000_12.l0).UR()) != null && (list = c0u2nUR.LLILZIL.LJFF) != null) {
            KaraokeSongListFragment karaokeSongListFragment = (KaraokeSongListFragment) awS626S0100000_12.l0;
            C0U17 c0u17 = C0U17.LIZ;
            DataChannel dataChannel = karaokeSongListFragment.LLJI;
            long j = karaokeSongListFragment.LLILZLL;
            KaraokeViewModel karaokeViewModel = karaokeSongListFragment.LLILZIL;
            Integer numValueOf = null;
            if (karaokeViewModel != null) {
                numFQ2 = karaokeViewModel.FQ2(karaokeSongListFragment.LLJILJIL);
            } else {
                numFQ2 = null;
            }
            KaraokeViewModel karaokeViewModel2 = karaokeSongListFragment.LLILZIL;
            if (karaokeViewModel2 != null) {
                numValueOf = Integer.valueOf(karaokeViewModel2.HQ2());
            }
            if (!treeMap.isEmpty()) {
                EnumC764770TzH enumC764770TzHLJIIZILJ = C0U17.LJIIZILJ(j);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (C0U22 c0u22 : list) {
                    C0U22 c0u222 = c0u22;
                    if (!c0u222.LJIIJJI() && !c0u222.LJIIL()) {
                        arrayList3.add(c0u22);
                    }
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    C0U23 c0u23 = (C0U23) C13LP.LJJJLZIJ(((C781670UlR) entry.getValue()).LIZ, arrayList3);
                    if (c0u23 != null) {
                        long j2 = c0u23.LIZ;
                        arrayList.add(Integer.valueOf(((C781670UlR) entry.getValue()).LIZ + 1));
                        arrayList2.add(Long.valueOf(j2));
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_song_show");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))) ? 1 : 0), "is_anchor");
                c474500IjALIZ.LJJII(arrayList.toString(), "song_position_set");
                c474500IjALIZ.LJJII(arrayList2.toString(), "music_id_set");
                c474500IjALIZ.LJJII(enumC764770TzHLJIIZILJ.getValue(), "panel");
                c474500IjALIZ.LJJII(C0U17.LIZIZ(j, numFQ2), "panel_second_list");
                c474500IjALIZ.LJJII(C0U17.LIZJ(numValueOf), "user_type");
                c474500IjALIZ.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240210iNX) awS626S0100000_12.l0).LIZJ;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        int length = tuxTextView.getContext().getString(2131836000, "").length();
        String string = tuxTextView.getContext().getString(2131836000, ((C1240210iNX) awS626S0100000_12.l0).LJ);
        int i = iIntValue2 + length;
        int i2 = iIntValue3 + length;
        if (i >= 0 && i2 > i && i2 <= string.length()) {
            C743770TFn c743770TFn = C743770TFn.LIZ;
            List listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            ((C1240210iNX) awS626S0100000_12.l0).getClass();
            c743770TFn.getClass();
            return C743770TFn.LIZ(tuxTextView, string, iIntValue, length, listSingletonList, 61);
        }
        C01GW c01gw = C1222570hv5.LIZ;
        int i3 = ((C1240210iNX) awS626S0100000_12.l0).LIZLLL;
        String strLIZ = C1222570hv5.LIZ(2131755394, i3, Integer.valueOf(i3));
        C743770TFn c743770TFn2 = C743770TFn.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        ((C1240210iNX) awS626S0100000_12.l0).getClass();
        c743770TFn2.getClass();
        return C743770TFn.LIZ(tuxTextView, strLIZ, iIntValue, 0, c13bv, 61);
    }

    public static final Object invoke$54(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List listSingletonList;
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240210iNX) awS626S0100000_12.l0).LJFF;
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        if (iIntValue2 >= 0 && iIntValue3 > iIntValue2 && iIntValue3 <= ((C1240210iNX) awS626S0100000_12.l0).LJI.length()) {
            listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        C743770TFn c743770TFn = C743770TFn.LIZ;
        String str = ((C1240210iNX) awS626S0100000_12.l0).LJI;
        c743770TFn.getClass();
        return C743770TFn.LIZ(tuxTextView, str, iIntValue, 0, listSingletonList, 42);
    }

    public static final Object invoke$55(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List listSingletonList;
        C0Z2Q first;
        CharSequence charSequenceLIZ;
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240120iNO) awS626S0100000_12.l0).LJ;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        if (iIntValue2 >= 0 && iIntValue3 > iIntValue2 && iIntValue3 <= ((C1240120iNO) awS626S0100000_12.l0).LIZJ.length()) {
            listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        Pair<C0Z2Q, Integer> pairLIZ = ((C0ZQ3) ((C1240120iNO) awS626S0100000_12.l0).LJIILJJIL.getValue()).LIZ(tuxTextView, ((C1240120iNO) awS626S0100000_12.l0).LJIIIIZZ);
        if (pairLIZ != null) {
            iIntValue -= pairLIZ.getSecond().intValue();
        }
        C743770TFn c743770TFn = C743770TFn.LIZ;
        String str = ((C1240120iNO) awS626S0100000_12.l0).LIZJ;
        c743770TFn.getClass();
        CharSequence charSequenceLIZ2 = C743770TFn.LIZ(tuxTextView, str, iIntValue, 0, listSingletonList, 61);
        if (pairLIZ != null && (first = pairLIZ.getFirst()) != null && (charSequenceLIZ = first.LIZ(charSequenceLIZ2)) != null) {
            return charSequenceLIZ;
        }
        return charSequenceLIZ2;
    }

    public static final Object invoke$56(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (((C1240120iNO) awS626S0100000_12.l0).LJFF != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(tuxTextView.getContext().getString(((C1240120iNO) awS626S0100000_12.l0).LJFF.intValue()));
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C743770TFn c743770TFn = C743770TFn.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            ((C1240120iNO) awS626S0100000_12.l0).getClass();
            c743770TFn.getClass();
            return C743770TFn.LIZ(tuxTextView, strLIZIZ, iIntValue, 0, c13bv, 61);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$57(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        SpannableString spannableString;
        CharSequence charSequenceLIZ;
        C0Z2Q first;
        CharSequence charSequenceLIZ2;
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240150iNR) awS626S0100000_12.l0).LJFF;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        C1240150iNR c1240150iNR = (C1240150iNR) awS626S0100000_12.l0;
        String str = c1240150iNR.LJ;
        if (str == null) {
            str = "";
        }
        Pair<C0Z2Q, Integer> pairLIZ = ((C0ZQ3) c1240150iNR.LJIIL.getValue()).LIZ(tuxTextView, ((C1240150iNR) awS626S0100000_12.l0).LIZJ);
        if (pairLIZ != null) {
            iIntValue -= pairLIZ.getSecond().intValue();
        }
        if (iIntValue2 >= 0 && iIntValue3 > iIntValue2 && iIntValue3 <= str.length()) {
            C743770TFn c743770TFn = C743770TFn.LIZ;
            List listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)));
            ((C1240150iNR) awS626S0100000_12.l0).getClass();
            c743770TFn.getClass();
            charSequenceLIZ = C743770TFn.LIZ(tuxTextView, str, iIntValue, 0, listSingletonList, 61);
        } else {
            Integer numLIZ = C1308910kAL.LIZ(R.attr.a1r, tuxTextView.getContext());
            if (numLIZ != null) {
                int iIntValue4 = numLIZ.intValue();
                spannableString = new SpannableString(str);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue4), 0, str.length(), 33);
            } else {
                spannableString = new SpannableString(str);
            }
            C743770TFn c743770TFn2 = C743770TFn.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            ((C1240150iNR) awS626S0100000_12.l0).getClass();
            c743770TFn2.getClass();
            charSequenceLIZ = C743770TFn.LIZ(tuxTextView, spannableString, iIntValue, 0, c13bv, 61);
        }
        if (pairLIZ != null && (first = pairLIZ.getFirst()) != null && (charSequenceLIZ2 = first.LIZ(charSequenceLIZ)) != null) {
            return charSequenceLIZ2;
        }
        return charSequenceLIZ;
    }

    public static final Object invoke$58(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (((C1240150iNR) awS626S0100000_12.l0).LJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(tuxTextView.getContext().getString(((C1240150iNR) awS626S0100000_12.l0).LJI.intValue()));
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C743770TFn c743770TFn = C743770TFn.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            ((C1240150iNR) awS626S0100000_12.l0).getClass();
            c743770TFn.getClass();
            return C743770TFn.LIZ(tuxTextView, strLIZIZ, iIntValue, 0, c13bv, 61);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$59(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        SpannableString spannableString;
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240160iNS) awS626S0100000_12.l0).LIZLLL;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        if (iIntValue2 >= 0 && iIntValue3 > iIntValue2 && iIntValue3 <= ((C1240160iNS) awS626S0100000_12.l0).LIZJ.length()) {
            C743770TFn c743770TFn = C743770TFn.LIZ;
            String str = ((C1240160iNS) awS626S0100000_12.l0).LIZJ;
            List listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)));
            ((C1240160iNS) awS626S0100000_12.l0).getClass();
            c743770TFn.getClass();
            return C743770TFn.LIZ(tuxTextView, str, iIntValue, 0, listSingletonList, 61);
        }
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a1r, tuxTextView.getContext());
        if (numLIZ != null) {
            C1240160iNS c1240160iNS = (C1240160iNS) awS626S0100000_12.l0;
            int iIntValue4 = numLIZ.intValue();
            spannableString = new SpannableString(c1240160iNS.LIZJ);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue4), 0, c1240160iNS.LIZJ.length(), 33);
        } else {
            spannableString = new SpannableString(((C1240160iNS) awS626S0100000_12.l0).LIZJ);
        }
        C743770TFn c743770TFn2 = C743770TFn.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        ((C1240160iNS) awS626S0100000_12.l0).getClass();
        c743770TFn2.getClass();
        return C743770TFn.LIZ(tuxTextView, spannableString, iIntValue, 0, c13bv, 61);
    }

    public static final Object invoke$6(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        LiveEffect liveEffect = (LiveEffect) obj2;
        C768560UCw c768560UCw = ((LivePreviewableEffectSheet) awS626S0100000_12.l0).LLLFF;
        if (c768560UCw != null) {
            c768560UCw.LIZIZ(liveEffect);
        }
        InterfaceC768510UCr interfaceC768510UCr = ((LivePreviewableEffectSheet) awS626S0100000_12.l0).LLLIIIL;
        if (interfaceC768510UCr != null) {
            interfaceC768510UCr.LIZ(liveEffect);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List listSingletonList;
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240220iNY) awS626S0100000_12.l0).LJ;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        if (iIntValue2 >= 0 && iIntValue3 > iIntValue2 && iIntValue3 <= ((C1240220iNY) awS626S0100000_12.l0).LJI.length()) {
            listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        C743770TFn c743770TFn = C743770TFn.LIZ;
        String str = ((C1240220iNY) awS626S0100000_12.l0).LJI;
        c743770TFn.getClass();
        return C743770TFn.LIZ(tuxTextView, str, iIntValue, 0, listSingletonList, 61);
    }

    public static final Object invoke$61(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (((C1240160iNS) awS626S0100000_12.l0).LJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(tuxTextView.getContext().getString(((C1240160iNS) awS626S0100000_12.l0).LJ.intValue()));
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C743770TFn c743770TFn = C743770TFn.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            ((C1240160iNS) awS626S0100000_12.l0).getClass();
            c743770TFn.getClass();
            return C743770TFn.LIZ(tuxTextView, strLIZIZ, iIntValue, 0, c13bv, 61);
        }
        return null;
    }

    public static final Object invoke$62(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        List listSingletonList;
        TuxTextView tuxTextView = (TuxTextView) obj;
        int iIntValue = ((Number) obj2).intValue();
        Pair<Integer, Integer> pair = ((C1240220iNY) awS626S0100000_12.l0).LIZLLL;
        if (pair == null) {
            pair = new Pair<>(-1, -1);
        }
        int iIntValue2 = pair.getFirst().intValue();
        int iIntValue3 = pair.getSecond().intValue();
        if (iIntValue2 >= 0 && iIntValue3 > iIntValue2 && iIntValue3 <= ((C1240220iNY) awS626S0100000_12.l0).LJFF.length()) {
            listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)));
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        C743770TFn c743770TFn = C743770TFn.LIZ;
        String str = ((C1240220iNY) awS626S0100000_12.l0).LJFF;
        c743770TFn.getClass();
        return C743770TFn.LIZ(tuxTextView, str, iIntValue, 0, listSingletonList, 42);
    }

    public static final Object invoke$63(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int iLJJZ = ((PreviewStickerHelper) awS626S0100000_12.l0).LLILZIL.LJJZ(str, str2);
        InterfaceC769000UEo interfaceC769000UEoLIZIZ = C768460UCm.LIZIZ();
        interfaceC769000UEoLIZIZ.rr(str);
        interfaceC769000UEoLIZIZ.LIZIZ(str2);
        return Integer.valueOf(iLJJZ);
    }

    public static final Object invoke$64(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        C779880UiY c779880UiY = (C779880UiY) awS626S0100000_12.l0;
        if (c779880UiY.LJIIJJI.LIZLLL) {
            C778030UfZ c778030UfZ = c779880UiY.LIZ;
            C779880UiY.LJIILJJIL(c778030UfZ, ((WindowManager.LayoutParams) c778030UfZ.LIZ.LIZJ).x, iIntValue, null);
        } else {
            c779880UiY.LIZ.LIZ.LJIILJJIL(iIntValue);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$65(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        View view;
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT()) {
            if (obj != EnumC964170bCJ.NONE) {
                if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT() && (view = (View) awS626S0100000_12.l0) != null) {
                    C786410Ut5.T4(view, 0.34f);
                }
            } else {
                View view2 = (View) awS626S0100000_12.l0;
                if (view2 != null) {
                    C786410Ut5.T4(view2, 1.0f);
                }
            }
        } else if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT()) {
            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xz0()) {
                View view3 = (View) awS626S0100000_12.l0;
                if (view3 != null) {
                    C786410Ut5.T4(view3, 0.34f);
                }
            } else {
                View view4 = (View) awS626S0100000_12.l0;
                if (view4 != null) {
                    C786410Ut5.T4(view4, 1.0f);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0U7R c0u7r = C0U7R.LIZ;
        C766590U5h c766590U5h = (C766590U5h) awS626S0100000_12.l0;
        C0U7R.LJIIJJI(c766590U5h.LIZLLL, (TreeMap) obj2, c766590U5h.LJIILJJIL.LL);
        return Unit.LIZ;
    }

    public static final Object invoke$67(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0U7R c0u7r = C0U7R.LIZ;
        C0U6S c0u6s = (C0U6S) awS626S0100000_12.l0;
        C0U7R.LJIIJJI(c0u6s.LIZIZ, (TreeMap) obj2, c0u6s.LJII.LL);
        return Unit.LIZ;
    }

    public static final Object invoke$68(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((C0U7H) awS626S0100000_12.l0).LJI("click", "allow");
        C0U7R.LIZ.LJFF("allow ai analysis", "");
        InterfaceC772190UQv.e4.LJFF(Boolean.TRUE);
        ((C0U7H) awS626S0100000_12.l0).LJII();
        return Unit.LIZ;
    }

    public static final Object invoke$69(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((C0U7H) awS626S0100000_12.l0).LJI("click", "not_now");
        C0U7R.LIZ.LJFF("not allow ai analysis", "");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        return Integer.valueOf(((BaseMultiGuestStickerView) awS626S0100000_12.l0).LLJ.LJIILLIIL((String) obj, (String) obj2));
    }

    public static final Object invoke$70(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((C784630UqD) awS626S0100000_12.l0).getCallback().LJ(((Number) obj).intValue(), ((Number) obj2).intValue());
        return Unit.LIZ;
    }

    public static final Object invoke$71(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            ((TakoMultipleSelectVM) awS626S0100000_12.l0).AQ2();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$72(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        Boolean bool;
        TreeMap<Integer, C781670UlR> treeMap = (TreeMap) obj2;
        C0U57 c0u57 = (C0U57) awS626S0100000_12.l0;
        C0U58 c0u58 = c0u57.LLJJL;
        if (c0u58 != null) {
            List<Effect> list = c0u57.LLJJJJJIL.LL;
            DataChannel dataChannel = c0u57.LLILLJJLI;
            if (dataChannel != null) {
                bool = (Boolean) dataChannel.gg0(C755530TkN.class);
            } else {
                bool = null;
            }
            c0u58.LIZLLL(treeMap, list, bool);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$73(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TreeMap treeMap = (TreeMap) obj2;
        SoundEffectFragment soundEffectFragment = (SoundEffectFragment) awS626S0100000_12.l0;
        DataChannel dataChannel = soundEffectFragment.dataChannel;
        C761590Tu9 c761590Tu9 = soundEffectFragment.LLIZLLLIL;
        if (c761590Tu9 == null) {
            c761590Tu9 = null;
        }
        C761680TuI.LIZLLL(dataChannel, treeMap, c761590Tu9.LL, EnumC761670TuH.NORMAL);
        return Unit.LIZ;
    }

    public static final Object invoke$74(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        TreeMap treeMap = (TreeMap) obj2;
        SoundEffectMiniWidget soundEffectMiniWidget = (SoundEffectMiniWidget) awS626S0100000_12.l0;
        DataChannel dataChannel = soundEffectMiniWidget.dataChannel;
        C761610TuB c761610TuB = soundEffectMiniWidget.LLILZLL;
        if (c761610TuB == null) {
            c761610TuB = null;
        }
        C761680TuI.LIZLLL(dataChannel, treeMap, c761610TuB.LL, EnumC761670TuH.SHORTCUT);
        return Unit.LIZ;
    }

    public static final Object invoke$75(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C780600Uji c780600Uji = (C780600Uji) obj;
        if (!C500260Jjc.LJJJI((Boolean) DataChannelGlobal.LLILZ.gg0(C951990asf.class))) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new BroadcastCountDownWidget(((InterfaceC780590Ujh) awS626S0100000_12.l0).GN()), null, Integer.valueOf(R.id.ez2), null, null, 506));
        } else {
            ((InterfaceC780590Ujh) awS626S0100000_12.l0).GN().LIZ();
        }
        if (!((InterfaceC780590Ujh) awS626S0100000_12.l0).p4().isOfficial()) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, C781270Ukn.LJJIIZI().S92(), Integer.valueOf(R.id.user_info_container), new Object[]{new C1078030e9x(SystemClock.elapsedRealtime())}, null, 489));
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, C781270Ukn.LJIJJLI().jm1(true), Integer.valueOf(R.id.ba7), new Object[]{new C780920UkE(SystemClock.elapsedRealtime())}, null, 489));
        }
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new LiveCloseWidget(), null, Integer.valueOf(R.id.mvo), null, null, 506));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).bP2(null, ((InterfaceC780590Ujh) awS626S0100000_12.l0).RG()), Integer.valueOf(R.id.y6v), null, null, 481));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new LiveCenterEntranceWidget(), null, Integer.valueOf(R.id.mut), null, null, 506));
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new LiveCenterTopNoticeWidget(), null, Integer.valueOf(R.id.mvk), null, null, 506));
        }
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(C781270Ukn.LJJI().A30(), null, null, null, null, 510));
        C780600Uji.LIZ(c780600Uji, new AwS413S0200000_12((InterfaceC780590Ujh) awS626S0100000_12.l0, c780600Uji, 72));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$76(kotlin.jvm.internal.AwS626S0100000_12 r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS626S0100000_12.invoke$76(kotlin.jvm.internal.AwS626S0100000_12, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.bytedance.ies.sdk.widgets.LiveWidget, java.lang.Class, java.lang.Integer, java.lang.Object[], kotlin.jvm.internal.AwS591S0100000_12] */
    public static final Object invoke$77(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        RoomAuthStatus roomAuthStatus;
        C780600Uji c780600Uji = (C780600Uji) obj;
        View viewVo = ((InterfaceC780590Ujh) awS626S0100000_12.l0).vo("pause_live_bg");
        Map<String, Object> map = C1338270kvh.LIZ;
        if (viewVo != null) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new PauseLiveWidget(viewVo), null, Integer.valueOf(R.id.q41), null, null, 506));
        }
        View viewVo2 = ((InterfaceC780590Ujh) awS626S0100000_12.l0).vo("captcha_live_bg");
        if (viewVo2 != null) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new CaptchaLiveWidget(viewVo2), null, Integer.valueOf(R.id.dc5), null, null, 506));
        }
        LiveWidget liveWidget = null;
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).aF(), Integer.valueOf(R.id.ea1), null, null, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(C781270Ukn.LJIL().sQ2(), null, Integer.valueOf(R.id.myj), null, null, 506));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(C781270Ukn.LJIL().ye0(true, ((InterfaceC780590Ujh) awS626S0100000_12.l0).gH()), null, Integer.valueOf(R.id.n2m), null, null, 506));
        if (!((InterfaceC780590Ujh) awS626S0100000_12.l0).p4().isStar()) {
            liveWidget = null;
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, TaskFinishAnimationWidget.class, Integer.valueOf(R.id.b2t), null, null, 505));
        }
        LiveWidget liveWidget2 = liveWidget;
        Object[] objArr = liveWidget;
        ?? r13 = liveWidget;
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(liveWidget2, C781270Ukn.LJIL().tv1(), Integer.valueOf(R.id.j2h), objArr, r13, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(((IRevenueService) C1161920gLG.LIZJ(IRevenueService.class)).getLiveNameFrameWidget(), r13, r13, r13, r13, 510));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(r13, ((IPinCardService) C781270Ukn.LJJJJJ.getValue()).Zd0(), Integer.valueOf(R.id.n3l), r13, r13, 505));
        if (C162100jj.LIZIZ(((InterfaceC780590Ujh) awS626S0100000_12.l0).RG())) {
            ((IQAService) C1161920gLG.LIZJ(IQAService.class)).y02();
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectWidget(), r13, Integer.valueOf(R.id.myo), r13, r13, 506));
        }
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(r13, ((IUnityAnimationService) C1161920gLG.LIZJ(IUnityAnimationService.class)).BI0(), r13, r13, r13, 509));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(r13, C781270Ukn.LJJII().getBarrageWidget(), Integer.valueOf(R.id.vku), r13, r13, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(r13, C781270Ukn.LJJII().getFrameSlotWidget(), Integer.valueOf(R.id.vl5), r13, r13, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(r13, C781270Ukn.LJJII().getFrameL2SlotWidget(), Integer.valueOf(R.id.ik5), r13, r13, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(r13, C781270Ukn.LJJII().getFreeFrameSlotWidget(), Integer.valueOf(R.id.il0), r13, r13, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, C781270Ukn.LJJII().getECScriptSlotWidget(), Integer.valueOf(R.id.gfq), null, null, 505));
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, C781270Ukn.LJJII().getECBillboardBroadcastSlotWidget(), Integer.valueOf(R.id.gf1), null, null, 505));
        LiveEventStickerWrapperWidget liveEventStickerWrapperWidgetKS = ((ILiveEventStickerService) C1161920gLG.LIZJ(ILiveEventStickerService.class)).kS(true);
        if (liveEventStickerWrapperWidgetKS != null) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(liveEventStickerWrapperWidgetKS, null, Integer.valueOf(R.id.mxm), null, null, 506));
        }
        if (!LiveExtendScreenOfflineSetting.INSTANCE.getValue()) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, ExtendedScreenWidget.class, Integer.valueOf(R.id.mue), null, new AwS591S0100000_12((InterfaceC780590Ujh) awS626S0100000_12.l0, 1193), 249));
        }
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, ((IMicRoomService) C781270Ukn.LJJIJL.getValue()).Pl0(), null, null, null, 509));
        C780600Uji.LIZ(c780600Uji, new AwS413S0200000_12((InterfaceC780590Ujh) awS626S0100000_12.l0, c780600Uji, 74));
        if (GiftGuideASRSetting.INSTANCE.isEnable() && (roomAuthStatus = ((InterfaceC780590Ujh) awS626S0100000_12.l0).p4().getRoomAuthStatus()) != null && roomAuthStatus.enableGift && !GiftGuideASRBlockListSetting.INSTANCE.getValue().contains(C770630UKv.LIZ())) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(((ILiveAsrHostService) C1161920gLG.LIZJ(ILiveAsrHostService.class)).Oa2(), null, null, null, null, 510));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$78(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        Boolean bool;
        C780600Uji c780600Uji = (C780600Uji) obj;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            InterfaceC780590Ujh interfaceC780590Ujh = (InterfaceC780590Ujh) awS626S0100000_12.l0;
            C780620Ujk c780620Ujk = c780600Uji.LIZ;
            EnumC780830Uk5 enumC780830Uk5 = c780600Uji.LIZIZ;
            EnumC2011707uN enumC2011707uN = c780600Uji.LIZJ;
            VideoBroadcastInteractionFragment videoBroadcastInteractionFragmentSO = interfaceC780590Ujh.sO();
            videoBroadcastInteractionFragmentSO.getClass();
            c780620Ujk.LIZ(enumC780830Uk5, enumC2011707uN, new C780630Ujl(new MockImageVideoWidget(videoBroadcastInteractionFragmentSO), null, Integer.valueOf(R.id.oin), null, null, 506));
        }
        if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) && ((bool = C0IHY.LIZ) == null || Intrinsics.LJFF(bool, Boolean.TRUE))) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new LiveAnchorDebugInfoWidget(), null, Integer.valueOf(R.id.mtr), null, null, 506));
        }
        if (TestDisableMixStreamTypeSetting.INSTANCE.getValue()) {
            c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(null, C781270Ukn.LJIL().V80(), Integer.valueOf(R.id.waq), null, null, 505));
        }
        c780600Uji.LIZ.LIZ(c780600Uji.LIZIZ, c780600Uji.LIZJ, new C780630Ujl(new EndWidget(), null, Integer.valueOf(R.id.h5d), null, null, 506));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$8(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        C0UC5 c0uc5 = C0UC5.LIZ;
        MultiGuestStickerListView multiGuestStickerListView = (MultiGuestStickerListView) awS626S0100000_12.l0;
        c0uc5.LJI("props", (TreeMap) obj2, multiGuestStickerListView.LLJJ.LL, multiGuestStickerListView.LLILZLL);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS626S0100000_12 awS626S0100000_12, Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((TextView) ((View) awS626S0100000_12.l0).findViewById(R.id.eu1)).setText((SpannableStringBuilder) obj);
        return Unit.LIZ;
    }
}
