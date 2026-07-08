package com.bytedance.android.livesdk.notificatoin;

import X.C0II2;
import X.C0IIG;
import X.C0IL2;
import X.C0J9L;
import X.C0KVU;
import X.C0UO0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1121670fIL;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2409809cO;
import X.C294840Bh4;
import X.C464170IId;
import X.C497740JfY;
import X.C788530UwV;
import X.C813610Vvr;
import X.C814770Vxj;
import X.C815520Vyw;
import X.C817700W5w;
import X.C823050WQl;
import X.C930940aKi;
import X.InterfaceC420801kM;
import X.InterfaceC480510Isr;
import Y.AfS0S0230000_31;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.dataChannel.PlayerStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AudioLiveService extends Service {
    public static final C0J9L Companion = new C0J9L();
    public static boolean isRunning;
    public static boolean isStopping;
    public InterfaceC420801kM bitmapDisposable;
    public Notification notification;
    public NotificationManager notificationManager;
    public Room roomCache;

    private final int getPlaySwitchBitmap(boolean z, boolean z2, boolean z3) {
        return z3 ? R.drawable.epi : (z2 || !z) ? R.drawable.epj : R.drawable.epk;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_android_livesdk_notificatoin_AudioLiveService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_bytedance_android_livesdk_notificatoin_AudioLiveService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/android/livesdk/notificatoin/AudioLiveService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5SXfecj600URBiGM+PmJjSBPiXc0UuFYlEgrjPM=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("audio_live_notify_associated_2", "Audio Live", 3);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.setLockscreenVisibility(1);
            NotificationManager notificationManager = this.notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    private final void hideNotification() {
        C20441214yg.LIZIZ("AudioLiveService", "hideNotification begin");
        tryStartForeground(new C813610Vvr(this, "audio_live_notify_associated_2").LIZIZ());
        try {
            stopForeground(true);
            new C815520Vyw(this).LIZIZ(101, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("AudioLiveService", th);
        }
        C20441214yg.LIZIZ("AudioLiveService", "hideNotification end");
    }

    private final boolean isMuted() {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ((enterRoomLinkSessionLIZ == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null) ? null : roomsData.warmUpPlayerTag);
        if (interfaceC480510IsrLIZIZ != null) {
            return interfaceC480510IsrLIZIZ.isMute();
        }
        return false;
    }

    private final boolean isPlaying() {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ((enterRoomLinkSessionLIZ == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null) ? null : roomsData.warmUpPlayerTag);
        if (interfaceC480510IsrLIZIZ != null) {
            return interfaceC480510IsrLIZIZ.isPlaying();
        }
        return false;
    }

    @Override // android.app.Service
    public void onCreate() {
        C20441214yg.LIZIZ("AudioLiveService", "onCreate begin");
        super.onCreate();
        this.notificationManager = (NotificationManager) getSystemService("notification");
        createNotificationChannel();
        tryStartForeground(new C813610Vvr(this, "audio_live_notify_associated_2").LIZIZ());
        isRunning = true;
        if (isStopping) {
            C20441214yg.LIZIZ("AudioLiveService", "onCreate isStopping call stopService");
            Companion.getClass();
            C0J9L.LIZ();
            isStopping = false;
        }
        this.roomCache = null;
        C20441214yg.LIZIZ("AudioLiveService", "onCreate end");
    }

    @Override // android.app.Service
    public void onDestroy() {
        InterfaceC420801kM interfaceC420801kM;
        C20441214yg.LIZIZ("AudioLiveService", "onDestroy begin");
        super.onDestroy();
        isRunning = false;
        isStopping = false;
        this.roomCache = null;
        hideNotification();
        InterfaceC420801kM interfaceC420801kM2 = this.bitmapDisposable;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = this.bitmapDisposable) != null) {
            interfaceC420801kM.dispose();
        }
        C20441214yg.LIZIZ("AudioLiveService", "onDestroy end");
    }

    private final void showNotification() {
        boolean zLJI = MethodIDManager.LJI(71981);
        C20441214yg.LIZIZ("AudioLiveService", "showNotification begin");
        boolean zIsPlaying = isPlaying();
        boolean zIsMuted = isMuted();
        boolean z = C464170IId.LIZ().LIZJ;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (zIsPlaying) {
            this.roomCache = room;
        }
        Room room2 = this.roomCache;
        if (room2 != null) {
            ImageModel cover = room2.getCover();
            if (cover == null) {
                User owner = room2.getOwner();
                cover = owner != null ? owner.getAvatarMedium() : null;
            }
            this.bitmapDisposable = C1121670fIL.LJ(cover).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0230000_31(this, room2, zIsPlaying, zIsMuted, z, 0), new AfS0S0230000_31(this, room2, zIsPlaying, zIsMuted, z, 1));
        }
        C20441214yg.LIZIZ("AudioLiveService", "showNotification end");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    private final CharSequence getContentText(boolean z) {
        int i;
        if (z) {
            i = 2131841531;
        } else {
            i = 2131841447;
        }
        return C497740JfY.LJIJI(i);
    }

    private final PendingIntent retrievePlaybackAction(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(this, (Class<?>) AudioLiveService.class));
        return PendingIntent.getService(this, 0, intent, 67108864);
    }

    private final void setMute(boolean z) {
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        if (C0IIG.LIZ) {
            z = true;
        }
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str = roomsData.warmUpPlayerTag;
        } else {
            str = null;
        }
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(str);
        if (interfaceC480510IsrLIZIZ != null) {
            interfaceC480510IsrLIZIZ.t0(str, "notification", z);
        }
        if (!z) {
            C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0Isw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AudioLiveService@42bb.setMute$1");
                    try {
                        try {
                            C786410Ut5.q4(C480710ItB.LIZ, C480710ItB.LIZIZ, 3, 2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJIIL("AudioFocusUtil", "gainFocus error");
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AudioLiveService@42bb.setMute$1");
                }
            });
        }
    }

    private final void setPlayerStatus(boolean z) {
        C0II2 c0ii2;
        C464170IId.LIZ().LJIIJJI(z);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (z) {
            c0ii2 = C0II2.STOP;
        } else {
            c0ii2 = C0II2.START;
        }
        dataChannelGlobal.HQ2(PlayerStatusChannel.class, c0ii2);
    }

    private final void tryStartForeground(Notification notification) {
        C20441214yg.LIZIZ("AudioLiveService", "tryStartForeGround begin");
        try {
            if (C294840Bh4.LIZ()) {
                PrintStream printStream = System.err;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("service info---->:");
                sbLIZ.append(AudioLiveService.class.getCanonicalName());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            startForeground(101, notification);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("AudioLiveService", e);
        }
        C20441214yg.LIZIZ("AudioLiveService", "tryStartForeGround end");
    }

    public static void com_bytedance_android_livesdk_notificatoin_AudioLiveService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(AudioLiveService audioLiveService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        audioLiveService.com_bytedance_android_livesdk_notificatoin_AudioLiveService__attachBaseContext$___twin___(context);
    }

    public static void com_bytedance_android_livesdk_notificatoin_AudioLiveService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(AudioLiveService audioLiveService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_bytedance_android_livesdk_notificatoin_AudioLiveService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(audioLiveService, context);
    }

    private final Intent getAppOpenIntentByPackageName(Context context, String str) throws Throwable {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        intent.setFlags(270532608);
        ComponentName componentName = null;
        int i = 0;
        List listLJJJJZ = C2204961BRm.LJJJJZ(packageManager, intent, 0, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5SXfecj600URBiGM+PmJjSBPiXc0UuFYlEgrjPM=", null));
        int size = listLJJJJZ.size();
        while (true) {
            if (i >= size) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) ListProtector.get(listLJJJJZ, i);
            if (Intrinsics.LJFF(resolveInfo.activityInfo.packageName, str)) {
                String str2 = resolveInfo.activityInfo.name;
                if (str2 != null) {
                    componentName = new ComponentName(str, str2);
                }
            } else {
                i++;
            }
        }
        intent.setComponent(componentName);
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.notificatoin.AudioLiveService.onStartCommand(android.content.Intent, int, int):int");
    }

    public final void showDefaultNotification(Room room, boolean z, boolean z2, boolean z3, Bitmap bitmap) {
        if (!isRunning) {
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, getAppOpenIntentByPackageName(this, getPackageName()), 201326592);
        C813610Vvr c813610Vvr = new C813610Vvr(this, "audio_live_notify_associated_2");
        c813610Vvr.LJJIIZI.icon = R.drawable.epl;
        c813610Vvr.LJIIIIZZ(bitmap);
        c813610Vvr.LJIIJ = 1;
        c813610Vvr.LJII(2, true);
        c813610Vvr.LJII(16, true);
        c813610Vvr.LJJIIZI.when = System.currentTimeMillis();
        c813610Vvr.LJIIJJI = false;
        c813610Vvr.LJJ = 1;
        c813610Vvr.LJIJJ = "transport";
        c813610Vvr.LJIIIZ(null);
        c813610Vvr.LJFF(C0KVU.LIZLLL(room.getOwner()));
        c813610Vvr.LJ(getContentText(z3));
        c813610Vvr.LJI = activity;
        C814770Vxj c814770Vxj = new C814770Vxj();
        c814770Vxj.LJ = new int[]{0, 1};
        c813610Vvr.LJIIJ(c814770Vxj);
        c813610Vvr.LIZ(getPlaySwitchBitmap(z, z2, z3), "", retrievePlaybackAction("com.bytedance.android.livesdk.audio_action.MUTE"));
        c813610Vvr.LIZ(R.drawable.eph, "", retrievePlaybackAction("com.bytedance.android.livesdk.audio_action.CANCEL"));
        Notification notificationLIZIZ = c813610Vvr.LIZIZ();
        this.notification = notificationLIZIZ;
        if (notificationLIZIZ != null) {
            try {
                Context applicationContext = getApplicationContext();
                if (C2409809cO.LIZIZ && applicationContext == null) {
                    applicationContext = C2409809cO.LIZ;
                }
                new C815520Vyw(applicationContext).LIZJ(101, notificationLIZIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("AudioLiveService", e);
            }
        }
    }
}
