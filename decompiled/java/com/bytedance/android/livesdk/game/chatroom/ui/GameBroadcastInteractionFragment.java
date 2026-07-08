package com.bytedance.android.livesdk.game.chatroom.ui;

import X.AbstractC1120020fFg;
import X.AbstractC781140Uka;
import X.C01GW;
import X.C01SL;
import X.C098200Yq;
import X.C0IGR;
import X.C0J1N;
import X.C0TFB;
import X.C0UKP;
import X.C0UKU;
import X.C1082040eGQ;
import X.C1082080eGU;
import X.C1083340eIW;
import X.C1100290ejr;
import X.C1161920gLG;
import X.C11RD;
import X.C1685300txQ;
import X.C16FZ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C437170HCh;
import X.C452501pT;
import X.C486790J7d;
import X.C500260Jjc;
import X.C775000Uag;
import X.C775010Uah;
import X.C780640Ujm;
import X.C781010UkN;
import X.C782340UmW;
import X.C784410Upr;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1102750enp;
import X.InterfaceC466590IRl;
import X.InterfaceC780650Ujn;
import X.InterfaceC781090UkV;
import X.InterfaceC784190UpV;
import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.broadcast.api.NetworkStatusV3;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatus;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.chatroom.layer.GameLayeredElementManager;
import com.bytedance.android.livesdk.game.chatroom.widget.ScreenRecordStatusWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameCaptchaEnabledSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptimizeEffectGestureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameNetworkSpeedMonitorOptSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS55S0001000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameBroadcastInteractionFragment extends BaseFragment implements InterfaceC781090UkV, C0IGR {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGEwICQ4OyHELIOSA8JWs5IGEUKSgpCz08KSEvKDwnASs4LD0yKzElJiEVOiQrJCo9PA==";
    public C782340UmW LL;
    public C784410Upr LLILLJJLI;
    public C16FZ LLILLL;
    public C1100290ejr LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public ScreenRecordStatusWidget LLIZ;
    public DataChannel LLIZLLLIL;
    public InterfaceC780650Ujn LLJ;
    public RecyclableWidgetManager LLJI;
    public C781010UkN LLJIJIL;
    public Room LLJILJIL;
    public AbstractC781140Uka LLJILJILJ;
    public LiveRecyclableWidget LLJILLL;
    public C0UKU LLJJ;
    public AbstractC1120020fFg LLJJI;
    public Runnable LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C780640Ujm LLJJJ;

    @Override // X.InterfaceC781090UkV
    public final void EP(RemindMessage remindMessage) {
    }

    @Override // X.InterfaceC781090UkV
    public final BaseFragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC781090UkV
    public final void Hu() {
        PR(this.LLJJIII);
    }

    public final RecyclableWidgetManager NR() {
        RecyclableWidgetManager recyclableWidgetManager = this.LLJI;
        if (recyclableWidgetManager != null) {
            return recyclableWidgetManager;
        }
        return null;
    }

    public final C784410Upr OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q32) : null;
            this.LLILLJJLI = (C784410Upr) viewFindViewById;
        }
        return (C784410Upr) viewFindViewById;
    }

    @Override // X.InterfaceC781090UkV
    public final void Xp() {
        C781010UkN c781010UkN = this.LLJIJIL;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        c781010UkN.LIZIZ();
    }

    @Override // X.InterfaceC781090UkV
    public final void gf() {
        LiveWidget shortCutPanelWidget;
        IBroadcastService iBroadcastService;
        LiveWidget liveWidgetCreateLiveCenterEntranceTopNoticeWidget;
        Room room = this.LLJILJIL;
        if (room == null) {
            room = null;
        }
        this.LLIZ = new ScreenRecordStatusWidget(room, (String) this.LLJJIJIL.getValue(), false, true, null, 20);
        NR().load(R.id.n7f, this.LLIZ);
        RecyclableWidgetManager recyclableWidgetManagerNR = NR();
        IBroadcastService iBroadcastService2 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q3y) : null;
            this.LLILZIL = viewFindViewById;
        }
        recyclableWidgetManagerNR.load(R.id.q41, iBroadcastService2.createPauseLiveWidget(viewFindViewById));
        RecyclableWidgetManager recyclableWidgetManagerNR2 = NR();
        IToolbarService iToolbarService = (IToolbarService) C1161920gLG.LIZJ(IToolbarService.class);
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        recyclableWidgetManagerNR2.load(R.id.y6v, iToolbarService.bP2(null, dataChannel), false);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).registerLiveGoalBehavior();
        if (this.LLJI != null) {
            Room room2 = this.LLJILJIL;
            if (room2 == null) {
                room2 = null;
            }
            if (C01SL.LIZ(room2)) {
                NR().load(R.id.iqu, ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).bV0(), true, new C1082040eGQ[]{new C1082040eGQ(true, false)});
            }
        }
        NR().load(R.id.mut, ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveCenterEntranceWidget());
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable() && (iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)) != null && (liveWidgetCreateLiveCenterEntranceTopNoticeWidget = iBroadcastService.createLiveCenterEntranceTopNoticeWidget()) != null) {
            NR().load(R.id.mvk, liveWidgetCreateLiveCenterEntranceTopNoticeWidget);
        }
        this.LLJILLL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createGameLiveNetSpeedMonitorWidget();
        NR().load(R.id.p4x, this.LLJILLL);
        IBroadcastService iBroadcastService3 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService3 != null && (shortCutPanelWidget = iBroadcastService3.getShortCutPanelWidget()) != null) {
            NR().load(R.id.v9b, shortCutPanelWidget);
        }
        NR().load(R.id.n7j, ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).XB0());
        if (LiveGameCaptchaEnabledSetting.INSTANCE.isEnabled()) {
            IBroadcastService iBroadcastService4 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            View viewFindViewById2 = this.LLILZLL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                viewFindViewById2 = view2 != null ? view2.findViewById(R.id.dc4) : null;
                this.LLILZLL = viewFindViewById2;
            }
            Widget widgetCreateCaptchaLiveWidget = iBroadcastService4.createCaptchaLiveWidget(viewFindViewById2);
            if (widgetCreateCaptchaLiveWidget != null) {
                NR().load(R.id.dc5, widgetCreateCaptchaLiveWidget);
            }
        }
        if (this.LLJJIJIIJIL) {
            IBroadcastService iBroadcastService5 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            DataChannel dataChannel2 = this.LLIZLLLIL;
            iBroadcastService5.setGoLiveFullChainLogParams(2, dataChannel2 != null ? dataChannel2 : null, 0);
            this.LLJJIJIIJIL = false;
        }
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        InterfaceC780650Ujn interfaceC780650Ujn = this.LLJ;
        if (interfaceC780650Ujn == null) {
            interfaceC780650Ujn = null;
        }
        return interfaceC780650Ujn.onBackPressed();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC466590IRl liveAudioDevicesDetector;
        C780640Ujm c780640Ujm = this.LLJJJ;
        if (c780640Ujm != null) {
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(c780640Ujm);
            this.LLJJJ = null;
        }
        super.onDestroy();
        InterfaceC780650Ujn interfaceC780650Ujn = this.LLJ;
        if (interfaceC780650Ujn != null) {
            interfaceC780650Ujn.onDestroy();
        }
        C0UKU c0uku = this.LLJJ;
        if (c0uku != null) {
            c0uku.LIZJ(this.LLJJI);
        }
        if (this.LLJI != null) {
            C1082080eGU.LIZIZ(NR());
        }
        C1082080eGU.LJFF(4);
        if (!OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable() || (liveAudioDevicesDetector = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveAudioDevicesDetector()) == null) {
            return;
        }
        ((LiveAudioDevicesDetector) liveAudioDevicesDetector).LIZ();
    }

    public GameBroadcastInteractionFragment() {
        new WidgetCreateTimeUtil(null);
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(131));
    }

    @Override // X.InterfaceC781090UkV
    public final C784410Upr LLLLJI() {
        return OR();
    }

    @Override // X.InterfaceC781090UkV
    public final void SF() {
        C19EG activity = getActivity();
        if (activity != null) {
            Room room = this.LLJILJIL;
            if (room == null) {
                room = null;
            }
            User owner = room.getOwner();
            if (owner == null || owner.getSecret() != 1) {
                EnumC1102750enp enumC1102750enp = EnumC1102750enp.SHARE;
                DataChannel dataChannel = this.LLIZLLLIL;
                if (dataChannel == null) {
                    dataChannel = null;
                }
                IShareService iShareService = (IShareService) C1161920gLG.LIZJ(IShareService.class);
                Context context = getContext();
                LiveMode liveMode = LiveMode.SCREEN_RECORD;
                enumC1102750enp.load(dataChannel, iShareService.K72(activity, context, liveMode, this));
                EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.SHARE_IN_MORE;
                DataChannel dataChannel2 = this.LLIZLLLIL;
                if (dataChannel2 == null) {
                    dataChannel2 = null;
                }
                enumC1102750enp2.load(dataChannel2, ((IShareService) C1161920gLG.LIZJ(IShareService.class)).K72(activity, getContext(), liveMode, this));
            } else {
                EnumC1102750enp enumC1102750enp3 = EnumC1102750enp.SHARE;
                DataChannel dataChannel3 = this.LLIZLLLIL;
                if (dataChannel3 == null) {
                    dataChannel3 = null;
                }
                enumC1102750enp3.load(dataChannel3, ((IShareService) C1161920gLG.LIZJ(IShareService.class)).Xg0());
                EnumC1102750enp enumC1102750enp4 = EnumC1102750enp.SHARE_IN_MORE;
                DataChannel dataChannel4 = this.LLIZLLLIL;
                if (dataChannel4 == null) {
                    dataChannel4 = null;
                }
                enumC1102750enp4.load(dataChannel4, ((IShareService) C1161920gLG.LIZJ(IShareService.class)).Xg0());
            }
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        DataChannel dataChannel5 = this.LLIZLLLIL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        iBroadcastService.loadPauseLiveButton(dataChannel5);
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        DataChannel dataChannel6 = this.LLIZLLLIL;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        iRoomFunctionService.ZH(dataChannel6);
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        DataChannel dataChannel7 = this.LLIZLLLIL;
        if (dataChannel7 == null) {
            dataChannel7 = null;
        }
        Room room2 = this.LLJILJIL;
        if (room2 == null) {
            room2 = null;
        }
        iGamePartnershipService.tm0(dataChannel7, Long.valueOf(room2.getId()));
        Room room3 = this.LLJILJIL;
        if (room3 == null) {
            room3 = null;
        }
        if (C01SL.LIZ(room3)) {
            IGamePartnershipService iGamePartnershipService2 = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
            DataChannel dataChannel8 = this.LLIZLLLIL;
            if (dataChannel8 == null) {
                dataChannel8 = null;
            }
            Room room4 = this.LLJILJIL;
            if (room4 == null) {
                room4 = null;
            }
            iGamePartnershipService2.kr1(room4.getId(), dataChannel8);
        }
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            EnumC1102750enp enumC1102750enp5 = EnumC1102750enp.DUAL_DEVICE;
            DataChannel dataChannel9 = this.LLIZLLLIL;
            enumC1102750enp5.load(dataChannel9 != null ? dataChannel9 : null, new C0TFB());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C781010UkN c781010UkN = this.LLJIJIL;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        DialogInterface dialogInterface = c781010UkN.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        InterfaceC780650Ujn interfaceC780650Ujn = this.LLJ;
        if (interfaceC780650Ujn == null) {
            interfaceC780650Ujn = null;
        }
        interfaceC780650Ujn.onDestroyView();
        this.LLJJIII = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJIJI) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            iBroadcastService.setGoLiveFullChainLogParams(1, dataChannel, 0);
            this.LLJJIJI = false;
        }
    }

    @Override // X.InterfaceC781090UkV
    public final void LLLLIILL(int i) {
        if (SettingsManager.INSTANCE.getBooleanValue("live_anchor_status_diagnostics_enable", true)) {
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(NetworkStatusV3.class, Integer.valueOf(i));
        }
    }

    public final void PR(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LLJJIII = null;
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS112S0100000_12(runnable, 136));
                return;
            }
            return;
        }
        this.LLJJIII = runnable;
    }

    @Override // X.InterfaceC781090UkV
    public final void ZD(int i) {
        if (TtliveGameNetworkSpeedMonitorOptSetting.INSTANCE.useTTNet()) {
            return;
        }
        DataChannel dataChannel = this.LLIZLLLIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(NetworkStatus.class, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Ujm] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        InterfaceC780650Ujn interfaceC780650Ujn = this.LLJ;
        if (interfaceC780650Ujn == null) {
            interfaceC780650Ujn = null;
        }
        interfaceC780650Ujn.LIZIZ(bundle);
        if (TtliveGameNetworkSpeedMonitorOptSetting.INSTANCE.useTTNet()) {
            this.LLJJJ = new InterfaceC784190UpV() { // from class: X.0Ujm
                @Override // X.InterfaceC784190UpV
                public final void LIZ(EnumC784160UpS enumC784160UpS) {
                    int i;
                    if (enumC784160UpS == null) {
                        i = -1;
                    } else {
                        i = C784140UpQ.LIZ[enumC784160UpS.ordinal()];
                    }
                    int i2 = 1;
                    if (i != 1) {
                        if (i == 2) {
                            i2 = 2;
                        }
                    } else {
                        i2 = 3;
                    }
                    DataChannel dataChannel = this.LIZ.LLIZLLLIL;
                    if (dataChannel == null) {
                        dataChannel = null;
                    }
                    dataChannel.zW(NetworkStatus.class, Integer.valueOf(i2));
                    C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                    AwS55S0001000_12 awS55S0001000_12 = new AwS55S0001000_12(i2, 6);
                    c1276840jKc.getClass();
                    C1276840jKc.LJJJJJ = awS55S0001000_12;
                    Map<String, Object> map = C1338270kvh.LIZ;
                }
            };
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(this.LLJJJ);
        }
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(this, 135), null, 2000L);
        }
    }

    public final void onEvent(C775000Uag c775000Uag) {
        int i = c775000Uag.LIZ;
        View viewFindViewById = null;
        if (i != 0) {
            if (i == 1) {
                View viewFindViewById2 = this.LLILLL;
                if (viewFindViewById2 == null) {
                    View view = getView();
                    if (view != null) {
                        viewFindViewById2 = view.findViewById(R.id.nmp);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILLL = (C16FZ) viewFindViewById2;
                }
                C786410Ut5.LLLIZZ((C16FZ) viewFindViewById2, 8);
                ScreenRecordStatusWidget screenRecordStatusWidget = this.LLIZ;
                if (screenRecordStatusWidget != null) {
                    screenRecordStatusWidget.LLJI = true;
                    screenRecordStatusWidget.show();
                    return;
                }
                View view2 = this.LLILZ;
                if (view2 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById = view3.findViewById(R.id.n7f);
                    }
                    this.LLILZ = (C1100290ejr) viewFindViewById;
                    view2 = viewFindViewById;
                }
                C500260Jjc.LLFFF(view2);
                return;
            }
            return;
        }
        ScreenRecordStatusWidget screenRecordStatusWidget2 = this.LLIZ;
        if (screenRecordStatusWidget2 != null) {
            screenRecordStatusWidget2.LLJI = false;
            screenRecordStatusWidget2.hide();
        } else {
            View viewFindViewById3 = this.LLILZ;
            if (viewFindViewById3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById3 = view4.findViewById(R.id.n7f);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZ = (C1100290ejr) viewFindViewById3;
            }
            C500260Jjc.LJIILIIL(viewFindViewById3);
        }
        View view5 = this.LLILLL;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById = view6.findViewById(R.id.nmp);
            }
            this.LLILLL = (C16FZ) viewFindViewById;
            view5 = viewFindViewById;
        }
        C786410Ut5.LLLIZZ((C16FZ) view5, 0);
    }

    @Override // X.InterfaceC781090UkV
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0UKU c0uku = this.LLJJ;
        if (c0uku != null) {
            return c0uku.LIZ(motionEvent, new C0UKP(OR().getWidth(), OR().getHeight(), OR().getTop(), OR().getLeft()), null);
        }
        return false;
    }

    @Override // X.InterfaceC781090UkV
    public final void I1(int i, int i2) {
        if (SettingsManager.INSTANCE.getBooleanValue("live_anchor_status_diagnostics_enable", true)) {
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.LC0(BroadcastAudioStatus.class, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public final void RR(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLIZLLLIL = dataChannel;
        this.LLJILJILJ = abstractC781140Uka;
        this.LLJILJIL = (Room) dataChannel.gg0(RoomChannel.class);
        dataChannel.zW(LiveModeChannel.class, LiveMode.SCREEN_RECORD);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initGiftResourceManager(getContext());
        Context context = getContext();
        C1083340eIW c1083340eIW = (C1083340eIW) view;
        DataChannel dataChannel = this.LLIZLLLIL;
        DataChannel dataChannel2 = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        LayeredWidgetManager layeredWidgetManagerOf = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C486790J7d.LIZ, new GameLayeredElementManager(context, this, c1083340eIW, dataChannel));
        layeredWidgetManagerOf.setCheckContentViewAttached(true);
        this.LLJI = layeredWidgetManagerOf;
        C1082080eGU.LJI(4, NR());
        C1082080eGU.LIZ(4, NR());
        if (C775010Uah.LIZ == 1) {
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.nmp);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (C16FZ) viewFindViewById;
            }
            C786410Ut5.LLLIZZ((C16FZ) viewFindViewById, 8);
            ScreenRecordStatusWidget screenRecordStatusWidget = this.LLIZ;
            if (screenRecordStatusWidget != null) {
                screenRecordStatusWidget.LLJI = true;
                screenRecordStatusWidget.show();
            } else {
                View viewFindViewById2 = this.LLILZ;
                if (viewFindViewById2 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById2 = view3.findViewById(R.id.n7f);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILZ = (C1100290ejr) viewFindViewById2;
                }
                C500260Jjc.LLFFF(viewFindViewById2);
            }
        } else {
            ScreenRecordStatusWidget screenRecordStatusWidget2 = this.LLIZ;
            if (screenRecordStatusWidget2 != null) {
                screenRecordStatusWidget2.LLJI = false;
                screenRecordStatusWidget2.hide();
            } else {
                View viewFindViewById3 = this.LLILZ;
                if (viewFindViewById3 == null) {
                    View view4 = getView();
                    if (view4 != null) {
                        viewFindViewById3 = view4.findViewById(R.id.n7f);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLILZ = (C1100290ejr) viewFindViewById3;
                }
                C500260Jjc.LJIILIIL(viewFindViewById3);
            }
            View viewFindViewById4 = this.LLILLL;
            if (viewFindViewById4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById4 = view5.findViewById(R.id.nmp);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILLL = (C16FZ) viewFindViewById4;
            }
            C786410Ut5.LLLIZZ((C16FZ) viewFindViewById4, 0);
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C775000Uag.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS181S0100000_12(this, 253));
        InterfaceC780650Ujn interfaceC780650UjnCreateCommonInteractionFunctionHelper = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createCommonInteractionFunctionHelper(getContext(), this, this, view, NR());
        DataChannel dataChannel3 = this.LLIZLLLIL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        AbstractC781140Uka abstractC781140Uka = this.LLJILJILJ;
        if (abstractC781140Uka == null) {
            abstractC781140Uka = null;
        }
        interfaceC780650UjnCreateCommonInteractionFunctionHelper.LIZ(dataChannel3, abstractC781140Uka);
        interfaceC780650UjnCreateCommonInteractionFunctionHelper.onViewCreated(view, bundle);
        this.LLJ = interfaceC780650UjnCreateCommonInteractionFunctionHelper;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        Room room = this.LLJILJIL;
        if (room == null) {
            room = null;
        }
        Context context2 = getContext();
        DataChannel dataChannel4 = this.LLIZLLLIL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        C781010UkN c781010UkN = (C781010UkN) iBroadcastService.createLongPressHelper(room, this, view, context2, dataChannel4);
        c781010UkN.LIZ();
        this.LLJIJIL = c781010UkN;
        View viewFindViewById5 = this.LL;
        if (viewFindViewById5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById5 = view6.findViewById(R.id.ir3);
            } else {
                viewFindViewById5 = null;
            }
            this.LL = (C782340UmW) viewFindViewById5;
        }
        C782340UmW c782340UmW = (C782340UmW) viewFindViewById5;
        DataChannel dataChannel5 = this.LLIZLLLIL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        c782340UmW.setDataChannel(dataChannel5);
        View viewFindViewById6 = this.LL;
        if (viewFindViewById6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById6 = view7.findViewById(R.id.ir3);
            } else {
                viewFindViewById6 = null;
            }
            this.LL = (C782340UmW) viewFindViewById6;
        }
        ((C782340UmW) viewFindViewById6).setGestureDetectLayout(OR());
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportCameraFirstShow();
        IBroadcastService iBroadcastService2 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        DataChannel dataChannel6 = this.LLIZLLLIL;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        this.LLJJ = iBroadcastService2.getBroadcastGestureDetector(dataChannel6);
        IBroadcastService iBroadcastService3 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        Context context3 = getContext();
        DataChannel dataChannel7 = this.LLIZLLLIL;
        if (dataChannel7 != null) {
            dataChannel2 = dataChannel7;
        }
        if (OptimizeEffectGestureSetting.INSTANCE.enable()) {
            i = 5;
        } else {
            i = 3;
        }
        AbstractC1120020fFg otherGestureDetector = iBroadcastService3.getOtherGestureDetector(context3, dataChannel2, i, this, OR());
        this.LLJJI = otherGestureDetector;
        C0UKU c0uku = this.LLJJ;
        if (c0uku != null) {
            c0uku.LIZIZ(otherGestureDetector);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC780650Ujn interfaceC780650Ujn = this.LLJ;
        if (interfaceC780650Ujn == null) {
            interfaceC780650Ujn = null;
        }
        interfaceC780650Ujn.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ggm, viewGroup, false);
        C437170HCh.LIZ(viewTd, this);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
