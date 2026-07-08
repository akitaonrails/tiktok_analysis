package com.ss.android.ugc.aweme.im.push.impl.alerttone.helper;

import X.C01GW;
import X.C0CNO;
import X.C0VSJ;
import X.C20101413ky;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C356901a3;
import X.C452501pT;
import X.C813810VwB;
import X.C815520Vyw;
import X.C815620Vz6;
import X.C815630Vz7;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.content.FileProvider;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS79S1000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AlertTonePlayer {
    public final C20101413ky LIZ;
    public MediaPlayer LIZIZ;
    public boolean LIZJ;
    public ForegroundObserverForSilenceSound LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(140));

    /* JADX INFO: loaded from: classes14.dex */
    public final class ForegroundObserverForSilenceSound implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public int LL;
        public Notification LLILLJJLI;
        public long LLILLL;
        public final C20101413ky LLILZ;
        public final /* synthetic */ AlertTonePlayer LLILZIL;

        public ForegroundObserverForSilenceSound() {
            throw null;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public final void LIZ() {
            C20101413ky c20101413ky = this.LLILZ;
            c20101413ky.getClass();
            if (!Intrinsics.LJFF(C815620Vz6.LIZ(new C0VSJ(new C0VSJ((String) c20101413ky.LIZLLL.getValue(), "silence.mp3").getAbsolutePath())).toLowerCase(Locale.ROOT), "fc32d2e723403c8e5873132f83e1a251")) {
                try {
                    C20101413ky c20101413ky2 = this.LLILZ;
                    c20101413ky2.getClass();
                    C815630Vz7.LIZ(new C0VSJ(new C0VSJ((String) c20101413ky2.LIZLLL.getValue(), "silence.mp3").getAbsolutePath()));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            C20101413ky c20101413ky3 = this.LLILZ;
            c20101413ky3.getClass();
            c20101413ky3.LJ(new C0VSJ((String) c20101413ky3.LIZLLL.getValue(), "silence.mp3").getAbsolutePath());
            this.LLILZIL.getClass();
            NotificationManager notificationManager = (NotificationManager) C2213981Bky.LIZIZ.getApplicationContext().getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.notify("app_notify_ame", this.LL, this.LLILLJJLI);
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            try {
                ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(this);
                List<StatusBarNotification> listLIZ = C813810VwB.LIZ(new C815520Vyw(C2213981Bky.LIZIZ.getApplicationContext()).LIZIZ);
                if ((listLIZ instanceof Collection) && listLIZ.isEmpty()) {
                    return;
                }
                Iterator<StatusBarNotification> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getId() == this.LL) {
                        if (System.currentTimeMillis() <= this.LLILLL) {
                            if (((Boolean) this.LLILZIL.LJ.getValue()).booleanValue()) {
                                this.LLILZIL.LIZLLL();
                                return;
                            } else {
                                LIZ();
                                return;
                            }
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public ForegroundObserverForSilenceSound(AlertTonePlayer alertTonePlayer, int i, Notification notification, C20101413ky c20101413ky) {
            long jCurrentTimeMillis = System.currentTimeMillis() + 3000;
            this.LLILZIL = alertTonePlayer;
            this.LL = i;
            this.LLILLJJLI = notification;
            this.LLILLL = jCurrentTimeMillis;
            this.LLILZ = c20101413ky;
        }
    }

    public final Uri LIZ() {
        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
        C20101413ky c20101413ky = this.LIZ;
        c20101413ky.getClass();
        C0VSJ c0vsj = new C0VSJ(new C0VSJ((String) c20101413ky.LIZLLL.getValue(), "Custom Tone").getAbsolutePath());
        if (!c0vsj.exists()) {
            C815630Vz7.LIZ(c0vsj);
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(applicationContext.getPackageName());
            sbLIZ.append(".fileprovider");
            return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(applicationContext, C2188811AlT.LIZIZ(sbLIZ), c0vsj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return Uri.EMPTY;
        }
    }

    public final void LIZLLL() {
        try {
            MediaPlayer mediaPlayer = this.LIZIZ;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.stop();
            mediaPlayer.release();
            this.LIZIZ = null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJ() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        NotificationManager notificationManager = (NotificationManager) c2213981Bky.getApplicationContext().getSystemService(NotificationManager.class);
        if (notificationManager != null && notificationManager.getNotificationChannel("im_push_custom_tone") == null) {
            C20101413ky c20101413ky = this.LIZ;
            c20101413ky.getClass();
            if (new C0VSJ(new C0VSJ((String) c20101413ky.LIZLLL.getValue(), "Custom Tone").getAbsolutePath()).exists()) {
                Uri uriLIZ = LIZ();
                if (Intrinsics.LJFF(uriLIZ, Uri.EMPTY)) {
                    return;
                }
                NotificationChannel notificationChannel = new NotificationChannel("im_push_custom_tone", c2213981Bky.getApplicationContext().getString(2131827526), 4);
                notificationChannel.setSound(uriLIZ, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
                notificationChannel.enableVibration(true);
                notificationChannel.enableLights(true);
                notificationChannel.setShowBadge(true);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.setLockscreenVisibility(1);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public AlertTonePlayer(C20101413ky c20101413ky) {
        this.LIZ = c20101413ky;
    }

    public final boolean LIZIZ(LifecycleOwner lifecycleOwner, Function1 function1, boolean z) {
        int i;
        try {
            LIZLLL();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.LIZIZ = mediaPlayer;
            if (!((Boolean) function1.invoke(mediaPlayer)).booleanValue()) {
                return false;
            }
            if (z) {
                i = 1;
            } else {
                i = 5;
            }
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(i).build());
            mediaPlayer.prepare();
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: X.1ASa
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    MediaPlayer mediaPlayer3 = this.LL.LIZIZ;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.release();
                    }
                    this.LL.LIZIZ = null;
                }
            });
            C0CNO.LIZLLL(0L, new AwS431S0200000_30(lifecycleOwner, this, 39));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final boolean LIZJ(String str, LifecycleOwner lifecycleOwner, String str2, boolean z) {
        boolean zLIZIZ = false;
        if (str.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playToneByUrl() called with: url = ");
            sbLIZ.append(str);
            sbLIZ.append(", error = url is empty");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        String strLIZLLL = this.LIZ.LIZLLL(str);
        if (lifecycleOwner == null) {
            lifecycleOwner = ProcessLifecycleOwner.Companion.get();
        }
        if (!new C0VSJ(strLIZLLL).exists()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("playToneByPath() called with: downloadPath = ");
            sbLIZ2.append(strLIZLLL);
            sbLIZ2.append(", error = file not exist");
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            zLIZIZ = LIZIZ(lifecycleOwner, new AwS79S1000000_29(strLIZLLL, 7), z);
            if (zLIZIZ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("playToneByPath() called with: downloadPath = ");
                sbLIZ3.append(strLIZLLL);
                sbLIZ3.append(", successfully");
                C2188811AlT.LIZIZ(sbLIZ3);
                return zLIZIZ;
            }
            new C0VSJ(strLIZLLL).delete();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("playToneByPath() called with: downloadPath = ");
            sbLIZ4.append(strLIZLLL);
            sbLIZ4.append(", error = play error");
            C2188811AlT.LIZIZ(sbLIZ4);
        }
        this.LIZ.LIZ(60000L, str, str2, true);
        return zLIZIZ;
    }
}
