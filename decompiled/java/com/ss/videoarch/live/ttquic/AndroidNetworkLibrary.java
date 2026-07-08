package com.ss.videoarch.live.ttquic;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes36.dex */
public class AndroidNetworkLibrary {
    public static final Set<String> sAutoDohDotServers;
    public static final Set<InetAddress> sAutoDohServers;
    public static Boolean sHaveAccessNetworkState;
    public static Boolean sHaveAccessWifiState;

    public static boolean haveOnlyLoopbackAddresses() {
        return false;
    }

    static {
        HashSet hashSet = new HashSet();
        sAutoDohServers = hashSet;
        HashSet hashSet2 = new HashSet();
        sAutoDohDotServers = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            hashSet2.add("dns.google");
            hashSet2.add("1dot1dot1dot1.cloudflare-dns.com");
            hashSet2.add("cloudflare-dns.com");
            hashSet2.add("dns.quad9.net");
        } catch (UnknownHostException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Failed to parse IP addresses", e);
        }
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("foo.");
        sbLIZ.append(str);
        return URLConnection.guessContentTypeFromName(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (KeyStoreException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (NoSuchAlgorithmException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        }
    }
}
