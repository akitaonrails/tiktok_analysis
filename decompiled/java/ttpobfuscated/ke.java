package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttpobfuscated.d1;
import ttpobfuscated.q3;
import ttpobfuscated.se;

/* JADX INFO: loaded from: classes24.dex */
public final class ke implements d1 {
    public final SharedPreferences a;
    public final Function0<String> b;
    public final String c = C13LE.LIZ(ke.class).LJI();

    public ke(SharedPreferences sharedPreferences, Function0<String> function0) {
        this.a = sharedPreferences;
        this.b = function0;
    }

    @Override // ttpobfuscated.d1
    public Object a(ConfigType configType, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) throws d1.a.c {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(this.a.contains(le.a(configType, this.b.invoke())));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return c098200Yq;
        }
        q3.a aVar = q3.a;
        String str = "Error while validating config existence: " + configType.getType();
        String str2 = this.c;
        aVar.getClass();
        q3.a.c.b(str, str2, thM5exceptionOrNullimpl);
        throw new d1.a.c(thM5exceptionOrNullimpl, configType);
    }

    @Override // ttpobfuscated.d1
    public Object b(ConfigType configType, InterfaceC1364105Vn<? super se> interfaceC1364105Vn) throws d1.a.b {
        Object c098200Yq;
        String str;
        String string;
        se.a aVar;
        try {
            q3.b.a(q3.a, "Try to get config:" + configType + " in sharedPrefs; experimentGroup: " + this.b.invoke(), this.c, (Throwable) null, 4, (Object) null);
            string = this.a.getString(le.a(configType, this.b.invoke()), null);
            aVar = se.g;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (string != null) {
            c098200Yq = aVar.a(string);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return c098200Yq;
            }
            if (!(thM5exceptionOrNullimpl instanceof NullPointerException)) {
                if (thM5exceptionOrNullimpl instanceof JSONException) {
                    str = "Error while parsing local artefact for type: " + configType.getType();
                } else {
                    str = "Error while reading local artefact for type:  " + configType.getType();
                }
            } else {
                str = "No stored configuration for type: " + configType.getType();
            }
            q3.a aVar2 = q3.a;
            String str2 = this.c;
            aVar2.getClass();
            q3.a.c.b(str, str2, thM5exceptionOrNullimpl);
            throw new d1.a.b(thM5exceptionOrNullimpl, configType);
        }
        throw new NullPointerException();
    }

    @Override // ttpobfuscated.d1
    public Object c(ConfigType configType, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws d1.a.C0050a {
        Object c098200Yq;
        try {
            this.a.edit().remove(le.a(configType, this.b.invoke())).apply();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str = "Error while deleting for artefact type: " + configType.getType();
        String str2 = this.c;
        aVar.getClass();
        q3.a.c.b(str, str2, thM5exceptionOrNullimpl);
        throw new d1.a.C0050a(thM5exceptionOrNullimpl, configType);
    }

    @Override // ttpobfuscated.d1
    public Object a(se seVar, ConfigType configType, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws d1.a.d {
        Object c098200Yq;
        try {
            q3.b.a(q3.a, "Try to set config:" + configType + " in sharedPrefs", this.c, (Throwable) null, 4, (Object) null);
            this.a.edit().putString(le.a(configType, this.b.invoke()), seVar.b()).apply();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return Unit.LIZ;
        }
        q3.a aVar = q3.a;
        String str = "Error while persisting artefact for type: " + configType.getType();
        String str2 = this.c;
        aVar.getClass();
        q3.a.c.b(str, str2, thM5exceptionOrNullimpl);
        throw new d1.a.d(thM5exceptionOrNullimpl, configType);
    }
}
