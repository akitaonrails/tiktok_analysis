package ttpobfuscated;

import X.C098200Yq;
import X.C0VSJ;
import X.C0VSP;
import X.C13LE;
import X.C189200o6;
import X.C2106208My;
import X.C2107108Nh;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.text.Charsets;
import org.json.JSONException;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;
import ttpobfuscated.n5;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class u4 implements n5 {
    public final String a = C13LE.LIZ(u4.class).LJI();

    @Override // ttpobfuscated.n5
    public Object a(String str, InterfaceC1364105Vn<? super se> interfaceC1364105Vn) throws Throwable {
        Object obj;
        try {
            C0VSJ c0vsj = new C0VSJ(str + File.separator + "manifest-sandbox-signed.json");
            if (c0vsj.exists() && c0vsj.isFile()) {
                C0VSP c0vsp = new C0VSP(c0vsj);
                try {
                    String str2 = new String(C2106208My.LIZIZ(c0vsp), Charsets.UTF_8);
                    C2107108Nh.LIZ(c0vsp, null);
                    se seVarA = se.g.a(str2);
                    if (seVarA.m() == re.GECKO) {
                        C189200o6.m2constructorimpl(seVarA);
                        obj = seVarA;
                    } else {
                        throw new n5.a.C0063a(GeckoValidationError.InvalidManifest);
                    }
                } finally {
                }
            } else {
                throw new n5.a.C0063a(GeckoValidationError.PathDoesNotExist);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return obj;
        }
        q3.a aVar = q3.a;
        StringBuilder sb = new StringBuilder("Error while getting Manifest from path:");
        sb.append(str);
        sb.append(' ');
        String message = thM5exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "";
        }
        sb.append(message);
        String string = sb.toString();
        String str3 = this.a;
        aVar.getClass();
        q3.a.c.b(string, str3, thM5exceptionOrNullimpl);
        if (!(thM5exceptionOrNullimpl instanceof n5.a)) {
            if (!(thM5exceptionOrNullimpl instanceof FileNotFoundException) && !(thM5exceptionOrNullimpl instanceof NullPointerException)) {
                if (!(thM5exceptionOrNullimpl instanceof IllegalArgumentException) && !(thM5exceptionOrNullimpl instanceof JSONException)) {
                    if (!(thM5exceptionOrNullimpl instanceof IOException) && !(thM5exceptionOrNullimpl instanceof SecurityException) && !(thM5exceptionOrNullimpl instanceof UnsupportedOperationException)) {
                        throw new n5.a.C0063a(GeckoValidationError.InvalidManifest);
                    }
                    throw new n5.a.C0063a(GeckoValidationError.InvalidManifest);
                }
                throw new n5.a.C0063a(GeckoValidationError.UnableToBuildManifest);
            }
            throw new n5.a.C0063a(GeckoValidationError.PathDoesNotExist);
        }
        throw thM5exceptionOrNullimpl;
    }
}
