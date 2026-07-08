package com.ss.android.newmedia.message;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2093608Ic;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C808510Vnd;
import X.C808950VoL;
import Y.ARunnableS19S0201000_13;
import Y.ARunnableS82S0200000_13;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MessageReceiverService extends IntentService implements WeakHandler.IHandler {
    public WeakHandler mHandler;
    public Messenger mMessenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_newmedia_message_MessageReceiverService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_ss_android_newmedia_message_MessageReceiverService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public abstract void onHandleMessage(Context context, int i, String str, int i2, String str2);

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    private Messenger getMessenger() {
        if (this.mMessenger == null) {
            this.mHandler = new WeakHandler(this);
            this.mMessenger = new Messenger(this.mHandler);
        }
        return this.mMessenger;
    }

    private Handler getServiceHandler() {
        try {
            Field declaredField = IntentService.class.getDeclaredField("mServiceHandler");
            declaredField.setAccessible(true);
            return (Handler) declaredField.get(this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private void tryWakeupScreen() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        C808950VoL.LIZIZ().getClass();
        if (!C808950VoL.LIZLLL().LJIIIZ() || powerManager.isInteractive()) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(268435462, "MessageReceiverService");
        C808950VoL.LIZIZ().getClass();
        wakeLockNewWakeLock.acquire(C808950VoL.LIZLLL().LJIIJJI());
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    private String handleMySelfPushIntent(Intent intent) {
        if (intent == null || !"com.ss.android.message".equals(intent.getAction())) {
            return null;
        }
        return INVOKEVIRTUAL_com_ss_android_newmedia_message_MessageReceiverService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_data");
    }

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/newmedia/message/MessageReceiverService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDPKTwYk6vSDmPumDpJi2SjrONSipWl2qGaJUwNBE+", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        if (intent != null) {
            C808510Vnd.LIZ().LIZJ(new ARunnableS82S0200000_13(this, intent, 22));
        }
        return getMessenger().getBinder();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        try {
            onReceive(this, intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String INVOKEVIRTUAL_com_ss_android_newmedia_message_MessageReceiverService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_newmedia_message_MessageReceiverService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(MessageReceiverService messageReceiverService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        messageReceiverService.com_ss_android_newmedia_message_MessageReceiverService__attachBaseContext$___twin___(context);
    }

    public void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (action != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MessageReceiverService.onReceive(");
                sbLIZ.append(action);
                sbLIZ.append(")");
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C808950VoL.LIZIZ().getClass();
            if (!C808950VoL.LJ()) {
                return;
            }
            try {
                if ("com.ss.android.message".equals(action)) {
                    String strHandleMySelfPushIntent = handleMySelfPushIntent(intent);
                    if (C2093608Ic.LJ(strHandleMySelfPushIntent)) {
                        return;
                    }
                    onHandleMessage(context, 1, strHandleMySelfPushIntent, 2, null);
                    tryWakeupScreen();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return super.onStartCommand(intent, i, i2);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            if (getServiceHandler() == null) {
                C808510Vnd.LIZ().LIZJ(new ARunnableS19S0201000_13(i2, intent, this, 2));
                return 2;
            }
            return 2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 2;
        }
    }
}
