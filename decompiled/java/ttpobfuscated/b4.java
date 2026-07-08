package ttpobfuscated;

import X.C13LP;
import X.C1697810uHb;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.Signature;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class b4 {
    public static final b4 a = new b4();

    public final List<String> a(String str) {
        return C13LP.LJJJJI(C1697810uHb.LJIIJJI(str, "SHA256withECDSA", "SHA512withECDSA"));
    }

    public final boolean a(byte[] bArr, byte[] bArr2, String str, Function1<? super Signature, Unit> function1) throws Throwable {
        Signature signature;
        Iterator<String> it2 = a(str).iterator();
        Throwable th = null;
        while (it2.hasNext()) {
            try {
                signature = Signature.getInstance(it2.next());
                function1.invoke(signature);
                signature.update(bArr);
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
            }
            if (signature.verify(bArr2)) {
                return true;
            }
        }
        if (th == null) {
            return false;
        }
        throw th;
    }
}
