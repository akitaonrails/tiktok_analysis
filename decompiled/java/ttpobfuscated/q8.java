package ttpobfuscated;

import X.C098200Yq;
import X.C189200o6;
import X.C786410Ut5;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Locale;
import ttpobfuscated.b0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class q8 implements b0 {
    public final KeyStore a;

    public q8(KeyStore keyStore) {
        this.a = keyStore;
    }

    @Override // ttpobfuscated.b0
    public Certificate a(re reVar, int i) throws Throwable {
        Object c098200Yq;
        try {
            c098200Yq = this.a.getCertificate(a(i, reVar));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (c098200Yq != null) {
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return (Certificate) c098200Yq;
            }
            q3.a aVar = q3.a;
            String str = r8.a;
            aVar.getClass();
            q3.a.c.b("Get keystore certificate failure ", str, thM5exceptionOrNullimpl);
            if (!(thM5exceptionOrNullimpl instanceof b0.a.c)) {
                throw new b0.a.c(thM5exceptionOrNullimpl);
            }
            throw thM5exceptionOrNullimpl;
        }
        throw new b0.a.c(new KeyStoreException("Certificate not found"));
    }

    @Override // ttpobfuscated.b0
    public boolean b(re reVar, int i) throws b0.a.b {
        Object c098200Yq;
        try {
            String strA = a(i, reVar);
            boolean zIsCertificateEntry = this.a.isCertificateEntry(strA);
            this.a.deleteEntry(strA);
            c098200Yq = Boolean.valueOf(zIsCertificateEntry);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            return ((Boolean) c098200Yq).booleanValue();
        }
        q3.a aVar = q3.a;
        String str = r8.a;
        aVar.getClass();
        q3.a.c.b("Delete keystore certificate failure", str, thM5exceptionOrNullimpl);
        throw new b0.a.b(thM5exceptionOrNullimpl);
    }

    public final String a(int i, re reVar) {
        return C786410Ut5.j4("ttp.orbu.%s-%s", Arrays.copyOf(new Object[]{reVar.b().toLowerCase(Locale.ROOT), String.valueOf(i)}, 2));
    }

    @Override // ttpobfuscated.b0
    public Certificate a(String str, re reVar, int i) throws b0.a.C0043a {
        Object obj;
        try {
            String strA = a(i, reVar);
            if (this.a.isCertificateEntry(strA)) {
                this.a.deleteEntry(strA);
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(Base64.decode(str, 2)));
            this.a.setCertificateEntry(strA, certificateGenerateCertificate);
            C189200o6.m2constructorimpl(certificateGenerateCertificate);
            obj = certificateGenerateCertificate;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            return (Certificate) obj;
        }
        q3.a aVar = q3.a;
        String str2 = r8.a;
        aVar.getClass();
        q3.a.c.b("Add keystore certificate failure", str2, thM5exceptionOrNullimpl);
        throw new b0.a.C0043a(thM5exceptionOrNullimpl);
    }
}
