package com.bytedance.android.livesdk.broadcast.notification;

import X.C01GW;
import X.C0IJT;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1143680frq;
import X.C1152750g6T;
import X.C1161920gLG;
import X.C1ASM;
import X.C1AST;
import X.C20441214yg;
import X.C2179641ASc;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C294840Bh4;
import X.C354201Zc;
import X.C452501pT;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C520010KaN;
import X.C786410Ut5;
import X.C788530UwV;
import X.C813610Vvr;
import X.C814770Vxj;
import X.C815520Vyw;
import X.C817700W5w;
import X.C930930aKh;
import X.C930940aKi;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import Y.ARunnableS133S0100000_33;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.notification.BgVideoBroadcastService;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class BgVideoBroadcastService extends Service {
    public static boolean LLJIJIL;
    public static boolean LLJILJIL;
    public static String LLJILJILJ;
    public static boolean LLJILLL;
    public static boolean LLJJ;
    public static boolean LLJJI;
    public static boolean LLJJIII;
    public static DataChannel LLJJIJI;
    public static Fragment LLJJIJIIJIL;
    public static boolean LLJJIJIL;
    public NotificationManager LL;
    public Notification LLILLJJLI;
    public SoundPool LLILLL;
    public MediaSessionCompat LLILZ;
    public boolean LLILZIL;
    public InterfaceC420801kM LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground();
    public final C1AST LLJ = new InterfaceC19562711gH() { // from class: X.1AST
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            BgVideoBroadcastService bgVideoBroadcastService = this.LL;
            bgVideoBroadcastService.LLIZLLLIL = false;
            bgVideoBroadcastService.LIZIZ();
            this.LL.LJFF();
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            BgVideoBroadcastService bgVideoBroadcastService = this.LL;
            bgVideoBroadcastService.LLIZLLLIL = true;
            bgVideoBroadcastService.LJFF();
        }
    };
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 53));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/android/livesdk/broadcast/notification/BgVideoBroadcastService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqpoLc3lCGKSJuEpmuCAOU8l+8HrUkv8A==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    static {
        new C1ASM();
        LLJILJILJ = "";
    }

    public final Notification LIZ() {
        Boolean bool;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("video_live_bg_notify", "TikTok Video Live", 4);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            NotificationManager notificationManager = this.LL;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        Intent intent = new Intent();
        intent.setClassName(this, LLJILJILJ);
        intent.setAction("broadcast_click_notification");
        intent.putExtra("broadcast_click_notification", true);
        intent.putExtra("broadcast_pre_start", LLJJI);
        intent.putExtra("is_live_pause", LLJILLL);
        intent.putExtra("start_live_single_activity", true);
        IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
        if (iHostCreativeTool != null && iHostCreativeTool.UC0()) {
            intent.putExtra("saf_main_intent_target", "saf_creative_tool_target");
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        C813610Vvr c813610Vvr = i >= 26 ? new C813610Vvr(this, "video_live_bg_notify") : new C813610Vvr(this, null);
        DataChannel dataChannel = LLJJIJI;
        String strLJIJI = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(PauseLiveChannel.class)) == null) ? LLJILLL : bool.booleanValue() ? C497740JfY.LJIJI(2131855465) : this.LLIZLLLIL ? C497740JfY.LJIJI(2131855464) : C497740JfY.LJIJI(2131853474);
        c813610Vvr.LJFF("TikTok");
        c813610Vvr.LJ(strLJIJI);
        c813610Vvr.LJJIIZI.icon = R.drawable.eoe;
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJI = activity;
        c813610Vvr.LJIJJ = "service";
        c813610Vvr.LJII(8, true);
        c813610Vvr.LJIIJ(new C814770Vxj());
        if (i < 26) {
            c813610Vvr.LJIIJ = 2;
        }
        c813610Vvr.LIZLLL(true);
        c813610Vvr.LJJ = 0;
        c813610Vvr.LJII(2, true);
        return c813610Vvr.LIZIZ();
    }

    public final void LJFF() {
        if (!LLJJIII) {
            C20441214yg.LIZIZ("BgVideoBroadcastService", "update: notification is disabled");
            return;
        }
        if (LLJIJIL) {
            Notification notificationLIZ = LIZ();
            NotificationManager notificationManager = this.LL;
            if (notificationManager != null) {
                notificationManager.notify(R.id.video_live_bg_notification, notificationLIZ);
            }
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        C20441214yg.LIZIZ("BgVideoBroadcastService", "onCreate begin");
        super.onCreate();
        try {
            this.LLILZLL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this.LLJ);
            Object objL2 = C786410Ut5.L2(this);
            this.LL = objL2 instanceof NotificationManager ? (NotificationManager) objL2 : null;
            Notification notificationLIZ = LIZ();
            this.LLILLJJLI = notificationLIZ;
            LJ(notificationLIZ, false);
            if (LLJILJIL) {
                C20441214yg.LIZIZ("BgVideoBroadcastService", "onCreate isStopping call stopService");
                C1ASM.LIZJ(false);
                LLJILJIL = false;
            }
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS133S0100000_33(this, 21));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService", "onCreate end");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C20441214yg.LIZIZ("BgVideoBroadcastService", "onDestroy begin");
        super.onDestroy();
        LLJIJIL = false;
        LLJILJIL = false;
        LIZIZ();
        stopForeground(true);
        this.LLILLJJLI = null;
        this.LL = null;
        SoundPool soundPool = this.LLILLL;
        if (soundPool != null) {
            soundPool.release();
        }
        this.LLILLL = null;
        MediaSessionCompat mediaSessionCompat = this.LLILZ;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.LJ();
        }
        this.LLILZ = null;
        this.LLILZIL = false;
        LLJJIJI = null;
        LLJJIJIIJIL = null;
        InterfaceC420801kM interfaceC420801kM = this.LLILZLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService", "onDestroy end");
    }

    public final void LIZIZ() {
        NotificationManager notificationManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" dismissRecallNotification  ");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("BgVideoBroadcastService", C2188811AlT.LIZIZ(sbLIZ));
        C473410IhP.LIZ().removeCallbacks((Runnable) this.LLJI.getValue());
        if (!this.LLIZ || (notificationManager = this.LL) == null) {
            return;
        }
        notificationManager.cancel(R.id.video_live_recall_notification);
    }

    public final void LIZLLL() {
        if (C1152750g6T.LIZ().getEnableMediaSession()) {
            if (this.LLILZ == null) {
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "LiveBroadcastBg", null, null);
                C2179641ASc c2179641ASc = new C2179641ASc();
                c2179641ASc.LIZIZ(3, 0L);
                mediaSessionCompat.LJIIIIZZ(c2179641ASc.LIZ());
                mediaSessionCompat.LJFF(true);
                this.LLILZ = mediaSessionCompat;
                this.LLILZIL = true;
                C20441214yg.LIZIZ("BgVideoBroadcastService", "startMediaSession: active");
                return;
            }
            return;
        }
        if (this.LLILLL == null) {
            this.LLILLL = new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        }
        SoundPool soundPool = this.LLILLL;
        if (soundPool == null || this.LLILZIL) {
            return;
        }
        final int iLIZJ = C1143680frq.LIZJ(soundPool, "tiktok_live_broadcast_demand_2", "white_noise.mp3");
        this.LLILZIL = true;
        if (iLIZJ != 0) {
            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: X.1ASS
                @Override // android.media.SoundPool.OnLoadCompleteListener
                public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(soundPool2);
                    sbLIZ.append(",  sampleId=");
                    sbLIZ.append(i);
                    sbLIZ.append(", status=");
                    sbLIZ.append(i2);
                    C20441214yg.LIZIZ("BgVideoBroadcastService", C2188811AlT.LIZIZ(sbLIZ));
                    if (i2 == 0) {
                        soundPool2.play(iLIZJ, 1.0f, 1.0f, 1, -1, 1.0f);
                    } else {
                        this.LLILZIL = false;
                    }
                }
            });
        }
    }

    public static void LIZJ(boolean z) {
        Room room;
        String str;
        String str2;
        Long lValueOf;
        String idStr;
        LiveMode streamType;
        if (LLJJ) {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930930aKh.class);
        } else {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        if (LLJJI) {
            str2 = "start_live";
            str = "start_live";
        } else {
            str = "swtich_backstage";
            if (!LLJILLL) {
                str2 = "swtich_backstage";
            } else {
                str2 = "manual_pause";
            }
        }
        if (z) {
            str = "before_end";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_backtolive_reminder_show");
        c474500IjALIZ.LJIL();
        String strLIZ = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "anchor_id");
        if (room != null) {
            idStr = room.getIdStr();
        } else {
            idStr = null;
        }
        c474500IjALIZ.LJJII(idStr, "room_id");
        c474500IjALIZ.LJJII(str2, "switch_type");
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJII(strLIZ, "live_type");
        c474500IjALIZ.LJJII(str, "reminder_show_time");
        c474500IjALIZ.LIZ();
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
    public final void onTaskRemoved(Intent intent) {
        C20441214yg.LIZIZ("BgVideoBroadcastService", " onTaskRemoved");
        stopForeground(true);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" onTrimMemory level = ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("BgVideoBroadcastService", C2188811AlT.LIZIZ(sbLIZ));
        super.onTrimMemory(i);
    }

    public final void LJ(Notification notification, boolean z) {
        C20441214yg.LIZIZ("BgVideoBroadcastService", "tryStartForeGround begin");
        if (z) {
            try {
                C1ASM.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("BgVideoBroadcastService", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(R.id.video_live_bg_notification, notification, 2);
        } else {
            if (C294840Bh4.LIZ()) {
                PrintStream printStream = System.err;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("service info---->:");
                sbLIZ.append(BgVideoBroadcastService.class.getCanonicalName());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            startForeground(R.id.video_live_bg_notification, notification);
        }
        LLJIJIL = true;
        if (z) {
            LIZJ(false);
        }
        C20441214yg.LIZIZ("BgVideoBroadcastService", "tryStartForeGround end");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        DataChannelGlobal dataChannelGlobal;
        C20441214yg.LIZIZ("BgVideoBroadcastService", "onStartCommand");
        try {
            LLJJIII = new C815520Vyw(this).LIZ();
            if (intent != null && intent.getBooleanExtra("keep_alive_no_perm", false)) {
                z = true;
            } else {
                z = false;
            }
            dataChannelGlobal = DataChannelGlobal.LLILZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (((Room) dataChannelGlobal.gg0(C930940aKi.class)) == null && ((Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
            C20441214yg.LIZIZ("BgVideoBroadcastService", "onStartCommand room is null");
            C1ASM.LIZJ(false);
            return 2;
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = LIZ();
        }
        Notification notification = this.LLILLJJLI;
        if (notification != null) {
            LJ(notification, !z);
        }
        if (!z) {
            LIZLLL();
            return 1;
        }
        return 1;
    }
}
