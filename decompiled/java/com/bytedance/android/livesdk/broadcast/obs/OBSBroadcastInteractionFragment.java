package com.bytedance.android.livesdk.broadcast.obs;

import X.AbstractC1120020fFg;
import X.AbstractC781140Uka;
import X.C01SL;
import X.C098200Yq;
import X.C0IGR;
import X.C0IJT;
import X.C0RT0;
import X.C0UIM;
import X.C0UKP;
import X.C0UZV;
import X.C1082080eGU;
import X.C1083340eIW;
import X.C1120000fFe;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C437170HCh;
import X.C474500IjA;
import X.C486790J7d;
import X.C500260Jjc;
import X.C780550Ujd;
import X.C780980UkK;
import X.C781010UkN;
import X.C781270Ukn;
import X.C782360UmY;
import X.C784410Upr;
import X.C786410Ut5;
import X.EnumC1102750enp;
import X.InterfaceC1085480eLy;
import X.InterfaceC769510UGn;
import X.InterfaceC784190UpV;
import Y.ARunnableS112S0100000_12;
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
import com.bytedance.android.live.broadcast.api.NetworkStatusV3;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastSLRDiamondsWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.obs.layer.ObsLayeredElementManager;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.comp.api.decoration.IRoomStickerOuterService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDonationOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptimizeEffectGestureSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class OBSBroadcastInteractionFragment extends BaseFragment implements C0UZV, C0IGR {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTHELIOSY4ZyAxO2sDCxwROiotLSwyOzEFJzs2OiQvPSY8JgM+KCg+LSs4";
    public C782360UmY LL;
    public C784410Upr LLILLJJLI;
    public C0RT0 LLILLL;
    public final WidgetCreateTimeUtil LLILZ = new WidgetCreateTimeUtil(null);
    public Room LLILZIL;
    public DataChannel LLILZLL;
    public LayeredWidgetManager LLIZ;
    public C781010UkN LLIZLLLIL;
    public C780980UkK LLJ;
    public AbstractC781140Uka LLJI;
    public Runnable LLJIJIL;
    public C1120000fFe LLJILJIL;
    public AbstractC1120020fFg LLJILJILJ;
    public InterfaceC769510UGn LLJILLL;
    public C780550Ujd LLJJ;

    @Override // X.InterfaceC781090UkV
    public final void EP(RemindMessage remindMessage) {
    }

    @Override // X.InterfaceC781090UkV
    public final void I1(int i, int i2) {
    }

    @Override // X.InterfaceC781090UkV
    public final void ZD(int i) {
    }

    @Override // X.InterfaceC781090UkV
    public final BaseFragment getFragment() {
        return this;
    }

    @Override // X.C0UZV
    public final void kt() {
        C784410Upr c784410UprNR = NR();
        if (c784410UprNR != null) {
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            Context context = getContext();
            DataChannel dataChannel = this.LLILZLL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            AbstractC1120020fFg otherGestureDetector = iBroadcastService.getOtherGestureDetector(context, dataChannel, OptimizeEffectGestureSetting.INSTANCE.enable() ? 5 : 3, this, c784410UprNR);
            this.LLJILJILJ = otherGestureDetector;
            C1120000fFe c1120000fFe = this.LLJILJIL;
            if (c1120000fFe != null) {
                c1120000fFe.LIZIZ(otherGestureDetector);
            }
        }
    }

    @Override // X.InterfaceC781090UkV
    public final void Hu() {
        View.OnTouchListener onTouchListenerLJJ;
        OR(this.LLJIJIL);
        IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
        Room room = this.LLILZIL;
        if (room == null) {
            room = null;
        }
        InterfaceC1085480eLy interfaceC1085480eLyO41 = iBarrageService.O41(room.getId());
        if (interfaceC1085480eLyO41 != null) {
            ArrayList<C0RT0> arrayList = new ArrayList();
            View view = this.LLILLL;
            if (view == null) {
                View view2 = getView();
                View viewFindViewById = view2 != null ? view2.findViewById(R.id.sfs) : null;
                this.LLILLL = (C0RT0) viewFindViewById;
                view = viewFindViewById;
            }
            arrayList.add(view);
            interfaceC1085480eLyO41.LJIILIIL(arrayList);
            for (C0RT0 c0rt0 : arrayList) {
                if (c0rt0 != null && (onTouchListenerLJJ = interfaceC1085480eLyO41.LJJ()) != null) {
                    c0rt0.LL.add(onTouchListenerLJJ);
                }
            }
        }
    }

    public final C784410Upr NR() {
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
        C781010UkN c781010UkN = this.LLIZLLLIL;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        c781010UkN.LIZIZ();
    }

    @Override // X.InterfaceC781090UkV
    public final void gf() {
        LayeredWidgetManager layeredWidgetManager = this.LLIZ;
        if (layeredWidgetManager == null) {
            layeredWidgetManager = null;
        }
        IToolbarService iToolbarServiceLJJIIJ = C781270Ukn.LJJIIJ();
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        layeredWidgetManager.load(R.id.y6v, iToolbarServiceLJJIIJ.bP2(null, dataChannel), false);
        LayeredWidgetManager layeredWidgetManager2 = this.LLIZ;
        if (layeredWidgetManager2 == null) {
            layeredWidgetManager2 = null;
        }
        layeredWidgetManager2.load(R.id.il0, C781270Ukn.LJJII().getFreeFrameSlotWidget());
        LayeredWidgetManager layeredWidgetManager3 = this.LLIZ;
        if (layeredWidgetManager3 == null) {
            layeredWidgetManager3 = null;
        }
        layeredWidgetManager3.load(R.id.mut, ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveCenterEntranceWidget());
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            LayeredWidgetManager layeredWidgetManager4 = this.LLIZ;
            if (layeredWidgetManager4 == null) {
                layeredWidgetManager4 = null;
            }
            layeredWidgetManager4.load(R.id.mvk, new LiveCenterTopNoticeWidget());
        }
        LayeredWidgetManager layeredWidgetManager5 = this.LLIZ;
        if (layeredWidgetManager5 == null) {
            layeredWidgetManager5 = null;
        }
        layeredWidgetManager5.load(R.id.p4x, new NetSpeedMonitorWidget());
        LayeredWidgetManager layeredWidgetManager6 = this.LLIZ;
        if (layeredWidgetManager6 == null) {
            layeredWidgetManager6 = null;
        }
        layeredWidgetManager6.load(R.id.vli, new BroadcastSLRDiamondsWidget());
        if (TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE.enable()) {
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).registerLiveGoalBehavior();
        }
        if (C500260Jjc.LJJJI(null)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJ("click");
            c474500IjALIZ.LIZ();
        }
        LayeredWidgetManager layeredWidgetManager7 = this.LLIZ;
        if (layeredWidgetManager7 == null) {
            layeredWidgetManager7 = null;
        }
        layeredWidgetManager7.load(R.id.n7j, ((IRoomStickerOuterService) C1161920gLG.LIZJ(IRoomStickerOuterService.class)).XB0());
        if (!LiveDonationOptSetting.INSTANCE.enable()) {
            LayeredWidgetManager layeredWidgetManager8 = this.LLIZ;
            (layeredWidgetManager8 != null ? layeredWidgetManager8 : null).load(R.id.mw2, ((IDonationStickerOuterService) C1161920gLG.LIZJ(IDonationStickerOuterService.class)).bO2());
            return;
        }
        Room room = this.LLILZIL;
        if (room == null) {
            room = null;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus == null || !roomAuthStatus.isEnableStickerDonation()) {
            return;
        }
        IDonationStickerOuterService iDonationStickerOuterService = (IDonationStickerOuterService) C1161920gLG.LIZJ(IDonationStickerOuterService.class);
        DataChannel dataChannel2 = this.LLILZLL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        iDonationStickerOuterService.vO0(this, dataChannel2);
        if (this.LLJILLL == null) {
            IDonationStickerOuterService iDonationStickerOuterService2 = (IDonationStickerOuterService) C1161920gLG.LIZJ(IDonationStickerOuterService.class);
            DataChannel dataChannel3 = this.LLILZLL;
            this.LLJILLL = iDonationStickerOuterService2.v62(dataChannel3 != null ? dataChannel3 : null);
        }
        InterfaceC769510UGn interfaceC769510UGn = this.LLJILLL;
        if (interfaceC769510UGn != null) {
            interfaceC769510UGn.LIZJ(this);
        }
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        C780980UkK c780980UkK = this.LLJ;
        if (c780980UkK == null) {
            c780980UkK = null;
        }
        c780980UkK.onBackPressed();
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC769510UGn interfaceC769510UGn = this.LLJILLL;
        if (interfaceC769510UGn != null) {
            interfaceC769510UGn.LIZIZ(false, true);
        }
        C780980UkK c780980UkK = this.LLJ;
        if (c780980UkK == null) {
            c780980UkK = null;
        }
        c780980UkK.onDestroy();
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).removeNetworkChangeObserver(this.LLJJ);
        this.LLJJ = null;
        super.onDestroy();
        LayeredWidgetManager layeredWidgetManager = this.LLIZ;
        C1082080eGU.LIZIZ(layeredWidgetManager != null ? layeredWidgetManager : null);
        C1082080eGU.LJFF(3);
    }

    @Override // X.InterfaceC781090UkV
    public final C784410Upr LLLLJI() {
        return NR();
    }

    @Override // X.InterfaceC781090UkV
    public final void SF() {
        C19EG activity = getActivity();
        if (activity != null) {
            Room room = this.LLILZIL;
            if (room == null) {
                room = null;
            }
            if (C0UIM.LJIIIIZZ(room)) {
                Room room2 = this.LLILZIL;
                if (room2 == null) {
                    room2 = null;
                }
                User owner = room2.getOwner();
                if (owner == null || owner.getSecret() != 1) {
                    EnumC1102750enp enumC1102750enp = EnumC1102750enp.SHARE;
                    DataChannel dataChannel = this.LLILZLL;
                    if (dataChannel == null) {
                        dataChannel = null;
                    }
                    IShareService iShareServiceLJJI = C781270Ukn.LJJI();
                    Context context = getContext();
                    LiveMode liveMode = LiveMode.THIRD_PARTY;
                    enumC1102750enp.load(dataChannel, iShareServiceLJJI.K72(activity, context, liveMode, this));
                    EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.SHARE_IN_MORE;
                    DataChannel dataChannel2 = this.LLILZLL;
                    if (dataChannel2 == null) {
                        dataChannel2 = null;
                    }
                    enumC1102750enp2.load(dataChannel2, C781270Ukn.LJJI().K72(activity, getContext(), liveMode, this));
                } else {
                    EnumC1102750enp enumC1102750enp3 = EnumC1102750enp.SHARE;
                    DataChannel dataChannel3 = this.LLILZLL;
                    if (dataChannel3 == null) {
                        dataChannel3 = null;
                    }
                    enumC1102750enp3.load(dataChannel3, C781270Ukn.LJJI().Xg0());
                    EnumC1102750enp enumC1102750enp4 = EnumC1102750enp.SHARE_IN_MORE;
                    DataChannel dataChannel4 = this.LLILZLL;
                    if (dataChannel4 == null) {
                        dataChannel4 = null;
                    }
                    enumC1102750enp4.load(dataChannel4, C781270Ukn.LJJI().Xg0());
                }
            }
        }
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        DataChannel dataChannel5 = this.LLILZLL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        iRoomFunctionService.ZH(dataChannel5);
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        DataChannel dataChannel6 = this.LLILZLL;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        Room room3 = this.LLILZIL;
        if (room3 == null) {
            room3 = null;
        }
        iGamePartnershipService.tm0(dataChannel6, Long.valueOf(room3.getId()));
        Room room4 = this.LLILZIL;
        if (room4 == null) {
            room4 = null;
        }
        if (C01SL.LIZ(room4)) {
            IGamePartnershipService iGamePartnershipService2 = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
            DataChannel dataChannel7 = this.LLILZLL;
            if (dataChannel7 == null) {
                dataChannel7 = null;
            }
            Room room5 = this.LLILZIL;
            iGamePartnershipService2.kr1((room5 != null ? room5 : null).getId(), dataChannel7);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJIJIL = null;
        C781010UkN c781010UkN = this.LLIZLLLIL;
        if (c781010UkN == null) {
            c781010UkN = null;
        }
        DialogInterface dialogInterface = c781010UkN.LJFF;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.LLILZ.send();
        C780980UkK c780980UkK = this.LLJ;
        if (c780980UkK == null) {
            c780980UkK = null;
        }
        c780980UkK.onDestroyView();
        C1120000fFe c1120000fFe = this.LLJILJIL;
        if (c1120000fFe != null) {
            c1120000fFe.LIZJ(this.LLJILJILJ);
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // X.InterfaceC781090UkV
    public final void LLLLIILL(int i) {
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zW(NetworkStatusV3.class, Integer.valueOf(i));
    }

    public final void OR(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LLJIJIL = null;
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS112S0100000_12(runnable, 63));
                return;
            }
            return;
        }
        this.LLJIJIL = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Ujd] */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C780980UkK c780980UkK = this.LLJ;
        if (c780980UkK == null) {
            c780980UkK = null;
        }
        c780980UkK.LIZIZ(bundle);
        this.LLJJ = new InterfaceC784190UpV() { // from class: X.0Ujd
            /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
            @Override // X.InterfaceC784190UpV
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.EnumC784160UpS r5) {
                /*
                    r4 = this;
                    java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ
                    boolean r0 = X.C1152720g6Q.LIZ()
                    r3 = 2
                    r2 = 1
                    if (r0 == 0) goto L21
                    if (r5 == 0) goto L1f
                    int[] r1 = X.C784100UpM.LIZ
                    int r0 = r5.ordinal()
                    r0 = r1[r0]
                    if (r0 == r2) goto L19
                    if (r0 != r3) goto L1f
                    r3 = 1
                L19:
                    com.bytedance.android.livesdk.broadcast.obs.OBSBroadcastInteractionFragment r0 = r4.LIZ
                    r0.LLLLIILL(r3)
                    return
                L1f:
                    r3 = 0
                    goto L19
                L21:
                    if (r5 == 0) goto L2f
                    int[] r1 = X.C784100UpM.LIZ
                    int r0 = r5.ordinal()
                    r0 = r1[r0]
                    if (r0 == r2) goto L41
                    if (r0 == r3) goto L30
                L2f:
                    r3 = 1
                L30:
                    com.bytedance.android.livesdk.broadcast.obs.OBSBroadcastInteractionFragment r0 = r4.LIZ
                    com.bytedance.ies.sdk.datachannel.DataChannel r2 = r0.LLILZLL
                    if (r2 != 0) goto L37
                    r2 = 0
                L37:
                    java.lang.Class<com.bytedance.android.live.broadcast.api.NetworkStatus> r1 = com.bytedance.android.live.broadcast.api.NetworkStatus.class
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                    r2.zW(r1, r0)
                    return
                L41:
                    r3 = 3
                    goto L30
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C780550Ujd.LIZ(X.0UpS):void");
            }
        };
        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).observerNetworkChange(this.LLJJ);
    }

    @Override // X.InterfaceC781090UkV
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1120000fFe c1120000fFe = this.LLJILJIL;
        if (c1120000fFe != null) {
            return c1120000fFe.LIZ(motionEvent, new C0UKP(NR().getWidth(), NR().getHeight(), NR().getTop(), NR().getLeft()), null);
        }
        return false;
    }

    public final void PR(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLILZLL = dataChannel;
        this.LLJI = abstractC781140Uka;
        this.LLILZIL = (Room) dataChannel.gg0(RoomChannel.class);
        DataChannel dataChannel2 = this.LLILZLL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        dataChannel2.zW(LiveModeChannel.class, LiveMode.THIRD_PARTY);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        C1083340eIW c1083340eIW = (C1083340eIW) view;
        DataChannel dataChannel = this.LLILZLL;
        DataChannel dataChannel2 = null;
        if (dataChannel == null) {
            dataChannel = null;
        }
        LayeredWidgetManager layeredWidgetManagerOf = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C486790J7d.LIZ, new ObsLayeredElementManager(context, this, c1083340eIW, dataChannel));
        layeredWidgetManagerOf.mWidgetCreateTimeListener = this.LLILZ;
        layeredWidgetManagerOf.setCheckContentViewAttached(true);
        this.LLIZ = layeredWidgetManagerOf;
        C1082080eGU.LJI(3, layeredWidgetManagerOf);
        LayeredWidgetManager layeredWidgetManager = this.LLIZ;
        if (layeredWidgetManager == null) {
            layeredWidgetManager = null;
        }
        C1082080eGU.LIZ(3, layeredWidgetManager);
        Context context2 = getContext();
        LayeredWidgetManager layeredWidgetManager2 = this.LLIZ;
        if (layeredWidgetManager2 == null) {
            layeredWidgetManager2 = null;
        }
        C780980UkK c780980UkK = new C780980UkK(context2, this, this, view, layeredWidgetManager2);
        DataChannel dataChannel3 = this.LLILZLL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        AbstractC781140Uka abstractC781140Uka = this.LLJI;
        if (abstractC781140Uka == null) {
            abstractC781140Uka = null;
        }
        c780980UkK.LIZ(dataChannel3, abstractC781140Uka);
        c780980UkK.onViewCreated(view, bundle);
        this.LLJ = c780980UkK;
        Room room = this.LLILZIL;
        if (room == null) {
            room = null;
        }
        Context context3 = getContext();
        DataChannel dataChannel4 = this.LLILZLL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        C781010UkN c781010UkN = new C781010UkN(room, this, view, context3, dataChannel4);
        c781010UkN.LIZ();
        this.LLIZLLLIL = c781010UkN;
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.phg);
            } else {
                viewFindViewById = null;
            }
            this.LL = (C782360UmY) viewFindViewById;
        }
        C782360UmY c782360UmY = (C782360UmY) viewFindViewById;
        DataChannel dataChannel5 = this.LLILZLL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        c782360UmY.setDataChannel(dataChannel5);
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.phg);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (C782360UmY) viewFindViewById2;
        }
        ((C782360UmY) viewFindViewById2).setGestureDetectLayout(NR());
        DataChannel dataChannel6 = this.LLILZLL;
        if (dataChannel6 != null) {
            dataChannel2 = dataChannel6;
        }
        this.LLJILJIL = new C1120000fFe(dataChannel2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        C780980UkK c780980UkK = this.LLJ;
        if (c780980UkK == null) {
            c780980UkK = null;
        }
        c780980UkK.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gkh, viewGroup, false);
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
