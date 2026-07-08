package com.bytedance.android.livesdk.broadcast.trymode;

import X.AbstractC1273900jFs;
import X.C01GW;
import X.C09JN;
import X.C0IGR;
import X.C0IJT;
import X.C0IK5;
import X.C0J1N;
import X.C0J3Y;
import X.C0UAC;
import X.C0UDO;
import X.C0UF5;
import X.C0UGO;
import X.C0UIC;
import X.C0UID;
import X.C0UOQ;
import X.C0UPT;
import X.C0UQK;
import X.C0URG;
import X.C0UTX;
import X.C0UUC;
import X.C0UV0;
import X.C0UYQ;
import X.C1113800f5e;
import X.C1148040fys;
import X.C1148240fzC;
import X.C1161920gLG;
import X.C1163660gO4;
import X.C11JF;
import X.C11NJ;
import X.C11NZ;
import X.C11RD;
import X.C1273890jFr;
import X.C1276840jKc;
import X.C1276890jKh;
import X.C128Y;
import X.C1324720kZq;
import X.C16F5;
import X.C1701940uOG;
import X.C19EG;
import X.C19EH;
import X.C1AKS;
import X.C1EOY;
import X.C20441214yg;
import X.C2093608Ic;
import X.C21406218pw;
import X.C292401Bi;
import X.C452501pT;
import X.C456101q3;
import X.C465520INi;
import X.C465900IOu;
import X.C467050ITf;
import X.C473410IhP;
import X.C474500IjA;
import X.C486790J7d;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501520Jle;
import X.C504210Jpz;
import X.C520010KaN;
import X.C749370TaR;
import X.C753970Thr;
import X.C759970TrX;
import X.C760080Tri;
import X.C760160Trq;
import X.C766270U4b;
import X.C767120U7i;
import X.C768300UBw;
import X.C768460UCm;
import X.C768810UDv;
import X.C770730ULf;
import X.C772290URf;
import X.C772780UTc;
import X.C772830UTh;
import X.C772840UTi;
import X.C773100UUi;
import X.C773150UUn;
import X.C773190UUr;
import X.C774610Ua3;
import X.C776270Ucj;
import X.C779220UhU;
import X.C781270Ukn;
import X.C782110Um9;
import X.C782390Umb;
import X.C784410Upr;
import X.C784440Upu;
import X.C786410Ut5;
import X.C930730aKN;
import X.C930890aKd;
import X.C930940aKi;
import X.C930990aKn;
import X.C931040aKs;
import X.C931260aLE;
import X.C931290aLH;
import X.DialogInterfaceOnDismissListenerC786080UsY;
import X.EnumC1102750enp;
import X.EnumC498960JhW;
import X.EnumC500290Jjf;
import X.EnumC517850KSp;
import X.EnumC768840UDy;
import X.InterfaceC1699460uKG;
import X.InterfaceC1814530xJr;
import X.InterfaceC19562711gH;
import X.InterfaceC20622815ms;
import X.InterfaceC20630715o9;
import X.InterfaceC2262041DgI;
import X.InterfaceC390601fU;
import X.InterfaceC420801kM;
import X.InterfaceC456501q7;
import X.InterfaceC769170UFf;
import X.InterfaceC769210UFj;
import X.InterfaceC771640UOs;
import X.InterfaceC773120UUk;
import X.InterfaceC773130UUl;
import X.InterfaceC773370UVj;
import X.InterfaceC774130UYh;
import X.InterfaceC774920UaY;
import Y.ARunnableS0S1102000_12;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS112S0100000_12;
import Y.AcS494S0100000_7;
import Y.AcS495S0100000_12;
import Y.AfS176S0100000_7;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.VideoGiftStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.RefreshSurfaceViewEvent;
import com.bytedance.android.livesdk.broadcast.TryModeCloseDialogShowing;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.decoration.IDonationStickerOuterService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveEffectCommandChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.VideoBelowBackgroundUpdateEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewFixBackDialogBugSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FixBroadcastLifecycleManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDonationOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableFixLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostTrymodePauseOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeLaunchBroadcastOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeReleaseSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSAvPlayerLazyLoadSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class TryModeBroadcastFragment extends BaseBroadcastFragment implements C1AKS, WeakHandler.IHandler, InterfaceC2262041DgI, InterfaceC774920UaY, InterfaceC773370UVj, Handler.Callback {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswHELIOSKTY4ZzshMSgjLSp9HDc1BCA3LQc+Ji43KyQ/PQkhKSIhLCEn";
    public FrameLayout LLILZLL;
    public C1324720kZq LLIZ;
    public C16F5 LLIZLLLIL;
    public C782390Umb LLJ;
    public C784410Upr LLJI;
    public FrameLayout LLJIJIL;
    public InterfaceC773130UUl LLJJI;
    public C779220UhU LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public long LLJJJJLIIL;
    public C1273890jFr LLJJLIIIJLLLLLLLZ;
    public C0UIC LLJL;
    public VideoWidget LLJLIL;
    public TryModeBroadcastInteractionFragment LLJLILLLLZIIL;
    public C11JF LLJLL;
    public InterfaceC773120UUk LLJZ;
    public final C11NJ LLJILJIL = new C11NJ();
    public final C01GW LLJILJILJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 204));
    public final C01GW LLJILLL = C292401Bi.LIZ(new AwS551S0100000_7(this, 35));
    public final boolean LLJJ = true;
    public boolean LLJJJ = true;
    public final List<InterfaceC420801kM> LLJJL = new ArrayList();
    public boolean LLJLLIL = true;
    public boolean LLJLLL = true;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(91));
    public final C0UAC LLL = new C0UAC();
    public final C01GW LLLF = C292401Bi.LIZ(new AwS551S0100000_7(this, 36));
    public final C0URG LLLFF = new InterfaceC769170UFf() { // from class: X.0URG
        @Override // X.InterfaceC769170UFf
        public final void LIZ(int i, int i2) {
            TryModeBroadcastFragment tryModeBroadcastFragment = this.LIZ;
            if (!tryModeBroadcastFragment.LLJJIJI) {
                tryModeBroadcastFragment.LLJJIJI = true;
                VideoWidget videoWidget = tryModeBroadcastFragment.LLJLIL;
                if (videoWidget != null) {
                    videoWidget.LLIZ = null;
                    C0UHA c0uha = videoWidget.LLJILJILJ;
                    if (c0uha != null) {
                        c0uha.LJI(null);
                    }
                }
                C774610Ua3.LL.LLLLZLLLI();
            }
        }
    };
    public final C0UTX LLLFFI = new C0UGO() { // from class: X.0UTX
        @Override // X.C0UGO
        public final void onError(int i, int i2) {
        }

        @Override // X.C0UGO
        public final void onInfo(int i, int i2, int i3, String str) {
            if (i == 2) {
                C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS0S1102000_12(i2, i3, str, this.LIZ, 1));
            }
        }
    };
    public final C773100UUi LLLFZ = new InterfaceC19562711gH() { // from class: X.0UUi
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            EnumC517850KSp value;
            MutableLiveData<EnumC517850KSp> mutableLiveData;
            C20441214yg.LJIIIZ("LiveBroadcastFragment", "onEnterForeground");
            this.LL.getClass();
            BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) this.LL.LLJILLL.getValue();
            if (broadcastTunnelVM != null && (mutableLiveData = broadcastTunnelVM.LL) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            if (value == EnumC517850KSp.STREAM_ON && C500260Jjc.LJJIFFI((Boolean) this.LL.getDataChannel().gg0(PauseLiveChannel.class))) {
                C1273890jFr c1273890jFr = this.LL.LLJJLIIIJLLLLLLLZ;
                if (c1273890jFr != null) {
                    c1273890jFr.J3(CertProviderManagerKt.findCert("bpea-364", 1476788233), false);
                }
                this.LL.getClass();
            }
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            C20441214yg.LJIIIZ("LiveBroadcastFragment", "onEnterBackground");
            this.LL.getClass();
            C1273890jFr c1273890jFr = this.LL.LLJJLIIIJLLLLLLLZ;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-385", 1476788484));
            }
            this.LL.getClass();
        }
    };

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void HA(long j) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void I1(int i, int i2) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Kj() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void L1(int i) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void LLLLIILL(int i) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Nt() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Th(float f) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Xz(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
    }

    @Override // X.InterfaceC2262041DgI
    public final void Ze(int i, String str, boolean z) {
    }

    @Override // X.InterfaceC774920UaY
    public final void bz() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void cN() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void fE() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C1AKO
    public final void finish() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void gG(boolean z) {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void hS() {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return true;
    }

    @Override // X.InterfaceC774920UaY
    public final void kn(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void ku(int i, int i2, String str) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void mQ() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void pq(int i) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void v5() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void vn(double d, double d2, double d3) {
    }

    @Override // X.InterfaceC774920UaY
    public final void GR() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_network_error");
        c474500IjALIZ.LJJII("2", "error_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void bS() {
        ViewGroup viewGroupJM;
        C772290URf c772290URfLJI;
        AbstractC1273900jFs abstractC1273900jFs;
        AudioDeviceModule audioDeviceModuleLJLLI;
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment;
        if (this.LLJJJJ) {
            return;
        }
        this.LLJJJJ = true;
        InterfaceC769210UFj interfaceC769210UFjLIZJ = C768460UCm.LIZJ();
        interfaceC769210UFjLIZJ.LIZIZ(true);
        interfaceC769210UFjLIZJ.LJI(getDataChannel());
        interfaceC769210UFjLIZJ.LJ(getDataChannel());
        interfaceC769210UFjLIZJ.LIZ();
        interfaceC769210UFjLIZJ.release();
        C768460UCm.LJFF();
        C767120U7i.LIZJ("LiveBroadcastFragment#onLiveDestroyView", true);
        C767120U7i.LJIIIIZZ(getDataChannel(), "LiveBroadcastFragment#onLiveDestroyView");
        C767120U7i.LJII(getDataChannel());
        C767120U7i.LIZ("LiveBroadcastFragment#onLiveDestroyView");
        C767120U7i.LIZLLL(true);
        InterfaceC771640UOs interfaceC771640UOsLJII = C768460UCm.LJII();
        interfaceC771640UOsLJII.LIZJ(true);
        interfaceC771640UOsLJII.LJ(getDataChannel());
        interfaceC771640UOsLJII.LIZIZ(getDataChannel());
        interfaceC771640UOsLJII.LIZ();
        interfaceC771640UOsLJII.release(false);
        C781270Ukn.LJI().getUploadEffectRelatedLog();
        C768300UBw.LIZLLL();
        try {
            tryModeBroadcastInteractionFragment = this.LLJLILLLLZIIL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (tryModeBroadcastInteractionFragment != null) {
            tryModeBroadcastInteractionFragment.RR();
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(tryModeBroadcastInteractionFragment);
            c19ehLJIIJ.LJIIL();
            this.LLJLILLLLZIIL = null;
            VideoWidget videoWidget = this.LLJLIL;
            if (videoWidget != null) {
                videoWidget.C1();
            }
        }
        C1273890jFr c1273890jFr = this.LLJJLIIIJLLLLLLLZ;
        if (c1273890jFr != null && (abstractC1273900jFs = c1273890jFr.LJI) != null && (audioDeviceModuleLJLLI = abstractC1273900jFs.LJLLI()) != null) {
            audioDeviceModuleLJLLI.setAudioCaptureMute(false);
        }
        if (LiveTryModeLaunchBroadcastOptSetting.INSTANCE.enable() || (((c772290URfLJI = C0UF5.LJI()) != null && c772290URfLJI.LIZ) || !this.LLJJIJIIJIL)) {
            DataChannelGlobal.LLILZ.zQ2(C0UYQ.LIZ);
            InterfaceC774130UYh interfaceC774130UYh = C0UYQ.LIZIZ;
            if (interfaceC774130UYh != null) {
                interfaceC774130UYh.release();
            }
            C0UYQ.LIZJ = null;
            if (TTLSAvPlayerLazyLoadSwitch.INSTANCE.isAvPlayerLazyLoad()) {
                C0UYQ.LIZIZ = null;
            }
            if (!this.LLJJJIL) {
                C776270Ucj.LIZ.LIZJ();
            }
        }
        if (!this.LLJJIJIIJIL) {
            ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(false);
            C773150UUn.LIZ = false;
            InterfaceC773120UUk interfaceC773120UUk = this.LLJZ;
            if (interfaceC773120UUk != null) {
                interfaceC773120UUk.tb();
            }
            InterfaceC773120UUk interfaceC773120UUk2 = this.LLJZ;
            if (interfaceC773120UUk2 != null && (viewGroupJM = interfaceC773120UUk2.JM()) != null) {
                viewGroupJM.setBackground(null);
            }
            C0UPT.LL.getViewModelStore().clear();
        }
        DataChannelGlobal.LLILZ.JQ2(C931290aLH.class, null);
        this.LLJILJIL.LJ();
        C781270Ukn.LJIILLIIL().release(getRoomId());
        C781270Ukn.LJIILLIIL().retryReleaseAll();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).onLiveBroadcastActivityDestroyed();
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).onDestroy();
        C0UIC c0uic = this.LLJL;
        if (c0uic != null) {
            c0uic.LIZIZ.zQ2(c0uic);
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void cS() {
        MutableLiveData<EnumC517850KSp> mutableLiveData;
        BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) this.LLJILLL.getValue();
        if (((broadcastTunnelVM == null || (mutableLiveData = broadcastTunnelVM.LL) == null) ? null : mutableLiveData.getValue()) != EnumC517850KSp.STREAM_ON) {
            InterfaceC773130UUl interfaceC773130UUl = this.LLJJI;
            if (interfaceC773130UUl == null) {
                interfaceC773130UUl = null;
            }
            C779220UhU c779220UhU = this.LLJJIII;
            interfaceC773130UUl.LJ(c779220UhU != null ? c779220UhU : null);
            if (!LiveHostTrymodePauseOpt.enable() || !this.LLJJIJIIJIL) {
                Cert certFindCert = CertProviderManagerKt.findCert("bpea-386", 1476788484);
                C1273890jFr c1273890jFr = this.LLJJLIIIJLLLLLLLZ;
                if (c1273890jFr != null) {
                    c1273890jFr.LJIILL(certFindCert);
                }
            }
            C781270Ukn.LJI().pauseAccompanimentPlay(Boolean.FALSE);
            C781270Ukn.LJI().pauseBGM(Boolean.TRUE);
        }
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_page_pause");
        c760160TrqLIZ.LJ("broadcast");
        c760160TrqLIZ.LJIIIZ();
        C1EOY.LIZ.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment.dS():void");
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void gS() {
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_page_start");
        c760160TrqLIZ.LJ("broadcast");
        c760160TrqLIZ.LJIIIZ();
    }

    @Override // X.C1AKS
    public final void i0() {
        AbstractC1273900jFs abstractC1273900jFs;
        C1273890jFr c1273890jFr = this.LLJJLIIIJLLLLLLLZ;
        if (c1273890jFr == null || (abstractC1273900jFs = c1273890jFr.LJI) == null) {
            return;
        }
        abstractC1273900jFs.i0();
    }

    public final void mS() {
        NavigationScene navigationScene;
        C774610Ua3.LL.LLZIL();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_practice_stay");
        c474500IjALIZ.LJJII(Long.valueOf(C0UQK.LIZ > 0 ? SystemClock.elapsedRealtime() - C0UQK.LIZ : -1L), "stay_duration");
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJJII("return", "quit_type");
        c474500IjALIZ.LJJII("return_quit", "leave_from");
        c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C930990aKn.class), "has_enter_trymode");
        c474500IjALIZ.LIZ();
        if (this.LLJJIJIL) {
            this.LLJJJIL = true;
            this.LLJJJ = false;
        }
        if (!C504210Jpz.LIZ) {
            wS(null);
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 202);
        AwS556S0100000_12 awS556S0100000_122 = new AwS556S0100000_12(this, 203);
        IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
        InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(getActivity());
        if (interfaceC20622815msLIZ != null && (navigationScene = interfaceC20622815msLIZ.getNavigationScene()) != null) {
            Iterator it2 = ((ArrayList) navigationScene.getSceneList()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!(next instanceof InterfaceC20630715o9)) {
                    if (next != null) {
                        C520010KaN.LIZLLL(this);
                        return;
                    }
                }
            }
        }
        awS556S0100000_12.invoke();
        C520010KaN.LIZLLL(this);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3((Object) awS556S0100000_122, 17));
    }

    public final C16F5 nS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jdm) : null;
            this.LLIZLLLIL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final FrameLayout oS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ku8) : null;
            this.LLILZLL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout qS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kvo) : null;
            this.LLJIJIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1324720kZq rS() {
        InterfaceC773120UUk interfaceC773120UUk = this.LLJZ;
        if (interfaceC773120UUk != null) {
            return interfaceC773120UUk.Kl();
        }
        return null;
    }

    @Override // X.InterfaceC774920UaY
    public final void HQ() {
        if (C500260Jjc.LJJJI((Boolean) getDataChannel().gg0(PauseLiveChannel.class))) {
            C766270U4b.LJFF(2131853498, getContext());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_network_error");
            c474500IjALIZ.LJJII("1", "error_type");
            c474500IjALIZ.LIZ();
            C759970TrX.LIZ("ttlive_reconnect_stream").LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void UR() {
        BroadcastTimeLog.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        C772780UTc.LIZLLL = System.currentTimeMillis();
        C772840UTi.LIZIZ().LIZ();
        C1273890jFr c1273890jFr = null;
        C1273890jFr c1273890jFrLJIIJJI = C776270Ucj.LIZ.LJIIJJI(true, null, false);
        if (c1273890jFrLJIIJJI != null) {
            c1273890jFrLJIIJJI.G3(this);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C930890aKd.class, c1273890jFrLJIIJJI);
            dataChannelGlobal.HQ2(LiveStreamGlobalChannel.class, c1273890jFrLJIIJJI);
            C1276840jKc c1276840jKc = C1276840jKc.LIZ;
            AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c1273890jFrLJIIJJI, 742);
            c1276840jKc.getClass();
            C1276840jKc.LJJJJLL = awS556S0100000_12;
            C1276840jKc.LJJJJZ = new AwS556S0100000_12(c1273890jFrLJIIJJI, 743);
            C1276840jKc.LJJJJZI = new AwS556S0100000_12(c1273890jFrLJIIJJI, 744);
            c1273890jFr = c1273890jFrLJIIJJI;
        }
        this.LLJJLIIIJLLLLLLLZ = c1273890jFr;
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-460", 1476788233);
        C1273890jFr c1273890jFr2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1273890jFr2 != null) {
            c1273890jFr2.D3(certFindCert);
        }
        getDataChannel().zW(StartPushStreamChannel.class, Boolean.TRUE);
        this.LLJLIL = new VideoWidget(this.LLLFF, new StreamUrlExtra(), this.LLJJLIIIJLLLLLLLZ, this.LLLFFI, null);
        ((WidgetManager) this.LLJILJILJ.getValue()).load(this.LLJLIL);
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 286));
        }
        C781270Ukn.LJII().fetchGiftAnchorPanelActivityInfo(PR(), getDataChannel());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || room.getOwner().getSecUid() == null) {
            return;
        }
        ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).BW0(Long.valueOf(room.getId()), room.getOwner().getSecUid(), getDataChannel(), this, false);
        if (LiveShortTouchApiMergeSetting.INSTANCE.enable()) {
            ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).Y92(getDataChannel(), Long.valueOf(room.getId()), this);
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void aS() {
        C772290URf c772290URfLJI;
        C772290URf c772290URfLJI2;
        super.aS();
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        if (this.LLJJJ) {
            ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).clearOpenLiveMultiTabPageParams();
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).destroyGiftBannedManager();
        C497700JfU.LIZ.LIZJ(false, EnumC768840UDy.BROADCAST);
        if (!FixBroadcastLifecycleManager.enable()) {
            if (!this.LLJJIJIIJIL) {
                C781270Ukn.LJI().onEndBroadcast();
            }
            C774610Ua3.LL.LLLZZ(true, this.LLJJIJIIJIL);
        }
        C486790J7d.LIZ(new ARunnableS112S0100000_12(this, 97));
        getDataChannel().zQ2(this);
        C473410IhP.LJI();
        C0IK5.LIZLLL(null);
        LiveMonitorSampleSetting.INSTANCE.release();
        C1163660gO4.LIZ.getClass();
        C1163660gO4.LJ(true);
        LiveTryModeLaunchBroadcastOptSetting liveTryModeLaunchBroadcastOptSetting = LiveTryModeLaunchBroadcastOptSetting.INSTANCE;
        if ((liveTryModeLaunchBroadcastOptSetting.enable() || ((c772290URfLJI2 = C0UF5.LJI()) != null && c772290URfLJI2.LIZ)) && !this.LLJJJIL) {
            DataChannelGlobal.LLILZ.IQ2(C930890aKd.class);
        }
        if (!this.LLJJIJIIJIL) {
            if (liveTryModeLaunchBroadcastOptSetting.disable() && (((c772290URfLJI = C0UF5.LJI()) == null || !c772290URfLJI.LIZ) && !this.LLJJJIL)) {
                if (!LiveTryModeReleaseSetting.INSTANCE.enable()) {
                    C776270Ucj.LIZ.LIZLLL(null, false);
                }
                DataChannelGlobal.LLILZ.IQ2(C930890aKd.class);
            }
            DataChannelGlobal.LLILZ.IQ2(C930940aKi.class);
            LiveBroadcastPictureMemOpt.INSTANCE.setAnchor(false);
            if (FixBroadcastLifecycleManager.enable()) {
                C774610Ua3.LL.LLLZZ(true, false);
                C781270Ukn.LJI().onEndBroadcast();
            }
            InterfaceC1814530xJr boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager();
            if (boardsDisplayStateManager != null) {
                boardsDisplayStateManager.release();
            }
            InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
            if (effectBoardService != null) {
                effectBoardService.release();
            }
            InterfaceC456501q7 liveBoardsEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveBoardsEffectHelper();
            if (liveBoardsEffectHelper != null) {
                ((C456101q3) liveBoardsEffectHelper).LIZIZ();
            }
            C465520INi.LIZ.setIsAnchor(false);
            C781270Ukn.LJJ().WC();
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        C781270Ukn.LJIJJ().Xj1().z0();
        try {
            C781270Ukn.LJII().clearAssets("effects");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZLLL(e.toString());
        }
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_page_destroy");
        c760160TrqLIZ.LJ("broadcast");
        c760160TrqLIZ.LJIIIZ();
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.sw0("stream");
        iPerformanceManager.yL0();
        iPerformanceManager.release();
        iPerformanceManager.oB1();
        iPerformanceManager.d01(-1.0f);
        iPerformanceManager.Gp0(-1.0d);
        ((ArrayList) C0UOQ.LJFF).clear();
        ((LinkedHashMap) C0UOQ.LJ).clear();
        C0UOQ.LJI = false;
        iPerformanceManager.setExtraParams(null);
        C1EOY c1eoy = C1EOY.LIZ;
        C1EOY.LJIIIIZZ();
        C0J3Y.LIZ.getClass();
        C0J3Y.LJIJ();
        C781270Ukn.LJJIIJ().Yg();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C931260aLE.class);
        dataChannelGlobal.IQ2(C1148040fys.class);
        Iterator it2 = ((ArrayList) this.LLJJL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) it2.next()).dispose();
        }
        C11JF c11jf = this.LLJLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C781270Ukn.LJI().releaseAccompanimentResources(true, this.LLJJIJIIJIL);
        C781270Ukn.LJI().releaseBGMPlayerManager(true, this.LLJJIJIIJIL);
        if (!this.LLJJIJIIJIL) {
            DataChannelGlobal.LLILZ.JQ2(C930730aKN.class, Boolean.TRUE);
        }
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJJIIZI();
        C760080Tri.LIZ();
        boolean z = C768810UDv.LIZ;
        C768810UDv.LIZ(getDataChannel());
        C0UUC.LIZ.LIZLLL(getDataChannel());
        C781270Ukn.LJI().releaseNaviAvatarResources();
        C773190UUr value = C773190UUr.LIZIZ.getValue();
        value.getClass();
        if (NegativeTestExperiment.INSTANCE.isEnable()) {
            C20441214yg.LJIIIZ("negative_test", "endNegativeTest--------!!!!!!");
            ExecutorService executorService = value.LIZ;
            if (executorService != null) {
                executorService.shutdownNow();
            }
            value.LIZ = null;
        }
        C1276890jKh.LJ();
        C1276840jKc.LJJJJLI = null;
        C1276840jKc.LJJJJLL = null;
        C1276840jKc.LJJJJZ = null;
        C1276840jKc.LJJJJZI = null;
        if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LJIJ();
            ((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).kE2();
        }
        DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.FALSE);
        if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
            PreviewContinueLiveHelper.LIZ.getClass();
            PreviewContinueLiveHelper.LIZJ = null;
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C1AKO
    public final boolean onBackPressed() {
        C0IGR c0igr;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        C0IGR c0igr2;
        if (!isAdded()) {
            return true;
        }
        C19EG activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            for (C128Y c128y : listLJJLIIIJL) {
                if ((c128y instanceof C0IGR) && (c0igr2 = (C0IGR) c128y) != null && c0igr2.onBackPressed()) {
                    return true;
                }
            }
        }
        for (C128Y c128y2 : getChildFragmentManager().LJJLIIIJL()) {
            if ((c128y2 instanceof C0IGR) && (c0igr = (C0IGR) c128y2) != null && c0igr.onBackPressed()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C0IP3
    public final DataChannel provideDataChannel() {
        return getDataChannel();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final boolean SR() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC774920UaY
    public final void onStreamStart() {
        C21406218pw.LIZIZ();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void WR(Bundle bundle) {
        boolean z;
        Long lValueOf;
        InterfaceC1699460uKG interfaceC1699460uKGWr1;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        this.LLJLLIL = true;
        this.LLJJJ = true;
        this.LLJJJIL = false;
        Bundle arguments = getArguments();
        if (arguments != null && (bundle4 = arguments.getBundle("extra")) != null) {
            z = bundle4.getBoolean("go_multi_tab_page");
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
        C773150UUn.LIZIZ = -10;
        C773150UUn.LIZJ = false;
        C773150UUn.LIZ = true;
        DataChannel dataChannel = getDataChannel();
        Boolean bool = Boolean.TRUE;
        dataChannel.SX0(C749370TaR.class, bool);
        DataChannel dataChannel2 = getDataChannel();
        Bundle arguments2 = getArguments();
        Long lValueOf2 = null;
        if (arguments2 != null && (bundle3 = arguments2.getBundle("extra")) != null) {
            lValueOf = Long.valueOf(bundle3.getLong("room_mock_id"));
        } else {
            lValueOf = null;
        }
        dataChannel2.SX0(C753970Thr.class, lValueOf);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (bundle2 = arguments3.getBundle("extra")) != null) {
            lValueOf2 = Long.valueOf(bundle2.getLong("room_mock_id"));
        }
        dataChannelGlobal.JQ2(C931260aLE.class, lValueOf2);
        getDataChannel().zW(RoomChannel.class, PR());
        C0UQK.LIZ = SystemClock.elapsedRealtime();
        C1276890jKh.LIZJ();
        C21406218pw.LIZJ();
        C497700JfU.LIZ.LIZJ(true, EnumC768840UDy.BROADCAST);
        C773190UUr.LIZIZ.getValue().LIZ();
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJJIIJ();
        C772830UTh.LIZ = false;
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        dataChannelGlobal2.BQ2(this, this, VideoBelowBackgroundUpdateEvent.class, new AwS586S0100000_7(this, 62));
        C486790J7d.LIZ(new Runnable() { // from class: X.0UTf
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TryModeBroadcastFragment@9777.onLiveCreate$2");
                try {
                    System.currentTimeMillis();
                    C772780UTc.LIZ = false;
                    System.currentTimeMillis();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TryModeBroadcastFragment@9777.onLiveCreate$2");
            }
        });
        System.currentTimeMillis();
        super.WR(bundle);
        C774610Ua3.LL.LLLZL(this, getDataChannel());
        C781270Ukn.LJIL().LLZZZIL(getDataChannel());
        if (!LiveDonationOptSetting.INSTANCE.enable()) {
            ((IDonationStickerOuterService) C781270Ukn.LJIJJ.getValue()).LLZZZIL(getDataChannel());
        }
        C781270Ukn.LJJ().LLZZZIL(getDataChannel());
        C1EOY.LIZ.LJIILIIL();
        C0J3Y c0j3y = C0J3Y.LIZ;
        Context context = getContext();
        c0j3y.getClass();
        C0J3Y.LJIIJJI(context);
        C781270Ukn.LJIILJJIL().ad1(getContext());
        IPublicScreenService iPublicScreenServiceLJIJI = C781270Ukn.LJIJI();
        getContext();
        iPublicScreenServiceLJIJI.aJ2();
        C0UV0.LiveResource.preload();
        C781270Ukn.LJIJJ().Xj1().r0();
        DataChannel dataChannel3 = getDataChannel();
        dataChannel3.EQ2(this, VideoGiftStartEvent.class, new AwS591S0100000_12(this, 455));
        dataChannel3.BQ2(this, LiveEffectCommandChannel.class, new AwS591S0100000_12(this, 456));
        dataChannel3.BQ2(this, AnchorBroadcastResolutionChangeEvent.class, new AwS591S0100000_12(this, 457));
        dataChannel3.EQ2(this, LiveCenterStatusChannel.class, new AwS591S0100000_12(this, 458));
        dataChannel3.BQ2(this, RefreshSurfaceViewEvent.class, new AwS591S0100000_12(this, 459));
        dataChannel3.BQ2(this, TryModeGoLiveChannel.class, new AwS591S0100000_12(this, 460));
        dataChannel3.zW(UserIsAnchorChannel.class, bool);
        if (C2093608Ic.LIZJ("referral_task", (String) dataChannelGlobal2.gg0(C931040aKs.class))) {
            List<C467050ITf> liveActivityTasksSetting = C781270Ukn.LJIIJ().getLiveActivityTasksSetting();
            if (liveActivityTasksSetting != null && liveActivityTasksSetting.size() > 0) {
                for (C467050ITf c467050ITf : liveActivityTasksSetting) {
                    Integer num = c467050ITf.LIZ;
                    if (num != null && num.intValue() == 4) {
                        ((ArrayList) this.LLJJL).add(C11NZ.LJLJL(c467050ITf.LIZIZ.longValue(), TimeUnit.SECONDS, C1701940uOG.LIZIZ()).LJJLJLI(new AfS176S0100000_7(c467050ITf, 23)));
                    }
                }
            }
            this.LLL.LIZ();
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C465900IOu.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 165), new C09JN() { // from class: X.00Lc
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("TryModeBroadcastFragment@9777.registerRxBus$2");
                C1C7U.LIZIZ("TryModeBroadcastFragment@9777.registerRxBus$2");
            }
        });
        MR(C781270Ukn.LJIIJJI().registerAppEnterForeBackgroundCallback(this.LLLFZ));
        C0UOQ.LJI = true;
        C465520INi.LIZ.setExtraParams(C0UOQ.LJ);
        DataChannelGlobal.LLILZ.HQ2(BroadcastShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
        IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
        if (iPullStreamService != null && (interfaceC1699460uKGWr1 = iPullStreamService.Wr1()) != null) {
            interfaceC1699460uKGWr1.LIZ("try_mode_broadcast");
        }
        C0UYQ.LIZ.init();
        IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
        if (iHostUser != null) {
            iHostUser.reportData("broadcast");
        }
        if (TryModeGuidanceSetting.INSTANCE.inExperiment() && C0UID.LJIIJ(getDataChannel())) {
            this.LLJL = new C0UIC(LifecycleOwnerKt.getLifecycleScope(this), getDataChannel());
        }
        C0UUC.LIZ.LIZ(getDataChannel());
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C501520Jle c501520Jle;
        if (message.what == 3) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if ((messageObj instanceof C501470JlZ) && (c501520Jle = (C501520Jle) messageObj) != null) {
                c501520Jle.getErrorCode();
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void iS(View view) {
        VideoWidget videoWidget;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        View view3;
        FrameLayout.LayoutParams layoutParams3 = null;
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initGiftBannedManager(null, getDataChannel(), true);
        if (LiveEnableFixLiveEndSetting.INSTANCE.enable() && (videoWidget = this.LLJLIL) != null && (view2 = videoWidget.getView()) != null) {
            VideoWidget videoWidget2 = this.LLJLIL;
            if (videoWidget2 != null && (view3 = videoWidget2.getView()) != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.leftMargin = 1;
                layoutParams2.rightMargin = 1;
                layoutParams3 = layoutParams2;
            }
            C786410Ut5.W5(view2, layoutParams3);
        }
        EnumC500290Jjf.VIDEO.config();
        this.LLJJIII = new C779220UhU(this);
        C781270Ukn.LJII().resetRoomStatus(false);
        DataChannel dataChannel = getDataChannel();
        dataChannel.BQ2(this, DrawGuessStartGameEvent.class, new AwS591S0100000_12(this, 767));
        dataChannel.BQ2(this, DrawGuessExitGameEvent.class, new AwS591S0100000_12(this, 768));
        dataChannel.BQ2(this, DrawGuessFreelyStartChannel.class, new AwS591S0100000_12(this, 770));
        C786410Ut5.LJLIIL(LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value(), C0IK5.LIZ(), new ARunnableS107S0100000_7(this, 172));
        EnumC1102750enp.BEAUTY.load(getDataChannel(), new C0UDO() { // from class: X.0UF7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                if (this.LL.LLJLIL == null) {
                    return;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_beauty_click");
                c474500IjALIZ.LJIJJLI(this.LL.getDataChannel());
                c474500IjALIZ.LJIIJJI("live_take");
                c474500IjALIZ.LJIILL("click");
                c474500IjALIZ.LIZ();
                if (view4.getContext() == null) {
                    return;
                }
                C1ALS c1als = C1ALS.LIZ;
                C1ALS.LIZ();
                C768460UCm.LIZ(view4.getContext(), this.LL.getDataChannel()).show(this.LL.getChildFragmentManager(), "");
            }
        });
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).fW1(getContext(), getDataChannel(), EnumC498960JhW.BROADCAST);
    }

    @Override // X.InterfaceC773370UVj
    public final void ld(String str) {
        C1273890jFr c1273890jFr;
        if (Intrinsics.LJFF(TelephonyManager.EXTRA_STATE_IDLE, str)) {
            C1273890jFr c1273890jFr2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1273890jFr2 != null) {
                c1273890jFr2.J3(CertProviderManagerKt.findCert("bpea-366", 1476788233), false);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(TelephonyManager.EXTRA_STATE_OFFHOOK, str) || (c1273890jFr = this.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-387", 1476788481));
    }

    public final void onEvent(C465900IOu c465900IOu) {
        int i = c465900IOu.LIZ;
        if (i != 6 && i != 8) {
            return;
        }
        DataChannel dataChannel = getDataChannel();
        Boolean bool = Boolean.TRUE;
        dataChannel.zW(TryModeCloseDialogShowing.class, bool);
        if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), bool)) {
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131853241);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131853240));
            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131855356), new AcS495S0100000_12(this, 35));
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131853239), new AcS494S0100000_7(this, 2));
            c782110Um9.LJIILL = false;
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 23);
            C786410Ut5.E4(c782110Um9.LIZ());
            uS("show");
            return;
        }
        C782110Um9 c782110Um92 = new C782110Um9(getContext());
        c782110Um92.LIZJ = C497740JfY.LJIJI(2131855357);
        c782110Um92.LJIIIZ(C497740JfY.LJIJI(2131855354));
        c782110Um92.LJIILJJIL(C497740JfY.LJIJI(2131855356), new AcS495S0100000_12(this, 36));
        c782110Um92.LJIIJJI(C497740JfY.LJIJI(2131855355), new AcS495S0100000_12(this, 37));
        c782110Um92.LJIILL = false;
        c782110Um92.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 24);
        C786410Ut5.E4(c782110Um92.LIZ());
        sS("show");
    }

    public final void sS(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_practice_end_popup");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJJII("return_quit", "show_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void uS(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_live_prepare_leave_popup");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void wS(Context context) {
        if (this.LLJJIJIL) {
            ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).startIndependentLivePage(context);
        } else {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "sslocal://openRecord?enter_from=direct_shoot&tab=live", new Bundle());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View ZR(android.view.LayoutInflater r8, android.view.ViewGroup r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment.ZR(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void VR(int i, int i2, Intent intent) {
        TryModeBroadcastInteractionFragment tryModeBroadcastInteractionFragment = this.LLJLILLLLZIIL;
        if (tryModeBroadcastInteractionFragment != null) {
            tryModeBroadcastInteractionFragment.onActivityResult(i, i2, intent);
        }
    }
}
