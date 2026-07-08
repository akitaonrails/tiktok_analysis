package com.ss.android.newmedia.redbadge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C808470VnZ;
import X.C808510Vnd;
import X.C809270Vor;
import X.C817700W5w;
import X.InterfaceC808610Vnn;
import Y.ARunnableS82S0200000_13;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class RedbadgeHandler extends Service implements WeakHandler.IHandler {
    public WeakHandler mHandler;
    public Messenger mMessenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_ss_android_newmedia_redbadge_RedbadgeHandler__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onHandleIntent(Intent intent) {
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_lancet_PushLancet_onHandleIntent(this, intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mHandler = new WeakHandler(this);
        this.mMessenger = new Messenger(this.mHandler);
    }

    public void com_ss_android_newmedia_redbadge_RedbadgeHandler__onHandleIntent$___twin___(Intent intent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHandleIntent = ");
        sbLIZ.append(intent);
        C2188811AlT.LIZIZ(sbLIZ);
        if (intent == null) {
            return;
        }
        try {
            if ("com.ss.android.redbadge.message".equals(intent.getAction())) {
                C809270Vor.LIZJ(this).LIZ(INVOKEVIRTUAL_com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "message_data"));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/newmedia/redbadge/RedbadgeHandler", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI7zvlIurF4sWIsgI5BkfpO", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        C808510Vnd.LIZ().LIZJ(new ARunnableS82S0200000_13(this, intent, 25));
        return this.mMessenger.getBinder();
    }

    public static String INVOKEVIRTUAL_com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_push_lancet_PushCrashFixLancet_onHandleIntent(RedbadgeHandler redbadgeHandler, Intent intent) {
        if (intent == null) {
            return;
        }
        redbadgeHandler.com_ss_android_newmedia_redbadge_RedbadgeHandler__onHandleIntent$___twin___(intent);
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(RedbadgeHandler redbadgeHandler, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        redbadgeHandler.com_ss_android_newmedia_redbadge_RedbadgeHandler__attachBaseContext$___twin___(context);
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_lancet_PushLancet_onHandleIntent(RedbadgeHandler redbadgeHandler, Intent intent) {
        if (intent == null) {
            return;
        }
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_push_lancet_PushCrashFixLancet_onHandleIntent(redbadgeHandler, intent);
    }

    public static void com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(RedbadgeHandler redbadgeHandler, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_ss_android_newmedia_redbadge_RedbadgeHandler_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(redbadgeHandler, context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C808510Vnd.LIZ().LIZJ(new ARunnableS82S0200000_13(this, intent, 24));
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        InterfaceC808610Vnn interfaceC808610Vnn = (InterfaceC808610Vnn) C808470VnZ.LIZ(InterfaceC808610Vnn.class);
        if (interfaceC808610Vnn != null && !interfaceC808610Vnn.LJFF()) {
            return iOnStartCommand;
        }
        return 2;
    }
}
