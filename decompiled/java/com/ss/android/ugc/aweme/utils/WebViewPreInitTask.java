package com.ss.android.ugc.aweme.utils;

import X.AnonymousClass0716;
import X.C08Q7;
import X.C0CCZ;
import X.C0VZ0;
import X.C0WZX;
import X.C1BWL;
import X.C2109608Og;
import X.C2204961BRm;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public class WebViewPreInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "WebViewPreInitTask";
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
        return ((Boolean) AnonymousClass0716.LIZLLL.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Method method;
        try {
            SystemClock.elapsedRealtime();
            Class<?> cls = Class.forName("android.webkit.WebViewFactory");
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    method = declaredMethods[i];
                    if (TextUtils.equals(method.getName(), "getProvider")) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    method = null;
                    break;
                }
            }
            method.setAccessible(true);
            C2204961BRm.a0(method, cls, new Object[0], new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkgXq2c4wLsmkHlUbysLDsFa9WQ==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi(IPluginService.class);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            iPluginService.LIZLLL().getClass();
            if (Boolean.valueOf(C2109608Og.LIZJ()).booleanValue()) {
                return;
            }
        }
        try {
            C08Q7.LIZ(C1BWL.LIZ());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}
