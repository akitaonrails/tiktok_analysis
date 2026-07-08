package ttpobfuscated;

import X.C098200Yq;
import X.C1284660jXE;
import X.C13LE;
import X.C189200o6;
import X.C1954807lC;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.init.TTPOrbuContext;
import ttpobfuscated.d1;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class w implements d1 {
    public final TTPOrbuContext a;
    public final String b = C13LE.LIZ(w.class).LJI();

    public w(TTPOrbuContext tTPOrbuContext) {
        this.a = tTPOrbuContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // ttpobfuscated.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttp.orbu.sdk.configuration.model.ConfigType r5, X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) throws ttpobfuscated.d1.a.c {
        /*
            r4 = this;
            ttp.orbu.sdk.configuration.model.ConfigType$General r0 = ttp.orbu.sdk.configuration.model.ConfigType.General.INSTANCE     // Catch: java.lang.Throwable -> L4b
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L17
            ttp.orbu.sdk.init.TTPOrbuContext r0 = r4.a     // Catch: java.lang.Throwable -> L4b
            kotlin.jvm.functions.Function0 r0 = r0.getGeneralConfigProvider$ttp_productionRelease()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4b
            goto L2f
        L17:
            ttp.orbu.sdk.configuration.model.ConfigType$OrbuCode r0 = ttp.orbu.sdk.configuration.model.ConfigType.OrbuCode.INSTANCE     // Catch: java.lang.Throwable -> L4b
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L45
            ttp.orbu.sdk.init.TTPOrbuContext r0 = r4.a     // Catch: java.lang.Throwable -> L4b
            kotlin.jvm.functions.Function0 r0 = r0.getOrbuCodeConfigProvider$ttp_productionRelease()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4b
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L3d
        L34:
            boolean r0 = kotlin.text.a0.LJJJIL(r0)     // Catch: java.lang.Throwable -> L4b
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != r1) goto L32
        L3d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L45:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L57:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r3 != 0) goto L5e
            return r1
        L5e:
            ttpobfuscated.q3$a r0 = ttpobfuscated.q3.a
            java.lang.String r2 = r4.b
            r0.getClass()
            ttpobfuscated.q3 r1 = ttpobfuscated.q3.a.c
            java.lang.String r0 = "An error occurred when trying to read value from provider execution"
            r1.b(r0, r2, r3)
            ttpobfuscated.d1$a$c r0 = new ttpobfuscated.d1$a$c
            r0.<init>(r3, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.w.a(ttp.orbu.sdk.configuration.model.ConfigType, X.05Vn):java.lang.Object");
    }

    @Override // ttpobfuscated.d1
    public Object b(ConfigType configType, InterfaceC1364105Vn<? super se> interfaceC1364105Vn) throws d1.a.b {
        Object c098200Yq;
        String str;
        String strInvoke;
        try {
            q3.b.a(q3.a, "Try to get config:" + configType + " in asset folder", this.b, (Throwable) null, 4, (Object) null);
            if (Intrinsics.LJFF(configType, ConfigType.General.INSTANCE)) {
                Function0<String> generalConfigProvider$ttp_productionRelease = this.a.getGeneralConfigProvider$ttp_productionRelease();
                if (generalConfigProvider$ttp_productionRelease != null) {
                    strInvoke = generalConfigProvider$ttp_productionRelease.invoke();
                    if (strInvoke == null) {
                    }
                    c098200Yq = se.g.a(strInvoke);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                strInvoke = "";
                c098200Yq = se.g.a(strInvoke);
                C189200o6.m2constructorimpl(c098200Yq);
            } else if (Intrinsics.LJFF(configType, ConfigType.OrbuCode.INSTANCE)) {
                Function0<String> orbuCodeConfigProvider$ttp_productionRelease = this.a.getOrbuCodeConfigProvider$ttp_productionRelease();
                if (orbuCodeConfigProvider$ttp_productionRelease != null) {
                    strInvoke = orbuCodeConfigProvider$ttp_productionRelease.invoke();
                    if (strInvoke == null) {
                    }
                    c098200Yq = se.g.a(strInvoke);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                strInvoke = "";
                c098200Yq = se.g.a(strInvoke);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                throw new C1954807lC();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        if (!(thM5exceptionOrNullimpl instanceof NullPointerException)) {
            if (thM5exceptionOrNullimpl instanceof JSONException) {
                str = "Error while parsing built-in artefact for type: " + configType.getType();
            } else {
                str = "Error while reading built-in artefact for type:  " + configType.getType();
            }
        } else {
            str = "No built-in asset stored configuration for type: " + configType.getType();
        }
        q3.a aVar = q3.a;
        String str2 = this.b;
        aVar.getClass();
        q3.a.c.b(str, str2, thM5exceptionOrNullimpl);
        throw new d1.a.b(thM5exceptionOrNullimpl, configType);
    }

    @Override // ttpobfuscated.d1
    public Object c(ConfigType configType, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws d1.a.C0050a {
        q3.a aVar = q3.a;
        String str = this.b;
        C1284660jXE c1284660jXE = new C1284660jXE(null, 1, null);
        aVar.getClass();
        q3.a.c.b("No implementation of method delete", str, c1284660jXE);
        throw new d1.a.C0050a(new C1284660jXE(null, 1, null), configType);
    }

    @Override // ttpobfuscated.d1
    public Object a(se seVar, ConfigType configType, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws d1.a.d {
        q3.a aVar = q3.a;
        String str = this.b;
        C1284660jXE c1284660jXE = new C1284660jXE(null, 1, null);
        aVar.getClass();
        q3.a.c.b("No implementation of method set", str, c1284660jXE);
        throw new d1.a.d(new C1284660jXE(null, 1, null), configType);
    }
}
