package com.ttnet.org.chromium.net;

import J.N;
import X.C0WZX;
import X.C1966707n7;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C786420Ut6;
import X.C787230UuP;
import X.C789940Uym;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.RouteInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.chromium.CronetSystemApiSandbox;

/* JADX INFO: loaded from: classes14.dex */
public class AndroidNetworkLibrary {
    public static Boolean LIZ;
    public static Boolean LIZIZ;
    public static Boolean LIZJ;

    public static DnsStatus getCurrentDnsStatus() {
        return LIZIZ(null);
    }

    public static String getWifiSSID() {
        return "";
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                try {
                } catch (SocketException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public static boolean LJ() {
        if (LIZIZ == null) {
            LIZIZ = Boolean.valueOf(LIZLLL(C787230UuP.LIZ, "android.permission.ACCESS_WIFI_STATE"));
        }
        return LIZIZ.booleanValue();
    }

    public static void alwaysUpCellularOnThreadPool() {
        final ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
        if (connectivityManager == null) {
            N.MeYG7FqD(false, 7);
            return;
        }
        try {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() { // from class: X.0W94
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) throws Throwable {
                    NetworkCapabilities networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, network, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
                    if (networkCapabilitiesLJLJL != null && networkCapabilitiesLJLJL.hasTransport(0) && networkCapabilitiesLJLJL.hasCapability(12)) {
                        N.MeYG7FqD(true, -1);
                    } else {
                        N.MeYG7FqD(false, 8);
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            N.MeYG7FqD(false, 9);
        }
    }

    public static boolean checkIsVpnOn() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i = 0; i < allNetworks.length; i++) {
            if (C786410Ut5.z4(connectivityManager, allNetworks[i]).isConnected() && C2204961BRm.LJLJL(connectivityManager, allNetworks[i], new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null)).hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    public static int[] getAllAccessPointChannels() throws Throwable {
        if (LIZJ == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                LIZJ = Boolean.valueOf(LIZLLL(C787230UuP.LIZ, "android.permission.ACCESS_FINE_LOCATION"));
            } else {
                LIZJ = Boolean.valueOf(LIZLLL(C787230UuP.LIZ, "android.permission.ACCESS_COARSE_LOCATION") || LIZLLL(C787230UuP.LIZ, "android.permission.ACCESS_FINE_LOCATION"));
            }
        }
        if (!LIZJ.booleanValue() || !LJ()) {
            return new int[0];
        }
        WifiManager wifiManager = (WifiManager) C786410Ut5.H2(C787230UuP.LIZ, "wifi");
        if (wifiManager == null) {
            return new int[0];
        }
        List listLJZL = C2204961BRm.LJZL(wifiManager, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
        if (listLJZL == null || listLJZL.isEmpty()) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJZL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(LIZ(((ScanResult) it2.next()).frequency)));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Integer) ListProtector.get(arrayList, i)).intValue();
        }
        return iArr;
    }

