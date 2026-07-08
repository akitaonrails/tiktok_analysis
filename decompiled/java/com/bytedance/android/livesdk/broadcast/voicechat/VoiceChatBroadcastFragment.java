package com.bytedance.android.livesdk.broadcast.voicechat;

import X.AbstractC1273900jFs;
import X.C01GW;
import X.C01QD;
import X.C09JN;
import X.C0IJT;
import X.C0IK5;
import X.C0J1N;
import X.C0J1R;
import X.C0J3Y;
import X.C0U30;
import X.C0UHC;
import X.C0UO0;
import X.C0UPT;
import X.C0UQK;
import X.C0UUC;
import X.C0UV0;
import X.C0UVT;
import X.C0UVU;
import X.C0UVW;
import X.C0UYL;
import X.C0UYQ;
import X.C0UYZ;
import X.C0UZ9;
import X.C0UZI;
import X.C0UZP;
import X.C0UZS;
import X.C1133830fbx;
import X.C1152720g6Q;
import X.C1161920gLG;
import X.C1163660gO4;
import X.C11JF;
import X.C11NJ;
import X.C11NZ;
import X.C11RD;
import X.C1273890jFr;
import X.C1276840jKc;
import X.C1548820qPI;
import X.C15CY;
import X.C16FZ;
import X.C1701940uOG;
import X.C1811860xFY;
import X.C1871910yoP;
import X.C19322110iZ;
import X.C19748512Ol;
import X.C19EG;
import X.C19EH;
import X.C1CC2;
import X.C1EOY;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2093608Ic;
import X.C2097608Jq;
import X.C21406218pw;
import X.C2188811AlT;
import X.C2262001DgE;
import X.C262100zr;
import X.C292401Bi;
import X.C354201Zc;
import X.C464550IJp;
import X.C465520INi;
import X.C465900IOu;
import X.C473410IhP;
import X.C474500IjA;
import X.C475510Ikn;
import X.C486980J7w;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501060Jku;
import X.C501470JlZ;
import X.C501520Jle;
import X.C516680KOc;
import X.C751340Tdc;
import X.C753450Th1;
import X.C753460Th2;
import X.C759970TrX;
import X.C760160Trq;
import X.C761830TuX;
import X.C766270U4b;
import X.C768460UCm;
import X.C768810UDv;
import X.C769130UFb;
import X.C772200UQw;
import X.C772780UTc;
import X.C772830UTh;
import X.C774080UYc;
import X.C774290UYx;
import X.C774500UZs;
import X.C774580Ua0;
import X.C774610Ua3;
import X.C774760UaI;
import X.C776260Uci;
import X.C776270Ucj;
import X.C779220UhU;
import X.C781270Ukn;
import X.C781300Ukq;
import X.C782110Um9;
import X.C782390Umb;
import X.C784410Upr;
import X.C784440Upu;
import X.C784600UqA;
import X.C784610UqB;
import X.C786410Ut5;
import X.C930580aK8;
import X.C930890aKd;
import X.C930940aKi;
import X.DialogC778400UgA;
import X.DialogInterfaceOnCancelListenerC785950UsL;
import X.DialogInterfaceOnDismissListenerC786080UsY;
import X.EnumC486990J7x;
import X.EnumC498960JhW;
import X.EnumC500290Jjf;
import X.EnumC517850KSp;
import X.EnumC768840UDy;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC19562711gH;
import X.InterfaceC2262041DgI;
import X.InterfaceC753420Tgy;
import X.InterfaceC769170UFf;
import X.InterfaceC772190UQv;
import X.InterfaceC773130UUl;
import X.InterfaceC773370UVj;
import X.InterfaceC774350UZd;
import X.InterfaceC774360UZe;
import X.InterfaceC774410UZj;
import X.InterfaceC774730UaF;
import X.InterfaceC774920UaY;
import X.InterfaceC775290Ub9;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS84S1100000_12;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS112S0100000_12;
import Y.AcS21S0310000_12;
import Y.AfS181S0100000_12;
import Y.AfS27S2100000_12;
import Y.AfS2S1100100_12;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiCoHostFeedbackSubmitEvent;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.api.StatusApi;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.IllegalReviewDialog;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.layer.VoiceChatWidget;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.BlockCloseLiveReasonChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastDisableSubOnlyTrialLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkStatus;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.EndLiveWithoutEndPage;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardStartTimeChannel;
import com.bytedance.android.livesdk.dataChannel.NotifyServerLiveEndSucceedEvent;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.PunishInfoChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ServerTimeGapChangeEvent;
import com.bytedance.android.livesdk.dataChannel.ShowEndPageEvent;
import com.bytedance.android.livesdk.dataChannel.StartPollMessageSEIEvent;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.VoiceChatStartFailedEvent;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageV2ABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAllModePingIntervalDropSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableFixLiveEndSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVoiceChatFixContextAssignment;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCaptionAnchorSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.tunnel.BroadcastTunnelVM;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class VoiceChatBroadcastFragment extends BaseBroadcastFragment implements InterfaceC2262041DgI, InterfaceC774920UaY, InterfaceC775290Ub9, WeakHandler.IHandler, Handler.Callback, InterfaceC773370UVj, C0UVU, InterfaceC1141530foN {
    public static boolean LLLL = false;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4HELIOSZzk8ISYpKicyPGsaJiYwLQYkKDsROiotLSwyOzEKOy40JSAiPQ==";
    public FrameLayout LLILZLL;
    public FrameLayout LLIZ;
    public C782390Umb LLIZLLLIL;
    public C784410Upr LLJ;
    public C16FZ LLJI;
    public C781300Ukq LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public InterfaceC773130UUl LLJJ;
    public C0UVT LLJJI;
    public IllegalReviewDialog LLJJIII;
    public LiveDialog LLJJIJI;
    public C779220UhU LLJJIJIL;
    public C1273890jFr LLJJJ;
    public C0UZ9 LLJJJIL;
    public long LLJJJJ;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public VoiceChatBroadcastInteractionFragment LLJLILLLLZIIL;
    public boolean LLJLL;
    public VoiceChatWidget LLJLLIL;
    public BPEAHandler LLJLLL;
    public ARunnableS112S0100000_12 LLJZ;
    public int LLJZIJLIL;
    public volatile boolean LLL;
    public String LLLFF;
    public CharSequence LLLFFI;
    public CharSequence LLLFZ;
    public CharSequence LLLI;
    public C774580Ua0 LLLIIII;
    public StreamUrlExtra LLLJ;
    public final C11NJ LLJILLL = new C11NJ();
    public final C01GW LLJJIJIIJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 230));
    public boolean LLJJJJJIL = true;
    public boolean LLJJJJLIIL = true;
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 232));
    public final C01GW LLLII = C292401Bi.LIZ(new AwS556S0100000_12(this, 228));
    public final C01GW LLLIIIIL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(101));
    public final String LLLIIIL = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
    public final C01GW LLLIIL = C292401Bi.LIZ(new AwS551S0100000_7(this, 38));
    public final C01GW LLLIILIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 234));
    public final C01GW LLLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 229));
    public final C01GW LLLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 233));
    public final C01GW LLLILZJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 231));
    public final C01GW LLLILZLLLI = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(26));
    public final C769130UFb LLLIZZ = new InterfaceC769170UFf() { // from class: X.0UFb
        @Override // X.InterfaceC769170UFf
        public final void LIZ(int i, int i2) {
            VoiceChatBroadcastFragment voiceChatBroadcastFragment = this.LIZ;
            if (!voiceChatBroadcastFragment.LLJL) {
                voiceChatBroadcastFragment.LLJL = true;
                System.currentTimeMillis();
                VoiceChatWidget voiceChatWidget = voiceChatBroadcastFragment.LLJLLIL;
                if (voiceChatWidget != null) {
                    voiceChatWidget.LL = null;
                    InterfaceC769940UIe interfaceC769940UIe = voiceChatWidget.LLILLJJLI;
                    if (interfaceC769940UIe != null) {
                        interfaceC769940UIe.LJIJI(null);
                    }
                }
                voiceChatBroadcastFragment.qS().postDelayed(new ARunnableS112S0100000_12(voiceChatBroadcastFragment, 457), 10000L);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_microphone_occupied_toast_show");
                c474500IjALIZ.LJIJJLI(voiceChatBroadcastFragment.getDataChannel());
                c474500IjALIZ.LIZ();
            }
        }
    };
    public final C0UYL LLLJIL = new InterfaceC19562711gH() { // from class: X.0UYL
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            EnumC517850KSp value;
            MutableLiveData<EnumC517850KSp> mutableLiveData;
            C20441214yg.LJIIIZ("VoiceChatBroadcastFragment", "onEnterForeground");
            VoiceChatBroadcastFragment voiceChatBroadcastFragment = this.LL;
            voiceChatBroadcastFragment.LLJILJIL = false;
            BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) voiceChatBroadcastFragment.LLLIIL.getValue();
            if (broadcastTunnelVM != null && (mutableLiveData = broadcastTunnelVM.LL) != null) {
                value = mutableLiveData.getValue();
            } else {
                value = null;
            }
            if (value == EnumC517850KSp.STREAM_ON && C500260Jjc.LJJIFFI((Boolean) this.LL.getDataChannel().gg0(PauseLiveChannel.class))) {
                C1273890jFr c1273890jFr = this.LL.LLJJJ;
                if (c1273890jFr != null) {
                    c1273890jFr.J3(CertProviderManagerKt.findCert("bpea-anchor-resume-broadcast", 1476788492), false);
                }
                C0UZ9 c0uz9 = this.LL.LLJJJIL;
                if (c0uz9 != null) {
                    c0uz9.LJ(2);
                }
            }
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            C20441214yg.LJIIIZ("VoiceChatBroadcastFragment", "onEnterBackground");
            VoiceChatBroadcastFragment voiceChatBroadcastFragment = this.LL;
            voiceChatBroadcastFragment.LLJILJIL = true;
            C1273890jFr c1273890jFr = voiceChatBroadcastFragment.LLJJJ;
            if (c1273890jFr != null) {
                c1273890jFr.LJIILL(CertProviderManagerKt.findCert("bpea-anchor-pause-broadcast", 1476788484));
            }
            C0UZ9 c0uz9 = this.LL.LLJJJIL;
            if (c0uz9 != null) {
                c0uz9.LIZLLL(2);
            }
        }
    };
    public boolean LLLJL = true;

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void HA(long j) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void HQ() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Kj() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void L1(int i) {
    }

    @Override // X.InterfaceC774920UaY
    public final void Nt() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Th(float f) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Xz(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void bz() {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void cS() {
        MutableLiveData<EnumC517850KSp> mutableLiveData;
        this.LLJILJIL = true;
        uS(getDataChannel(), true);
        BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) this.LLLIIL.getValue();
        if (((broadcastTunnelVM == null || (mutableLiveData = broadcastTunnelVM.LL) == null) ? null : mutableLiveData.getValue()) != EnumC517850KSp.STREAM_ON) {
            InterfaceC773130UUl interfaceC773130UUl = this.LLJJ;
            if (interfaceC773130UUl != null) {
                C779220UhU c779220UhU = this.LLJJIJIL;
                interfaceC773130UUl.LJ(c779220UhU != null ? c779220UhU : null);
            }
            Cert certFindCert = CertProviderManagerKt.findCert("bpea-anchor-pause-broadcast", 1476788484);
            C774580Ua0 c774580Ua0 = this.LLLIIII;
            if (c774580Ua0 != null) {
                c774580Ua0.LIZIZ(certFindCert, false, false, new AwS556S0100000_12(this, 966));
            }
            C781270Ukn.LJI().pauseAccompanimentPlay(Boolean.FALSE);
        }
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_page_pause");
        c760160TrqLIZ.LJ("broadcast");
        c760160TrqLIZ.LJIIIZ();
        C1EOY.LIZ.LJII();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void dS() {
        C0UZ9 c0uz9;
        MutableLiveData<EnumC517850KSp> mutableLiveData;
        BPEAHandler bPEAHandler;
        this.LLJILJIL = false;
        if (this.LLJL && Intrinsics.LJFF(getDataChannel().gg0(PauseLiveChannel.class), Boolean.FALSE) && (bPEAHandler = this.LLJLLL) != null) {
            C786410Ut5.LJLJJI(100, Mp4ScreenVideoLoadTimeout.CONTROL, bPEAHandler);
        }
        uS(getDataChannel(), false);
        C1EOY.LIZ.LJIIIZ();
        BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) this.LLLIIL.getValue();
        if (broadcastTunnelVM != null && (mutableLiveData = broadcastTunnelVM.LL) != null) {
            mutableLiveData.setValue(EnumC517850KSp.STREAM_PAUSE);
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            qS().removeCallbacksAndMessages(null);
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
        InterfaceC773130UUl interfaceC773130UUl = this.LLJJ;
        if (interfaceC773130UUl != null) {
            C779220UhU c779220UhU = this.LLJJIJIL;
            if (c779220UhU == null) {
                c779220UhU = null;
            }
            interfaceC773130UUl.LIZIZ(c779220UhU, intentFilter);
        }
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-voice-onLiveResume-365", 1476788492);
        if (C500260Jjc.LJJIFFI((Boolean) getDataChannel().gg0(PauseLiveChannel.class))) {
            C1273890jFr c1273890jFr = this.LLJJJ;
            if (c1273890jFr != null) {
                c1273890jFr.P3(certFindCert, false);
            }
            if (LLLL) {
                if (C500260Jjc.LJJJI((Boolean) DataChannelGlobal.LLILZ.gg0(C930580aK8.class)) && (c0uz9 = this.LLJJJIL) != null) {
                    c0uz9.LLJI = true;
                }
                C0UZ9 c0uz92 = this.LLJJJIL;
                if (c0uz92 != null) {
                    c0uz92.LJ(3);
                }
            } else {
                C0UZ9 c0uz93 = this.LLJJJIL;
                if (c0uz93 != null) {
                    c0uz93.LJ(2);
                }
            }
        } else {
            C0UZ9 c0uz94 = this.LLJJJIL;
            if (c0uz94 != null && c0uz94.LLILLL) {
                c0uz94.LJIIJJI(3, 0, 1);
            }
        }
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_page_resume");
        c760160TrqLIZ.LJ("broadcast");
        c760160TrqLIZ.LJIIIZ();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (C500260Jjc.LJJIFFI(dataChannelLJ != null ? (Boolean) dataChannelLJ.gg0(ECLiveStatusChangeChannel.class) : null)) {
            Integer num = (Integer) getDataChannel().gg0(TtlsLiveProductNumber.class);
            if (num == null || num.intValue() == 0) {
                C768460UCm.LJIIIIZZ();
                if (C761830TuX.LIZJ()) {
                    return;
                }
                C781270Ukn.LJI().resumeAccompanimentPlay();
            }
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void fE() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void gG(boolean z) {
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void kn(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void mQ() {
    }

    @Override // X.InterfaceC774920UaY
    public final void onStreamStart() {
        this.LLJJJJJIL = false;
        C0UZ9 c0uz9 = this.LLJJJIL;
        if (c0uz9 != null) {
            c0uz9.LJIIL();
        }
        HS(1);
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void v5() {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void vn(double d, double d2, double d3) {
    }

    public final void QS() {
        BPEAHandler bPEAHandler = this.LLJLLL;
        if (bPEAHandler != null) {
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJZ;
            if (aRunnableS112S0100000_12 == null) {
                aRunnableS112S0100000_12 = null;
            }
            C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS112S0100000_12);
        }
    }

    public final void RS() {
        C20441214yg.LIZIZ("linkmic_anchor_resume", "VoiceChatBroadcastFragment_startPushStream");
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_stream_url");
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            C1273890jFr c1273890jFr = this.LLJJJ;
            if (c1273890jFr != null) {
                c1273890jFr.LJJIFFI(PR().getStreamUrl().pushUrlList, true);
            }
            c760160TrqLIZ.LIZLLL("url_list", PR().getStreamUrl().pushUrlList.toString());
        } else {
            C1273890jFr c1273890jFr2 = this.LLJJJ;
            if (c1273890jFr2 != null) {
                c1273890jFr2.LJJI(PR().getStreamUrl().LIZLLL, true);
            }
            c760160TrqLIZ.LIZLLL("url", PR().getStreamUrl().LIZLLL);
        }
        c760160TrqLIZ.LJIIIZ();
    }

    public final void US() {
        if (!this.LLJJL) {
            this.LLJJL = true;
            LiveMessageSEI liveMessageSEI = new LiveMessageSEI();
            liveMessageSEI.timestamp = System.currentTimeMillis();
            LiveMessageID liveMessageID = new LiveMessageID();
            liveMessageID.primaryID = String.valueOf(getRoomId());
            liveMessageID.messageScene = "end_room";
            liveMessageSEI.uniqueID = liveMessageID;
            C1273890jFr c1273890jFr = this.LLJJJ;
            if (c1273890jFr != null) {
                c1273890jFr.LIZ("live_message_sei", "1610665990", new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, liveMessageSEI)), false);
            }
        }
        qS().removeCallbacksAndMessages(null);
        C0UVT c0uvt = this.LLJJI;
        if (c0uvt != null) {
            c0uvt.LJJJJLL();
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        C486980J7w.LIZLLL(EnumC486990J7x.CreateLive);
        C465520INi.LIZ.NE1();
    }

    @Override // X.C0UVU
    public final void cG() {
        IllegalReviewDialog illegalReviewDialog;
        if (this.mStatusViewValid) {
            HashMap map = new HashMap();
            map.put("show_illegal_review_dialog", Boolean.TRUE);
            C1CC2.LJII(0, "ttlive_broadcast_action_all", map);
            if (this.LLJJIII == null) {
                Context context = getContext();
                C0UVT c0uvt = this.LLJJI;
                if (c0uvt == null) {
                    c0uvt = null;
                }
                IllegalReviewDialog illegalReviewDialog2 = new IllegalReviewDialog();
                illegalReviewDialog2.LL = context;
                illegalReviewDialog2.LLJILJIL = c0uvt;
                this.LLJJIII = illegalReviewDialog2;
                C0UVT c0uvt2 = this.LLJJI;
                (c0uvt2 != null ? c0uvt2 : null).LLJI = illegalReviewDialog2;
            }
            if (getActivity() == null || (illegalReviewDialog = this.LLJJIII) == null) {
                return;
            }
            illegalReviewDialog.show(getChildFragmentManager(), "IllegalReviewDialog");
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void cN() {
        C759970TrX.LIZ("ttlive_low_network").LJIIIZ();
    }

    @Override // X.C0UVU
    public final void f5() {
        if (this.mStatusViewValid) {
            nS().LJL(new ACListenerS84S1100000_12(this, 3));
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void gS() {
        Object obj;
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_page_start");
        c760160TrqLIZ.LJ("broadcast");
        c760160TrqLIZ.LJIIIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_caption_status");
        c474500IjALIZ.LJIL();
        HashMap map = new HashMap();
        User owner = PR().getOwner();
        map.put("anchor_id", String.valueOf(owner != null ? owner.getId() : 0L));
        map.put("room_id", String.valueOf(PR().getId()));
        map.put("live_type", "live_take_detail");
        map.put("event_page", "live_take_detail");
        if (!(LiveCaptionAnchorSetting.getValue().length == 0)) {
            for (String str : LiveCaptionAnchorSetting.getValue()) {
                if (Intrinsics.LJFF(str, this.LLLIIIL)) {
                    obj = "1";
                    break;
                }
            }
            obj = CardStruct.IStatusCode.DEFAULT;
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("caption_authority", obj);
        map.put("caption_anchor_setting", InterfaceC1106030et7.v6.LIZIZ().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJ("show");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void hS() {
        C0UZ9 c0uz9;
        MutableLiveData<EnumC517850KSp> mutableLiveData;
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        BroadcastTunnelVM broadcastTunnelVM = (BroadcastTunnelVM) this.LLLIIL.getValue();
        if (((broadcastTunnelVM == null || (mutableLiveData = broadcastTunnelVM.LL) == null) ? null : mutableLiveData.getValue()) != EnumC517850KSp.STREAM_ON && (c0uz9 = this.LLJJJIL) != null) {
            c0uz9.LIZLLL(2);
        }
        BPEAHandler bPEAHandler = this.LLJLLL;
        if (bPEAHandler != null) {
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJZ;
            bPEAHandler.removeCallbacks(aRunnableS112S0100000_12 != null ? aRunnableS112S0100000_12 : null);
        }
    }

    public final FrameLayout mS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b07) : null;
            this.LLIZ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final DialogC778400UgA nS() {
        return (DialogC778400UgA) this.LLJJIJIIJIL.getValue();
    }

    public final C774500UZs oS() {
        return (C774500UZs) this.LLLILZ.getValue();
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C500260Jjc.LJJLIIIJL(this.LLJJIJI);
        this.LLJJIJI = null;
        super.onDestroyView();
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    public final WeakHandler qS() {
        return (WeakHandler) this.LLLILZJ.getValue();
    }

    public final void rS() {
        try {
            VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = this.LLJLILLLLZIIL;
            if (voiceChatBroadcastInteractionFragment == null) {
                return;
            }
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(voiceChatBroadcastInteractionFragment);
            c19ehLJIIJ.LJIIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJLILLLLZIIL = null;
    }

    public final boolean sS() {
        return ((Boolean) this.LLLIL.getValue()).booleanValue() && ((Number) this.LLLIILIL.getValue()).intValue() == 4;
    }

    public final void zS() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_close_live_confirm");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LIZ();
        US();
        wS(1);
        PS(CertProviderManagerKt.findCert("bpea-anchor-finish-broadcast", 1476788484));
        Creator creator = PR().creator;
        if (creator != null) {
            C772830UTh.LIZIZ(10001, RR(), getRoomId(), this.LLJJJJJIL, creator.roomContinue, 0);
        }
    }

    @Override // X.C0UVU
    public final void GK() {
        C766270U4b.LJFF(2131853517, getContext());
    }

    @Override // X.InterfaceC774920UaY
    public final void GR() {
        C766270U4b.LJFF(2131853516, getContext());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_network_error");
        c474500IjALIZ.LJJII("2", "error_type");
        c474500IjALIZ.LIZ();
        C759970TrX.LIZ("ttlive_reconnect_stream_success").LJIIIZ();
    }

    @Override // X.C0UVU
    public final void UI() {
        US();
        wS(8);
        Creator creator = PR().creator;
        if (creator != null) {
            C772830UTh.LIZIZ(10004, RR(), getRoomId(), this.LLJJJJJIL, creator.roomContinue, 0);
        }
        C20441214yg.LIZIZ("VoiceChatBroadcastFragment", "room close forceEndLive");
        PS(CertProviderManagerKt.findCert("bpea-voice-anchor-force-end-live", 1476788484));
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void UR() {
        C1273890jFr c1273890jFrLIZIZ;
        C781270Ukn.LJIJJ().rC0().LIZIZ(getActivity(), getView(), new InterfaceC774730UaF() { // from class: X.0UZ8
            @Override // X.InterfaceC774730UaF
            public final void LIZ(String str) {
                C781270Ukn.LJIJJ().JE().LJ = str;
            }
        });
        BroadcastTimeLog.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        C772780UTc.LIZLLL = System.currentTimeMillis();
        C1273890jFr c1273890jFr = null;
        Context context = LinkMicVoiceChatFixContextAssignment.INSTANCE.isEnable() ? getContext() : null;
        synchronized (C776260Uci.LIZ) {
            c1273890jFrLIZIZ = C776260Uci.LIZIZ(context);
        }
        if (c1273890jFrLIZIZ != null) {
            c1273890jFrLIZIZ.G3(this);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C930890aKd.class, c1273890jFrLIZIZ);
            dataChannelGlobal.HQ2(LiveStreamGlobalChannel.class, c1273890jFrLIZIZ);
            c1273890jFr = c1273890jFrLIZIZ;
        }
        this.LLJJJ = c1273890jFr;
        this.LLLJ = PR().getStreamUrlExtraSafely();
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            C1273890jFr c1273890jFr2 = this.LLJJJ;
            if (c1273890jFr2 != null) {
                c1273890jFr2.LJJIFFI(PR().getStreamUrl().pushUrlList, true);
            }
        } else {
            C1273890jFr c1273890jFr3 = this.LLJJJ;
            if (c1273890jFr3 != null) {
                c1273890jFr3.LJJI(PR().getStreamUrl().LIZLLL, true);
            }
        }
        getDataChannel().zW(StartPushStreamChannel.class, Boolean.TRUE);
        this.LLJLLIL = new VoiceChatWidget(this.LLLIZZ, this.LLJJJ, getChildFragmentManager());
        ((WidgetManager) this.LLLF.getValue()).load(this.LLJLLIL);
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 459));
        }
        C781270Ukn.LJII().fetchGiftAnchorPanelActivityInfo(PR(), getDataChannel());
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal2.gg0(C930940aKi.class);
        if (room != null && room.getOwner().getSecUid() != null) {
            ((ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class)).BW0(Long.valueOf(room.getId()), room.getOwner().getSecUid(), getDataChannel(), this, false);
            if (LiveShortTouchApiMergeSetting.INSTANCE.enable()) {
                ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).Y92(getDataChannel(), Long.valueOf(room.getId()), this);
            }
        }
        dataChannelGlobal2.CQ2(ServerTimeGapChangeEvent.class, this, new AwS591S0100000_12(this, 1158));
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void aS() {
        super.aS();
        C774580Ua0 c774580Ua0 = this.LLLIIII;
        if (c774580Ua0 != null) {
            c774580Ua0.LIZLLL();
        }
        if (sS()) {
            C774500UZs c774500UZsOS = oS();
            c774500UZsOS.getClass();
            C20441214yg.LIZIZ("linkmic_anchor_resume", "clear");
            C20441214yg.LIZIZ("linkmic_anchor_resume", "cancel");
            C11JF c11jf = c774500UZsOS.LIZLLL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c774500UZsOS.LIZLLL = null;
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).destroyGiftBannedManager();
        if (PR().roomLayout == 2) {
            C497700JfU.LIZ.LIZJ(false, EnumC768840UDy.ORDER);
        } else {
            C497700JfU.LIZ.LIZJ(false, EnumC768840UDy.BROADCAST);
        }
        C774610Ua3.LL.LLLZZ(false, false);
        C776270Ucj.LIZ.LIZLLL(null, false);
        if (!this.LLJLL) {
            HS(3);
            this.LLJLL = true;
        }
        C0J3Y.LIZ.getClass();
        C0J3Y.LJIJ();
        getDataChannel().zQ2(this);
        C473410IhP.LJI();
        C0IK5.LIZLLL(null);
        qS().removeCallbacksAndMessages(null);
        C465520INi.LIZ.Vu2();
        LiveMonitorSampleSetting.INSTANCE.release();
        C1163660gO4.LIZ.getClass();
        C1163660gO4.LJ(true);
        US();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C930940aKi.class);
        dataChannelGlobal.IQ2(C930890aKd.class);
        dataChannelGlobal.zQ2(this);
        C781270Ukn.LJIJJ().Xj1().z0();
        try {
            C781270Ukn.LJII().clearAssets("effects");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZLLL(e.toString());
        }
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJJIIZI();
        if (this.LLJLIL) {
            C1548820qPI.LJIIIIZZ("ttlive_report_success", this);
            C1548820qPI.LJIIIIZZ("ttlive_anchor_feedback_submit", this);
            this.LLJLIL = false;
        }
        boolean z = C768810UDv.LIZ;
        C768810UDv.LIZ(getDataChannel());
        C0UUC.LIZ.LIZLLL(getDataChannel());
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.sw0("stream");
        iPerformanceManager.yL0();
        iPerformanceManager.setIsAnchor(false);
        iPerformanceManager.release();
        iPerformanceManager.oB1();
        iPerformanceManager.d01(-1.0f);
        iPerformanceManager.Gp0(-1.0d);
        iPerformanceManager.NE1();
        DataChannelGlobal.LLILZ.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.FALSE);
        C781270Ukn.LJJ().WC();
        this.LLJJ = null;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void bS() {
        rS();
        C0UZ9 c0uz9 = this.LLJJJIL;
        if (c0uz9 != null) {
            c0uz9.LIZJ();
        }
        C1273890jFr c1273890jFr = this.LLJJJ;
        if (c1273890jFr != null) {
            c1273890jFr.release(CertProviderManagerKt.findCert("bpea-voice-onLiveDestroyView-487", 1476788484));
        }
        this.LLJILLL.LJ();
        C0UVT c0uvt = this.LLJJI;
        if (c0uvt == null) {
            c0uvt = null;
        }
        c0uvt.detachView();
        C500260Jjc.LJJLIIIJL(nS());
        C781270Ukn.LJIILLIIL().release(getRoomId());
        C781270Ukn.LJIILLIIL().retryReleaseAll();
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZJ(getRoomId(), "VoiceChatBroadcastFragment_OnViewCreated");
        if (LinkCrossRoomDataHolder.LJLLLL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIIIZZ("VoiceChatBroadcastFragment_OnViewCreated");
        }
        C0UPT.LL.getViewModelStore().clear();
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).releaseGoLiveManager();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).onLiveBroadcastActivityDestroyed();
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).onDestroy();
        C781300Ukq c781300Ukq = this.LLJIJIL;
        if (c781300Ukq != null) {
            C19322110iZ.LJII(c781300Ukq.LJIJI);
        }
        C776260Uci.LIZ.getClass();
        C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", "liveCoreAsyncUtil release");
        C776260Uci.LIZLLL = null;
        C776260Uci.LIZJ = null;
        C776260Uci.LJ = null;
        this.LLJJJ = null;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C1AKO
    public final boolean onBackPressed() {
        if (isAdded()) {
            return super.onBackPressed();
        }
        return true;
    }

    @Override // X.C0UVU
    public final void DE(boolean z) {
        if (!this.mStatusViewValid) {
            return;
        }
        if (z) {
            final DialogC778400UgA dialogC778400UgANS = nS();
            dialogC778400UgANS.setCancelable(false);
            C786410Ut5.I4(dialogC778400UgANS);
            dialogC778400UgANS.LJJZZI(new ACListenerS116S0200000_12(this, dialogC778400UgANS, 27));
            dialogC778400UgANS.LLJJIII = new InterfaceC774350UZd() { // from class: X.0UYr
                @Override // X.InterfaceC774350UZd
                public final void onBackPressed() {
                    C766270U4b.LJIIIZ(dialogC778400UgANS.getContext(), C497740JfY.LJIJI(2131853480));
                }
            };
            dialogC778400UgANS.LLJJIJI = new InterfaceC774360UZe() { // from class: X.0UYs
                @Override // X.InterfaceC774360UZe
                public final void LIZ() {
                    C766270U4b.LJIIIZ(dialogC778400UgANS.getContext(), C497740JfY.LJIJI(2131853480));
                }
            };
            return;
        }
        C500260Jjc.LJJLIIIJL(nS());
    }

    @Override // X.C0UVU
    public final void EB(CharSequence charSequence) {
        if (this.mStatusViewValid) {
            nS().LLJIJIL.setText(charSequence);
        }
    }

    public final void FS(Cert cert) {
        AbstractC1273900jFs abstractC1273900jFs;
        CharSequence charSequence;
        if (this.mStatusActive && !this.LLJJLIIIJLLLLLLLZ && !this.LLJILJILJ) {
            String str = PR().getStreamUrl().LIZLLL;
            if (str == null || str.length() == 0) {
                PR().getStreamUrl().LIZLLL = PR().getStreamUrl().LIZLLL();
            }
            C1273890jFr c1273890jFr = this.LLJJJ;
            if (c1273890jFr != null) {
                c1273890jFr.D3(cert);
            }
            C0UHC.LIZ("capture_audio");
            C11JF c11jf = C774760UaI.LIZ;
            C1273890jFr c1273890jFr2 = this.LLJJJ;
            AbstractC1273900jFs abstractC1273900jFs2 = null;
            if (c1273890jFr2 != null) {
                abstractC1273900jFs = c1273890jFr2.LJI;
            } else {
                abstractC1273900jFs = null;
            }
            C774760UaI.LIZJ(abstractC1273900jFs);
            if (!sS() || ((charSequence = (CharSequence) getDataChannel().gg0(OnlyPushRtcEngineAlreadyCloseChannel.class)) != null && charSequence.length() != 0)) {
                RS();
            }
            C1273890jFr c1273890jFr3 = this.LLJJJ;
            if (c1273890jFr3 != null) {
                abstractC1273900jFs2 = c1273890jFr3.LJI;
            }
            C774760UaI.LIZLLL(abstractC1273900jFs2);
            getDataChannel().zW(StartPushStreamChannel.class, Boolean.TRUE);
        }
    }

    public final void HS(int i) {
        if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
            C0UYZ.LIZIZ(i, PR().getId(), PR().getStreamId(), System.currentTimeMillis());
        } else {
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C01QD.LIZ().LJ().sendStreamStatus(PR().getId(), i, PR().getStreamId(), System.currentTimeMillis()).LJIILIIL(C0J1R.LIZJ(StatusApi.class)).LJJLIIIJLJLI(new C1811860xFY(1, 500L)).LJJLL(new C09JN() { // from class: X.0TKR
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VoiceChatBroadcastFragment@4fc.reportStreamStatus$1");
                    C1C7U.LIZIZ("VoiceChatBroadcastFragment@4fc.reportStreamStatus$1");
                }
            }, new C09JN() { // from class: X.0TKS
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VoiceChatBroadcastFragment@4fc.reportStreamStatus$2");
                    C1C7U.LIZIZ("VoiceChatBroadcastFragment@4fc.reportStreamStatus$2");
                }
            });
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void LLLLIILL(int i) {
        VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment;
        if (C1152720g6Q.LIZ() && this.mStatusViewValid && (voiceChatBroadcastInteractionFragment = this.LLJLILLLLZIIL) != null) {
            voiceChatBroadcastInteractionFragment.LLLLIILL(i);
        }
    }

    public final void PS(Cert cert) {
        boolean z;
        C501060Jku.LIZ(PR(), getDataChannel());
        C1273890jFr c1273890jFr = this.LLJJJ;
        if (c1273890jFr != null) {
            c1273890jFr.stop();
        }
        C1273890jFr c1273890jFr2 = this.LLJJJ;
        if (c1273890jFr2 != null) {
            c1273890jFr2.t3(cert);
        }
        C0UHC.LIZ("release_audio");
        C1273890jFr c1273890jFr3 = this.LLJJJ;
        if (c1273890jFr3 != null) {
            c1273890jFr3.Q3(cert);
        }
        C0UHC.LIZ("release_video");
        if (!this.mStatusViewValid) {
            return;
        }
        qS().post(new ARunnableS112S0100000_12(this, 120));
        if (PR().getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).showBroadCaseEndPage(z);
        C772780UTc.LJII();
        InterfaceC772190UQv.P3.LJFF(0L);
        InterfaceC772190UQv.Q3.LJFF(0L);
        InterfaceC772190UQv.R3.LJFF("");
        InterfaceC772190UQv.S3.LJFF(0);
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void WR(Bundle bundle) {
        C21406218pw.LIZJ();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportEnterBroadcast();
        C465520INi.LIZ.setIsAnchor(true);
        C1EOY c1eoy = C1EOY.LIZ;
        c1eoy.LJIILIIL();
        C0J3Y c0j3y = C0J3Y.LIZ;
        Context context = getContext();
        c0j3y.getClass();
        C0J3Y.LJIIJJI(context);
        DataChannel dataChannel = getDataChannel();
        Boolean bool = Boolean.TRUE;
        dataChannel.zW(UserIsAnchorChannel.class, bool);
        DataChannelGlobal.LLILZ.BQ2(this, this, ShowEndPageEvent.class, new AwS591S0100000_12(this, 514));
        DataChannelGlobal.LLILZ.BQ2(this, this, EndLiveWithoutEndPage.class, new AwS591S0100000_12(this, 515));
        System.currentTimeMillis();
        C772780UTc.LIZ = false;
        System.currentTimeMillis();
        this.LLJJJJ = System.currentTimeMillis();
        super.WR(bundle);
        C774610Ua3.LL.LLLZL(this, getDataChannel());
        c1eoy.LJIILIIL();
        C0J3Y.LJIIJJI(getContext());
        C781270Ukn.LJIILJJIL().ad1(getContext());
        IPublicScreenService iPublicScreenServiceLJIJI = C781270Ukn.LJIJI();
        getContext();
        iPublicScreenServiceLJIJI.aJ2();
        C0UV0.LiveResource.preload();
        DataChannel dataChannel2 = getDataChannel();
        dataChannel2.EQ2(this, InteractStateChangeEvent.class, new AwS591S0100000_12(this, 516));
        dataChannel2.BQ2(this, StartPollMessageSEIEvent.class, new AwS591S0100000_12(this, 517));
        dataChannel2.BQ2(this, PauseLiveChannel.class, new AwS591S0100000_12(this, 518));
        dataChannel2.BQ2(this, VoiceChatStartFailedEvent.class, new AwS591S0100000_12(this, 519));
        dataChannel2.BQ2(this, BroadcastEnableSubOnlyLiveEvent.class, new AwS591S0100000_12(this, 520));
        dataChannel2.BQ2(this, BroadcastDisableSubOnlyTrialLiveEvent.class, new AwS591S0100000_12(this, 521));
        dataChannel2.SX0(C751340Tdc.class, Long.valueOf(getRoomId()));
        dataChannel2.zW(UserIsAnchorChannel.class, bool);
        ((C0J1N) C784440Upu.LIZ().LJ(C465900IOu.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 291), new C09JN() { // from class: X.00Ls
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("VoiceChatBroadcastFragment@4fc.registerRxBus$2");
                C1C7U.LIZIZ("VoiceChatBroadcastFragment@4fc.registerRxBus$2");
            }
        });
        MR(C781270Ukn.LJIIJJI().registerAppEnterForeBackgroundCallback(this.LLLJIL));
        if (!this.LLJLIL) {
            C1548820qPI.LIZLLL("ttlive_report_success", this);
            C1548820qPI.LIZLLL("ttlive_anchor_feedback_submit", this);
            this.LLJLIL = true;
        }
        this.LLJLLL = new BPEAHandler(Looper.getMainLooper(), this);
        this.LLJZ = new ARunnableS112S0100000_12(this, 458);
        C0UYQ.LIZ.init();
        if (C772200UQw.LIZ()) {
            InterfaceC772190UQv.r3.LJFF(Boolean.FALSE);
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, BroadcastSchemaOpenPanelEvent.class, new AwS591S0100000_12(this, 522));
        C0UUC.LIZ.LIZ(getDataChannel());
    }

    @Override // X.C0UVU
    public final void hM(CharSequence charSequence) {
        if (this.mStatusViewValid) {
            nS().LLJI.setText(charSequence);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        if (message.what == 100) {
            if (C0U30.LIZ(getContext(), this.LLJJJ)) {
                C766270U4b.LJIIJJI(getString(2131843087));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_microphone_occupied_toast_show");
                c474500IjALIZ.LJIJJLI(getDataChannel());
                c474500IjALIZ.LJJII("voice_chat", Scene.SCENE_SERVICE);
                c474500IjALIZ.LIZ();
                z = true;
            } else {
                z = false;
            }
            this.LLL = z;
            this.LLJZIJLIL = 0;
            QS();
        }
        return true;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int errorCode;
        StreamUrlExtra streamUrlExtra = null;
        C501520Jle c501520Jle = null;
        if (message.what == 3) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj instanceof C501470JlZ) {
                c501520Jle = (C501520Jle) messageObj;
            }
            if (c501520Jle != null) {
                errorCode = c501520Jle.getErrorCode();
            } else {
                errorCode = 0;
            }
            Ze(errorCode, "ping_anchor", false);
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            if (message.what != 13) {
                return;
            }
            C20441214yg.LJ("VoiceChatBroadcastFragment", "fetch ngb rtmp url failed");
            FS(CertProviderManagerKt.findCert("bpea-voice-readyStartingLive-459", 1476788492));
            return;
        }
        if (message.what != 13) {
            return;
        }
        String str = (String) HandlerHook.getMessageObj(message.obj);
        StreamUrl streamUrl = PR().getStreamUrl();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        StreamUrlExtra streamUrlExtra2 = this.LLLJ;
        if (streamUrlExtra2 != null) {
            streamUrlExtra = streamUrlExtra2;
        }
        sbLIZ.append(streamUrlExtra.ngbPushUrlPrefix);
        streamUrl.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetch ngb RTMP url, url = ");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("VoiceChatBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ2));
        FS(CertProviderManagerKt.findCert("bpea-voice-readyStartingLive-460", 1476788492));
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void iS(View view) {
        String strLIZ;
        C0UZ9 c0uz9;
        VoiceChatWidget voiceChatWidget;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        View view3;
        view.setBackgroundColor(C497740JfY.LIZLLL(R.attr.c95, view.getContext()));
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).fW1(getContext(), getDataChannel(), EnumC498960JhW.BROADCAST);
        View viewFindViewById = null;
        if (LiveEnableFixLiveEndSetting.INSTANCE.enable() && (voiceChatWidget = this.LLJLLIL) != null && (view2 = voiceChatWidget.getView()) != null) {
            VoiceChatWidget voiceChatWidget2 = this.LLJLLIL;
            if (voiceChatWidget2 != null && (view3 = voiceChatWidget2.getView()) != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
                layoutParams2.leftMargin = 1;
                layoutParams2.rightMargin = 1;
            } else {
                layoutParams2 = null;
            }
            C786410Ut5.W5(view2, layoutParams2);
        }
        EnumC500290Jjf.LIVE_VOICE.config();
        Room roomPR = PR();
        if (roomPR != null) {
            C781270Ukn.LJIJI().q51(roomPR.getId());
        }
        C11JF c11jf = C774760UaI.LIZ;
        C774760UaI.LIZIZ(PR().getId());
        getDataChannel().zW(RoomChannel.class, PR());
        InterfaceC772190UQv.Q3.LJFF(Long.valueOf(PR().getId()));
        InterfaceC772190UQv.R3.LJFF(C354201Zc.LIZ(PR().getStreamType()));
        InterfaceC772190UQv.P3.LJFF(0L);
        InterfaceC772190UQv.S3.LJFF(Integer.valueOf(Process.myPid()));
        getDataChannel().zW(LiveEventCardStartTimeChannel.class, Long.valueOf(this.LLJJJJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        if (LinkCrossRoomDataHolder.LJLLLL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().setIsAnchor(true);
        }
        C464550IJp.LIZ(getRoomId(), getDataChannel(), "VoiceChatBroadcastFragment_OnViewCreated");
        this.LLLJ = PR().getStreamUrlExtraSafely();
        long roomId = getRoomId();
        getContext();
        C0UVT c0uvt = new C0UVT(roomId);
        this.LLJJI = c0uvt;
        c0uvt.attachView(this);
        ((C2262001DgE) this.LLLII.getValue()).LIZIZ = this;
        this.LLJJJIL = new C0UZ9((C2262001DgE) this.LLLII.getValue(), false);
        if (LiveAllModePingIntervalDropSetting.INSTANCE.isEnable() && (c0uz9 = this.LLJJJIL) != null) {
            c0uz9.LJIIJ(LiveMode.LIVE_VOICE);
        }
        C0IK5.LIZIZ(getDataChannel(), new ARunnableS107S0100000_7(this, 265));
        this.LLJJIJIL = new C779220UhU(this);
        C781270Ukn.LJII().resetRoomStatus(false);
        C786410Ut5.LJLIIL(LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value(), C0IK5.LIZ(), new ARunnableS107S0100000_7(this, 266));
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
                } else {
                    strLIZ = null;
                }
                c474500IjALIZ.LJJ(strLIZ);
                c474500IjALIZ.LJ("exempt");
                c474500IjALIZ.LIZ();
            }
            C772780UTc.LJIIIZ(i);
        }
        if (sS()) {
            oS().LIZJ();
            getDataChannel().CQ2(OnlyPushRtcEngineAlreadyCloseChannel.class, this, new AwS591S0100000_12(this, 1160));
        }
        DataChannel dataChannel = getDataChannel();
        View view4 = this.LLILZLL;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById = view5.findViewById(R.id.ku8);
            }
            this.LLILZLL = (FrameLayout) viewFindViewById;
            view4 = viewFindViewById;
        }
        this.LLJIJIL = new C781300Ukq(dataChannel, this, view4, view.findViewById(R.id.ku9), view.findViewById(R.id.mue));
    }

    @Override // X.InterfaceC773370UVj
    public final void ld(String str) {
        C1273890jFr c1273890jFr;
        if (Intrinsics.LJFF(TelephonyManager.EXTRA_STATE_IDLE, str)) {
            C1273890jFr c1273890jFr2 = this.LLJJJ;
            if (c1273890jFr2 != null) {
                c1273890jFr2.J3(CertProviderManagerKt.findCert("bpea-voice-onPhoneStateChangeListener-366", 1476788492), false);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(TelephonyManager.EXTRA_STATE_OFFHOOK, str) || (c1273890jFr = this.LLJJJ) == null) {
            return;
        }
        c1273890jFr.LJIILL(C0UZP.LIZ());
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "ttlive_report_success")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                String str2 = "";
                String strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd, "source", "");
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null) {
                    strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "action", "");
                } else {
                    strLJFF = null;
                }
                if (Intrinsics.LJFF(strLJFF3, "message") && Intrinsics.LJFF(strLJFF, "")) {
                    InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd3 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "content", "")) != null) {
                        str2 = strLJFF2;
                    }
                    FragmentManager fragmentManager = getFragmentManager();
                    if (fragmentManager == null) {
                        return;
                    }
                    ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).M22(PR().getId(), str2, fragmentManager, 3, 0L);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "ttlive_anchor_feedback_submit")) {
            C20441214yg.LIZIZ("InteractALogUtil", "submit feedback, upload Alog");
            InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
            boolean zLIZIZ = false;
            if (interfaceC1107590evd4 != null) {
                zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd4, "is_submit", false);
            }
            getDataChannel().LC0(MultiCoHostFeedbackSubmitEvent.class, Boolean.valueOf(zLIZIZ));
        }
    }

    public final void onEvent(C465900IOu c465900IOu) {
        String string;
        int iIntValue;
        int i = c465900IOu.LIZ;
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    if (i != 11) {
                        if (i != 17) {
                            if (i == 52 && LiveAllModePingIntervalDropSetting.INSTANCE.isEnable()) {
                                int i2 = c465900IOu.LIZIZ;
                                if (i2 != 30003001 && i2 != 30003) {
                                    ES(CertProviderManagerKt.findCert("bpea-423", 1476788485), false);
                                    Creator creator = PR().creator;
                                    if (creator != null) {
                                        C772830UTh.LIZIZ(c465900IOu.LIZIZ, RR(), getRoomId(), this.LLJJJJJIL, creator.roomContinue, 0);
                                        return;
                                    }
                                    return;
                                }
                                Ze(i2, "im", false);
                                return;
                            }
                            return;
                        }
                        C0UZP.LIZ();
                        zS();
                        return;
                    }
                    Cert certLIZ = C0UZP.LIZ();
                    Creator creator2 = PR().creator;
                    if (creator2 != null) {
                        C772830UTh.LIZIZ(10002, RR(), getRoomId(), this.LLJJJJJIL, creator2.roomContinue, 0);
                    }
                    US();
                    wS(1);
                    C1273890jFr c1273890jFr = this.LLJJJ;
                    if (c1273890jFr != null) {
                        c1273890jFr.stop();
                    }
                    C1273890jFr c1273890jFr2 = this.LLJJJ;
                    if (c1273890jFr2 != null) {
                        c1273890jFr2.t3(certLIZ);
                    }
                    C0UHC.LIZ("release_audio");
                    C1273890jFr c1273890jFr3 = this.LLJJJ;
                    if (c1273890jFr3 != null) {
                        c1273890jFr3.Q3(certLIZ);
                    }
                    C0UHC.LIZ("release_video");
                    C766270U4b.LJFF(2131853542, getContext());
                    C19EG activity = getActivity();
                    if (activity == null) {
                        return;
                    }
                    activity.finish();
                    return;
                }
            } else {
                ControlMessage controlMessage = c465900IOu.LJ;
                if ((controlMessage instanceof ControlMessage) && controlMessage.action == 4) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    dataChannelGlobal.HQ2(BlockCloseLiveReasonChannel.class, Boolean.TRUE);
                    PerceptionDialogInfo perceptionDialogInfo = controlMessage.perceptionDialogInfo;
                    if (perceptionDialogInfo != null) {
                        dataChannelGlobal.HQ2(PerceptionDialogChannel.class, perceptionDialogInfo);
                    }
                    PunishEventInfo punishEventInfo = controlMessage.punishInfo;
                    if (punishEventInfo != null) {
                        dataChannelGlobal.HQ2(PunishInfoChannel.class, punishEventInfo);
                    }
                    ControlMessage.Extra extra = controlMessage.extraInfo;
                    if (extra != null) {
                        String str = extra.banInfoUrl;
                        if (str != null) {
                            this.LLLFF = UriProtector.parse(str).buildUpon().appendQueryParameter("source", "inapp").appendQueryParameter("enter_from", "live").build().toString();
                        }
                        this.LLLFFI = C1133830fbx.LJIILIIL(extra.title, "");
                        this.LLLFZ = C1133830fbx.LJIILIIL(extra.violationReason, "");
                        this.LLLI = C1133830fbx.LJIILIIL(extra.illegalText, "");
                    }
                    ES(CertProviderManagerKt.findCert("bpea-voice-onLiveEnd-424", 1476788484), true);
                    Creator creator3 = PR().creator;
                    if (creator3 == null) {
                        return;
                    }
                    C772830UTh.LIZIZ(10003, RR(), getRoomId(), this.LLJJJJJIL, creator3.roomContinue, 0);
                    return;
                }
                ES(C0UZP.LIZ(), false);
                Creator creator4 = PR().creator;
                if (creator4 == null) {
                    return;
                }
                C772830UTh.LIZIZ(c465900IOu.LIZIZ, RR(), getRoomId(), this.LLJJJJJIL, creator4.roomContinue, 0);
                return;
            }
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (PR().getId() != 0) {
            C15CY.LJIJJLI(PR().getId());
        }
        if (AnchorFinishEncourageABSetting.INSTANCE.isMatch()) {
            int iLIZLLL = C497740JfY.LIZLLL(R.attr.c95, getContext());
            C15CY.LJIL(Integer.valueOf(iLIZLLL), Integer.valueOf(iLIZLLL));
        }
        if (C0UQK.LJ(context, getDataChannel(), new C774290UYx(this), new C774080UYc(this), new C0UZI(this))) {
            return;
        }
        Integer num = (Integer) getDataChannel().gg0(C0UZS.class);
        if (num != null && (iIntValue = num.intValue()) > 0) {
            string = getResources().getQuantityString(2131755504, iIntValue, Integer.valueOf(iIntValue));
        } else {
            string = getResources().getString(2131840965);
        }
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.muf);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (C16FZ) viewFindViewById;
        }
        View view2 = viewFindViewById;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, true);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C01QD.LIZ().LIZ().getAnchorPreFinish(getRoomId()).LJIILIIL(C0J1R.LIZIZ(this)).LJIILIIL(new C0UO0()).LJJLL(new AfS2S1100100_12(jCurrentTimeMillis, this, string, 5), new AfS2S1100100_12(jCurrentTimeMillis, this, string, 6));
    }

    @Override // X.InterfaceC774920UaY
    public final void pq(int i) {
        if (this.mStatusViewValid) {
            getDataChannel().LC0(BroadcastNetworkStatus.class, Integer.valueOf(i));
            VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = this.LLJLILLLLZIIL;
            if (voiceChatBroadcastInteractionFragment != null) {
                voiceChatBroadcastInteractionFragment.pq(i);
            }
        }
    }

    public final void wS(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopLive: reason=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("VoiceChatBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ));
        C0UZ9 c0uz9 = this.LLJJJIL;
        if (c0uz9 != null) {
            c0uz9.LJIILIIL(i, new InterfaceC774410UZj() { // from class: X.0UYm
                @Override // X.InterfaceC774410UZj
                public final void LIZ() {
                    if (AnchorFinishEncourageABSetting.INSTANCE.isMatch() || AnchorFinishEncourageV2ABSetting.INSTANCE.isEnable()) {
                        DataChannelGlobal.LLILZ.GQ2(NotifyServerLiveEndSucceedEvent.class);
                    }
                }
            });
        }
    }

    public static void uS(DataChannel dataChannel, boolean z) {
        String strLIZ;
        String str;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        if (room != null && room.getOwnerUserId() == currentUserId) {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_switch_to_background", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
            c474500IjALIZIZ.LJIJJLI(dataChannel);
            c474500IjALIZIZ.LJJIJIIJIL(room.getIdStr());
            c474500IjALIZIZ.LJII(String.valueOf(room.getOwnerUserId()));
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                strLIZ = C354201Zc.LIZ(streamType);
            } else {
                strLIZ = null;
            }
            c474500IjALIZIZ.LJJ(strLIZ);
            if (z) {
                str = "anchor_leave";
            } else {
                str = "anchor_back";
            }
            c474500IjALIZIZ.LJ(str);
            c474500IjALIZIZ.LIZ();
        }
    }

    public final void BS(int i, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_close_live_popup");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII(C354201Zc.LIZ(PR().getStreamType()), "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    c474500IjALIZ.LJJII("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                c474500IjALIZ.LJJII("high_acu", "sub_only_live_strategy");
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "has_sub_only_live");
        c474500IjALIZ.LIZ();
    }

    public final void ES(Cert cert, boolean z) {
        String str;
        if (!this.LLJJLIIIJLLLLLLLZ) {
            US();
            wS(1);
        }
        if (z && !C2093608Ic.LJ(this.LLLFF)) {
            C781270Ukn.LJFF().Zz1();
            Context context = getContext();
            C784600UqA c784600UqA = new C784600UqA(this.LLLFF);
            c784600UqA.LIZJ = true;
            c784600UqA.LIZIZ = C497740JfY.LJIJI(2131851333);
            C784610UqB.LIZIZ(context, c784600UqA);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("room close onLiveEnd endByBanned:");
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("VoiceChatBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ));
        PS(cert);
    }

    @Override // X.InterfaceC774920UaY
    public final void I1(int i, int i2) {
        VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment;
        if (C1152720g6Q.LIZ() && this.mStatusViewValid && (voiceChatBroadcastInteractionFragment = this.LLJLILLLLZIIL) != null) {
            voiceChatBroadcastInteractionFragment.I1(i, i2);
        }
    }

    public final void JS(String str, String str2) {
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).We1(str, C2097608Jq.LJIIJ(new Pair(str, "1")));
        this.LLJILLL.LIZ(C11NZ.LJJJJLI(5L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS27S2100000_12(this, str, str2, 1)));
    }

    @Override // X.C0UVU
    public final void Lj(String str, boolean z) {
        if (this.mStatusViewValid) {
            DialogC778400UgA dialogC778400UgANS = nS();
            dialogC778400UgANS.LLJILJIL.setEnabled(z);
            dialogC778400UgANS.LLJILJIL.setText(str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View ZR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0J3Y.LJFF(C0J3Y.LIZ, R.layout.gj4, viewGroup, false, null, false, 60);
    }

    public final void yS(int i, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_close_live_cancel");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII("video_live", "live_type");
        if (z) {
            if (i != 5) {
                if (i == 6) {
                    c474500IjALIZ.LJJII("high_subscribers", "sub_only_live_strategy");
                }
            } else {
                c474500IjALIZ.LJJII("high_acu", "sub_only_live_strategy");
            }
        }
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC775300UbA
    public final void V3(int i, int i2, Exception exc) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        if (exc != null) {
            message = exc.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LIZIZ("VoiceChatBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void VR(int i, int i2, Intent intent) {
        VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = this.LLJLILLLLZIIL;
        if (voiceChatBroadcastInteractionFragment != null) {
            voiceChatBroadcastInteractionFragment.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // X.InterfaceC2262041DgI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ze(int r12, java.lang.String r13, boolean r14) {
        /*
            r11 = this;
            r2 = 30001(0x7531, float:4.204E-41)
            r1 = 30003001(0x1c9cf39, float:7.413309E-38)
            r0 = 30003(0x7533, float:4.2043E-41)
            r3 = 0
            r4 = r12
            if (r4 == r2) goto L75
            if (r4 == r0) goto L5d
            r0 = 50002(0xc352, float:7.0068E-41)
            if (r4 == r0) goto L75
            r0 = 4003150(0x3d154e, float:5.609608E-39)
            if (r4 == r0) goto L55
            if (r4 == r1) goto L5d
            boolean r0 = r11.LLLJL
            if (r0 == 0) goto L54
            if (r4 != 0) goto L54
            if (r14 == 0) goto L54
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aLG> r0 = X.C931280aLG.class
            java.lang.Object r2 = r1.gg0(r0)
            X.0UTQ r2 = (X.C0UTQ) r2
            if (r2 == 0) goto L4b
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJIILJJIL = r0
            r2.LJIILL = r3
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJIILLIIL = r0
            r2.LJIIZILJ = r3
            r0 = 1
            r2.LJIJ = r0
            X.0UTP r2 = X.C0UTP.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r11.getDataChannel()
            r0 = 31
            r2.LIZLLL(r1, r0)
        L4b:
            X.0UZ9 r0 = r11.LLJJJIL
            if (r0 == 0) goto L52
            r0.LIZIZ()
        L52:
            r11.LLLJL = r3
        L54:
            return
        L55:
            X.0UZ9 r0 = r11.LLJJJIL
            if (r0 == 0) goto L54
            r0.LJIIL()
            return
        L5d:
            X.0UUl r0 = r11.LLJJ
            if (r0 == 0) goto L64
            r0.LIZLLL(r3)
        L64:
            X.0UUl r2 = r11.LLJJ
            if (r2 == 0) goto L75
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "live_end_error_code"
            r1.putInt(r0, r4)
            r2.LIZ(r1)
        L75:
            java.lang.String r1 = "bpea-voice-onLiveEnd-424"
            r0 = 1476788484(0x58060104, float:5.893557E14)
            com.bytedance.bpea.basics.Cert r0 = com.bytedance.bpea.basics.CertProviderManagerKt.findCert(r1, r0)
            r11.ES(r0, r3)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r11.PR()
            com.bytedance.android.livesdk.model.Creator r0 = r0.creator
            if (r0 == 0) goto L54
            int r10 = r0.roomContinue
            long r5 = r11.RR()
            long r7 = r11.getRoomId()
            boolean r9 = r11.LLJJJJJIL
            X.C772830UTh.LIZLLL(r4, r5, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment.Ze(int, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    @Override // X.InterfaceC774920UaY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ku(int r18, int r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment.ku(int, int, java.lang.String):void");
    }

    public static void GS(VoiceChatBroadcastFragment voiceChatBroadcastFragment, String str, int i, String str2, String str3, Map map) {
        String strLIZ;
        voiceChatBroadcastFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_close_live_dialog_");
        sbLIZ.append(str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c474500IjALIZ.LJIJJLI(voiceChatBroadcastFragment.getDataChannel());
        LiveMode streamType = voiceChatBroadcastFragment.PR().getStreamType();
        if (streamType != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        } else {
            strLIZ = null;
        }
        c474500IjALIZ.LJJ(strLIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "popup_type");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJII(str3, "unique_id");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(null, "duration");
        c474500IjALIZ.LJJII(null, "link_type");
        c474500IjALIZ.LJJIJL();
    }

    public final void NS(String str, long j, boolean z, final Integer num, long j2, final AnchorPreFinishData anchorPreFinishData) {
        int iIntValue;
        int i;
        AnchorPreFinishData.ConfirmBox confirmBox;
        int iIntValue2;
        String str2;
        Map<String, String> map;
        AnchorPreFinishData.ConfirmBox confirmBox2;
        if (getContext() == null) {
            return;
        }
        View viewFindViewById = this.LLJI;
        String str3 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.muf);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (C16FZ) viewFindViewById;
        }
        View view2 = viewFindViewById;
        int iIntValue3 = 0;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, false);
        }
        LiveDialog liveDialog = this.LLJJIJI;
        if (liveDialog != null && liveDialog.isShowing()) {
            return;
        }
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        boolean zLIZJ = C516680KOc.LIZJ(iIntValue);
        if (num != null && num.intValue() == 17) {
            int iIntValue4 = num.intValue();
            if (anchorPreFinishData != null && (confirmBox2 = anchorPreFinishData.confirmBox) != null) {
                str2 = confirmBox2.uniqueId;
            } else {
                str2 = null;
                if (anchorPreFinishData == null) {
                    map = null;
                }
                GS(this, "show", iIntValue4, "", str2, map);
            }
            map = anchorPreFinishData.metricsMap;
            GS(this, "show", iIntValue4, "", str2, map);
        }
        C782110Um9 c782110Um9 = new C782110Um9(getContext());
        c782110Um9.LJIIIZ(str);
        c782110Um9.LJIILIIL(2131840967, new AcS21S0310000_12(this, anchorPreFinishData, num, zLIZJ, 1));
        c782110Um9.LJIIJ(2131840966, new AcS21S0310000_12(this, anchorPreFinishData, num, zLIZJ, 2));
        c782110Um9.LJIJI = new DialogInterfaceOnCancelListenerC785950UsL(this, num, 0);
        c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(this, 9);
        if (zLIZJ) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().getClass();
            int i2 = (int) j2;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            i = 17;
            C516680KOc.LIZLLL(c782110Um9, i2, iIntValue2, getDataChannel(), false);
        } else {
            i = 17;
            zLIZJ = false;
        }
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LLJJIJI = liveDialogLIZ;
        if (num != null && num.intValue() == i) {
            C753460Th2 c753460Th2 = new C753460Th2();
            Context context = getContext();
            if (anchorPreFinishData != null && (confirmBox = anchorPreFinishData.confirmBox) != null) {
                str3 = confirmBox.schemaTitle;
            }
            if (context != null) {
                c753460Th2.LIZ = str3;
            }
            c753460Th2.LIZJ = ColorStateList.valueOf(C20736316Cj.LIZJ(R.attr.f00, getView()));
            c753460Th2.LJ = new InterfaceC753420Tgy() { // from class: X.0UYO
                @Override // X.InterfaceC753420Tgy
                public final void LIZ(DialogInterface dialogInterface) {
                    Map<String, String> map2;
                    AnchorPreFinishData.ConfirmBox confirmBox3;
                    AnchorPreFinishData.ConfirmBox confirmBox4;
                    String str4;
                    AnchorPreFinishData anchorPreFinishData2 = anchorPreFinishData;
                    if (anchorPreFinishData2 != null && (confirmBox4 = anchorPreFinishData2.confirmBox) != null && (str4 = confirmBox4.schemaJumpLink) != null) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.getContext(), str4);
                    }
                    VoiceChatBroadcastFragment voiceChatBroadcastFragment = this;
                    int iIntValue5 = num.intValue();
                    AnchorPreFinishData anchorPreFinishData3 = anchorPreFinishData;
                    String str5 = null;
                    if (anchorPreFinishData3 != null && (confirmBox3 = anchorPreFinishData3.confirmBox) != null) {
                        str5 = confirmBox3.uniqueId;
                    } else {
                        if (anchorPreFinishData3 == null) {
                            map2 = null;
                        }
                        VoiceChatBroadcastFragment.GS(voiceChatBroadcastFragment, "click", iIntValue5, "click_link", str5, map2);
                        dialogInterface.dismiss();
                    }
                    map2 = anchorPreFinishData3.metricsMap;
                    VoiceChatBroadcastFragment.GS(voiceChatBroadcastFragment, "click", iIntValue5, "click_link", str5, map2);
                    dialogInterface.dismiss();
                }
            };
            liveDialogLIZ.LJLILLLLZI(new C753450Th1(c753460Th2));
        }
        C786410Ut5.E4(liveDialogLIZ);
        if (num != null) {
            iIntValue3 = num.intValue();
        }
        BS(iIntValue3, zLIZJ);
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - j);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_close_live_duration");
        c474500IjALIZ.LJIJJLI(getDataChannel());
        c474500IjALIZ.LJJII(Integer.valueOf(iCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "request_succeed");
        c474500IjALIZ.LIZ();
    }
}
