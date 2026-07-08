package com.ttnet.org.chromium.net;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class AndroidCertVerifyResult {
    public final int LIZ;
    public final boolean LIZIZ;
    public final List<X509Certificate> LIZJ;

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.LIZJ.size()][];
        for (int i = 0; i < this.LIZJ.size(); i++) {
            try {
                bArr[i] = ((Certificate) ListProtector.get(this.LIZJ, i)).getEncoded();
            } catch (CertificateEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                return new byte[0][];
            }
        }
        return bArr;
    }

    public int getStatus() {
        return this.LIZ;
    }

    public boolean isIssuedByKnownRoot() {
        return this.LIZIZ;
    }

    public AndroidCertVerifyResult(int i) {
        this.LIZ = i;
        this.LIZJ = Collections.emptyList();
    }

    public AndroidCertVerifyResult(boolean z, List list) {
        this.LIZ = 0;
        this.LIZIZ = z;
        this.LIZJ = new ArrayList(list);
    }
}
