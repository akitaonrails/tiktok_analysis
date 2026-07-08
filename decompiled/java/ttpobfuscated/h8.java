package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.configuration.model.UnhandledReturnStrategy;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttpobfuscated.m8;
import ttpobfuscated.q3;
import ttpobfuscated.t1;

/* JADX INFO: loaded from: classes24.dex */
public final class h8 implements t1 {
    public static final a a = new a();

    public static final class a {
    }

    public final UnhandledReturnStrategy a(JSONObject jSONObject) throws k8 {
        OrbuResult orbuResult;
        JSONObject jSONObjectE = j8.e(jSONObject, "strategy");
        String strG = j8.g(jSONObjectE, "result");
        if (kotlin.text.u.LJIJI(strG, "allow", true)) {
            orbuResult = OrbuResult.a.a;
        } else if (kotlin.text.u.LJIJI(strG, "deny", true)) {
            orbuResult = OrbuResult.d.a;
        } else {
            throw j8.a("result", strG);
        }
        return new UnhandledReturnStrategy(orbuResult, j8.a(jSONObjectE, "report"));
    }

    public final ConfigType.OrbuCode b(JSONObject jSONObject) throws k8 {
        ConfigType.OrbuCode orbuCode;
        String strG = j8.g(jSONObject, "type");
        ConfigType configTypeFromType = ConfigType.Companion.fromType(strG);
        if ((configTypeFromType instanceof ConfigType.OrbuCode) && (orbuCode = (ConfigType.OrbuCode) configTypeFromType) != null) {
            return orbuCode;
        }
        throw j8.a("type", strG);
    }

    @Override // ttpobfuscated.t1
    public Object a(String str, InterfaceC1364105Vn<? super OrbuCodeConfig> interfaceC1364105Vn) throws t1.a.C0073a {
        Object c098200Yq;
        k8 k8Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            c098200Yq = new OrbuCodeConfig(j8.c(jSONObject, "version"), b(jSONObject), j8.g(jSONObject, "content"), j8.g(jSONObject, "orbuHash"), a(jSONObject), j8.c(jSONObject, "samplingBufferSize"));
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
        if (thM5exceptionOrNullimpl instanceof k8) {
            k8Var = (k8) thM5exceptionOrNullimpl;
        } else {
            k8Var = new k8(m8.b.b);
        }
        q3.a aVar = q3.a;
        String message = thM5exceptionOrNullimpl.getMessage();
        String str2 = i8.a;
        aVar.getClass();
        q3.a.c.b(message, str2, thM5exceptionOrNullimpl);
        throw new t1.a.C0073a(k8Var, ConfigType.OrbuCode.INSTANCE);
    }
}
