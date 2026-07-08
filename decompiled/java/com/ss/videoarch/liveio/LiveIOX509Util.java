package com.ss.videoarch.liveio;

import X.C0VSJ;
import X.C1476650oWt;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.File;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes36.dex */
public class LiveIOX509Util {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static CertificateFactory sCertificateFactory;
    public static X509TrustManagerImplementation sDefaultTrustManager;
    public static boolean sDisableNativeCodeForTest;
    public static boolean sLoadedSystemKeyStore;
    public static File sSystemCertificateDirectory;
    public static KeyStore sSystemKeyStore;
    public static Set<Pair<X500Principal, PublicKey>> sSystemTrustAnchorCache;
    public static KeyStore sTestKeyStore;
    public static X509TrustManagerImplementation sTestTrustManager;
    public static TrustStorageListener sTrustStorageListener;
    public static final Object sLock = new Object();
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public interface X509TrustManagerImplementation {
        List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    public static native void nativeNotifyKeyChainChanged();

    public static void ensureInitialized() {
        synchronized (sLock) {
            try {
                ensureInitializedLocked();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void ensureInitializedLocked() throws Exception {
        if (sCertificateFactory == null) {
            sCertificateFactory = CertificateFactory.getInstance("X.509");
        }
        if (sDefaultTrustManager == null) {
            sDefaultTrustManager = createTrustManager(null);
        }
        if (!sLoadedSystemKeyStore) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                sSystemKeyStore = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                sSystemCertificateDirectory = new C0VSJ(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            sLoadedSystemKeyStore = true;
        }
        if (sSystemTrustAnchorCache == null) {
            sSystemTrustAnchorCache = new HashSet();
        }
        if (sTestKeyStore == null) {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            sTestKeyStore = keyStore2;
            try {
                keyStore2.load(null);
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        if (sTestTrustManager == null) {
            sTestTrustManager = createTrustManager(sTestKeyStore);
        }
        if (sTrustStorageListener == null) {
            sTrustStorageListener = new TrustStorageListener();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            C786410Ut5.LJIJJ(C1476650oWt.LJ, sTrustStorageListener, intentFilter);
        }
    }

    public static void reloadDefaultTrustManager() {
        synchronized (sLock) {
            try {
                sDefaultTrustManager = null;
                sSystemTrustAnchorCache = null;
                ensureInitializedLocked();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void reloadTestTrustManager() {
        sTestTrustManager = createTrustManager(sTestKeyStore);
    }

    public static void clearTestRootCertificates() {
        ensureInitialized();
        synchronized (sLock) {
            try {
                try {
                    sTestKeyStore.load(null);
                    reloadTestTrustManager();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final class TrustStorageListener extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
        }

        public TrustStorageListener() {
        }

        public void com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener__onReceive$___twin___(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                    return;
                }
            } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                return;
            }
            try {
                LiveIOX509Util.reloadDefaultTrustManager();
            } catch (KeyStoreException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchAlgorithmException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (CertificateException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }

        public static void com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(TrustStorageListener trustStorageListener, Context context, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                trustStorageListener.com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener__onReceive$___twin___(context, intent);
            } else {
                C2408409cA.LIZ();
                trustStorageListener.com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener__onReceive$___twin___(context, intent);
            }
        }

        public static void com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(TrustStorageListener trustStorageListener, Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            com_ss_videoarch_liveio_LiveIOX509Util$TrustStorageListener_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(trustStorageListener, context, intent);
        }
    }

    public static final class X509TrustManagerIceCreamSandwich implements X509TrustManagerImplementation {
        public final X509TrustManager mTrustManager;

        public X509TrustManagerIceCreamSandwich(X509TrustManager x509TrustManager) {
            this.mTrustManager = x509TrustManager;
        }

        @Override // com.ss.videoarch.liveio.LiveIOX509Util.X509TrustManagerImplementation
        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
            this.mTrustManager.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    public static final class X509TrustManagerJellyBean implements X509TrustManagerImplementation {
        public final X509TrustManagerExtensions mTrustManagerExtensions;

        public X509TrustManagerJellyBean(X509TrustManager x509TrustManager) {
            this.mTrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.ss.videoarch.liveio.LiveIOX509Util.X509TrustManagerImplementation
        public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.mTrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        ensureInitialized();
        X509Certificate x509CertificateCreateCertificateFromBytes = createCertificateFromBytes(bArr);
        synchronized (sLock) {
            try {
                KeyStore keyStore = sTestKeyStore;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("root_cert_");
                sbLIZ.append(Integer.toString(sTestKeyStore.size()));
                keyStore.setCertificateEntry(C2188811AlT.LIZIZ(sbLIZ), x509CertificateCreateCertificateFromBytes);
                reloadTestTrustManager();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static X509Certificate createCertificateFromBytes(byte[] bArr) {
        ensureInitialized();
        return (X509Certificate) sCertificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static X509TrustManagerImplementation createTrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    return new X509TrustManagerJellyBean((X509TrustManager) trustManager);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    trustManager.getClass();
                }
            }
        }
        return null;
    }

    public static String hashPrincipal(X500Principal x500Principal) {
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        int i = 0;
        do {
            int i2 = i * 2;
            char[] cArr2 = HEX_DIGITS;
            byte b = bArrDigest[3 - i];
            cArr[i2] = cArr2[(b >> 4) & 15];
            cArr[i2 + 1] = cArr2[b & 15];
            i++;
        } while (i < 4);
        return new String(cArr);
    }

    public static boolean isKnownRoot(X509Certificate x509Certificate) throws KeyStoreException {
        if (sSystemKeyStore == null) {
            return false;
        }
        Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (sSystemTrustAnchorCache.contains(pair)) {
            return true;
        }
        String strHashPrincipal = hashPrincipal(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strHashPrincipal);
            sbLIZ.append('.');
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!new C0VSJ(sSystemCertificateDirectory, strLIZIZ).exists()) {
                return false;
            }
            KeyStore keyStore = sSystemKeyStore;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("system:");
            sbLIZ2.append(strLIZIZ);
            Certificate certificate = keyStore.getCertificate(C2188811AlT.LIZIZ(sbLIZ2));
            if (certificate != null && (certificate instanceof X509Certificate)) {
                X509Certificate x509Certificate2 = (X509Certificate) certificate;
                if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                    sSystemTrustAnchorCache.add(pair);
                    return true;
                }
            }
            i++;
        }
    }

    public static void setDisableNativeCodeForTest(boolean z) {
        sDisableNativeCodeForTest = z;
    }

    public static boolean verifyKeyUsage(X509Certificate x509Certificate) throws CertificateParsingException {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.security.cert.X509Certificate] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.security.cert.X509Certificate] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.videoarch.liveio.LiveIOX509Util$X509TrustManagerImplementation] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.ss.videoarch.liveio.LiveIOX509Util$X509TrustManagerImplementation] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.security.cert.X509Certificate[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.security.cert.X509Certificate[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static LiveIOCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        ?? CheckServerTrusted;
        if (bArr != null && bArr.length != 0) {
            boolean zIsKnownRoot = false;
            if (bArr[0] != null) {
                try {
                    ensureInitialized();
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(createCertificateFromBytes(bArr[0]));
                        for (int i = 1; i < bArr.length; i++) {
                            try {
                                arrayList.add(createCertificateFromBytes(bArr[i]));
                            } catch (CertificateException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        ?? CheckServerTrusted2 = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            CheckServerTrusted2[0].checkValidity();
                            if (!verifyKeyUsage(CheckServerTrusted2[0])) {
                                return new LiveIOCertVerifyResult(-6);
                            }
                            synchronized (sLock) {
                                try {
                                    ?? r0 = sDefaultTrustManager;
                                    if (r0 == 0) {
                                        return new LiveIOCertVerifyResult(-1);
                                    }
                                    try {
                                        CheckServerTrusted2 = r0.checkServerTrusted(CheckServerTrusted2, str, str2);
                                        CheckServerTrusted = CheckServerTrusted2;
                                    } catch (CertificateException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        try {
                                            CheckServerTrusted = sTestTrustManager.checkServerTrusted(CheckServerTrusted2, str, str2);
                                        } catch (CertificateException e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                            return new LiveIOCertVerifyResult(-2);
                                        }
                                    }
                                    if (CheckServerTrusted.size() > 0) {
                                        zIsKnownRoot = isKnownRoot((X509Certificate) CheckServerTrusted.get(CheckServerTrusted.size() - 1));
                                    }
                                    return new LiveIOCertVerifyResult(zIsKnownRoot, CheckServerTrusted);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        } catch (CertificateExpiredException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            return new LiveIOCertVerifyResult(-3);
                        } catch (CertificateNotYetValidException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            return new LiveIOCertVerifyResult(-4);
                        } catch (CertificateException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            return new LiveIOCertVerifyResult(-1);
                        }
                    } catch (CertificateException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                        return new LiveIOCertVerifyResult(-5);
                    }
                } catch (CertificateException e8) {
                    TryCatchGuardChecker.doCheck(e8);
                    return new LiveIOCertVerifyResult(-1);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=");
        sbLIZ.append(Arrays.deepToString(bArr));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
