package com.ss.android.ugc.aweme.legoImp.task;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1BWL;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.legoImp.task.AppLogSessionMonitorInitTask;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLogSessionMonitorInitTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(577));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppLogSessionMonitorInitTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return false;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1BWL.LIZ().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.052G
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
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
            public final void onActivityResumed(Activity activity) throws JSONException {
                AppLogSessionMonitorInitTask appLogSessionMonitorInitTask = this.LL;
                appLogSessionMonitorInitTask.getClass();
                String strLIZ = C2162308dZ.LIZ(C1BWL.LIZ());
                if (strLIZ != null && a0.LJJIIZI(strLIZ, ":", false)) {
                    Set set = (Set) ((Map) appLogSessionMonitorInitTask.LL.getValue()).get(ListProtector.get(a0.LJJLIIIJILLIZJL(strLIZ, new String[]{":"}, 0, 6), 1));
                    if (set == null) {
                        set = C08CX.INSTANCE;
                    }
                    String strLIZ2 = C1504880pGQ.LIZ(activity, false);
                    if (!set.contains(strLIZ2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("act", strLIZ2);
                        C793770VBv.LJII("sub_process_activity", jSONObject, new JSONObject(), new JSONObject());
                    }
                }
            }
        });
    }
}
