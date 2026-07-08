package com.ss.android.ugc.aweme.fe.method;

import X.C0WZX;
import X.C1388190mED;
import X.C1701330uNH;
import X.C2204961BRm;
import X.C824390WVp;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.PermissionJsbSupportSaExp;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class NoticePermissionMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public NoticePermissionMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        Context actContext;
        String message;
        Activity activityLIZ;
        Context context;
        boolean value = PermissionJsbSupportSaExp.INSTANCE.getValue();
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            actContext = weakReference.get();
        } else {
            actContext = getActContext();
        }
        if (actContext == null) {
            if (value) {
                interfaceC1041760dDS.LIZ(0, "context is null");
                return;
            }
            return;
        }
        try {
            boolean zOptBoolean = jSONObject.optBoolean("toOpen");
            boolean zLIZJ = C824390WVp.LIZJ(actContext);
            if (!zLIZJ && zOptBoolean) {
                for (Context baseContext = actContext; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    activityLIZ = C1388190mED.LIZ(baseContext);
                    if (activityLIZ == null) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            break;
                        }
                    } else {
                        context = activityLIZ;
                        break;
                    }
                }
                activityLIZ = null;
                context = actContext;
                try {
                    C824390WVp.LIZLLL(context);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Intent intent = new Intent("android.settings.SETTINGS");
                    if (activityLIZ == null) {
                        intent.addFlags(268435456);
                    }
                    try {
                        if (activityLIZ != null) {
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, activityLIZ);
                            C2204961BRm.LJIILLIIL(activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR1UukzWyx2aeVteIvsL88/KUEHWaW3", null));
                        } else {
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(actContext, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, actContext);
                            C2204961BRm.LJJJJJL(actContext, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR1UukzWyx2aeVteIvsL88/KUEHWaW3", null));
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
            if (zLIZJ) {
                interfaceC1041760dDS.onSuccess("");
            } else {
                interfaceC1041760dDS.LIZ(0, "");
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            if (value) {
                if (e3.getMessage() != null) {
                    message = e3.getMessage();
                } else {
                    message = "unknown error";
                }
                interfaceC1041760dDS.LIZ(0, message);
            }
        }
    }
}
