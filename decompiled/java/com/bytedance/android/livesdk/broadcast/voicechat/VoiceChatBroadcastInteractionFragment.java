package com.bytedance.android.livesdk.broadcast.voicechat;

import X.AbstractC1120020fFg;
import X.AbstractC781140Uka;
import X.C01GW;
import X.C098200Yq;
import X.C0IGR;
import X.C0IJ7;
import X.C0IK5;
import X.C0J3Y;
import X.C0UF1;
import X.C0UKP;
import X.C1083340eIW;
import X.C1120000fFe;
import X.C1152720g6Q;
import X.C1161920gLG;
import X.C162100jj;
import X.C1685300txQ;
import X.C16F5;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C465520INi;
import X.C486790J7d;
import X.C500260Jjc;
import X.C766720U5u;
import X.C768620UDc;
import X.C779730UiJ;
import X.C780570Ujf;
import X.C780610Ujj;
import X.C780820Uk4;
import X.C780980UkK;
import X.C781010UkN;
import X.C781270Ukn;
import X.C782140UmC;
import X.C782390Umb;
import X.C782430Umf;
import X.C784410Upr;
import X.C786410Ut5;
import X.EnumC1102750enp;
import X.InterfaceC357101a5;
import X.InterfaceC777420Uea;
import X.InterfaceC781090UkV;
import X.InterfaceC784190UpV;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.broadcast.api.NetworkStatusV3;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.broadcast.StartLiveEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.broadcast.video.layer.VideoLayeredElementManager;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.comp.api.decoration.ILiveEventStickerService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.dataChannel.BaseSingleTapEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatus;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorDebugInfoSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastNetworkSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class VoiceChatBroadcastInteractionFragment extends BaseFragment implements InterfaceC781090UkV, C0IGR {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zzk8ISHELIOSYpKicyPGsaJiYwLQYkKDsROiotLSwyOzEFJzs2OiQvPSY8JgM+KCg+LSs4";
    public FrameLayout LL;
    public C784410Upr LLILLJJLI;
    public C16F5 LLILLL;
    public C1083340eIW LLILZ;
    public View LLILZIL;
    public C780980UkK LLILZLL;
    public LayeredWidgetManager LLIZ;
    public C784410Upr LLIZLLLIL;
    public C782390Umb LLJ;
    public C1120000fFe LLJI;
    public C780570Ujf LLJIJIL;
    public C780820Uk4 LLJILJIL;
    public C782430Umf LLJILJILJ;
    public DataChannel LLJILLL;
    public C781010UkN LLJJI;
    public AbstractC781140Uka LLJJIII;
    public NetSpeedMonitorWidget LLJJIJI;
    public Room LLJJIJIL;
    public AbsVoiceChatControlWidget LLJJJIL;
    public C780610Ujj LLJJJJ;
    public final C01GW LLJJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(102));
    public final AtomicBoolean LLJJIJIIJIL = new AtomicBoolean(false);
    public final C01GW LLJJJ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(103));

    @Override // X.InterfaceC781090UkV
    public final void EP(RemindMessage remindMessage) {
    }

    @Override // X.InterfaceC781090UkV
    public final void Hu() {
    }

    @Override // X.InterfaceC781090UkV
    public final void ZD(int i) {
    }

    @Override // X.InterfaceC781090UkV
    public final BaseFragment getFragment() {
        return this;
    }

    public final ValueAnimator NR() {
        return (ValueAnimator) this.LLJJ.getValue();
    }

    public final C16F5 OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cjx) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final FrameLayout PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kvo) : null;
            this.LL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1083340eIW RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q32) : null;
            this.LLILZ = (C1083340eIW) viewFindViewById;
        }
        return (C1083340eIW) viewFindViewById;
    }

    @Override // X.InterfaceC781090UkV
    public final void Xp() {
        C781010UkN c781010UkN = this.LLJJI;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        c781010UkN.LIZIZ();
    }

    @Override // X.InterfaceC781090UkV
    public final void gf() {
        LayeredWidgetManager layeredWidgetManager = this.LLIZ;
        if (layeredWidgetManager == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VoiceChatBroadcastInteractionFragment");
            sbLIZ.append("_prepareChildWidgets return as widgetManager is null");
            C20441214yg.LIZIZ("voice_chat", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LiveGiftPollEffectWidget liveGiftPollEffectWidgetSQ2 = C781270Ukn.LJIL().sQ2();
        LiveNormalPollEffectWidget liveNormalPollEffectWidgetYe0 = C781270Ukn.LJIL().ye0(true, layeredWidgetManager);
        if (liveNormalPollEffectWidgetYe0 != null) {
            layeredWidgetManager.load(R.id.n2m, liveNormalPollEffectWidgetYe0);
        }
        if (liveGiftPollEffectWidgetSQ2 != null) {
            layeredWidgetManager.load(R.id.myj, liveGiftPollEffectWidgetSQ2);
        }
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, StartPushStreamChannel.class, new AwS591S0100000_12(this, 1155));
        }
        DataChannel dataChannel2 = this.LLJILLL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, LiveCenterAlpha.class, new AwS591S0100000_12(this, 1156));
            dataChannel2.BQ2(this, LiveCenterStatusChannel.class, new AwS591S0100000_12(this, 1157));
        }
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dc4) : null;
            this.LLILZIL = viewFindViewById;
        }
        layeredWidgetManager.load(R.id.dc5, new CaptchaLiveWidget(viewFindViewById));
        if (C162100jj.LIZIZ(this.LLJILLL)) {
            ((IQAService) C1161920gLG.LIZJ(IQAService.class)).y02();
        }
        LayeredWidgetManager layeredWidgetManager2 = this.LLIZ;
        if (layeredWidgetManager2 != null) {
            layeredWidgetManager2.load(R.id.ez2, new BroadcastCountDownWidget(new InterfaceC357101a5() { // from class: X.0Ujp
                @Override // X.InterfaceC357101a5
                public final void LIZ() {
                    DataChannel dataChannel3;
                    VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = this.LIZ;
                    if (voiceChatBroadcastInteractionFragment.LLJJIJIIJIL.get() || (dataChannel3 = voiceChatBroadcastInteractionFragment.LLJILLL) == null) {
                        return;
                    }
                    dataChannel3.FQ2(StartLiveEvent.class);
                }
            }));
        }
        layeredWidgetManager.load(R.id.mut, new LiveCenterEntranceWidget());
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            layeredWidgetManager.load(R.id.mvk, new LiveCenterTopNoticeWidget());
        }
        if (this.LLJJIJI == null) {
            NetSpeedMonitorWidget netSpeedMonitorWidget = new NetSpeedMonitorWidget();
            this.LLJJIJI = netSpeedMonitorWidget;
            layeredWidgetManager.load(R.id.p4x, netSpeedMonitorWidget);
        }
        DataChannel dataChannel3 = this.LLJILLL;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIIL(dataChannel3);
        DataChannel dataChannel4 = this.LLJILLL;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIIJJI(dataChannel4);
        layeredWidgetManager.load(R.id.n5o, ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).n50());
        layeredWidgetManager.load(R.id.n7j, ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).XB0());
        layeredWidgetManager.load(R.id.mxm, ((ILiveEventStickerService) C1161920gLG.LIZJ(ILiveEventStickerService.class)).kS(true));
        C0IK5.LIZIZ(this.LLJILLL, new ARunnableS81S0200000_12(this, layeredWidgetManager, 149));
        layeredWidgetManager.load(R.id.v9b, new ShortCutPanelWidget());
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).registerLiveGoalBehavior();
        DataChannelGlobal.LLILZ.BQ2(this, this, OpenLiveGoalPanelChannel.class, new AwS591S0100000_12(this, 1159));
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        C780980UkK c780980UkK = this.LLILZLL;
        if (c780980UkK == null) {
            return false;
        }
        c780980UkK.onBackPressed();
        return true;
    }

    @Override // X.InterfaceC781090UkV
    public final void SF() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC1102750enp.EFFECT.load(this.LLJILLL, new C0UF1(context, this));
        C19EG activity = getActivity();
        if (activity != null) {
            Room room = this.LLJJIJIL;
            if (room == null) {
                room = null;
            }
            User owner = room.getOwner();
            if (owner == null || owner.getSecret() != 1) {
                EnumC1102750enp.SHARE.load(this.LLJILLL, C781270Ukn.LJJI().K72(activity, context, LiveMode.LIVE_VOICE, this));
                EnumC1102750enp.SHARE_IN_MORE.load(this.LLJILLL, C781270Ukn.LJJI().K72(activity, context, LiveMode.VIDEO, this));
            } else {
                EnumC1102750enp.SHARE.load(this.LLJILLL, C781270Ukn.LJJI().Xg0());
                EnumC1102750enp.SHARE_IN_MORE.load(this.LLJILLL, C781270Ukn.LJJI().Xg0());
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1120000fFe c1120000fFe = this.LLJI;
        if (c1120000fFe == null) {
            c1120000fFe = null;
        }
        c1120000fFe.LIZJ(this.LLJIJIL);
        C1120000fFe c1120000fFe2 = this.LLJI;
        if (c1120000fFe2 == null) {
            c1120000fFe2 = null;
        }
        C780820Uk4 c780820Uk4 = this.LLJILJIL;
        if (c780820Uk4 == null) {
            c780820Uk4 = null;
        }
        c1120000fFe2.LIZJ(c780820Uk4);
        C1120000fFe c1120000fFe3 = this.LLJI;
        if (c1120000fFe3 == null) {
            c1120000fFe3 = null;
        }
        C782430Umf c782430Umf = this.LLJILJILJ;
        if (c782430Umf == null) {
            c782430Umf = null;
        }
        c1120000fFe3.LIZJ(c782430Umf);
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(this.LLJJJJ);
        this.LLJJJJ = null;
        C780980UkK c780980UkK = this.LLILZLL;
        if (c780980UkK != null) {
            c780980UkK.onDestroy();
        }
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            LiveAudioDevicesDetector.LIZ.LIZ();
        } else {
            try {
                Context context = getContext();
                if (context != null) {
                    C786410Ut5.LJJIFFI(context, (C779730UiJ) this.LLJJJ.getValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unregisterHeadsetReceiver ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("VideoBroadcastInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C768620UDc c768620UDc = C768620UDc.LIZ;
        c768620UDc.LJII(false, false, false);
        C768620UDc.LIZLLL = false;
        c768620UDc.LJIILIIL(null);
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C781010UkN c781010UkN = this.LLJJI;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        DialogInterface dialogInterface = c781010UkN.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C780980UkK c780980UkK = this.LLILZLL;
        if (c780980UkK != null) {
            c780980UkK.onDestroyView();
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC781090UkV
    public final C784410Upr LLLLJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC781090UkV
    public final void LLLLIILL(int i) {
        DataChannel dataChannel;
        if (C1152720g6Q.LIZ() && (dataChannel = this.LLJILLL) != null) {
            dataChannel.zW(NetworkStatusV3.class, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Ujj] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0IK5.LIZIZ(this.LLJILLL, new ARunnableS81S0200000_12(bundle, this, 39));
        if (!LiveBroadcastNetworkSetting.INSTANCE.useLiveCoreNetwork()) {
            this.LLJJJJ = new InterfaceC784190UpV() { // from class: X.0Ujj
                @Override // X.InterfaceC784190UpV
                public final void LIZ(EnumC784160UpS enumC784160UpS) {
                    int i;
                    if (enumC784160UpS == null) {
                        i = -1;
                    } else {
                        i = C784120UpO.LIZ[enumC784160UpS.ordinal()];
                    }
                    int i2 = 1;
                    if (i != 1) {
                        if (i == 2) {
                            i2 = 2;
                        }
                    } else {
                        i2 = 3;
                    }
                    DataChannel dataChannel = this.LIZ.LLJILLL;
                    if (dataChannel != null) {
                        dataChannel.zW(NetworkStatus.class, Integer.valueOf(i2));
                    }
                }
            };
            ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(this.LLJJJJ);
        }
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(this, 121), null, 2000L);
        } else {
            C486790J7d.LIZLLL(new ARunnableS112S0100000_12(this, 122), null, 2000L);
        }
    }

    @Override // X.InterfaceC781090UkV
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1120000fFe c1120000fFe = this.LLJI;
        if (c1120000fFe == null) {
            c1120000fFe = null;
        }
        return c1120000fFe.LIZ(motionEvent, new C0UKP(RR().getWidth(), RR().getHeight(), RR().getTop(), RR().getLeft()), null);
    }

    public final void pq(int i) {
        DataChannel dataChannel;
        if (LiveBroadcastNetworkSetting.INSTANCE.useLiveCoreNetwork() && (dataChannel = this.LLJILLL) != null) {
            dataChannel.zW(NetworkStatus.class, Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC781090UkV
    public final void I1(int i, int i2) {
        DataChannel dataChannel;
        if (C1152720g6Q.LIZ() && (dataChannel = this.LLJILLL) != null) {
            dataChannel.LC0(BroadcastAudioStatus.class, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public final void SR(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLJILLL = dataChannel;
        this.LLJJIII = abstractC781140Uka;
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            return;
        }
        this.LLJJIJIL = room;
        dataChannel.zW(LiveModeChannel.class, LiveMode.LIVE_VOICE);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Ujf] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int iHashCode;
        AbstractC781140Uka abstractC781140Uka;
        super.onViewCreated(view, bundle);
        LayeredWidgetManager layeredWidgetManagerOf = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C486790J7d.LIZ, new VideoLayeredElementManager(getContext(), this, (C1083340eIW) view, this.LLJILLL), C0IJ7.LIZLLL(getContext()), false, 0);
        layeredWidgetManagerOf.setCheckContentViewAttached(true);
        this.LLIZ = layeredWidgetManagerOf;
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null && (abstractC781140Uka = this.LLJJIII) != null) {
            C780980UkK c780980UkK = new C780980UkK(getContext(), this, this, view, layeredWidgetManagerOf);
            c780980UkK.LIZ(dataChannel, abstractC781140Uka);
            c780980UkK.onViewCreated(view, bundle);
            this.LLILZLL = c780980UkK;
        }
        DataChannel dataChannel2 = this.LLJILLL;
        C782430Umf c782430Umf = null;
        if (dataChannel2 != null) {
            Room room = this.LLJJIJIL;
            if (room == null) {
                room = null;
            }
            C781010UkN c781010UkN = new C781010UkN(room, this, view, getContext(), dataChannel2);
            c781010UkN.LIZ();
            this.LLJJI = c781010UkN;
            C782390Umb c782390Umb = this.LLJ;
            if (c782390Umb != null) {
                c782390Umb.setDataChannel(this.LLJILLL);
            }
            C768620UDc c768620UDc = C768620UDc.LIZ;
            boolean zEnable = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable();
            c768620UDc.getClass();
            C768620UDc.LIZLLL = zEnable;
            c768620UDc.LJIILIIL(this.LLJILLL);
            InterfaceC777420Uea interfaceC777420UeaEa0 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ea0(ViewModelProviders.of(this));
            StringBuilder sb = new StringBuilder("VideoBroadcastInteractionFragment_setPriorityTaskDispatcherData mDataChannel:");
            DataChannel dataChannel3 = this.LLJILLL;
            if (dataChannel3 != null) {
                iHashCode = dataChannel3.hashCode();
            } else {
                iHashCode = 0;
            }
            sb.append(iHashCode);
            C20441214yg.LIZIZ("voice_chat", sb.toString());
            dataChannel2.SX0(C782140UmC.class, interfaceC777420UeaEa0);
        }
        C782390Umb c782390Umb2 = this.LLJ;
        if (c782390Umb2 != null) {
            c782390Umb2.setDataChannel(this.LLJILLL);
        }
        if (LiveAnchorDebugInfoSetting.INSTANCE.enable()) {
            C465520INi.LIZ.L11(new AwS591S0100000_12(this, 523));
            C500260Jjc.LLFFF(OR());
        } else {
            C500260Jjc.LJIILIIL(OR());
        }
        final DataChannel dataChannel4 = this.LLJILLL;
        if (dataChannel4 != null) {
            final Context context = getContext();
            this.LLJIJIL = new AbstractC1120020fFg(context, dataChannel4) { // from class: X.0Ujf
                public final DataChannel LL;
                public final GestureDetector LLILLJJLI;
                public long LLILLL;

                @Override // X.AbstractC1120020fFg
                public final int LIZIZ() {
                    return 3;
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onDoubleTap(MotionEvent motionEvent) {
                    this.LLILLL = System.currentTimeMillis();
                    return true;
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent == null || Math.abs(System.currentTimeMillis() - this.LLILLL) <= 1000) {
                        return false;
                    }
                    this.LL.LC0(BaseSingleTapEvent.class, motionEvent);
                    return false;
                }

                {
                    this.LL = dataChannel4;
                    this.LLILLJJLI = new GestureDetector(context, this);
                }

                @Override // X.AbstractC1120020fFg
                public final boolean LJ(MotionEvent motionEvent, C0UKP c0ukp, View view2) {
                    return this.LLILLJJLI.onTouchEvent(motionEvent);
                }
            };
            C1120000fFe c1120000fFe = new C1120000fFe(dataChannel4);
            this.LLJI = c1120000fFe;
            c1120000fFe.LIZIZ(this.LLJIJIL);
            this.LLJILJIL = new C780820Uk4(getContext(), dataChannel4, 3, this, RR());
            this.LLJILJILJ = new C782430Umf(this.LLIZLLLIL, 5, new AwS591S0100000_12(this, 1161));
            C1120000fFe c1120000fFe2 = this.LLJI;
            if (c1120000fFe2 != null) {
                C780820Uk4 c780820Uk4 = this.LLJILJIL;
                if (c780820Uk4 == null) {
                    c780820Uk4 = null;
                }
                c1120000fFe2.LIZIZ(c780820Uk4);
            }
            C1120000fFe c1120000fFe3 = this.LLJI;
            if (c1120000fFe3 != null) {
                C782430Umf c782430Umf2 = this.LLJILJILJ;
                if (c782430Umf2 != null) {
                    c782430Umf = c782430Umf2;
                }
                c1120000fFe3.LIZIZ(c782430Umf);
            }
            C782390Umb c782390Umb3 = this.LLJ;
            if (c782390Umb3 != null) {
                c782390Umb3.setGestureDetectLayout(this.LLIZLLLIL);
            }
        }
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Tj2(view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.ggn, viewGroup, false, null, false, 60);
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
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
