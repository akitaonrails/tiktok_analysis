package kotlin.jvm.internal;

import X.AbstractC1102390enF;
import X.AbstractC1133500fbQ;
import X.AbstractC1133510fbR;
import X.AbstractC19994813Le;
import X.C01CC;
import X.C098200Yq;
import X.C098J;
import X.C09AY;
import X.C0C64;
import X.C0PEM;
import X.C0UIM;
import X.C1080950eEf;
import X.C1086790eO5;
import X.C1092940eY0;
import X.C1093050eYB;
import X.C1093060eYC;
import X.C1094760eaw;
import X.C1094780eay;
import X.C1094790eaz;
import X.C1100770ekd;
import X.C1102070emj;
import X.C1102370enD;
import X.C1102400enG;
import X.C1102440enK;
import X.C1104590eqn;
import X.C1104710eqz;
import X.C1104720er0;
import X.C1106560ety;
import X.C1106570etz;
import X.C1107810evz;
import X.C1108870exh;
import X.C1112280f3C;
import X.C1113970f5v;
import X.C1119470fEn;
import X.C1120620fGe;
import X.C1123440fLC;
import X.C1128450fTH;
import X.C1128840fTu;
import X.C1129290fUd;
import X.C1129690fVH;
import X.C1130180fW4;
import X.C1131800fYg;
import X.C1134410fct;
import X.C1134640fdG;
import X.C1135080fdy;
import X.C1138360fjG;
import X.C1138630fjh;
import X.C1138640fji;
import X.C1138660fjk;
import X.C1138670fjl;
import X.C1138680fjm;
import X.C1138720fjq;
import X.C1141930fp1;
import X.C1143780fs0;
import X.C1145050fu3;
import X.C1148670fzt;
import X.C1150020g24;
import X.C1161920gLG;
import X.C11NJ;
import X.C1338270kvh;
import X.C13LP;
import X.C13LQ;
import X.C14KS;
import X.C1697810uHb;
import X.C189200o6;
import X.C194310110i;
import X.C19748512Ol;
import X.C1DFH;
import X.C20337914i1;
import X.C2043807zY;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2268791DrB;
import X.C2273311DyT;
import X.C2296808zG;
import X.C418440Gaw;
import X.C439101nJ;
import X.C472970Igh;
import X.C497740JfY;
import X.C500260Jjc;
import X.C603820NmG;
import X.C766270U4b;
import X.C781880Ulm;
import X.C786410Ut5;
import X.C810670Vr7;
import X.C814420VxA;
import X.C915980Zwa;
import X.C976480bWA;
import X.EnumC1102740eno;
import X.InterfaceC1085950eMj;
import X.InterfaceC1086400eNS;
import X.InterfaceC1093910eZZ;
import X.InterfaceC1094160eZy;
import X.InterfaceC1094820eb2;
import X.InterfaceC1094860eb6;
import X.InterfaceC1096960eeU;
import X.InterfaceC1101100elA;
import X.InterfaceC1132950faX;
import X.InterfaceC1138800fjy;
import X.InterfaceC1139050fkN;
import X.InterfaceC1791930wjP;
import X.InterfaceC1944407jW;
import X.InterfaceC292601Bk;
import X.InterfaceC973730bRj;
import Y.ARunnableS1S0100200_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.BarrageAdjustmentEvent;
import com.bytedance.android.live.LiveMockLiveCenterEvent;
import com.bytedance.android.live.OpenGiftVerifyEvent;
import com.bytedance.android.live.PortraitShortTouchPreviewEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.ai.api.pitaya.feature.ILiveFeaturesService;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.gift.GiftDialogStatusChangeEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.gift.SendGiftSuccessEvent;
import com.bytedance.android.live.gift.VideoGiftStartEvent;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.AllLinkMicWindowRenderedEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractCallPlayerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.event.LivePauseViewSizeChangeEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.api.event.MultiGuestPauseViewShowEvent;
import com.bytedance.android.live.liveinteract.api.event.PlayerChangeLayoutParamEvent;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.match.business.event.MatchAudienceWidgetLoaded;
import com.bytedance.android.live.liveinteract.multiguestv3.SelfOnlineStateChannel;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.MainScreenPinnedWidgetLoadedChannel;
import com.bytedance.android.live.publicscreen.api.PublicScreenLoadedEvent;
import com.bytedance.android.live.publicscreen.api.event.CommentCountChangeEvent;
import com.bytedance.android.live.publicscreen.impl.setting.LiveAudienceWaveAnimationOptSetting;
import com.bytedance.android.live.room.CommentComboTrayEvent;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.live.setting.LiveStreamPdpPanelAdapterSetting;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.LockScreenEvent;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.level.event.PublicLevelUpMessageEvent;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.chatroom.event.DonationStickerAnchorEvent;
import com.bytedance.android.livesdk.chatroom.event.LiveRealTimeSurveyEvent;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkGeustWidgetDestroyChannel;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkLayoutDataChannel;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.dataChannel.AudienceShowSwitchDefinitionEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionStateEvent;
import com.bytedance.android.livesdk.dataChannel.ChangeLoadingViewPosition;
import com.bytedance.android.livesdk.dataChannel.ECStartClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.GameAutoRotateVideoTriggerEvent;
import com.bytedance.android.livesdk.dataChannel.HideParentCloseEvent;
import com.bytedance.android.livesdk.dataChannel.IsFromPortraitData;
import com.bytedance.android.livesdk.dataChannel.PreCreateLivePlayerEvent;
import com.bytedance.android.livesdk.dataChannel.PreLoadLiveBGImageEvent;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RevenueAuthSuccessEvent;
import com.bytedance.android.livesdk.dataChannel.RoomNotifyEvent;
import com.bytedance.android.livesdk.dataChannel.SelectPollVoteEvent;
import com.bytedance.android.livesdk.dataChannel.ShowLoadingViewEvent;
import com.bytedance.android.livesdk.dataChannel.TopEffectEvent;
import com.bytedance.android.livesdk.dataChannel.VideoViewMeasureEvent;
import com.bytedance.android.livesdk.event.LandscapeFullScreenEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftTrayWidgetV2;
import com.bytedance.android.livesdk.gift.event.LiveGiftSuspensionEvent;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.ugtask.UgTaskWidgetV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.widgets.RevenueStrategyWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastToolbarLimitCountSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedPublicScreenMaxMessageConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightPageRefactorSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.game.GameLiveGuessPointsViewDelaySetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftMsgBufferControlOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCollaborativeTriggerGiftIdSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftConfigParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDebugPanelSettings;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfDiagnosisSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.LiveLevelSystemResourceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicDynamicLayoutMediaSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAudienceDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostWidgetWindowLayoutCacheSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveRoomCheckAliveConfig;
import com.bytedance.android.livesdk.livesetting.message.LiveRoomCheckAliveSetting;
import com.bytedance.android.livesdk.livesetting.model.GeckoUnDelete;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsExpirationTimeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.pcs.LivePcsGenericApiMonitorSamplingSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterTaskScheduleExp;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateRetrySetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLastNPerfFeatureSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFullLinkPerfSendExp;
import com.bytedance.android.livesdk.livesetting.performance.LivePublicScreenVisibleLogSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveAdaptEpiToFeatureCenterExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFirstMessagesReleaseSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GiftGuideLandscapeNotSupportTypes;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.UgTaskDetailPageSourceSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveDrawGuessExitMessageCountdownSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyFrequencyControlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyTypeNameMappingSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostConsumeConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostEnabledSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostProduceConfig;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentProtectSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomBoostExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedConsumeFeatureSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePinchZoomConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomByDeviceExp;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomByDeviceExpConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchLiveMemOpt;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.performance.power.WatchRefreshRateSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.settings.LivePlayerLoggerDisableExp;
import com.bytedance.android.livesdk.settings.LivePlayerLoggerTaskScheduleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin;
import com.bytedance.android.livesdkapi.avoidance.setting.LiveConflictControlDefaultSetting;
import com.bytedance.android.livesdkapi.depend.event.LiveIsHavingPinCardData;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyComponentAvoidRuleV2;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyQuota;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.livestrategy.ILiveStrategyCenterService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.HighlightPrePullStreamConfig;
import com.ss.android.ugc.aweme.ab.SmartLivePreviewCTADisplayConfig;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.LocationSlardarEventMonitorSettings;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class AFwS205S0000000_17 extends C09AY implements Function0 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(403);
    public final int $t;

    public static AFwS205S0000000_17 get$arr$(int i) {
        AFwS205S0000000_17 aFwS205S0000000_17 = (AFwS205S0000000_17) arr$.get(i);
        if (aFwS205S0000000_17 != null) {
            return aFwS205S0000000_17;
        }
        arr$.compareAndSet(i, null, new AFwS205S0000000_17(i));
        return (AFwS205S0000000_17) arr$.get(i);
    }

    public static final Object invoke$153(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new int[2];
    }

    public static final Object invoke$154(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new float[4];
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$163(this);
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$165(this);
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$167(this);
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$170(this);
            case 171:
                return invoke$171(this);
            case 172:
                return invoke$172(this);
            case 173:
                return invoke$173(this);
            case 174:
                return invoke$174(this);
            case 175:
                return invoke$175(this);
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$179(this);
            case 180:
                return invoke$180(this);
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$182(this);
            case 183:
                return invoke$183(this);
            case 184:
                return invoke$184(this);
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$188(this);
            case 189:
                return invoke$189(this);
            case 190:
                return invoke$190(this);
            case 191:
                return invoke$191(this);
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$195(this);
            case 196:
                return invoke$196(this);
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$198(this);
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$200(this);
            case 201:
                return invoke$201(this);
            case 202:
                return invoke$202(this);
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$205(this);
            case 206:
                return invoke$206(this);
            case 207:
                return invoke$207(this);
            case 208:
                return invoke$208(this);
            case 209:
                return invoke$209(this);
            case 210:
                return invoke$210(this);
            case 211:
                return invoke$211(this);
            case 212:
                return invoke$212(this);
            case 213:
                return invoke$213(this);
            case 214:
                return invoke$214(this);
            case 215:
                return invoke$215(this);
            case 216:
                return invoke$216(this);
            case 217:
                return invoke$217(this);
            case 218:
                return invoke$218(this);
            case 219:
                return invoke$219(this);
            case 220:
                return invoke$220(this);
            case 221:
                return invoke$221(this);
            case 222:
                return invoke$222(this);
            case 223:
                return invoke$223(this);
            case 224:
                return invoke$224(this);
            case 225:
                return invoke$225(this);
            case 226:
                return invoke$226(this);
            case 227:
                return invoke$227(this);
            case 228:
                return invoke$228(this);
            case 229:
                return invoke$229(this);
            case 230:
                return invoke$230(this);
            case 231:
                return invoke$231(this);
            case 232:
                return invoke$232(this);
            case 233:
                return invoke$233(this);
            case 234:
                return invoke$234(this);
            case 235:
                return invoke$235(this);
            case 236:
                return invoke$236(this);
            case 237:
                return invoke$237(this);
            case 238:
                return invoke$238(this);
            case 239:
                return invoke$239(this);
            case 240:
                return invoke$240(this);
            case 241:
                return invoke$241(this);
            case 242:
                return invoke$242(this);
            case 243:
                return invoke$243(this);
            case 244:
                return invoke$244(this);
            case 245:
                return invoke$245(this);
            case 246:
                return invoke$246(this);
            case 247:
                return invoke$247(this);
            case 248:
                return invoke$248(this);
            case 249:
                return invoke$249(this);
            case 250:
                return invoke$250(this);
            case 251:
                return invoke$251(this);
            case 252:
                return invoke$252(this);
            case 253:
                return invoke$253(this);
            case 254:
                return invoke$254(this);
            case 255:
                return invoke$255(this);
            case 256:
                return invoke$256(this);
            case 257:
                return invoke$257(this);
            case 258:
                return invoke$258(this);
            case 259:
                return invoke$259(this);
            case 260:
                return invoke$260(this);
            case 261:
                return invoke$261(this);
            case 262:
                return invoke$262(this);
            case 263:
                return invoke$263(this);
            case 264:
                return invoke$264(this);
            case 265:
                return invoke$265(this);
            case 266:
                return invoke$266(this);
            case 267:
                return invoke$267(this);
            case 268:
                return invoke$268(this);
            case 269:
                return invoke$269(this);
            case 270:
                return invoke$270(this);
            case 271:
                return invoke$271(this);
            case 272:
                return invoke$272(this);
            case 273:
                return invoke$273(this);
            case 274:
                return invoke$274(this);
            case 275:
                return invoke$275(this);
            case 276:
                return invoke$276(this);
            case 277:
                return invoke$277(this);
            case 278:
                return invoke$278(this);
            case 279:
                return invoke$279(this);
            case 280:
                return invoke$280(this);
            case 281:
                return invoke$281(this);
            case 282:
                return invoke$282(this);
            case 283:
                return invoke$283(this);
            case 284:
                return invoke$284(this);
            case 285:
                return invoke$285(this);
            case 286:
                return invoke$286(this);
            case 287:
                return invoke$287(this);
            case 288:
                return invoke$288(this);
            case 289:
                return invoke$289(this);
            case 290:
                return invoke$290(this);
            case 291:
                return invoke$291(this);
            case 292:
                return invoke$292(this);
            case 293:
                return invoke$293(this);
            case 294:
                return invoke$294(this);
            case 295:
                return invoke$295(this);
            case 296:
                return invoke$296(this);
            case 297:
                return invoke$297(this);
            case 298:
                return invoke$298(this);
            case 299:
                return invoke$299(this);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this);
            case 301:
                return invoke$301(this);
            case 302:
                return invoke$302(this);
            case 303:
                return invoke$303(this);
            case 304:
                return invoke$304(this);
            case 305:
                return invoke$305(this);
            case 306:
                return invoke$306(this);
            case 307:
                return invoke$307(this);
            case 308:
                return invoke$308(this);
            case 309:
                return invoke$309(this);
            case 310:
                return invoke$310(this);
            case 311:
                return invoke$311(this);
            case 312:
                return invoke$312(this);
            case 313:
                return invoke$313(this);
            case 314:
                return invoke$314(this);
            case 315:
                return invoke$315(this);
            case 316:
                return invoke$316(this);
            case 317:
                return invoke$317(this);
            case 318:
                return invoke$318(this);
            case 319:
                return invoke$319(this);
            case 320:
                return invoke$320(this);
            case 321:
                return invoke$321(this);
            case 322:
                return invoke$322(this);
            case 323:
                return invoke$323(this);
            case 324:
                return invoke$324(this);
            case 325:
                return invoke$325(this);
            case 326:
                return invoke$326(this);
            case 327:
                return invoke$327(this);
            case 328:
                return invoke$328(this);
            case 329:
                return invoke$329(this);
            case 330:
                return invoke$330(this);
            case 331:
                return invoke$331(this);
            case 332:
                return invoke$332(this);
            case 333:
                return invoke$333(this);
            case 334:
                return invoke$334(this);
            case 335:
                return invoke$335(this);
            case 336:
                return invoke$336(this);
            case 337:
                return invoke$337(this);
            case 338:
                return invoke$338(this);
            case 339:
                return invoke$339(this);
            case 340:
                return invoke$340(this);
            case 341:
                return invoke$341(this);
            case 342:
                return invoke$342(this);
            case 343:
                return invoke$343(this);
            case 344:
                return invoke$344(this);
            case 345:
                return invoke$345(this);
            case 346:
                return invoke$346(this);
            case 347:
                return invoke$347(this);
            case 348:
                return invoke$348(this);
            case 349:
                return invoke$349(this);
            case 350:
                return invoke$350(this);
            case 351:
                return invoke$351(this);
            case 352:
                return invoke$352(this);
            case 353:
                return invoke$353(this);
            case 354:
                return invoke$354(this);
            case 355:
                return invoke$355(this);
            case 356:
                return invoke$356(this);
            case 357:
                return invoke$357(this);
            case 358:
                return invoke$358(this);
            case 359:
                return invoke$359(this);
            case 360:
                return invoke$360(this);
            case 361:
                return invoke$361(this);
            case 362:
                return invoke$362(this);
            case 363:
                return invoke$363(this);
            case 364:
                return invoke$364(this);
            case 365:
                return invoke$365(this);
            case 366:
                return invoke$366(this);
            case 367:
                return invoke$367(this);
            case 368:
                return invoke$368(this);
            case 369:
                return invoke$369(this);
            case 370:
                return invoke$370(this);
            case 371:
                return invoke$371(this);
            case 372:
                return invoke$372(this);
            case 373:
                return invoke$373(this);
            case 374:
                return invoke$374(this);
            case 375:
                return invoke$375(this);
            case 376:
                return invoke$376(this);
            case 377:
                return invoke$377(this);
            case 378:
                return invoke$378(this);
            case 379:
                return invoke$379(this);
            case 380:
                return invoke$380(this);
            case 381:
                return invoke$381(this);
            case 382:
                return invoke$382(this);
            case 383:
                return invoke$383(this);
            case 384:
                return invoke$384(this);
            case 385:
                return invoke$385(this);
            case 386:
                return invoke$386(this);
            case 387:
                return invoke$387(this);
            case 388:
                return invoke$388(this);
            case 389:
                return invoke$389(this);
            case 390:
                return invoke$390(this);
            case 391:
                return invoke$391(this);
            case 392:
                return invoke$392(this);
            case 393:
                return invoke$393(this);
            case 394:
                return invoke$394(this);
            case 395:
                return invoke$395(this);
            case 396:
                return invoke$396(this);
            case 397:
                return invoke$397(this);
            case 398:
                return invoke$398(this);
            case 399:
                return invoke$399(this);
            case 400:
                return invoke$400(this);
            case 401:
                return invoke$401(this);
            case 402:
                return invoke$402(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS205S0000000_17(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1138360fjG();
    }

    public static final Object invoke$1(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IEPIStrategyService.class);
    }

    public static final Object invoke$10(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IFansClubService.class);
    }

    public static final Object invoke$100(AFwS205S0000000_17 aFwS205S0000000_17) {
        C1102070emj c1102070emj = C1102070emj.LIZ;
        List<MsgNotifyComponentAvoidRuleV2> list = LiveConflictControlDefaultSetting.getValue().componentRuleListV2;
        c1102070emj.getClass();
        return C1102070emj.LIZJ(list);
    }

    public static final Object invoke$101(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$102(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new Rect();
    }

    public static final Object invoke$103(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(LiveLastNPerfFeatureSetting.INSTANCE.getValue().lastN);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$104(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$105(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C13LP.LLIIJI(LivePlayerLoggerDisableExp.value.disableKeys);
    }

    public static final Object invoke$106(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C13LP.LLIIJI(LivePlayerLoggerTaskScheduleSetting.value.disableKeys);
    }

    public static final Object invoke$107(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LJIIJJI("sticker guide no shown by downgrade");
        return Unit.LIZ;
    }

    public static final Object invoke$108(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C11NJ();
    }

    public static final Object invoke$109(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Keva.getRepo("live_watch_reason_control");
    }

    public static final Object invoke$11(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IUserLevelService.class);
    }

    public static /* bridge */ /* synthetic */ Object invoke$110(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ViewModelProvider.NewInstanceFactory();
    }

    public static /* bridge */ /* synthetic */ Object invoke$111(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1119470fEn(2);
    }

    public static final Object invoke$112(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue());
    }

    public static final Object invoke$113(AFwS205S0000000_17 aFwS205S0000000_17) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        SmartLivePreviewCTADisplayConfig smartLivePreviewCTADisplayConfig = C1106560ety.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(SmartLivePreviewCTADisplayConfig.class, smartLivePreviewCTADisplayConfig, "live_preview_card_cta_pitaya_config", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return smartLivePreviewCTADisplayConfig;
    }

    public static final Object invoke$114(AFwS205S0000000_17 aFwS205S0000000_17) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        HighlightPrePullStreamConfig highlightPrePullStreamConfig = C1080950eEf.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(HighlightPrePullStreamConfig.class, highlightPrePullStreamConfig, "live_highlight_pre_pull_stream", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return highlightPrePullStreamConfig;
    }

    public static final Object invoke$115(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue());
    }

    public static final Object invoke$116(AFwS205S0000000_17 aFwS205S0000000_17) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        LocationSlardarEventMonitorSettings.EventConfig[] eventConfigArr = LocationSlardarEventMonitorSettings.LIZ;
        LocationSlardarEventMonitorSettings.EventConfig[] eventConfigArr2 = (LocationSlardarEventMonitorSettings.EventConfig[]) settingsManagerLIZLLL.LJIIIIZZ("location_slardar_event_configs", LocationSlardarEventMonitorSettings.EventConfig[].class, eventConfigArr);
        if (eventConfigArr2 != null) {
            eventConfigArr = eventConfigArr2;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(eventConfigArr.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (LocationSlardarEventMonitorSettings.EventConfig eventConfig : eventConfigArr) {
            linkedHashMap.put(eventConfig.eventName, eventConfig);
        }
        return linkedHashMap;
    }

    public static final Object invoke$117(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new HashSet();
    }

    public static final Object invoke$118(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new HashMap();
    }

    public static final Object invoke$119(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Long.valueOf(LivePreviewCTASmartDisplayManager.INSTANCE.getSmartDelayShowTime());
    }

    public static final Object invoke$12(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1100770ekd();
    }

    public static final Object invoke$120(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Keva.getRepo("ttlive_preview_repo");
    }

    public static final Object invoke$121(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }

    public static final Object invoke$122(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
    }

    public static final Object invoke$123(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IInteractService.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$124(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$125(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(110.0f));
    }

    public static final Object invoke$126(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(390.0f));
    }

    public static final Object invoke$127(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(8.0f));
    }

    public static /* bridge */ /* synthetic */ Object invoke$128(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
    }

    public static final Object invoke$129(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C19748512Ol.LIZIZ;
    }

    public static final Object invoke$13(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ValueAnimator();
    }

    public static final Object invoke$130(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C20337914i1("gift_list_response_1", String.class, "");
    }

    public static final Object invoke$131(AFwS205S0000000_17 aFwS205S0000000_17) {
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(1, 12);
        recycledViewPool.setMaxRecycledViews(9, 1);
        recycledViewPool.setMaxRecycledViews(10, 1);
        return recycledViewPool;
    }

    public static final Object invoke$132(AFwS205S0000000_17 aFwS205S0000000_17) {
        String strLJIJI = C497740JfY.LJIJI(2131841048);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$133(AFwS205S0000000_17 aFwS205S0000000_17) {
        String strLJIJI = C497740JfY.LJIJI(2131841047);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$134(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C810670Vr7.LIZJ(C497740JfY.LJII(), 0, "gift_dialog_color_storage");
    }

    public static final Object invoke$135(AFwS205S0000000_17 aFwS205S0000000_17) {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        boolean z = false;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null && (value = mutableLiveDataLJJJJIZL.getValue()) != null && !value.isEmpty()) {
            Iterator<C976480bWA> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LIZJ > 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$136(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C2043807zY.LIZ(InterfaceC1139050fkN.class);
    }

    public static final Object invoke$137(AFwS205S0000000_17 aFwS205S0000000_17) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = C1102370enD.LIZ;
        if (LiveEffectNotifyFrequencyControlSetting.enable()) {
            linkedHashMap.put(1, new AbstractC1102390enF<C1102400enG>() { // from class: X.0enJ
                @Override // X.AbstractC1102390enF
                public final C1102400enG LJII(C1102400enG c1102400enG, int i, int i2, int i3, NotifyQuota notifyQuota, int i4, long j) {
                    Long lValueOf;
                    Long lValueOf2;
                    Long lValueOf3;
                    long j2;
                    C1102400enG c1102400enG2 = new C1102400enG(i, i2, i3, i4, notifyQuota.earlyDuration, notifyQuota.timeGapMs);
                    if (c1102400enG != null) {
                        c1102400enG2.LJI.putAll(c1102400enG.LJI);
                    }
                    c1102400enG2.LJI.put(Long.valueOf(j), Long.valueOf(notifyQuota.count));
                    Long lValueOf4 = null;
                    if (c1102400enG != null) {
                        lValueOf = Long.valueOf(c1102400enG.LJII);
                        lValueOf2 = Long.valueOf(c1102400enG.LJIIIIZZ);
                    } else {
                        lValueOf = null;
                        lValueOf2 = null;
                    }
                    c1102400enG2.LJII = AbstractC1102390enF.LJIIIZ(notifyQuota.earlyDurationShowCnt, lValueOf, lValueOf2);
                    c1102400enG2.LJIIIIZZ = notifyQuota.earlyDurationShowCnt;
                    if (c1102400enG != null) {
                        lValueOf3 = Long.valueOf(c1102400enG.LJIIIZ);
                        lValueOf4 = Long.valueOf(c1102400enG.LJIIJ);
                    } else {
                        lValueOf3 = null;
                    }
                    c1102400enG2.LJIIIZ = AbstractC1102390enF.LJIIIZ(notifyQuota.timeGapShowCount, lValueOf3, lValueOf4);
                    c1102400enG2.LJIIJ = notifyQuota.timeGapShowCount;
                    if (c1102400enG != null) {
                        j2 = c1102400enG.LJIIJJI;
                    } else {
                        j2 = 0;
                    }
                    c1102400enG2.LJIIJJI = j2;
                    return c1102400enG2;
                }
            });
            linkedHashMap.put(2, new AbstractC1102390enF<C1102440enK>() { // from class: X.0enH
                @Override // X.AbstractC1102390enF
                public final void LIZIZ(long j) {
                    super.LIZIZ(j);
                    Object obj = this.LIZIZ;
                    if (obj != null && (r10 = ((LinkedHashMap) obj).entrySet().iterator()) != null) {
                        for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                            if (((C1102440enK) entry.getValue()).LJIIL > 0) {
                                long j2 = ((C1102440enK) entry.getValue()).LJIILIIL;
                                C1102440enK c1102440enK = (C1102440enK) entry.getValue();
                                if ((C1102420enI.LJII - 1) % ((C1102440enK) entry.getValue()).LJIIL == 0) {
                                    j2 = ((C1102440enK) entry.getValue()).LJIILJJIL;
                                }
                                c1102440enK.LJIILIIL = j2;
                            }
                        }
                    }
                    C1102370enD.LIZLLL("update_continuous_room_quota", this, j);
                }

                @Override // X.AbstractC1102390enF
                public final void LJFF(long j) {
                    super.LJFF(j);
                }

                @Override // X.AbstractC1102390enF
                public final boolean LJI(C1102400enG c1102400enG) {
                    C1102440enK c1102440enK = (C1102440enK) c1102400enG;
                    long j = c1102440enK.LJIILIIL;
                    if (j > 0 && c1102440enK.LJIIL > 0) {
                        c1102440enK.LJIILIIL = Math.min(j - 1, 0L);
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC1102390enF
                public final C1102330en9 LJIIIIZZ(C1102400enG c1102400enG) {
                    C1102440enK c1102440enK = (C1102440enK) c1102400enG;
                    if (c1102440enK.LJIIL > 0) {
                        long j = c1102440enK.LJIILIIL;
                        if (j == 0) {
                            return new C1102330en9(3, null, 12);
                        }
                        if (j < 0) {
                            return new C1102360enC(EnumC1102380enE.QUOTA_CHECK_EXEMPTED);
                        }
                        return new C1102360enC(EnumC1102380enE.ALL_CHECK_PASSED);
                    }
                    return new C1102360enC(EnumC1102380enE.QUOTA_CHECK_EXEMPTED);
                }

                @Override // X.AbstractC1102390enF
                public final C1102400enG LJII(C1102400enG c1102400enG, int i, int i2, int i3, NotifyQuota notifyQuota, int i4, long j) {
                    Long lValueOf;
                    Long lValueOf2;
                    Long lValueOf3;
                    Long lValueOf4;
                    Long lValueOf5;
                    long j2;
                    C1102440enK c1102440enK = (C1102440enK) c1102400enG;
                    C1102440enK c1102440enK2 = new C1102440enK(i, i2, notifyQuota.earlyDuration, notifyQuota.timeGapMs, i3, notifyQuota.continuousWatchRoomCnt, i4);
                    if (c1102440enK != null) {
                        c1102440enK2.LJI.putAll(c1102440enK.LJI);
                    }
                    c1102440enK2.LJI.put(Long.valueOf(j), Long.valueOf(notifyQuota.count));
                    Long lValueOf6 = null;
                    if (c1102440enK != null) {
                        lValueOf = Long.valueOf(c1102440enK.LJII);
                        lValueOf2 = Long.valueOf(c1102440enK.LJIIIIZZ);
                    } else {
                        lValueOf = null;
                        lValueOf2 = null;
                    }
                    c1102440enK2.LJII = AbstractC1102390enF.LJIIIZ(notifyQuota.earlyDurationShowCnt, lValueOf, lValueOf2);
                    c1102440enK2.LJIIIIZZ = notifyQuota.earlyDurationShowCnt;
                    if (c1102440enK != null) {
                        lValueOf3 = Long.valueOf(c1102440enK.LJIILIIL);
                        lValueOf4 = Long.valueOf(c1102440enK.LJIILJJIL);
                    } else {
                        lValueOf3 = null;
                        lValueOf4 = null;
                    }
                    c1102440enK2.LJIILIIL = AbstractC1102390enF.LJIIIZ(notifyQuota.continuousWatchShowCnt, lValueOf3, lValueOf4);
                    c1102440enK2.LJIILJJIL = notifyQuota.continuousWatchShowCnt;
                    if (c1102440enK != null) {
                        lValueOf5 = Long.valueOf(c1102440enK.LJIIIZ);
                        lValueOf6 = Long.valueOf(c1102440enK.LJIIJ);
                    } else {
                        lValueOf5 = null;
                    }
                    c1102440enK2.LJIIIZ = AbstractC1102390enF.LJIIIZ(notifyQuota.timeGapShowCount, lValueOf5, lValueOf6);
                    c1102440enK2.LJIIJ = notifyQuota.timeGapShowCount;
                    if (c1102440enK != null) {
                        j2 = c1102440enK.LJIIJJI;
                    } else {
                        j2 = 0;
                    }
                    c1102440enK2.LJIIJJI = j2;
                    return c1102440enK2;
                }
            });
        }
        return linkedHashMap;
    }

    public static final Object invoke$138(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C2268791DrB(0.32f, 0.94f, 0.6f, 1.0f);
    }

    public static final Object invoke$139(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(LiveLevelSystemResourceSetting.INSTANCE.getLevelSystemResConfig().effectStrategy);
    }

    public static final Object invoke$14(AFwS205S0000000_17 aFwS205S0000000_17) {
        float fLJ;
        InterfaceC1101100elA interfaceC1101100elAOK1 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1();
        if (interfaceC1101100elAOK1 != null) {
            fLJ = interfaceC1101100elAOK1.LJ();
        } else {
            fLJ = 0.0f;
        }
        return Float.valueOf(fLJ);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$140(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$141(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$142(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$143(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$144(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$145(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$146(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$147(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$148(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$149(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode();
    }

    public static final Object invoke$15(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveFeaturesService.class);
    }

    public static final Object invoke$150(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LJIIJJI("gift not found in cache, fetching");
        return Unit.LIZ;
    }

    public static final Object invoke$151(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
    }

    public static final Object invoke$152(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.as3));
    }

    public static final Object invoke$155(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C14KS.LIZLLL());
    }

    public static final Object invoke$156(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(C497740JfY.LIZIZ(48.0f));
    }

    public static final Object invoke$157(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(C497740JfY.LIZIZ(48.0f));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$158(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$159(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C2097608Jq.LJIIJ(new Pair(C1107810evz.LJIIJJI, 8), new Pair(C1107810evz.LJIIL, 16384), new Pair(C1107810evz.LJIILJJIL, 16), new Pair(C1107810evz.LJIILIIL, 32768), new Pair(C1107810evz.LJIIZILJ, 64), new Pair(C1107810evz.LJIJ, 128), new Pair(C1107810evz.LJ, 256), new Pair(C1107810evz.LJFF, 512), new Pair(C1107810evz.LJIJJLI, 8192), new Pair(C1107810evz.LJJI, Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH)));
    }

    public static final Object invoke$160(AFwS205S0000000_17 aFwS205S0000000_17) {
        C20441214yg.LJIIIZ("ComboViewNewDelegate", "startDisappearAnimation: start");
        return Unit.LIZ;
    }

    public static final Object invoke$161(AFwS205S0000000_17 aFwS205S0000000_17) {
        boolean z;
        if (LiveWidgetProvider.Companion.getInstance().isRecycleWidgetContentView && CoHostWidgetWindowLayoutCacheSetting.INSTANCE.isEnable()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$162(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new UgTaskWidgetV2();
    }

    public static final Object invoke$163(AFwS205S0000000_17 aFwS205S0000000_17) {
        float fLJ;
        InterfaceC1101100elA interfaceC1101100elAOK1 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1();
        if (interfaceC1101100elAOK1 != null) {
            fLJ = interfaceC1101100elAOK1.LJ();
        } else {
            fLJ = 0.0f;
        }
        return String.valueOf(Math.abs(fLJ));
    }

    public static final Object invoke$164(AFwS205S0000000_17 aFwS205S0000000_17) {
        Context context;
        Resources resources;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && (context = iHostAppContext.context()) != null && (resources = context.getResources()) != null) {
            return resources.getDisplayMetrics();
        }
        return null;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$165(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$166(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$167(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new RevenueStrategyWidget();
    }

    public static final Object invoke$168(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LIZLLL(2131843812);
        C1086790eO5.LJIIJ("bottom_message");
        return Unit.LIZ;
    }

    public static final Object invoke$169(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveDecisionService.class);
    }

    public static final Object invoke$17(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$170(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(LiveExtendedPublicScreenMaxMessageConfig.getValue().maxMessageCount);
    }

    public static final Object invoke$171(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LivePublicScreenFirstMessagesReleaseSetting.INSTANCE.perLoopCount();
    }

    public static final Object invoke$172(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LivePublicScreenFirstMessagesReleaseSetting.INSTANCE.perLoopDuration();
    }

    public static final Object invoke$173(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LivePublicScreenFirstMessagesReleaseSetting.INSTANCE.sequence();
    }

    public static final Object invoke$174(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1697810uHb.LJ(new InterfaceC1085950eMj() { // from class: X.0eMc
            @Override // X.InterfaceC1085950eMj
            public final boolean LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                if (abstractC1136060ffY.getMessageType() == C001A.CHAT && !Intrinsics.LJFF(InterfaceC772390URp.LLLZIIL.LIZIZ(), Boolean.TRUE)) {
                    return true;
                }
                return false;
            }
        }, new InterfaceC1085950eMj() { // from class: X.0eMf
            @Override // X.InterfaceC1085950eMj
            public final boolean LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                int intType = abstractC1136060ffY.getMessageType().getIntType();
                if ((intType == C001A.GIFT.getIntType() || intType == C001A.DOODLE_GIFT.getIntType()) && !Intrinsics.LJFF(InterfaceC772390URp.LLLZIL.LIZIZ(), Boolean.TRUE)) {
                    return true;
                }
                return false;
            }
        }, new InterfaceC1085950eMj() { // from class: X.0eMd
            @Override // X.InterfaceC1085950eMj
            public final boolean LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                if (abstractC1136060ffY.getMessageType() == C001A.SOCIAL && (abstractC1136060ffY instanceof SocialMessage) && !Intrinsics.LJFF(InterfaceC772390URp.LLZIL.LIZIZ(), Boolean.TRUE) && ((SocialMessage) abstractC1136060ffY).action == 1) {
                    return true;
                }
                return false;
            }
        }, new InterfaceC1085950eMj() { // from class: X.0eMb
            @Override // X.InterfaceC1085950eMj
            public final boolean LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                if (abstractC1136060ffY.getMessageType() == C001A.MEMBER && (abstractC1136060ffY instanceof MemberMessage) && !Intrinsics.LJFF(InterfaceC772390URp.LLZ.LIZIZ(), Boolean.TRUE) && ((MemberMessage) abstractC1136060ffY).action == 1) {
                    return true;
                }
                return false;
            }
        }, new InterfaceC1085950eMj() { // from class: X.0eMe
            @Override // X.InterfaceC1085950eMj
            public final boolean LIZ(AbstractC1136060ffY abstractC1136060ffY) {
                if (abstractC1136060ffY.getMessageType() == C001A.LIKE && (abstractC1136060ffY instanceof LikeMessage) && !Intrinsics.LJFF(InterfaceC772390URp.LLZILL.LIZIZ(), Boolean.TRUE)) {
                    return true;
                }
                return false;
            }
        });
    }

    public static final Object invoke$175(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new SpannableStringBuilder("");
    }

    public static final Object invoke$176(AFwS205S0000000_17 aFwS205S0000000_17) {
        try {
            return C1161920gLG.LIZJ(IHostFrescoHelper.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final Object invoke$177(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$178(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Long.valueOf(UserService.getInstance().user().getCurrentUserId());
    }

    public static final Object invoke$179(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C497740JfY.LJIJI(2131836650);
    }

    public static final Object invoke$18(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(LiveAudienceWaveAnimationOptSetting.INSTANCE.getValue());
    }

    public static final Object invoke$180(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C497740JfY.LJIJI(2131836651);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$181(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$182(AFwS205S0000000_17 aFwS205S0000000_17) {
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        return ((InterfaceC1138800fjy) C1138630fjh.LIZIZ.getValue()).LIZ();
    }

    public static final Object invoke$183(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1135080fdy();
    }

    public static final Object invoke$184(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ValueAnimator();
    }

    public static final Object invoke$185(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Keva.getRepo("music_gift_tab_placement");
    }

    public static final Object invoke$186(AFwS205S0000000_17 aFwS205S0000000_17) {
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).l82();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$187(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C786410Ut5.h4();
    }

    public static final Object invoke$188(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Long.valueOf(LiveDrawGuessExitMessageCountdownSetting.INSTANCE.getCountdownTime());
    }

    public static final Object invoke$189(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
    }

    public static final Object invoke$19(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.ald));
    }

    public static final Object invoke$190(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Long.valueOf(LiveGiftRankingExclusiveTabSetting.INSTANCE.getMaxAnimEntryCount());
    }

    public static final Object invoke$191(AFwS205S0000000_17 aFwS205S0000000_17) {
        return InterfaceC1094160eZy.i1;
    }

    public static final Object invoke$192(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Keva.getRepo("gift_panel");
    }

    public static final Object invoke$193(AFwS205S0000000_17 aFwS205S0000000_17) {
        ((ILiveTriggerService) C1145050fu3.LIZ.getValue()).Xh2();
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$194(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$195(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IInteractService.class);
    }

    public static final Object invoke$196(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1093050eYB();
    }

    public static final Object invoke$197(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ConcurrentHashMap();
    }

    public static final Object invoke$198(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1092940eY0();
    }

    public static final Object invoke$199(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new Object() { // from class: X.0eY1
        };
    }

    public static final Object invoke$2(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IWatchLiveService.class);
    }

    public static final Object invoke$20(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.FALSE;
    }

    public static final Object invoke$200(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ArrayList();
    }

    public static final Object invoke$201(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest());
    }

    public static final Object invoke$202(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$203(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new CopyOnWriteArrayList();
    }

    public static final Object invoke$204(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
    }

    public static final Object invoke$205(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveStrategyCenterService.class);
    }

    public static final Object invoke$206(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InterfaceC1086400eNS() { // from class: X.0eQ9
            @Override // X.InterfaceC1086400eNS
            public final void LIZ(int i) {
                if (i == R.drawable.fas) {
                    C1088060eQ8.LIZIZ++;
                }
            }
        };
    }

    public static final Object invoke$207(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LIZLLL(2131842705);
        return Unit.LIZ;
    }

    public static final Object invoke$208(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LIZLLL(2131842705);
        return Unit.LIZ;
    }

    public static final Object invoke$209(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(GameLiveGuessPointsViewDelaySetting.INSTANCE.getValue());
    }

    public static final Object invoke$21(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.FALSE;
    }

    public static final Object invoke$210(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InterfaceC1096960eeU() { // from class: X.0eeZ
            @Override // X.InterfaceC1096960eeU
            public final b LIZ(C1096980eeW c1096980eeW) {
                return C09IC.LJ(new C1879640z0s(c1096980eeW, null));
            }
        };
    }

    public static final Object invoke$211(AFwS205S0000000_17 aFwS205S0000000_17) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    public static final Object invoke$212(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new Object() { // from class: X.0fWd
        };
    }

    public static final Object invoke$213(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1129690fVH();
    }

    public static final Object invoke$214(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1128840fTu();
    }

    public static final Object invoke$215(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1120620fGe();
    }

    public static final Object invoke$216(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1129290fUd();
    }

    public static final Object invoke$217(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1130180fW4();
    }

    public static final Object invoke$218(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1138670fjl.class.getSimpleName();
    }

    public static final Object invoke$219(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1138720fjq.class.getSimpleName();
    }

    public static final Object invoke$22(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.FALSE;
    }

    public static final Object invoke$220(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1138660fjk.class.getSimpleName();
    }

    public static final Object invoke$221(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1138680fjm.class.getSimpleName();
    }

    public static final Object invoke$222(AFwS205S0000000_17 aFwS205S0000000_17) {
        JSONObject jSONObject = (JSONObject) C1108870exh.LIZ.getValue();
        boolean zOptBoolean = false;
        if (jSONObject != null) {
            zOptBoolean = jSONObject.optBoolean("has_subscription_history", false);
        }
        return Boolean.valueOf(zOptBoolean);
    }

    public static final Object invoke$223(AFwS205S0000000_17 aFwS205S0000000_17) {
        try {
            Object objLIZIZ = C1338270kvh.LIZIZ("subscription_settings");
            if (objLIZIZ instanceof JSONObject) {
                return (JSONObject) objLIZIZ;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object invoke$224(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$225(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$226(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(AbstractC19994813Le.Default.nextInt());
    }

    public static final Object invoke$227(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ValueAnimator();
    }

    public static final Object invoke$228(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new SparseArray();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$229(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(com.bytedance.android.live_settings.SettingsManager.INSTANCE.getBooleanValue("live_stream_pdp_panel_adapter", LiveStreamPdpPanelAdapterSetting.DEFAULT));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$230(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$231(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IGiftService.class);
    }

    public static final Object invoke$232(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C19748512Ol.LIZIZ;
    }

    public static final Object invoke$233(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C439101nJ.LIZ(16));
    }

    public static final Object invoke$234(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object obj;
        Field field;
        try {
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField == null) {
                field = null;
            } else {
                declaredField.setAccessible(true);
                field = declaredField;
            }
            C189200o6.m2constructorimpl(field);
            obj = field;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    public static final Object invoke$235(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object obj;
        Field field;
        try {
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField == null) {
                field = null;
            } else {
                declaredField.setAccessible(true);
                field = declaredField;
            }
            C189200o6.m2constructorimpl(field);
            obj = field;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    public static final Object invoke$236(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ValueAnimator();
    }

    public static final Object invoke$237(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
    }

    public static final Object invoke$238(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1131800fYg.LIZ;
    }

    public static final Object invoke$239(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IGiftService.class);
    }

    public static final Object invoke$24(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new HashMap();
    }

    public static final Object invoke$240(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C781880Ulm.LIZ;
    }

    public static final Object invoke$241(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IHostAction.class);
    }

    public static final Object invoke$242(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IHostAppContext.class);
    }

    public static final Object invoke$243(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
    }

    public static final Object invoke$244(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IInteractService.class);
    }

    public static final Object invoke$245(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IMusicGiftService.class);
    }

    public static final Object invoke$246(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IWalletService.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$247(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$248(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkedHashSet();
    }

    public static final Object invoke$249(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C098J(64);
    }

    public static final Object invoke$25(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new HashMap();
    }

    public static final Object invoke$250(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(C1143780fs0.LIZ("tiktok_live_revenue_normal_1"));
    }

    public static final Object invoke$251(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(C1143780fs0.LIZ("tiktok_live_watch_resource_normal_1"));
    }

    public static final Object invoke$252(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(C1143780fs0.LIZ("tiktok_live_interaction_normal_1"));
    }

    public static final Object invoke$253(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(C1143780fs0.LIZ("tiktok_live_interaction_normal_2"));
    }

    public static final Object invoke$254(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(C1143780fs0.LIZ("tiktok_live_interaction_normal_3"));
    }

    public static final Object invoke$255(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1697810uHb.LJIILJJIL("tiktok_live_basic_resource", "tiktok_live_interaction_resource", "tiktok_live_watch_resource", "tiktok_live_broadcast_resource", "tiktok_live_link_mic", "tiktok_live_lottie_resource");
    }

    public static final Object invoke$256(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
    }

    public static final Object invoke$257(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LiveGiftTrayWidgetV2();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$258(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$259(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1150020g24();
    }

    public static final Object invoke$260(AFwS205S0000000_17 aFwS205S0000000_17) {
        boolean z;
        if (C500260Jjc.LJJJI(Boolean.valueOf(C1138640fji.LJIIIIZZ())) && LiveGiftDebugPanelSettings.INSTANCE.getEnable()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$261(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad());
    }

    public static final Object invoke$262(AFwS205S0000000_17 aFwS205S0000000_17) {
        C1128450fTH.LIZ.Ky1();
        return Unit.LIZ;
    }

    public static final Object invoke$263(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.TRUE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$264(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$265(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.FALSE;
    }

    public static final Object invoke$266(AFwS205S0000000_17 aFwS205S0000000_17) {
        int i;
        if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
            i = 2131852363;
        } else {
            i = 2131844590;
        }
        String strLJIJI = C497740JfY.LJIJI(i);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$267(AFwS205S0000000_17 aFwS205S0000000_17) {
        String strLJIJI = C497740JfY.LJIJI(2131843821);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$268(AFwS205S0000000_17 aFwS205S0000000_17) {
        String strLJIJI = C497740JfY.LJIJI(2131843822);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$269(AFwS205S0000000_17 aFwS205S0000000_17) {
        String strLJIJI = C497740JfY.LJIJI(2131856765);
        if (strLJIJI == null) {
            return "";
        }
        return strLJIJI;
    }

    public static final Object invoke$27(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GiftWidgetKotlin();
    }

    public static final Object invoke$270(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Long.valueOf(LiveGiftCollaborativeTriggerGiftIdSetting.INSTANCE.getGiftId());
    }

    public static final Object invoke$271(AFwS205S0000000_17 aFwS205S0000000_17) {
        List<Long> list = C472970Igh.LIZ;
        C472970Igh.LJFF(null, false);
        return Unit.LIZ;
    }

    public static final Object invoke$272(AFwS205S0000000_17 aFwS205S0000000_17) {
        C472970Igh.LIZLLL(null, false);
        return Unit.LIZ;
    }

    public static final Object invoke$273(AFwS205S0000000_17 aFwS205S0000000_17) {
        C472970Igh.LJ(null, false);
        return Unit.LIZ;
    }

    public static final Object invoke$274(AFwS205S0000000_17 aFwS205S0000000_17) {
        C472970Igh.LIZIZ(null, false);
        return Unit.LIZ;
    }

    public static final Object invoke$275(AFwS205S0000000_17 aFwS205S0000000_17) {
        C472970Igh.LIZJ(null, false);
        return Unit.LIZ;
    }

    public static final Object invoke$276(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveTriggerService.class);
    }

    public static final Object invoke$277(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).TK1();
    }

    public static final Object invoke$278(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).NZ1();
    }

    public static final Object invoke$279(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).NY1();
    }

    public static final Object invoke$28(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InterfaceC1132950faX() { // from class: X.0faW
            public IMessageManager LL;
            public long LLILLJJLI;

            public static void LIZIZ(GiftMessage giftMessage) {
                if (giftMessage != null && giftMessage.fromUser != null && giftMessage.repeatEnd == 0) {
                    if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAsyncReportEventV2()) {
                        C1138350fjF.LIZ(new ARunnableS1S0100200_17(C158B.LIZ(), System.currentTimeMillis(), giftMessage, 0));
                        return;
                    }
                    C1135820ffA.LIZ(giftMessage, C158B.LIZ(), System.currentTimeMillis());
                    C1135830ffB c1135830ffB = C1135830ffB.LIZ;
                    long jLIZ = C158B.LIZ();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c1135830ffB.getClass();
                    C1135830ffB.LIZIZ(giftMessage, jLIZ, jCurrentTimeMillis);
                }
            }

            @Override // X.InterfaceC1132950faX
            public final void LIZ(IMessageManager iMessageManager) {
                this.LL = iMessageManager;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
            @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onMessage(com.ss.ugc.live.sdk.message.data.IMessage r11) {
                /*
                    r10 = this;
                    boolean r0 = r11 instanceof com.bytedance.android.livesdk.model.message.GiftMessage
                    r9 = 0
                    if (r0 != 0) goto L6
                    return r9
                L6:
                    long r1 = r10.LLILLJJLI
                    r7 = 0
                    int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r0 > 0) goto L1c
                    com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
                    X.0Jki r0 = r0.user()
                    long r0 = r0.getCurrentUserId()
                    r10.LLILLJJLI = r0
                L1c:
                    r0 = r11
                    com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0     // Catch: java.lang.Exception -> L23
                    LIZIZ(r0)     // Catch: java.lang.Exception -> L23
                    goto L27
                L23:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L27:
                    r6 = r11
                    com.bytedance.android.livesdk.model.message.GiftMessage r6 = (com.bytedance.android.livesdk.model.message.GiftMessage) r6
                    com.bytedance.android.livesdk.livesetting.gift.LiveGiftMinuteGameSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftMinuteGameSetting.INSTANCE
                    boolean r0 = r0.isEnable()
                    r5 = 1
                    if (r0 == 0) goto L5f
                    long r3 = r10.LLILLJJLI
                    int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r0 <= 0) goto L5f
                    boolean r0 = r6.LLILLL
                    if (r0 != 0) goto L5f
                    com.bytedance.android.live.base.model.user.User r0 = r6.fromUser
                    if (r0 == 0) goto L5f
                    long r1 = r0.getId()
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 != 0) goto L5f
                    int r0 = r6.repeatEnd
                    if (r0 == r5) goto L5f
                    com.bytedance.android.livesdk.model.message.GiftMessage$InteractiveGiftInfo r0 = r6.interactiveGiftInfo
                    if (r0 == 0) goto L5f
                    long r1 = r0.ignoreComponent
                    int r0 = (int) r1
                    r0 = r0 & 8
                    if (r0 == 0) goto L5f
                    r6.LLILLL = r5
                L5a:
                    com.bytedance.android.live.base.model.user.User r0 = r6.fromUser
                    if (r0 != 0) goto L86
                    return r5
                L5f:
                    long r1 = r10.LLILLJJLI
                    int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r0 <= 0) goto L5a
                    boolean r0 = r6.LLILLL
                    if (r0 != 0) goto L5a
                    com.bytedance.android.live.base.model.user.User r0 = r6.fromUser
                    if (r0 == 0) goto L5a
                    long r3 = r0.getId()
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 != 0) goto L5a
                    int r0 = r6.repeatEnd
                    if (r0 == r5) goto L5a
                    com.bytedance.android.livesdk.model.message.GiftMessage$InteractiveGiftInfo r0 = r6.interactiveGiftInfo
                    if (r0 == 0) goto L87
                    long r1 = r0.crossScreenRole
                    r3 = 2
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 != 0) goto L87
                    goto L5a
                L86:
                    return r9
                L87:
                    com.ss.ugc.live.sdk.message.MessageMonitor$DispatchStatus r0 = com.ss.ugc.live.sdk.message.MessageMonitor.DispatchStatus.SKIPPING_SELF_SEND
                    com.ss.ugc.live.sdk.message.MessageMonitor.markDispatchStatus(r11, r0)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1132940faW.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):boolean");
            }
        };
    }

    public static final Object invoke$280(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).LR();
    }

    public static final Object invoke$281(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InterfaceC1094860eb6() { // from class: X.0eb3
            @Override // X.InterfaceC1094860eb6
            public final Object getValue(String str) {
                return C1338270kvh.LIZIZ(str);
            }
        };
    }

    public static final Object invoke$282(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InterfaceC1094820eb2() { // from class: X.0eb4
            public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS205S0000000_17.get$arr$(169));

            @Override // X.InterfaceC1094820eb2
            public final C1090000eTG LIZ(String str, String str2, String str3) {
                ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) this.LIZ.getValue();
                EnumC1094630eaj.Companion.getClass();
                return iLiveDecisionService.O3(C1094620eai.LIZ(str), str2, str3);
            }
        };
    }

    public static final Object invoke$283(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1094790eaz((InterfaceC1094820eb2) C1094780eay.LIZ.getValue(), (InterfaceC292601Bk) C1094780eay.LIZIZ.getValue(), (InterfaceC1094860eb6) C1094780eay.LIZJ.getValue());
    }

    public static final Object invoke$284(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1094760eaw((InterfaceC1094820eb2) C1094780eay.LIZ.getValue(), (InterfaceC292601Bk) C1094780eay.LIZIZ.getValue(), (InterfaceC1094860eb6) C1094780eay.LIZJ.getValue());
    }

    public static final Object invoke$285(AFwS205S0000000_17 aFwS205S0000000_17) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(EnumC1102740eno.ICON_SLOT);
        linkedHashSet.add(EnumC1102740eno.AUDIENCE_SUBSCRIPTION);
        linkedHashSet.add(EnumC1102740eno.AUDIENCE_SERVICE_PLUS);
        linkedHashSet.add(EnumC1102740eno.AUDIENCE_PARTNERSHIP);
        linkedHashSet.add(EnumC1102740eno.AUDIENCE_SLOT);
        linkedHashSet.add(EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES);
        linkedHashSet.add(EnumC1102740eno.MULTIGUEST);
        linkedHashSet.add(EnumC1102740eno.FAST_GIFT);
        linkedHashSet.add(EnumC1102740eno.GIFT);
        return linkedHashSet;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$286(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$287(AFwS205S0000000_17 aFwS205S0000000_17) {
        GiftMsgBufferControlOptSetting giftMsgBufferControlOptSetting = GiftMsgBufferControlOptSetting.INSTANCE;
        if (giftMsgBufferControlOptSetting.getEnableHeapQueue()) {
            return new AbstractC1133510fbR() { // from class: X.0fbW
                public final PriorityQueue<GiftMessage> LIZIZ = new PriorityQueue<>(LSPassThroughRecordSizeConfig.DEFAULT, new Comparator() { // from class: X.0fbU
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        long j;
                        GiftMessage giftMessage = (GiftMessage) obj;
                        GiftMessage giftMessage2 = (GiftMessage) obj2;
                        int i = giftMessage.mGift.diamondCount;
                        int i2 = giftMessage2.mGift.diamondCount;
                        if (i == i2 && (i = giftMessage.comboCount) == (i2 = giftMessage2.comboCount)) {
                            long j2 = giftMessage.receiveTime;
                            long j3 = giftMessage2.receiveTime;
                            if (j2 != j3) {
                                j = j2 - j3;
                            } else {
                                j = giftMessage.localTimestamp - giftMessage2.localTimestamp;
                            }
                            return (int) j;
                        }
                        return i2 - i;
                    }
                });

                @Override // X.AbstractC1133500fbQ
                public final /* bridge */ /* synthetic */ AbstractCollection LIZIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC1133510fbR
                public final void LJ(GiftMessage giftMessage) {
                    this.LIZIZ.offer(giftMessage);
                }

                @Override // X.AbstractC1133510fbR
                public final GiftMessage LJFF(boolean z) {
                    return this.LIZIZ.poll();
                }
            };
        }
        if (giftMsgBufferControlOptSetting.getEnableTreeQueue()) {
            return new AbstractC1133510fbR() { // from class: X.0fbZ
                public final TreeSet<GiftMessage> LIZIZ = new TreeSet<>(new Comparator() { // from class: X.0fbV
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        long j;
                        GiftMessage giftMessage = (GiftMessage) obj;
                        GiftMessage giftMessage2 = (GiftMessage) obj2;
                        int i = giftMessage.mGift.diamondCount;
                        int i2 = giftMessage2.mGift.diamondCount;
                        if (i == i2 && (i = giftMessage.comboCount) == (i2 = giftMessage2.comboCount)) {
                            long j2 = giftMessage.receiveTime;
                            long j3 = giftMessage2.receiveTime;
                            if (j2 != j3) {
                                j = j2 - j3;
                            } else {
                                j = giftMessage.localTimestamp - giftMessage2.localTimestamp;
                            }
                            return (int) j;
                        }
                        return i2 - i;
                    }
                });

                @Override // X.AbstractC1133500fbQ
                public final /* bridge */ /* synthetic */ AbstractCollection LIZIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC1133510fbR
                public final void LJ(GiftMessage giftMessage) {
                    this.LIZIZ.add(giftMessage);
                }

                @Override // X.AbstractC1133510fbR
                public final GiftMessage LJFF(boolean z) {
                    if (z) {
                        return this.LIZIZ.pollLast();
                    }
                    return this.LIZIZ.pollFirst();
                }
            };
        }
        return new AbstractC1133500fbQ() { // from class: X.0fbY
            public final PriorityQueue<GiftMessage> LIZ = new PriorityQueue<>(LSPassThroughRecordSizeConfig.DEFAULT, new Comparator() { // from class: X.0fbX
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    GiftMessage giftMessage = (GiftMessage) obj;
                    GiftMessage giftMessage2 = (GiftMessage) obj2;
                    int i = giftMessage.mGift.diamondCount;
                    int i2 = giftMessage2.mGift.diamondCount;
                    if (i != i2) {
                        return i2 - i;
                    }
                    int i3 = giftMessage.comboCount;
                    int i4 = giftMessage2.comboCount;
                    if (i3 != i4) {
                        return i3 - i4;
                    }
                    return (int) (giftMessage.receiveTime - giftMessage2.receiveTime);
                }
            });

            @Override // X.AbstractC1133500fbQ
            public final /* bridge */ /* synthetic */ AbstractCollection LIZIZ() {
                return this.LIZ;
            }

            @Override // X.AbstractC1133500fbQ
            public final void LIZJ(GiftMessage giftMessage) {
                this.LIZ.offer(giftMessage);
            }

            @Override // X.AbstractC1133500fbQ
            public final GiftMessage LIZLLL(boolean z) {
                return this.LIZ.poll();
            }
        };
    }

    public static final Object invoke$288(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ValueAnimator();
    }

    public static final Object invoke$289(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IPinCardService.class);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$29(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$290(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveDecisionService.class);
    }

    public static final Object invoke$291(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LiveGiftTrayWidgetV2();
    }

    public static final Object invoke$292(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Calendar.getInstance();
    }

    public static final Object invoke$293(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LiveClientAISettings.INSTANCE.aiServices().liveRevenueFeatureCollectService;
    }

    public static final Object invoke$294(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1148670fzt.LIZ().walletCenter();
    }

    public static final Object invoke$295(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IWalletService.class);
    }

    public static final Object invoke$296(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1112280f3C.LIZ;
    }

    public static final Object invoke$297(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ArrayList();
    }

    public static final Object invoke$298(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ArrayList();
    }

    public static final Object invoke$299(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Keva.getRepo("gift_queue_debug_repo");
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$30(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$300(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GradientDrawable();
    }

    public static final Object invoke$301(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GradientDrawable();
    }

    public static final Object invoke$302(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(30.0f));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$303(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$304(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$305(AFwS205S0000000_17 aFwS205S0000000_17) {
        InterfaceC1093910eZZ.LLLLZLLLI.LIZJ(String.valueOf(System.currentTimeMillis()));
        InterfaceC1093910eZZ.LLLLLLL.LJFF(C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale()));
        return Unit.LIZ;
    }

    public static final Object invoke$306(AFwS205S0000000_17 aFwS205S0000000_17) {
        InterfaceC1093910eZZ.LLLLZLLLI.LIZJ(String.valueOf(System.currentTimeMillis()));
        InterfaceC1093910eZZ.LLLLLLL.LJFF(C2273311DyT.LIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale()));
        return Unit.LIZ;
    }

    public static final Object invoke$307(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(LiveBroadcastToolbarLimitCountSetting.INSTANCE.getValue());
    }

    public static final Object invoke$308(AFwS205S0000000_17 aFwS205S0000000_17) {
        if (C0UIM.LIZJ()) {
            return C13LQ.LJLIIL(new EnumC1102740eno[]{EnumC1102740eno.QUESTION, EnumC1102740eno.VOTE, EnumC1102740eno.MULTIGUEST});
        }
        return C13LQ.LJLIIL(new EnumC1102740eno[]{EnumC1102740eno.QUESTION, EnumC1102740eno.CUSTOM_POLL, EnumC1102740eno.MULTIGUEST});
    }

    public static final Object invoke$309(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IActionHandlerService.class);
    }

    public static final Object invoke$31(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0().LJ();
    }

    public static final Object invoke$310(AFwS205S0000000_17 aFwS205S0000000_17) {
        Map<String, Double> value = LivePcsGenericApiMonitorSamplingSetting.INSTANCE.getValue();
        if (value == null) {
            return C2097608Jq.LJ();
        }
        return value;
    }

    public static final Object invoke$311(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1113970f5v();
    }

    public static final Object invoke$312(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new Rect();
    }

    public static final Object invoke$313(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new RectF();
    }

    public static final Object invoke$314(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new RectF();
    }

    public static final Object invoke$315(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new PublicLevelUpMessageEvent();
    }

    public static final Object invoke$316(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GameAutoRotateVideoTriggerEvent();
    }

    public static final Object invoke$317(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BarrageAdjustmentEvent();
    }

    public static final Object invoke$318(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new IsFromPortraitData();
    }

    public static final Object invoke$319(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ECStartClearScreenEvent();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$32(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$320(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkCrossRoomStateChangeEvent();
    }

    public static final Object invoke$321(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new CaptionStateEvent();
    }

    public static final Object invoke$322(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LockScreenEvent();
    }

    public static final Object invoke$323(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new OpenGiftVerifyEvent();
    }

    public static final Object invoke$324(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new CommentComboTrayEvent();
    }

    public static final Object invoke$325(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new HideParentCloseEvent();
    }

    public static final Object invoke$326(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LiveGiftSuspensionEvent();
    }

    public static final Object invoke$327(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new PreCreateLivePlayerEvent();
    }

    public static final Object invoke$328(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new SendGiftEvent();
    }

    public static final Object invoke$329(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new FirstFrameChannelEvent();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$33(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$330(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new PreLoadLiveBGImageEvent();
    }

    public static final Object invoke$331(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new RoomNotifyEvent();
    }

    public static final Object invoke$332(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new SelfOnlineStateChannel();
    }

    public static final Object invoke$333(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new TopEffectEvent();
    }

    public static final Object invoke$334(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new AllLinkMicWindowRenderedEvent();
    }

    public static final Object invoke$335(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new DonationStickerAnchorEvent();
    }

    public static final Object invoke$336(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InteractStateChangeEvent();
    }

    public static final Object invoke$337(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new SelectPollVoteEvent();
    }

    public static final Object invoke$338(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new InteractCallPlayerEvent();
    }

    public static final Object invoke$339(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new SendGiftSuccessEvent();
    }

    public static final Object invoke$34(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C194310110i(C497740JfY.LJII());
    }

    public static final Object invoke$340(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new PublicScreenLoadedEvent();
    }

    public static final Object invoke$341(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new CommentCountChangeEvent();
    }

    public static final Object invoke$342(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LiveRealTimeSurveyEvent();
    }

    public static final Object invoke$343(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new RevenueAuthSuccessEvent();
    }

    public static final Object invoke$344(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ChangeLoadingViewPosition();
    }

    public static final Object invoke$345(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new MultiLiveRTCLayoutChannel();
    }

    public static final Object invoke$346(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new AudienceShowSwitchDefinitionEvent();
    }

    public static final Object invoke$347(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ShowLoadingViewEvent();
    }

    public static final Object invoke$348(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new VideoGiftStartEvent();
    }

    public static final Object invoke$349(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new VideoOrientationChangeChannel();
    }

    public static final Object invoke$35(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1());
    }

    public static final Object invoke$350(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GameLinkLayoutDataChannel();
    }

    public static final Object invoke$351(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new VideoViewMeasureEvent();
    }

    public static final Object invoke$352(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new MainScreenPinnedWidgetLoadedChannel();
    }

    public static final Object invoke$353(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GameLinkGeustWidgetDestroyChannel();
    }

    public static final Object invoke$354(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new MatchAudienceWidgetLoaded();
    }

    public static final Object invoke$355(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LandscapeFullScreenEvent();
    }

    public static final Object invoke$356(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new MatchCutShortEvent();
    }

    public static final Object invoke$357(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new TwoMatchCutShortEvent();
    }

    public static final Object invoke$358(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new PlayerChangeLayoutParamEvent();
    }

    public static final Object invoke$359(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new PortraitShortTouchPreviewEvent();
    }

    public static final Object invoke$36(AFwS205S0000000_17 aFwS205S0000000_17) {
        LiveStarCommentProtectSetting.INSTANCE.getSettingValue();
        return Boolean.TRUE;
    }

    public static final Object invoke$360(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LogGiftCloseToastShowEvent();
    }

    public static final Object invoke$361(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LivePauseViewSizeChangeEvent();
    }

    public static final Object invoke$362(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new NormalGiftDisplayStatusEvent();
    }

    public static final Object invoke$363(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new MultiGuestPauseViewShowEvent();
    }

    public static final Object invoke$364(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GiftDialogStatusChangeEvent();
    }

    public static final Object invoke$365(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new UserLevelEvent();
    }

    public static final Object invoke$366(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ProgrammedLiveMenuVisibilityChannel();
    }

    public static final Object invoke$367(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new FansClubEvent();
    }

    public static final Object invoke$368(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkedHashMap();
    }

    public static final Object invoke$369(AFwS205S0000000_17 aFwS205S0000000_17) {
        return ScalableDowngradeSetting.getProgressiveDowngradeConfig();
    }

    public static final Object invoke$37(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.TRUE;
    }

    public static final Object invoke$370(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkedHashMap();
    }

    public static final Object invoke$371(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ArrayList();
    }

    public static final Object invoke$372(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(WatchRefreshRateSetting.getBatteryThreshold());
    }

    public static final Object invoke$373(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(WatchRefreshRateSetting.isEnable());
    }

    public static final Object invoke$374(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(WatchRefreshRateSetting.getTemperatureThreshold());
    }

    public static final Object invoke$375(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$376(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Keva.getRepo("toolbar_broadcast_gift");
    }

    public static final Object invoke$377(AFwS205S0000000_17 aFwS205S0000000_17) {
        try {
            return Keva.getRepo("a11y_setting");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final Object invoke$378(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(TTliveAudienceDeviceScoreSetting.INSTANCE.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$379(kotlin.jvm.internal.AFwS205S0000000_17 r4) {
        /*
            X.0etz r0 = X.C1106570etz.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig r0 = X.C1106570etz.LIZJ()
            boolean r0 = r0.enable
            r4 = 0
            if (r0 == 0) goto L58
            com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig r0 = X.C1106570etz.LIZJ()
            boolean r0 = r0.useActiveDayFeature
            if (r0 == 0) goto L57
            X.C1106570etz.LIZJ()
            java.lang.Class<com.bytedance.android.live.livedecision.ILiveDecisionService> r0 = com.bytedance.android.live.livedecision.ILiveDecisionService.class
            X.006A r3 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livedecision.ILiveDecisionService r3 = (com.bytedance.android.live.livedecision.ILiveDecisionService) r3
            X.0eaj r2 = X.EnumC1094630eaj.DEFAULT
            X.0ITs r0 = X.EnumC467180ITs.SERVER_FEATURE
            java.lang.String r1 = r0.getGroupName()
            com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig r0 = X.C1106570etz.LIZJ()
            java.lang.String r0 = r0.activeDayFeature
            X.0eTG r0 = r3.O3(r2, r1, r0)
            if (r0 == 0) goto L5f
            java.lang.Object r1 = r0.LIZJ
        L37:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L5d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r1)
            if (r0 == 0) goto L5d
            int r2 = r0.intValue()
        L47:
            com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig r0 = X.C1106570etz.LIZJ()
            int r1 = r0.minActiveDay
            com.ss.android.ugc.aweme.feed.exp.LivePreviewCtaDelayConfig r0 = X.C1106570etz.LIZJ()
            int r0 = r0.maxActiveDay
            if (r2 > r0) goto L58
            if (r1 > r2) goto L58
        L57:
            r4 = 1
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L5d:
            r2 = -1
            goto L47
        L5f:
            r1 = 0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS205S0000000_17.invoke$379(kotlin.jvm.internal.AFwS205S0000000_17):java.lang.Object");
    }

    public static final Object invoke$38(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.as3));
    }

    public static final Object invoke$380(AFwS205S0000000_17 aFwS205S0000000_17) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePreviewCtaDelayConfig livePreviewCtaDelayConfig = C1106570etz.LIZIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(LivePreviewCtaDelayConfig.class, livePreviewCtaDelayConfig, "live_preview_cta_delay_experiment", true);
        if (objLJJII != null) {
            return objLJJII;
        }
        return livePreviewCtaDelayConfig;
    }

    public static final Object invoke$381(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LJIIJJI("arena guide not shown by downgrade");
        return Unit.LIZ;
    }

    public static final Object invoke$382(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1697810uHb.LJIIJJI(new InterfaceC1944407jW() { // from class: X.0fBF
            /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
            @Override // X.InterfaceC1944407jW
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(android.content.Context r10, android.net.Uri r11, java.util.Map<java.lang.String, java.lang.String> r12) {
                /*
                    r9 = this;
                    java.lang.String r0 = "use_native_sub_privilege_page"
                    java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r0)
                    java.lang.String r0 = "1"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    r4 = 0
                    if (r0 == 0) goto La0
                    java.lang.String r0 = r11.getHost()
                    java.lang.String r2 = "webcast_lynxview"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                    java.lang.String r3 = "webcast_lynxview_popup"
                    if (r0 != 0) goto L27
                    java.lang.String r0 = r11.getHost()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
                    if (r0 == 0) goto La0
                L27:
                    java.lang.String r0 = "url"
                    java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r0)
                    if (r1 != 0) goto L30
                    return r4
                L30:
                    java.lang.String r0 = "user-entry-col"
                    boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r4)
                    if (r0 == 0) goto La0
                    java.lang.String r0 = "tiktok_live_fundamental_sub_user"
                    boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r4)
                    if (r0 == 0) goto La0
                    java.lang.String r8 = "sec_anchor_id"
                    java.lang.String r7 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r8)
                    java.lang.String r6 = ""
                    if (r7 != 0) goto L4b
                    r7 = r6
                L4b:
                    java.lang.String r5 = "show_entrance"
                    java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r5)
                    if (r4 != 0) goto L54
                    r4 = r6
                L54:
                    java.lang.String r1 = r11.getHost()
                    if (r1 == 0) goto L9e
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
                    if (r0 == 0) goto L95
                    java.lang.String r3 = "popup"
                L62:
                    java.lang.String r2 = "enter_type"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r2)
                    if (r0 == 0) goto L6b
                    r6 = r0
                L6b:
                    java.lang.String r0 = "sslocal://webcast_subscribe/privilege_page"
                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                    android.net.Uri$Builder r1 = r0.buildUpon()
                    r1.appendQueryParameter(r5, r4)
                    r1.appendQueryParameter(r8, r7)
                    java.lang.String r0 = "page_type"
                    r1.appendQueryParameter(r0, r3)
                    r1.appendQueryParameter(r2, r6)
                    android.net.Uri r2 = r1.build()
                    X.0JJy r1 = X.C490120JJy.LIZIZ
                    X.09gd r0 = new X.09gd
                    r0.<init>()
                    r0.LIZ = r2
                    r1.LIZJ(r10, r0, r12)
                    r0 = 1
                    return r0
                L95:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
                    if (r0 == 0) goto L9e
                    java.lang.String r3 = "full_page"
                    goto L62
                L9e:
                    r3 = r6
                    goto L62
                La0:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1117270fBF.LIZ(android.content.Context, android.net.Uri, java.util.Map):boolean");
            }
        }, new InterfaceC1944407jW() { // from class: X.0xqJ
            @Override // X.InterfaceC1944407jW
            public final boolean LIZ(Context context, Uri uri, Map<String, String> map) {
                Integer num = (Integer) C1338270kvh.LIZ(0, "live_recording_refactor");
                if (num != null && num.intValue() == 0) {
                    return false;
                }
                if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bdhm_bid"), "tiktok_live_fundamental_replay") || Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bd_hybrid_monitor_bid"), "tiktok_live_fundamental_replay")) {
                    if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bdhm_pid"), "replay")) {
                        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "//webcast_replay_list", new Bundle());
                        return true;
                    }
                    if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bdhm_pid"), "highlight") && LiveReplayHighlightPageRefactorSetting.INSTANCE.enable()) {
                        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                        Bundle bundle = new Bundle();
                        C786410Ut5.LJJJI("replay_room_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "replay_room_id"), bundle);
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fragment_id");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fragment_id_list");
                        }
                        if (C500260Jjc.LJJIIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                            C786410Ut5.LJJJI("fragment_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                        }
                        C786410Ut5.LJJJI("enter_from_page", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_page"), bundle);
                        C786410Ut5.LJJJI("enter_from", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from"), bundle);
                        C786410Ut5.LJJJI("last_page", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "last_page"), bundle);
                        C786410Ut5.LJJJI("user_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_type"), bundle);
                        C786410Ut5.LJJJI("anchor_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id"), bundle);
                        C786410Ut5.LJJJI("enter_method", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_method"), bundle);
                        C786410Ut5.LJJJI("tab_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tab_id"), bundle);
                        C786410Ut5.LJJJI("support_bb_download", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "support_bb_download"), bundle);
                        C786410Ut5.LJJJI("clip_disable", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "clip_disable"), bundle);
                        C786410Ut5.LJJJI("is_bb_fans", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_bb_fans"), bundle);
                        iHostAction.handleSchema(context, "//webcast_highlight_page", bundle);
                        return true;
                    }
                }
                return false;
            }
        }, new InterfaceC1944407jW() { // from class: X.0fBG
            /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
            @Override // X.InterfaceC1944407jW
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(android.content.Context r10, android.net.Uri r11, java.util.Map<java.lang.String, java.lang.String> r12) {
                /*
                    r9 = this;
                    java.lang.String r0 = "use_native_pgc_sub_privilege_page"
                    java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r0)
                    java.lang.String r0 = "1"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    r4 = 0
                    if (r0 == 0) goto La0
                    java.lang.String r0 = r11.getHost()
                    java.lang.String r2 = "webcast_lynxview"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                    java.lang.String r3 = "webcast_lynxview_popup"
                    if (r0 != 0) goto L27
                    java.lang.String r0 = r11.getHost()
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
                    if (r0 == 0) goto La0
                L27:
                    java.lang.String r0 = "url"
                    java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r0)
                    if (r1 != 0) goto L30
                    return r4
                L30:
                    java.lang.String r0 = "user-entry-col"
                    boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r4)
                    if (r0 == 0) goto La0
                    java.lang.String r0 = "tiktok_live_fundamental_sub_user"
                    boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r4)
                    if (r0 == 0) goto La0
                    java.lang.String r8 = "sec_anchor_id"
                    java.lang.String r7 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r8)
                    java.lang.String r6 = ""
                    if (r7 != 0) goto L4b
                    r7 = r6
                L4b:
                    java.lang.String r5 = "show_entrance"
                    java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r5)
                    if (r4 != 0) goto L54
                    r4 = r6
                L54:
                    java.lang.String r1 = r11.getHost()
                    if (r1 == 0) goto L9e
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
                    if (r0 == 0) goto L95
                    java.lang.String r3 = "popup"
                L62:
                    java.lang.String r2 = "enter_type"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r2)
                    if (r0 == 0) goto L6b
                    r6 = r0
                L6b:
                    java.lang.String r0 = "sslocal://webcast_subscribe/pgc_privilege_page"
                    android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                    android.net.Uri$Builder r1 = r0.buildUpon()
                    r1.appendQueryParameter(r5, r4)
                    r1.appendQueryParameter(r8, r7)
                    java.lang.String r0 = "page_type"
                    r1.appendQueryParameter(r0, r3)
                    r1.appendQueryParameter(r2, r6)
                    android.net.Uri r2 = r1.build()
                    X.0JJy r1 = X.C490120JJy.LIZIZ
                    X.09gd r0 = new X.09gd
                    r0.<init>()
                    r0.LIZ = r2
                    r1.LIZJ(r10, r0, r12)
                    r0 = 1
                    return r0
                L95:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
                    if (r0 == 0) goto L9e
                    java.lang.String r3 = "full_page"
                    goto L62
                L9e:
                    r3 = r6
                    goto L62
                La0:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1117280fBG.LIZ(android.content.Context, android.net.Uri, java.util.Map):boolean");
            }
        });
    }

    public static final Object invoke$383(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ILiveFeatureCenterService.class);
    }

    public static final Object invoke$384(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C603820NmG(15);
    }

    public static final Object invoke$385(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LiveGiftSelfDiagnosisSetting.INSTANCE.config();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$386(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$387(AFwS205S0000000_17 aFwS205S0000000_17) {
        AtomicInteger atomicInteger = C1141930fp1.LIZ;
        int i = atomicInteger.get();
        atomicInteger.set(0);
        return Integer.valueOf(i);
    }

    public static final Object invoke$388(AFwS205S0000000_17 aFwS205S0000000_17) {
        long j = C1141930fp1.LIZIZ;
        C1141930fp1.LIZIZ = -2L;
        return Long.valueOf(j);
    }

    public static final Object invoke$389(AFwS205S0000000_17 aFwS205S0000000_17) {
        long j = C1141930fp1.LIZLLL;
        C1141930fp1.LIZLLL = -2L;
        return Long.valueOf(j);
    }

    public static final Object invoke$39(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Float.valueOf(LivePinchZoomConfigSetting.getMinPinchScale(false));
    }

    public static final Object invoke$390(AFwS205S0000000_17 aFwS205S0000000_17) {
        int i = C1141930fp1.LIZJ;
        C1141930fp1.LIZJ = -2;
        return Integer.valueOf(i);
    }

    public static final Object invoke$391(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ISlotService.class);
    }

    public static final Object invoke$392(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ISlotService.class);
    }

    public static final Object invoke$393(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ISlotService.class);
    }

    public static final Object invoke$394(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(ISlotService.class);
    }

    public static final Object invoke$395(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Long.valueOf(LiveStrategyParamsExpirationTimeSetting.getValue());
    }

    public static final /* bridge */ /* synthetic */ Object invoke$396(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$397(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$398(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$399(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$4(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new OnIMMessageListener() { // from class: X.0edQ
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final String messageListenerBizTag() {
                return "EffectNotifyManager";
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
            public final IMListenerType messageListenerType() {
                return IMListenerType.SYNC;
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                MemberMessage memberMessage;
                MemberMessage memberMessage2;
                DataChannel dataChannel;
                MemberMessage memberMessage3;
                int i;
                try {
                    if (iMessage instanceof MemberMessage) {
                        memberMessage = (MemberMessage) iMessage;
                    } else {
                        memberMessage = null;
                    }
                    if (memberMessage != null && ((i = memberMessage.action) == 2000 || i == 2001 || i == 2003)) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(memberMessage.clientEnterType, new String[]{"_"}, 0, 6);
                        int i2 = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(0));
                        int i3 = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(1));
                        int i4 = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL.get(2));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("component", i2);
                        jSONObject.put("biz", i3);
                        jSONObject.put(Scene.SCENE_SERVICE, i4);
                        int i5 = memberMessage.action;
                        if (i5 != 2000) {
                            if (i5 != 2001) {
                                if (i5 == 2003) {
                                    jSONObject.put("container", "banner");
                                    jSONObject.put("anim_type", "marquee");
                                }
                            } else {
                                jSONObject.put("container", "banner");
                                jSONObject.put("anim_type", "expand");
                            }
                        } else {
                            jSONObject.put("container", "middle_touch");
                            jSONObject.put("anim_type", "expand");
                        }
                        C389001fE.LIZ("live_effect_notify_mock_event", jSONObject, System.currentTimeMillis(), false);
                    }
                    if ((iMessage instanceof MemberMessage) && (memberMessage3 = (MemberMessage) iMessage) != null && memberMessage3.action == 2004) {
                        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(memberMessage3.clientEnterType, new String[]{"_"}, 0, 6);
                        final int i6 = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL2.get(0));
                        final int i7 = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL2.get(1));
                        final int i8 = CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL2.get(2));
                        C1102070emj c1102070emj = C1102070emj.LIZ;
                        DataChannel dataChannel2 = C1096290edP.LIZ;
                        AbstractC1098520eh0 abstractC1098520eh0 = new AbstractC1098520eh0(i6, i7, i8) { // from class: X.0edR
                            public final int LIZIZ;
                            public final int LIZJ;
                            public final int LIZLLL;

                            @Override // X.InterfaceC1102300en6
                            public final boolean LJIILIIL() {
                                return true;
                            }

                            @Override // X.InterfaceC1102300en6
                            public final void Zc(int i9) {
                            }

                            @Override // X.InterfaceC1102300en6
                            public final long ad() {
                                return Mp4ScreenVideoLoadTimeout.CONTROL;
                            }

                            @Override // X.InterfaceC1102300en6
                            public final void Yc() {
                                C1102070emj c1102070emj2 = C1102070emj.LIZ;
                                DataChannel dataChannel3 = C1096290edP.LIZ;
                                String str = this.LIZ;
                                c1102070emj2.getClass();
                                C1102070emj.LJIIL(dataChannel3, 2, str);
                            }

                            @Override // X.InterfaceC1102300en6
                            public final void bd() {
                                C766270U4b.LJIIJJI("onActive");
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1096280edO(this, null), 3);
                            }

                            @Override // X.InterfaceC1102300en6
                            public final int LJIILJJIL() {
                                return this.LIZIZ;
                            }

                            @Override // X.InterfaceC1102300en6
                            public final EnumC1100250ejn Xc() {
                                return EnumC1100250ejn.EFFECT;
                            }

                            @Override // X.InterfaceC1102300en6
                            public final int getBiz() {
                                return this.LIZJ;
                            }

                            @Override // X.InterfaceC1102300en6
                            public final int getScene() {
                                return this.LIZLLL;
                            }

                            {
                                this.LIZIZ = i6;
                                this.LIZJ = i7;
                                this.LIZLLL = i8;
                            }
                        };
                        c1102070emj.getClass();
                        C1102070emj.LJJ(dataChannel2, abstractC1098520eh0, false, null);
                    }
                    if ((iMessage instanceof MemberMessage) && (memberMessage2 = (MemberMessage) iMessage) != null && memberMessage2.action == 2005 && (dataChannel = C1096290edP.LIZ) != null) {
                        dataChannel.LC0(LiveMockLiveCenterEvent.class, memberMessage2.clientEnterType);
                    }
                    if (iMessage instanceof MemberMessage) {
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    public static final Object invoke$40(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1104710eqz();
    }

    public static final /* bridge */ /* synthetic */ Object invoke$400(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$401(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$402(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C2097608Jq.LJIIJ(new Pair("traversal_start_time", 0L), new Pair("measure_duration", 0L), new Pair("layout_duration", 0L), new Pair("draw_duration", 0L), new Pair("traversal_end_time", 0L), new Pair("traversal_total_duration", 0L));
    }

    public static final Object invoke$41(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkedHashMap();
    }

    public static final Object invoke$42(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.aou));
    }

    public static final /* bridge */ /* synthetic */ Object invoke$43(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1123440fLC();
    }

    public static final Object invoke$45(AFwS205S0000000_17 aFwS205S0000000_17) {
        C01CC.LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$46(AFwS205S0000000_17 aFwS205S0000000_17) {
        boolean z;
        if (LiveGiftUserConsumeLayerSetting.INSTANCE.getValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$47(AFwS205S0000000_17 aFwS205S0000000_17) {
        return KevaImpl.getRepo("keva_repo_key_live_i18n_hot_keys", 0);
    }

    public static final Object invoke$48(AFwS205S0000000_17 aFwS205S0000000_17) {
        return KevaImpl.getRepo("live_i18n_keva", 0);
    }

    public static final Object invoke$49(AFwS205S0000000_17 aFwS205S0000000_17) {
        return KevaImpl.getRepo("live_i18n_version_info_repo", 0);
    }

    public static final Object invoke$5(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LiveGiftConfigParams.INSTANCE.getValue();
    }

    public static final Object invoke$50(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1104590eqn();
    }

    public static final Object invoke$51(AFwS205S0000000_17 aFwS205S0000000_17) {
        Iterator<C1134410fct> it2 = TaskManagerV2.LIZIZ.iterator();
        while (it2.hasNext()) {
            C1134640fdG.LJ(it2.next(), "[date switch] after switch");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$52(AFwS205S0000000_17 aFwS205S0000000_17) {
        C20441214yg.LJ("IncentiveDebug", "[error on generating new task]:\n");
        return Unit.LIZ;
    }

    public static final Object invoke$53(AFwS205S0000000_17 aFwS205S0000000_17) {
        C20441214yg.LJIIIZ("IncentiveDebug", "[fully update]");
        return Unit.LIZ;
    }

    public static final Object invoke$54(AFwS205S0000000_17 aFwS205S0000000_17) {
        C20441214yg.LJIIIZ("IncentiveDebug", "[fully update]");
        return Unit.LIZ;
    }

    public static final Object invoke$55(AFwS205S0000000_17 aFwS205S0000000_17) {
        C766270U4b.LIZLLL(2131851586);
        return Unit.LIZ;
    }

    public static final Object invoke$56(AFwS205S0000000_17 aFwS205S0000000_17) {
        C20441214yg.LJIIIZ("IncentiveDebug", "preLoad success");
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ViewModelStore();
    }

    public static final Object invoke$58(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ViewModelStore();
    }

    public static final Object invoke$59(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ViewModelStore();
    }

    public static final Object invoke$6(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IFansClubService.class);
    }

    public static final Object invoke$60(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1104720er0();
    }

    public static final Object invoke$61(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new NextLiveData();
    }

    public static final Object invoke$62(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new NextLiveData();
    }

    public static final Object invoke$63(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new NextLiveData();
    }

    public static final Object invoke$64(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new NextLiveData();
    }

    public static final Object invoke$65(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new NextLiveData();
    }

    public static final Object invoke$66(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf((int) C497740JfY.LIZIZ(28.0f));
    }

    public static final Object invoke$67(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new C1093060eYC();
    }

    public static final Object invoke$68(AFwS205S0000000_17 aFwS205S0000000_17) {
        DataChannelGlobal.LLILZ.HQ2(LiveIsHavingPinCardData.class, Boolean.TRUE);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$69(kotlin.jvm.internal.AFwS205S0000000_17 r7) {
        /*
            com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting$TopOneLineSizeConfig r0 = com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.value
            if (r0 == 0) goto L47
            java.util.List<com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting$Config> r0 = r0.config
            if (r0 == 0) goto L47
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r0.iterator()
        L11:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r3 = r7.next()
            r0 = r3
            com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting$Config r0 = (com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.Config) r0
            int[] r6 = r0.range
            r5 = 0
            if (r6 == 0) goto L11
            int r0 = r6.length
            r2 = 1
            if (r0 <= r2) goto L37
            r0 = r6[r5]
            float r0 = (float) r0
            float r1 = com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.screenWidthDp
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L37
            r0 = r6[r2]
            float r0 = (float) r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L43
        L37:
            int r0 = r6.length
            if (r0 != r2) goto L11
            r0 = r6[r5]
            float r1 = (float) r0
            float r0 = com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.screenWidthDp
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L11
        L43:
            r4.add(r3)
            goto L11
        L47:
            X.13BV r4 = X.C13BV.INSTANCE
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS205S0000000_17.invoke$69(kotlin.jvm.internal.AFwS205S0000000_17):java.lang.Object");
    }

    public static final Object invoke$7(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IFansClubService.class);
    }

    public static final Object invoke$70(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.TRUE;
    }

    public static final Object invoke$71(AFwS205S0000000_17 aFwS205S0000000_17) {
        return 0;
    }

    public static final Object invoke$72(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new GeckoUnDelete();
    }

    public static final Object invoke$73(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object valueSafely = com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely("link_mic_adaptive_rtc_media_info", LinkMicDynamicLayoutMediaSetting.DEFAULT);
        if (valueSafely == null) {
            return LinkMicDynamicLayoutMediaSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }

    public static final Object invoke$74(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        LiveRoomCheckAliveConfig liveRoomCheckAliveConfig = LiveRoomCheckAliveSetting.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_room_check_alive", liveRoomCheckAliveConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return liveRoomCheckAliveConfig;
    }

    public static final Object invoke$75(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C13LP.LLIIJI(LiveI18nCenterTaskScheduleExp.INSTANCE.value().scheduleSources);
    }

    public static final Object invoke$76(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        LiveI18nUpdateRetrySetting.I18nUpdateRetryConfig i18nUpdateRetryConfig = LiveI18nUpdateRetrySetting.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_i18n_update_retry", i18nUpdateRetryConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return i18nUpdateRetryConfig;
    }

    public static final Object invoke$77(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object valueSafely = com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely("live_last_n_perf_feature", LiveLastNPerfFeatureSetting.DEFAULT);
        if (valueSafely == null) {
            return LiveLastNPerfFeatureSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }

    public static final Object invoke$78(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object valueSafely = com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely(LivePlayFullLinkPerfSendExp.class);
        if (valueSafely == null) {
            return LivePlayFullLinkPerfSendExp.DEFAULT;
        }
        return valueSafely;
    }

    public static final Object invoke$79(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(com.bytedance.android.live_settings.SettingsManager.INSTANCE.getBooleanValue("live_public_screen_visible_count_log_setting", LivePublicScreenVisibleLogSetting.DEFAULT));
    }

    public static final Object invoke$8(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IUserLevelService.class);
    }

    public static final Object invoke$80(AFwS205S0000000_17 aFwS205S0000000_17) {
        return 15;
    }

    public static final Object invoke$81(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C13LP.LLIIJI(LiveAdaptEpiToFeatureCenterExp.expValue.getAdaptKeyList());
    }

    public static final Object invoke$82(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(LiveAdaptEpiToFeatureCenterExp.expValue.getEnable());
    }

    public static final Object invoke$83(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.FALSE;
    }

    public static final Object invoke$84(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        String[] strArr = GiftGuideLandscapeNotSupportTypes.DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("gift_guide_landscape_not_support_types", strArr);
        if (stringArrayValue != null) {
            return stringArrayValue;
        }
        return strArr;
    }

    public static final Object invoke$85(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        String[] strArr = UgTaskDetailPageSourceSettings.DEFAULT;
        String[] stringArrayValue = settingsManager.getStringArrayValue("ug_task_detail_page_list_settings", strArr);
        if (stringArrayValue != null) {
            return stringArrayValue;
        }
        return strArr;
    }

    public static final Object invoke$86(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        LiveRepostConsumeConfig.ConsumeGroupConfig consumeGroupConfig = LiveRepostConsumeConfig.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_repost_consume_config", consumeGroupConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return consumeGroupConfig;
    }

    public static final Object invoke$87(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Boolean.valueOf(com.bytedance.android.live_settings.SettingsManager.INSTANCE.getBooleanValue("live_repost_enabled", LiveRepostEnabledSetting.DEFAULT));
    }

    public static final Object invoke$88(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        LiveRepostProduceConfig.ProduceGroupConfig produceGroupConfig = LiveRepostProduceConfig.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_repost_produce_config", produceGroupConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return produceGroupConfig;
    }

    public static final Object invoke$89(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object valueSafely = com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely("live_enter_room_boost_enable", LiveEnterRoomBoostExp.DEFAULT);
        if (valueSafely == null) {
            return LiveEnterRoomBoostExp.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }

    public static final Object invoke$9(AFwS205S0000000_17 aFwS205S0000000_17) {
        return C1161920gLG.LIZJ(IWalletService.class);
    }

    public static final Object invoke$90(AFwS205S0000000_17 aFwS205S0000000_17) {
        Object valueSafely = com.bytedance.android.live_settings.SettingsManager.INSTANCE.getValueSafely(LiveFeedConsumeFeatureSetting.class);
        if (valueSafely == null) {
            return LiveFeedConsumeFeatureSetting.DEFAULT;
        }
        return valueSafely;
    }

    public static final Object invoke$91(AFwS205S0000000_17 aFwS205S0000000_17) {
        com.bytedance.android.live_settings.SettingsManager settingsManager = com.bytedance.android.live_settings.SettingsManager.INSTANCE;
        LivePreCreateNextRoomByDeviceExpConfig livePreCreateNextRoomByDeviceExpConfig = LivePreCreateNextRoomByDeviceExp.DEFAULT;
        Object valueSafely = settingsManager.getValueSafely("live_pre_create_next_room_by_device_exp", livePreCreateNextRoomByDeviceExpConfig);
        if (valueSafely != null) {
            return valueSafely;
        }
        return livePreCreateNextRoomByDeviceExpConfig;
    }

    public static final Object invoke$92(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(LivePreCreateNextRoomByDeviceExp.INSTANCE.getDelayTimeByPerformanceScore());
    }

    public static final Object invoke$93(AFwS205S0000000_17 aFwS205S0000000_17) {
        float fLJ;
        InterfaceC1101100elA interfaceC1101100elAOK1;
        IHostPerformanceMonitor iHostPerformanceMonitor = (IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class);
        if (iHostPerformanceMonitor != null && (interfaceC1101100elAOK1 = iHostPerformanceMonitor.OK1()) != null) {
            fLJ = interfaceC1101100elAOK1.LJ();
        } else {
            fLJ = 0.0f;
        }
        return Float.valueOf(fLJ);
    }

    public static final Object invoke$94(AFwS205S0000000_17 aFwS205S0000000_17) {
        return Integer.valueOf(com.bytedance.android.live_settings.SettingsManager.INSTANCE.getIntValue("watch_live_mem_opt_setting", WatchLiveMemOpt.DEFAULT));
    }

    public static final Object invoke$95(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkedHashMap();
    }

    public static final Object invoke$96(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new BPEAHandler(Looper.getMainLooper());
    }

    public static final Object invoke$97(AFwS205S0000000_17 aFwS205S0000000_17) {
        return LiveEffectNotifyTypeNameMappingSetting.getValue();
    }

    public static final Object invoke$98(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new LinkedHashMap();
    }

    public static final Object invoke$99(AFwS205S0000000_17 aFwS205S0000000_17) {
        return new ArrayList();
    }
}
