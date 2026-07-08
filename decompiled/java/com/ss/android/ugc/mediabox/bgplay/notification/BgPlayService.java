package com.ss.android.ugc.mediabox.bgplay.notification;

import X.AbstractC468201s0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1487370ooB;
import X.C1AS6;
import X.C1AS8;
import X.C1ASB;
import X.C1ASD;
import X.C2179591ARx;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2189441AmU;
import X.C2214201BlK;
import X.C294840Bh4;
import X.C461290I7b;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC1487460ooK;
import X.InterfaceC2179601ARy;
import Y.ARunnableS92S0200000_23;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayDataModel;
import com.ss.android.ugc.mediabox.bgplay.notification.BgPlayService;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BgPlayService extends Service {
    public C1AS6 LLILLJJLI;
    public C2179591ARx LLILLL;
    public boolean LLILZ;
    public ServiceConnection LLILZIL;
    public final C1ASD LL = new C1ASD(this);
    public final C1AS8 LLILZLL = new InterfaceC1487460ooK() { // from class: X.1AS8
        @Override // X.InterfaceC1487460ooK
        public final void LIZ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LIZLLL(int i) {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJFF() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJI(int i) {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJII() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIIIZZ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIIZ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIJ() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIJJI(int i) {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LJIIL() {
        }

        @Override // X.InterfaceC1487460ooK
        public final void LIZIZ(Integer num, Long l) {
            long j;
            MediaControllerCompat mediaControllerCompat;
            PlaybackStateCompat playbackStateCompatLIZIZ;
            boolean z;
            C1AS6 c1as6 = this.LIZ.LLILLJJLI;
            if (c1as6 != null) {
                if (num == null) {
                    c1as6.LIZLLL(c1as6.LJ.isPlaying);
                } else {
                    if (num.intValue() == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1as6.LIZLLL(z);
                }
            }
            C2179591ARx c2179591ARx = this.LIZ.LLILLL;
            if (c2179591ARx != null) {
                if (num == null) {
                    if (l == null) {
                        return;
                    }
                } else {
                    if (l == null) {
                        int i = c2179591ARx.LJ;
                        if (num == null || num.intValue() == i) {
                            return;
                        }
                        MediaSessionCompat mediaSessionCompat = c2179591ARx.LIZIZ;
                        if (mediaSessionCompat != null && (mediaControllerCompat = mediaSessionCompat.LIZIZ) != null && (playbackStateCompatLIZIZ = mediaControllerCompat.LIZIZ()) != null) {
                            j = playbackStateCompatLIZIZ.mPosition;
                        } else {
                            j = 0;
                        }
                        c2179591ARx.LIZIZ(num.intValue(), j);
                        return;
                    }
                    if (num == null) {
                        if (l == null) {
                            return;
                        }
                    } else {
                        if (l == null) {
                            return;
                        }
                        c2179591ARx.LIZIZ(num.intValue(), l.longValue());
                        return;
                    }
                }
                c2179591ARx.LIZIZ(c2179591ARx.LJ, l.longValue());
            }
        }
    };

    public final void LIZIZ() {
        Bitmap bitmapLIZLLL;
        InterfaceC2179601ARy interfaceC2179601ARy = C1487370ooB.LIZLLL;
        if (interfaceC2179601ARy == null || (bitmapLIZLLL = interfaceC2179601ARy.LIZLLL()) == null) {
            return;
        }
        C1AS6 c1as6 = this.LLILLJJLI;
        if (c1as6 != null && !bitmapLIZLLL.isRecycled()) {
            c1as6.LJ.coverBitmap = bitmapLIZLLL;
            c1as6.LIZIZ();
        }
        C2179591ARx c2179591ARx = this.LLILLL;
        if (c2179591ARx != null) {
            c2179591ARx.LIZJ(bitmapLIZLLL);
        }
    }

    public final void LIZJ() {
        Notification notificationLIZ;
        C1AS6 c1as6 = this.LLILLJJLI;
        if (c1as6 == null || (notificationLIZ = c1as6.LIZ()) == null) {
            return;
        }
        this.LLILZ = true;
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(R.id.o5i, notificationLIZ, 2);
                return;
            }
            if (C294840Bh4.LIZ()) {
                PrintStream printStream = System.err;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("service info---->:");
                sbLIZ.append(BgPlayService.class.getCanonicalName());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            startForeground(R.id.o5i, notificationLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL() {
        C1AS6 c1as6;
        NotificationManager notificationManager;
        if (this.LLILZ) {
            this.LLILZ = false;
            stopForeground(true);
            if (Build.VERSION.SDK_INT < 33 || (c1as6 = this.LLILLJJLI) == null || (notificationManager = c1as6.LIZJ) == null) {
                return;
            }
            notificationManager.cancel(R.id.o5i);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        MediaSessionCompat mediaSessionCompat;
        MediaSessionCompat.Token tokenLIZIZ;
        try {
            super.onCreate();
            C2179591ARx c2179591ARx = new C2179591ARx(this);
            this.LLILLL = c2179591ARx;
            c2179591ARx.LIZ();
            C2179591ARx c2179591ARx2 = this.LLILLL;
            C1AS6 c1as6 = null;
            if (c2179591ARx2 != null && (mediaSessionCompat = c2179591ARx2.LIZIZ) != null && (tokenLIZIZ = mediaSessionCompat.LIZIZ()) != null) {
                c1as6 = new C1AS6(this, tokenLIZIZ);
            }
            this.LLILLJJLI = c1as6;
            C1487370ooB c1487370ooB = C1487370ooB.LIZ;
            C1487370ooB.LIZ(this.LLILZLL);
            LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        MediaSessionCompat mediaSessionCompat;
        NotificationManager notificationManager;
        try {
            super.onDestroy();
            C1AS6 c1as6 = this.LLILLJJLI;
            if (c1as6 != null && (notificationManager = c1as6.LIZJ) != null) {
                notificationManager.cancel(R.id.o5i);
            }
            C2179591ARx c2179591ARx = this.LLILLL;
            if (c2179591ARx != null && (mediaSessionCompat = c2179591ARx.LIZIZ) != null) {
                mediaSessionCompat.LJFF(false);
                mediaSessionCompat.LJI(null, null);
                mediaSessionCompat.LJ();
            }
            C1487370ooB c1487370ooB = C1487370ooB.LIZ;
            C1487370ooB.LJ(this.LLILZLL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZ(String str) {
        if (str == null) {
            LIZIZ();
            return;
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
        c1331670kl3LJI.LJJIJL(this);
        c1331670kl3LJI.LIZLLL("KeepBgPlayService");
        c1331670kl3LJI.LJJIJIL(new C461290I7b());
        c1331670kl3LJI.LJJII(new C2189441AmU(this, 0));
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
        BgPlayDataModel bgPlayDataModel;
        Object obj;
        BgPlayDataModel bgPlayDataModel2 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/mediabox/bgplay/notification/BgPlayService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3U8eG4yZOWwLZ3JzD5llRZ6dXV0sHJ+tf8W8saS3ElpXaI0PExqS7SsPg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        if (intent != null) {
            bgPlayDataModel = (BgPlayDataModel) intent.getParcelableExtra("bg_play_info");
        } else {
            bgPlayDataModel = null;
        }
        if (bgPlayDataModel instanceof BgPlayDataModel) {
            bgPlayDataModel2 = bgPlayDataModel;
        }
        if (bgPlayDataModel2 != null) {
            try {
                C2179591ARx c2179591ARx = this.LLILLL;
                if (c2179591ARx != null) {
                    c2179591ARx.LIZLLL(bgPlayDataModel2);
                }
                C1AS6 c1as6 = this.LLILLJJLI;
                if (c1as6 != null) {
                    c1as6.LIZJ(bgPlayDataModel2);
                }
                String str = bgPlayDataModel2.coverImageUrl;
                final String str2 = bgPlayDataModel2.userAvatarUrl;
                if (str == null) {
                    LIZ(str2);
                } else {
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
                    c1331670kl3LJI.LJJIJL(this);
                    c1331670kl3LJI.LIZLLL("KeepBgPlayService");
                    c1331670kl3LJI.LJJIJIL(new C461290I7b());
                    c1331670kl3LJI.LJJII(new AbstractC468201s0() { // from class: X.1ASA
                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                BgPlayService bgPlayService = this.LL;
                                C1AS6 c1as62 = bgPlayService.LLILLJJLI;
                                if (c1as62 != null && !bitmap.isRecycled()) {
                                    c1as62.LJ.coverBitmap = bitmap;
                                    c1as62.LIZIZ();
                                }
                                C2179591ARx c2179591ARx2 = bgPlayService.LLILLL;
                                if (c2179591ARx2 != null) {
                                    c2179591ARx2.LIZJ(bitmap);
                                    if (Unit.LIZ != null) {
                                        return;
                                    }
                                }
                            }
                            this.LL.LIZ(str2);
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            this.LL.LIZ(str2);
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return this.LL;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action;
        Context context;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF("action_stop_bg_play_service", action)) {
            try {
                LIZLLL();
                ServiceConnection serviceConnection = this.LLILZIL;
                if (serviceConnection != null && (context = C1487370ooB.LIZIZ) != null) {
                    context.unbindService(serviceConnection);
                }
                stopSelf();
                return 2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 2;
            }
        }
        C1AS6 c1as6 = this.LLILLJJLI;
        if (c1as6 != null && intent != null) {
            C786410Ut5.LJJZZIII(c1as6.LJFF, new ARunnableS92S0200000_23(intent, c1as6, 3));
        }
        C2179591ARx c2179591ARx = this.LLILLL;
        if (c2179591ARx != null) {
            if (intent != null) {
                intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            }
            C1ASB.LIZIZ(c2179591ARx.LIZIZ, intent);
            return 2;
        }
        return 2;
    }
}
