package ttpobfuscated;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class a4 implements oe {
    public static final a a = new a();

    public static final class a {
    }

    @Override // ttpobfuscated.oe
    public boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        Signature signature;
        Iterator<String> it2 = b4.a.a("SHA512withECDSA").iterator();
        Throwable th = null;
        while (it2.hasNext()) {
            try {
                signature = Signature.getInstance(it2.next());
                signature.initVerify(publicKey);
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

    @Override // ttpobfuscated.oe
    public boolean a(byte[] bArr, byte[] bArr2, Certificate certificate) throws Throwable {
        Signature signature;
        Iterator<String> it2 = b4.a.a("SHA512withECDSA").iterator();
        Throwable th = null;
        while (it2.hasNext()) {
            try {
                signature = Signature.getInstance(it2.next());
                signature.initVerify(certificate);
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
