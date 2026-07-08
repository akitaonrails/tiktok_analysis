package com.ss.android.ugc.aweme.live;

import X.AbstractActivityC484150Iyj;
import X.C1308910kAL;
import X.C168R;
import X.C168V;
import X.C168Y;
import X.C1697810uHb;
import X.C1844940y6u;
import X.C19EH;
import X.C1AKO;
import X.C1AKV;
import X.C299020Bno;
import X.C335910DEv;
import X.C479860Iro;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.EnumC479890Irr;
import X.InterfaceC479850Irn;
import X.InterfaceC773130UUl;
import X.InterfaceC782610Umx;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.VoiceBroadcastActivity;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class VoiceBroadcastActivity extends AbstractActivityC484150Iyj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklHELIOSPyp9HiolKioROiotLSwyOzENKjs6Piw4MA==";
    public C1AKO LL;
    public C1AKV LLILLJJLI = new InterfaceC773130UUl() { // from class: X.1AKV
        @Override // X.InterfaceC773130UUl
        public final void LIZJ() {
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZLLL(boolean z) {
        }

        @Override // X.InterfaceC773130UUl
        public final void LIZ(Bundle bundle) {
            C19EH c19ehLJIIJ = this.LIZ.getSupportFragmentManager().LJIIJ();
            VoiceBroadcastActivity voiceBroadcastActivity = this.LIZ;
            c19ehLJIIJ.LJIJ(R.id.iiv, Live.getService().createLiveBroadcastEndFragment(bundle).getFragment(), null);
            c19ehLJIIJ.LJIIL();
            voiceBroadcastActivity.LL = null;
        }

        @Override // X.InterfaceC773130UUl
        public final void LJ(C779220UhU c779220UhU) {
            VoiceBroadcastActivity voiceBroadcastActivity = this.LIZ;
            ReceiverRegisterLancet.loge(c779220UhU, false);
            voiceBroadcastActivity.unregisterReceiver(c779220UhU);
        }

        /* JADX WARN: Not initialized variable reg: 2, insn: 0x004e: INVOKE (r2 I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:33554510), block:B:22:0x004e */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x004e: INVOKE (r2v0 ?? I:android.content.BroadcastReceiver), (r3 I:android.content.IntentFilter) STATIC call: com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.registerReceiver(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent A[MD:(android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent (m)] (LINE:33554510), block:B:22:0x004e */
        @Override // X.InterfaceC773130UUl
        public final void LIZIZ(C779220UhU c779220UhU, IntentFilter intentFilter) throws Exception {
            BroadcastReceiver broadcastReceiverRegisterReceiver;
            IntentFilter intentFilterRegisterReceiver;
            VoiceBroadcastActivity voiceBroadcastActivity = this.LIZ;
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.doHWReceiverFix();
            }
            try {
                if (!ReceiverRegisterCrashOptimizer.doRegisterHandler() && !ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                    if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() != null && ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                        ReceiverRegisterLancet.initProxyHandler();
                        C838410Wul.LJI(voiceBroadcastActivity, c779220UhU, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
                        return;
                    } else {
                        C838410Wul.LJFF(voiceBroadcastActivity, c779220UhU, intentFilter, 2);
                        return;
                    }
                }
                ReceiverRegisterLancet.initHandler();
                C838410Wul.LJI(voiceBroadcastActivity, c779220UhU, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
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

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        this.LLILLJJLI = null;
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Function1 function1 = (Function1) dataChannelGlobal.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(0);
        }
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(0);
            }
        }
        DataChannelGlobal.LLILZ.IQ2(C168V.class);
        LivePitayaEnv.LJIIJ(this);
        super.onDestroy();
        Live.getService().releaseVoiceChatLiveStream();
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZIZ(this, EnumC479890Irr.BROADCAST);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C1AKO c1ako = this.LL;
        if (c1ako == null || !c1ako.onBackPressed()) {
            super.onBackPressed();
        }
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
        this.LL = Live.getService().createVoiceChatBroadcastFragment(this.LLILLJJLI, bundle);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        C1AKO c1ako = this.LL;
        if (c1ako != null) {
            c19ehLJIIJ.LJIJ(R.id.iiv, c1ako.getFragment(), null);
            c19ehLJIIJ.LJIIIZ();
        }
        Live.getService().setBroadcastActivity(this);
        Live.getService().preloadVoiceChatLiveStream(this);
        LivePitayaEnv.LJIIIIZZ(this);
    }

    @Override // X.AbstractActivityC484150Iyj, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onCreate", true);
        Bundle extras = null;
        if (bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        Function1 function1 = (Function1) DataChannelGlobal.LLILZ.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.dbl);
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZ(this, EnumC479890Irr.BROADCAST);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        vQ();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LLLLZI(extras);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.VoiceBroadcastActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String stringExtra;
        super.onNewIntent(intent);
        C1844940y6u.LIZ(this, intent);
        Bundle extras = null;
        try {
            stringExtra = intent.getStringExtra("request_page");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "live_end_page")) {
            Live.getService().LLJILJILJ(stringExtra);
            try {
                extras = intent.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            LLLLZI(extras);
        }
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
}
