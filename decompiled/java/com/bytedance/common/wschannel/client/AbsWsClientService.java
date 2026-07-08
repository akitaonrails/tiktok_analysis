package com.bytedance.common.wschannel.client;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XE1;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C808520Vne;
import X.C821170WJf;
import X.C821220WJk;
import X.C821280WJq;
import X.InterfaceC821190WJh;
import Y.ARunnableS14S0200100_13;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsWsClientService extends Service implements WeakHandler.IHandler, InterfaceC821190WJh {
    public Messenger mMessenger;
    public final Handler mHandler = new WeakHandler(this);
    public final C821220WJk parser = new C821220WJk(this);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_common_wschannel_client_AbsWsClientService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_common_wschannel_client_AbsWsClientService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // X.InterfaceC821190WJh
    public void onReceive(WsChannelMsg wsChannelMsg) {
    }

    @Override // X.InterfaceC821190WJh
    public abstract /* synthetic */ void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject);

    @Override // X.InterfaceC821190WJh
    public abstract /* synthetic */ void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent);

    @Override // X.InterfaceC821190WJh
    public void onSendResult(String str, boolean z) {
    }

    public abstract /* synthetic */ void replySendMsgResult(WsChannelMsg wsChannelMsg, boolean z);

    @Override // X.InterfaceC821190WJh
    public abstract /* synthetic */ void syncState(int i, C0XE1 c0xe1, boolean z);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mMessenger = new Messenger(this.mHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Logger.debug();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        try {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (message != null && message.what == 10123) {
                Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                Logger.debug();
                if (intent != null) {
                    C808520Vne c808520VneLIZ = C808520Vne.LIZ();
                    ARunnableS14S0200100_13 aRunnableS14S0200100_13 = new ARunnableS14S0200100_13(this, intent, jElapsedRealtimeNanos, 1);
                    c808520VneLIZ.getClass();
                    C808520Vne.LLILLJJLI.post(aRunnableS14S0200100_13);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/common/wschannel/client/AbsWsClientService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6vqhP7qaw8WuOa98G7cTmVpgFvZ8k44Z90U=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return this.mMessenger.getBinder();
    }

    public static void com_bytedance_common_wschannel_client_AbsWsClientService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(AbsWsClientService absWsClientService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        absWsClientService.com_bytedance_common_wschannel_client_AbsWsClientService__attachBaseContext$___twin___(context);
    }

    public void handleIntent(Intent intent, long j) {
        if (intent == null) {
            return;
        }
        this.parser.LIZ(intent, new C821170WJf(j));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String string;
        if (Logger.debug()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onStartCommand intent = ");
            if (intent != null) {
                string = intent.toString();
            } else {
                string = "null";
            }
            sbLIZ.append(string);
            Logger.d("AbsWsClientService", C2188811AlT.LIZIZ(sbLIZ));
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C808520Vne c808520VneLIZ = C808520Vne.LIZ();
        ARunnableS14S0200100_13 aRunnableS14S0200100_13 = new ARunnableS14S0200100_13(this, intent, jElapsedRealtimeNanos, 0);
        c808520VneLIZ.getClass();
        C808520Vne.LLILLJJLI.post(aRunnableS14S0200100_13);
        return 2;
    }
}
