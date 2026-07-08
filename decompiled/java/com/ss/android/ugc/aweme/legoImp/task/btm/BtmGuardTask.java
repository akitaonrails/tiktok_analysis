package com.ss.android.ugc.aweme.legoImp.task.btm;

import X.C0CCZ;
import X.C0VZ0;
import X.C1BWL;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.btm.api.BtmSDK;
import com.ss.android.ugc.aweme.legoImp.task.btm.InitBtmSDKTask;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class BtmGuardTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BtmGuardTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        InitBtmSDKTask.LL.getClass();
        return InitBtmSDKTask.LJ();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1BWL.LIZ().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.15fI
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                InitBtmSDKTask initBtmSDKTask = InitBtmSDKTask.LL;
                initBtmSDKTask.getClass();
                if (!InitBtmSDKTask.LLILLJJLI) {
                    initBtmSDKTask.LJIIIIZZ();
                }
                BtmSDK.INSTANCE.registerAndRunFirstActivityCallbackAfterInit(activity, bundle);
                C1BWL.LIZ().unregisterActivityLifecycleCallbacks(this);
                C1150504el.LIZ().LJJIIZ = Boolean.valueOf(activity instanceof InterfaceC1603190roz);
            }
        });
    }
}
