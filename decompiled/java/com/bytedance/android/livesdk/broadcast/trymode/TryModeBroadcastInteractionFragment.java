package com.bytedance.android.livesdk.broadcast.trymode;

import X.AbstractC781140Uka;
import X.C011V;
import X.C01GW;
import X.C098200Yq;
import X.C0DTN;
import X.C0IGR;
import X.C0IJT;
import X.C0IK5;
import X.C0IUA;
import X.C0J3Y;
import X.C0RT0;
import X.C0TVI;
import X.C0TZM;
import X.C0U3Y;
import X.C0U40;
import X.C0U4T;
import X.C0U6A;
import X.C0U6C;
import X.C0UF0;
import X.C0UF4;
import X.C0UFI;
import X.C0UFJ;
import X.C0UFT;
import X.C0UID;
import X.C0UKK;
import X.C0UKN;
import X.C0UKO;
import X.C0UKP;
import X.C0UVH;
import X.C0UX8;
import X.C0UXF;
import X.C1078030e9x;
import X.C1079520eCM;
import X.C1082080eGU;
import X.C1083340eIW;
import X.C1085570eM7;
import X.C1099820ej6;
import X.C1108110ewT;
import X.C1113800f5e;
import X.C1119760fFG;
import X.C1120000fFe;
import X.C1148240fzC;
import X.C1152720g6Q;
import X.C1161920gLG;
import X.C11NJ;
import X.C14K9;
import X.C158B;
import X.C162100jj;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C292401Bi;
import X.C465520INi;
import X.C465900IOu;
import X.C473050Igp;
import X.C474500IjA;
import X.C486790J7d;
import X.C497410Jf1;
import X.C499840Jiw;
import X.C500260Jjc;
import X.C750140Tbg;
import X.C751410Tdj;
import X.C754580Tiq;
import X.C761830TuX;
import X.C766080U3i;
import X.C766720U5u;
import X.C768300UBw;
import X.C768460UCm;
import X.C768620UDc;
import X.C768940UEi;
import X.C769040UEs;
import X.C771670UOv;
import X.C772260URc;
import X.C779690UiF;
import X.C779700UiG;
import X.C779730UiJ;
import X.C780680Ujq;
import X.C780690Ujr;
import X.C780820Uk4;
import X.C781010UkN;
import X.C781270Ukn;
import X.C781290Ukp;
import X.C782140UmC;
import X.C782390Umb;
import X.C782430Umf;
import X.C782900UnQ;
import X.C784410Upr;
import X.C784430Upt;
import X.C784440Upu;
import X.C785330UrL;
import X.C785350UrN;
import X.C786410Ut5;
import X.C838410Wul;
import X.C924790aAn;
import X.C930990aKn;
import X.EnumC1102750enp;
import X.InterfaceC1085480eLy;
import X.InterfaceC1106030et7;
import X.InterfaceC754220TiG;
import X.InterfaceC769090UEx;
import X.InterfaceC771640UOs;
import X.InterfaceC772190UQv;
import X.InterfaceC772600USk;
import X.InterfaceC773140UUm;
import X.InterfaceC777420Uea;
import X.InterfaceC780810Uk3;
import X.ScaleGestureDetectorOnScaleGestureListenerC21656519pD;
import Y.AObserverS177S0200000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import Y.ATListenerS446S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.NetworkStatusV3;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.effect.api.ActionEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchFailedEvent;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCaptureImageChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.api.CoHostPermissionCheckEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelPalletWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.StickerHintWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.TryModeLiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.trymode.guide.FaceGuidanceWidget;
import com.bytedance.android.livesdk.broadcast.trymode.guide.TryModeTopGuidanceWidget;
import com.bytedance.android.livesdk.broadcast.trymode.layer.TryModeVideoLayeredElementManager;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveCloseWidget;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.LiveBoardsBroadcastWidget;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatus;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.HideInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveOpenCustomPollLynxEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadedEvent;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTnsSafetyTools;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDonationOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptimizeEffectGestureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userinfowidget.TryModeUserInfoWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class TryModeBroadcastInteractionFragment extends BaseFragment implements InterfaceC773140UUm, C0IGR {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4ZzshHELIOSMSgjLSp9HDc1BCA3LQc+Ji43KyQ/PQY9PCA+KCwnISoiDz0yLygpJzs=";
    public C1083340eIW LL;
    public C1099820ej6 LLILLJJLI;
    public C0RT0 LLILLL;
    public C0DTN LLILZ;
    public C16F5 LLILZIL;
    public InterfaceC754220TiG LLILZLL;
    public BroadcastFilterStyleWidget LLIZ;
    public LiveRecyclableWidget LLIZLLLIL;
    public LiveRecyclableWidget LLJ;
    public LiveRecyclableWidget LLJI;
    public InterfaceC780810Uk3 LLJIJIL;
    public IPublicScreenHolderWidget LLJILJIL;
    public C0UKK LLJILJILJ;
    public C1083340eIW LLJILLL;
    public C772260URc LLJJIII;
    public DataChannel LLJJIJI;
    public LayeredWidgetManager LLJJIJIIJIL;
    public Room LLJJIJIL;
    public C781010UkN LLJJJ;
    public Runnable LLJJJIL;
    public C782390Umb LLJJJJ;
    public C784410Upr LLJJJJJIL;
    public TryModeVideoLayeredElementManager LLJJL;
    public C1120000fFe LLJJLIIIJLLLLLLLZ;
    public ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLJL;
    public ScaleGestureDetectorOnScaleGestureListenerC21656519pD LLJLIL;
    public C0UKN LLJLILLLLZIIL;
    public C780820Uk4 LLJLL;
    public C782430Umf LLJLLIL;
    public C1085570eM7 LLJLLL;
    public TryModeGoLiveWidget LLJZIJLIL;
    public TryModeTopGuidanceWidget LLL;
    public boolean LLLF;
    public final C11NJ LLJJ = new C11NJ();
    public final C01GW LLJJI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(94));
    public final C01GW LLJJJJLIIL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(92));
    public boolean LLJZ = true;

    @Override // X.InterfaceC781090UkV
    public final void EP(RemindMessage remindMessage) {
    }

    @Override // X.InterfaceC781090UkV
    public final void Hu() {
        C784410Upr c784410Upr = this.LLJJJJJIL;
        if (c784410Upr != null) {
            c784410Upr.L(new ATListenerS446S0100000_12(this, 9));
        }
        C784410Upr c784410Upr2 = this.LLJJJJJIL;
        if (c784410Upr2 != null) {
            c784410Upr2.LLLL(new ATListenerS446S0100000_12(this, 10));
        }
        UR(this.LLJJJIL);
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        View view = this.LLILZIL;
        if (view == null) {
            View view2 = getView();
            View viewFindViewById = view2 != null ? view2.findViewById(R.id.n3_) : null;
            this.LLILZIL = (C16F5) viewFindViewById;
            view = viewFindViewById;
        }
        this.LLJIJIL = iRoomFunctionServiceLJIL.G82(this, dataChannel, null, view, new C780680Ujq(this), AFwS199S0000000_12.get$arr$(93));
        BroadcastFilterStyleWidget broadcastFilterStyleWidget = this.LLIZ;
        if (broadcastFilterStyleWidget != null) {
            C500260Jjc.LJIILLIIL(broadcastFilterStyleWidget.LLILLL);
        }
    }

    @Override // X.InterfaceC781090UkV
    public final void ZD(int i) {
    }

    @Override // X.InterfaceC781090UkV
    public final BaseFragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC781090UkV
    public final void gf() {
    }

    public final ValueAnimator NR() {
        return (ValueAnimator) this.LLJJJJLIIL.getValue();
    }

    public final C1099820ej6 OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sfo) : null;
            this.LLILLJJLI = (C1099820ej6) viewFindViewById;
        }
        return (C1099820ej6) viewFindViewById;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public final void PR() {
        C782900UnQ c782900UnQ;
        ?? layeredElementContext;
        ConstraintProperty constraintPropertyById;
        LiveRecyclableWidget liveRecyclableWidget = this.LLIZLLLIL;
        if (liveRecyclableWidget != null) {
            liveRecyclableWidget.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget2 = this.LLJ;
        if (liveRecyclableWidget2 != null) {
            liveRecyclableWidget2.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget3 = this.LLJI;
        if (liveRecyclableWidget3 != null) {
            liveRecyclableWidget3.hide();
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager = this.LLJJL;
        if (tryModeVideoLayeredElementManager != null && (layeredElementContext = tryModeVideoLayeredElementManager.getLayeredElementContext()) != 0 && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C1079520eCM.LIZJ)) != null) {
            constraintPropertyById.visibility(0);
        }
        C782390Umb c782390Umb = this.LLJJJJ;
        if (c782390Umb != null) {
            c782390Umb.setBlockTouchEvent(false);
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager2 = this.LLJJL;
        if (tryModeVideoLayeredElementManager2 == null || (c782900UnQ = (C782900UnQ) tryModeVideoLayeredElementManager2.getElementById(C1079520eCM.LIZIZ)) == null || !c782900UnQ.LLILLL) {
            return;
        }
        ConstraintProperty constraintPropertyById2 = c782900UnQ.LL.getConstraintPropertyById(c782900UnQ.getId());
        c782900UnQ.LLILLL = false;
        if (constraintPropertyById2 != null) {
            ValueAnimator value = c782900UnQ.LLILLJJLI.getValue();
            value.cancel();
            value.removeAllUpdateListeners();
            value.setFloatValues(constraintPropertyById2.alpha(), 1.0f);
            value.addUpdateListener(new AUListenerS262S0100000_12(constraintPropertyById2, 36));
            value.start();
        }
    }

    public final void RR() {
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.FQ2(HideInteractionEvent.class);
        ((IHybridContainerManageService) C781270Ukn.LJIIIZ.getValue()).ZP(true);
    }

    public final void SR() {
        C772260URc c772260URc = this.LLJJIII;
        if (c772260URc != null) {
            c772260URc.LIZIZ("return_quit", "go_live");
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public final void WR() {
        C782900UnQ c782900UnQ;
        ?? layeredElementContext;
        ConstraintProperty constraintPropertyById;
        ?? layeredElementContext2;
        ConstraintProperty constraintPropertyById2;
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager = this.LLJJL;
        if (tryModeVideoLayeredElementManager == null || (layeredElementContext2 = tryModeVideoLayeredElementManager.getLayeredElementContext()) == 0 || (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(C1079520eCM.LIZJ)) == null || constraintPropertyById2.visibility() != 8) {
            LiveRecyclableWidget liveRecyclableWidget = this.LLIZLLLIL;
            if (liveRecyclableWidget != null) {
                liveRecyclableWidget.show();
            }
            LiveRecyclableWidget liveRecyclableWidget2 = this.LLJ;
            if (liveRecyclableWidget2 != null) {
                liveRecyclableWidget2.show();
            }
            TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager2 = this.LLJJL;
            if (tryModeVideoLayeredElementManager2 != null && (layeredElementContext = tryModeVideoLayeredElementManager2.getLayeredElementContext()) != 0 && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C1079520eCM.LIZJ)) != null) {
                constraintPropertyById.visibility(8);
            }
            C782390Umb c782390Umb = this.LLJJJJ;
            if (c782390Umb != null) {
                c782390Umb.setBlockTouchEvent(true);
            }
            TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager3 = this.LLJJL;
            if (tryModeVideoLayeredElementManager3 == null || (c782900UnQ = (C782900UnQ) tryModeVideoLayeredElementManager3.getElementById(C1079520eCM.LIZIZ)) == null || c782900UnQ.LLILLL) {
                return;
            }
            ConstraintProperty constraintPropertyById3 = c782900UnQ.LL.getConstraintPropertyById(c782900UnQ.getId());
            c782900UnQ.LLILLL = true;
            if (constraintPropertyById3 != null) {
                ValueAnimator value = c782900UnQ.LLILLJJLI.getValue();
                value.cancel();
                value.removeAllUpdateListeners();
                value.setFloatValues(constraintPropertyById3.alpha(), 0.5f);
                value.addUpdateListener(new AUListenerS262S0100000_12(constraintPropertyById3, 35));
                value.start();
            }
        }
    }

    @Override // X.InterfaceC781090UkV
    public final void Xp() {
        C781010UkN c781010UkN = this.LLJJJ;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        c781010UkN.LIZIZ();
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        if (dataChannel.gg0(LiveCenterStatusChannel.class) == C0UVH.SHOWING) {
            DataChannel dataChannel2 = this.LLJJIJI;
            (dataChannel2 != null ? dataChannel2 : null).FQ2(LiveCenterDismissEvent.class);
            return true;
        }
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C781270Ukn.LJI.getValue();
        if (iHostCreativeTool.isShowStickerView()) {
            iHostCreativeTool.hideStickerView();
            return true;
        }
        C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
        return true;
    }

    @Override // X.InterfaceC773140UUm
    public final C0DTN wh() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w4w) : null;
            this.LLILZ = (C0DTN) viewFindViewById;
        }
        return (C0DTN) viewFindViewById;
    }

    @Override // X.InterfaceC781090UkV
    public final void SF() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.MORE;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        enumC1102750enp.load(dataChannel, new C0UXF());
        EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.SETTING;
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        enumC1102750enp2.load(dataChannel2, new C754580Tiq(context));
        EnumC1102750enp enumC1102750enp3 = EnumC1102750enp.INTRO;
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        enumC1102750enp3.load(dataChannel3, new C497410Jf1(context));
        EnumC1102750enp enumC1102750enp4 = EnumC1102750enp.LIVE_EVENT;
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        enumC1102750enp4.load(dataChannel4, new C499840Jiw(context));
        ICommentService iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class);
        DataChannel dataChannel5 = this.LLJJIJI;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        iCommentService.sj2(context, dataChannel5);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        DataChannel dataChannel6 = this.LLJJIJI;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        iInteractService.fu2(dataChannel6);
        IInteractService iInteractService2 = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        DataChannel dataChannel7 = this.LLJJIJI;
        if (dataChannel7 == null) {
            dataChannel7 = null;
        }
        iInteractService2.dZ(dataChannel7);
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        DataChannel dataChannel8 = this.LLJJIJI;
        if (dataChannel8 == null) {
            dataChannel8 = null;
        }
        iRoomFunctionServiceLJIL.ZH(dataChannel8);
        EnumC1102750enp enumC1102750enp5 = EnumC1102750enp.EFFECT;
        DataChannel dataChannel9 = this.LLJJIJI;
        if (dataChannel9 == null) {
            dataChannel9 = null;
        }
        enumC1102750enp5.load(dataChannel9, new C0UF0(context, this));
        InterfaceC769090UEx insertStickerManager = C781270Ukn.LJI().getInsertStickerManager();
        if (insertStickerManager != null) {
            DataChannel dataChannel10 = this.LLJJIJI;
            if (dataChannel10 == null) {
                dataChannel10 = null;
            }
            insertStickerManager.kY0(dataChannel10);
        }
        EnumC1102750enp enumC1102750enp6 = EnumC1102750enp.PAUSE_LIVE;
        DataChannel dataChannel11 = this.LLJJIJI;
        if (dataChannel11 == null) {
            dataChannel11 = null;
        }
        enumC1102750enp6.load(dataChannel11, new C779700UiG());
        C19EG c19egLJ = C500260Jjc.LJ(context);
        if (c19egLJ != null) {
            EnumC1102750enp enumC1102750enp7 = EnumC1102750enp.SHARE;
            DataChannel dataChannel12 = this.LLJJIJI;
            if (dataChannel12 == null) {
                dataChannel12 = null;
            }
            IShareService iShareServiceLJJI = C781270Ukn.LJJI();
            LiveMode liveMode = LiveMode.VIDEO;
            enumC1102750enp7.load(dataChannel12, iShareServiceLJJI.K72(c19egLJ, context, liveMode, this));
            EnumC1102750enp enumC1102750enp8 = EnumC1102750enp.SHARE_IN_MORE;
            DataChannel dataChannel13 = this.LLJJIJI;
            enumC1102750enp8.load(dataChannel13 != null ? dataChannel13 : null, C781270Ukn.LJJI().K72(c19egLJ, context, liveMode, this));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C465520INi.LIZ.FM0();
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        C769040UEs.LJ();
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalLogHelper();
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C0UFJ.LIZLLL(dataChannel, true);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
        C768300UBw.LJIILJJIL(C0UFI.LJIIIIZZ, true);
        C0UFI.LJIIJ(false);
        IToolbarService iToolbarServiceLJJIIJ = C781270Ukn.LJJIIJ();
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        iToolbarServiceLJJIIJ.Ok(dataChannel2);
        C1120000fFe c1120000fFe = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe == null) {
            c1120000fFe = null;
        }
        ScaleGestureDetectorOnScaleGestureListenerC21656519pD scaleGestureDetectorOnScaleGestureListenerC21656519pD = this.LLJL;
        if (scaleGestureDetectorOnScaleGestureListenerC21656519pD == null) {
            scaleGestureDetectorOnScaleGestureListenerC21656519pD = null;
        }
        c1120000fFe.LIZJ(scaleGestureDetectorOnScaleGestureListenerC21656519pD);
        C1120000fFe c1120000fFe2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe2 == null) {
            c1120000fFe2 = null;
        }
        ScaleGestureDetectorOnScaleGestureListenerC21656519pD scaleGestureDetectorOnScaleGestureListenerC21656519pD2 = this.LLJLIL;
        if (scaleGestureDetectorOnScaleGestureListenerC21656519pD2 == null) {
            scaleGestureDetectorOnScaleGestureListenerC21656519pD2 = null;
        }
        c1120000fFe2.LIZJ(scaleGestureDetectorOnScaleGestureListenerC21656519pD2);
        C1120000fFe c1120000fFe3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe3 == null) {
            c1120000fFe3 = null;
        }
        C0UKN c0ukn = this.LLJLILLLLZIIL;
        if (c0ukn == null) {
            c0ukn = null;
        }
        c1120000fFe3.LIZJ(c0ukn);
        C1120000fFe c1120000fFe4 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe4 == null) {
            c1120000fFe4 = null;
        }
        C780820Uk4 c780820Uk4 = this.LLJLL;
        if (c780820Uk4 == null) {
            c780820Uk4 = null;
        }
        c1120000fFe4.LIZJ(c780820Uk4);
        C1120000fFe c1120000fFe5 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe5 == null) {
            c1120000fFe5 = null;
        }
        C782430Umf c782430Umf = this.LLJLLIL;
        if (c782430Umf == null) {
            c782430Umf = null;
        }
        c1120000fFe5.LIZJ(c782430Umf);
        InterfaceC769090UEx insertStickerManager = C781270Ukn.LJI().getInsertStickerManager();
        if (insertStickerManager != null) {
            insertStickerManager.release();
        }
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        dataChannel3.zQ2(this);
        IBarrageService iBarrageServiceLIZLLL = C781270Ukn.LIZLLL();
        Room room = this.LLJJIJIL;
        if (room == null) {
            room = null;
        }
        iBarrageServiceLIZLLL.Dh0(room.getId());
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        dataChannel4.zQ2(this);
        C473050Igp.LIZIZ().LJI();
        ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).S91();
        OptGoLiveBluetoothPermissionRequestSetting optGoLiveBluetoothPermissionRequestSetting = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE;
        if (!optGoLiveBluetoothPermissionRequestSetting.enable()) {
            BluetoothAdapter.getDefaultAdapter().closeProfileProxy(2, C779690UiF.LIZ);
        }
        DataChannel dataChannel5 = this.LLJJIJI;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        if (C500260Jjc.LJJIFFI((Boolean) dataChannel5.gg0(TryModeGoLiveChannel.class))) {
            if (optGoLiveBluetoothPermissionRequestSetting.enable()) {
                LiveAudioDevicesDetector.LIZ.LIZ();
            }
            C0UKK c0ukk = this.LLJILJILJ;
            if (c0ukk != null) {
                c0ukk.LLJJ = null;
            }
            C768460UCm.LJIIIIZZ();
            C761830TuX.LJ();
            C768620UDc c768620UDc = C768620UDc.LIZ;
            c768620UDc.LJII(false, false, false);
            C768620UDc.LIZLLL = false;
            c768620UDc.LJIILIIL(null);
        }
        LayeredWidgetManager layeredWidgetManager = this.LLJJIJIIJIL;
        if (layeredWidgetManager == null) {
            layeredWidgetManager = null;
        }
        C1082080eGU.LIZIZ(layeredWidgetManager);
        InterfaceC1106030et7.E4.LJFF(Boolean.valueOf(this.LLJZ));
        C1082080eGU.LJFF(2);
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C0UFI.LIZJ = null;
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        Room room2 = this.LLJJIJIL;
        iInteractService.et0(room2 != null ? room2 : null);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C785330UrL c785330UrL;
        super.onDestroyView();
        InterfaceC772600USk.Af.LJFF(Boolean.TRUE);
        this.LLJJJIL = null;
        C781010UkN c781010UkN = this.LLJJJ;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        DialogInterface dialogInterface = c781010UkN.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        InterfaceC780810Uk3 interfaceC780810Uk3 = this.LLJIJIL;
        if (interfaceC780810Uk3 != null) {
            interfaceC780810Uk3.onDestroy();
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LJIILJJIL(C0UX8.EVENT_PAGE_TRY_MODE_BROADCAST);
        C1119760fFG c1119760fFG = C785350UrN.LIZ;
        if (c1119760fFG != null) {
            long j = c1119760fFG.LIZ;
            if (j == j && (c785330UrL = c1119760fFG.LJFF) != null) {
                c785330UrL.LL = 4;
                c785330UrL.dismiss();
                C785350UrN.LIZ = null;
                C785350UrN.LIZIZ = null;
            }
        }
        LayeredWidgetManager layeredWidgetManager = this.LLJJIJIIJIL;
        if (layeredWidgetManager == null) {
            layeredWidgetManager = null;
        }
        layeredWidgetManager.unload(this.LLJILJIL);
        C784410Upr c784410Upr = this.LLJJJJJIL;
        if (c784410Upr != null) {
            c784410Upr.LLLJIL();
        }
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        iRoomFunctionServiceLJIL.LLLF(null, dataChannel);
        C781270Ukn.LJIL().Kp1(null);
        C781270Ukn.LJIL().tk0();
        C781270Ukn.LJJIII().pa();
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        C1108110ewT.LJ(dataChannel2);
        C781270Ukn.LJIJ().pa().LIZJ();
        C781290Ukp.LIZ.clear();
        this.LLJJ.LJ();
        C781270Ukn.LJIL().a41();
        IRoomFunctionService iRoomFunctionServiceLJIL2 = C781270Ukn.LJIL();
        Room room = this.LLJJIJIL;
        if (room == null) {
            room = null;
        }
        iRoomFunctionServiceLJIL2.Kp1(room);
        C1085570eM7 c1085570eM7 = this.LLJLLL;
        if (c1085570eM7 != null) {
            getView();
            c1085570eM7.LIZIZ();
        }
        ((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).Ob2();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            return;
        }
        try {
            Context context = getContext();
            if (context != null) {
                C786410Ut5.LJJIFFI(context, (C779730UiJ) this.LLJJI.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterHeadsetReceiver ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("VideoBroadcastInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.FQ2(CoHostPermissionCheckEvent.class);
        if (!OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            try {
                Context context = getContext();
                if (context != null) {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.LLJJI.getValue();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
                    C838410Wul.LJFF(context, broadcastReceiver, intentFilter, 2);
                    this.LLJJI.getValue().getClass();
                    C779730UiJ.LIZIZ(context);
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("registerHeadsetReceiver ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("VideoBroadcastInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
            }
            C768620UDc.LIZ.LJIIL(false);
        }
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            C0U6C liveGoalEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            DataChannel dataChannel2 = this.LLJJIJI;
            if (dataChannel2 == null) {
                dataChannel2 = null;
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LIZJ = dataChannel2;
            if (C0UFI.LIZLLL() && C0UFI.LIZIZ()) {
                if (!C0UFI.LJIIIIZZ()) {
                    List<? extends LiveEffect> list = C0UFI.LIZIZ;
                    C0UFI.LIZ(list != null ? (LiveEffect) ListProtector.get(list, InterfaceC772190UQv.X3.LIZIZ().intValue()) : null);
                }
                C0UFI.LJIIZILJ(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.LC0(ZoomCameraScaleEvent.class, Float.valueOf(0.0f));
    }

    @Override // X.InterfaceC781090UkV
    public final /* bridge */ /* synthetic */ C784410Upr LLLLJI() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC781090UkV
    public final void LLLLIILL(int i) {
        if (C1152720g6Q.LIZ()) {
            DataChannel dataChannel = this.LLJJIJI;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(NetworkStatusV3.class, Integer.valueOf(i));
        }
    }

    public final void UR(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LLJJJIL = null;
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS112S0100000_12(runnable, 99));
                return;
            }
            return;
        }
        this.LLJJJIL = runnable;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        C772260URc c772260URc;
        super.onActivityCreated(bundle);
        if (this.LLJILLL == null) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            DataChannel dataChannel = this.LLJJIJI;
            if (dataChannel == null) {
                dataChannel = null;
            }
            c772260URc = new C772260URc(context, this, dataChannel);
        } else {
            c772260URc = null;
        }
        this.LLJJIII = c772260URc;
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.CQ2(WidgetLoadedEvent.class, this, new AwS591S0100000_12(this, 462));
        IShortTouchService iShortTouchService = (IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class);
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        iShortTouchService.mD1(getContext(), this, dataChannel3);
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        dataChannel4.BQ2(this, LiveOpenCustomPollLynxEvent.class, new AwS591S0100000_12(this, 765));
        TryModeUserInfoWidget tryModeUserInfoWidgetSK = C781270Ukn.LJJIIZI().sK();
        if (tryModeUserInfoWidgetSK != null) {
            LayeredWidgetManager layeredWidgetManager = this.LLJJIJIIJIL;
            if (layeredWidgetManager == null) {
                layeredWidgetManager = null;
            }
            layeredWidgetManager.load(R.id.user_info_container, tryModeUserInfoWidgetSK);
        }
        LayeredWidgetManager layeredWidgetManager2 = this.LLJJIJIIJIL;
        if (layeredWidgetManager2 == null) {
            layeredWidgetManager2 = null;
        }
        IGiftService iGiftServiceLJII = C781270Ukn.LJII();
        LayeredWidgetManager layeredWidgetManager3 = this.LLJJIJIIJIL;
        if (layeredWidgetManager3 == null) {
            layeredWidgetManager3 = null;
        }
        layeredWidgetManager2.load(R.id.video_animate_container, (Widget) iGiftServiceLJII.getGiftWidget(null, layeredWidgetManager3), true);
        DataChannel dataChannel5 = this.LLJJIJI;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        Boolean bool = Boolean.TRUE;
        dataChannel5.zW(CommentOrMessageData.class, bool);
        LayeredWidgetManager layeredWidgetManager4 = this.LLJJIJIIJIL;
        if (layeredWidgetManager4 == null) {
            layeredWidgetManager4 = null;
        }
        this.LLJILJIL = (IPublicScreenHolderWidget) layeredWidgetManager4.load(R.id.o_c, C781270Ukn.LJIJI().yO(true));
        LayeredWidgetManager layeredWidgetManager5 = this.LLJJIJIIJIL;
        if (layeredWidgetManager5 == null) {
            layeredWidgetManager5 = null;
        }
        layeredWidgetManager5.load(R.id.ebi, ((ICommentService) C781270Ukn.LJJIL.getValue()).KK1());
        LayeredWidgetManager layeredWidgetManager6 = this.LLJJIJIIJIL;
        if (layeredWidgetManager6 == null) {
            layeredWidgetManager6 = null;
        }
        layeredWidgetManager6.load(R.id.mvo, new LiveCloseWidget());
        LayeredWidgetManager layeredWidgetManager7 = this.LLJJIJIIJIL;
        if (layeredWidgetManager7 == null) {
            layeredWidgetManager7 = null;
        }
        layeredWidgetManager7.load(R.id.iuw, StickerHintWidget.class);
        IBannerService iBannerService = (IBannerService) C1161920gLG.LIZJ(IBannerService.class);
        Room room = this.LLJJIJIL;
        if (room == null) {
            room = null;
        }
        LayeredWidgetManager layeredWidgetManager8 = this.LLJJIJIIJIL;
        if (layeredWidgetManager8 == null) {
            layeredWidgetManager8 = null;
        }
        DataChannel dataChannel6 = this.LLJJIJI;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        iBannerService.QE(room, true, true, layeredWidgetManager8, dataChannel6, this);
        LayeredWidgetManager layeredWidgetManager9 = this.LLJJIJIIJIL;
        if (layeredWidgetManager9 == null) {
            layeredWidgetManager9 = null;
        }
        layeredWidgetManager9.load(R.id.n3l, ((IPinCardService) C781270Ukn.LJJJJJ.getValue()).Zd0());
        SF();
        LiveGiftPollEffectWidget liveGiftPollEffectWidgetSQ2 = C781270Ukn.LJIL().sQ2();
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        LayeredWidgetManager layeredWidgetManager10 = this.LLJJIJIIJIL;
        if (layeredWidgetManager10 == null) {
            layeredWidgetManager10 = null;
        }
        LiveNormalPollEffectWidget liveNormalPollEffectWidgetYe0 = iRoomFunctionServiceLJIL.ye0(true, layeredWidgetManager10);
        if (liveNormalPollEffectWidgetYe0 != null) {
            LayeredWidgetManager layeredWidgetManager11 = this.LLJJIJIIJIL;
            if (layeredWidgetManager11 == null) {
                layeredWidgetManager11 = null;
            }
            layeredWidgetManager11.load(R.id.n2m, liveNormalPollEffectWidgetYe0);
        }
        if (liveGiftPollEffectWidgetSQ2 != null) {
            LayeredWidgetManager layeredWidgetManager12 = this.LLJJIJIIJIL;
            if (layeredWidgetManager12 == null) {
                layeredWidgetManager12 = null;
            }
            layeredWidgetManager12.load(R.id.myj, liveGiftPollEffectWidgetSQ2);
        }
        LayeredWidgetManager layeredWidgetManager13 = this.LLJJIJIIJIL;
        if (layeredWidgetManager13 == null) {
            layeredWidgetManager13 = null;
        }
        layeredWidgetManager13.load(R.id.il0, C781270Ukn.LJJII().getFreeFrameSlotWidget());
        if (!Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), bool)) {
            TryModeGoLiveWidget tryModeGoLiveWidget = new TryModeGoLiveWidget(this.LLJJIII);
            LayeredWidgetManager layeredWidgetManager14 = this.LLJJIJIIJIL;
            if (layeredWidgetManager14 == null) {
                layeredWidgetManager14 = null;
            }
            layeredWidgetManager14.load(R.id.yli, tryModeGoLiveWidget);
            this.LLJZIJLIL = tryModeGoLiveWidget;
        }
        LayeredWidgetManager layeredWidgetManager15 = this.LLJJIJIIJIL;
        if (layeredWidgetManager15 == null) {
            layeredWidgetManager15 = null;
        }
        layeredWidgetManager15.load(((IUnityAnimationService) C1161920gLG.LIZJ(IUnityAnimationService.class)).BI0());
        LayeredWidgetManager layeredWidgetManager16 = this.LLJJIJIIJIL;
        if (layeredWidgetManager16 == null) {
            layeredWidgetManager16 = null;
        }
        layeredWidgetManager16.load(R.id.v96, C781270Ukn.LJJIFFI().NF2(), true, new Object[]{new C1078030e9x(SystemClock.elapsedRealtime())});
        LayeredWidgetManager layeredWidgetManager17 = this.LLJJIJIIJIL;
        if (layeredWidgetManager17 == null) {
            layeredWidgetManager17 = null;
        }
        layeredWidgetManager17.load(R.id.v97, C781270Ukn.LJJIFFI().f30(), true, new Object[]{new C1078030e9x(SystemClock.elapsedRealtime())});
        DataChannel dataChannel7 = this.LLJJIJI;
        if (dataChannel7 == null) {
            dataChannel7 = null;
        }
        dataChannel7.BQ2(this, DrawGuessCaptureImageChannel.class, new AwS591S0100000_12(this, 775));
        dataChannel7.EQ2(this, StickerSelectedEvent.class, new AwS591S0100000_12(this, 776));
        dataChannel7.EQ2(this, StickerCancelChannel.class, new AwS591S0100000_12(this, 777));
        dataChannel7.BQ2(this, LiveGoalEffectChannel.class, AFwS245S0000000_12.get$arr$(127));
        dataChannel7.BQ2(this, MoveLiveGoalEffectEvent.class, AFwS245S0000000_12.get$arr$(128));
        DataChannel dataChannel8 = this.LLJJIJI;
        if (dataChannel8 == null) {
            dataChannel8 = null;
        }
        dataChannel8.BQ2(this, LiveCenterAlpha.class, new AwS591S0100000_12(this, 778));
        dataChannel8.BQ2(this, LiveCenterStatusChannel.class, new AwS591S0100000_12(this, 779));
        DataChannel dataChannel9 = this.LLJJIJI;
        if (dataChannel9 == null) {
            dataChannel9 = null;
        }
        if (C162100jj.LIZIZ(dataChannel9)) {
            ((IQAService) C1161920gLG.LIZJ(IQAService.class)).y02();
        }
        LayeredWidgetManager layeredWidgetManager18 = this.LLJJIJIIJIL;
        if (layeredWidgetManager18 == null) {
            layeredWidgetManager18 = null;
        }
        layeredWidgetManager18.load(R.id.mut, new TryModeLiveCenterEntranceWidget());
        C786410Ut5.LJLIIL(LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value(), C0IK5.LIZ(), new ARunnableS112S0100000_12(this, 287));
        if (!LiveDonationOptSetting.INSTANCE.enable()) {
            LayeredWidgetManager layeredWidgetManager19 = this.LLJJIJIIJIL;
            if (layeredWidgetManager19 == null) {
                layeredWidgetManager19 = null;
            }
            layeredWidgetManager19.load(R.id.mw2, ((IDonationStickerOuterService) C1161920gLG.LIZJ(IDonationStickerOuterService.class)).bO2());
        }
        LayeredWidgetManager layeredWidgetManager20 = this.LLJJIJIIJIL;
        if (layeredWidgetManager20 == null) {
            layeredWidgetManager20 = null;
        }
        layeredWidgetManager20.load(R.id.n5o, ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).n50());
        LayeredWidgetManager layeredWidgetManager21 = this.LLJJIJIIJIL;
        if (layeredWidgetManager21 == null) {
            layeredWidgetManager21 = null;
        }
        layeredWidgetManager21.load(R.id.n7j, ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).XB0());
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            LayeredWidgetManager layeredWidgetManager22 = this.LLJJIJIIJIL;
            if (layeredWidgetManager22 == null) {
                layeredWidgetManager22 = null;
            }
            layeredWidgetManager22.load(R.id.myo, ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectWidget());
        }
        LayeredWidgetManager layeredWidgetManager23 = this.LLJJIJIIJIL;
        if (layeredWidgetManager23 == null) {
            layeredWidgetManager23 = null;
        }
        layeredWidgetManager23.load(C781270Ukn.LJII().getRedEnvelopeWidget());
        Room room2 = this.LLJJIJIL;
        if (room2 == null) {
            room2 = null;
        }
        if (!room2.getRoomStickerList().isEmpty()) {
            DataChannel dataChannel10 = this.LLJJIJI;
            if (dataChannel10 == null) {
                dataChannel10 = null;
            }
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIIL(dataChannel10);
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIIJJI(dataChannel10);
        }
        LayeredWidgetManager layeredWidgetManager24 = this.LLJJIJIIJIL;
        if (layeredWidgetManager24 == null) {
            layeredWidgetManager24 = null;
        }
        IToolbarService iToolbarService = (IToolbarService) C1161920gLG.LIZJ(IToolbarService.class);
        DataChannel dataChannel11 = this.LLJJIJI;
        if (dataChannel11 == null) {
            dataChannel11 = null;
        }
        layeredWidgetManager24.load(R.id.y6v, iToolbarService.bP2(null, dataChannel11), false);
        DataChannel dataChannel12 = this.LLJJIJI;
        if (dataChannel12 == null) {
            dataChannel12 = null;
        }
        dataChannel12.BQ2(this, LiveGameEffectFetchedChannel.class, AFwS245S0000000_12.get$arr$(125));
        dataChannel12.BQ2(this, LiveGameEffectFetchFailedEvent.class, AFwS245S0000000_12.get$arr$(126));
        dataChannel12.BQ2(this, DrawGuessStartGameEvent.class, new AwS591S0100000_12(this, 769));
        dataChannel12.BQ2(this, DrawGuessExitGameEvent.class, new AwS591S0100000_12(this, 771));
        dataChannel12.BQ2(this, DrawGuessIsCountingDownRoundStart.class, new AwS591S0100000_12(this, 772));
        dataChannel12.BQ2(this, DrawGuessFreelyStartChannel.class, new AwS591S0100000_12(this, 773));
        C0U40 liveEffectDataProvider = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        DataChannel dataChannel13 = this.LLJJIJI;
        if (dataChannel13 == null) {
            dataChannel13 = null;
        }
        liveEffectDataProvider.getClass();
        C766720U5u.LJIIIIZZ("livegame", new C0U3Y(), new C766080U3i(), new C0U6A(dataChannel13));
        this.LLIZLLLIL = C781270Ukn.LJIL().Y12(this);
        this.LLJ = C781270Ukn.LJIL().P10();
        this.LLJI = C781270Ukn.LJIL().yO1();
        LayeredWidgetManager layeredWidgetManager25 = this.LLJJIJIIJIL;
        if (layeredWidgetManager25 == null) {
            layeredWidgetManager25 = null;
        }
        layeredWidgetManager25.load(R.id.g_i, this.LLIZLLLIL);
        LayeredWidgetManager layeredWidgetManager26 = this.LLJJIJIIJIL;
        if (layeredWidgetManager26 == null) {
            layeredWidgetManager26 = null;
        }
        layeredWidgetManager26.load(R.id.g_e, this.LLJ);
        LayeredWidgetManager layeredWidgetManager27 = this.LLJJIJIIJIL;
        if (layeredWidgetManager27 == null) {
            layeredWidgetManager27 = null;
        }
        layeredWidgetManager27.load(R.id.g_h, this.LLJI);
        LayeredWidgetManager layeredWidgetManager28 = this.LLJJIJIIJIL;
        if (layeredWidgetManager28 == null) {
            layeredWidgetManager28 = null;
        }
        layeredWidgetManager28.load(R.id.v9d, new ShortCutPanelPalletWidget());
        LayeredWidgetManager layeredWidgetManager29 = this.LLJJIJIIJIL;
        if (layeredWidgetManager29 == null) {
            layeredWidgetManager29 = null;
        }
        layeredWidgetManager29.load(R.id.v9b, new ShortCutPanelWidget());
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenLiveGoalPanelChannel.class, new AwS591S0100000_12(this, 774));
        LiveBoardsBroadcastWidget liveBoardsBroadcastWidgetLJIIIIZZ = C781270Ukn.LJIJ().ZI2().LJIIIIZZ();
        if (liveBoardsBroadcastWidgetLJIIIIZZ != null) {
            LayeredWidgetManager layeredWidgetManager30 = this.LLJJIJIIJIL;
            if (layeredWidgetManager30 == null) {
                layeredWidgetManager30 = null;
            }
            layeredWidgetManager30.load(R.id.mu_, liveBoardsBroadcastWidgetLJIIIIZZ);
        }
        IBarrageService iBarrageServiceLIZLLL = C781270Ukn.LIZLLL();
        Room room3 = this.LLJJIJIL;
        if (room3 == null) {
            room3 = null;
        }
        InterfaceC1085480eLy interfaceC1085480eLyO41 = iBarrageServiceLIZLLL.O41(room3.getId());
        if (interfaceC1085480eLyO41 != null && interfaceC1085480eLyO41.isEnabled()) {
            if (interfaceC1085480eLyO41.LIZIZ()) {
                LayeredWidgetManager layeredWidgetManager31 = this.LLJJIJIIJIL;
                if (layeredWidgetManager31 == null) {
                    layeredWidgetManager31 = null;
                }
                layeredWidgetManager31.load(R.id.uoc, C781270Ukn.LIZLLL().Gp1());
            }
            if (interfaceC1085480eLyO41.LJII()) {
                LayeredWidgetManager layeredWidgetManager32 = this.LLJJIJIIJIL;
                if (layeredWidgetManager32 == null) {
                    layeredWidgetManager32 = null;
                }
                layeredWidgetManager32.load(R.id.pve, C781270Ukn.LIZLLL().od2());
            }
        }
        LayeredWidgetManager layeredWidgetManager33 = this.LLJJIJIIJIL;
        if (layeredWidgetManager33 == null) {
            layeredWidgetManager33 = null;
        }
        layeredWidgetManager33.load(R.id.h5d, new EndWidget());
        IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
        iBillboardService.w71(C011V.BROADCAST, 0L).observe(this, new AObserverS177S0200000_12(this, iBillboardService, 38));
        TryModeGuidanceSetting tryModeGuidanceSetting = TryModeGuidanceSetting.INSTANCE;
        if (tryModeGuidanceSetting.inExperiment()) {
            DataChannel dataChannel14 = this.LLJJIJI;
            if (dataChannel14 == null) {
                dataChannel14 = null;
            }
            if (C0UID.LJIIJ(dataChannel14)) {
                LayeredWidgetManager layeredWidgetManager34 = this.LLJJIJIIJIL;
                if (layeredWidgetManager34 == null) {
                    layeredWidgetManager34 = null;
                }
                layeredWidgetManager34.load(R.id.hj4, new FaceGuidanceWidget());
                if (tryModeGuidanceSetting.isV1()) {
                    TryModeTopGuidanceWidget tryModeTopGuidanceWidget = new TryModeTopGuidanceWidget();
                    this.LLL = tryModeTopGuidanceWidget;
                    LayeredWidgetManager layeredWidgetManager35 = this.LLJJIJIIJIL;
                    if (layeredWidgetManager35 == null) {
                        layeredWidgetManager35 = null;
                    }
                    layeredWidgetManager35.load(R.id.ylk, tryModeTopGuidanceWidget);
                }
            }
        }
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(this, 98), null, 2000L);
        }
    }

    @Override // X.InterfaceC781090UkV
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TryModeTopGuidanceWidget tryModeTopGuidanceWidget;
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel == null) {
            dataChannel = null;
        }
        if (C0UID.LJIIJ(dataChannel) && TryModeGuidanceSetting.INSTANCE.isV1() && (tryModeTopGuidanceWidget = this.LLL) != null && tryModeTopGuidanceWidget.isShowing()) {
            tryModeTopGuidanceWidget.cancelShowAnimation();
            tryModeTopGuidanceWidget.cancelHideAnimation();
            tryModeTopGuidanceWidget.animateHide();
        }
        C0UF4 c0uf4LIZIZ = C771670UOv.LIZIZ();
        if (c0uf4LIZIZ != null && c0uf4LIZIZ.LIZ) {
            return false;
        }
        C0UFT.LIZ();
        int action = motionEvent.getAction() & 255;
        if (action != 1) {
            if (action == 2 && C0UFT.LJFF) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C0UFI.LJIIIIZZ()) {
                    DataChannel dataChannel2 = this.LLJJIJI;
                    if (dataChannel2 == null) {
                        dataChannel2 = null;
                    }
                    dataChannel2.LC0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else if (C0UFT.LJFF) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            if (C0UFI.LJIIIIZZ()) {
                DataChannel dataChannel3 = this.LLJJIJI;
                if (dataChannel3 == null) {
                    dataChannel3 = null;
                }
                dataChannel3.LC0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
            }
        }
        C1120000fFe c1120000fFe = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe == null) {
            c1120000fFe = null;
        }
        return c1120000fFe.LIZ(motionEvent, new C0UKP(C0UFT.LIZIZ, C0UFT.LIZJ, C0UFT.LJII, C0UFT.LJI), null);
    }

    @Override // X.InterfaceC781090UkV
    public final void I1(int i, int i2) {
        if (C1152720g6Q.LIZ()) {
            DataChannel dataChannel = this.LLJJIJI;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.LC0(BroadcastAudioStatus.class, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public final void VR(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLJJIJI = dataChannel;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            room = new Room();
            room.setOwner(UserService.getInstance().user().LJIJJLI());
            room.setOwnerUserId(UserService.getInstance().user().LJIJJLI().getId());
            dataChannel.zW(RoomChannel.class, room);
        }
        this.LLJJIJIL = room;
        DataChannel dataChannel2 = this.LLJJIJI;
        DataChannel dataChannel3 = null;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.zW(LiveModeChannel.class, LiveMode.VIDEO);
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 != null) {
            dataChannel3 = dataChannel4;
        }
        Boolean bool = Boolean.FALSE;
        dataChannel3.SX0(C0U4T.class, bool);
        dataChannel3.zW(CommentOrMessageData.class, bool);
        dataChannel3.SX0(C0TZM.class, Boolean.TRUE);
        dataChannel3.SX0(C780690Ujr.class, Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText()));
        C0IUA.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        int i;
        int i2;
        int i3;
        C0UKK c0ukk;
        ViewGroup viewGroup;
        View.OnTouchListener onTouchListenerLJJ;
        super.onViewCreated(view, bundle);
        int i4 = 1;
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Ujo
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, 0);
                    return c20246014Ju;
                }
            });
        } else {
            view.setFitsSystemWindows(true);
        }
        Context context = getContext();
        C1083340eIW c1083340eIW = (C1083340eIW) view;
        DataChannel dataChannel = this.LLJJIJI;
        View viewFindViewById = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager = new TryModeVideoLayeredElementManager(context, this, c1083340eIW, dataChannel);
        LayeredWidgetManager layeredWidgetManagerOf = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C486790J7d.LIZ, tryModeVideoLayeredElementManager);
        this.LLJJIJIIJIL = layeredWidgetManagerOf;
        this.LLJJL = tryModeVideoLayeredElementManager;
        if (layeredWidgetManagerOf == null) {
            layeredWidgetManagerOf = null;
        }
        int i5 = 2;
        C1082080eGU.LJI(2, layeredWidgetManagerOf);
        LayeredWidgetManager layeredWidgetManager = this.LLJJIJIIJIL;
        if (layeredWidgetManager == null) {
            layeredWidgetManager = null;
        }
        C1082080eGU.LIZ(2, layeredWidgetManager);
        C924790aAn.LIZLLL().LJII(0);
        C158B.LIZLLL(getContext());
        IToolbarService iToolbarServiceLJJIIJ = C781270Ukn.LJJIIJ();
        Context context2 = getContext();
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        iToolbarServiceLJJIIJ.xV(context2, this, dataChannel2);
        IToolbarService iToolbarServiceLJJIIJ2 = C781270Ukn.LJJIIJ();
        Context context3 = getContext();
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enable()) {
            i = 5;
        } else {
            i = 7;
        }
        iToolbarServiceLJJIIJ2.ba0(i, context3);
        view.setFitsSystemWindows(true);
        HandlerHook.viewPost(view, new ARunnableS81S0200000_12(this, view, 84));
        IBrowserService iBrowserServiceLJFF = C781270Ukn.LJFF();
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        iBrowserServiceLJFF.uv1(this, dataChannel3, true, this);
        IBarrageService iBarrageServiceLIZLLL = C781270Ukn.LIZLLL();
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        iBarrageServiceLIZLLL.dJ0(this, dataChannel4, this.LLJJJJJIL);
        DataChannel dataChannel5 = this.LLJJIJI;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        new C784430Upt(this, dataChannel5);
        InterfaceC771640UOs interfaceC771640UOsLJII = C768460UCm.LJII();
        DataChannel dataChannel6 = this.LLJJIJI;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        interfaceC771640UOsLJII.LJIIIZ(this, dataChannel6);
        C473050Igp c473050IgpLIZIZ = C473050Igp.LIZIZ();
        c473050IgpLIZIZ.LJI();
        c473050IgpLIZIZ.LIZ = true;
        Room room = this.LLJJIJIL;
        if (room == null) {
            room = null;
        }
        Context context4 = getContext();
        DataChannel dataChannel7 = this.LLJJIJI;
        if (dataChannel7 == null) {
            dataChannel7 = null;
        }
        C781010UkN c781010UkN = new C781010UkN(room, this, view, context4, dataChannel7);
        c781010UkN.LIZ();
        this.LLJJJ = c781010UkN;
        C782390Umb c782390Umb = this.LLJJJJ;
        if (c782390Umb != null) {
            DataChannel dataChannel8 = this.LLJJIJI;
            if (dataChannel8 == null) {
                dataChannel8 = null;
            }
            c782390Umb.setDataChannel(dataChannel8);
        }
        C768620UDc c768620UDc = C768620UDc.LIZ;
        boolean zEnable = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable();
        c768620UDc.getClass();
        C768620UDc.LIZLLL = zEnable;
        DataChannel dataChannel9 = this.LLJJIJI;
        if (dataChannel9 == null) {
            dataChannel9 = null;
        }
        c768620UDc.LJIILIIL(dataChannel9);
        InterfaceC777420Uea interfaceC777420UeaEa0 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ea0(ViewModelProviders.of(this));
        DataChannel dataChannel10 = this.LLJJIJI;
        if (dataChannel10 == null) {
            dataChannel10 = null;
        }
        dataChannel10.SX0(C782140UmC.class, interfaceC777420UeaEa0);
        DataChannel dataChannel11 = this.LLJJIJI;
        if (dataChannel11 == null) {
            dataChannel11 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = new C1120000fFe(dataChannel11);
        Context context5 = getContext();
        DataChannel dataChannel12 = this.LLJJIJI;
        if (dataChannel12 == null) {
            dataChannel12 = null;
        }
        OptimizeEffectGestureSetting optimizeEffectGestureSetting = OptimizeEffectGestureSetting.INSTANCE;
        if (optimizeEffectGestureSetting.enable()) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        this.LLJL = new ScaleGestureDetectorOnScaleGestureListenerC21656519pD(context5, dataChannel12, i2);
        Context context6 = getContext();
        DataChannel dataChannel13 = this.LLJJIJI;
        if (dataChannel13 == null) {
            dataChannel13 = null;
        }
        int i6 = 4;
        if (optimizeEffectGestureSetting.enable()) {
            i5 = 4;
        }
        this.LLJLIL = new ScaleGestureDetectorOnScaleGestureListenerC21656519pD(context6, dataChannel13, i5);
        Context context7 = getContext();
        DataChannel dataChannel14 = this.LLJJIJI;
        if (dataChannel14 == null) {
            dataChannel14 = null;
        }
        if (optimizeEffectGestureSetting.enable()) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.q32);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (C1083340eIW) viewFindViewById2;
        }
        this.LLJLL = new C780820Uk4(context7, dataChannel14, i3, this, viewFindViewById2);
        Context context8 = getContext();
        DataChannel dataChannel15 = this.LLJJIJI;
        if (dataChannel15 == null) {
            dataChannel15 = null;
        }
        if (optimizeEffectGestureSetting.enable()) {
            i6 = 6;
        }
        this.LLJLILLLLZIIL = new C0UKN(context8, dataChannel15, i6, this);
        C784410Upr c784410Upr = this.LLJJJJJIL;
        if (!optimizeEffectGestureSetting.enable()) {
            i4 = 5;
        }
        this.LLJLLIL = new C782430Umf(c784410Upr, i4, new AwS591S0100000_12(this, 766));
        C1120000fFe c1120000fFe = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe == null) {
            c1120000fFe = null;
        }
        ScaleGestureDetectorOnScaleGestureListenerC21656519pD scaleGestureDetectorOnScaleGestureListenerC21656519pD = this.LLJL;
        if (scaleGestureDetectorOnScaleGestureListenerC21656519pD == null) {
            scaleGestureDetectorOnScaleGestureListenerC21656519pD = null;
        }
        c1120000fFe.LIZIZ(scaleGestureDetectorOnScaleGestureListenerC21656519pD);
        C1120000fFe c1120000fFe2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe2 == null) {
            c1120000fFe2 = null;
        }
        ScaleGestureDetectorOnScaleGestureListenerC21656519pD scaleGestureDetectorOnScaleGestureListenerC21656519pD2 = this.LLJLIL;
        if (scaleGestureDetectorOnScaleGestureListenerC21656519pD2 == null) {
            scaleGestureDetectorOnScaleGestureListenerC21656519pD2 = null;
        }
        c1120000fFe2.LIZIZ(scaleGestureDetectorOnScaleGestureListenerC21656519pD2);
        C1120000fFe c1120000fFe3 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe3 == null) {
            c1120000fFe3 = null;
        }
        C780820Uk4 c780820Uk4 = this.LLJLL;
        if (c780820Uk4 == null) {
            c780820Uk4 = null;
        }
        c1120000fFe3.LIZIZ(c780820Uk4);
        C1120000fFe c1120000fFe4 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe4 == null) {
            c1120000fFe4 = null;
        }
        C0UKN c0ukn = this.LLJLILLLLZIIL;
        if (c0ukn == null) {
            c0ukn = null;
        }
        c1120000fFe4.LIZIZ(c0ukn);
        C1120000fFe c1120000fFe5 = this.LLJJLIIIJLLLLLLLZ;
        if (c1120000fFe5 == null) {
            c1120000fFe5 = null;
        }
        C782430Umf c782430Umf = this.LLJLLIL;
        if (c782430Umf == null) {
            c782430Umf = null;
        }
        c1120000fFe5.LIZIZ(c782430Umf);
        C782390Umb c782390Umb2 = this.LLJJJJ;
        if (c782390Umb2 != null) {
            c782390Umb2.setGestureDetectLayout(this.LLJJJJJIL);
        }
        if (((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).usingSlideGestureEffect()) {
            DataChannel dataChannel16 = this.LLJJIJI;
            if (dataChannel16 == null) {
                dataChannel16 = null;
            }
            dataChannel16.SX0(C768940UEi.class, Boolean.TRUE);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_practice_enter_success");
        DataChannel dataChannel17 = this.LLJJIJI;
        if (dataChannel17 == null) {
            dataChannel17 = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel17);
        c474500IjALIZ.LIZ();
        Context context9 = getContext();
        if (context9 != null) {
            c0ukk = new C0UKK(context9);
        } else {
            c0ukk = null;
        }
        this.LLJILJILJ = c0ukk;
        if (c0ukk != null) {
            DataChannel dataChannel18 = this.LLJJIJI;
            if (dataChannel18 == null) {
                dataChannel18 = null;
            }
            c0ukk.setDataChannel(dataChannel18);
        }
        this.LLJILLL = (C1083340eIW) view;
        if (LiveExposureOptSetting.INSTANCE.enable()) {
            viewGroup = this.LLJJJJJIL;
        } else {
            viewGroup = this.LLJILLL;
        }
        if (viewGroup != null) {
            viewGroup.addView(this.LLJILJILJ, new ViewGroup.LayoutParams(-1, -1));
        }
        C0UKN c0ukn2 = this.LLJLILLLLZIIL;
        if (c0ukn2 == null) {
            c0ukn2 = null;
        }
        c0ukn2.LLJILJILJ = new C0UKO() { // from class: X.0UKM
            /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
            @Override // X.C0UKO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> LIZ() {
                /*
                    r5 = this;
                    com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting.INSTANCE
                    boolean r0 = r0.enable()
                    r2 = 1125384192(0x43140000, float:148.0)
                    r4 = 1136459776(0x43bd0000, float:378.0)
                    if (r0 == 0) goto L41
                    android.view.View r1 = r1
                    r0 = 2131372110(0x7f0a284e, float:1.8364274E38)
                    android.view.View r0 = r1.findViewById(r0)
                    if (r0 == 0) goto L3b
                    int r1 = r0.getTop()
                L1b:
                    com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment r0 = r2
                    X.0ej6 r0 = r0.OR()
                    if (r0 == 0) goto L35
                    int r0 = r0.getTop()
                L27:
                    kotlin.Pair r2 = new kotlin.Pair
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r2.<init>(r1, r0)
                    return r2
                L35:
                    float r0 = X.C497740JfY.LIZIZ(r4)
                    int r0 = (int) r0
                    goto L27
                L3b:
                    float r0 = X.C497740JfY.LIZIZ(r2)
                    int r1 = (int) r0
                    goto L1b
                L41:
                    float r0 = X.C497740JfY.LIZIZ(r2)
                    int r1 = (int) r0
                    android.view.View r0 = r1
                    int r3 = r0.getHeight()
                    java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
                    X.006A r0 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
                    boolean r0 = r0.w9()
                    if (r0 != 0) goto L8f
                    java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
                    X.006A r2 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.live.liveinteract.api.IInteractService r2 = (com.bytedance.android.live.liveinteract.api.IInteractService) r2
                    boolean r0 = r2.ib2()
                    if (r0 != 0) goto L8f
                    boolean r0 = r2.o1()
                    if (r0 != 0) goto L8f
                    com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment r0 = r2
                    X.0ej6 r0 = r0.OR()
                    if (r0 == 0) goto L89
                    int r0 = r0.getTop()
                L7a:
                    int r3 = r3 - r0
                L7b:
                    kotlin.Pair r2 = new kotlin.Pair
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                    r2.<init>(r1, r0)
                    return r2
                L89:
                    float r0 = X.C497740JfY.LIZIZ(r4)
                    int r0 = (int) r0
                    goto L7a
                L8f:
                    com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment r0 = r2
                    X.0ej6 r0 = r0.OR()
                    if (r0 == 0) goto La5
                    int r0 = r0.getTop()
                L9b:
                    int r3 = r3 - r0
                    r0 = 1109393408(0x42200000, float:40.0)
                    float r0 = X.C497740JfY.LIZIZ(r0)
                    int r0 = (int) r0
                    int r3 = r3 + r0
                    goto L7b
                La5:
                    float r0 = X.C497740JfY.LIZIZ(r4)
                    int r0 = (int) r0
                    goto L9b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0UKM.LIZ():kotlin.Pair");
            }

            @Override // X.C0UKO
            public final void LIZIZ() {
                C0UKK c0ukk2 = this.LLJILJILJ;
                if (c0ukk2 != null) {
                    c0ukk2.LIZIZ();
                }
            }

            @Override // X.C0UKO
            public final void LIZJ(boolean z) {
                if (z) {
                    C0UKK c0ukk2 = this.LLJILJILJ;
                    if (c0ukk2 != null) {
                        c0ukk2.LJI();
                        return;
                    }
                    return;
                }
                C0UKK c0ukk3 = this.LLJILJILJ;
                if (c0ukk3 == null) {
                    return;
                }
                c0ukk3.LJFF();
            }

            @Override // X.C0UKO
            public final void LIZLLL(int i7) {
                C780540Ujc c780540Ujc;
                C0UKK c0ukk2 = this.LLJILJILJ;
                if (c0ukk2 != null && (c780540Ujc = c0ukk2.LLJ) != null) {
                    c780540Ujc.LJI(i7);
                }
            }
        };
        this.LLJZ = InterfaceC1106030et7.E4.LIZIZ().booleanValue();
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        DataChannel dataChannel19 = this.LLJJIJI;
        if (dataChannel19 == null) {
            dataChannel19 = null;
        }
        Room room2 = this.LLJJIJIL;
        if (room2 == null) {
            room2 = null;
        }
        iRoomFunctionServiceLJIL.oe1(this, room2, dataChannel19);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C751410Tdj(this, null), 3);
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        Handler handlerLIZ = C0IK5.LIZ();
        C0UX8 c0ux8 = C0UX8.EVENT_PAGE_TRY_MODE_BROADCAST;
        DataChannel dataChannel20 = this.LLJJIJI;
        if (dataChannel20 == null) {
            dataChannel20 = null;
        }
        C1113800f5e.LJIIJJI(handlerLIZ, c0ux8, dataChannel20);
        IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
        Room room3 = this.LLJJIJIL;
        if (room3 == null) {
            room3 = null;
        }
        InterfaceC1085480eLy interfaceC1085480eLyO41 = iBarrageService.O41(room3.getId());
        if (interfaceC1085480eLyO41 != null) {
            ArrayList<C0RT0> arrayList = new ArrayList();
            View view3 = this.LLILLL;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.sfs);
                }
                this.LLILLL = (C0RT0) viewFindViewById;
                view3 = viewFindViewById;
            }
            arrayList.add(view3);
            interfaceC1085480eLyO41.LJIILIIL(arrayList);
            for (C0RT0 c0rt0 : arrayList) {
                if (c0rt0 != null && (onTouchListenerLJJ = interfaceC1085480eLyO41.LJJ()) != null) {
                    c0rt0.LL.add(onTouchListenerLJJ);
                }
            }
        }
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Tj2(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        boolean z;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.ggo, viewGroup, false, null, false, 60);
        DataChannel dataChannel = this.LLJJIJI;
        C19GS c19gs = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C1085570eM7 c1085570eM7 = new C1085570eM7(dataChannel);
        this.LLJLLL = c1085570eM7;
        c1085570eM7.LIZ(viewLJFF, getViewLifecycleOwner());
        if (LiveBroadcastTnsSafetyTools.enableSolutionA()) {
            Bundle arguments = getArguments();
            boolean z2 = true;
            if (arguments != null && arguments.getBoolean("start_practice_mode_from_practice_live", false)) {
                z = true;
            } else {
                z = false;
            }
            DataChannel dataChannel2 = this.LLJJIJI;
            if (dataChannel2 == null) {
                dataChannel2 = null;
            }
            if (!z || InterfaceC772600USk.zf.LIZIZ().booleanValue()) {
                z2 = false;
            }
            dataChannel2.SX0(C750140Tbg.class, Boolean.valueOf(z2));
        } else {
            DataChannel dataChannel3 = this.LLJJIJI;
            if (dataChannel3 == null) {
                dataChannel3 = null;
            }
            dataChannel3.SX0(C750140Tbg.class, Boolean.FALSE);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C20337914i1<Boolean> c20337914i1 = InterfaceC772600USk.zf;
        if (c20337914i1.LIZIZ().booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        dataChannelGlobal.JQ2(C930990aKn.class, str);
        c20337914i1.LJFF(Boolean.TRUE);
        ILinkMicInteractAbilityService iLinkMicInteractAbilityService = (ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class);
        DataChannel dataChannel4 = this.LLJJIJI;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        iLinkMicInteractAbilityService.Ub0(dataChannel4);
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
