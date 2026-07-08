package com.bytedance.android.livesdk.game.chatroom.ui;

import X.AbstractC1273900jFs;
import X.AbstractC776850Udf;
import X.AbstractC776930Udn;
import X.AbstractC777950UfR;
import X.AbstractC781140Uka;
import X.AnonymousClass0956;
import X.C001A;
import X.C01GW;
import X.C036E;
import X.C09AE;
import X.C09JN;
import X.C0IJT;
import X.C0IR5;
import X.C0J1N;
import X.C0JST;
import X.C0TBQ;
import X.C0TD0;
import X.C0TD3;
import X.C0TDF;
import X.C0UKZ;
import X.C0UO0;
import X.C0UU3;
import X.C0UU7;
import X.C0UVT;
import X.C0UW2;
import X.C0UW3;
import X.C0UW6;
import X.C0UWD;
import X.C0UWE;
import X.C0UYF;
import X.C0UZ4;
import X.C0UZ9;
import X.C0UZK;
import X.C0VI1;
import X.C0VIA;
import X.C0VIK;
import X.C0VIM;
import X.C0VIQ;
import X.C0W78;
import X.C0WZX;
import X.C1148310fzJ;
import X.C1161920gLG;
import X.C11JF;
import X.C11LS;
import X.C11NJ;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C11S5;
import X.C1269340j8W;
import X.C1276840jKc;
import X.C1300340jwW;
import X.C1324720kZq;
import X.C1338270kvh;
import X.C158B;
import X.C168G;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C19322110iZ;
import X.C19490011Na;
import X.C19748512Ol;
import X.C19EG;
import X.C19EH;
import X.C1CC2;
import X.C1EOY;
import X.C20337914i1;
import X.C20441214yg;
import X.C21406218pw;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C247600xW;
import X.C292401Bi;
import X.C354201Zc;
import X.C452501pT;
import X.C464550IJp;
import X.C465520INi;
import X.C465900IOu;
import X.C471201sU;
import X.C471401sW;
import X.C474500IjA;
import X.C476230Ilx;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500730JkN;
import X.C504210Jpz;
import X.C516201zk;
import X.C520010KaN;
import X.C743070TCv;
import X.C748900TZg;
import X.C753430Tgz;
import X.C754700Tj2;
import X.C755590TkT;
import X.C773220UUu;
import X.C773530UVz;
import X.C774760UaI;
import X.C774940Uaa;
import X.C774950Uab;
import X.C776250Uch;
import X.C776300Ucm;
import X.C776320Uco;
import X.C776410Ucx;
import X.C776490Ud5;
import X.C776590UdF;
import X.C776610UdH;
import X.C776630UdJ;
import X.C776640UdK;
import X.C776680UdO;
import X.C776870Udh;
import X.C776890Udj;
import X.C776910Udl;
import X.C776920Udm;
import X.C776940Udo;
import X.C777220UeG;
import X.C777250UeJ;
import X.C777300UeO;
import X.C777310UeP;
import X.C777320UeQ;
import X.C777340UeS;
import X.C777840UfG;
import X.C778080Ufe;
import X.C778120Ufi;
import X.C778170Ufn;
import X.C778190Ufp;
import X.C778290Ufz;
import X.C778390Ug9;
import X.C778570UgR;
import X.C779190UhR;
import X.C779260UhY;
import X.C779470Uht;
import X.C779480Uhu;
import X.C779530Uhz;
import X.C779660UiC;
import X.C780110Uiv;
import X.C781300Ukq;
import X.C783470UoL;
import X.C785760Us2;
import X.C786410Ut5;
import X.C930940aKi;
import X.C931370aLP;
import X.EnumC498960JhW;
import X.EnumC777480Ueg;
import X.EnumC778100Ufg;
import X.EnumC779790UiP;
import X.InterfaceC1100800ekg;
import X.InterfaceC19483011Ki;
import X.InterfaceC420801kM;
import X.InterfaceC769940UIe;
import X.InterfaceC770130UIx;
import X.InterfaceC772190UQv;
import X.InterfaceC772390URp;
import X.InterfaceC773130UUl;
import X.InterfaceC773750UWv;
import X.InterfaceC774140UYi;
import X.InterfaceC774410UZj;
import X.InterfaceC774920UaY;
import X.InterfaceC776570UdD;
import X.InterfaceC776650UdL;
import X.InterfaceC776970Udr;
import X.InterfaceC777000Udu;
import X.InterfaceC778470UgH;
import X.InterfaceC779960Uig;
import X.InterfaceC781090UkV;
import X.InterfaceC781210Ukh;
import X.ServiceConnectionC776290Ucl;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS17S0100100_12;
import Y.AfS181S0100000_12;
import Y.AfS32S0210000_12;
import Y.AfS57S0110000_15;
import Y.AfS80S0101000_12;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.broadcast.BaseBroadcastFragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.comp.api.game.PrepareCountDown;
import com.bytedance.android.livesdk.comp.api.game.ScreenRecordWidgetPosition;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.GameBroadcastFrameEndEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveIsBackgroundData;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.MobileGameStreamInfo;
import com.bytedance.android.livesdk.dataChannel.NotifyServerLiveEndSucceedEvent;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.internalrecord.EnableFallbackAudioOldChainSetting;
import com.bytedance.android.livesdk.game.broadcast.service.MirrorServiceWorker;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.GblServerFeaturesListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageV2ABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameLiveAdaptiveSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableTTCaptureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.FrameSignV3Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.livesetting.broadcast.GameStartMirrorServiceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameStartMirrorServiceSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameStopBackgroundAnimationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAllModePingIntervalDropSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgServiceStrategySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameResetRotationResumeSceneSettingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameAnchorHeartbeatSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameAnchorIntelligentRotationTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameNetworkSpeedMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.game.AndroidGameFrameMinDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.game.EnableGameBroadcastFrameSetting;
import com.bytedance.android.livesdk.livesetting.game.EnableMobileGameBroadcastFeedbackInfoAndDiagnose;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingProtectSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.livesetting.game.GamePreviewReleaseSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveGameSafetyReporterSetting;
import com.bytedance.android.livesdk.livesetting.game.MultiDeviceInterruptGuideSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveGamePauseSeiConfigSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchApiMergeSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.android.livesdkapi.message.LiveMessageID;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS11S0002000_12;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS55S0001000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class GameBroadcastFragment extends BaseBroadcastFragment implements C0UZ4, WeakHandler.IHandler, InterfaceC774920UaY, InterfaceC773750UWv {
    public static C11JF LLLILZJ = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGHELIOSEwICQ4OyA8JWs5IGEUKSgpCz08KSEvKDwnDjctLiI2JjE=";
    public InterfaceC773130UUl LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJILJIL;
    public C0UU7 LLJILJILJ;
    public C776610UdH LLJILLL;
    public C776320Uco LLJJ;
    public C0UZ9 LLJJI;
    public C0UZK LLJJIII;
    public C776870Udh LLJJIJI;
    public C774940Uaa LLJJIJIIJIL;
    public InterfaceC781090UkV LLJJIJIL;
    public InterfaceC776650UdL LLJJJ;
    public long LLJJJIL;
    public boolean LLJJJJJIL;
    public ARunnableS112S0100000_12 LLJJL;
    public C776630UdJ LLJJLIIIJLLLLLLLZ;
    public C0TBQ LLJL;
    public AnonymousClass0956 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public boolean LLJLL;
    public long LLJLLIL;
    public C0UU3 LLJLLL;
    public C778290Ufz LLJZ;
    public C776300Ucm LLJZIJLIL;
    public C11JF LLL;
    public C776890Udj LLLF;
    public int LLLII;
    public C743070TCv LLLIIL;
    public boolean LLLIILIL;
    public InterfaceC420801kM LLLILZ;
    public boolean LLJIJIL = true;
    public boolean LLJJJJ = true;
    public final C01GW LLJJJJLIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 292));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 290));
    public final C01GW LLLFFI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(130));
    public final ServiceConnectionC776290Ucl LLLFZ = new ServiceConnection() { // from class: X.0Ucl
        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C776320Uco c776320Uco = this.LL.LLJJ;
            if (c776320Uco != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_service_disconnected");
                c474500IjALIZ.LJJII(c776320Uco.LIZIZ(), "anchor_id");
                c474500IjALIZ.LJJII("screen_share", "live_type");
                c474500IjALIZ.LJJII(Long.valueOf(c776320Uco.LIZJ()), "room_id");
                c474500IjALIZ.LIZ();
            }
            C0TBQ c0tbq = this.LL.LLJL;
            if (c0tbq != null) {
                c0tbq.LJIILIIL = false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Exception {
            C19EG activity;
            boolean z;
            Boolean boolValueOf = null;
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/android/livesdk/game/chatroom/ui/GameBroadcastFragment$mServiceConnection$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8iIZZA0GFt2YQS2oAhm9vdyKAXXq8iJQQ=", null)));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            if (objArr != null) {
                Object obj = objArr[0];
                Object obj2 = objArr[1];
            }
            C0UZ9 c0uz9 = this.LL.LLJJI;
            if (c0uz9 != null) {
                if (c0uz9.LLILZLL == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                this.LL.BS(1, -1);
            } else {
                C776870Udh c776870Udh = this.LL.LLJJIJI;
                if (c776870Udh != null) {
                    Intent intent = c776870Udh.LJJIJ;
                    if (intent != null) {
                        c776870Udh.LJIJJLI(intent, CertProviderManagerKt.findCert("bpea-577", 1476788233));
                    }
                    if (C500260Jjc.LJJJI((Boolean) c776870Udh.LIZJ.gg0(C755590TkT.class))) {
                        c776870Udh.LIZIZ.uS(c776870Udh.LJJIJ, c776870Udh.LJIIJJI, false, c776870Udh.LIZJ);
                        c776870Udh.LIZJ.SX0(C755590TkT.class, Boolean.FALSE);
                        AbstractC776930Udn abstractC776930Udn = c776870Udh.LJIIZILJ;
                        if (abstractC776930Udn != null) {
                            abstractC776930Udn.LJIIJJI(false);
                        }
                        c776870Udh.LIZJ.zW(GameBroadcastStateChannel.class, C0TD3.STATE_CONNECTED);
                        Iterator it2 = ((ArrayList) c776870Udh.LJJLIIIJILLIZJL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC776570UdD) it2.next()).LIZJ();
                        }
                    }
                }
                C0TBQ c0tbq = this.LL.LLJL;
                if (c0tbq != null) {
                    c0tbq.LJIILIIL = true;
                }
            }
            GameBroadcastFragment gameBroadcastFragment = this.LL;
            Context context = gameBroadcastFragment.getContext();
            if (context != null) {
                boolean zLIZ = new C815520Vyw(context).LIZ();
                if (Build.VERSION.SDK_INT >= 33 && !zLIZ && (activity = gameBroadcastFragment.getActivity()) != null) {
                    C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-game_broadcast_post_notification_on_start")).LIZIZ("android.permission.POST_NOTIFICATIONS").LIZJ(new C786240Uso(gameBroadcastFragment, 2));
                }
            }
        }
    };
    public final long LLLI = GameStartMirrorServiceIntervalSetting.INSTANCE.getValue();
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 291));
    public final C11NJ LLLIIIIL = new C11NJ();
    public final C01GW LLLIIIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 288));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 289));

    @Override // X.InterfaceC774920UaY
    public final void GR() {
    }

    @Override // X.InterfaceC774920UaY
    public final void HQ() {
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
    public final void Th(float f) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void Xz(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
    }

    @Override // X.InterfaceC774920UaY
    public final void cN() {
    }

    @Override // X.InterfaceC774920UaY
    public final void fE() {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // X.InterfaceC774920UaY
    public final void kn(AbstractC1273900jFs abstractC1273900jFs, Cert cert) {
    }

    @Override // X.InterfaceC774920UaY
    public final /* synthetic */ void mQ() {
    }

    @Override // X.InterfaceC774920UaY
    public final void vn(double d, double d2, double d3) {
    }

    public final void FS() throws Throwable {
        rS("startService");
        C0TBQ c0tbq = this.LLJL;
        if (c0tbq != null) {
            c0tbq.LJ();
            this.LLIZ = true;
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC420801kM interfaceC420801kM = this.LLLILZ;
            if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                InterfaceC420801kM interfaceC420801kM2 = this.LLLILZ;
                if (interfaceC420801kM2 != null) {
                    interfaceC420801kM2.dispose();
                }
                this.LLLILZ = null;
            }
            C19EG activity = getActivity();
            if (activity != null) {
                Context context = getContext();
                C2204961BRm.LLJJJJLIIL(activity, context != null ? nS(context) : null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8iIZZA0GFt2YQS2oAhm9vdyKAXXq8iJQQ=", null));
            }
        } else {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                Context context2 = getContext();
                C2204961BRm.LLJJL(activity2, context2 != null ? nS(context2) : null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8iIZZA0GFt2YQS2oAhm9vdyKAXXq8iJQQ=", null));
            }
        }
        this.LLIZ = true;
    }

    public final void JS() {
        IHostAction iHostAction;
        C11PQ<Integer> bgBroadcastServiceState;
        rS("stopService");
        try {
            C0TBQ c0tbq = this.LLJL;
            if (c0tbq != null) {
                c0tbq.LJFF();
                this.LLIZ = false;
                return;
            }
            if (this.LLJ) {
                C19EG activity = getActivity();
                if (activity != null) {
                    activity.unbindService(this.LLLFZ);
                }
                this.LLJ = false;
            }
            if (this.LLIZ) {
                if (Build.VERSION.SDK_INT <= 26 || (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) == null || iHostAction.getBgBroadcastServiceCreate()) {
                    C19EG activity2 = getActivity();
                    if (activity2 != null) {
                        Context context = getContext();
                        activity2.stopService(context != null ? nS(context) : null);
                    }
                } else {
                    InterfaceC420801kM interfaceC420801kM = this.LLLILZ;
                    if (interfaceC420801kM != null) {
                        interfaceC420801kM.dispose();
                    }
                    IHostAction iHostAction2 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    if (iHostAction2 != null && (bgBroadcastServiceState = iHostAction2.getBgBroadcastServiceState()) != null) {
                        this.LLLILZ = ((C0J1N) bgBroadcastServiceState.LJJIL(new InterfaceC19483011Ki() { // from class: X.0TBU
                            @Override // X.InterfaceC19483011Ki
                            public final boolean test(Object obj) {
                                IHostAction iHostAction3 = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                                if (iHostAction3 != null && iHostAction3.getBgBroadcastServiceCreate()) {
                                    return true;
                                }
                                return false;
                            }
                        }).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 104), new C09JN() { // from class: X.0T6i
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("GameBroadcastFragment@2a83.stopService$1$3");
                                C20441214yg.LJII((Throwable) obj);
                                C1C7U.LIZIZ("GameBroadcastFragment@2a83.stopService$1$3");
                            }
                        });
                    }
                }
                this.LLIZ = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LIZLLL(th.getMessage());
        }
    }

    public final void NS() {
        if (GameStartMirrorServiceSetting.INSTANCE.getValue()) {
            ((Handler) this.LLLIIII.getValue()).removeCallbacksAndMessages(null);
            Context context = getContext();
            if (context == null || this.LLJL == null) {
                return;
            }
            C20441214yg.LIZIZ("GameBgServiceHelper", "stopMirrorCheckWorkManager");
            C0VI1.LJII(context).LJ("MirrorServiceChecker");
            MirrorServiceWorker.LLIZ = null;
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void UR() throws Exception {
        C0TBQ c0tbq;
        MediaProjectionManager mediaProjectionManager;
        rS("onLiveActivityCreated");
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportBroadcastCreated();
        getDataChannel().zW(LiveModeChannel.class, LiveMode.SCREEN_RECORD);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZ(getRoomId(), getDataChannel(), "BgBroadcastFragment_OnActivityCreated");
        if (LinkCrossRoomDataHolder.LJLLLL) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().setIsAnchor(true);
        }
        this.LLJILJILJ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLiveIllegalHelper(PR(), getContext(), getDataChannel(), this);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createCloseRoomHelper(PR(), getContext(), getDataChannel(), this, this);
        ((C777340UeS) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createSyncGiftHelper(PR())).LIZ();
        if (Build.VERSION.SDK_INT >= LiveBgServiceStrategySetting.INSTANCE.getValue()) {
            this.LLJL = new C0TBQ(this, getActivity(), this.LLLFZ);
        }
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null) {
            Context context = c776870Udh.LJI;
            if (context != null) {
                C785760Us2 c785760Us2 = c776870Udh.LJJLL;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
                C786410Ut5.LJIJJ(context, c785760Us2, intentFilter);
            }
            c776870Udh.LJJIJ = (Intent) DataChannelGlobal.LLILZ.gg0(C168G.class);
            if (EnableTTCaptureSetting.INSTANCE.enable()) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initLiveBroadcastContext();
                if (c776870Udh.LJJIJ == null) {
                    Context context2 = c776870Udh.LJI;
                    Object objH2 = context2 != null ? C786410Ut5.H2(context2, "media_projection") : null;
                    if ((objH2 instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) objH2) != null) {
                        try {
                            Intent intentLJIILLIIL = C776870Udh.LJIILLIIL(mediaProjectionManager, CertProviderManagerKt.findCert("bpea-live_page_check_intent", 1476411393));
                            GameBroadcastFragment gameBroadcastFragment = c776870Udh.LIZIZ;
                            C1701330uNH.LIZ(intentLJIILLIIL, gameBroadcastFragment);
                            C2204961BRm.LLLIIL(gameBroadcastFragment, intentLJIILLIIL, LSPassThroughRecordSizeConfig.DEFAULT, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("live page check intent exception  msg: ");
                            sbLIZ.append(e.getMessage());
                            C20441214yg.LJ("GameUiStrategy", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }
            Iterator it2 = ((ArrayList) c776870Udh.LJJLIIIJILLIZJL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC776570UdD) it2.next()).LIZ();
            }
        }
        FS();
        if (GameStartMirrorServiceSetting.INSTANCE.getValue()) {
            ((Handler) this.LLLIIII.getValue()).removeCallbacksAndMessages(null);
            Message messageObtain = Message.obtain();
            messageObtain.what = 1001;
            C786410Ut5.LJLJLJ((Handler) this.LLLIIII.getValue(), messageObtain, this.LLLI);
            Context context3 = getContext();
            if (context3 != null && (c0tbq = this.LLJL) != null) {
                C20441214yg.LIZIZ("GameBgServiceHelper", "openMirrorCheckWorkManager");
                C0VIQ c0viq = new C0VIQ();
                c0viq.LIZ = false;
                c0viq.LIZJ = false;
                C0VIK c0vik = new C0VIK(c0viq);
                if (MirrorServiceWorker.LLIZ == null) {
                    MirrorServiceWorker.LLIZ = new AwS413S0200000_12(c0tbq, context3, 77);
                }
                C0VIM c0vim = new C0VIM(MirrorServiceWorker.class, TimeUnit.MINUTES, TimeUnit.SECONDS);
                c0vim.LIZJ.LJIIIZ = c0vik;
                C0VI1.LJII(context3).LIZJ("MirrorServiceChecker", C0VIA.REPLACE, c0vim.LIZ());
            }
        }
        BroadcastTimeLog.LIZ("live_page_load", String.valueOf(System.currentTimeMillis()));
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).fetchGiftAnchorPanelActivityInfo(PR(), getDataChannel());
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
        C776890Udj c776890Udj;
        InterfaceC1100800ekg interfaceC1100800ekgMc1;
        InterfaceC770130UIx liveCoreInitUtil;
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup()) {
            C743070TCv c743070TCv = this.LLLIIL;
            if (c743070TCv != null) {
                c743070TCv.LIZLLL();
            }
            this.LLLIIL = null;
        }
        if (GameStopBackgroundAnimationSetting.INSTANCE.getValue()) {
            DataChannelGlobal.LLILZ.HQ2(GameLiveIsBackgroundData.class, Boolean.FALSE);
        }
        boolean zLJFF = C0W78.LJFF(C497740JfY.LJII());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_over_ingame_overlay_permission");
        c474500IjALIZ.LJJII(Long.valueOf(RR()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(getRoomId()), "room_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJFF ? 1 : 0), "overlay_permission");
        c474500IjALIZ.LIZ();
        super.aS();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).destroyGiftBannedManager();
        rS("onLiveDestroy");
        wS(CertProviderManagerKt.findCert("bpea-578", 1476788483));
        C778290Ufz c778290Ufz = this.LLJZ;
        if (c778290Ufz != null && GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJI(EnumC777480Ueg.LOW_PERFORMANCE, c778290Ufz);
        }
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null && !c776870Udh.LJIJI()) {
            C777840UfG.LJFF();
            C779530Uhz c779530Uhz = c776870Udh.LJJI;
            if (c779530Uhz != null) {
                c779530Uhz.LIZ.zQ2(c779530Uhz);
            }
            c776870Udh.LJJII(EnumC779790UiP.CMD_TRANSITION_TO_DESTROY);
            ((DialogFragment) c776870Udh.LJJIJL.getValue()).dismiss();
            c776870Udh.LJIILJJIL.dispose();
            c776870Udh.LIZJ.zQ2(c776870Udh);
            AbstractC776930Udn abstractC776930Udn = c776870Udh.LJIIZILJ;
            if (abstractC776930Udn != null) {
                abstractC776930Udn.LJIIJ();
            }
            InterfaceC779960Uig interfaceC779960Uig = c776870Udh.LJJJJI;
            if (interfaceC779960Uig != null) {
                interfaceC779960Uig.onDestroy();
            }
            C778390Ug9 c778390Ug9 = c776870Udh.LJJIJIL;
            if (c778390Ug9 != null) {
                C776680UdO c776680UdO = c778390Ug9.LLJILJILJ;
                if (c776680UdO != null) {
                    C774950Uab.LJII.remove(c776680UdO);
                    c778390Ug9.LLJILJILJ = null;
                }
                c778390Ug9.LLILZLL.removeCallbacksAndMessages(null);
                if (c778390Ug9.LLJILLL > 0) {
                    c778390Ug9.LLJJ += System.currentTimeMillis() - c778390Ug9.LLJILLL;
                    c778390Ug9.LLJILLL = 0L;
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_mic_off_duration");
                c474500IjALIZ2.LJJII(String.valueOf(c778390Ug9.LLILLJJLI.getOwnerUserId()), "anchor_id");
                c474500IjALIZ2.LJJII(c778390Ug9.LLILLJJLI.getIdStr(), "room_id");
                c474500IjALIZ2.LJJII(Long.valueOf(c778390Ug9.LLJJ), "duration");
                c474500IjALIZ2.LIZ();
                c778390Ug9.LLILZ.zQ2(c778390Ug9);
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    C777840UfG.LJI(EnumC777480Ueg.AUDIO_FOCUS, c778390Ug9);
                }
            }
            C779480Uhu c779480Uhu = c776870Udh.LJIJ;
            if (c779480Uhu != null) {
                c779480Uhu.LLJILJILJ.dispose();
                DataChannel dataChannel = c779480Uhu.LLJJ;
                if (dataChannel != null) {
                    dataChannel.zQ2(c779480Uhu);
                }
            }
            C779260UhY c779260UhY = c776870Udh.LJIJJLI;
            if (c779260UhY != null) {
                DataChannel dataChannel2 = c779260UhY.LJII;
                if (dataChannel2 != null) {
                    dataChannel2.zQ2(c779260UhY);
                }
                c779260UhY.LJI = null;
                c779260UhY.LJII = null;
            }
            Context context = c776870Udh.LJI;
            if (context != null) {
                C786410Ut5.LJJIFFI(context, c776870Udh.LJJLL);
            }
            C778120Ufi c778120Ufi = c776870Udh.LJJJJZ;
            C11JF c11jf = c778120Ufi.LLILZLL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c778120Ufi.LLILZLL = null;
            C11JF c11jf2 = c778120Ufi.LLIZ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            c778120Ufi.LLIZ = null;
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LJI(EnumC777480Ueg.VOLUME, c778120Ufi);
            }
            InterfaceC776970Udr interfaceC776970Udr = c776870Udh.LJJLI;
            if (interfaceC776970Udr != null) {
                interfaceC776970Udr.release();
            }
            InterfaceC777000Udu interfaceC777000Udu = c776870Udh.LIZLLL;
            if (interfaceC777000Udu != null) {
                interfaceC777000Udu.release();
            }
            C778080Ufe c778080Ufe = c776870Udh.LJJLJLI;
            if (c778080Ufe != null) {
                C20441214yg.LJIIIZ("GameInteractionNoticeStrategy", "release()");
                IMessageManager iMessageManager = c778080Ufe.LLILZ;
                if (iMessageManager != null) {
                    iMessageManager.removeMessageListener((OnIMMessageListener) c778080Ufe);
                }
                c778080Ufe.LLILZ = null;
                Iterator<Class<? extends IMessage>> it2 = c778080Ufe.LLILZIL.keySet().iterator();
                while (it2.hasNext()) {
                    InterfaceC778470UgH<? extends IMessage> interfaceC778470UgH = c778080Ufe.LLILZIL.get(it2.next());
                    if (interfaceC778470UgH != null) {
                        interfaceC778470UgH.onRelease();
                    }
                }
                c778080Ufe.LLILZIL.clear();
                DataChannel dataChannel3 = c778080Ufe.LL;
                if (dataChannel3 != null) {
                    dataChannel3.zQ2(c778080Ufe);
                }
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    C777840UfG.LJI(EnumC777480Ueg.GAME_INTERACTION, c778080Ufe);
                }
            }
            C780110Uiv c780110Uiv = c776870Udh.LJJLIIIJ;
            if (c780110Uiv != null) {
                IMessageManager iMessageManager2 = c780110Uiv.LL;
                if (iMessageManager2 != null) {
                    iMessageManager2.removeMessageListener(c780110Uiv);
                }
                c780110Uiv.LL = null;
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    C777840UfG.LJI(EnumC777480Ueg.POLL, c780110Uiv);
                }
            }
            Iterator it3 = ((ArrayList) c776870Udh.LJJLIIIJILLIZJL).iterator();
            while (it3.hasNext()) {
                ((InterfaceC776570UdD) it3.next()).LIZIZ();
            }
            Iterator<C09AE> it4 = c776870Udh.LJJIJLIJ.iterator();
            while (it4.hasNext()) {
                it4.next().LIZIZ(null);
            }
            ((ArrayList) c776870Udh.LJJLIIIJILLIZJL).clear();
            IMessageManager iMessageManager3 = c776870Udh.LJJLIIIIJ;
            if (iMessageManager3 != null) {
                iMessageManager3.removeMessageListener(c776870Udh.LJ);
            }
            c776870Udh.LJJLIIIIJ = null;
            C779190UhR c779190UhR = c776870Udh.LJJLJ;
            if (c779190UhR != null) {
                c779190UhR.LIZIZ = null;
                c779190UhR.LIZ = null;
                c779190UhR.LIZJ = 0L;
            }
            c776870Udh.LJJLJ = null;
            C11JF c11jf3 = C471201sU.LIZJ;
            if (c11jf3 != null && !c11jf3.isDisposed()) {
                c11jf3.dispose();
            }
            C471201sU.LIZJ = null;
            C11JF c11jf4 = C471201sU.LIZIZ;
            if (c11jf4 != null && !c11jf4.isDisposed()) {
                c11jf4.dispose();
            }
            C471201sU.LIZIZ = null;
            C471201sU.LIZ = null;
            C471201sU.LIZLLL.clear();
            C471201sU.LJ = null;
            C776940Udo c776940Udo = c776870Udh.LJJLIIIJLLLLLLLZ;
            if (c776940Udo != null) {
                C11JF c11jf5 = c776940Udo.LIZJ;
                if (c11jf5 != null) {
                    c11jf5.dispose();
                }
                c776940Udo.LIZ = null;
            }
            if (LiveGameSafetyReporterSetting.INSTANCE.getValue().f29switch) {
                C20441214yg.LIZIZ("SafetyFeatureReporter", "stopReport");
                C11JF c11jf6 = C777250UeJ.LIZ;
                if (c11jf6 != null) {
                    c11jf6.dispose();
                }
                C777250UeJ.LIZ = null;
            }
            C776410Ucx c776410Ucx = c776870Udh.LJJJJZI;
            c776410Ucx.getClass();
            Map<String, Object> map = C1338270kvh.LIZ;
            if (EnableFallbackAudioOldChainSetting.INSTANCE.enable()) {
                DataChannelGlobal.LLILZ.zQ2(c776410Ucx.LL);
            }
            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
            if (iBroadcastService != null && iBroadcastService.getLiveAudioDevicesDetector() != null) {
                LiveAudioDevicesDetector.LJIIIIZZ.remove(c776410Ucx.LLIZLLLIL);
            }
            C779660UiC c779660UiC = C779660UiC.LIZ;
            C779660UiC.LJII.remove(c776410Ucx.LLIZLLLIL);
            C777840UfG.LJI(EnumC777480Ueg.HEADPHONE, c776410Ucx);
            c776410Ucx.LIZ();
            c776410Ucx.LLILLJJLI.LIZIZ().UO0(6);
            C776490Ud5 c776490Ud5 = c776870Udh.LJJJLIIL;
            if (c776490Ud5 != null) {
                DataChannelGlobal.LLILZ.zQ2(c776490Ud5.LL);
                C777840UfG.LJI(EnumC777480Ueg.MIC_MUTE, c776490Ud5);
                c776490Ud5.LLILLJJLI.zQ2(c776490Ud5.LL);
                c776490Ud5.LIZ();
                c776490Ud5.LLILLL.LIZIZ().UO0(10);
            }
        }
        C777840UfG.LJFF();
        this.LLLIIIIL.dispose();
        AnonymousClass0956 anonymousClass0956 = this.LLJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJLILLLLZIIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        if (FrameSignV3Setting.INSTANCE.enable()) {
            C11JF c11jf7 = C774760UaI.LIZ;
            if (c11jf7 != null) {
                c11jf7.dispose();
            }
            C11JF c11jf8 = C774760UaI.LIZIZ;
            if (c11jf8 != null) {
                c11jf8.dispose();
            }
            C774760UaI.LIZ = null;
            C774760UaI.LIZIZ = null;
            ((LinkedHashMap) C774760UaI.LIZJ).clear();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.IQ2(C930940aKi.class);
        dataChannelGlobal.HQ2(PreviewSubOnlyLiveSwitchChannel.class, Boolean.FALSE);
        dataChannelGlobal.zQ2(this);
        dataChannelGlobal.IQ2(C168G.class);
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.sw0("stream");
        if (iPerformanceManager.JI2()) {
            iPerformanceManager.Za1();
        } else {
            iPerformanceManager.yL0();
        }
        iPerformanceManager.setIsAnchor(false);
        iPerformanceManager.release();
        iPerformanceManager.oB1();
        iPerformanceManager.d01(-1.0f);
        iPerformanceManager.Gp0(-1.0d);
        iPerformanceManager.NE1();
        ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Yg();
        C1EOY c1eoy = C1EOY.LIZ;
        C1EOY.LJIIIIZZ();
        IBroadcastService iBroadcastService2 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService2 != null) {
            iBroadcastService2.releaseMicMuteHelper(getDataChannel());
        }
        IBroadcastService iBroadcastService3 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService3 != null && (liveCoreInitUtil = iBroadcastService3.getLiveCoreInitUtil()) != null) {
            liveCoreInitUtil.LIZLLL(null, false);
        }
        C0TBQ c0tbq = this.LLJL;
        if (c0tbq != null) {
            C0TBQ.LIZLLL("release");
            c0tbq.LJIIIIZZ.dispose();
            C11JF c11jf9 = c0tbq.LJIIIZ;
            if (c11jf9 != null) {
                c11jf9.dispose();
            }
        }
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).releaseGoLiveManager();
        C11JF c11jf10 = this.LLL;
        if (c11jf10 != null) {
            c11jf10.dispose();
        }
        if (BroadcastGameLiveAdaptiveSwitcherSetting.INSTANCE.enable() && (interfaceC1100800ekgMc1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).mc1(getDataChannel())) != null) {
            iPerformanceManager.JV(interfaceC1100800ekgMc1);
            interfaceC1100800ekgMc1.destroy();
        }
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).d8();
        IBroadcastService iBroadcastService4 = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService4 != null) {
            iBroadcastService4.releaseHostToolsCallback(getDataChannel());
        }
        if (!EnableGameBroadcastFrameSetting.INSTANCE.enable() || (c776890Udj = this.LLLF) == null) {
            return;
        }
        C774940Uaa c774940Uaa = this.LLJJIJIIJIL;
        InterfaceC769940UIe interfaceC769940UIe = (c774940Uaa != null ? c774940Uaa : null).LLILZ;
        if (interfaceC769940UIe != null) {
            interfaceC769940UIe.getLiveCore();
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        C11JF c11jf11 = c776890Udj.LIZJ;
        if (c11jf11 != null) {
            c11jf11.dispose();
        }
        C776910Udl c776910Udl = c776890Udj.LIZLLL;
        if (c776910Udl != null) {
            c776910Udl.LIZIZ.set(false);
            Bundle bundle = new Bundle();
            bundle.putInt("mode", 2);
            bundle.putInt(Scene.SCENE_SERVICE, 2);
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void bS() {
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).onDestroy();
        C0UU3 c0uu3 = this.LLJLLL;
        if (c0uu3 != null) {
            C19322110iZ.LJII(((C781300Ukq) c0uu3).LJIJI);
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void bz() {
        C776610UdH c776610UdH = this.LLJILLL;
        if (c776610UdH != null) {
            c776610UdH.LIZIZ = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void cS() {
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null) {
            Iterator it2 = ((ArrayList) c776870Udh.LJJLIIIJILLIZJL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC776570UdD) it2.next()).onPause();
            }
            if (c776870Udh.LJIIL) {
                Iterator<C09AE> it3 = c776870Udh.LJJIJLIJ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZIZ(null);
                }
                InterfaceC776970Udr interfaceC776970Udr = c776870Udh.LJJLI;
                if (interfaceC776970Udr != null) {
                    interfaceC776970Udr.LJFF();
                }
                InterfaceC777000Udu interfaceC777000Udu = c776870Udh.LIZLLL;
                if (interfaceC777000Udu != null) {
                    interfaceC777000Udu.LJFF();
                }
            }
        }
        C1EOY.LIZ.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment.dS():void");
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, X.C1AKO
    public final void finish() {
        try {
            AbstractC776850Udf abstractC776850UdfLIZ = C776920Udm.LIZ("control_view");
            if (abstractC776850UdfLIZ != null) {
                abstractC776850UdfLIZ.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LIZLLL(th.getMessage());
        }
        try {
            AbstractC776850Udf abstractC776850UdfLIZ2 = C776920Udm.LIZ("msg_view");
            if (abstractC776850UdfLIZ2 != null) {
                abstractC776850UdfLIZ2.LIZ();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C20441214yg.LIZLLL(th2.getMessage());
        }
        try {
            AbstractC776850Udf abstractC776850UdfLIZ3 = C776920Udm.LIZ("small_view");
            if (abstractC776850UdfLIZ3 != null) {
                abstractC776850UdfLIZ3.LIZ();
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C20441214yg.LIZLLL(th3.getMessage());
        }
        rS("finish");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final boolean isViewValid() {
        return !this.mStatusDestroyed;
    }

    public final void mS() throws Throwable {
        if (this.LLIZLLLIL || this.LLJ) {
            return;
        }
        C0TBQ c0tbq = this.LLJL;
        if (c0tbq != null) {
            c0tbq.LIZ();
        } else {
            Context context = getContext();
            C19EG activity = getActivity();
            if (activity != null && context != null) {
                C2204961BRm.LLJJIJIIJIL(activity, nS(context), this.LLLFZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MzD/FV9f3YRV8iIZZA0GFt2YQS2oAhm9vdyKAXXq8iJQQ=", null));
            }
        }
        this.LLJ = true;
    }

    public final void oS() {
        if (this.LLLIILIL) {
            return;
        }
        this.LLLIILIL = true;
        C0UKZ.LLII.LIZJ(Boolean.FALSE);
        if (this.LLJILJIL) {
            C520010KaN.LIZLLL(this);
            return;
        }
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(32);
        if (C504210Jpz.LIZ) {
            C520010KaN.LIZLLL(this);
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS107S0100000_7(aFwS237S0000000_7, 84));
        } else {
            aFwS237S0000000_7.invoke(null);
            C520010KaN.LIZLLL(this);
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C247600xW c247600xW = (C247600xW) this.LLLFF.getValue();
        c247600xW.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        IMessageManager iMessageManager = c247600xW.LLILZ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c247600xW);
        }
        Iterator it2 = ((ArrayList) C247600xW.LLILZLL).iterator();
        while (it2.hasNext()) {
            C779470Uht.LIZ(0, -1, (String) it2.next(), "not receive im message before close");
        }
        super.onDestroyView();
    }

    public final void qS() {
        if (this.LLLIIL == null) {
            DataChannel dataChannel = getDataChannel();
            Room roomPR = PR();
            C774940Uaa c774940Uaa = this.LLJJIJIIJIL;
            if (c774940Uaa == null) {
                c774940Uaa = null;
            }
            this.LLLIIL = new C743070TCv(dataChannel, roomPR, c774940Uaa, this);
        }
    }

    @Override // X.C0UZ4
    public final InterfaceC774140UYi rA() {
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).lU0();
        return C753430Tgz.LIZ;
    }

    @Override // X.InterfaceC774920UaY
    public final void v5() {
        if (this.LLJJJJJIL) {
            return;
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(6, getDataChannel(), 0);
        this.LLJJJJJIL = true;
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void OR() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 134));
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void gS() throws Throwable {
        Boolean bool = (Boolean) getDataChannel().gg0(C755590TkT.class);
        if (bool == null || !bool.booleanValue()) {
            mS();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC774920UaY
    public final void onStreamStart() throws JSONException {
        AbstractC1273900jFs liveCore;
        AbstractC1273900jFs liveCore2;
        Room room;
        AbstractC1273900jFs liveCore3;
        C1269340j8W c1269340j8WLLD;
        double d;
        int i;
        int i2;
        C21406218pw.LIZIZ();
        rS("onStreamStart");
        if (this.LLJIJIL) {
            if (TtliveGameAnchorHeartbeatSetting.INSTANCE.useOpt()) {
                C774940Uaa c774940Uaa = this.LLJJIJIIJIL;
                if (c774940Uaa == null) {
                    c774940Uaa = null;
                }
                InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
                if (interfaceC769940UIe != null && (liveCore3 = interfaceC769940UIe.getLiveCore()) != null && (c1269340j8WLLD = liveCore3.LLD()) != null) {
                    IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                    int iLJJIJIL = c1269340j8WLLD.LJJIJIL();
                    int iLJJIJL = c1269340j8WLLD.LJJIJL();
                    int iLJJIFFI = c1269340j8WLLD.LJJIFFI();
                    boolean z = c1269340j8WLLD.LJJIJ() == 2;
                    boolean zLJJIL = c1269340j8WLLD.LIZ.mPushBase.LJJIL();
                    int iLJJIL = c1269340j8WLLD.LJJIL(0);
                    JSONObject jSONObject = new JSONObject();
                    PushBase pushBase = c1269340j8WLLD.LIZ.mPushBase;
                    JSONObject jSONObjectLJJJIL = pushBase != null ? pushBase.LJJJIL() : null;
                    C776870Udh c776870Udh = this.LLJJIJI;
                    boolean zLJJJI = C500260Jjc.LJJJI(c776870Udh != null ? Boolean.valueOf(c776870Udh.LJIIJJI) : null);
                    if (jSONObjectLJJJIL != null) {
                        try {
                            d = c1269340j8WLLD.LIZ.mPushBase.LJJIL() ? c1269340j8WLLD.LJJIJ() == 2 ? JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJJJIL, "hardBytevc1"), "bitrateRatio") : JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJJJIL, "hardH264"), "bitrateRatio") : c1269340j8WLLD.LJJIJ() == 2 ? JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJJJIL, "bytevc1"), "bitrateRatio") : JSONObjectProtectorUtils.getDouble(JSONObjectProtectorUtils.getJSONObject(jSONObjectLJJJIL, "bytevc0"), "bitrateRatio");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("addPerformanceMonitor exception");
                            sbLIZ.append(e);
                            C20441214yg.LJ("GameBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ));
                            d = 1.0d;
                        }
                        DisplayMetrics displayMetricsLJIILIIL = C497740JfY.LJIILIIL(getActivity());
                        i = displayMetricsLJIILIIL.widthPixels;
                        i2 = displayMetricsLJIILIIL.heightPixels;
                        if (zLJJJI && i2 > i) {
                            i = i2;
                            i2 = i;
                        }
                        double dLJJIJIL = ((double) c1269340j8WLLD.LJJIJIL()) * d;
                        double d2 = LSPassThroughRecordSizeConfig.DEFAULT;
                        jSONObject.put("push_client_max_rate", (int) (dLJJIJIL / d2));
                        jSONObject.put("push_client_min_rate", (int) ((((double) c1269340j8WLLD.LJJIJL()) * d) / d2));
                        jSONObject.put("push_client_default_rate", (int) ((((double) c1269340j8WLLD.LJJIFFI()) * d) / d2));
                        jSONObject.put("enable_bframe", c1269340j8WLLD.LIZ.mPushBase.LJIIIZ() ? 1 : 0);
                        jSONObject.put("is_landscape", zLJJJI ? 1 : 0);
                        jSONObject.put("enable_bframe", c1269340j8WLLD.LIZ.mPushBase.LJIIIZ() ? 1 : 0);
                        jSONObject.put("screen_width", i);
                        jSONObject.put("screen_height", i2);
                        iBroadcastService.setPushStreamParams(iLJJIJIL, iLJJIJL, iLJJIFFI, z, zLJJIL, iLJJIL, jSONObject);
                    } else {
                        d = 1.0d;
                        DisplayMetrics displayMetricsLJIILIIL2 = C497740JfY.LJIILIIL(getActivity());
                        i = displayMetricsLJIILIIL2.widthPixels;
                        i2 = displayMetricsLJIILIIL2.heightPixels;
                        if (zLJJJI) {
                            i = i2;
                            i2 = i;
                        }
                        double dLJJIJIL2 = ((double) c1269340j8WLLD.LJJIJIL()) * d;
                        double d22 = LSPassThroughRecordSizeConfig.DEFAULT;
                        jSONObject.put("push_client_max_rate", (int) (dLJJIJIL2 / d22));
                        jSONObject.put("push_client_min_rate", (int) ((((double) c1269340j8WLLD.LJJIJL()) * d) / d22));
                        jSONObject.put("push_client_default_rate", (int) ((((double) c1269340j8WLLD.LJJIFFI()) * d) / d22));
                        jSONObject.put("enable_bframe", c1269340j8WLLD.LIZ.mPushBase.LJIIIZ() ? 1 : 0);
                        jSONObject.put("is_landscape", zLJJJI ? 1 : 0);
                        jSONObject.put("enable_bframe", c1269340j8WLLD.LIZ.mPushBase.LJIIIZ() ? 1 : 0);
                        jSONObject.put("screen_width", i);
                        jSONObject.put("screen_height", i2);
                        iBroadcastService.setPushStreamParams(iLJJIJIL, iLJJIJL, iLJJIFFI, z, zLJJIL, iLJJIL, jSONObject);
                    }
                }
            }
            C773220UUu c773220UUu = C773220UUu.LIZ;
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(this, 548);
            c773220UUu.getClass();
            C773220UUu.LJIIL(awS591S0100000_12);
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportStartPushStream((WeakHandler) this.LLJJJJLIIL.getValue());
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(5, getDataChannel(), 0);
        } else {
            getDataChannel().zW(GameBroadcastStateChannel.class, C0TD3.STATE_RESTARTED);
        }
        if (GameDualDeviceInvitingProtectSetting.INSTANCE.isDefault() && GameDualDeviceInvitingSetting.INSTANCE.isExperiment() && this.LLJIJIL && !((IGameService) C1161920gLG.LIZJ(IGameService.class)).dU()) {
            C743070TCv c743070TCv = this.LLLIIL;
            if (c743070TCv != null) {
                c743070TCv.LIZLLL();
            }
            this.LLLIIL = null;
        }
        boolean z2 = false;
        this.LLJIJIL = false;
        C776610UdH c776610UdH = this.LLJILLL;
        if (c776610UdH != null) {
            c776610UdH.LIZJ = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("user_id", UserService.getInstance().user().getCurrentUserId());
                C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
                if (c0ir5 != null && (room = c0ir5.LIZIZ) != null) {
                    jSONObject2.put("room_id", room.getId());
                    jSONObject2.put("anchor_id", room.getOwnerUserId());
                    jSONObject2.put("live_mode", room.liveRoomMode);
                    jSONObject2.put("game_label", room.getLabels());
                }
                jSONObject2.put("stream_push_room_success", c776610UdH.LIZ);
                jSONObject2.put("stream_push_core_start", c776610UdH.LIZIZ);
                jSONObject2.put("stream_push_accessed", c776610UdH.LIZJ);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1CC2.LIZ(String.valueOf(e2), e2);
            }
            liveCore = null;
            C1CC2.LJI("livesdk_gamelive_spend", new JSONObject(), null, jSONObject2);
        } else {
            liveCore = null;
        }
        try {
            C20337914i1<String> c20337914i1 = InterfaceC772390URp.LLZLLLL;
            if (!Intrinsics.LJFF(c20337914i1.LIZIZ(), PR().getIdStr())) {
                InterfaceC772390URp.LLZLLIL.LJFF(String.valueOf(C158B.LIZ() - PR().getCreateTime()));
                c20337914i1.LJFF(PR().getIdStr());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addRoomStartStreamRecord exception ");
            sbLIZ2.append(th);
            C20441214yg.LJ("GameBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!C500260Jjc.LJJJI((Boolean) getDataChannel().gg0(PauseLiveChannel.class))) {
            getDataChannel().zW(GameBroadcastStateChannel.class, C0TD3.STATE_CONNECTED);
        }
        Creator creator = PR().creator;
        if (creator != null && creator.roomContinue == 3 && LiveGameResetRotationResumeSceneSettingSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("rotation", 1);
                C774940Uaa c774940Uaa2 = this.LLJJIJIIJIL;
                C774940Uaa c774940Uaa3 = c774940Uaa2;
                if (c774940Uaa2 == null) {
                    c774940Uaa3 = liveCore;
                }
                InterfaceC769940UIe interfaceC769940UIe2 = c774940Uaa3.LLILZ;
                if (interfaceC769940UIe2 != null && (liveCore2 = interfaceC769940UIe2.getLiveCore()) != null) {
                    liveCore2.LJJIZ("game_orientation", true, true, "1610612752", -1, jSONObject3);
                }
                Map<String, Object> map = C1338270kvh.LIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C20441214yg.LIZLLL(th2.getMessage());
            }
        }
        boolean zDU = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).dU();
        Map<String, Object> map2 = C1338270kvh.LIZ;
        if (EnableGameBroadcastFrameSetting.INSTANCE.enable()) {
            if (((IGameService) C1161920gLG.LIZJ(IGameService.class)).dQ1().getFirst().floatValue() < AndroidGameFrameMinDeviceScoreSetting.INSTANCE.getValue()) {
                return;
            }
            if (this.LLLF == null) {
                GameTag gameTagLIZIZ = C754700Tj2.LIZIZ();
                if (gameTagLIZIZ != null && gameTagLIZIZ.landscape == 1) {
                    z2 = true;
                }
                C776890Udj c776890Udj = new C776890Udj(getDataChannel());
                this.LLLF = c776890Udj;
                C774940Uaa c774940Uaa4 = this.LLJJIJIIJIL;
                C774940Uaa c774940Uaa5 = c774940Uaa4;
                if (c774940Uaa4 == null) {
                    c774940Uaa5 = liveCore;
                }
                InterfaceC769940UIe interfaceC769940UIe3 = c774940Uaa5.LLILZ;
                if (interfaceC769940UIe3 != null) {
                    liveCore = interfaceC769940UIe3.getLiveCore();
                }
                C11JF c11jf = c776890Udj.LIZJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                c776890Udj.LIZJ = (C11JF) C11NZ.LJJJJJL(C776890Udj.LJFF, C776890Udj.LJI, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS32S0210000_12(c776890Udj, liveCore, z2, 6), new C09JN() { // from class: X.00Rh
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameLiveBackgroundFrameManager@16e4.init$2");
                        C20441214yg.LJFF("GameLiveBackgroundFrameManager", "countdown error", (Throwable) obj);
                        C1C7U.LIZIZ("GameLiveBackgroundFrameManager@16e4.init$2");
                    }
                });
            }
        }
        if (BroadcastGameLiveAdaptiveSwitcherSetting.INSTANCE.enable()) {
            C11JF c11jf2 = this.LLL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LLL = (C11JF) C11NZ.LJJJJLI(15L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS57S0110000_15(this, zDU, 19), new C09JN() { // from class: X.0T5x
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("GameBroadcastFragment@2a83.onStreamStart$4");
                    C1C7U.LIZIZ("GameBroadcastFragment@2a83.onStreamStart$4");
                }
            });
        }
    }

    public final void ES(GameBroadcastInteractionFragment gameBroadcastInteractionFragment) {
        Bundle bundle;
        if (!isAdded() || this.mStatusDestroyed || getChildFragmentManager().LJJJJZI("AbsInteractionFragment") != null) {
            return;
        }
        getDataChannel().zW(RoomChannel.class, PR());
        this.LLJJIJIL = gameBroadcastInteractionFragment;
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle = arguments.getBundle("extra");
        } else {
            bundle = null;
        }
        gameBroadcastInteractionFragment.setArguments(bundle);
        gameBroadcastInteractionFragment.RR(getDataChannel(), new AbstractC781140Uka() { // from class: X.0UZ3
            @Override // X.AbstractC781140Uka
            public final void LIZIZ(RemindMessage remindMessage) {
                C0UVT c0uvt;
                C0UU7 c0uu7 = this.LIZ.LLJILJILJ;
                if (c0uu7 != null && (c0uvt = ((C0UYF) c0uu7).LLILZIL) != null) {
                    c0uvt.LJJJJLI(remindMessage);
                }
            }
        });
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZJ(R.id.kvo, gameBroadcastInteractionFragment, "AbsInteractionFragment");
        c19ehLJIIJ.LJIIJ();
        gameBroadcastInteractionFragment.PR(new ARunnableS112S0100000_12(this, 396));
    }

    @Override // X.InterfaceC774920UaY
    public final void HA(long j) {
        C778170Ufn c778170Ufn;
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null && (c778170Ufn = c776870Udh.LJJL) != null) {
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                c778170Ufn.LJIIIIZZ(j);
            } else {
                C786410Ut5.LJJZZIII(c778170Ufn.LLJJ, new ARunnableS17S0100100_12(c778170Ufn, j, 4));
            }
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void LLLLIILL(int i) {
        InterfaceC781090UkV interfaceC781090UkV;
        if (SettingsManager.INSTANCE.getBooleanValue("live_anchor_status_diagnostics_enable", true) && (!this.mStatusDestroyed) && (interfaceC781090UkV = this.LLJJIJIL) != null) {
            interfaceC781090UkV.LLLLIILL(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e9  */
    /* JADX WARN: Type inference failed for: r0v77, types: [X.0Ub2] */
    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WR(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment.WR(android.os.Bundle):void");
    }

    @Override // X.InterfaceC774920UaY
    public final void gG(boolean z) {
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null) {
            C500730JkN c500730JkN = c776870Udh.LJJJZ;
            if (z) {
                if (c500730JkN.LLIZ) {
                    c500730JkN.LJI();
                    return;
                }
                return;
            }
            c500730JkN.getClass();
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void iS(View view) {
        IGameService iGameService;
        IMessageManager iMessageManagerMessageManagerProvider;
        IMessageManager iMessageManager;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).q51(PR().getId());
        C776870Udh c776870Udh = this.LLJJIJI;
        boolean z = false;
        if (c776870Udh != null) {
            c776870Udh.LJJIJIIJI = (C1324720kZq) C520010KaN.LIZJ(R.id.bnu, c776870Udh.LIZIZ);
            c776870Udh.LJJIJIIJIL = (ImageView) C520010KaN.LIZJ(R.id.ips, c776870Udh.LIZIZ);
            ImageView imageView = (ImageView) C520010KaN.LIZJ(R.id.lpo, c776870Udh.LIZIZ);
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
            }
            EnableGameBroadcastFrameSetting enableGameBroadcastFrameSetting = EnableGameBroadcastFrameSetting.INSTANCE;
            if (enableGameBroadcastFrameSetting.enable()) {
                C1324720kZq c1324720kZq = c776870Udh.LJJIJIIJI;
                if (c1324720kZq != null) {
                    c1324720kZq.getHierarchy().LJIJ(new ColorDrawable(-16777216), 1);
                }
            } else {
                C0JST.LIZ(c776870Udh.LJJIJIIJI, c776870Udh.LIZ);
            }
            if (enableGameBroadcastFrameSetting.enable()) {
                c776870Udh.LIZJ.BQ2(c776870Udh.LIZIZ.getViewLifecycleOwner(), ScreenRecordWidgetPosition.class, new AwS591S0100000_12(c776870Udh, 1101));
                c776870Udh.LIZJ.BQ2(c776870Udh.LIZIZ.getViewLifecycleOwner(), GameBroadcastFrameEndEvent.class, new AwS591S0100000_12(c776870Udh, 1103));
            }
        }
        C247600xW c247600xW = (C247600xW) this.LLLFF.getValue();
        long roomId = getRoomId();
        Creator creator = PR().creator;
        if (creator != null) {
            z = creator.isAnchorContinueKeepMsg;
        }
        c247600xW.LLILZIL = roomId;
        String strLIZ = null;
        if (!c247600xW.LLILLL) {
            Map<String, Object> map = C1338270kvh.LIZ;
            DataChannel dataChannel = c247600xW.LLILLJJLI;
            if (dataChannel == null || (iMessageManagerMessageManagerProvider = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
                iMessageManagerMessageManagerProvider = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).messageManagerProvider(roomId, true, z, (Context) c247600xW.LL);
                if (iMessageManagerMessageManagerProvider != null) {
                    DataChannel dataChannel2 = c247600xW.LLILLJJLI;
                    if (dataChannel2 != null) {
                        dataChannel2.SX0(C776250Uch.class, iMessageManagerMessageManagerProvider);
                    }
                } else {
                    iMessageManagerMessageManagerProvider = null;
                }
            }
            c247600xW.LLILZ = iMessageManagerMessageManagerProvider;
            if (iMessageManagerMessageManagerProvider != null) {
                iMessageManagerMessageManagerProvider.addMessageListener(C001A.HIGHLIGHT_FRAGMENT_READY_MESSAGE.getIntType(), c247600xW);
            }
            IMessageManager iMessageManager2 = c247600xW.LLILZ;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.MEMBER.getIntType(), c247600xW);
            }
            IMessageManager iMessageManager3 = c247600xW.LLILZ;
            if (iMessageManager3 != null) {
                iMessageManager3.addAsyncMessageListener(C001A.GAME_O_C_R_PING_MESSAGE.getIntType(), c247600xW);
            }
            if (GblServerFeaturesListSetting.INSTANCE.isEnableServerFeature() && (iMessageManager = c247600xW.LLILZ) != null) {
                iMessageManager.addAsyncMessageListener(C001A.GAME_SERVER_FEATURE_MESSAGE.getIntType(), c247600xW);
            }
            IMessageManager iMessageManager4 = c247600xW.LLILZ;
            if (iMessageManager4 != null) {
                iMessageManager4.addMessageListener(C001A.CONTROL.getIntType(), c247600xW);
            }
            c247600xW.LLILLL = true;
        }
        Map<String, Object> map2 = C1338270kvh.LIZ;
        if (GblServerFeaturesListSetting.INSTANCE.isEnableServerFeature() && (iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class)) != null) {
            iGameService.CE0(this, getRoomId());
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initGiftBannedManager(PR(), getDataChannel(), true);
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).fW1(getContext(), getDataChannel(), EnumC498960JhW.BROADCAST);
        if (FrameSignV3Setting.INSTANCE.enable()) {
            C11JF c11jf = C774760UaI.LIZ;
            C774760UaI.LIZIZ(PR().getId());
        }
        Creator creator2 = PR().creator;
        if (creator2 != null) {
            int i = creator2.roomContinue;
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
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setResumeLiveParams(i);
        }
        NR();
        this.LLJLLL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastInstructHelper(getDataChannel(), this, view.findViewById(R.id.ku8), view.findViewById(R.id.ku9), view.findViewById(R.id.mue));
        InterfaceC772190UQv.Q3.LJFF(Long.valueOf(PR().getId()));
        InterfaceC772190UQv.R3.LJFF(C354201Zc.LIZ(PR().getStreamType()));
        InterfaceC772190UQv.P3.LJFF(0L);
        InterfaceC772190UQv.S3.LJFF(Integer.valueOf(Process.myPid()));
    }

    @Override // X.InterfaceC773750UWv
    public final void jC(boolean z) {
        int i;
        if (z) {
            i = 10001;
        } else {
            i = 4;
        }
        uI(i);
        BS(1, -1);
    }

    public final Intent nS(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getBgBroadcastServiceName()));
        return intent;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigurationChanged , orientation = ");
        sbLIZ.append(configuration.orientation);
        rS(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void onEvent(C465900IOu c465900IOu) {
        int i;
        LiveAllModePingIntervalDropSetting liveAllModePingIntervalDropSetting = LiveAllModePingIntervalDropSetting.INSTANCE;
        if (liveAllModePingIntervalDropSetting.isEnable() && c465900IOu.LIZ == 52 && liveAllModePingIntervalDropSetting.isEnable()) {
            int i2 = c465900IOu.LIZIZ;
            if (i2 == 30003001 || i2 == 30003) {
                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                int i3 = c465900IOu.LIZIZ;
                long jRR = RR();
                long roomId = getRoomId();
                boolean z = this.LLJIJIL;
                Creator creator = PR().creator;
                if (creator != null) {
                    i = creator.roomContinue;
                } else {
                    i = 0;
                }
                iBroadcastService.reportStreamEndForApi(i3, jRR, roomId, z, i);
                C773220UUu c773220UUu = C773220UUu.LIZ;
                AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(c465900IOu, 549);
                c773220UUu.getClass();
                C773220UUu.LJIIL(awS591S0100000_12);
                HS(1, CertProviderManagerKt.findCert("bpea-413", 1476788483), c465900IOu.LIZIZ);
            }
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void pq(int i) {
        InterfaceC781090UkV interfaceC781090UkV;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkStatus -> ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GameBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        AwS55S0001000_12 awS55S0001000_12 = new AwS55S0001000_12(i, 1);
        c1276840jKc.getClass();
        C1276840jKc.LJJJJJL = awS55S0001000_12;
        if (!TtliveGameNetworkSpeedMonitorOptSetting.INSTANCE.useTTNet() && (interfaceC781090UkV = this.LLJJIJIL) != null) {
            interfaceC781090UkV.ZD(i);
        }
    }

    public final void rS(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameBroadcastFragment , ");
        sbLIZ.append(str);
        sbLIZ.append(" ，hasReleaseSource = ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(" , hasStartService = ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(" , hasBindService = ");
        sbLIZ.append(this.LLJ);
        C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void sS(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopLive: reason=");
        sbLIZ.append(i);
        rS(C2188811AlT.LIZIZ(sbLIZ));
        C0UZ9 c0uz9 = this.LLJJI;
        if (c0uz9 != null) {
            c0uz9.LJIILIIL(i, new InterfaceC774410UZj() { // from class: X.0UYv
                @Override // X.InterfaceC774410UZj
                public final void LIZ() {
                    if (AnchorFinishEncourageABSetting.INSTANCE.isMatch() || AnchorFinishEncourageV2ABSetting.INSTANCE.isEnable()) {
                        DataChannelGlobal.LLILZ.GQ2(NotifyServerLiveEndSucceedEvent.class);
                    }
                }
            });
        }
    }

    @Override // X.C0UZ4
    public final void uI(int i) {
        int i2;
        C0TD0 c0td0;
        Boolean boolValueOf;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        long jRR = RR();
        long roomId = getRoomId();
        boolean z = this.LLJIJIL;
        Creator creator = PR().creator;
        if (creator != null) {
            i2 = creator.roomContinue;
        } else {
            i2 = 0;
        }
        iBroadcastService.reportStreamEnd(i, jRR, roomId, z, i2, 0);
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup() && (c0td0 = (C0TD0) getDataChannel().gg0(C748900TZg.class)) != null) {
            C776870Udh c776870Udh = this.LLJJIJI;
            if (c776870Udh != null) {
                boolValueOf = Boolean.valueOf(c776870Udh.LJIIJJI);
            } else {
                boolValueOf = null;
            }
            c0td0.LIZIZ(i, C500260Jjc.LJJJI(boolValueOf));
        }
    }

    public final void wS(Cert cert) {
        C11LS c11ls;
        Boolean boolValueOf;
        C0TD0 c0td0;
        Boolean boolValueOf2;
        Context context;
        C0UVT c0uvt;
        rS("releaseSource");
        if (!this.LLJI) {
            boolean z = true;
            this.LLJI = true;
            LiveMessageSEI liveMessageSEI = new LiveMessageSEI();
            liveMessageSEI.timestamp = System.currentTimeMillis();
            LiveMessageID liveMessageID = new LiveMessageID();
            liveMessageID.primaryID = String.valueOf(getRoomId());
            liveMessageID.messageScene = "end_room";
            liveMessageSEI.uniqueID = liveMessageID;
            C774940Uaa c774940Uaa = this.LLJJIJIIJIL;
            if (c774940Uaa == null) {
                c774940Uaa = null;
            }
            InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
            if (interfaceC769940UIe != null) {
                interfaceC769940UIe.LIZ("live_message_sei", "1610665990", new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, liveMessageSEI)), false);
            }
            JS();
            NS();
            C774940Uaa c774940Uaa2 = this.LLJJIJIIJIL;
            if (c774940Uaa2 == null) {
                c774940Uaa2 = null;
            }
            c774940Uaa2.LJIIJ(cert);
            C0UU7 c0uu7 = this.LLJILJILJ;
            if (c0uu7 != null && (c0uvt = ((C0UYF) c0uu7).LLILZIL) != null) {
                c0uvt.LJJJJLL();
            }
            C776300Ucm c776300Ucm = this.LLJZIJLIL;
            if (c776300Ucm != null) {
                if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                    C777840UfG.LJI(EnumC777480Ueg.PERMISSION, c776300Ucm);
                }
                DataChannel dataChannel = c776300Ucm.LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.zQ2(c776300Ucm);
                }
                if (c776300Ucm.LLJ != null) {
                    try {
                        GameBroadcastFragment gameBroadcastFragment = c776300Ucm.LL;
                        if (gameBroadcastFragment != null && (context = gameBroadcastFragment.getContext()) != null) {
                            C786410Ut5.LJJIFFI(context, c776300Ucm.LLJ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unregister receiver exception msg ");
                        sbLIZ.append(e.getMessage());
                        C20441214yg.LJ("GameLivePauseController", C2188811AlT.LIZIZ(sbLIZ));
                        Throwable th = new Throwable();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("GameLivePauseController exception:");
                        sbLIZ2.append(e.getMessage());
                        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), th);
                    }
                    c776300Ucm.LLJ = null;
                }
            }
            C0UU7 c0uu72 = this.LLJILJILJ;
            if (c0uu72 != null) {
                C0UYF c0uyf = (C0UYF) c0uu72;
                c0uyf.LLIZ = true;
                C0UVT c0uvt2 = c0uyf.LLILZIL;
                if (c0uvt2 != null) {
                    c0uvt2.detachView();
                }
            }
            C774940Uaa c774940Uaa3 = this.LLJJIJIIJIL;
            if (c774940Uaa3 == null) {
                c774940Uaa3 = null;
            }
            c774940Uaa3.LJI();
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).V70();
            ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).release(PR().getId());
            ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).retryReleaseAll();
            LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
            C464550IJp.LIZJ(PR().getId(), "BgBroadcastFragment_OnDestroy");
            if (LinkCrossRoomDataHolder.LJLLLL) {
                ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIIIZZ("BgBroadcastFragment_OnDestroy");
            }
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).logLiveOver(PR(), getDataChannel());
            C776320Uco c776320Uco = this.LLJJ;
            if (c776320Uco != null && (c776320Uco.LIZJ || InterfaceC772390URp.M.LIZIZ().booleanValue())) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis - c776320Uco.LIZ;
                long j2 = c776320Uco.LIZLLL;
                long j3 = 0;
                if (j2 > 0) {
                    j3 = jCurrentTimeMillis - j2;
                    c776320Uco.LIZ(jCurrentTimeMillis);
                    c776320Uco.LIZLLL = -1L;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_end_event");
                try {
                    C1300340jwW c1300340jwW = C476230Ilx.LIZ;
                    c474500IjALIZ.LJJII(Integer.valueOf(c1300340jwW.LJ()), "battery_level");
                    c474500IjALIZ.LJJIFFI(Float.valueOf(c1300340jwW.LJFF), "temperature");
                    c474500IjALIZ.LJJII(Integer.valueOf(c1300340jwW.LJIIJJI), "voltage");
                    c474500IjALIZ.LJJII(Integer.valueOf(c1300340jwW.LJI()), "battery_scale");
                    c474500IjALIZ.LJJII(Integer.valueOf(c1300340jwW.LJIIIIZZ), "charge_status");
                    c474500IjALIZ.LJJIFFI(Float.valueOf(C783470UoL.LIZLLL(C497740JfY.LJII())), "battery_current");
                    c474500IjALIZ.LJJIFFI(Float.valueOf(C783470UoL.LIZJ(C497740JfY.LJII())), "battery_average");
                    c474500IjALIZ.LJJIII("battery_energy", Double.valueOf(C783470UoL.LIZIZ(C497740JfY.LJII())));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("get battery info failed ");
                    sbLIZ3.append(e2.getMessage());
                    C20441214yg.LJ("LiveGameInterruptionResumeMonitor", C2188811AlT.LIZIZ(sbLIZ3));
                }
                c474500IjALIZ.LJJII(c776320Uco.LIZIZ(), "anchor_id");
                c474500IjALIZ.LJJII("screen_share", "live_type");
                c474500IjALIZ.LJJII(Long.valueOf(c776320Uco.LIZJ()), "room_id");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LIZIZ), "error_times");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LJ), "exceed_three_minutes");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LJFF), "exceed_five_minutes");
                c474500IjALIZ.LJJII(Long.valueOf(j), "time_from_restart");
                c474500IjALIZ.LJJII(Long.valueOf(j3), "time_in_backGround");
                c474500IjALIZ.LJJII(Long.valueOf(c776320Uco.LJI), "max_time_in_backGround");
                c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LIZLLL()), "is_ignore_battery_opt");
                c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LJFF()), "is_power_save_mode");
                c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LIZJ()), "is_backGround_restricted");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LJII), "last_liveCore_error_code");
                c474500IjALIZ.LJJII(Boolean.valueOf(MultiDeviceInterruptGuideSetting.INSTANCE.isEnable()), "guide_switch");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LJIIJ), "error_times_complete_guide");
                C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.M;
                c474500IjALIZ.LJJII(c20337914i1.LIZIZ(), "has_complete_guide_last_live");
                c474500IjALIZ.LJJII(Boolean.valueOf(c776320Uco.LIZJ), "has_receive_error");
                c474500IjALIZ.LIZ();
                c20337914i1.LJFF(Boolean.valueOf(c776320Uco.LJIIIZ));
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            C776590UdF c776590UdF = (C776590UdF) dataChannelGlobal.gg0(C931370aLP.class);
            dataChannelGlobal.IQ2(C931370aLP.class);
            if (c776590UdF != null) {
                C776320Uco c776320Uco2 = this.LLJJ;
                if (c776320Uco2 != null) {
                    if (c776320Uco2.LJI < 60000) {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf) && C0UWE.LIZJ(c776590UdF.LIZ, Integer.valueOf(c776590UdF.LIZIZ))) {
                    c776590UdF.LIZ = 10;
                }
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportStreamEndForLiveCore(c776590UdF.LIZ, c776590UdF.LIZIZ, c776590UdF.LIZJ, c776590UdF.LIZLLL, c776590UdF.LJ, this.LLJIJIL, c776590UdF.LJFF);
                if (GameDualDeviceSetting.INSTANCE.isExperimentGroup() && (c0td0 = (C0TD0) getDataChannel().gg0(C748900TZg.class)) != null) {
                    C776870Udh c776870Udh = this.LLJJIJI;
                    if (c776870Udh != null) {
                        boolValueOf2 = Boolean.valueOf(c776870Udh.LJIIJJI);
                    } else {
                        boolValueOf2 = null;
                    }
                    c0td0.LIZIZ(c776590UdF.LIZ, C500260Jjc.LJJJI(boolValueOf2));
                }
                rS("releaseSource , remove interruptedData and report");
            }
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJL;
            if (aRunnableS112S0100000_12 != null) {
                ((Handler) this.LLJJJJLIIL.getValue()).removeCallbacks(aRunnableS112S0100000_12);
                this.LLJJL = null;
            }
            C0UZ9 c0uz9 = this.LLJJI;
            if (c0uz9 != null) {
                c0uz9.LIZJ();
            }
            C776630UdJ c776630UdJ = this.LLJJLIIIJLLLLLLLZ;
            if (c776630UdJ != null && LiveGamePauseSeiConfigSetting.INSTANCE.getValue().isAnchorEnable() && (c11ls = c776630UdJ.LIZIZ) != null) {
                c11ls.dispose();
            }
            C11JF c11jf = LLLILZJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            LLLILZJ = null;
        }
    }

    public final void onEvent(C777310UeP c777310UeP) {
        if (c777310UeP == null) {
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        C20441214yg.LIZIZ("dump", "onEvent -> the channel isn't local_test");
    }

    public final void onEvent(C777320UeQ c777320UeQ) {
        if (c777320UeQ == null) {
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        C20441214yg.LIZIZ("dump", "SetBitrate onEvent -> the channel isn't local_test");
    }

    public final void onEvent(C777300UeO c777300UeO) throws Exception {
        if (c777300UeO == null) {
            return;
        }
        jH(true, Boolean.FALSE);
    }

    public final void BS(int i, int i2) {
        boolean z;
        boolean z2;
        C776640UdK c776640UdK;
        if (PR().getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).showBroadCaseEndPage(z);
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).reportBroadcastEnd();
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null) {
            c776870Udh.LJJLIIIJJI = i;
        }
        InterfaceC772190UQv.P3.LJFF(0L);
        InterfaceC772190UQv.Q3.LJFF(0L);
        InterfaceC772190UQv.R3.LJFF("");
        InterfaceC772190UQv.S3.LJFF(0);
        if (this.mStatusDestroyed && i != 64) {
            return;
        }
        sS(i);
        this.LLIZLLLIL = true;
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
        C776870Udh c776870Udh2 = this.LLJJIJI;
        if (c776870Udh2 != null && c776870Udh2.LJIJI()) {
            this.LLJLL = true;
            return;
        }
        Bundle bundle = new Bundle();
        this.LLJLL = false;
        if (i2 == 10003 || i2 == 30003 || i2 == 30003001) {
            bundle.putInt("live_end_error_code", i2);
        }
        C776870Udh c776870Udh3 = this.LLJJIJI;
        if (c776870Udh3 != null) {
            Iterator it2 = ((ArrayList) c776870Udh3.LJJLIIIJILLIZJL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC776570UdD) it2.next()).LIZLLL();
            }
            try {
                AbstractC776850Udf abstractC776850UdfLIZ = C776920Udm.LIZ("control_view");
                if (abstractC776850UdfLIZ != null) {
                    abstractC776850UdfLIZ.LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LIZLLL(th.getMessage());
            }
            try {
                AbstractC776850Udf abstractC776850UdfLIZ2 = C776920Udm.LIZ("msg_view");
                if (abstractC776850UdfLIZ2 != null) {
                    abstractC776850UdfLIZ2.LIZ();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C20441214yg.LIZLLL(th2.getMessage());
            }
            try {
                AbstractC776850Udf abstractC776850UdfLIZ3 = C776920Udm.LIZ("small_view");
                if (abstractC776850UdfLIZ3 != null) {
                    abstractC776850UdfLIZ3.LIZ();
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C20441214yg.LIZLLL(th3.getMessage());
            }
            C777220UeG c777220UeG = c776870Udh3.LJIL;
            if (c777220UeG != null && (c776640UdK = c777220UeG.LIZLLL) != null) {
                bundle.putLong("live_end_ui_float_time", c776640UdK.LIZLLL);
                bundle.putFloat("live_end_ui_float_time_percent", c776640UdK.LJ);
                bundle.putLong("live_end_ui_snapped_time", c776640UdK.LIZIZ);
                bundle.putFloat("live_end_ui_snapped_time_percent", c776640UdK.LIZJ);
            }
        }
        InterfaceC773130UUl interfaceC773130UUl = this.LLILZLL;
        if (interfaceC773130UUl != null) {
            interfaceC773130UUl.LIZ(bundle);
        }
        if (EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable()) {
            C773530UVz c773530UVz = C773530UVz.LIZ;
            DataChannel dataChannel = getDataChannel();
            synchronized (c773530UVz) {
                C773530UVz.LIZJ.set(false);
                Map<String, Object> map = C1338270kvh.LIZ;
                C0UW2 c0uw2LJII = c773530UVz.LJII();
                c773530UVz.LJIIIIZZ(dataChannel, c0uw2LJII);
                if (c0uw2LJII != null && c0uw2LJII.LJIILLIIL >= 0.1f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0UW3.LJII = z2;
                C0UW3.LIZ(C773530UVz.LIZLLL);
                c773530UVz.LJIIIZ();
            }
        }
        Iterator it3 = ((LinkedHashMap) C0UW6.LIZ).entrySet().iterator();
        while (it3.hasNext()) {
            C0UWD c0uwd = (C0UWD) ((Map.Entry) it3.next()).getValue();
            if (c0uwd != null) {
                c0uwd.LIZ();
            }
        }
        C0UW6.LIZIZ.set(false);
        C778290Ufz c778290Ufz = this.LLJZ;
        if (c778290Ufz != null) {
            Map<String, Object> map2 = C1338270kvh.LIZ;
            c778290Ufz.LLILLL.set(0L);
            c778290Ufz.LLILZIL.set(0);
        }
        DataChannelGlobal.LLILZ.HQ2(MobileGameStreamInfo.class, null);
        finish();
        C776870Udh c776870Udh4 = this.LLJJIJI;
        if (c776870Udh4 == null) {
            return;
        }
        c776870Udh4.LJJII(EnumC779790UiP.CMD_TRANSITION_TO_DESTROY);
        c776870Udh4.LJIILIIL = true;
        Iterator it4 = ((ArrayList) c776870Udh4.LJJLIIIJILLIZJL).iterator();
        while (it4.hasNext()) {
            ((InterfaceC776570UdD) it4.next()).LJ();
        }
        C471401sW c471401sW = C471201sU.LIZ;
        if (c471401sW == null) {
            return;
        }
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ).LJJLJLI(new C516201zk(c471401sW, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0154 A[PHI: r6
      0x0154: PHI (r6v19 java.util.Map<java.lang.String, java.lang.String>) = (r6v16 java.util.Map<java.lang.String, java.lang.String>), (r6v15 java.util.Map<java.lang.String, java.lang.String>) binds: [B:64:0x0152, B:61:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean GS(com.bytedance.bpea.basics.Cert r19, boolean r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment.GS(com.bytedance.bpea.basics.Cert, boolean):boolean");
    }

    @Override // X.InterfaceC774920UaY
    public final void I1(int i, int i2) {
        InterfaceC781090UkV interfaceC781090UkV;
        if (SettingsManager.INSTANCE.getBooleanValue("live_anchor_status_diagnostics_enable", true) && (!this.mStatusDestroyed) && (interfaceC781090UkV = this.LLJJIJIL) != null) {
            interfaceC781090UkV.I1(i, i2);
        }
    }

    @Override // X.C0UZ4
    public final void Vf(int i, Cert cert) {
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopLive , stopReason = ");
        sbLIZ.append(i);
        C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i == 32) {
            i2 = 10003;
        } else {
            i2 = -1;
        }
        HS(i, cert, i2);
        getDataChannel().zW(GameBroadcastStateChannel.class, C0TD3.STATE_END);
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final View ZR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean zLJI = MethodIDManager.LJI(202274);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fxi, viewGroup, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return viewTd;
    }

    @Override // X.InterfaceC773750UWv
    public final void jH(boolean z, Boolean bool) throws Exception {
        boolean zLIZIZ;
        String str;
        String str2;
        C776870Udh c776870Udh;
        Boolean boolValueOf;
        Cert cert;
        InterfaceC776650UdL interfaceC776650UdL;
        Object objGg0 = getDataChannel().gg0(PrepareCountDown.class);
        if (z && (interfaceC776650UdL = this.LLJJJ) != null) {
            interfaceC776650UdL.Cg();
        }
        getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ && (c776870Udh = this.LLJJIJI) != null && c776870Udh.LJJJIL != null) {
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LIZIZ(EnumC777480Ueg.PREPARATION);
            } else {
                C776870Udh c776870Udh2 = this.LLJJIJI;
                if (c776870Udh2 != null) {
                    c776870Udh2.LJIIIZ(EnumC778100Ufg.LIVE_TIP_GO_LIVE_ERROR_TIP.ordinal(), null, "", null, false);
                }
            }
            C776870Udh c776870Udh3 = this.LLJJIJI;
            if (c776870Udh3 != null) {
                boolValueOf = Boolean.valueOf(c776870Udh3.LJJJJ);
            } else {
                boolValueOf = null;
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            C776870Udh c776870Udh4 = this.LLJJIJI;
            if (c776870Udh4 != null) {
                cert = c776870Udh4.LJJJIL;
            } else {
                cert = null;
            }
            GS(cert, zLJJJI);
            if (isAdded() && !this.mStatusDestroyed && getChildFragmentManager().LJJJJZI("AbsPreparationFragment") != null) {
                InterfaceC776650UdL interfaceC776650UdL2 = this.LLJJJ;
                if (interfaceC776650UdL2 != null) {
                    C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                    c19ehLJIIJ.LJIIZILJ(interfaceC776650UdL2.getFragment());
                    c19ehLJIIJ.LJIIJ();
                }
                if (GamePreviewReleaseSetting.INSTANCE.isDefault()) {
                    this.LLJJJ = null;
                }
            }
            ES(new GameBroadcastInteractionFragment());
            this.LLJJJIL = System.currentTimeMillis();
            str = "success";
        } else {
            if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
                C777840UfG.LJII(new AbstractC777950UfR() { // from class: X.0Ueo
                    public final EnumC777930UfP LJ = EnumC777930UfP.PRIORITY_TYPE_P3;
                    public final EnumC777480Ueg LJFF = EnumC777480Ueg.PREPARATION;
                    public final CharSequence LJI = C497740JfY.LJIJI(2131842591);

                    {
                        this.LIZ = new AbstractC777790UfB() { // from class: X.0Uf0
                            public final EnumC777770Uf9 LIZ = EnumC777770Uf9.CIRCLE_WARNING_RED;

                            @Override // X.AbstractC777790UfB
                            public final EnumC777770Uf9 LIZ() {
                                return this.LIZ;
                            }
                        };
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777930UfP LIZJ() {
                        return this.LJ;
                    }

                    @Override // X.AbstractC777950UfR
                    public final CharSequence LIZLLL() {
                        return this.LJI;
                    }

                    @Override // X.AbstractC777950UfR
                    public final EnumC777480Ueg LJ() {
                        return this.LJFF;
                    }
                });
            } else {
                C776870Udh c776870Udh5 = this.LLJJIJI;
                if (c776870Udh5 != null) {
                    c776870Udh5.LJIIIZ(EnumC778100Ufg.LIVE_TIP_GO_LIVE_ERROR_TIP.ordinal(), null, C497740JfY.LJIJI(2131842591), null, true);
                }
            }
            InterfaceC776650UdL interfaceC776650UdL3 = this.LLJJJ;
            if (interfaceC776650UdL3 != null) {
                interfaceC776650UdL3.bh();
            }
            str = "fail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_start_stream");
        c474500IjALIZ.LJJII(Long.valueOf(RR()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(getRoomId()), "room_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        if (z) {
            str2 = "click";
        } else {
            str2 = "auto";
        }
        c474500IjALIZ.LJJII(str2, "start_type");
        if (bool == null) {
            C776870Udh c776870Udh6 = this.LLJJIJI;
            if (c776870Udh6 != null) {
                bool = Boolean.valueOf(c776870Udh6.LJIJ());
            } else {
                bool = null;
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_floating");
        c474500IjALIZ.LJJII(objGg0, "time_remain");
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }

    public final void yS(int i, C474500IjA c474500IjA) {
        String str;
        int i2;
        AbstractC1273900jFs liveCore;
        int value = TtliveGameAnchorIntelligentRotationTimeSetting.INSTANCE.getValue();
        boolean zLJI = C0TDF.LJI();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (value > 0) {
            if (zLJI) {
                str = "dual_device_not_rotate";
            } else {
                if (((Boolean) this.LLLIL.getValue()).booleanValue()) {
                    c474500IjA.LJJII("exception_device_not_rotate", "action");
                    c474500IjA.LIZ();
                    return;
                }
                C774940Uaa c774940Uaa = this.LLJJIJIIJIL;
                if (c774940Uaa == null) {
                    c774940Uaa = null;
                }
                InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
                if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
                    liveCore.LJLIIL(i);
                }
                if (i != 0 && i == 90) {
                    i2 = 8;
                } else {
                    i2 = 1;
                }
                c474500IjA.LJJII(Integer.valueOf(i2), "rotate_value");
                c474500IjA.LJJII("rotate_succeeded", "action");
                c474500IjA.LIZ();
                C11JF c11jf = LLLILZJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                LLLILZJ = (C11JF) C19490011Na.LIZLLL(0L, 3L, 0L, 500L, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0UdI
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                    }
                }).LJJLJLI(new AfS80S0101000_12(i2, this, 1));
                return;
            }
        } else {
            str = "experiment_off_not_rotate";
        }
        c474500IjA.LJJII(str, "action");
        c474500IjA.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[LOOP:0: B:17:0x0060->B:19:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HS(int r19, com.bytedance.bpea.basics.Cert r20, int r21) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment.HS(int, com.bytedance.bpea.basics.Cert, int):void");
    }

    @Override // X.C0UZ4
    public final void Nz(String str, PunishEventInfo punishEventInfo, int i) {
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null) {
            c776870Udh.LJJIZ = str;
            c776870Udh.LJJJ = i;
            c776870Udh.LJJJI = punishEventInfo;
        }
    }

    @Override // com.bytedance.android.live.broadcast.BaseBroadcastFragment
    public final void VR(int i, int i2, Intent intent) throws Throwable {
        AbstractC1273900jFs liveCore;
        AbstractC1273900jFs liveCore2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveActivityResult requestCode:");
        sbLIZ.append(i);
        sbLIZ.append(", resultCode ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("GameBroadcastFragment", C2188811AlT.LIZIZ(sbLIZ));
        C776870Udh c776870Udh = this.LLJJIJI;
        if (c776870Udh != null) {
            C0TBQ c0tbq = this.LLJL;
            if (i == 1000) {
                if (i2 == -1) {
                    if (intent != null) {
                        if (c0tbq != null) {
                            c0tbq.LJI(new AwS413S0200000_12(c776870Udh, intent, 62), new AwS413S0200000_12(c776870Udh, intent, 63));
                            C0TBQ.LIZLLL("hasMediaProject");
                            c0tbq.LIZLLL.onNext(Boolean.TRUE);
                        } else {
                            c776870Udh.LJIJJLI(intent, CertProviderManagerKt.findCert("bpea-576", 1476788233));
                        }
                    }
                } else {
                    C773220UUu c773220UUu = C773220UUu.LIZ;
                    AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(221);
                    c773220UUu.getClass();
                    C773220UUu.LJIIL(aFwS245S0000000_12);
                    c776870Udh.LIZIZ.Vf(1, CertProviderManagerKt.findCert("bpea-1871", 1476788483));
                }
            } else if (i == 1001) {
                if (i2 == -1) {
                    if (c0tbq != null) {
                        if (intent != null) {
                            c0tbq.LJI(new AwS413S0200000_12(c776870Udh, intent, 64), new AwS413S0200000_12(c776870Udh, intent, 65));
                            C0TBQ.LIZLLL("hasMediaProject");
                            c0tbq.LIZLLL.onNext(Boolean.TRUE);
                        }
                    } else {
                        GameBroadcastFragment gameBroadcastFragment = c776870Udh.LIZIZ;
                        if (!gameBroadcastFragment.LLIZ) {
                            gameBroadcastFragment.FS();
                        }
                        gameBroadcastFragment.mS();
                        if (intent != null) {
                            c776870Udh.LJJIJ = intent;
                        }
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_allow_screenshare_click");
                    c474500IjALIZ.LJJII(c776870Udh.LJIILIIL(), "anchor_id");
                    c474500IjALIZ.LJJII("screen_share", "live_type");
                    c474500IjALIZ.LJJII(Long.valueOf(c776870Udh.LJIILL()), "room_id");
                    c474500IjALIZ.LJJII("allow", "click_type");
                    c474500IjALIZ.LIZ();
                } else {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_unexcepted_interruption_allow_screenshare_click");
                    c474500IjALIZ2.LJJII(c776870Udh.LJIILIIL(), "anchor_id");
                    c474500IjALIZ2.LJJII("screen_share", "live_type");
                    c474500IjALIZ2.LJJII(Long.valueOf(c776870Udh.LJIILL()), "room_id");
                    c474500IjALIZ2.LJJII("cancel", "click_type");
                    c474500IjALIZ2.LIZ();
                    C773220UUu c773220UUu2 = C773220UUu.LIZ;
                    AFwS245S0000000_12 aFwS245S0000000_122 = AFwS245S0000000_12.get$arr$(222);
                    c773220UUu2.getClass();
                    C773220UUu.LJIIL(aFwS245S0000000_122);
                    c776870Udh.LIZIZ.Vf(1, CertProviderManagerKt.findCert("bpea-interrupt_access_denied", 1476788483));
                }
            }
        }
        C776300Ucm c776300Ucm = this.LLJZIJLIL;
        if (c776300Ucm != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onActivityResult requestCode ");
            sbLIZ2.append(i);
            sbLIZ2.append(", resultCode:");
            sbLIZ2.append(i2);
            sbLIZ2.append('.');
            C20441214yg.LIZIZ("GameLivePauseController", C2188811AlT.LIZIZ(sbLIZ2));
            if (i == 2001) {
                if (i2 == -1) {
                    InterfaceC769940UIe interfaceC769940UIe = c776300Ucm.LLILLL;
                    if (interfaceC769940UIe != null && (liveCore2 = interfaceC769940UIe.getLiveCore()) != null) {
                        liveCore2.LLLLLLLLLL(intent);
                    }
                    InterfaceC769940UIe interfaceC769940UIe2 = c776300Ucm.LLILLL;
                    if (interfaceC769940UIe2 != null) {
                        interfaceC769940UIe2.P3(CertProviderManagerKt.findCert("bpea-781", 1476788233), false);
                    }
                    C0UZ9 c0uz9 = c776300Ucm.LLILZ;
                    if (c0uz9 != null) {
                        c0uz9.LJ(1);
                    }
                    if (c776300Ucm.LLIZ) {
                        c776300Ucm.LLIZ = false;
                    }
                    DataChannel dataChannel = c776300Ucm.LLILLJJLI;
                    if (dataChannel != null) {
                        dataChannel.zW(GameBroadcastStateChannel.class, C0TD3.STATE_CONNECTED);
                        return;
                    }
                    return;
                }
                c776300Ucm.LLIZ = false;
                GameBroadcastFragment gameBroadcastFragment2 = c776300Ucm.LL;
                if (gameBroadcastFragment2 == null) {
                    return;
                }
                gameBroadcastFragment2.Vf(1, CertProviderManagerKt.findCert("bpea-interrupt_access_denied", 1476788483));
                return;
            }
            if (i != 2002) {
                return;
            }
            if (i2 == -1) {
                InterfaceC769940UIe interfaceC769940UIe3 = c776300Ucm.LLILLL;
                if (interfaceC769940UIe3 != null && (liveCore = interfaceC769940UIe3.getLiveCore()) != null) {
                    liveCore.LLLLLLLLLL(intent);
                }
                GameBroadcastFragment gameBroadcastFragment3 = c776300Ucm.LL;
                if (gameBroadcastFragment3 != null) {
                    C774940Uaa c774940Uaa = gameBroadcastFragment3.LLJJIJIIJIL;
                    if (c774940Uaa == null) {
                        c774940Uaa = null;
                    }
                    c774940Uaa.LJFF();
                }
                c776300Ucm.LLIZLLLIL = false;
                DataChannel dataChannel2 = c776300Ucm.LLILLJJLI;
                if (dataChannel2 == null) {
                    return;
                }
                dataChannel2.zW(GameBroadcastStateChannel.class, C0TD3.STATE_CONNECTED);
                return;
            }
            c776300Ucm.LLIZLLLIL = false;
            GameBroadcastFragment gameBroadcastFragment4 = c776300Ucm.LL;
            if (gameBroadcastFragment4 == null) {
                return;
            }
            gameBroadcastFragment4.Vf(1, CertProviderManagerKt.findCert("bpea-interrupt_access_denied", 1476788483));
        }
    }

    @Override // X.InterfaceC774920UaY
    public final void ku(int i, int i2, String str) throws Exception {
        Boolean boolValueOf;
        int i3;
        C0TD0 c0td0;
        Boolean boolValueOf2;
        boolean z;
        C776320Uco c776320Uco;
        long j;
        int i4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamEnd , code1: ");
        sbLIZ.append(i);
        sbLIZ.append(", code2: ");
        sbLIZ.append(i2);
        sbLIZ.append(", errorMsg: ");
        sbLIZ.append(str);
        rS(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJIJIL) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(4, getDataChannel(), i);
        }
        if (!this.LLJIJIL && !this.LLJJJJJIL) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).setGoLiveFullChainLogParams(7, getDataChannel(), i);
        }
        getDataChannel().zW(GameBroadcastStateChannel.class, C0TD3.STATE_END);
        String str2 = "";
        if (C0UWE.LIZJ(i, Integer.valueOf(i2))) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (dataChannelGlobal.gg0(C931370aLP.class) == null) {
                if (str != null) {
                    str2 = str;
                }
                long jRR = RR();
                long roomId = getRoomId();
                Creator creator = PR().creator;
                if (creator != null) {
                    i4 = creator.roomContinue;
                } else {
                    i4 = 0;
                }
                dataChannelGlobal.JQ2(C931370aLP.class, new C776590UdF(i, i2, str2, jRR, roomId, i4));
                rS("onStreamEnd , set InterceptReportEndChannel");
            }
            C1CC2.LIZ("game broadcast live stream end interrupted", new Throwable());
            Boolean bool = (Boolean) getDataChannel().gg0(C755590TkT.class);
            if ((bool == null || !bool.booleanValue()) && (c776320Uco = this.LLJJ) != null) {
                c776320Uco.LIZJ = true;
                if (c776320Uco.LJIIIZ) {
                    c776320Uco.LJIIJ++;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = c776320Uco.LIZ;
                long j3 = 0;
                if (j2 > 0) {
                    j = jCurrentTimeMillis - j2;
                } else {
                    j = 0;
                }
                long j4 = c776320Uco.LIZLLL;
                if (j4 > 0) {
                    j3 = jCurrentTimeMillis - j4;
                    c776320Uco.LIZ(jCurrentTimeMillis);
                    c776320Uco.LIZLLL = -1L;
                }
                c776320Uco.LIZIZ++;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_unexcepted_interruption_error_receive");
                c474500IjALIZ.LJJII(c776320Uco.LIZIZ(), "anchor_id");
                c474500IjALIZ.LJJII("screen_share", "live_type");
                c474500IjALIZ.LJJII(Long.valueOf(c776320Uco.LIZJ()), "room_id");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "liveCore_error_code");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LIZIZ), "error_times");
                c474500IjALIZ.LJJII(Long.valueOf(j), "error_interval");
                c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LIZJ()), "is_backGround_restricted");
                c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LIZLLL()), "is_ignore_battery_opt");
                c474500IjALIZ.LJJII(Boolean.valueOf(C778190Ufp.LJFF()), "is_power_save_mode");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LJII), "last_liveCore_error_code");
                c474500IjALIZ.LJJII(Long.valueOf(j3), "time_in_backGround");
                c474500IjALIZ.LJJII(Boolean.valueOf(MultiDeviceInterruptGuideSetting.INSTANCE.isEnable()), "guide_switch");
                c474500IjALIZ.LJJII(Integer.valueOf(c776320Uco.LJIIJ), "error_times_complete_guide");
                c474500IjALIZ.LIZ();
                c776320Uco.LJII = i2;
            }
            C773220UUu c773220UUu = C773220UUu.LIZ;
            AwS11S0002000_12 awS11S0002000_12 = new AwS11S0002000_12(i, i2, 0);
            c773220UUu.getClass();
            C773220UUu.LJIIL(awS11S0002000_12);
            C776870Udh c776870Udh = this.LLJJIJI;
            if (c776870Udh != null) {
                boolean z2 = !this.mStatusActive;
                if (!C500260Jjc.LJJJI((Boolean) c776870Udh.LIZJ.gg0(C755590TkT.class))) {
                    c776870Udh.LIZJ.SX0(C755590TkT.class, Boolean.TRUE);
                    AbstractC776930Udn abstractC776930Udn = c776870Udh.LJIIZILJ;
                    if (abstractC776930Udn != null) {
                        abstractC776930Udn.LJIIJJI(true);
                    }
                    c776870Udh.LIZIZ.JS();
                    c776870Udh.LIZIZ.NS();
                    c776870Udh.LIZIZ.uS(c776870Udh.LJJIJ, c776870Udh.LJIIJJI, true, c776870Udh.LIZJ);
                    Iterator it2 = ((ArrayList) c776870Udh.LJJLIIIJILLIZJL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC776570UdD) it2.next()).LJFF(z2);
                    }
                    return;
                }
                return;
            }
            return;
        }
        C776870Udh c776870Udh2 = this.LLJJIJI;
        Boolean boolValueOf3 = null;
        if (c776870Udh2 != null) {
            C778170Ufn c778170Ufn = c776870Udh2.LJJL;
            if (c778170Ufn != null) {
                if (!c778170Ufn.LLIZ && (i == 4 || i == 107)) {
                    if (c778170Ufn.LLJILJIL == null || c778170Ufn.LLJILJILJ) {
                        c778170Ufn.LLJILJIL = new C778570UgR(i, i2, str, "live_core_error");
                        c778170Ufn.LLJILJILJ = false;
                    }
                    c778170Ufn.LJIIJJI();
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf2 = Boolean.valueOf(z);
            } else {
                boolValueOf2 = null;
            }
            boolValueOf = Boolean.valueOf(C500260Jjc.LJJJI(boolValueOf2));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return;
        }
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (str != null) {
            str2 = str;
        }
        long jRR2 = RR();
        long roomId2 = getRoomId();
        boolean z3 = this.LLJIJIL;
        Creator creator2 = PR().creator;
        if (creator2 != null) {
            i3 = creator2.roomContinue;
        } else {
            i3 = 0;
        }
        iBroadcastService.reportStreamEndForLiveCore(i, i2, str2, jRR2, roomId2, z3, i3);
        if (GameDualDeviceSetting.INSTANCE.isExperimentGroup() && (c0td0 = (C0TD0) getDataChannel().gg0(C748900TZg.class)) != null) {
            C776870Udh c776870Udh3 = this.LLJJIJI;
            if (c776870Udh3 != null) {
                boolValueOf3 = Boolean.valueOf(c776870Udh3.LJIIJJI);
            }
            c0td0.LIZIZ(i, C500260Jjc.LJJJI(boolValueOf3));
        }
        rS("onStreamEnd , reportStreamEndForLiveCore");
        Boolean bool2 = (Boolean) getDataChannel().gg0(C755590TkT.class);
        if (bool2 != null && bool2.booleanValue()) {
            C773220UUu c773220UUu2 = C773220UUu.LIZ;
            AwS11S0002000_12 awS11S0002000_122 = new AwS11S0002000_12(i, i2, 1);
            c773220UUu2.getClass();
            C773220UUu.LJIIL(awS11S0002000_122);
            return;
        }
        C773220UUu c773220UUu3 = C773220UUu.LIZ;
        AwS11S0002000_12 awS11S0002000_123 = new AwS11S0002000_12(i, i2, 2);
        c773220UUu3.getClass();
        C773220UUu.LJIIL(awS11S0002000_123);
        Vf(1, CertProviderManagerKt.findCert("bpea-414", 1476788483));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:15|(5:17|(2:19|(2:311|23))(2:26|(2:317|30))|33|(1:52)(1:39)|40)|41|(2:43|(2:45|(4:310|53|1c8|59))(2:63|(2:313|67)))|72|(5:107|(1:109)|110|(1:112)|113)(1:75)|76|(1:(1:79)(1:105))(1:106)|80|(2:82|(1:84))|85|(1:87)|88|(4:90|(1:92)(1:104)|93|(1:95)(2:101|(1:103)))|96|(42:98|(1:100)|315|116|119|(1:121)|122|(1:124)|125|(2:129|(1:131))|132|(5:134|(1:142)|143|(6:147|(1:149)(1:304)|150|(1:303)(1:153)|154|(2:156|(1:158))(1:302))|159)|160|(1:162)|163|(4:165|(1:167)(1:300)|168|(1:170)(1:299))(1:301)|171|(1:173)(1:298)|174|(1:176)(2:(1:297)(1:295)|296)|177|(1:291)(2:183|(4:280|(1:282)(1:286)|283|(3:306|287|196)(2:290|196))(3:191|(0)(1:195)|196))|197|(1:199)|200|(1:202)(1:279)|203|(1:205)(1:278)|206|(1:208)(1:277)|209|(1:211)|212|(1:214)|215|(3:219|(1:221)|222)|223|(1:225)|226|(1:228)|229|(2:231|(2:233|(1:235))(1:276)))(1:114)|115|315|116|119|(0)|122|(0)|125|(3:127|129|(0))|132|(0)|160|(0)|163|(0)(0)|171|(0)(0)|174|(0)(0)|177|(22:179|291|197|(0)|200|(0)(0)|203|(0)(0)|206|(0)(0)|209|(0)|212|(0)|215|(4:217|219|(0)|222)|223|(0)|226|(0)|229|(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0353, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0354, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C20441214yg.LJI("GameServiceStrategy", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0824  */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.0Ucy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zS(android.content.Intent r28, boolean r29, com.bytedance.ies.sdk.datachannel.DataChannel r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment.zS(android.content.Intent, boolean, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public final void uS(Intent intent, boolean z, boolean z2, DataChannel dataChannel) throws Exception {
        InterfaceC769940UIe interfaceC769940UIe;
        C774940Uaa c774940Uaa = null;
        if (z2) {
            C0UZ9 c0uz9 = this.LLJJI;
            if (c0uz9 != null) {
                c0uz9.LIZLLL(2);
            }
            C774940Uaa c774940Uaa2 = this.LLJJIJIIJIL;
            if (c774940Uaa2 == null) {
                c774940Uaa2 = null;
            }
            c774940Uaa2.LJIIJ(CertProviderManagerKt.findCert("bpea-interrupt_exception_stop_stream", 1476788483));
            C774940Uaa c774940Uaa3 = this.LLJJIJIIJIL;
            if (c774940Uaa3 == null) {
                c774940Uaa3 = null;
            }
            c774940Uaa3.LJI();
            if (TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable() && (interfaceC769940UIe = c774940Uaa3.LLILZ) != null) {
                interfaceC769940UIe.q3();
                c774940Uaa3.LLJI = null;
            }
            c774940Uaa3.LLILZ = null;
            return;
        }
        zS(intent, z, dataChannel);
        C774940Uaa c774940Uaa4 = this.LLJJIJIIJIL;
        if (c774940Uaa4 != null) {
            c774940Uaa = c774940Uaa4;
        }
        if (C500260Jjc.LJJJI(Boolean.valueOf(c774940Uaa.LJIIIZ(CertProviderManagerKt.findCert("bpea-interrupt_exception_start_stream", 1476788233), z)))) {
            C776320Uco c776320Uco = this.LLJJ;
            if (c776320Uco != null) {
                c776320Uco.LJI("succeeded");
            }
            C0UZ9 c0uz92 = this.LLJJI;
            if (c0uz92 != null) {
                c0uz92.LJ(2);
                return;
            }
            return;
        }
        C776320Uco c776320Uco2 = this.LLJJ;
        if (c776320Uco2 != null) {
            c776320Uco2.LJI("failed");
        }
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(54);
        c773220UUu.getClass();
        C773220UUu.LJIIL(aFwS245S0000000_12);
        BS(1, -1);
    }
}
