package com.ss.android.ugc.aweme.feed.background;

import X.BinderC2179471ARl;
import X.C01GW;
import X.C0NIP;
import X.C0NIQ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11NJ;
import X.C1476910oXJ;
import X.C1618110sD3;
import X.C1ANF;
import X.C1ANK;
import X.C1ARX;
import X.C1AS1;
import X.C2179441ARi;
import X.C2179451ARj;
import X.C2179501ARo;
import X.C2179771ASp;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2409809cO;
import X.C452501pT;
import X.C582130MsN;
import X.C587810N3r;
import X.C591760NIw;
import X.C786410Ut5;
import X.C787370Uud;
import X.C787380Uue;
import X.C788530UwV;
import X.C817700W5w;
import X.C838410Wul;
import X.InterfaceC2179411ARf;
import Y.AfS178S0100000_9;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BackgroundAudioBrowserService extends Service {
    public AudioManager LLILZIL;
    public AudioFocusRequest LLILZLL;
    public C0NIQ LLIZ;
    public C787380Uue LLIZLLLIL;
    public C1AS1 LLJ;
    public C2179501ARo LLJI;
    public final String LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final int LL = 2130971827;
    public C0NIP LLILLJJLI = new C0NIP();
    public C2179441ARi LLILLL = new C2179441ARi();
    public C591760NIw LLILZ = new C591760NIw();
    public final C11NJ LLJIJIL = new C11NJ();

    public final void LIZ() {
        C2179501ARo c2179501ARo = this.LLJI;
        if (c2179501ARo == null) {
            c2179501ARo = null;
        }
        c2179501ARo.LJFF.LJFF(true);
        C1AS1 c1as1 = this.LLJ;
        if (c1as1 == null) {
            c1as1 = null;
        }
        c1as1.LIZJ().LIZ = true;
        C2179501ARo c2179501ARo2 = this.LLJI;
        if (c2179501ARo2 == null) {
            c2179501ARo2 = null;
        }
        c2179501ARo2.LJ();
        C2179501ARo c2179501ARo3 = this.LLJI;
        if (c2179501ARo3 == null) {
            c2179501ARo3 = null;
        }
        c2179501ARo3.LIZLLL();
        C1AS1 c1as12 = this.LLJ;
        if (c1as12 == null) {
            c1as12 = null;
        }
        C2179501ARo c2179501ARo4 = this.LLJI;
        C1ANF c1anfLIZJ = (c2179501ARo4 != null ? c2179501ARo4 : null).LIZIZ.LIZJ();
        c1as12.getClass();
        if (C1ANK.LIZ[c1anfLIZJ.ordinal()] == 1) {
            if (c1as12.LIZJ().LIZIZ) {
                c1as12.LIZIZ().removeMessages(1);
                c1as12.LIZIZ().removeMessages(2);
                c1as12.LIZLLL();
                return;
            }
            return;
        }
        C2179451ARj c2179451ARj = c1as12.LJIIIZ;
        c2179451ARj.LIZ = Boolean.valueOf(c1anfLIZJ.isPlayingState());
        c2179451ARj.LIZIZ = Boolean.valueOf(c1as12.LIZLLL.LJFF());
        c2179451ARj.LIZJ = Boolean.valueOf(c1as12.LIZLLL.LJI());
        c1as12.LJFF(c2179451ARj);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0NIQ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0Uue, android.content.BroadcastReceiver] */
    @Override // android.app.Service
    public final void onCreate() throws Exception {
        int iQ4;
        super.onCreate();
        Context baseContext = getBaseContext();
        C0NIP c0nip = this.LLILLJJLI;
        C2179441ARi c2179441ARi = this.LLILLL;
        C2179501ARo c2179501ARo = new C2179501ARo(baseContext, c0nip, c2179441ARi, this.LLILZ, (ComponentName) this.LLJILJILJ.getValue());
        this.LLJ = new C1AS1(this, c2179501ARo.LJFF.LIZ.LIZIZ, this.LLILLJJLI, this.LLILZ, c2179441ARi, (ComponentName) this.LLJILJILJ.getValue(), new C1ARX(), this.LL);
        this.LLJI = c2179501ARo;
        LocalBroadcastManager.LIZ(this).LIZIZ((BroadcastReceiver) this.LLJILLL.getValue(), new IntentFilter("player.plugin.mediasession.common.intent.filter.AWE_MEDIA_SESSION_BROADCAST"));
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        this.LLILZIL = (AudioManager) C786410Ut5.H2(applicationContext, "audio");
        C2179771ASp.LJIIL(this);
        final AudioManager audioManager = this.LLILZIL;
        if (audioManager == null) {
            audioManager = null;
        }
        final AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(91);
        ?? r5 = new C787370Uud(audioManager, aFwS240S0000000_9) { // from class: X.0Uue
            public final Function1<Integer, Unit> LIZIZ;
            public final WeakReference<AudioManager> LIZJ;

            public final void LIZIZ(Intent intent) {
                WeakReference<AudioManager> weakReference;
                WeakReference<AudioManager> weakReference2;
                AudioManager audioManager2;
                try {
                    if (Intrinsics.LJFF(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (weakReference = this.LIZJ) != null && weakReference.get() != null && (weakReference2 = this.LIZJ) != null && (audioManager2 = weakReference2.get()) != null) {
                        this.LIZIZ.invoke(Integer.valueOf(audioManager2.getStreamVolume(3)));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            {
                super(audioManager);
                this.LIZIZ = aFwS240S0000000_9;
                this.LIZJ = new WeakReference<>(audioManager);
            }

            @Override // X.C787370Uud, android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZIZ(intent);
                }
            }
        };
        this.LLIZLLLIL = r5;
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler() || ReceiverRegisterCrashOptimizer.isAsync(intentFilter)) {
                ReceiverRegisterLancet.initHandler();
                C838410Wul.LJI(this, r5, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler, 2);
            } else if (ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler() == null || !ReceiverRegisterCrashOptimizer.getReceiverRegisterHandler().needHookFilter(intentFilter)) {
                C838410Wul.LJFF(this, r5, intentFilter, 2);
            } else {
                ReceiverRegisterLancet.initProxyHandler();
                C838410Wul.LJI(this, r5, intentFilter, null, ReceiverRegisterLancet.sProxyHandler, 2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!ReceiverRegisterCrashOptimizer.fixedOpen()) {
                throw e;
            }
            ReceiverRegisterCrashOptimizer.registerReceiver(r5, intentFilter);
        }
        if (C2179771ASp.LJII(this) == 0) {
            C587810N3r.LIZ.getClass();
            C587810N3r.LIZLLL = Long.valueOf(System.currentTimeMillis());
        }
        this.LLIZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0NIQ
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                if (i != -3 && i != -2) {
                    if (i != -1) {
                        if (i == 2 || i == 3) {
                            this.LL.LLILLJJLI.LJIIJ(null);
                        }
                    } else {
                        this.LL.LLILLJJLI.LJIIIIZZ(new C0NIR("PAUSE_FROM_LOSS_FOCUS"));
                    }
                } else if (C2214201BlK.LJIIJJI) {
                    this.LL.LLILLJJLI.LJIIIIZZ(new C0NIR("PAUSE_FROM_LOSS_FOCUS_TRANSIENT"));
                }
                if (this.LL.LLILLJJLI.LJ()) {
                    this.LL.LIZ();
                }
            }
        };
        C582130MsN.LIZ().LJ();
        C1476910oXJ.LJ(false, this.LLJILJIL);
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
            C0NIQ c0niq = this.LLIZ;
            if (c0niq == null) {
                c0niq = null;
            }
            builder.setOnAudioFocusChangeListener(c0niq);
            builder.setWillPauseWhenDucked(true);
            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
            builder2.setContentType(2);
            builder.setAudioAttributes(builder2.build());
            AudioFocusRequest audioFocusRequestBuild = builder.build();
            this.LLILZLL = audioFocusRequestBuild;
            AudioManager audioManager2 = this.LLILZIL;
            if (audioManager2 == null) {
                audioManager2 = null;
            }
            iQ4 = C786410Ut5.p4(audioManager2, audioFocusRequestBuild != null ? audioFocusRequestBuild : null);
        } else {
            AudioManager audioManager3 = this.LLILZIL;
            if (audioManager3 == null) {
                audioManager3 = null;
            }
            C0NIQ c0niq2 = this.LLIZ;
            iQ4 = C786410Ut5.q4(audioManager3, c0niq2 != null ? c0niq2 : null, 2, 1);
        }
        if (iQ4 != 1) {
            stopSelf();
        }
        this.LLJIJIL.LIZ(C2214201BlK.LIZLLL().LJJLJLI(new AfS178S0100000_9(this, 69)));
    }

    public BackgroundAudioBrowserService() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackgroundAudioBrowserService");
        sbLIZ.append(hashCode());
        this.LLJILJIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2177));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2178));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI = new C0NIP();
        this.LLILLL = new C2179441ARi();
        this.LLILZ = new C591760NIw();
        C2179501ARo c2179501ARo = this.LLJI;
        if (c2179501ARo == null) {
            c2179501ARo = null;
        }
        c2179501ARo.LJFF.LJFF(false);
        C1AS1 c1as1 = this.LLJ;
        if (c1as1 == null) {
            c1as1 = null;
        }
        c1as1.LIZJ().LIZ = false;
        this.LLJIJIL.LJ();
        C787380Uue c787380Uue = this.LLIZLLLIL;
        if (c787380Uue == null) {
            c787380Uue = null;
        }
        ReceiverRegisterLancet.loge(c787380Uue, false);
        unregisterReceiver(c787380Uue);
        LocalBroadcastManager.LIZ(this).LIZLLL((BroadcastReceiver) this.LLJILLL.getValue());
        C1AS1 c1as12 = this.LLJ;
        if (c1as12 == null) {
            c1as12 = null;
        }
        c1as12.LJ();
        C2179501ARo c2179501ARo2 = this.LLJI;
        if (c2179501ARo2 == null) {
            c2179501ARo2 = null;
        }
        c2179501ARo2.LIZIZ();
        C1618110sD3.LIZ = false;
        Iterator it2 = ((ArrayList) C1618110sD3.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2179411ARf) it2.next()).LIZIZ();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = this.LLILZIL;
            if (audioManager == null) {
                audioManager = null;
            }
            AudioFocusRequest audioFocusRequest = this.LLILZLL;
            audioManager.abandonAudioFocusRequest(audioFocusRequest != null ? audioFocusRequest : null);
        } else {
            AudioManager audioManager2 = this.LLILZIL;
            if (audioManager2 == null) {
                audioManager2 = null;
            }
            C0NIQ c0niq = this.LLIZ;
            audioManager2.abandonAudioFocus(c0niq != null ? c0niq : null);
        }
        C582130MsN.LIZ().LJ();
        C1476910oXJ.LJ(true, this.LLJILJIL);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/feed/background/BackgroundAudioBrowserService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytZpuA3jN/K6A6F2JESnNLb/JY+ZznNlu1tocdq2lb0UA3wVZsVth3EOej7w==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return new BinderC2179471ARl(new WeakReference(this));
    }
}
