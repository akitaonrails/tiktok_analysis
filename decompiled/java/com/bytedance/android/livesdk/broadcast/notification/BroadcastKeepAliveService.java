package com.bytedance.android.livesdk.broadcast.notification;

import X.C0K04;
import X.C0UVE;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1143680frq;
import X.C1161920gLG;
import X.C19397410ui;
import X.C1ASU;
import X.C1ASV;
import X.C1CC2;
import X.C20441214yg;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C815520Vyw;
import X.C817700W5w;
import X.C838410Wul;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import com.bytedance.android.livesdk.broadcast.notification.BroadcastKeepAliveService;
import com.bytedance.android.livesdk.livesetting.other.LiveBroadcastBgServiceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveBroadcastKeepAliveNoPermSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class BroadcastKeepAliveService extends Service {
    public SoundPool LL;
    public boolean LLILLJJLI;
    public InterfaceC420801kM LLILLL;
    public PowerManager.WakeLock LLILZ;
    public C19397410ui LLILZIL;
    public final C1ASV LLILZLL = new Binder() { // from class: X.1ASV
    };
    public final C1ASU LLIZ = new InterfaceC19562711gH() { // from class: X.1ASU
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            this.LL.LIZIZ();
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            this.LL.LIZ();
        }
    };

    public final void LIZIZ() {
        try {
            C19397410ui c19397410ui = this.LLILZIL;
            if (c19397410ui != null) {
                c19397410ui.LIZ();
            }
            this.LLILZIL = null;
            SoundPool soundPool = this.LL;
            if (soundPool != null) {
                soundPool.release();
            }
            this.LL = null;
            this.LLILLJJLI = false;
            PowerManager.WakeLock wakeLock = this.LLILZ;
            if (wakeLock != null) {
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
                this.LLILZ = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ() {
        if (this.LL == null) {
            this.LL = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        }
        final SoundPool soundPool = this.LL;
        if (soundPool == null || this.LLILLJJLI) {
            return;
        }
        final int iLIZJ = C1143680frq.LIZJ(soundPool, "tiktok_live_broadcast_demand_2", "white_noise.mp3");
        this.LLILLJJLI = true;
        if (iLIZJ == 0) {
            return;
        }
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: X.10uh
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                Integer numValueOf;
                boolean z = false;
                if (i2 == 0) {
                    int iPlay = soundPool2.play(iLIZJ, 1.0f, 1.0f, 1, -1, 1.0f);
                    if (iPlay != 0) {
                        BroadcastKeepAliveService broadcastKeepAliveService = this;
                        C19397410ui c19397410ui = new C19397410ui(broadcastKeepAliveService, soundPool, iPlay);
                        AudioManager audioManager = (AudioManager) C786410Ut5.H2(broadcastKeepAliveService, "audio");
                        c19397410ui.LIZJ = audioManager;
                        if (Build.VERSION.SDK_INT >= 26) {
                            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(c19397410ui.LJ).build();
                            AudioManager audioManager2 = c19397410ui.LIZJ;
                            if (audioManager2 != null && (numValueOf = Integer.valueOf(C786410Ut5.p4(audioManager2, audioFocusRequestBuild))) != null && numValueOf.intValue() == 1) {
                                z = true;
                            }
                            c19397410ui.LIZLLL = z;
                        } else {
                            Integer numValueOf2 = Integer.valueOf(C786410Ut5.q4(audioManager, c19397410ui.LJ, 3, 1));
                            if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                                z = true;
                            }
                            c19397410ui.LIZLLL = z;
                        }
                        broadcastKeepAliveService.LLILZIL = c19397410ui;
                        return;
                    }
                    return;
                }
                this.LLILLJJLI = false;
            }
        });
    }

    public final void LIZ() {
        try {
            LIZJ();
            PowerManager.WakeLock wakeLock = this.LLILZ;
            if (wakeLock == null || !wakeLock.isHeld()) {
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "Live::AnchorWakeLock");
                wakeLockNewWakeLock.acquire(300000L);
                this.LLILZ = wakeLockNewWakeLock;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.LLILLL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this.LLIZ);
        if (!LiveBroadcastBgServiceOptimizeSetting.INSTANCE.enable() && !C0UVE.LIZ()) {
            if (!LiveBroadcastKeepAliveNoPermSetting.INSTANCE.enable() || Build.VERSION.SDK_INT < 33 || BgVideoBroadcastService.LLJJIII || BgVideoBroadcastService.LLJIJIL) {
                return;
            }
            C20441214yg.LIZIZ("BgVideoBroadcastService", "startServiceWithoutPermission begin");
            try {
                BgVideoBroadcastService.LLJJIJIL = true;
                C838410Wul.LJIIIZ(this, new Intent(this, (Class<?>) BgVideoBroadcastService.class).putExtra("keep_alive_no_perm", true));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                JSONObject jSONObject = new JSONObject();
                C0K04.LJFF("error_code", th.getMessage(), jSONObject);
                C1CC2.LJIIIIZZ("ttlive_video_broadcast_service_no_perm_start_error", 1, jSONObject);
                C20441214yg.LJI("BgVideoBroadcastService", th);
            }
            C20441214yg.LIZIZ("BgVideoBroadcastService", "startServiceWithoutPermission end");
            return;
        }
        if (!LiveBroadcastKeepAliveNoPermSetting.INSTANCE.enable() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        boolean zLIZ = new C815520Vyw(this).LIZ();
        BgVideoBroadcastService2.LLJJIJI = zLIZ;
        if (zLIZ || BgVideoBroadcastService2.LLJIJIL) {
            return;
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService2", "startServiceWithoutPermission begin");
        try {
            BgVideoBroadcastService2.LLJJJ = true;
            C838410Wul.LJIIIZ(this, new Intent(this, (Class<?>) BgVideoBroadcastService2.class).putExtra("keep_alive_no_perm", true));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            JSONObject jSONObject2 = new JSONObject();
            C0K04.LJFF("error_code", th2.getMessage(), jSONObject2);
            C1CC2.LJIIIIZZ("ttlive_video_broadcast_service_no_perm_start_error", 1, jSONObject2);
            C20441214yg.LJI("BgVideoBroadcastService2", th2);
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService2", "startServiceWithoutPermission end");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        LIZIZ();
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
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
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/android/livesdk/broadcast/notification/BroadcastKeepAliveService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqptY4/lCeEeZ2govI65UfQMme/7oEUrb1x", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            LIZ();
        }
        return this.LLILZLL;
    }
}
