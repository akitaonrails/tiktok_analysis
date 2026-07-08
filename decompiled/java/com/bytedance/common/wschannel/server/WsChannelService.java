package com.bytedance.common.wschannel.server;

import X.C0WK0;
import X.C0WKC;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.RunnableC823120WQs;
import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.app.AbsMessengerService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class WsChannelService extends AbsMessengerService {
    public static final /* synthetic */ int LL = 0;

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service
    public final void onCreate() {
        Logger.debug();
        super.onCreate();
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        super.handleMsg(message);
        if (message == null) {
            return;
        }
        Logger.debug();
        if (C0WK0.LIZ == null) {
            synchronized (C0WKC.class) {
                try {
                    if (C0WK0.LIZ == null) {
                        C0WK0.LIZ = C0WK0.LIZ(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0WK0.LIZ.handleMsg(message);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Logger.debug();
        RunnableC823120WQs.LIZIZ(new ARunnableS82S0200000_13(this, intent, 20));
        return 2;
    }
}
