package ttpobfuscated;

import X.C098200Yq;
import X.C13LE;
import X.C189200o6;
import X.InterfaceC1364105Vn;
import android.util.Base64;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;
import ttpobfuscated.q3;
import ttpobfuscated.r5;

/* JADX INFO: loaded from: classes24.dex */
public final class e8 implements r5 {
    public static final a b = new a();
    public final String a = C13LE.LIZ(e8.class).LJI();

    public static final class a {
    }

    public final Map<String, p5> a(JSONObject jSONObject) throws k8, r5.a.C0069a {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayD = j8.d(jSONObject, "files");
        int length = jSONArrayD.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayD, i);
            p5 p5Var = new p5(j8.g(jSONObject2, "filePath"), j8.g(jSONObject2, "fileHash"), j8.f(jSONObject2, "fileSize"));
            if (!linkedHashMap.containsKey(p5Var.a)) {
                linkedHashMap.put(p5Var.a, p5Var);
            } else {
                throw new r5.a.C0069a(GeckoValidationError.DirectoryContentsDoNotMatch);
            }
        }
        return linkedHashMap;
    }

    public final String b(JSONObject jSONObject) {
        return j8.g(jSONObject, "packageType");
    }

    public final int c(JSONObject jSONObject) throws k8, r5.a.C0069a {
        int iC = j8.c(jSONObject, "version");
        if (iC > 0) {
            return iC;
        }
        throw new r5.a.C0069a(GeckoValidationError.InvalidManifest);
    }

    @Override // ttpobfuscated.r5
    public Object a(String str, InterfaceC1364105Vn<? super q5> interfaceC1364105Vn) throws Throwable {
        Object c098200Yq;
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 2), Charsets.UTF_8));
            c098200Yq = new q5(c(jSONObject), j8.g(jSONObject, "packageType"), a(jSONObject));
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
        String message = thM5exceptionOrNullimpl.getMessage();
        String str2 = this.a;
        aVar.getClass();
        q3.a.c.b(message, str2, thM5exceptionOrNullimpl);
        if (!(thM5exceptionOrNullimpl instanceof r5.a)) {
            if (!(thM5exceptionOrNullimpl instanceof IllegalArgumentException) && !(thM5exceptionOrNullimpl instanceof k8)) {
                throw new r5.a.C0069a(GeckoValidationError.UnableToBuildManifest);
            }
            throw new r5.a.C0069a(GeckoValidationError.UnableToBuildManifest);
        }
        throw thM5exceptionOrNullimpl;
    }
}
