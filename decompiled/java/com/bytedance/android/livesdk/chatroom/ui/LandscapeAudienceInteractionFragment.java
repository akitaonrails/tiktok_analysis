package com.bytedance.android.livesdk.chatroom.ui;

import X.C001A;
import X.C00UF;
import X.C098200Yq;
import X.C0IF2;
import X.C0IHY;
import X.C0IIO;
import X.C0IJ3;
import X.C0IJ7;
import X.C0IJT;
import X.C0IK5;
import X.C0IMP;
import X.C0J1N;
import X.C0J3Y;
import X.C0TDH;
import X.C1077720e9S;
import X.C1077990e9t;
import X.C1078030e9x;
import X.C1078090eA3;
import X.C1078430eAb;
import X.C1078440eAc;
import X.C1078580eAq;
import X.C1078610eAt;
import X.C1080810eER;
import X.C1081880eGA;
import X.C1081920eGE;
import X.C1081930eGF;
import X.C1081970eGJ;
import X.C1081990eGL;
import X.C1082040eGQ;
import X.C1082070eGT;
import X.C1083340eIW;
import X.C1151720g4o;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C11S5;
import X.C1338270kvh;
import X.C1685300txQ;
import X.C16FY;
import X.C1701940uOG;
import X.C189200o6;
import X.C19475811Ho;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C19ME;
import X.C437170HCh;
import X.C464800IKo;
import X.C465230IMf;
import X.C473130Igx;
import X.C473180Ih2;
import X.C474500IjA;
import X.C486790J7d;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520220Kai;
import X.C753990Tht;
import X.C766270U4b;
import X.C776250Uch;
import X.C781520UlC;
import X.C784440Upu;
import X.C786410Ut5;
import X.C938200aWQ;
import X.C945320ahu;
import X.C956940b0e;
import X.EnumC1083180eIG;
import X.EnumC473170Ih1;
import X.EnumC476080Ili;
import X.EnumC520190Kaf;
import X.InterfaceC1077710e9R;
import X.InterfaceC1078490eAh;
import X.InterfaceC1082180eGe;
import X.InterfaceC1085480eLy;
import X.InterfaceC1087920ePu;
import X.InterfaceC465670INx;
import X.InterfaceC765730U1z;
import X.InterfaceC924870aAv;
import X.InterfaceC943880afa;
import X.InterfaceC948540an6;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS350S0100000_7;
import Y.AObjectS360S0100000_17;
import Y.AObjectS392S0100000_17;
import Y.AObjectS60S0000000_7;
import Y.AObjectS70S0000000_17;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS13S0100100_7;
import Y.AfS132S0000000_7;
import Y.AfS139S0000000_17;
import Y.AfS153S0200000_17;
import Y.AfS176S0100000_7;
import Y.AfS186S0100000_17;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget;
import com.bytedance.android.live.poll.ILiveNormalPollViewModel;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.BlockMessageEvent;
import com.bytedance.android.livesdk.ChangeMessagePanelEvent;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.LockScreenEvent;
import com.bytedance.android.livesdk.MessageSelectWidgetEvent;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.landscape.LandscapeLayeredElementManager;
import com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveTopShareWidget;
import com.bytedance.android.livesdk.chatroom.widget.LockScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.PinchTimesWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.chatroom.widget.WatchLiveBackBtnWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.AbsGameLinkControlWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.customizedperks.LandAudienceCustomizedPerksCard;
import com.bytedance.android.livesdk.dataChannel.AudienceShowSwitchDefinitionEvent;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.CloseGameBubbleModelEvent;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LandscapePinchTimesChannel;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.game.GameLinkMicLandscapeWidget;
import com.bytedance.android.livesdk.livesetting.game.GameLiveLandscapeAutoHideTimeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveLandscapeTopShadowOpt;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameLandscapeChatDefaultSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveU18HiddenCountSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadOPTSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingCompetitiveAtmosphereSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMomentQuickCommentWatchliveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePinchZoomConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.model.message.BizStickerMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdk.widget.LiveDebugInfoWidget;
import com.bytedance.android.livesdk.widget.LiveDetectInfoView;
import com.bytedance.android.livesdkapi.depend.event.LiveGiftShowPinCardEvent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager;
import com.bytedance.ies.sdk.widgets.recycleelement.RecycleLayeredElementManger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class LandscapeAudienceInteractionFragment extends AbsAudienceInteractionFragment implements InterfaceC1087920ePu, OnIMMessageListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiHELIOSPCZ9BCQiLTwwKTUpCDo3ISAiKioaJjEpOy4wPCwjJwkhKSIhLCEn";
    public static final long v = GameLiveLandscapeAutoHideTimeSetting.INSTANCE.getValue();
    public View LLLZZIL;
    public boolean LLZ;
    public long LLZIL;
    public C11JF LLZILL;
    public boolean LLZL;
    public boolean LLZLI;
    public boolean LLZLL;
    public SwitchDefinitionTipsWidget LLZLLIL;
    public C1081920eGE LLZLLLL;
    public PinchTimesWidget LLZZ;
    public AbsGameLinkControlWidget LLZZJLIL;
    public BaseLinkControlWidget LLZZLLIL;
    public C1081930eGF LLZZZIL;
    public final C11PQ<Boolean> LLZZZZ;
    public C11JF l;
    public LandscapeLayeredElementManager m;
    public int n;
    public AbsVoiceChatControlWidget o;
    public ActQuizWidget p;
    public LiveDebugInfoWidget q;
    public LiveDetectInfoView r;
    public InterfaceC765730U1z s;
    public KaraokeRecyclableWidget t;
    public final C1081880eGA u;

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean BU() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void CT(SurveyData surveyData) {
    }

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "LandscapeAudienceInteractionFragment";
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean NS() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final LayeredWidgetManager PT() {
        LandscapeLayeredElementManager landscapeLayeredElementManager = this.m;
        if (landscapeLayeredElementManager != null) {
            landscapeLayeredElementManager.reuse(this, this.LLJIJIL);
        }
        if (this.m == null) {
            this.m = new LandscapeLayeredElementManager(getContext(), this, (C1083340eIW) getView().findViewById(R.id.q32), this.LLJIJIL);
        }
        LayeredWidgetManager layeredWidgetManagerOf = LayeredWidgetManager.Companion.of(true, this, this.LLILLJJLI, LiveWidgetProviderProxy.getInstance(), C486790J7d.LIZ, this.m, C0IJ7.LIZLLL(getContext()), LiveLayoutPreloadThreadOPTSetting.threadOptimize(true));
        layeredWidgetManagerOf.setCheckContentViewAttached(true);
        return layeredWidgetManagerOf;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "live_landscape_interaction";
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final InterfaceC1082180eGe ES() {
        return new C1077720e9S() { // from class: X.0eAs
            @Override // X.C1077720e9S, X.InterfaceC1082180eGe
            public final void LIZIZ() {
            }

            @Override // X.C1077720e9S, X.InterfaceC1082180eGe
            public final void onScaleBegin() {
                LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = this.LIZ;
                if (!landscapeAudienceInteractionFragment.LLZL) {
                    landscapeAudienceInteractionFragment.LLZL = true;
                    landscapeAudienceInteractionFragment.RU();
                    landscapeAudienceInteractionFragment.MU(0);
                }
                LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment2 = this.LIZ;
                if (landscapeAudienceInteractionFragment2.LLZZ != null || landscapeAudienceInteractionFragment2.LLJJI == null || landscapeAudienceInteractionFragment2.LLIZLLLIL == null) {
                    return;
                }
                PinchTimesWidget pinchTimesWidget = new PinchTimesWidget();
                landscapeAudienceInteractionFragment2.LLZZ = pinchTimesWidget;
                landscapeAudienceInteractionFragment2.LLJJI.load(R.id.m5g, pinchTimesWidget);
            }

            @Override // X.C1077720e9S, X.InterfaceC1082180eGe
            public final void LIZJ(EnumC1083180eIG enumC1083180eIG) {
                Room room = this.LIZ.LLJILJIL;
                if (room != null) {
                    C1078610eAt.LIZ(room.getId(), false, enumC1083180eIG);
                }
            }

            @Override // X.C1077720e9S, X.InterfaceC1082180eGe
            public final void LIZ(float f, int i) {
                DataChannel dataChannel;
                LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = this.LIZ;
                PinchTimesWidget pinchTimesWidget = landscapeAudienceInteractionFragment.LLZZ;
                if (pinchTimesWidget != null && pinchTimesWidget.hasAttached && (dataChannel = landscapeAudienceInteractionFragment.LLJIJIL) != null) {
                    dataChannel.zW(LandscapePinchTimesChannel.class, new Pair(Float.valueOf(f), Integer.valueOf(i)));
                }
            }

            @Override // X.C1077720e9S, X.InterfaceC1082180eGe
            public final void LIZLLL(float f, int i, boolean z) {
                long id;
                Room room = this.LIZ.LLJILJIL;
                if (room != null) {
                    id = room.getId();
                    if (f < 1.0f) {
                        f = 1.0f;
                    }
                    if (!z) {
                        C1078610eAt.LIZIZ(id, f, false);
                    }
                } else {
                    id = 0;
                }
                DataChannel dataChannel = this.LIZ.LLJIJIL;
                if (dataChannel != null) {
                    if (i == 1) {
                        dataChannel.SX0(C1082790eHd.class, Boolean.TRUE);
                        if (!z) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pinch_fill");
                            c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                            c474500IjALIZ.LJJII("zoomed_to_fill", "enter_from");
                            c474500IjALIZ.LIZ();
                        }
                    } else {
                        dataChannel.SX0(C1082790eHd.class, Boolean.FALSE);
                    }
                    this.LIZ.LLJIJIL.zW(LandscapePinchTimesChannel.class, new Pair(Float.valueOf(-1.0f), Integer.valueOf(i)));
                }
            }
        };
    }

    public final void EU() {
        if (C781520UlC.LJII(this.LLJILJIL) || C781520UlC.LIZLLL(this.LLJILJIL) || C781520UlC.LJIIL(this.LLJILJIL) || C781520UlC.LJFF(this.LLJILJIL) || C781520UlC.LJIIJ(this.LLJILJIL)) {
            ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).QE(this.LLJILJIL, false, false, this.LLJJI, this.LLJIJIL, this);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void Ev() {
        if (this.LLLLIL == null) {
            return;
        }
        LiveNormalPollEffectWidget liveNormalPollEffectWidgetYe0 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ye0(false, this.LLJJI);
        C0TDH c0tdhLJLZ = this.LLLLIL.wQ2().LJLZ();
        if (c0tdhLJLZ != null && c0tdhLJLZ.isHasVoted()) {
            HU(liveNormalPollEffectWidgetYe0);
        }
        C11PQ<C0TDH> c11pqWQ2 = this.LLLLIL.wQ2();
        c11pqWQ2.getClass();
        ((C0J1N) new C19475811Ho(c11pqWQ2).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS153S0200000_17(liveNormalPollEffectWidgetYe0, this, 5), new AfS132S0000000_7(11));
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void J8() {
        if (C00UF.LIZIZ(this.LLJILJIL)) {
            this.LLJJI.load(R.id.jmj, ((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).getHighPrioritySlotWidget());
        }
    }

    public final void JU() {
        if (this.LLJJI == null || !C494680Jac.LJIIL(this.LLJILJIL)) {
            return;
        }
        RecyclableWidgetManager recyclableWidgetManager = this.LLJJI;
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).pa().getClass();
        recyclableWidgetManager.load(R.id.fdx, LandAudienceCustomizedPerksCard.class);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void KG() {
        View viewFindViewById;
        if (this.LLJILJIL == null || this.LLLZZIL == null) {
            return;
        }
        if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) && (viewFindViewById = this.LLLZZIL.findViewById(R.id.mw7)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            Boolean bool = C0IJ3.LIZ;
            Boolean bool2 = C0IJ3.LIZ;
            if (bool2 == null || !bool2.booleanValue()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            if (this.r == null) {
                LiveDetectInfoView liveDetectInfoView = new LiveDetectInfoView();
                this.r = liveDetectInfoView;
                this.LLJJI.load(R.id.mw7, liveDetectInfoView);
            }
            this.r.args = new Object[]{this.LLJILJIL};
        }
    }

    public final void RU() {
        C11JF c11jf = this.LLZILL;
        if (c11jf == null || c11jf.isDisposed()) {
            return;
        }
        this.LLZILL.dispose();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void a6() {
        LiveRecyclableWidget recyclableWidgetFromCacheOrNew = this.LLJJI.getRecyclableWidgetFromCacheOrNew(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).eQ(), null, new AObjectS70S0000000_17(4));
        LiveRecyclableWidget recyclableWidgetFromCacheOrNew2 = this.LLJJI.getRecyclableWidgetFromCacheOrNew(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Gi0(), null, new AObjectS70S0000000_17(2));
        Room room = this.LLJILJIL;
        boolean z = (room == null || room.getPictionaryFullInfo() == null) ? false : true;
        C1077990e9t c1077990e9t = this.LLJJIII;
        if (recyclableWidgetFromCacheOrNew != null) {
            c1077990e9t.getClass();
            if (!C1081990eGL.LIZ(recyclableWidgetFromCacheOrNew.getClass().getSimpleName()) || z) {
                c1077990e9t.LIZ.load(R.id.g_h, recyclableWidgetFromCacheOrNew);
            } else {
                this.LLJJIJI.addMessageListener(C001A.DRAW_GUESS_START_MESSAGE.getIntType(), new C1151720g4o(new C1078430eAb(recyclableWidgetFromCacheOrNew, c1077990e9t, R.id.g_h), 17));
            }
        } else {
            c1077990e9t.LIZ.load(R.id.g_h, recyclableWidgetFromCacheOrNew);
        }
        C1077990e9t c1077990e9t2 = this.LLJJIII;
        if (recyclableWidgetFromCacheOrNew2 != null) {
            c1077990e9t2.getClass();
            if (!C1081990eGL.LIZ(recyclableWidgetFromCacheOrNew2.getClass().getSimpleName()) || z) {
                c1077990e9t2.LIZ.load(R.id.g_e, recyclableWidgetFromCacheOrNew2);
            } else {
                this.LLJJIJI.addMessageListener(C001A.DRAW_GUESS_START_MESSAGE.getIntType(), new C1151720g4o(new C1078430eAb(recyclableWidgetFromCacheOrNew2, c1077990e9t2, R.id.g_e), 11));
            }
        } else {
            c1077990e9t2.LIZ.load(R.id.g_e, recyclableWidgetFromCacheOrNew2);
        }
        C1081970eGJ.LIZ.LIZ(this.LLJIJIL);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void b6() {
        View viewFindViewById;
        if (this.LLJILJIL == null || this.LLLZZIL == null) {
            return;
        }
        if ((((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) && (viewFindViewById = this.LLLZZIL.findViewById(R.id.fgl)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            Boolean bool = C0IHY.LIZ;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            if (this.q == null) {
                this.q = new LiveDebugInfoWidget();
            }
            LiveDebugInfoWidget liveDebugInfoWidget = this.q;
            liveDebugInfoWidget.args = new Object[]{this.LLJILJIL};
            this.LLJJI.load(R.id.fgl, liveDebugInfoWidget);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void bf() {
        this.LLJJI.load(R.id.ebi, (Class) ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).EW0(), true);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void eQ() {
        if (((Boolean) this.LLLJIL.LJIIL.getValue()).booleanValue()) {
            this.LLJJI.load(R.id.isf, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).c32());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void kq() {
        ILiveNormalPollViewModel iLiveNormalPollViewModel = this.LLLLIL;
        if (iLiveNormalPollViewModel == null) {
            return;
        }
        if (iLiveNormalPollViewModel.AQ2()) {
            this.LLJJI.load(R.id.f814ule, ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).nQ0(), false, new Object[]{this.LLLLIL.vQ2().getValue()});
            return;
        }
        C1077990e9t c1077990e9t = this.LLJJIII;
        Class<? extends LiveRecyclableWidget> clsNQ0 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).nQ0();
        if (clsNQ0 == null) {
            c1077990e9t.LIZ.load(R.id.f814ule, clsNQ0);
            return;
        }
        c1077990e9t.getClass();
        if (C1081990eGL.LIZ(clsNQ0.getSimpleName())) {
            this.LLJJIJI.addMessageListener(C001A.LIVE_POLL_MESSAGE.getIntType(), new C1151720g4o(new C1078440eAc(c1077990e9t, R.id.f814ule, clsNQ0), 7));
        } else {
            c1077990e9t.LIZ.load(R.id.f814ule, clsNQ0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment.onDestroy():void");
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.u.LIZJ(this.LLJIJIL);
        C1080810eER.LIZ = false;
        C1081920eGE c1081920eGE = this.LLZLLLL;
        if (c1081920eGE != null) {
            View view = c1081920eGE.LIZJ;
            if (view != null) {
                view.removeOnLayoutChangeListener(c1081920eGE.LJIJI);
            }
            View view2 = c1081920eGE.LIZLLL;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(c1081920eGE.LJIJJ);
            }
            c1081920eGE.LIZJ();
            c1081920eGE.LJIJ.clear();
            c1081920eGE.LJIIZILJ.clear();
        }
        IMessageManager iMessageManager = this.LLJJIJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(C001A.BIZ_STICKER_MESSAGE.getIntType(), this);
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C1081920eGE c1081920eGE = this.LLZLLLL;
        if (c1081920eGE != null) {
            c1081920eGE.LJIIIIZZ = true;
        }
        RU();
        super.onPause();
        C1081880eGA c1081880eGA = this.u;
        c1081880eGA.getClass();
        if (C1081880eGA.LIZIZ() && c1081880eGA.LIZJ == -1) {
            c1081880eGA.LIZJ = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ((IPadAutoRotateScreenService) C1161920gLG.LIZJ(IPadAutoRotateScreenService.class)).RQ0();
        PU();
        MU(1);
        if (this.LLLZZIL != null) {
            HandlerHook.viewPostDelay(this.LLLZZIL, new ARunnableS107S0100000_7((Object) this, 37), 300L);
        }
        C1081920eGE c1081920eGE = this.LLZLLLL;
        if (c1081920eGE != null) {
            c1081920eGE.LJIIIIZZ = false;
        }
        super.onResume();
        this.u.LIZ();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, X.InterfaceC1078180eAC
    public final void r4() {
        this.LLJJI.load(R.id.ea1, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).aF());
    }

    public LandscapeAudienceInteractionFragment() {
        this.LLZLI = TtliveGameLandscapeChatDefaultSwitcherSetting.isEnabled() || InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue();
        this.LLZZZZ = C11PQ.LJLLLLLL(Boolean.FALSE);
        this.l = null;
        this.n = 0;
        this.p = null;
        this.u = new C1081880eGA();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void Hu() {
        super.Hu();
        ((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS176S0100000_7(this, 43));
        this.LLZLLLL = new C1081920eGE(this.LLILLJJLI, this.LLJIJIL);
        if (this.LLILLJJLI != null) {
            HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS117S0100000_17(this, 63));
        }
        if (C497740JfY.LJIL() || !C0IIO.LJIIIIZZ) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("landscape_feed_slide_complete");
        c474500IjALIZ.LJJII(1, "landscape_slide_enter_room_status");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - C0IIO.LIZJ), "landscape_slide_to_load_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(C0IIO.LIZLLL), "landscape_position");
        c474500IjALIZ.LJJII(Boolean.valueOf(C0IIO.LJII), "landscape_first_frame_has_displayed");
        c474500IjALIZ.LJJII(C0IIO.LJI, "landscape_live_type");
        c474500IjALIZ.LJJII(Long.valueOf(C0IIO.LJ), "landscape_slide_enter_room_duration");
        c474500IjALIZ.LJJII(Long.valueOf(C0IIO.LJFF), "room_id");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void IT() {
        super.IT();
        C0IK5.LIZIZ(this.LLLZL, new ARunnableS115S0100000_15(this, 82));
        final LiveWidget audiencePinCardWidget = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getAudiencePinCardWidget(true);
        final C1077990e9t c1077990e9t = this.LLJJIII;
        if (audiencePinCardWidget != null) {
            c1077990e9t.getClass();
            if (C1081990eGL.LIZ(audiencePinCardWidget.getClass().getSimpleName())) {
                InterfaceC1078490eAh interfaceC1078490eAh = new InterfaceC1078490eAh() { // from class: X.0eAd
                    public boolean LIZ;
                    public final /* synthetic */ int LIZLLL = R.id.qfy;

                    @Override // X.InterfaceC1078490eAh
                    public final /* synthetic */ void LIZ(Object... objArr) {
                    }

                    @Override // X.InterfaceC1078490eAh
                    public final void invoke(Object obj) {
                        if (!this.LIZ) {
                            this.LIZ = true;
                            Widget widget = audiencePinCardWidget;
                            widget.args = new C1078480eAg[]{new C1078480eAg(obj)};
                            c1077990e9t.LIZ.load(this.LIZLLL, widget, false);
                        }
                    }
                };
                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).resetPinCardStatus();
                DataChannelGlobal.LLILZ.CQ2(LiveGiftShowPinCardEvent.class, this, new AObjectS360S0100000_17(interfaceC1078490eAh, 50));
            } else {
                c1077990e9t.LIZ.load(R.id.qfy, (Widget) audiencePinCardWidget, false);
            }
        } else {
            c1077990e9t.LIZ.load(R.id.qfy, (Widget) audiencePinCardWidget, false);
        }
        IMessageManager iMessageManager = this.LLJJIJI;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.BIZ_STICKER_MESSAGE.getIntType(), (OnIMMessageListener) this);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void KT() {
        IMessageManager iMessageManager;
        InterfaceC1085480eLy interfaceC1085480eLyO41;
        super.KT();
        if (this.LLJILJIL != null && (interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(this.LLJILJIL.getId())) != null && interfaceC1085480eLyO41.isEnabled() && interfaceC1085480eLyO41.LIZIZ()) {
            interfaceC1085480eLyO41.LJIIJ(this);
            this.l = (C11JF) this.LLZZZZ.LJJIFFI().LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 30));
        }
        LiveMode liveMode = this.LLJI;
        if (liveMode == LiveMode.LIVE_STUDIO || liveMode == LiveMode.THIRD_PARTY) {
            DataChannel dataChannel = this.LLJIJIL;
            C1081930eGF c1081930eGF = new C1081930eGF(dataChannel);
            this.LLZZZIL = c1081930eGF;
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
                iMessageManager.addMessageListener(C001A.BASE_LINK_LAYER_MESSAGE.getIntType(), c1081930eGF);
            }
            if (C465230IMf.LIZ(this.LLJIJIL) || !LiveSdkLinkMicLandscapeSetting.isEnable()) {
                GameLinkControlWidget gameLinkControlWidgetB70 = ((IGameLinkMicService) C1161920gLG.LIZJ(IGameLinkMicService.class)).B70(new InterfaceC924870aAv() { // from class: X.0asT
                    @Override // X.InterfaceC924870aAv
                    public final void LIZ(LiveWidget liveWidget) {
                        this.LIZ.LLJJI.unload(liveWidget);
                    }

                    @Override // X.InterfaceC924870aAv
                    public final void LIZIZ(GameLinkV2Widget gameLinkV2Widget) {
                        if (GameLinkMicLandscapeWidget.INSTANCE.isDefault()) {
                            View viewFindViewById = this.LIZ.LLILLJJLI.findViewById(R.id.ir1);
                            if (viewFindViewById instanceof ViewGroup) {
                                gameLinkV2Widget.U0((ViewGroup) viewFindViewById);
                                this.LIZ.LLJJI.load(R.id.ir1, (Widget) gameLinkV2Widget, false);
                                return;
                            }
                            return;
                        }
                        gameLinkV2Widget.U0((ViewGroup) this.LIZ.LLILLJJLI.findViewById(R.id.ir1));
                        this.LIZ.LLJJI.load(R.id.ir1, (Widget) gameLinkV2Widget, false);
                    }
                });
                this.LLZZJLIL = gameLinkControlWidgetB70;
                if (gameLinkControlWidgetB70 != null) {
                    this.LLJJI.load(R.id.ir1, gameLinkControlWidgetB70);
                    ListProtector.add(this.LLLII, 0, this.LLZZJLIL);
                }
            } else {
                final InterfaceC948540an6 interfaceC948540an6E32 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).e32();
                LinkControlWidget linkControlWidgetLJ = interfaceC948540an6E32.LJ(new InterfaceC943880afa() { // from class: X.0asS
                    @Override // X.InterfaceC943880afa
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC943880afa
                    public final void LIZ(LiveWidget liveWidget) {
                        this.LIZIZ.LLJJI.unload(liveWidget);
                    }

                    @Override // X.InterfaceC943880afa
                    public final InterfaceC944150ag1 LIZJ(int i, boolean z, C952540atY c952540atY) {
                        if (i != 1) {
                            return null;
                        }
                        MultiGuestV3GuestWidget multiGuestV3GuestWidgetLJI = interfaceC948540an6E32.LJI((FrameLayout) this.LIZIZ.LLILLJJLI.findViewById(R.id.ir1), this.LIZIZ.LLJJJJJIL, 0);
                        this.LIZIZ.LLJJI.load(R.id.pbp, (Widget) multiGuestV3GuestWidgetLJI, false);
                        return multiGuestV3GuestWidgetLJI;
                    }
                });
                this.LLZZLLIL = linkControlWidgetLJ;
                if (linkControlWidgetLJ != null) {
                    this.LLJJI.load(R.id.ir1, linkControlWidgetLJ);
                    ListProtector.add(this.LLLII, 0, this.LLZZLLIL);
                }
            }
        }
        if (((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).VF1()) {
            this.LLJIJIL.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C938200aWQ(EnumC476080Ili.NORMAL_TRAY.getValue(), 100));
        }
        if (LiveGameMomentQuickCommentWatchliveSetting.INSTANCE.quiciCommentLandscapeEnable()) {
            this.LLJJI.load(R.id.sme, ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).TO0());
        }
        new C1082070eGT(this.LLJJI).LIZ();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void OT() {
        super.OT();
        C0IK5.LIZ().removeCallbacksAndMessages(this.LLLZL);
    }

    public final void PU() {
        RU();
        this.LLZILL = (C11JF) C11NZ.LJLJJLL(v, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS186S0100000_17(this, 29), new AfS139S0000000_17(0));
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void mT() {
        super.mT();
        if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
            C0IK5.LIZIZ(this.LLLZL, new ARunnableS117S0100000_17(this, 64));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean HS() {
        return this.LLZLL;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final LayeredElementManager uS() {
        return this.m;
    }

    public final void GU(EnumC473170Ih1 enumC473170Ih1) {
        if (enumC473170Ih1 != null && this.LLJIJIL != null) {
            int i = C473180Ih2.LIZ[enumC473170Ih1.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    this.LLJIJIL.zW(CloseGameBubbleModelEvent.class, Boolean.FALSE);
                    if (!this.LLZLI) {
                        NU(true);
                        return;
                    }
                    return;
                }
                if (this.LLZLI) {
                    NU(false);
                }
                this.LLJIJIL.zW(CloseGameBubbleModelEvent.class, Boolean.FALSE);
                return;
            }
            if (!this.LLZLI) {
                NU(true);
            }
            this.LLJIJIL.zW(CloseGameBubbleModelEvent.class, Boolean.TRUE);
        }
    }

    public final void HU(LiveRecyclableWidget liveRecyclableWidget) {
        if (this.LLLLIL != null && liveRecyclableWidget != null && !liveRecyclableWidget.hasAttached) {
            this.LLJJI.load(R.id.n2m, liveRecyclableWidget);
        }
    }

    public final void MU(int i) {
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.SX0(C753990Tht.class, Boolean.valueOf(this.LLZL));
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(3);
        boolean z = false;
        sparseBooleanArray.put(0, this.LLZL);
        sparseBooleanArray.put(1, this.LLZLI);
        sparseBooleanArray.put(2, this.LLZLL);
        C473130Igx c473130Igx = new C473130Igx();
        c473130Igx.LIZ = sparseBooleanArray;
        c473130Igx.LIZIZ = i;
        if (i == 1 && this.LLZLI) {
            z = true;
        }
        c473130Igx.LIZJ = z;
        C784440Upu.LIZ().LIZIZ(c473130Igx);
    }

    public final void NU(boolean z) {
        C1078090eA3 c1078090eA3;
        this.LLZLI = z;
        C1080810eER.LIZ = true;
        C1080810eER.LIZIZ = z;
        if (!TtliveGameLandscapeChatDefaultSwitcherSetting.isEnabled()) {
            InterfaceC465670INx.LJLILLLLZI.LJFF(Boolean.valueOf(z));
        }
        PU();
        if (z) {
            this.LLZL = true;
            RU();
        }
        MU(1);
        if (LivePinchZoomConfigSetting.enablePinch(false) && (c1078090eA3 = this.LLIZLLLIL) != null) {
            c1078090eA3.LJIIIZ.LJI(false, EnumC1083180eIG.OTHER);
            this.LLIZLLLIL.LJIIIZ.LJ(!z);
            PinchTimesWidget pinchTimesWidget = this.LLZZ;
            if (pinchTimesWidget != null) {
                pinchTimesWidget.hide();
            }
        }
        C1081920eGE c1081920eGE = this.LLZLLLL;
        if (c1081920eGE != null && z && c1081920eGE.LJI.get()) {
            c1081920eGE.LIZJ();
            c1081920eGE.LJI.set(false);
            c1081920eGE.LJII.set(false);
        }
    }

    public final void OU(boolean z) {
        PinchTimesWidget pinchTimesWidget;
        if (!z && Boolean.TRUE.equals(Boolean.valueOf(((C520220Kai) this.LLJIJIL.gg0(ProgrammedLiveMenuVisibilityChannel.class)).LIZ))) {
            this.LLJIJIL.zW(ProgrammedLiveMenuVisibilityChannel.class, new C520220Kai(false, EnumC520190Kaf.BLANK_SPACE));
            return;
        }
        boolean z2 = !this.LLZL;
        this.LLZL = z2;
        if (!z2) {
            PU();
        } else {
            RU();
        }
        boolean z3 = this.LLZL;
        if (LivePinchZoomConfigSetting.enablePinch(false) && (pinchTimesWidget = this.LLZZ) != null) {
            View view = pinchTimesWidget.getView();
            if (view != null) {
                HandlerHook.viewRemoveCallbacks(view, (Runnable) pinchTimesWidget.LLILZ.getValue());
            }
            if (z3) {
                this.LLZZ.hide();
            } else {
                C1078090eA3 c1078090eA3 = this.LLIZLLLIL;
                if (c1078090eA3 != null && c1078090eA3.LJIIIZ.LJII && this.LLZZ.getView() != null && !this.LLZLL) {
                    ViewGroup.LayoutParams layoutParams = this.LLZZ.getView().getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) C497740JfY.LIZIZ(104.0f);
                        C786410Ut5.W5(this.LLZZ.getView(), layoutParams);
                    }
                    this.LLZZ.x1(C497740JfY.LJIJI(2131843095), new AObjectS392S0100000_17(this, 7), true);
                    this.LLZZ.show();
                } else {
                    C1078090eA3 c1078090eA32 = this.LLIZLLLIL;
                    if (c1078090eA32 != null && !c1078090eA32.LJIIIZ.LJII) {
                        this.LLZZ.hide();
                    }
                }
            }
        }
        MU(0);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void cU(C945320ahu c945320ahu) {
        KaraokeRecyclableWidget karaokeRecyclableWidget;
        String str;
        String str2;
        String strLJIJI;
        LinkLayerMessage linkLayerMessage;
        DataChannel dataChannel;
        super.cU(c945320ahu);
        if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
            ActQuizWidget actQuizWidget = this.p;
            if (actQuizWidget != null && actQuizWidget.D1(c945320ahu.LIZIZ)) {
                return;
            }
            AbsVoiceChatControlWidget absVoiceChatControlWidget = this.o;
            if (absVoiceChatControlWidget != null) {
                absVoiceChatControlWidget.x1(c945320ahu);
            }
        }
        BaseLinkControlWidget baseLinkControlWidget = this.LLZZLLIL;
        if (baseLinkControlWidget != null) {
            ((LinkControlWidget) baseLinkControlWidget).Q1(c945320ahu);
        }
        AbsGameLinkControlWidget absGameLinkControlWidget = this.LLZZJLIL;
        if (absGameLinkControlWidget != null) {
            absGameLinkControlWidget.x1(c945320ahu);
        }
        C1081930eGF c1081930eGF = this.LLZZZIL;
        if (c1081930eGF != null && (str2 = c945320ahu.LIZIZ) != null && !c1081930eGF.LLILLJJLI && !Intrinsics.LJFF(c1081930eGF.LLILLL, str2)) {
            if (!Intrinsics.LJFF(new Regex("(,(.){2}talk\"(.+?),)|(,(.){2}timestamp(.){3}[0-9]*,)|(signResult(.+?)\\})|(,(.){1}canvas(.+)\\})").replace(c1081930eGF.LLILLL, ","), new Regex("(,(.){2}talk\"(.+?),)|(,(.){2}timestamp(.){3}[0-9]*,)|(signResult(.+?)\\})|(,(.){1}canvas(.+)\\})").replace(str2, ",")) && !c1081930eGF.LLILZIL) {
                c1081930eGF.LLILLL = str2;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("app_data")) {
                            int i = JSONObjectProtectorUtils.getInt(new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "app_data")), "ver");
                            if ((i == 2 || i == 5) && !c1081930eGF.LLILLJJLI) {
                                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                                if (iInteractService != null) {
                                    iInteractService.kn1();
                                }
                                c1081930eGF.LLILLJJLI = true;
                                C464800IKo.LIZ.LIZJ();
                                IHybridContainerManageService iHybridContainerManageService = (IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class);
                                if (iHybridContainerManageService != null) {
                                    iHybridContainerManageService.ZP(true);
                                }
                                DataChannel dataChannel2 = c1081930eGF.LL;
                                if (dataChannel2 != null) {
                                    dataChannel2.FQ2(OrientationChangeEvent.class);
                                }
                                if (i != 2) {
                                    if (i == 5) {
                                        strLJIJI = C497740JfY.LJIJI(2131843351);
                                    }
                                    linkLayerMessage = c1081930eGF.LLILZ;
                                    if (linkLayerMessage != null && (dataChannel = c1081930eGF.LL) != null) {
                                        dataChannel.SX0(C956940b0e.class, linkLayerMessage);
                                    }
                                } else {
                                    strLJIJI = C497740JfY.LJIJI(2131842957);
                                }
                                if (strLJIJI != null) {
                                    C766270U4b.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL, C497740JfY.LJII(), strLJIJI);
                                }
                                linkLayerMessage = c1081930eGF.LLILZ;
                                if (linkLayerMessage != null) {
                                    dataChannel.SX0(C956940b0e.class, linkLayerMessage);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
        InterfaceC1077710e9R interfaceC1077710e9R = this.LLLLZLLLI;
        if (interfaceC1077710e9R != null) {
            interfaceC1077710e9R.LIZJ(c945320ahu);
        }
        if (LiveSdkLinkMicLandscapeSetting.isEnable() && (karaokeRecyclableWidget = this.t) != null && (str = c945320ahu.LIZIZ) != null) {
            karaokeRecyclableWidget.x1(str);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void dS(boolean z) {
        C1078090eA3 c1078090eA3 = this.LLIZLLLIL;
        if (c1078090eA3 == null) {
            return;
        }
        if (!z) {
            c1078090eA3.LJIIIZ.LJI(false, EnumC1083180eIG.OTHER);
            PinchTimesWidget pinchTimesWidget = this.LLZZ;
            if (pinchTimesWidget != null) {
                pinchTimesWidget.hide();
            }
            Room room = this.LLJILJIL;
            if (room != null) {
                C1078610eAt.LIZ(room.getId(), false, EnumC1083180eIG.FULL_SCREEN_BTN);
                return;
            }
            return;
        }
        Room room2 = this.LLJILJIL;
        if (room2 != null) {
            long id = room2.getId();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_pinch_fill");
            c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
            c474500IjALIZ.LJJII("fullscreen_btn", "enter_from");
            c474500IjALIZ.LIZ();
        }
        this.LLIZLLLIL.LJIIIZ.LJIIIZ();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean dU(MotionEvent motionEvent) {
        if (this.LLZZZZ.LJLZ().booleanValue()) {
            return false;
        }
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.LC0(BaseSingleTapEvent.class, motionEvent);
        }
        OU(false);
        return true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final Boolean kS(int i) {
        boolean z = false;
        if ((i == 1 || C500260Jjc.LJJII(i)) && !this.LLZLL) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final void kU(View view) {
        long id;
        super.kU(view);
        this.LLJJI.load(R.id.np0, (Widget) this.LLJJI.getRecyclableWidgetFromCacheOrNew(LockScreenWidget.class, null, new AObjectS60S0000000_7(10)), false);
        WatchLiveBackBtnWidget watchLiveBackBtnWidget = (WatchLiveBackBtnWidget) this.LLJJI.getRecyclableWidgetFromCacheOrNew(WatchLiveBackBtnWidget.class, null, new AObjectS60S0000000_7(4));
        watchLiveBackBtnWidget.LL = this.LLJJJJJIL;
        this.LLJJI.load(R.id.bn8, (Widget) watchLiveBackBtnWidget, false);
        Room room = this.LLJILJIL;
        if (room != null && room.getStreamUrl() != null && this.LLJILJIL.getStreamUrl().liveCoreSDKData != null && this.LLJILJIL.getStreamUrl().liveCoreSDKData.getPullData() != null && this.LLJILJIL.getStreamUrl().liveCoreSDKData.getPullData().getOptions() != null && this.LLJILJIL.getStreamUrl().liveCoreSDKData.getPullData().getOptions().showQualityButton && ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable()) {
            LiveRecyclableWidget recyclableWidgetFromCacheOrNew = this.LLJJI.getRecyclableWidgetFromCacheOrNew(DefinitionSelectionWidget.class, null, new AObjectS60S0000000_7(12));
            this.LLJJI.load(R.id.wu0, (Widget) recyclableWidgetFromCacheOrNew, false);
            recyclableWidgetFromCacheOrNew.show();
        }
        if (((IShareService) C1161920gLG.LIZJ(IShareService.class)).vH2(this.LLJILJIL)) {
            this.LLJJI.load(R.id.uzz, (Widget) this.LLJJI.getRecyclableWidgetFromCacheOrNew(LiveTopShareWidget.class, null, new AObjectS70S0000000_17(3)), true);
        }
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, ResetSilentTimerEvent.class, new AObjectS360S0100000_17(this, 69));
        }
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, OrientationChangeEvent.class, new AObjectS360S0100000_17(this, 73));
            dataChannel2.BQ2(this, LockScreenEvent.class, new AObjectS350S0100000_7(this, 56));
            dataChannel2.BQ2(this, BlockMessageEvent.class, new AObjectS360S0100000_17(this, 78));
            dataChannel2.BQ2(this, ChangeMessagePanelEvent.class, new AObjectS350S0100000_7(this, 62));
            dataChannel2.BQ2(this, AudienceShowSwitchDefinitionEvent.class, new AObjectS350S0100000_7(this, 65));
            dataChannel2.CQ2(PIPModeChangeEvent.class, this, new AObjectS360S0100000_17(this, 32));
            dataChannel2.BQ2(this, MessageSelectWidgetEvent.class, new AObjectS350S0100000_7(this, 41));
        }
        this.LLJJI.load(R.id.v96, ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).O30(), true, new Object[]{new C1078030e9x(SystemClock.elapsedRealtime())});
        this.LLJJI.load(R.id.v97, ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).no0(), true, new Object[]{new C1078030e9x(SystemClock.elapsedRealtime())});
        ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).VW(this, this.LLJIJIL);
        if (LiveShortTouchApiMergeSetting.INSTANCE.enableRequestWhenWidgetLoad()) {
            IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
            DataChannel dataChannel3 = this.LLJIJIL;
            Room room2 = this.LLJILJIL;
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            iShortTouchService.Y92(dataChannel3, Long.valueOf(id), this);
        }
        if (((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() && LiveU18HiddenCountSetting.INSTANCE.showEngagementCount((Boolean) this.LLJIJIL.gg0(UserIsAnchorChannel.class))) {
            this.LLJJI.load(R.id.s8a, ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).Ue0(false, this.LLJJI));
        }
        if (C00UF.LIZ(this.LLJILJIL)) {
            this.LLJJI.load(R.id.iq1, ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).bV0(), true, new Object[]{new C1082040eGQ(false, true)});
        }
        JU();
        Room room3 = this.LLJILJIL;
        if (room3 != null && (C781520UlC.LJII(room3) || C781520UlC.LIZLLL(this.LLJILJIL) || C781520UlC.LJIIJ(this.LLJILJIL) || (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C781520UlC.LJIIL(this.LLJILJIL)))) {
            long jLIZ = C1078580eAq.LIZ(this.LLJILJIL, this.LLJIJIL);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jLIZ > 0) {
                this.LL.postDelayed(new ARunnableS13S0100100_7(this, jElapsedRealtime, 1), jLIZ);
            } else {
                EU();
            }
        }
        this.LLJJI.load(R.id.ea1, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).nw1());
        if (((Boolean) this.LLLJIL.LJIILIIL.getValue()).booleanValue()) {
            this.LLJJI.load(R.id.vxl, ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).B52());
        }
        if (((Boolean) this.LLLJIL.LJIIL.getValue()).booleanValue()) {
            this.LLJJI.load(R.id.isf, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).l12());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PU();
        this.LLZIL = System.currentTimeMillis();
        ((C0J1N) C784440Upu.LIZ().LJ(C0IF2.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS176S0100000_7(this, 38));
        C1081880eGA c1081880eGA = this.u;
        c1081880eGA.LIZLLL("start");
        if (C1081880eGA.LIZIZ() && c1081880eGA.LIZ == -1) {
            c1081880eGA.LIZ = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        Room room;
        try {
            if ((iMessage instanceof BizStickerMessage) && (dataChannel = this.LLJIJIL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                room.bizStickerList = ((BizStickerMessage) iMessage).bizSticker;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
        this.LLZZZZ.onNext(Boolean.FALSE);
        PU();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C16FY c16fy = (C16FY) view.findViewById(R.id.nus);
        View viewFindViewById = view.findViewById(R.id.nut);
        if (viewFindViewById != null) {
            if (GameLiveLandscapeTopShadowOpt.INSTANCE.getValue()) {
                viewFindViewById.setBackgroundResource(R.drawable.djv);
            } else {
                viewFindViewById.setBackgroundResource(R.drawable.dju);
            }
        }
        ViewGroup.LayoutParams layoutParams = c16fy.getLayoutParams();
        int iLIZIZ = (int) C497740JfY.LIZIZ(65.0f);
        layoutParams.height = iLIZIZ;
        layoutParams.width = (int) (iLIZIZ * 4.6f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16fy);
        c16fy.setLayoutParams(layoutParams);
        if (LiveRankingCompetitiveAtmosphereSetting.INSTANCE.getRankingEntrancePositionOpt()) {
            View viewFindViewById2 = view.findViewById(R.id.jgy);
            View viewFindViewById3 = view.findViewById(R.id.sqk);
            View viewFindViewById4 = view.findViewById(R.id.sql);
            View viewFindViewById5 = view.findViewById(R.id.ba7);
            View viewFindViewById6 = view.findViewById(R.id.v97);
            if (viewFindViewById2 != null && viewFindViewById3 != null && viewFindViewById4 != null && viewFindViewById5 != null && viewFindViewById6 != null) {
                C19ME c19me = (C19ME) viewFindViewById2.getLayoutParams();
                C19ME c19me2 = (C19ME) viewFindViewById3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById4.getLayoutParams();
                C19ME c19me3 = (C19ME) viewFindViewById6.getLayoutParams();
                c19me.startToEnd = viewFindViewById4.getId();
                C786410Ut5.W5(viewFindViewById2, c19me);
                c19me2.startToEnd = viewFindViewById5.getId();
                C786410Ut5.W5(viewFindViewById3, c19me2);
                marginLayoutParams.width = -2;
                C786410Ut5.W5(viewFindViewById4, marginLayoutParams);
                c19me3.startToEnd = viewFindViewById2.getId();
                C786410Ut5.W5(viewFindViewById6, c19me3);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLJI = C0J3Y.LIZ.LJI(R.layout.gj2);
        this.LLLZZIL = viewLJI;
        IRecycleLayeredElementManager managerByView = RecycleLayeredElementManger.INSTANCE.getManagerByView(viewLJI);
        if (managerByView instanceof LandscapeLayeredElementManager) {
            this.m = (LandscapeLayeredElementManager) managerByView;
        }
        if (this.LLLZZIL == null) {
            this.LLLZZIL = C786410Ut5.Td(layoutInflater, R.layout.gj2, viewGroup, false);
            if (C0J3Y.LJIILLIIL == null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII((ConstraintLayout) this.LLLZZIL);
                C0J3Y.LJIILLIIL = c19mb;
            }
        }
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, KeyboardStatusChannel.class, new AObjectS360S0100000_17(this, 59));
            dataChannel.BQ2(this, HourlyRankRewardVisibilityChangedChannel.class, new AObjectS360S0100000_17(this, 62));
        }
        View view = this.LLLZZIL;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.bn8);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            View viewFindViewById2 = this.LLLZZIL.findViewById(R.id.dnp);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        }
        View view2 = this.LLLZZIL;
        C437170HCh.LIZ(view2, this);
        C19GS c19gs = null;
        if (!(view2 instanceof View)) {
            view2 = null;
        }
        if (view2 != null) {
            try {
                ViewTreeLifecycleOwner.set(view2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view2, this);
                view2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view2;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view2;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment
    public final boolean ST(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LLZLL) {
            return false;
        }
        DataChannel dataChannel = this.LLJIJIL;
        View view = this.LLLZZIL;
        boolean z = !this.LLZLI;
        if (Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        if (C497740JfY.LJJ()) {
            if (motionEvent.getX() >= view.getWidth() / 2) {
                return false;
            }
        } else if (motionEvent.getX() <= view.getWidth() / 2) {
            return false;
        }
        if (z) {
            view.getContext();
            if (C497740JfY.LJJ()) {
                if (f >= 0.0f) {
                    return false;
                }
            } else if (f <= 0.0f) {
                return false;
            }
            if (dataChannel != null) {
                dataChannel.FQ2(BlockMessageEvent.class);
                dataChannel.FQ2(ResetSilentTimerEvent.class);
            }
            C0IMP.LIZ(dataChannel, false);
        } else {
            view.getContext();
            if (C497740JfY.LJJ()) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            if (dataChannel != null) {
                dataChannel.FQ2(BlockMessageEvent.class);
                dataChannel.FQ2(ResetSilentTimerEvent.class);
            }
            C0IMP.LIZ(dataChannel, false);
        }
        return true;
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        this.LLZZZZ.onNext(Boolean.TRUE);
        RU();
    }
}
