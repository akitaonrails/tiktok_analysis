package com.bytedance.android.livesdk.broadcast.video;

import X.AbstractC1273900jFs;
import X.AbstractC781140Uka;
import X.C001A;
import X.C01GW;
import X.C098200Yq;
import X.C0DTN;
import X.C0GW4;
import X.C0IGR;
import X.C0IK5;
import X.C0J3Y;
import X.C0JFL;
import X.C0RT0;
import X.C0U3Y;
import X.C0U40;
import X.C0U6A;
import X.C0U6C;
import X.C0UF0;
import X.C0UFE;
import X.C0UFI;
import X.C0UFJ;
import X.C0UFT;
import X.C0UK0;
import X.C0UKK;
import X.C0UKN;
import X.C0UKP;
import X.C0UNP;
import X.C0UPW;
import X.C0UTP;
import X.C0UTQ;
import X.C1079510eCL;
import X.C1082080eGU;
import X.C1083340eIW;
import X.C1085570eM7;
import X.C1099820ej6;
import X.C1120000fFe;
import X.C1152720g6Q;
import X.C1161920gLG;
import X.C11NJ;
import X.C1273890jFr;
import X.C12ES;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C202139147l;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C404401hi;
import X.C437170HCh;
import X.C456101q3;
import X.C465520INi;
import X.C485950J3x;
import X.C486790J7d;
import X.C497740JfY;
import X.C5183020f;
import X.C761830TuX;
import X.C766080U3i;
import X.C766720U5u;
import X.C768300UBw;
import X.C768460UCm;
import X.C768620UDc;
import X.C769040UEs;
import X.C769540UGq;
import X.C776230Ucf;
import X.C776250Uch;
import X.C776270Ucj;
import X.C779690UiF;
import X.C779700UiG;
import X.C779730UiJ;
import X.C780520Uja;
import X.C780580Ujg;
import X.C780700Ujs;
import X.C780730Ujv;
import X.C780820Uk4;
import X.C780840Uk6;
import X.C780870Uk9;
import X.C780930UkF;
import X.C780940UkG;
import X.C780990UkL;
import X.C781010UkN;
import X.C781270Ukn;
import X.C782390Umb;
import X.C782430Umf;
import X.C782910UnR;
import X.C784410Upr;
import X.C786410Ut5;
import X.C924810aAp;
import X.C930940aKi;
import X.C931280aLG;
import X.EnumC1102750enp;
import X.EnumC780830Uk5;
import X.InterfaceC1100800ekg;
import X.InterfaceC1100990ekz;
import X.InterfaceC1814530xJr;
import X.InterfaceC390601fU;
import X.InterfaceC456501q7;
import X.InterfaceC754220TiG;
import X.InterfaceC769090UEx;
import X.InterfaceC772190UQv;
import X.InterfaceC773140UUm;
import X.InterfaceC780590Ujh;
import X.InterfaceC943880afa;
import X.InterfaceC948540an6;
import X.ScaleGestureDetectorOnScaleGestureListenerC21656519pD;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS23S0101000_12;
import Y.ARunnableS81S0200000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.broadcast.api.NetworkStatusV3;
import com.bytedance.android.live.broadcast.api.RestartLiveFromSettingEvent;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.copyrightreview.helper.CopyrightViolationHelper;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.effect.api.ActionEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchFailedEvent;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCaptureImageChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.interaction.drawguess.OnlySetDrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.CoHostPermissionCheckEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkRandomLinkMicChangeTipTextEvent;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.room.GlobalMultiLiveSettingChangeEvent;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.broadcast.CountDownFinishEvent;
import com.bytedance.android.livesdk.broadcast.CountDownFinishOpt;
import com.bytedance.android.livesdk.broadcast.LiveCenterCueEvent;
import com.bytedance.android.livesdk.broadcast.RestartLiveEvent;
import com.bytedance.android.livesdk.broadcast.RestartLiveThreshold;
import com.bytedance.android.livesdk.broadcast.StartLiveEvent;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter;
import com.bytedance.android.livesdk.broadcast.interaction.widget.debug.PickResultChannel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.broadcast.video.layer.VideoLayeredElementManager;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatus;
import com.bytedance.android.livesdk.dataChannel.HideInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LopUnlockEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLOP0OptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.RestartLiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveCenterFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostBroadcastInflateOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicBugFixLayoutContainerSizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPerfAutoAdaptiveTTLH;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class VideoBroadcastInteractionFragment extends BaseFragment implements InterfaceC773140UUm, C0IGR, InterfaceC780590Ujh {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZzHELIOSk6LCAjZxk6LCAjCz08KSEvKDwnASs4LD0yKzElJiEVOiQrJCo9PA==";
    public C1083340eIW LL;
    public C16F5 LLILLJJLI;
    public C1099820ej6 LLILLL;
    public C780580Ujg LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public C0DTN LLJI;
    public C0RT0 LLJIJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public InterfaceC754220TiG LLJJI;
    public BaseLinkControlWidget LLJJIII;
    public NetSpeedMonitorWidget LLJJIJI;
    public boolean LLJJIJIIJIL;
    public LiveRecyclableWidget LLJJIJIL;
    public LiveRecyclableWidget LLJJJ;
    public LiveRecyclableWidget LLJJJIL;
    public C0UKK LLJJJJ;
    public C1083340eIW LLJJJJJIL;
    public C780990UkL LLJL;
    public DataChannel LLJLIL;
    public LayeredWidgetManager LLJLILLLLZIIL;
    public Room LLJLL;
    public C781010UkN LLJLLL;
    public AbstractC781140Uka LLJZ;
    public Runnable LLJZIJLIL;
    public C782390Umb LLL;
    public C784410Upr LLLF;
    public VideoLayeredElementManager LLLFFI;
    public C1120000fFe LLLFZ;
    public ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLLI;
    public ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLLII;
    public C0UKN LLLIIII;
    public C780820Uk4 LLLIIIIL;
    public C782430Umf LLLIIIL;
    public C782430Umf LLLIIL;
    public C1085570eM7 LLLIILIL;
    public ARunnableS23S0101000_12 LLLILZ;
    public ViewStub LLLILZJ;
    public C780580Ujg LLLILZLLLI;
    public TextView LLLIZZ;
    public LiveRecyclableWidget LLLJ;
    public C0GW4 LLLJIL;
    public C780930UkF LLLJL;
    public C780520Uja LLLL;
    public boolean LLLLII;
    public final AtomicBoolean LLJILJIL = new AtomicBoolean(false);
    public final C11NJ LLJJJJLIIL = new C11NJ();
    public final C01GW LLJJL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(98));
    public final C01GW LLJJLIIIJLLLLLLLZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 220));
    public final WidgetCreateTimeUtil LLJLLIL = new WidgetCreateTimeUtil(null);
    public final C01GW LLLFF = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(97));
    public boolean LLLIL = true;

    @Override // X.InterfaceC781090UkV
    public final void ZD(int i) {
    }

    @Override // X.InterfaceC781090UkV
    public final BaseFragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC780590Ujh
    public final VideoBroadcastInteractionFragment sO() {
        return this;
    }

    @Override // X.InterfaceC780590Ujh
    public final C780700Ujs GN() {
        return new C780700Ujs(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Type inference failed for: r2v15, types: [X.0Uja] */
    @Override // X.InterfaceC781090UkV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Hu() {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment.Hu():void");
    }

    public final ValueAnimator NR() {
        return (ValueAnimator) this.LLLFF.getValue();
    }

    public final C780580Ujg OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.bwk) : null;
            this.LLILZ = (C780580Ujg) viewFindViewById;
        }
        return (C780580Ujg) viewFindViewById;
    }

    public final C16F5 PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cjx) : null;
            this.LLILLJJLI = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // X.InterfaceC780590Ujh
    public final DataChannel RG() {
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            return null;
        }
        return dataChannel;
    }

    public final FrameLayout RR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kv1) : null;
            this.LLJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout SR() {
        View viewFindViewById;
        if (LinkMicBugFixLayoutContainerSizeSetting.INSTANCE.isEnable()) {
            View view = this.LLIZ;
            if (view == null) {
                View view2 = getView();
                viewFindViewById = view2 != null ? view2.findViewById(R.id.ooo) : null;
                this.LLIZ = (FrameLayout) viewFindViewById;
                view = viewFindViewById;
            }
            return (FrameLayout) view;
        }
        View view3 = this.LLIZ;
        if (view3 == null) {
            View view4 = getView();
            viewFindViewById = view4 != null ? view4.findViewById(R.id.ool) : null;
            this.LLIZ = (FrameLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        return (FrameLayout) view3;
    }

    public final C1099820ej6 UR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sfo) : null;
            this.LLILLL = (C1099820ej6) viewFindViewById;
        }
        return (C1099820ej6) viewFindViewById;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public final void VR() {
        C782910UnR c782910UnR;
        ?? layeredElementContext;
        ConstraintProperty constraintPropertyById;
        LiveRecyclableWidget liveRecyclableWidget = this.LLJJIJIL;
        if (liveRecyclableWidget != null) {
            liveRecyclableWidget.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget2 = this.LLJJJ;
        if (liveRecyclableWidget2 != null) {
            liveRecyclableWidget2.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget3 = this.LLJJJIL;
        if (liveRecyclableWidget3 != null) {
            liveRecyclableWidget3.hide();
        }
        VideoLayeredElementManager videoLayeredElementManager = this.LLLFFI;
        if (videoLayeredElementManager != null && (layeredElementContext = videoLayeredElementManager.getLayeredElementContext()) != 0 && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C1079510eCL.LIZJ)) != null) {
            constraintPropertyById.visibility(0);
        }
        C782390Umb c782390Umb = this.LLL;
        if (c782390Umb != null) {
            c782390Umb.setBlockTouchEvent(false);
        }
        VideoLayeredElementManager videoLayeredElementManager2 = this.LLLFFI;
        if (videoLayeredElementManager2 == null || (c782910UnR = (C782910UnR) videoLayeredElementManager2.getElementById(C1079510eCL.LIZIZ)) == null || !c782910UnR.LLILLL) {
            return;
        }
        ConstraintProperty constraintPropertyById2 = c782910UnR.LL.getConstraintPropertyById(c782910UnR.getId());
        c782910UnR.LLILLL = false;
        if (constraintPropertyById2 != null) {
            ValueAnimator value = c782910UnR.LLILLJJLI.getValue();
            value.cancel();
            value.removeAllUpdateListeners();
            value.setFloatValues(constraintPropertyById2.alpha(), 1.0f);
            value.addUpdateListener(new AUListenerS262S0100000_12(constraintPropertyById2, 55));
            value.start();
        }
    }

    public final void WR() {
        C780870Uk9 c780870Uk9;
        C780990UkL c780990UkL = this.LLJL;
        if (c780990UkL != null) {
            c780990UkL.LLILZIL.FQ2(HideInteractionEvent.class);
            BroadcastMessagePresenter broadcastMessagePresenter = c780990UkL.LLJILLL;
            if (broadcastMessagePresenter == null || (c780870Uk9 = broadcastMessagePresenter.LLILLJJLI) == null) {
                return;
            }
            c780870Uk9.LJFF.dispose();
            C202139147l c202139147l = c780870Uk9.LIZLLL;
            if (c202139147l != null) {
                c202139147l.LIZ();
            }
        }
    }

    @Override // X.InterfaceC781090UkV
    public final void Xp() {
        C781010UkN c781010UkN = this.LLJLLL;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        c781010UkN.LIZIZ();
    }

    public final void ZR() {
        if (LiveCohostBroadcastInflateOptSetting.INSTANCE.isEnable()) {
            C780580Ujg c780580Ujg = this.LLLILZLLLI;
            if (c780580Ujg != null) {
                HandlerHook.viewPost(c780580Ujg, new ARunnableS81S0200000_12(c780580Ujg, this, 37));
                return;
            }
            return;
        }
        C780580Ujg c780580UjgOR = OR();
        if (c780580UjgOR != null) {
            HandlerHook.viewPost(c780580UjgOR, new ARunnableS112S0100000_12(this, 108));
        }
    }

    public final void bS() {
        if (this.LLJJIII != null) {
            return;
        }
        final InterfaceC948540an6 interfaceC948540an6E32 = C781270Ukn.LJIILJJIL().e32();
        if (interfaceC948540an6E32 != null) {
            interfaceC948540an6E32.LJIILJJIL(this.LLJJI);
        }
        LinkControlWidget linkControlWidgetLJ = interfaceC948540an6E32 != null ? interfaceC948540an6E32.LJ(new InterfaceC943880afa() { // from class: X.0an5
            @Override // X.InterfaceC943880afa
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC943880afa
            public final void LIZ(LiveWidget liveWidget) {
                LayeredWidgetManager layeredWidgetManager = this.LIZ.LLJLILLLLZIIL;
                if (layeredWidgetManager == null) {
                    layeredWidgetManager = null;
                }
                layeredWidgetManager.unload(liveWidget);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
            @Override // X.InterfaceC943880afa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC944150ag1 LIZJ(int r12, boolean r13, X.C952540atY r14) {
                /*
                    Method dump skipped, instruction units count: 570
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C948530an5.LIZJ(int, boolean, X.0atY):X.0ag1");
            }
        }) : null;
        this.LLJJIII = linkControlWidgetLJ;
        LayeredWidgetManager layeredWidgetManager = this.LLJLILLLLZIIL;
        (layeredWidgetManager != null ? layeredWidgetManager : null).load(R.id.kv7, linkControlWidgetLJ);
        C20441214yg.LJIIIZ("multi_init", "AnchorSide LinkControlWidgetWidget loaded");
    }

    public final void cS() {
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.BQ2(this, LiveGameEffectFetchedChannel.class, AFwS245S0000000_12.get$arr$(48));
        dataChannel.BQ2(this, LiveGameEffectFetchFailedEvent.class, AFwS245S0000000_12.get$arr$(49));
        dataChannel.BQ2(this, DrawGuessStartGameEvent.class, new AwS591S0100000_12(this, 503));
        dataChannel.BQ2(this, OnlySetDrawGuessStartGameEvent.class, new AwS591S0100000_12(this, 505));
        dataChannel.BQ2(this, DrawGuessExitGameEvent.class, new AwS591S0100000_12(this, 506));
        dataChannel.BQ2(this, DrawGuessIsCountingDownRoundStart.class, new AwS591S0100000_12(this, 507));
        dataChannel.BQ2(this, DrawGuessFreelyStartChannel.class, new AwS591S0100000_12(this, 508));
        C0U40 liveEffectDataProvider = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        DataChannel dataChannel2 = this.LLJLIL;
        DataChannel dataChannel3 = dataChannel2 != null ? dataChannel2 : null;
        liveEffectDataProvider.getClass();
        C766720U5u.LJIIIIZZ("livegame", new C0U3Y(), new C766080U3i(), new C0U6A(dataChannel3));
        C781270Ukn.LJIL().Nf1();
        C0JFL.LIZIZ = new AwS556S0100000_12(this, 223);
    }

    public final void dS() {
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.FQ2(CountDownFinishEvent.class);
        if (this.LLJILJIL.get()) {
            this.LLJILJILJ = true;
        } else {
            DataChannel dataChannel2 = this.LLJLIL;
            (dataChannel2 != null ? dataChannel2 : null).FQ2(StartLiveEvent.class);
        }
    }

    @Override // X.InterfaceC780590Ujh
    public final LayeredWidgetManager gH() {
        LayeredWidgetManager layeredWidgetManager = this.LLJLILLLLZIIL;
        if (layeredWidgetManager == null) {
            return null;
        }
        return layeredWidgetManager;
    }

    @Override // X.InterfaceC781090UkV
    public final void gf() {
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 374);
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C0IK5.LIZIZ(dataChannel, aRunnableS112S0100000_12);
    }

    public final void hS() {
        RoomAuthStatus roomAuthStatus;
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.EQ2(this, StartPushStreamChannel.class, new AwS591S0100000_12(this, 498));
        dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS591S0100000_12(this, 499));
        dataChannel.CQ2(LinkRandomLinkMicChangeTipTextEvent.class, this, new AwS591S0100000_12(this, 500));
        dataChannel.BQ2(this, DrawGuessCaptureImageChannel.class, new AwS591S0100000_12(this, 501));
        dataChannel.EQ2(this, StickerSelectedEvent.class, new AwS591S0100000_12(this, 502));
        dataChannel.EQ2(this, StickerCancelChannel.class, new AwS591S0100000_12(this, 504));
        dataChannel.BQ2(this, LiveGoalEffectChannel.class, AFwS245S0000000_12.get$arr$(50));
        dataChannel.BQ2(this, MoveLiveGoalEffectEvent.class, AFwS245S0000000_12.get$arr$(51));
        dataChannel.BQ2(this, LiveCenterAlpha.class, new AwS591S0100000_12(this, 492));
        dataChannel.BQ2(this, LiveCenterStatusChannel.class, new AwS591S0100000_12(this, 493));
        dataChannel.BQ2(this, LiveExtendedScreenStatus.class, new AwS591S0100000_12(this, 494));
        dataChannel.BQ2(this, LiveCenterCueEvent.class, new AwS591S0100000_12(this, 495));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, LopUnlockEvent.class, new AwS591S0100000_12(this, 496));
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        AnchorLevelPermission anchorLevelPermission = (room == null || (roomAuthStatus = room.mRoomAuthStatus) == null) ? null : roomAuthStatus.anchorLevelPermission;
        Room room2 = this.LLJLL;
        if (room2 == null) {
            room2 = null;
        }
        if (!room2.getRoomStickerList().isEmpty()) {
            Room room3 = this.LLJLL;
            if (room3 == null) {
                room3 = null;
            }
            if (room3.cppVersion != 1 || (anchorLevelPermission != null && anchorLevelPermission.sticker == C0UFE.ON.getValue())) {
                DataChannel dataChannel2 = this.LLJLIL;
                if (dataChannel2 == null) {
                    dataChannel2 = null;
                }
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
                C766720U5u.LJIIL(dataChannel2);
                DataChannel dataChannel3 = this.LLJLIL;
                if (dataChannel3 == null) {
                    dataChannel3 = null;
                }
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
                C766720U5u.LJIIJJI(dataChannel3);
            }
        }
        if (!LiveLOP0OptSetting.INSTANCE.enable()) {
            cS();
        } else if (anchorLevelPermission != null && anchorLevelPermission.pictionary == C0UFE.ON.getValue()) {
            cS();
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        dataChannelGlobal2.BQ2(this, this, OpenLiveGoalPanelChannel.class, new AwS591S0100000_12(this, 497));
        C0UTQ c0utq = (C0UTQ) dataChannelGlobal2.gg0(C931280aLG.class);
        if (c0utq != null) {
            c0utq.LJIJJLI = System.currentTimeMillis();
            C0UTP c0utp = C0UTP.LIZ;
            DataChannel dataChannel4 = this.LLJLIL;
            if (dataChannel4 == null) {
                dataChannel4 = null;
            }
            c0utp.getClass();
            C0UTP.LIZJ(dataChannel4, true);
        }
        RestartLiveSetting restartLiveSetting = RestartLiveSetting.INSTANCE;
        if (restartLiveSetting.getConfig().getEnable()) {
            DataChannel dataChannel5 = this.LLJLIL;
            if (dataChannel5 == null) {
                dataChannel5 = null;
            }
            C780930UkF c780930UkF = new C780930UkF(dataChannel5);
            if (restartLiveSetting.getConfig().getEnableCapsule()) {
                if (c780930UkF.LIZIZ == null) {
                    c780930UkF.LIZIZ = new C780940UkG(dataChannel5);
                }
                C780940UkG c780940UkG = c780930UkF.LIZIZ;
                if (c780940UkG != null) {
                    C786410Ut5.LJLIIL(restartLiveSetting.getConfig().getStartDetectTime(), new BPEAHandler(Looper.getMainLooper()), new ARunnableS112S0100000_12(c780940UkG, 454));
                }
            }
            if (dataChannel5 != null) {
                dataChannel5.BQ2(null, RestartLiveFromSettingEvent.class, new AwS591S0100000_12(c780930UkF, 1149));
                dataChannel5.BQ2(null, RestartLiveThreshold.class, new C5183020f(c780930UkF, 324));
                dataChannel5.BQ2(null, RestartLiveEvent.class, new AwS591S0100000_12(c780930UkF, 1150));
            }
            this.LLLJL = c780930UkF;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public final void kS() {
        C782910UnR c782910UnR;
        ?? layeredElementContext;
        ConstraintProperty constraintPropertyById;
        ?? layeredElementContext2;
        ConstraintProperty constraintPropertyById2;
        VideoLayeredElementManager videoLayeredElementManager = this.LLLFFI;
        if (videoLayeredElementManager == null || (layeredElementContext2 = videoLayeredElementManager.getLayeredElementContext()) == 0 || (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(C1079510eCL.LIZJ)) == null || constraintPropertyById2.visibility() != 8) {
            LiveRecyclableWidget liveRecyclableWidget = this.LLJJIJIL;
            if (liveRecyclableWidget != null) {
                liveRecyclableWidget.show();
            }
            LiveRecyclableWidget liveRecyclableWidget2 = this.LLJJJ;
            if (liveRecyclableWidget2 != null) {
                liveRecyclableWidget2.show();
            }
            VideoLayeredElementManager videoLayeredElementManager2 = this.LLLFFI;
            if (videoLayeredElementManager2 != null && (layeredElementContext = videoLayeredElementManager2.getLayeredElementContext()) != 0 && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C1079510eCL.LIZJ)) != null) {
                constraintPropertyById.visibility(8);
            }
            C782390Umb c782390Umb = this.LLL;
            if (c782390Umb != null) {
                c782390Umb.setBlockTouchEvent(true);
            }
            VideoLayeredElementManager videoLayeredElementManager3 = this.LLLFFI;
            if (videoLayeredElementManager3 == null || (c782910UnR = (C782910UnR) videoLayeredElementManager3.getElementById(C1079510eCL.LIZIZ)) == null || c782910UnR.LLILLL) {
                return;
            }
            ConstraintProperty constraintPropertyById3 = c782910UnR.LL.getConstraintPropertyById(c782910UnR.getId());
            c782910UnR.LLILLL = true;
            if (constraintPropertyById3 != null) {
                ValueAnimator value = c782910UnR.LLILLJJLI.getValue();
                value.cancel();
                value.removeAllUpdateListeners();
                value.setFloatValues(constraintPropertyById3.alpha(), 0.5f);
                value.addUpdateListener(new AUListenerS262S0100000_12(constraintPropertyById3, 54));
                value.start();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public final void mS() {
        ?? layeredElementContext;
        ConstraintProperty constraintPropertyById;
        ?? layeredElementContext2;
        if (!LiveCohostBroadcastInflateOptSetting.INSTANCE.isEnable()) {
            C780580Ujg c780580UjgOR = OR();
            if (c780580UjgOR != null) {
                HandlerHook.viewPost(c780580UjgOR, new ARunnableS112S0100000_12(this, 109));
                return;
            }
            return;
        }
        if (this.mStatusDestroyed) {
            return;
        }
        if (this.LLLILZLLLI == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showLinkCrossGuestBg constraint property = ");
            VideoLayeredElementManager videoLayeredElementManager = this.LLLFFI;
            sbLIZ.append((videoLayeredElementManager == null || (layeredElementContext2 = videoLayeredElementManager.getLayeredElementContext()) == 0) ? null : layeredElementContext2.getConstraintPropertyById(R.id.sma));
            C20441214yg.LIZIZ("VideoBroadcastInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
            VideoLayeredElementManager videoLayeredElementManager2 = this.LLLFFI;
            if (videoLayeredElementManager2 != null && (layeredElementContext = videoLayeredElementManager2.getLayeredElementContext()) != 0 && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.sma)) != null) {
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                Rect rectYx0 = iInteractService != null ? iInteractService.Yx0() : null;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("showLinkCrossGuestBg width = ");
                sbLIZ2.append(rectYx0 != null ? Integer.valueOf(rectYx0.width()) : null);
                sbLIZ2.append(" top = ");
                sbLIZ2.append(rectYx0 != null ? Integer.valueOf(rectYx0.top) : null);
                C20441214yg.LIZIZ("VideoBroadcastInteractionFragment", C2188811AlT.LIZIZ(sbLIZ2));
                constraintPropertyById.constrainWidth(rectYx0 != null ? rectYx0.width() : 0);
                constraintPropertyById.constrainHeight(rectYx0 != null ? rectYx0.height() : 0);
                constraintPropertyById.margin(1, rectYx0 != null ? rectYx0.width() : 0);
                constraintPropertyById.margin(3, rectYx0 != null ? rectYx0.top : 0);
                constraintPropertyById.apply();
            }
            View view = getView();
            ViewStub viewStub = view != null ? (ViewStub) view.findViewById(R.id.sma) : null;
            this.LLLILZJ = viewStub;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.hsg);
            }
            ViewStub viewStub2 = this.LLLILZJ;
            C780580Ujg c780580Ujg = (C780580Ujg) (viewStub2 != null ? C786410Ut5.LJLLLL(viewStub2) : null);
            this.LLLILZLLLI = c780580Ujg;
            C20441214yg.LIZIZ("LinkCrossGuestBgView", "lazyInflateView");
            C786410Ut5.Td(C786410Ut5.ne(c780580Ujg.getContext()), R.layout.hse, c780580Ujg, true);
            C16F5 tvTipTextFromXml = c780580Ujg.getTvTipTextFromXml();
            if (tvTipTextFromXml != null) {
                tvTipTextFromXml.LJJJI(R.style.a9c);
            }
            LinearLayout cancelActionFromXml = c780580Ujg.getCancelActionFromXml();
            if (cancelActionFromXml != null) {
                C786410Ut5.R7(cancelActionFromXml, new View.OnClickListener() { // from class: X.0Ujt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C781270Ukn.LJIILJJIL().ej2();
                    }
                });
            }
            DataChannel dataChannel = this.LLJLIL;
            c780580Ujg.setDataChannel(dataChannel != null ? dataChannel : null);
            c780580Ujg.setTipText(C497740JfY.LJIJI(2131840768));
        }
        C780580Ujg c780580Ujg2 = this.LLLILZLLLI;
        if (c780580Ujg2 != null) {
            int visibility = c780580Ujg2.getVisibility();
            c780580Ujg2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c780580Ujg2);
        }
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        C780990UkL c780990UkL = this.LLJL;
        if (c780990UkL == null) {
            return true;
        }
        c780990UkL.onBackPressed();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0UTQ c0utq = (C0UTQ) dataChannelGlobal.gg0(C931280aLG.class);
        if (c0utq != null) {
            c0utq.LJJIIJZLJL = System.currentTimeMillis();
        }
        super.onResume();
        if (this.LLJILJILJ) {
            DataChannel dataChannel = this.LLJLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.FQ2(StartLiveEvent.class);
            this.LLJILJILJ = false;
        }
        DataChannel dataChannel2 = this.LLJLIL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.FQ2(CoHostPermissionCheckEvent.class);
        this.LLJILJIL.set(false);
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0U6C liveGoalEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            DataChannel dataChannel3 = this.LLJLIL;
            if (dataChannel3 == null) {
                dataChannel3 = null;
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LIZJ = dataChannel3;
            if (C0UFI.LIZLLL() && C0UFI.LIZIZ()) {
                if (!C0UFI.LJIIIIZZ()) {
                    List<? extends LiveEffect> list = C0UFI.LIZIZ;
                    C0UFI.LIZ(list != null ? (LiveEffect) ListProtector.get(list, InterfaceC772190UQv.X3.LIZIZ().intValue()) : null);
                }
                C0UFI.LJIIZILJ(false);
            }
        }
        if (this.LLLIL) {
            this.LLLIL = false;
            C0UTQ c0utq2 = (C0UTQ) dataChannelGlobal.gg0(C931280aLG.class);
            if (c0utq2 != null) {
                c0utq2.LJIJJ = System.currentTimeMillis();
            }
        }
    }

    @Override // X.InterfaceC780590Ujh
    public final Room p4() {
        Room room = this.LLJLL;
        if (room == null) {
            return null;
        }
        return room;
    }

    @Override // X.InterfaceC773140UUm
    public final C0DTN wh() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w4w) : null;
            this.LLJI = (C0DTN) viewFindViewById;
        }
        return (C0DTN) viewFindViewById;
    }

    @Override // X.InterfaceC781090UkV
    public final void SF() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.EFFECT;
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        enumC1102750enp.load(dataChannel, new C0UF0(context, this));
        C19EG activity = getActivity();
        if (activity != null) {
            Room room = this.LLJLL;
            if (room == null) {
                room = null;
            }
            User owner = room.getOwner();
            if (owner == null || owner.getSecret() != 1) {
                EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.SHARE;
                DataChannel dataChannel2 = this.LLJLIL;
                if (dataChannel2 == null) {
                    dataChannel2 = null;
                }
                IShareService iShareServiceLJJI = C781270Ukn.LJJI();
                LiveMode liveMode = LiveMode.VIDEO;
                enumC1102750enp2.load(dataChannel2, iShareServiceLJJI.K72(activity, context, liveMode, this));
                EnumC1102750enp enumC1102750enp3 = EnumC1102750enp.SHARE_IN_MORE;
                DataChannel dataChannel3 = this.LLJLIL;
                if (dataChannel3 == null) {
                    dataChannel3 = null;
                }
                enumC1102750enp3.load(dataChannel3, C781270Ukn.LJJI().K72(activity, context, liveMode, this));
            } else {
                EnumC1102750enp enumC1102750enp4 = EnumC1102750enp.SHARE;
                DataChannel dataChannel4 = this.LLJLIL;
                if (dataChannel4 == null) {
                    dataChannel4 = null;
                }
                enumC1102750enp4.load(dataChannel4, C781270Ukn.LJJI().Xg0());
                EnumC1102750enp enumC1102750enp5 = EnumC1102750enp.SHARE_IN_MORE;
                DataChannel dataChannel5 = this.LLJLIL;
                if (dataChannel5 == null) {
                    dataChannel5 = null;
                }
                enumC1102750enp5.load(dataChannel5, C781270Ukn.LJJI().Xg0());
            }
        }
        EnumC1102750enp enumC1102750enp6 = EnumC1102750enp.PAUSE_LIVE;
        DataChannel dataChannel6 = this.LLJLIL;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        enumC1102750enp6.load(dataChannel6, new C779700UiG());
        EnumC1102750enp enumC1102750enp7 = EnumC1102750enp.CAMPAIGN_CENTER;
        DataChannel dataChannel7 = this.LLJLIL;
        enumC1102750enp7.load(dataChannel7 != null ? dataChannel7 : null, new C0UNP(this));
    }

    public final void nS() {
        IInteractService iInteractService;
        Bundle arguments = getArguments();
        boolean z = false;
        if (Intrinsics.LJFF(arguments != null ? Boolean.valueOf(arguments.getBoolean("is_one_tap_go_live", false)) : null, Boolean.TRUE) || ((iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) != null && iInteractService.ae())) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
            if (multiLiveAnchorPanelSettings != null) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                IInteractService iInteractService2 = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                if (iInteractService2 != null && iInteractService2.ae()) {
                    z = true;
                }
                dataChannelGlobal.FQ2(GlobalMultiLiveSettingChangeEvent.class, new Pair(multiLiveAnchorPanelSettings, Boolean.valueOf(z)));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try to switch layout with ");
            sbLIZ.append(C924810aAp.LJ().LJJIII);
            C20441214yg.LJIIIZ("MultiLiveAuto", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C404401hi c404401hiBs0;
        AbstractC1273900jFs abstractC1273900jFs;
        IMessageManager iMessageManager;
        super.onDestroy();
        LiveHostAutoAdaptiveParams.INSTANCE.setLiveHost(false);
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(this.LLLL);
        this.LLLL = null;
        C465520INi.LIZ.FM0();
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        C769040UEs.LJ();
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalLogHelper();
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C0UFJ.LIZLLL(dataChannel, true);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
        C768300UBw.LJIILJJIL(C0UFI.LJIIIIZZ, true);
        C0UFI.LJIIJ(true);
        C1120000fFe c1120000fFe = this.LLLFZ;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLLI);
        }
        C1120000fFe c1120000fFe2 = this.LLLFZ;
        if (c1120000fFe2 != null) {
            c1120000fFe2.LIZJ(this.LLLII);
        }
        C1120000fFe c1120000fFe3 = this.LLLFZ;
        if (c1120000fFe3 != null) {
            c1120000fFe3.LIZJ(this.LLLIIII);
        }
        C1120000fFe c1120000fFe4 = this.LLLFZ;
        if (c1120000fFe4 != null) {
            c1120000fFe4.LIZJ(this.LLLIIIIL);
        }
        C1120000fFe c1120000fFe5 = this.LLLFZ;
        if (c1120000fFe5 != null) {
            c1120000fFe5.LIZJ(this.LLLIIIL);
        }
        C1120000fFe c1120000fFe6 = this.LLLFZ;
        if (c1120000fFe6 != null) {
            c1120000fFe6.LIZJ(this.LLLIIL);
        }
        InterfaceC769090UEx insertStickerManager = C781270Ukn.LJI().getInsertStickerManager();
        if (insertStickerManager != null) {
            insertStickerManager.release();
        }
        DataChannel dataChannel2 = this.LLJLIL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.zQ2(this);
        C780990UkL c780990UkL = this.LLJL;
        if (c780990UkL != null) {
            c780990UkL.onDestroy();
        }
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            LiveAudioDevicesDetector.LIZ.LIZ();
        } else {
            try {
                Context context = getContext();
                if (context != null) {
                    C786410Ut5.LJJIFFI(context, (C779730UiJ) this.LLJJL.getValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregisterHeadsetReceiver ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("VideoBroadcastInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
            }
            BluetoothAdapter.getDefaultAdapter().closeProfileProxy(2, C779690UiF.LIZ);
        }
        C768460UCm.LJIIIIZZ();
        C761830TuX.LJ();
        C768620UDc c768620UDc = C768620UDc.LIZ;
        c768620UDc.LJII(false, false, false);
        C768620UDc.LIZLLL = false;
        c768620UDc.LJIILIIL(null);
        LayeredWidgetManager layeredWidgetManager = this.LLJLILLLLZIIL;
        if (layeredWidgetManager == null) {
            layeredWidgetManager = null;
        }
        C1082080eGU.LIZIZ(layeredWidgetManager);
        C1082080eGU.LJFF(2);
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C0UFI.LIZJ = null;
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C776230Ucf c776230Ucf = C776230Ucf.LL;
        C776230Ucf.LLILLJJLI = null;
        WeakReference<IMessageManager> weakReference = C776230Ucf.LLILLL;
        if (weakReference != null && (iMessageManager = weakReference.get()) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) c776230Ucf);
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        Room room = this.LLJLL;
        if (room == null) {
            room = null;
        }
        iInteractService.et0(room);
        C1273890jFr c1273890jFrLJIIJJI = C776270Ucj.LIZ.LJIIJJI(false, null, false);
        boolean zLJLJJI = (c1273890jFrLJIIJJI == null || (abstractC1273900jFs = c1273890jFrLJIIJJI.LJI) == null) ? false : abstractC1273900jFs.LJLJJI();
        if ((LiveBroadcastPerfAutoAdaptiveTTLH.getEnable() || LiveHostPerfAutoAdaptiveSetting.enable() || zLJLJJI) && (c404401hiBs0 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Bs0()) != null) {
            c404401hiBs0.LJFF();
        }
        LiveHostPerfAutoAdaptiveSetting.setLiveHost(false);
        BaseLinkControlWidget baseLinkControlWidget = this.LLJJIII;
        if (baseLinkControlWidget != null) {
            LayeredWidgetManager layeredWidgetManager2 = this.LLJLILLLLZIIL;
            if (layeredWidgetManager2 == null) {
                layeredWidgetManager2 = null;
            }
            layeredWidgetManager2.unload(baseLinkControlWidget);
            this.LLJJIII = null;
        }
        ARunnableS23S0101000_12 aRunnableS23S0101000_12 = this.LLLILZ;
        if (aRunnableS23S0101000_12 != null) {
            C0IK5.LIZ().removeCallbacks(aRunnableS23S0101000_12);
        }
        this.LLLILZ = null;
        InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
        if (boardsDisplayStateManager != null) {
            boardsDisplayStateManager.LJIILIIL();
        }
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.release();
        }
        InterfaceC456501q7 liveBoardsEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveBoardsEffectHelper();
        if (liveBoardsEffectHelper != null) {
            ((C456101q3) liveBoardsEffectHelper).LIZIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC1100990ekz interfaceC1100990ekzMessage;
        Pair<Float, Float> pairLJII;
        super.onDestroyView();
        C0UKK c0ukk = this.LLJJJJ;
        if (c0ukk != null) {
            C769540UGq.LIZ = 500;
            C769540UGq.LIZIZ = false;
            C769540UGq.LIZJ = false;
            C0UK0.LIZ = false;
            C0UK0.LIZIZ = false;
            C0UK0.LIZJ = false;
            c0ukk.LLJJ = null;
        }
        this.LLJZIJLIL = null;
        C781010UkN c781010UkN = this.LLJLLL;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        DialogInterface dialogInterface = c781010UkN.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.LLJLLIL.send();
        C780990UkL c780990UkL = this.LLJL;
        if (c780990UkL != null) {
            c780990UkL.onDestroyView();
        }
        this.LLJJJJLIIL.LJ();
        C781270Ukn.LJIL().Nf1();
        C0JFL.LIZJ();
        C781270Ukn.LJIL().a41();
        C1085570eM7 c1085570eM7 = this.LLLIILIL;
        if (c1085570eM7 != null) {
            getView();
            c1085570eM7.LIZIZ();
        }
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        InterfaceC1100800ekg interfaceC1100800ekgMc1 = iRoomFunctionService.mc1(dataChannel);
        if (interfaceC1100800ekgMc1 != null && (interfaceC1100990ekzMessage = interfaceC1100800ekgMc1.message()) != null && (pairLJII = interfaceC1100990ekzMessage.LJII()) != null) {
            C465520INi.LIZ.c02(pairLJII);
        }
        IRoomFunctionService iRoomFunctionService2 = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        DataChannel dataChannel2 = this.LLJLIL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        InterfaceC1100800ekg interfaceC1100800ekgMc12 = iRoomFunctionService2.mc1(dataChannel2);
        if (interfaceC1100800ekgMc12 != null) {
            interfaceC1100800ekgMc12.destroy();
        }
        if (LiveAnchorStrategyParamsSwitchSetting.getValue().f35switch) {
            IEPIStrategyService iEPIStrategyService = (IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class);
            DataChannel dataChannel3 = this.LLJLIL;
            if (dataChannel3 == null) {
                dataChannel3 = null;
            }
            iEPIStrategyService.Du0(dataChannel3);
            IEPIStrategyService iEPIStrategyService2 = (IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class);
            DataChannel dataChannel4 = this.LLJLIL;
            if (dataChannel4 == null) {
                dataChannel4 = null;
            }
            iEPIStrategyService2.xl(dataChannel4);
        }
        C780930UkF c780930UkF = this.LLLJL;
        if (c780930UkF != null) {
            c780930UkF.LIZ();
        }
        C0UPW.LJ();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJILJIL.set(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.LC0(ZoomCameraScaleEvent.class, Float.valueOf(0.0f));
    }

    @Override // X.InterfaceC781090UkV
    public final /* bridge */ /* synthetic */ C784410Upr LLLLJI() {
        return this.LLLF;
    }

    @Override // X.InterfaceC780590Ujh
    public final View Uh() {
        return this.LLLIZZ;
    }

    @Override // X.InterfaceC781090UkV
    public final void EP(RemindMessage remindMessage) {
        int i = remindMessage.noticeType;
        if (i == 7 || i == 6) {
            CopyrightViolationHelper copyrightViolationHelper = (CopyrightViolationHelper) this.LLJJLIIIJLLLLLLLZ.getValue();
            Context context = getContext();
            Room room = this.LLJLL;
            if (room == null) {
                room = null;
            }
            copyrightViolationHelper.LIZ(context, remindMessage, room, this.LLJJJJLIIL);
        }
    }

    @Override // X.InterfaceC780590Ujh
    public final Function0<Unit> Gp(EnumC780830Uk5 enumC780830Uk5) {
        int i;
        if (enumC780830Uk5 == null) {
            i = -1;
        } else {
            i = C780840Uk6.LIZ[enumC780830Uk5.ordinal()];
        }
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return new AwS556S0100000_12(this, 222);
        }
        return new AwS556S0100000_12(this, 221);
    }

    @Override // X.InterfaceC781090UkV
    public final void LLLLIILL(int i) {
        if (C1152720g6Q.LIZ()) {
            DataChannel dataChannel = this.LLJLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(NetworkStatusV3.class, Integer.valueOf(i));
        }
    }

    public final void gS(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LLJZIJLIL = null;
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS106S0100000_6(runnable, 27));
                return;
            }
            return;
        }
        this.LLJZIJLIL = runnable;
    }

    public final void oS(float f) {
        if (f <= 0.01f && C781270Ukn.LJIILJJIL().Kz() && MultiGuestLiveCenterFixSetting.INSTANCE.isEnable()) {
            f = 0.01f;
        }
        View view = getView();
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View viewFindViewById;
        super.onActivityCreated(bundle);
        BroadcastTimeLog.LIZ("timer_start", String.valueOf(System.currentTimeMillis()));
        C780990UkL c780990UkL = this.LLJL;
        if (c780990UkL != null) {
            c780990UkL.LIZIZ(bundle);
        }
        Room room = this.LLJLL;
        if (room == null) {
            room = null;
        }
        if (!room.isStar()) {
            C1083340eIW c1083340eIW = this.LLJJJJJIL;
            if (c1083340eIW != null) {
                viewFindViewById = c1083340eIW.findViewById(R.id.b2t);
            } else {
                viewFindViewById = null;
            }
            C12ES.LJIILL(0, viewFindViewById);
        }
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(this, 110), null, 2000L);
        } else {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(this, 111), null, 2000L);
        }
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.EQ2(null, CountDownFinishOpt.class, new AwS591S0100000_12(this, 509));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null) {
            c0utq.LJJIIJ = System.currentTimeMillis();
        }
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC781090UkV
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0UFT.LIZ();
        int action = motionEvent.getAction() & 255;
        if (action != 1) {
            if (action == 2 && C0UFT.LJFF) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C0UFI.LJIIIIZZ()) {
                    DataChannel dataChannel = this.LLJLIL;
                    if (dataChannel == null) {
                        dataChannel = null;
                    }
                    dataChannel.LC0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else if (C0UFT.LJFF) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            if (C0UFI.LJIIIIZZ()) {
                DataChannel dataChannel2 = this.LLJLIL;
                if (dataChannel2 == null) {
                    dataChannel2 = null;
                }
                dataChannel2.LC0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
            }
        }
        C1120000fFe c1120000fFe = this.LLLFZ;
        if (c1120000fFe == null) {
            return false;
        }
        return c1120000fFe.LIZ(motionEvent, new C0UKP(C0UFT.LIZIZ, C0UFT.LIZJ, C0UFT.LJII, C0UFT.LJI), null);
    }

    public final void pq(int i) {
        DataChannel dataChannel = this.LLJLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(NetworkStatus.class, Integer.valueOf(i));
    }

    @Override // X.InterfaceC780590Ujh
    public final View vo(String str) {
        View view;
        View viewFindViewById = null;
        if (Intrinsics.LJFF(str, "pause_live_bg")) {
            view = this.LLILZIL;
            if (view == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.q3y);
                }
                this.LLILZIL = viewFindViewById;
                return viewFindViewById;
            }
            return view;
        }
        if (Intrinsics.LJFF(str, "captcha_live_bg")) {
            view = this.LLILZLL;
            if (view == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.dc4);
                }
                this.LLILZLL = viewFindViewById;
                return viewFindViewById;
            }
            return view;
        }
        return viewFindViewById;
    }

    public static boolean aS(MotionEvent motionEvent, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX < i || rawX > i + width || rawY < i2 || rawY > i2 + height) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC781090UkV
    public final void I1(int i, int i2) {
        if (C1152720g6Q.LIZ()) {
            DataChannel dataChannel = this.LLJLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.LC0(BroadcastAudioStatus.class, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public final void iS(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLJLIL = dataChannel;
        this.LLJZ = abstractC781140Uka;
        this.LLJLL = (Room) dataChannel.gg0(RoomChannel.class);
        DataChannel dataChannel2 = this.LLJLIL;
        Room room = null;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.zW(LiveModeChannel.class, LiveMode.VIDEO);
        C776230Ucf c776230Ucf = C776230Ucf.LL;
        C776230Ucf.LLILLJJLI = new WeakReference<>(dataChannel);
        WeakReference<IMessageManager> weakReference = new WeakReference<>(dataChannel.gg0(C776250Uch.class));
        C776230Ucf.LLILLL = weakReference;
        IMessageManager iMessageManager = weakReference.get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ACCESS_RECALL_MESSAGE.getIntType(), (OnIMMessageListener) c776230Ucf);
        }
        InterfaceC769090UEx insertStickerManager = C781270Ukn.LJI().getInsertStickerManager();
        if (insertStickerManager != null) {
            insertStickerManager.QI2();
        }
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(99);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        Room room2 = this.LLJLL;
        if (room2 != null) {
            room = room2;
        }
        iInteractService.OT1(room, aFwS199S0000000_12);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c3  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        if (i == 40003 && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            DataChannel dataChannel = this.LLJLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(PickResultChannel.class, new C780730Ujv(i2, intent));
            return;
        }
        C780990UkL c780990UkL = this.LLJL;
        if (c780990UkL == null) {
            return;
        }
        c780990UkL.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLJFF;
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C01GW c01gw = C485950J3x.LIZ;
            viewLJFF = C485950J3x.LIZIZ(layoutInflater.getContext(), R.layout.ggn, viewGroup, false);
        } else {
            viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.ggn, viewGroup, false, null, false, 60);
        }
        DataChannel dataChannel = this.LLJLIL;
        C19GS c19gs = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C1085570eM7 c1085570eM7 = new C1085570eM7(dataChannel);
        this.LLLIILIL = c1085570eM7;
        c1085570eM7.LIZ(viewLJFF, getViewLifecycleOwner());
        C437170HCh.LIZ(viewLJFF, this);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }
}
