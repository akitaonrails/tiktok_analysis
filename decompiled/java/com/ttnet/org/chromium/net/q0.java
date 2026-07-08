package com.ttnet.org.chromium.net;

import J.N;
import X.C08VH;
import X.C0VSJ;
import X.C2188811AlT;
import X.C2277481ECk;
import X.C787230UuP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.q0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes36.dex */
public class q0 {
    public static CertificateFactory LIZ;
    public static X509TrustManagerExtensions LIZIZ;
    public static C2277481ECk LIZJ;
    public static X509TrustManagerExtensions LIZLLL;
    public static KeyStore LJ;
    public static KeyStore LJFF;
    public static C0VSJ LJI;
    public static Set<Pair<X500Principal, PublicKey>> LJII;
    public static boolean LJIIIIZZ;
    public static final Object LJIIIZ = new Object();
    public static final char[] LJIIJ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void LIZJ() {
        synchronized (LJIIIZ) {
            try {
                LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.1ECk] */
    public static void LIZLLL() throws NoSuchAlgorithmException, KeyStoreException, CertificateException {
        if (LIZ == null) {
            LIZ = CertificateFactory.getInstance("X.509");
        }
        if (LIZIZ == null) {
            LIZIZ = LIZIZ(null);
        }
        if (!LJIIIIZZ) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                LJFF = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                LJI = new C0VSJ(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            LJIIIIZZ = true;
        }
        if (LJII == null) {
            LJII = new HashSet();
        }
        if (LJ == null) {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            LJ = keyStore2;
            try {
                keyStore2.load(null);
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        if (LIZLLL == null) {
            LIZLLL = LIZIZ(LJ);
        }
        if (LIZJ == null) {
            LIZJ = new BroadcastReceiver() { // from class: X.1ECk
                public static void LIZ(Intent intent) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                            return;
                        }
                    } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                        return;
                    }
                    try {
                        q0.LJFF();
                    } catch (KeyStoreException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C08VH.LIZ("Unable to reload the default TrustManager", e4);
                    } catch (NoSuchAlgorithmException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        C08VH.LIZ("Unable to reload the default TrustManager", e5);
                    } catch (CertificateException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                        C08VH.LIZ("Unable to reload the default TrustManager", e6);
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(intent);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            C787230UuP.LIZ(C787230UuP.LIZ, LIZJ, intentFilter);
        }
    }

    public static void LJFF() {
        synchronized (LJIIIZ) {
            try {
                LIZIZ = null;
                LJII = null;
                LIZLLL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        N.MzV1TXLS();
    }

    public static X509Certificate LIZ(byte[] bArr) {
        LIZJ();
        return (X509Certificate) LIZ.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static X509TrustManagerExtensions LIZIZ(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                        String name = trustManager.getClass().getName();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error creating trust manager (");
                        sbLIZ.append(name);
                        sbLIZ.append("): ");
                        sbLIZ.append(e);
                        C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                    }
                }
            }
            C08VH.LIZ("Could not find suitable trust manager", new Object[0]);
            return null;
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C08VH.LIZ("TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e2);
            throw new KeyStoreException(e2);
        }
    }

    public static boolean LJ(X509Certificate x509Certificate) throws KeyStoreException {
        if (LJFF == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (((HashSet) LJII).contains(pair)) {
            return true;
        }
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
        char[] cArr = new char[8];
        int i = 0;
        do {
            int i2 = i * 2;
            char[] cArr2 = LJIIJ;
            byte b = bArrDigest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
            i++;
        } while (i < 4);
        String str = new String(cArr);
        int i3 = 0;
        while (true) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('.');
            sbLIZ.append(i3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!new C0VSJ(LJI, strLIZIZ).exists()) {
                return false;
            }
            KeyStore keyStore = LJFF;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("system:");
            sbLIZ2.append(strLIZIZ);
            Certificate certificate = keyStore.getCertificate(C2188811AlT.LIZIZ(sbLIZ2));
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    String name = certificate.getClass().getName();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Anchor ");
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(" not an X509Certificate: ");
                    sbLIZ3.append(name);
                    C08VH.LIZ(C2188811AlT.LIZIZ(sbLIZ3), new Object[0]);
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        ((HashSet) LJII).add(pair);
                        return true;
                    }
                }
            }
            i3++;
        }
    }

    public static boolean LJI(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static AndroidCertVerifyResult LJII(byte[][] bArr, String str, String str2) {
        List<X509Certificate> listCheckServerTrusted;
        if (bArr != null && bArr.length != 0) {
            boolean zLJ = false;
            if (bArr[0] != null) {
                try {
                    LIZJ();
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(LIZ(bArr[0]));
                        for (int i = 1; i < bArr.length; i++) {
                            try {
                                arrayList.add(LIZ(bArr[i]));
                            } catch (CertificateException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("intermediate ");
                                sbLIZ.append(i);
                                sbLIZ.append(" failed parsing");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                Object[] objArr = new Object[0];
                                C08VH.LIZIZ(strLIZIZ, C08VH.LIZJ(objArr), objArr);
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!LJI(x509CertificateArr[0])) {
                                return new AndroidCertVerifyResult(-6);
                            }
                            synchronized (LJIIIZ) {
                                try {
                                    X509TrustManagerExtensions x509TrustManagerExtensions = LIZIZ;
                                    try {
                                    } catch (CertificateException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        try {
                                            try {
                                                listCheckServerTrusted = LIZLLL.checkServerTrusted(x509CertificateArr, str, str2);
                                            } catch (RuntimeException e3) {
                                                TryCatchGuardChecker.doCheck(e3);
                                                C08VH.LIZ("checkServerTrusted() unexpectedly threw: %s", e3);
                                                throw new CertificateException(e3);
                                            }
                                        } catch (CertificateException e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("Failed to validate the certificate chain, error: ");
                                            sbLIZ2.append(e2.getMessage());
                                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                            Object[] objArr2 = new Object[0];
                                            C08VH.LIZIZ(strLIZIZ2, C08VH.LIZJ(objArr2), objArr2);
                                            return new AndroidCertVerifyResult(-2);
                                        }
                                    }
                                    if (x509TrustManagerExtensions == null) {
                                        return new AndroidCertVerifyResult(-1);
                                    }
                                    try {
                                        listCheckServerTrusted = x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
                                        if (listCheckServerTrusted.size() > 0) {
                                            zLJ = LJ(listCheckServerTrusted.get(listCheckServerTrusted.size() - 1));
                                        }
                                        return new AndroidCertVerifyResult(zLJ, listCheckServerTrusted);
                                    } catch (RuntimeException e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                        C08VH.LIZ("checkServerTrusted() unexpectedly threw: %s", e5);
                                        throw new CertificateException(e5);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } catch (CertificateExpiredException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            return new AndroidCertVerifyResult(-3);
                        } catch (CertificateNotYetValidException e7) {
                            TryCatchGuardChecker.doCheck(e7);
                            return new AndroidCertVerifyResult(-4);
                        } catch (CertificateException e8) {
                            TryCatchGuardChecker.doCheck(e8);
                            return new AndroidCertVerifyResult(-1);
                        }
                    } catch (CertificateException e9) {
                        TryCatchGuardChecker.doCheck(e9);
                        return new AndroidCertVerifyResult(-5);
                    }
                } catch (CertificateException e10) {
                    TryCatchGuardChecker.doCheck(e10);
                    return new AndroidCertVerifyResult(-1);
                }
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=");
        sbLIZ3.append(Arrays.deepToString(bArr));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
