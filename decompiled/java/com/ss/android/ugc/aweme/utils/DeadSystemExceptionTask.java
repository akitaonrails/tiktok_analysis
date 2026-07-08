package com.ss.android.ugc.aweme.utils;

import X.AnonymousClass0835;
import X.AnonymousClass0839;
import X.AnonymousClass0892;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1961307mF;
import X.C1962907mV;
import X.C1963207mY;
import X.C20596085a;
import X.C2188811AlT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public class DeadSystemExceptionTask implements C0CCZ, InterfaceC799590VYf {
    public static final DeadSystemExceptionTask LL = new DeadSystemExceptionTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DeadSystemExceptionTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context != null && (context instanceof Application)) {
            AnonymousClass0835 anonymousClass0835 = new AnonymousClass0835() { // from class: X.083C
                static {
                    AnonymousClass0835.LIZJ("getDisplayInfo", new AnonymousClass0838(0) { // from class: X.083B
                        @Override // X.AnonymousClass0838
                        public final Object LIZIZ(Object obj, Method method, Object[] objArr) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(method.getName());
                            sbLIZ.append(" is called!");
                            AnonymousClass0892.LIZ("IDisplayManagerProxy", C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    });
                }
            };
            try {
                Class<?> cls = Class.forName("android.hardware.display.DisplayManagerGlobal");
                Object obj = C1962907mV.LIZ(cls, "sInstance").get(null);
                Field fieldLIZ = C1962907mV.LIZ(cls, "mDm");
                Object obj2 = fieldLIZ.get(obj);
                anonymousClass0835.LLILZ = true;
                anonymousClass0835.LLILLJJLI = obj2;
                fieldLIZ.set(obj, C1961307mF.LIZ(obj2, anonymousClass0835));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mDm is ");
                sbLIZ.append(fieldLIZ.get(obj).getClass().getName());
                AnonymousClass0892.LIZ("IDisplayManagerProxy", C2188811AlT.LIZIZ(sbLIZ));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C20596085a c20596085a = new C20596085a();
                Application application = (Application) context;
                try {
                    Field fieldLIZ2 = C1963207mY.LIZ(View.class);
                    c20596085a.LL = fieldLIZ2;
                    if (fieldLIZ2 != null) {
                        fieldLIZ2.setAccessible(true);
                        application.registerActivityLifecycleCallbacks(c20596085a);
                        AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "Hook success ");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                new AnonymousClass0839().LIZLLL();
            }
            Npth.addAttachUserData(new AttachUserData() { // from class: X.085S
                @Override // com.bytedance.crash.AttachUserData
                public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                    HashMap map = new HashMap();
                    map.put("abtest/settings", C08FQ.LIZ());
                    return map;
                }
            }, CrashType.ALL);
        }
    }
}
