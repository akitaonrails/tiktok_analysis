package com.bytedance.common.wschannel.app;

import X.C0WFS;
import X.C0WFV;
import X.C0WFY;
import X.C0WJU;
import X.C0WK0;
import X.C0WKC;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2103808Ma;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C807690VmJ;
import X.C820090WFb;
import X.C820150WFh;
import X.RunnableC823120WQs;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS113S0100000_13;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbsMessengerService extends Service implements WeakHandler.IHandler {
    public WeakHandler mHandler;
    public Messenger mMessenger;

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_bytedance_common_wschannel_app_AbsMessengerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_bytedance_common_wschannel_app_AbsMessengerService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // android.app.Service
    public void onCreate() {
        RunnableC823120WQs.LIZIZ(new ARunnableS113S0100000_13((Object) this, 59));
        this.mHandler = new WeakHandler(this);
        this.mMessenger = new Messenger(this.mHandler);
    }

    public void tryInitInPushProcess() {
        boolean z;
        if (C2103808Ma.LIZJ(getApplication())) {
            return;
        }
        Application application = getApplication();
        C0WJU c0wju = C820150WFh.LIZ;
        new Object() { // from class: X.0WFk
            public C0WJZ LIZ;
        };
        if (C820150WFh.LIZIZ) {
            return;
        }
        C820150WFh.LIZIZ = true;
        C820150WFh.LIZJ = application;
        String strLIZIZ = C2103808Ma.LIZIZ(application);
        C820150WFh.LJFF = strLIZIZ;
        if (strLIZIZ == null || strLIZIZ.contains(":") || !strLIZIZ.equals(application.getPackageName())) {
            z = false;
            String str = C820150WFh.LJFF;
            if (str != null && str.endsWith(":push")) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    Application application2 = C820150WFh.LIZJ;
                    Application application3 = C820150WFh.LIZJ;
                    if (C0WK0.LIZ == null) {
                        synchronized (C0WKC.class) {
                            try {
                                if (C0WK0.LIZ == null) {
                                    C0WK0.LIZ = C0WK0.LIZ(application3);
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                    C786410Ut5.LJIJI(application2, new C807690VmJ(application3, C0WK0.LIZ), intentFilter);
                } catch (Exception th) {
                }
            }
        } else {
            z = true;
            C820090WFb c820090WFb = new C820090WFb();
            c820090WFb.LLILLJJLI = C820150WFh.LIZLLL;
            application.registerActivityLifecycleCallbacks(c820090WFb);
            WsConstants.setOnMessageReceiveListener(null);
            WsConstants.setOptLogic(null);
            WsConstants.setBindWsChannelServiceListener(null);
            C0WFY c0wfyLIZIZ = C0WFY.LIZIZ(application);
            if (c0wfyLIZIZ != null) {
                C0WFS c0wfs = c0wfyLIZIZ.LIZ;
                c0wfs.getClass();
                C0WFV c0wfv = new C0WFV(c0wfs.LIZ);
                c0wfv.LIZIZ.put("key_enable_offline_detect", Boolean.FALSE);
                c0wfv.LIZIZ();
            }
        }
        final C0WJU c0wju2 = C820150WFh.LIZ;
        final Application application4 = C820150WFh.LIZJ;
        c0wju2.getClass();
        if (z) {
            RunnableC823120WQs.LIZIZ(new Runnable() { // from class: X.0WJX
                public final /* synthetic */ boolean LLILLJJLI = true;

                public final void LIZ() {
                    if (application4 == null) {
                        return;
                    }
                    WeakReference<Context> weakReference = c0wju2.LIZLLL;
                    if (weakReference == null || weakReference.get() == null) {
                        c0wju2.LIZLLL = new WeakReference<>(C786410Ut5.N3(application4));
                    }
                    try {
                        ComponentName componentName = new ComponentName(application4, (Class<?>) WsChannelService.class);
                        C0WJY c0wjy = new C0WJY();
                        c0wjy.LIZJ = this.LLILLJJLI ? 9 : 11;
                        c0wju2.LJFF.offer(c0wjy);
                        c0wju2.LJ(componentName);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WsChannelMultiProcessImpl@70c0.startPushProcess$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WsChannelMultiProcessImpl@70c0.startPushProcess$1");
                }
            });
        } else {
            RunnableC823120WQs.LIZIZ(new ARunnableS103S0100000_3((Context) application4, 121));
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/bytedance/common/wschannel/app/AbsMessengerService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6vjqHCv3hvSofO4JvIehVWzsaW0JPunB", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return this.mMessenger.getBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public static void com_bytedance_common_wschannel_app_AbsMessengerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(AbsMessengerService absMessengerService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        absMessengerService.com_bytedance_common_wschannel_app_AbsMessengerService__attachBaseContext$___twin___(context);
    }
}
