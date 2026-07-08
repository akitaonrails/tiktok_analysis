package com.ss.ttlivestreamer.core.transport;

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
    public final List<X509Certificate> mCertificateChain;
    public final boolean mIsIssuedByKnownRoot;
    public final int mStatus;

    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.mCertificateChain.size()][];
        for (int i = 0; i < this.mCertificateChain.size(); i++) {
            try {
                bArr[i] = ((Certificate) ListProtector.get(this.mCertificateChain, i)).getEncoded();
            } catch (CertificateEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                return new byte[0][];
            }
        }
        return bArr;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public boolean isIssuedByKnownRoot() {
        return this.mIsIssuedByKnownRoot;
    }

    public AndroidCertVerifyResult(int i) {
        this.mStatus = i;
        this.mCertificateChain = Collections.emptyList();
    }

    public AndroidCertVerifyResult(int i, boolean z, List<X509Certificate> list) {
        this.mStatus = i;
        this.mIsIssuedByKnownRoot = z;
        this.mCertificateChain = new ArrayList(list);
    }
}