    public static String[][] getAllRouteInfo() {
        if (LIZ == null) {
            LIZ = Boolean.valueOf(LIZLLL(C787230UuP.LIZ, "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (!LIZ.booleanValue()) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
            if (connectivityManager == null) {
                return null;
            }
            Network[] allNetworks = connectivityManager.getAllNetworks();
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                LinkProperties linkPropertiesLJLJJLL = C2204961BRm.LJLJJLL(connectivityManager, network, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
                if (linkPropertiesLJLJJLL != null) {
                    for (RouteInfo routeInfo : linkPropertiesLJLJJLL.getRoutes()) {
                        String[] strArr = new String[4];
                        if (routeInfo.getDestination() != null) {
                            strArr[0] = C2204961BRm.d0(routeInfo.getDestination().getAddress(), new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
                            strArr[1] = Integer.toString(routeInfo.getDestination().getPrefixLength());
                        }
                        if (routeInfo.getGateway() != null) {
                            strArr[2] = C2204961BRm.d0(routeInfo.getGateway(), new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
                        }
                        strArr[3] = routeInfo.getInterface();
                        arrayList.add(strArr);
                    }
                }
            }
            return (String[][]) arrayList.toArray((String[][]) Array.newInstance((Class<?>) String.class, 0, 0));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilitiesLJLJL;
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, activeNetwork, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null))) == null || !networkCapabilitiesLJLJL.hasCapability(17)) ? false : true;
    }

    public static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    public static WifiInfo LIZJ() throws Exception {
        TransportInfo transportInfo;
        if (!LJ()) {
            Intent intentLJIJJ = C786410Ut5.LJIJJ(C787230UuP.LIZ, null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (intentLJIJJ != null) {
                return (WifiInfo) intentLJIJJ.getParcelableExtra("wifiInfo");
            }
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            WifiManager wifiManager = (WifiManager) C786410Ut5.H2(C787230UuP.LIZ, "wifi");
            if (C786420Ut6.LJIIIZ && !C786420Ut6.LIZ() && C786420Ut6.LJIIJ != null) {
                return C786420Ut6.LJIIJ;
            }
            C786420Ut6.LJIIJ = C2204961BRm.LJZ(wifiManager, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
            return C786420Ut6.LJIIJ;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, network, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
            if (networkCapabilitiesLJLJL != null && networkCapabilitiesLJLJL.hasTransport(1) && (transportInfo = networkCapabilitiesLJLJL.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                return (WifiInfo) transportInfo;
            }
        }
        return null;
    }

    public static void clearTestRootCertificates() {
        q0.LIZJ();
        synchronized (q0.LJIIIZ) {
            try {
                try {
                    q0.LJ.load(null);
                    q0.LIZLLL = q0.LIZIZ(q0.LJ);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static int getCurrentAccessPointChannel() throws Exception {
        C789940Uym.LIZ().getClass();
        if (N.Mhd7DRFo()) {
            CronetSystemApiSandbox cronetSystemApiSandbox = C789940Uym.LIZ().LIZ;
            return LIZ(cronetSystemApiSandbox == null ? 0 : cronetSystemApiSandbox.getWifiFrequency());
        }
        WifiInfo wifiInfoLIZJ = LIZJ();
        if (wifiInfoLIZJ == null) {
            return -1;
        }
        return LIZ(C2204961BRm.LJLLLL(wifiInfoLIZJ, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null)));
    }

    public static int[] getDhcpInfo() {
        DhcpInfo dhcpInfoLJZI;
        C789940Uym.LIZ().getClass();
        if (N.MaSRwBiO()) {
            return new int[0];
        }
        try {
            WifiManager wifiManager = (WifiManager) C786410Ut5.H2(C787230UuP.LIZ, "wifi");
            if (wifiManager != null && (dhcpInfoLJZI = C2204961BRm.LJZI(wifiManager, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null))) != null) {
                return new int[]{dhcpInfoLJZI.ipAddress, dhcpInfoLJZI.gateway};
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new int[0];
    }

    public static String getNetworkOperator() {
        C789940Uym.LIZ().getClass();
        if (N.Mhd7DRFo()) {
            CronetSystemApiSandbox cronetSystemApiSandbox = C789940Uym.LIZ().LIZ;
            return cronetSystemApiSandbox != null ? cronetSystemApiSandbox.getNetworkOperator() : "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C787230UuP.LIZ, "phone");
            return telephonyManager == null ? "" : C2204961BRm.LLIIJLIL(telephonyManager, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static String getSimOperator() {
        C789940Uym.LIZ().getClass();
        if (N.Mhd7DRFo()) {
            CronetSystemApiSandbox cronetSystemApiSandbox = C789940Uym.LIZ().LIZ;
            return cronetSystemApiSandbox != null ? cronetSystemApiSandbox.getSimOperator() : "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C787230UuP.LIZ, "phone");
            return telephonyManager == null ? "" : C2204961BRm.LLIL(telephonyManager, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static int LIZ(int i) {
        if (i == 2484) {
            return 14;
        }
        if (i < 2484) {
            return (i - 2407) / 5;
        }
        if (i >= 4910) {
            if (i <= 4980) {
                return (i - 4000) / 5;
            }
            if (i >= 5925) {
                if (i == 5935) {
                    return 2;
                }
                if (i <= 45000) {
                    return (i - 5950) / 5;
                }
                if (i >= 58320 && i <= 70200) {
                    return (i - 56160) / 2160;
                }
                return -1;
            }
        }
        return (i - 5000) / 5;
    }

    public static DnsStatus LIZIZ(Network network) {
        ConnectivityManager connectivityManager;
        if (LIZ == null) {
            LIZ = Boolean.valueOf(LIZLLL(C787230UuP.LIZ, "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (!LIZ.booleanValue() || (connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity")) == null) {
            return null;
        }
        if (network == null && (network = connectivityManager.getActiveNetwork()) == null) {
            return null;
        }
        try {
            LinkProperties linkPropertiesLJLJJLL = C2204961BRm.LJLJJLL(connectivityManager, network, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
            if (linkPropertiesLJLJJLL == null) {
                return null;
            }
            List listLJLJLJ = C2204961BRm.LJLJLJ(linkPropertiesLJLJJLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
            String domains = linkPropertiesLJLJJLL.getDomains();
            if (Build.VERSION.SDK_INT >= 28) {
                return new DnsStatus(linkPropertiesLJLJJLL.getPrivateDnsServerName(), domains, listLJLJLJ, linkPropertiesLJLJJLL.isPrivateDnsActive());
            }
            return new DnsStatus("", domains, listLJLJLJ, false);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        q0.LIZJ();
        X509Certificate x509CertificateLIZ = q0.LIZ(bArr);
        synchronized (q0.LJIIIZ) {
            try {
                KeyStore keyStore = q0.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("root_cert_");
                sbLIZ.append(Integer.toString(q0.LJ.size()));
                keyStore.setCertificateEntry(C2188811AlT.LIZIZ(sbLIZ), x509CertificateLIZ);
                q0.LIZLLL = q0.LIZIZ(q0.LJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static DnsStatus getDnsStatusForNetwork(long j) {
        try {
            return LIZIZ(Network.fromNetworkHandle(j));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String getMimeTypeFromExtension(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("foo.");
        sbLIZ.append(str);
        return URLConnection.guessContentTypeFromName(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int getWifiSignalLevel(int i) throws Exception {
        int intExtra;
        int iCalculateSignalLevel;
        Context context = C787230UuP.LIZ;
        if (context == null || context.getContentResolver() == null) {
            return -1;
        }
        C789940Uym.LIZ().getClass();
        if (N.Mhd7DRFo()) {
            CronetSystemApiSandbox cronetSystemApiSandbox = C789940Uym.LIZ().LIZ;
            if (cronetSystemApiSandbox == null) {
                intExtra = 0;
                iCalculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i);
                if (iCalculateSignalLevel >= 0 || iCalculateSignalLevel >= i) {
                    return -1;
                }
                return iCalculateSignalLevel;
            }
            intExtra = cronetSystemApiSandbox.getWifiRssi();
        } else if (LJ()) {
            WifiInfo wifiInfoLIZJ = LIZJ();
            if (wifiInfoLIZJ == null) {
                return -1;
            }
            intExtra = C2204961BRm.LJLLLLLL(wifiInfoLIZJ, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjnIRWyfXLar78N+E/6BPK7xWVsUnB", null));
        } else {
            try {
                Intent intentLJIJJ = C786410Ut5.LJIJJ(C787230UuP.LIZ, null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (intentLJIJJ == null) {
                    return -1;
                }
                intExtra = intentLJIJJ.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        if (intExtra == Integer.MIN_VALUE) {
            return -1;
        }
        iCalculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i);
        if (iCalculateSignalLevel >= 0) {
        }
        return -1;
    }

    public static boolean isCleartextPermitted(String str) {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    public static void setWifiEnabled(boolean z) {
        ((WifiManager) C786410Ut5.H2(C787230UuP.LIZ, "wifi")).setWifiEnabled(z);
    }

    public static boolean LIZLLL(Context context, String str) {
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void tagSocket(int i, int i2, int i3) throws IOException {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            C1966707n7.LIZIZ(i2);
        }
        ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(i);
        final FileDescriptor fileDescriptor = parcelFileDescriptorAdoptFd.getFileDescriptor();
        Socket socket = new Socket(fileDescriptor) { // from class: X.0W95
            {
                super(new SocketImpl(fileDescriptor) { // from class: X.0W96
                    @Override // java.net.SocketImpl
                    public final void close() {
                    }

                    @Override // java.net.SocketImpl
                    public final void create(boolean z) {
                    }

                    @Override // java.net.SocketImpl
                    public final int available() {
                        throw new RuntimeException("accept not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final InputStream getInputStream() {
                        throw new RuntimeException("getInputStream not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final OutputStream getOutputStream() {
                        throw new RuntimeException("getOutputStream not implemented");
                    }

                    {
                        ((SocketImpl) this).fd = fileDescriptor;
                    }

                    @Override // java.net.SocketImpl
                    public final void accept(SocketImpl socketImpl) {
                        throw new RuntimeException("accept not implemented");
                    }

                    @Override // java.net.SocketOptions
                    public final Object getOption(int i4) {
                        throw new RuntimeException("getOption not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final void listen(int i4) {
                        throw new RuntimeException("listen not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final void sendUrgentData(int i4) {
                        throw new RuntimeException("sendUrgentData not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final void bind(InetAddress inetAddress, int i4) {
                        throw new RuntimeException("accept not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final void connect(String str, int i4) {
                        throw new RuntimeException("connect not implemented");
                    }

                    @Override // java.net.SocketOptions
                    public final void setOption(int i4, Object obj) {
                        throw new RuntimeException("setOption not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final void connect(InetAddress inetAddress, int i4) {
                        throw new RuntimeException("connect not implemented");
                    }

                    @Override // java.net.SocketImpl
                    public final void connect(SocketAddress socketAddress, int i4) {
                        throw new RuntimeException("connect not implemented");
                    }
                });
            }
        };
        TrafficStats.tagSocket(socket);
        socket.close();
        parcelFileDescriptorAdoptFd.detachFd();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            C1966707n7.LIZ();
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return q0.LJII(bArr, str, str2);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new AndroidCertVerifyResult(-1);
        }
    }
}
