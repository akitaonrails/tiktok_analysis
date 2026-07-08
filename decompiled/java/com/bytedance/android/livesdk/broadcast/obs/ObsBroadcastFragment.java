package com.bytedance.android.livesdk.broadcast.obs;

import X.AbstractC781140Uka;
import X.C001A;
import X.C01GW;
import X.C09JN;
import X.C0IEB;
import X.C0IJT;
import X.C0IMA;
import X.C0J1N;
import X.C0JST;
import X.C0JT6;
import X.C0UUC;
import X.C0UVT;
import X.C0UYF;
import X.C0UYG;
import X.C0UYH;
import X.C0UYJ;
import X.C0UZ4;
import X.C0UZ9;
import X.C0UZV;
import X.C0WZX;
import X.C1145060fu4;
import X.C1161920gLG;
import X.C11PQ;
import X.C11RD;
import X.C1324720kZq;
import X.C1338270kvh;
import X.C1701940uOG;
import X.C1766560w4U;
import X.C19322110iZ;
import X.C19EG;
import X.C19EH;
import X.C20441214yg;
import X.C20856616jU;
import X.C21406218pw;
import X.C2204961BRm;
import X.C2262001DgE;
import X.C248100xb;
import X.C354201Zc;
import X.C452501pT;
import X.C464550IJp;
import X.C465520INi;
import X.C474500IjA;
import X.C500260Jjc;
import X.C501060Jku;
import X.C504210Jpz;
import X.C751340Tdc;
import X.C753430Tgz;
import X.C772200UQw;
import X.C772780UTc;
import X.C772830UTh;
import X.C776250Uch;
import X.C777340UeS;
import X.C781270Ukn;
import X.C781300Ukq;
import X.C786410Ut5;
import X.C930940aKi;
import X.EnumC1102750enp;
import X.EnumC498960JhW;
import X.EnumC500290Jjf;
import X.InterfaceC1699460uKG;
import X.InterfaceC19483011Ki;
import X.InterfaceC2262041DgI;
import X.InterfaceC420801kM;
import X.InterfaceC465660INw;
import X.InterfaceC772190UQv;
import X.InterfaceC773130UUl;
import X.InterfaceC774140UYi;
import X.InterfaceViewOnClickListenerC1102800enu;
import Y.ARunnableS112S0100000_12;
import Y.AfS181S0100000_12;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.obs.OBSBroadcastInteractionFragment;
import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.GameGuessMessageDisplayEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameBroadcastNewIntentFixSettingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsBgServiceStrategySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ObsBroadcastFragment extends BaseBroadcastFragment implements C0UZ4 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjHELIOSKCswKTY4ZyAxO2sDKzwROiotLSwyOzEKOy40JSAiPQ==";
    public C0UYF LLILZLL;
    public InterfaceC773130UUl LLIZ;
    public C0UZV LLIZLLLIL;
    public IMessageManager LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C0UYH LLJILLL;
    public C0UZ9 LLJJ;
    public C781300Ukq LLJJI;
    public C248100xb LLJJIJI;
    public InterfaceC420801kM LLJJIJIL;
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(55));
    public final C0UYJ LLJJIJIIJIL = new ServiceConnection() { // from class: X.0UYJ
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
            C0UZ9 c0uz9 = null;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/android/livesdk/broadcast/obs/ObsBroadcastFragment$mServiceConnection$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/MEgL5HewOB63O8rVNfJLvT5bIBJoqC+w==", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
            }
            ObsBroadcastFragment obsBroadcastFragment = this.LL;
            C0UZ9 c0uz92 = obsBroadcastFragment.LLJJ;
            if (c0uz92 != null) {
                c0uz9 = c0uz92;
            }
            if (c0uz9.LLILZLL == 4) {
                obsBroadcastFragment.oS(1, -1);
            } else {
                IMessageManager iMessageManagerMessageManagerProvider = (IMessageManager) obsBroadcastFragment.getDataChannel().gg0(C776250Uch.class);
                if (iMessageManagerMessageManagerProvider == null) {
                    iMessageManagerMessageManagerProvider = C781270Ukn.LJIILLIIL().messageManagerProvider(this.LL.PR().getId(), true, this.LL.getContext());
                }
                obsBroadcastFragment.LLJ = iMessageManagerMessageManagerProvider;
                this.LL.getDataChannel().SX0(C776250Uch.class, this.LL.LLJ);
                this.LL.NR();
                this.LL.qS(new OBSBroadcastInteractionFragment());
            }
            C21406218pw.LIZIZ();
        }
    };

    @Override // X.C0UZ4
    public final void Nz(String str, PunishEventInfo punishEventInfo, int i) {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void UR() throws Throwable {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZ(getRoomId(), getDataChannel(), "BgBroadcastFragment_OnActivityCreated");
        if (LinkCrossRoomDataHolder.LJLLLL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().setIsAnchor(true);
        }
        this.LLILZLL = new C0UYF(PR(), getContext(), getDataChannel(), this);
        new C0UYG(PR(), getContext(), getDataChannel(), this, this);
        new C777340UeS(PR()).LIZ();
        final C0UYH c0uyh = this.LLJILLL;
        if (c0uyh == null) {
            c0uyh = null;
        }
        C500260Jjc.LLFFF(c0uyh.LJFF);
        C500260Jjc.LLFFF(c0uyh.LJ);
        C500260Jjc.LJIILIIL(c0uyh.LJI);
        View view = c0uyh.LJIILIIL;
        c0uyh.LJIIIZ = view != null ? (C20856616jU) view.findViewById(R.id.video_view) : null;
        long j = c0uyh.LIZ.getStreamUrl() != null ? c0uyh.LIZ.getStreamUrl().streamDelayMs : 0L;
        IPullStreamService iPullStreamServiceLJIJJ = C781270Ukn.LJIJJ();
        String string = UUID.randomUUID().toString();
        Long lValueOf = Long.valueOf(c0uyh.LIZ.getId());
        Room room = c0uyh.LIZ;
        RoomPlayer2 roomPlayer2Sh0 = iPullStreamServiceLJIJJ.sh0(new C0IMA(string, lValueOf, false, room.logId), room.getMultiStreamData(), c0uyh.LIZ.getMultiStreamDefaultQualitySdkKey(), c0uyh.LIZ.getStreamType(), c0uyh.LIZ.getStreamSrConfig(), c0uyh.LJIIIZ, c0uyh, c0uyh.LJIIL, j);
        roomPlayer2Sh0.setSeiOpen(!c0uyh.LJIIJ);
        roomPlayer2Sh0.setIsPrivate(Long.valueOf(c0uyh.LIZ.getOwner() != null ? r1.getSecret() : 1L));
        roomPlayer2Sh0.startWithNewLivePlayer();
        c0uyh.LIZLLL = roomPlayer2Sh0;
        c0uyh.LJIIIIZZ = false;
        EnumC1102750enp.STREAM_KEY.load(c0uyh.LIZJ, new InterfaceViewOnClickListenerC1102800enu() { // from class: X.0UYU
            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final void J() {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void LLILLJJLI() {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void LLILZ() {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void dK(DataChannel dataChannel) {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ boolean dj() {
                return true;
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ boolean f1() {
                return false;
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ long g0() {
                return 500L;
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void mx(DataChannel dataChannel) {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void onHide() {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void onShow() {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ void qG(boolean z) {
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final /* synthetic */ boolean x0(View view2) {
                return false;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c0uyh.LJIILLIIL();
                C0UYH c0uyh2 = c0uyh;
                C0UPV c0upv = c0uyh2.LJII;
                if (c0upv != null) {
                    c0upv.LLJJJ = false;
                }
                c0uyh2.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_key_banner_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII("third_party", "live_type");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceViewOnClickListenerC1102800enu
            public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
                LiveIconView liveIconView;
                if (LiveHostSettingsUIConfig.enable() && (liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74)) != null) {
                    liveIconView.setIconAttr(R.attr.dzo);
                }
            }
        });
        int i = Build.VERSION.SDK_INT;
        if (i >= LiveObsBgServiceStrategySetting.INSTANCE.getValue()) {
            IMessageManager iMessageManagerMessageManagerProvider = (IMessageManager) getDataChannel().gg0(C776250Uch.class);
            if (iMessageManagerMessageManagerProvider == null) {
                iMessageManagerMessageManagerProvider = C781270Ukn.LJIILLIIL().messageManagerProvider(PR().getId(), true, getContext());
            }
            this.LLJ = iMessageManagerMessageManagerProvider;
            getDataChannel().SX0(C776250Uch.class, this.LLJ);
            NR();
            qS(new OBSBroadcastInteractionFragment());
            C21406218pw.LIZIZ();
        } else {
            if (i >= 26) {
                InterfaceC420801kM interfaceC420801kM = this.LLJJIJIL;
                if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                    InterfaceC420801kM interfaceC420801kM2 = this.LLJJIJIL;
                    if (interfaceC420801kM2 != null) {
                        interfaceC420801kM2.dispose();
                    }
                    this.LLJJIJIL = null;
                }
                C19EG activity = getActivity();
                if (activity != null) {
                    Context context = getContext();
                    C2204961BRm.LLJJJJLIIL(activity, context != null ? mS(context) : null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/MEgL5HewOB63O8rVNfJLvT5bIBJoqC+w==", null));
                }
            } else {
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    Context context2 = getContext();
                    C2204961BRm.LLJJL(activity2, context2 != null ? mS(context2) : null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/MEgL5HewOB63O8rVNfJLvT5bIBJoqC+w==", null));
                }
            }
            this.LLJI = true;
        }
        BroadcastTimeLog.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        C781270Ukn.LJII().fetchGiftAnchorPanelActivityInfo(PR(), getDataChannel());
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 != null && room2.getOwner().getSecUid() != null) {
            ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).BW0(Long.valueOf(room2.getId()), room2.getOwner().getSecUid(), getDataChannel(), this, false);
            if (LiveShortTouchApiMergeSetting.INSTANCE.enable()) {
                ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).Y92(getDataChannel(), Long.valueOf(room2.getId()), this);
            }
        }
        C1145060fu4.LIZ(this, getDataChannel());
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void bS() {
        C781300Ukq c781300Ukq = this.LLJJI;
        if (c781300Ukq != null) {
            C19322110iZ.LJII(c781300Ukq.LJIJI);
        }
        C1145060fu4.LIZIZ(this, getDataChannel());
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void gS() throws Throwable {
        if (Build.VERSION.SDK_INT >= LiveObsBgServiceStrategySetting.INSTANCE.getValue() || this.LLJIJIL || this.LLJILJIL) {
            return;
        }
        Context context = getContext();
        C19EG activity = getActivity();
        if (activity != null && context != null) {
            C2204961BRm.LLJJIJIIJIL(activity, mS(context), this.LLJJIJIIJIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/MEgL5HewOB63O8rVNfJLvT5bIBJoqC+w==", null));
        }
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void hS() {
        if (Build.VERSION.SDK_INT >= LiveObsBgServiceStrategySetting.INSTANCE.getValue() || !this.LLJILJIL) {
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.unbindService(this.LLJJIJIIJIL);
        }
        this.LLJILJIL = false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final boolean isViewValid() {
        return !this.mStatusDestroyed;
    }

    public final void nS() {
        IHostAction iHostAction;
        C11PQ<Integer> bgBroadcastServiceState;
        C0UVT c0uvt;
        IMessageManager iMessageManager;
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        int i = Build.VERSION.SDK_INT;
        if (i < LiveObsBgServiceStrategySetting.INSTANCE.getValue()) {
            try {
                if (this.LLJI) {
                    if (i <= 26 || (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null || iHostAction.getBgBroadcastServiceCreate()) {
                        C19EG activity = getActivity();
                        if (activity != null) {
                            Context context = getContext();
                            activity.stopService(context != null ? mS(context) : null);
                        }
                    } else {
                        InterfaceC420801kM interfaceC420801kM = this.LLJJIJIL;
                        if (interfaceC420801kM != null) {
                            interfaceC420801kM.dispose();
                        }
                        IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                        if (iHostAction2 != null && (bgBroadcastServiceState = iHostAction2.getBgBroadcastServiceState()) != null) {
                            this.LLJJIJIL = ((C0J1N) bgBroadcastServiceState.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TBW
                                @Override // X.InterfaceC19483011Ki
                                public final boolean test(Object obj) {
                                    IHostAction iHostAction3 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                                    if (iHostAction3 != null && iHostAction3.getBgBroadcastServiceCreate()) {
                                        return true;
                                    }
                                    return false;
                                }
                            }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 3), new C09JN() { // from class: X.00or
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("ObsBroadcastFragment@e921.stopService$1$3");
                                    C20441214yg.LJII((Throwable) obj);
                                    C1C7U.LIZIZ("ObsBroadcastFragment@e921.stopService$1$3");
                                }
                            });
                        }
                    }
                    this.LLJI = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LIZLLL(th.getMessage());
            }
        }
        C248100xb c248100xb = this.LLJJIJI;
        C248100xb c248100xb2 = c248100xb != null ? c248100xb : null;
        DataChannel dataChannel = c248100xb2.LLILLJJLI;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(c248100xb2);
        }
        C781270Ukn.LJIJI().V70();
        C0UYF c0uyf = this.LLILZLL;
        if (c0uyf != null && (c0uvt = c0uyf.LLILZIL) != null) {
            c0uvt.LJJJJLL();
        }
        C0UYF c0uyf2 = this.LLILZLL;
        if (c0uyf2 != null) {
            c0uyf2.LLIZ = true;
            C0UVT c0uvt2 = c0uyf2.LLILZIL;
            if (c0uvt2 != null) {
                c0uvt2.detachView();
            }
        }
        C781270Ukn.LJIILLIIL().release(PR().getId());
        C781270Ukn.LJIILLIIL().retryReleaseAll();
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZJ(PR().getId(), "BgBroadcastFragment_OnDestroy");
        if (LinkCrossRoomDataHolder.LJLLLL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIIIZZ("BgBroadcastFragment_OnDestroy");
        }
    }

    @Override // X.C0UZ4
    public final InterfaceC774140UYi rA() {
        if (!TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE.enable()) {
            return new InterfaceC774140UYi() { // from class: X.0UZO
                @Override // X.InterfaceC774140UYi
                public final String LIZ(DataChannel dataChannel) {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LIZIZ(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final String LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final String LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LJ(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final InterfaceC517220KQe LJFF(DataChannel dataChannel) {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LJI(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final void LJII(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final String LJIIIIZZ() {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LJIIIZ() {
                }
            };
        }
        IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
        if (iGameService == null) {
            return new InterfaceC774140UYi() { // from class: X.0UZO
                @Override // X.InterfaceC774140UYi
                public final String LIZ(DataChannel dataChannel) {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LIZIZ(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final String LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final String LIZLLL() {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LJ(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final InterfaceC517220KQe LJFF(DataChannel dataChannel) {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LJI(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final void LJII(DataChannel dataChannel) {
                }

                @Override // X.InterfaceC774140UYi
                public final String LJIIIIZZ() {
                    return null;
                }

                @Override // X.InterfaceC774140UYi
                public final void LJIIIZ() {
                }
            };
        }
        iGameService.lU0();
        return C753430Tgz.LIZ;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void aS() {
        super.aS();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).destroyGiftBannedManager();
        this.mStatusDestroyed = true;
        nS();
        C0UYH c0uyh = this.LLJILLL;
        if (c0uyh == null) {
            c0uyh = null;
        }
        c0uyh.LJIIL(true);
        C0IEB c0ieb = c0uyh.LIZLLL;
        if (c0ieb != null) {
            c0ieb.stop(true);
        }
        C0IEB c0ieb2 = c0uyh.LIZLLL;
        if (c0ieb2 != null) {
            c0ieb2.recycle();
        }
        c0uyh.LJIILIIL = null;
        C0UUC.LIZ.LIZLLL(getDataChannel());
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C930940aKi.class);
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.sw0("stream");
        iPerformanceManager.yL0();
        iPerformanceManager.setIsAnchor(false);
        iPerformanceManager.release();
        iPerformanceManager.oB1();
        iPerformanceManager.d01(-1.0f);
        iPerformanceManager.Gp0(-1.0d);
        iPerformanceManager.NE1();
        ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Yg();
        dataChannelGlobal.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.FALSE);
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).releaseGoLiveManager();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void WR(Bundle bundle) {
        InterfaceC1699460uKG interfaceC1699460uKGWr1;
        IMessageManager iMessageManager;
        super.WR(bundle);
        if (LiveGameBroadcastNewIntentFixSettingSetting.INSTANCE.getValue() && C504210Jpz.LIZ && Build.VERSION.SDK_INT >= 34) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZJ(false, false);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        C21406218pw.LIZJ();
        C0JT6<Boolean> c0jt6 = InterfaceC465660INw.Zc;
        Boolean bool = Boolean.TRUE;
        c0jt6.LIZJ(bool);
        C0UYH c0uyh = new C0UYH(PR(), this, getDataChannel());
        EnumC500290Jjf.OBS.config();
        this.LLJILLL = c0uyh;
        C2262001DgE c2262001DgE = new C2262001DgE(PR());
        c2262001DgE.LIZIZ = new InterfaceC2262041DgI() { // from class: X.0UZM
            @Override // X.InterfaceC2262041DgI
            public final void Ze(int i, String str, boolean z) {
                if (i != 30001 && i != 30003 && i != 50002 && i != 30003001) {
                    return;
                }
                ObsBroadcastFragment obsBroadcastFragment = this.LL;
                obsBroadcastFragment.nS();
                obsBroadcastFragment.oS(1, i);
            }
        };
        C0UZ9 c0uz9 = new C0UZ9(c2262001DgE, false);
        this.LLJJ = c0uz9;
        LiveMode liveMode = LiveMode.THIRD_PARTY;
        if (!c0uz9.LLILLL && !c0uz9.LLJIJIL && c0uz9.LLILZLL == 1) {
            c0uz9.LLJIJIL = true;
            c0uz9.LLJILJIL = liveMode;
            c0uz9.LJIIIZ(0, 0, false, false);
        }
        IMessageManager iMessageManager2 = (IMessageManager) getDataChannel().gg0(C776250Uch.class);
        this.LLJ = iMessageManager2;
        if (iMessageManager2 == null) {
            this.LLJ = C781270Ukn.LJIILLIIL().messageManagerProvider(PR().getId(), true, getContext());
        }
        getDataChannel().SX0(C776250Uch.class, this.LLJ);
        NR();
        C248100xb c248100xb = new C248100xb(PR());
        DataChannel dataChannel = getDataChannel();
        c248100xb.LLILLJJLI = dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), c248100xb);
        }
        this.LLJJIJI = c248100xb;
        DataChannel dataChannel2 = getDataChannel();
        dataChannel2.CQ2(GameGuessMessageDisplayEvent.class, this, new AwS591S0100000_12(this, 224));
        dataChannel2.SX0(C751340Tdc.class, Long.valueOf(PR().getId()));
        dataChannel2.zW(UserIsAnchorChannel.class, bool);
        DataChannelGlobal.LLILZ.BQ2(this, this, ShowEndPageEvent.class, new AwS591S0100000_12(this, 225));
        DataChannelGlobal.LLILZ.BQ2(this, this, EndLiveWithoutEndPage.class, new AwS591S0100000_12(this, 226));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this, BroadcastSchemaOpenPanelEvent.class, new AwS591S0100000_12(this, 227));
        dataChannelGlobal.HQ2(BroadcastShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (interfaceC1699460uKGWr1 = iPullStreamService.Wr1()) != null) {
            interfaceC1699460uKGWr1.LIZ("obs_broadcast");
        }
        if (C772200UQw.LIZ()) {
            InterfaceC772190UQv.r3.LJFF(Boolean.FALSE);
        }
        C0UUC.LIZ.LIZ(getDataChannel());
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void iS(View view) {
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).fW1(getContext(), getDataChannel(), EnumC498960JhW.BROADCAST);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initGiftBannedManager(PR(), getDataChannel(), true);
        Room roomPR = PR();
        if (roomPR != null) {
            C781270Ukn.LJIJI().q51(roomPR.getId());
        }
        C0UYH c0uyh = this.LLJILLL;
        String strLIZ = null;
        if (c0uyh == null) {
            c0uyh = null;
        }
        c0uyh.LJIILIIL = view;
        c0uyh.LJFF = (C1324720kZq) view.findViewById(R.id.bnu);
        c0uyh.LJI = (C1324720kZq) view.findViewById(R.id.video_background);
        c0uyh.LJ = view.findViewById(R.id.nnp);
        C0JST.LIZ(c0uyh.LJFF, c0uyh.LIZ);
        Creator creator = PR().creator;
        if (creator != null) {
            int i = creator.roomContinue;
            if (i == 2) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_back_to_live");
                c474500IjALIZ.LJIJJLI(getDataChannel());
                c474500IjALIZ.LJJIJIIJIL(PR().getIdStr());
                c474500IjALIZ.LJII(String.valueOf(PR().getOwnerUserId()));
                LiveMode streamType = PR().getStreamType();
                if (streamType != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                }
                c474500IjALIZ.LJJ(strLIZ);
                c474500IjALIZ.LJ("exempt");
                c474500IjALIZ.LIZ();
            }
            C772780UTc.LJIIIZ(i);
        }
        this.LLJJI = new C781300Ukq(getDataChannel(), this, view.findViewById(R.id.ku8), view.findViewById(R.id.ku9), view.findViewById(R.id.mue));
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final Intent mS(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, C781270Ukn.LJIIJ().getBgBroadcastServiceName()));
        return intent;
    }

    public final void qS(OBSBroadcastInteractionFragment oBSBroadcastInteractionFragment) {
        Bundle bundle;
        if (this.mStatusDestroyed || getChildFragmentManager().LJJJJZI("AbsInteractionFragment") != null) {
            return;
        }
        getDataChannel().zW(RoomChannel.class, PR());
        this.LLIZLLLIL = oBSBroadcastInteractionFragment;
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle = arguments.getBundle("extra");
        } else {
            bundle = null;
        }
        oBSBroadcastInteractionFragment.setArguments(bundle);
        oBSBroadcastInteractionFragment.PR(getDataChannel(), new AbstractC781140Uka() { // from class: X.0UYz
            @Override // X.AbstractC781140Uka
            public final void LIZIZ(RemindMessage remindMessage) {
                C0UVT c0uvt;
                C0UYF c0uyf = this.LIZ.LLILZLL;
                if (c0uyf != null && (c0uvt = c0uyf.LLILZIL) != null) {
                    c0uvt.LJJJJLI(remindMessage);
                }
            }
        });
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZJ(R.id.kvo, oBSBroadcastInteractionFragment, "AbsInteractionFragment");
        c19ehLJIIJ.LJIIJ();
        oBSBroadcastInteractionFragment.OR(new ARunnableS112S0100000_12(this, 3));
    }

    @Override // X.C0UZ4
    public final void uI(int i) {
        Creator creator = PR().creator;
        if (creator != null) {
            C772830UTh.LIZIZ(i, RR(), getRoomId(), false, creator.roomContinue, 0);
        }
    }

    @Override // X.C0UZ4
    public final void Vf(int i, Cert cert) {
        nS();
        oS(i, -1);
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View ZR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.fxk, viewGroup, false);
    }

    public final void oS(int i, int i2) {
        boolean z;
        if (this.mStatusDestroyed) {
            return;
        }
        if (PR().getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).showBroadCaseEndPage(z);
        C0UZ9 c0uz9 = this.LLJJ;
        C0UYH c0uyh = null;
        if (c0uz9 == null) {
            c0uz9 = null;
        }
        c0uz9.LJIILIIL(i, null);
        C501060Jku.LIZ(PR(), getDataChannel());
        this.LLJIJIL = true;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        Bundle bundle = new Bundle();
        if (i2 == 30003 || i2 == 30003001) {
            bundle.putInt("live_end_error_code", i2);
        }
        InterfaceC773130UUl interfaceC773130UUl = this.LLIZ;
        if (interfaceC773130UUl != null) {
            interfaceC773130UUl.LIZLLL(false);
        }
        InterfaceC773130UUl interfaceC773130UUl2 = this.LLIZ;
        if (interfaceC773130UUl2 != null) {
            interfaceC773130UUl2.LIZ(bundle);
        }
        C0UYH c0uyh2 = this.LLJILLL;
        if (c0uyh2 != null) {
            c0uyh = c0uyh2;
        }
        c0uyh.LJIIIIZZ = true;
        C500260Jjc.LJIILIIL(c0uyh.LJFF);
        C500260Jjc.LJIILIIL(c0uyh.LJ);
        C500260Jjc.LLFFF(c0uyh.LJI);
        c0uyh.LJIIL(false);
    }
}
