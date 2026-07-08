package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.C01GW;
import X.C0IJT;
import X.C0IK5;
import X.C0UF5;
import X.C0UF6;
import X.C1086020eMq;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1322020kVU;
import X.C1324720kZq;
import X.C14EU;
import X.C1551940qUK;
import X.C1553010qW3;
import X.C1554340qYC;
import X.C168R;
import X.C168V;
import X.C168Y;
import X.C1697810uHb;
import X.C1844940y6u;
import X.C19EH;
import X.C1AKR;
import X.C1AKS;
import X.C1AKU;
import X.C1ALS;
import X.C20050213ci;
import X.C21305318Zf;
import X.C2296808zG;
import X.C299020Bno;
import X.C300920Bqs;
import X.C335910DEv;
import X.C474500IjA;
import X.C474650IjP;
import X.C474750IjZ;
import X.C476240Ily;
import X.C479860Iro;
import X.C484240Iys;
import X.C497740JfY;
import X.C774890UaV;
import X.C786410Ut5;
import X.C794260VDs;
import X.C799570VYd;
import X.C930930aKh;
import X.C930940aKi;
import X.ComponentCallbacks2C20050113ch;
import X.EnumC335920DEw;
import X.EnumC479890Irr;
import X.InterfaceC21500319Cf;
import X.InterfaceC362610EJn;
import X.InterfaceC479850Irn;
import X.InterfaceC484050IyZ;
import X.InterfaceC524950KiL;
import X.InterfaceC772600USk;
import X.InterfaceC773120UUk;
import X.InterfaceC773130UUl;
import X.InterfaceC782610Umx;
import X.InterfaceC876920Yag;
import Y.ACListenerS135S0200000_33;
import Y.AObjectS80S0000000_33;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS99S0000000_24;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.livesetting.broadcast.GeckoDownloadZipObserverABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeLaunchBroadcastOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.PlaybookOnNewIntentBugfixEnabledSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLogBlockOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostApplogOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostDowngradeLegoTaskSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveLowMemoryMonitorSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableBroadcastSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.ss.android.ugc.aweme.live.strategy.LegoTaskDowngradeStrategy;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.effect.IEffectDeletableCheckerService;
import com.zhiliaoapp.musically.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21500319Cf(featureKey = "tiktok_live_broadcast")
public class LiveBroadcastActivity extends AbstractActivityC484150Iyj implements InterfaceC524950KiL, InterfaceC876920Yag, InterfaceC773120UUk {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSklPyp9BCw6LA0hJyQoKi4gPAQvPSYlITE1";
    public C1AKS LL;
    public C1AKR LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public C774890UaV LLIZ;
    public C21305318Zf LLIZLLLIL;
    public C1086020eMq LLJ;
    public final List<InterfaceC484050IyZ> LLILZIL = new ArrayList();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.myLooper());
    public ComponentCallbacks2C20050113ch LLJI = null;
    public SurfaceView LLJIJIL = null;
    public View LLJILJIL = null;
    public boolean LLJILJILJ = false;
    public boolean LLJILLL = false;
    public boolean LLJJ = false;
    public boolean LLJJI = false;
    public boolean LLJJIII = false;
    public C1AKU LLJJIJI = new InterfaceC773130UUl() { // from class: X.1AKU
        @Override // X.InterfaceC773130UUl
        public final void LIZJ() {
            Bundle bundle = new Bundle();
            if (this.LIZ.getIntent() != null) {
                this.LIZ.getIntent().putExtra("is_try_mode", false);
                this.LIZ.getIntent().putExtra("is_from_try_mode", true);
                try {
                    bundle = this.LIZ.getIntent().getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    bundle = null;
                }
            }
            this.LIZ.LLLLZI(bundle);
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZ(Bundle bundle) {
            this.LIZ.LLILLJJLI = Live.getService().createLiveBroadcastEndFragment(bundle);
            C19EH c19ehLJIIJ = this.LIZ.getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, this.LIZ.LLILLJJLI.getFragment(), null);
            c19ehLJIIJ.LJIIL();
            LiveBroadcastActivity liveBroadcastActivity = this.LIZ;
            liveBroadcastActivity.LL = null;
            liveBroadcastActivity.LLILLL = false;
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZLLL(boolean z) {
            C772290URf c772290URfLJI = C0UF5.LJI();
            if (z) {
                if (LiveTryModeLaunchBroadcastOptSetting.INSTANCE.enable() || (c772290URfLJI != null && c772290URfLJI.LIZ)) {
                    this.LIZ.release();
                }
            }
        }

        @Override // X.InterfaceC773130UUl
        public final void LJ(C779220UhU c779220UhU) {
            LiveBroadcastActivity liveBroadcastActivity = this.LIZ;
            ReceiverRegisterLancet.loge(c779220UhU, false);
            liveBroadcastActivity.unregisterReceiver(c779220UhU);
        }

        /* JADX WARN: Not initialized variable reg: 2, insn: 0x004e: INVOKE (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:33554510), block:B:22:0x004e */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x004e: INVOKE (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:33554510), block:B:22:0x004e */
        @Override // X.InterfaceC773130UUl
        public final void LIZIZ(C779220UhU c779220UhU, IntentFilter intentFilter) throws Exception {
            BroadcastReceiver broadcastReceiverRegisterReceiver;
            IntentFilter intentFilterRegisterReceiver;
            LiveBroadcastActivity liveBroadcastActivity = this.LIZ;
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                if (!ReceiverRegisterCrashOptimizer.doRegisterHandler() && !ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                    if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() != null && ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                        ReceiverRegisterLancet.initProxyHandler();
                        C838410Wul.LJI(liveBroadcastActivity, c779220UhU, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
                        return;
                    } else {
                        C838410Wul.LJFF(liveBroadcastActivity, c779220UhU, intentFilter, 2);
                        return;
                    }
                }
                ReceiverRegisterLancet.initHandler();
                C838410Wul.LJI(liveBroadcastActivity, c779220UhU, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiverRegisterReceiver, intentFilterRegisterReceiver);
                    return;
                }
                throw e;
            }
        }
    };
    public final ARunnableS99S0000000_24 LLJJIJIIJIL = new ARunnableS99S0000000_24(1);

    @Override // X.InterfaceC524950KiL
    public final void AH(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.InterfaceC524950KiL
    public final void b8(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // X.AbstractActivityC484150Iyj
    public final int getPageType() {
        return 1;
    }

    @Override // X.InterfaceC524950KiL
    public final void kF(InterfaceC362610EJn interfaceC362610EJn) {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC773120UUk
    public final ViewGroup JM() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LL;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final C1324720kZq Kl() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LLILLJJLI;
        }
        return null;
    }

    public final void LLLLZIL() {
        ViewStub viewStub;
        this.LLIZ = new C774890UaV();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cgg);
        if (frameLayout != null) {
            if (this.LLJIJIL == null) {
                if (this.LLJILJIL == null && (viewStub = (ViewStub) frameLayout.findViewById(R.id.wqb)) != null) {
                    this.LLJILJIL = C786410Ut5.LJLLLL(viewStub);
                }
                SurfaceView surfaceView = (SurfaceView) this.LLJILJIL.findViewById(R.id.j3a);
                this.LLJIJIL = surfaceView;
                if (surfaceView != null) {
                    C786410Ut5.LLIIII(surfaceView, 8);
                }
            }
            this.LLIZ.LIZ(frameLayout, this.LLJIJIL, false);
        }
    }

    @Override // X.InterfaceC773120UUk
    public final View ai() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            c774890UaV.getClass();
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final SurfaceView fI() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LLILLL;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final C1324720kZq fm() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LLIZ;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final ImageView kE() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LLILZLL;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final View mj() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LLILZIL;
        }
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final View on() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            return c774890UaV.LLILZ;
        }
        return null;
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C1AKS c1aks = this.LL;
        if (c1aks == null || !c1aks.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", true);
        super.onResume();
        if (this.LLJILLL) {
            LLLLZLL("livesdk_backtolive_live_take", true);
            this.LLJILLL = false;
            this.LLJJ = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", false);
    }

    public final void release() {
        if (this.LLJILJILJ) {
            return;
        }
        C21305318Zf c21305318Zf = this.LLIZLLLIL;
        if (c21305318Zf != null) {
            C799570VYd.LIZIZ().removeCallbacks(c21305318Zf.LJIIIIZZ);
            C2296808zG.LIZJ(c21305318Zf.LJII, null);
            if (c21305318Zf.LJFF.get()) {
                c21305318Zf.LJFF.set(false);
                BlockHelper.endBlock();
                BlockHelper.setBlockInterval(c21305318Zf.LJI);
            }
            this.LLIZLLLIL = null;
        }
        if (this.LLJ != null) {
            C1086020eMq.LIZ();
            this.LLJ = null;
        }
        this.LLJILJILJ = true;
        this.LLJJIJI = null;
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        ((Function1) dataChannelGlobal.gg0(C168Y.class)).invoke(0);
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(0);
            }
        }
        DataChannelGlobal.LLILZ.IQ2(C168V.class);
        this.LLILZLL.removeCallbacksAndMessages(null);
        LivePitayaEnv.LJIIJ(this);
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZIZ(this, EnumC479890Irr.BROADCAST);
        C474750IjZ.LIZ();
        C1322020kVU.LIZ = false;
        C20050213ci.LIZIZ(this, this.LLJI);
        this.LLJI = null;
        C1553010qW3.LIZ.getClass();
        C1553010qW3.LIZ();
    }

    @Override // X.InterfaceC773120UUk
    public final void tb() {
        C774890UaV c774890UaV = this.LLIZ;
        if (c774890UaV != null) {
            c774890UaV.tb();
        }
    }

    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return Collections.singletonList(11);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0UF5.LJIIIIZZ(System.currentTimeMillis());
        kE();
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        release();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final void LLLLZI(Bundle bundle) {
        this.LL = Live.getService().createLiveBroadcastFragment(this, this.LLJJIJI, bundle);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, this.LL.getFragment(), null);
        c19ehLJIIJ.LJIIIZ();
        Live.getService().setBroadcastActivity(this);
        int i = 0;
        Live.getService().preloadLiveStream(this, this.LLILLL, bundle.getBoolean("is_try_mode", false));
        LivePitayaEnv.LJIIIIZZ(this);
        C01GW c01gw = C300920Bqs.LIZ;
        if (((Number) c01gw.getValue()).intValue() >= 0) {
            BPEAHandler bPEAHandler = this.LLILZLL;
            ARunnableS99S0000000_24 aRunnableS99S0000000_24 = this.LLJJIJIIJIL;
            int iIntValue = ((Number) c01gw.getValue()).intValue();
            if (iIntValue >= 0 && (i = iIntValue) > 60) {
                i = 60;
            }
            C786410Ut5.LJLIIL(i * LSPassThroughRecordSizeConfig.DEFAULT, bPEAHandler, aRunnableS99S0000000_24);
        }
    }

    @Override // X.InterfaceC524950KiL
    public final void Qh(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLILZIL).add(interfaceC484050IyZ);
    }

    @Override // X.InterfaceC524950KiL
    public final void T4(InterfaceC484050IyZ interfaceC484050IyZ) {
        ((ArrayList) this.LLILZIL).remove(interfaceC484050IyZ);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        Object obj;
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        if (LiveBroadcastLogBlockOpt.enable()) {
            C21305318Zf c21305318Zf = new C21305318Zf();
            this.LLIZLLLIL = c21305318Zf;
            c21305318Zf.LIZ();
        }
        if (LiveHostApplogOpt.isEnabled()) {
            C1086020eMq c1086020eMq = new C1086020eMq();
            this.LLJ = c1086020eMq;
            c1086020eMq.LIZIZ();
        }
        if (LiveHostDowngradeLegoTaskSettings.getDowngradeOnlyVideoType()) {
            new LegoTaskDowngradeStrategy("LiveHost", this).LIZ();
        }
        activityConfiguration(new Function1() { // from class: X.1AKY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str = LiveBroadcastActivity._pnsPageId;
                ((C06W2) obj2).Dw2(new AObjectS80S0000000_33(5));
                return null;
            }
        });
        if (bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        ((IEffectDeletableCheckerService) ServiceManager.get().getService(IEffectDeletableCheckerService.class)).needAbortCleanup();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        ((Function1) dataChannelGlobal.gg0(C168Y.class)).invoke(1);
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(1);
            }
        }
        super.onCreate(bundle);
        setContentView(R.layout.dbj);
        if (Live.getService().getRequestControl() != null && C1ALS.LJ) {
            C1ALS.LIZIZ = false;
            C1ALS.LIZIZ("broadcast_create_room_strict", C1ALS.LIZJ, AFwS224S0000000_33.get$arr$(577));
        }
        Bundle bundle3 = new Bundle();
        if (getIntent() != null) {
            try {
                bundle3 = getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bundle3 = null;
            }
            this.LLILLL = getIntent().getBooleanExtra("is_one_tap_go_live", false);
            this.LLILZ = getIntent().getBooleanExtra("is_try_mode", false);
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal2.gg0(C930940aKi.class);
        if (this.LLILLL) {
            objGg0 = dataChannelGlobal2.gg0(C930930aKh.class);
        }
        if (objGg0 == null) {
            Live.getService().stopVideoBroadcastService();
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(this, "sslocal://openRecord?enter_from=direct_shoot&tab=live", new Bundle());
            C794260VDs c794260VDs = C476240Ily.LIZ;
            String str = "1";
            if (this.LLILLL) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            if (!this.LLILZ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("action", "broadcast_empty_room"), new AbstractMap.SimpleEntry("is_one_tap_go_live", obj), new AbstractMap.SimpleEntry("is_try_mode", str)};
            HashMap map = new HashMap(3);
            int i = 0;
            do {
                Map.Entry entry = entryArr[i];
                Object key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                if (map.put(key, value) == null) {
                    i++;
                } else {
                    throw new IllegalArgumentException("duplicate key: " + key);
                }
            } while (i < 3);
            c794260VDs.LIZ(-1, "ttlive_broadcast_action_all", Collections.unmodifiableMap(map));
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
            return;
        }
        C0UF6 c0uf6LIZJ = C0UF5.LIZJ();
        if (this.LLILZ && c0uf6LIZJ != null) {
            if (C474650IjP.LIZ() && !InterfaceC772600USk.Af.LIZIZ().booleanValue() && TryModeGuidanceSetting.INSTANCE.hasEnhanceBubble()) {
                z = false;
            } else {
                z = true;
            }
            c0uf6LIZJ.LIZ = z;
        }
        LLLLZIL();
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZ(this, EnumC479890Irr.BROADCAST);
        if (getWindow() != null) {
            if (c0uf6LIZJ != null && c0uf6LIZJ.LIZ) {
                getWindow().setBackgroundDrawableResource(R.drawable.ap6);
            } else {
                getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        }
        vQ();
        C786410Ut5.LJLIIL(LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value(), C0IK5.LIZ(), new ARunnableS133S0100000_33(this, 63));
        if (TestEnableBroadcastSetting.INSTANCE.enable()) {
            LLLLZI(bundle3);
        } else {
            findViewById(R.id.trr).setBackgroundColor(C497740JfY.LJFF(R.color.fw));
            C786410Ut5.I7(new ACListenerS135S0200000_33(this, bundle3, 4), findViewById(R.id.trr));
        }
        C1322020kVU.LIZ = true;
        if (LiveLowMemoryMonitorSettings.enable() && this.LLJI == null) {
            this.LLJI = new ComponentCallbacks2C20050113ch();
        }
        C20050213ci.LIZ(this, this.LLJI);
        C1553010qW3.LIZ.getClass();
        if (GeckoDownloadZipObserverABSetting.INSTANCE.isMatch()) {
            C1554340qYC c1554340qYC = new C1554340qYC(1);
            C1553010qW3.LIZIZ = c1554340qYC;
            C1551940qUK.LJIIL(c1554340qYC);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }

    @C14EU
    public void onEvent(C484240Iys c484240Iys) {
        if (Live.getService() != null) {
            Live.getService().LJJIL();
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        Bundle extras;
        Parcelable parcelableExtra;
        super.onNewIntent(intent);
        if (intent != null) {
            C1844940y6u.LIZ(this, intent);
            this.LLILLL = intent.getBooleanExtra("is_one_tap_go_live", false);
            try {
                stringExtra = intent.getStringExtra("request_page");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            if (this.LLILLL || "live_end_page".equals(stringExtra) || "live_recap".equals(stringExtra) || "try_mode".equals(stringExtra)) {
                Live.getService().LLJILJILJ(stringExtra);
                vQ();
                try {
                    extras = intent.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    extras = null;
                }
                C786410Ut5.LJLIIL(LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value(), C0IK5.LIZ(), new ARunnableS133S0100000_33(this, 64));
                LLLLZIL();
                this.LL = Live.getService().createLiveBroadcastFragment(this, this.LLJJIJI, extras);
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, this.LL.getFragment(), null);
                c19ehLJIIJ.LJIIIZ();
                Live.getService().setBroadcastActivity(this);
                Live.getService().preloadLiveStream(this, this.LLILLL, false);
            }
            if ("broadcast_click_notification".equals(intent.getAction())) {
                this.LLJJ = intent.getBooleanExtra("is_live_pause", false);
                this.LLJJI = intent.getBooleanExtra("broadcast_pre_start", false);
                this.LLJJIII = intent.getBooleanExtra("is_from_recall", false);
                LLLLZLL("livesdk_backtolive_reminder_click", false);
                this.LLJILLL = true;
                Live.getService().stopVideoBroadcastService();
            }
            if (PlaybookOnNewIntentBugfixEnabledSettings.INSTANCE.isEnable() && (parcelableExtra = intent.getParcelableExtra("preview_page_active_playbook")) != null) {
                getIntent().putExtra("preview_page_active_playbook", parcelableExtra);
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLLZLL(String str, boolean z) {
        String str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (this.LLILLL) {
            room = (Room) dataChannelGlobal.gg0(C930930aKh.class);
        }
        if (room == null) {
            return;
        }
        String str3 = "swtich_backstage";
        if (!this.LLJJ) {
            str2 = "swtich_backstage";
        } else {
            str2 = "manual_pause";
        }
        if (this.LLJJIII) {
            str3 = "before_end";
        } else if (this.LLJJI) {
            str3 = "start_live";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
        c474500IjALIZ.LJJII(str2, "switch_type");
        c474500IjALIZ.LJJII(str3, "reminder_show_time");
        c474500IjALIZ.LJJII(room.getStreamType().logStreamingType, "live_type");
        if (z) {
            c474500IjALIZ.LJJII("backtolive_reminder", "enter_from");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
        while (it2.hasNext()) {
            if (((InterfaceC484050IyZ) it2.next()).onActivityResult(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
