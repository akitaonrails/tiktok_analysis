package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import X.C1954807lC;
import X.InterfaceC1364105Vn;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.Signature;
import java.security.cert.Certificate;
import kotlin.text.Charsets;
import ttpobfuscated.c0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class d0 implements c0 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[re.values().length];
            try {
                iArr[re.CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[re.GECKO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            a = iArr;
        }
    }

    public final String a(re reVar) {
        int i = a.a[reVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "SHA256withECDSA";
            }
            throw new C1954807lC();
        }
        return "SHA512withECDSA";
    }

    @Override // ttpobfuscated.c0
    public Object a(String str, String str2, Certificate certificate, re reVar, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) throws c0.a.C0046a {
        Object c098200Yq;
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            byte[] bArrDecode = Base64.decode(str2, 2);
            Signature signature = Signature.getInstance(a(reVar));
            signature.initVerify(certificate);
            signature.update(bytes);
            c098200Yq = Boolean.valueOf(signature.verify(bArrDecode));
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
        String str3 = e0.a;
        aVar.getClass();
        q3.a.c.b("Verify signature from certificate using ec algorithm failed", str3, thM5exceptionOrNullimpl);
        throw new c0.a.C0046a(thM5exceptionOrNullimpl);
    }
}
