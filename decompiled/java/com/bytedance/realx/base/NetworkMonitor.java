package com.bytedance.realx.base;

import X.C2188811AlT;
import X.C786410Ut5;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkMonitor {
    public String cellularIfName;
    public Network cellularNetwork;
    public Boolean cellularNetworkRequested;
    public long cellularRequestCallback;
    public ConnectivityManager connectivityManager;
    public NetworkMonitoCallback networkMonitorCallback;
    public Boolean shouldEmitAvailable;

    public class NetworkMonitoCallback extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            synchronized (NetworkMonitor.this) {
                try {
                    Logging.w("NetworkMonitor", "on unavailable");
                    long j = NetworkMonitor.this.cellularRequestCallback;
                    if (j != 0) {
                        NativeNetworkFunctions.nativeOnNetworkUnavailable(j);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public NetworkMonitoCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            synchronized (NetworkMonitor.this) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on available, network: ");
                    sbLIZ.append(network.toString());
                    Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    NetworkMonitor networkMonitor = NetworkMonitor.this;
                    if (networkMonitor.cellularNetwork == null) {
                        networkMonitor.cellularNetwork = network;
                        networkMonitor.shouldEmitAvailable = Boolean.TRUE;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            synchronized (NetworkMonitor.this) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on lost, network: ");
                    sbLIZ.append(network.toString());
                    Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                        NetworkMonitor networkMonitor = NetworkMonitor.this;
                        networkMonitor.cellularNetwork = null;
                        long j = networkMonitor.cellularRequestCallback;
                        if (j != 0 && (str = networkMonitor.cellularIfName) != null) {
                            NativeNetworkFunctions.nativeOnNetworkLost(str, j);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            String str;
            synchronized (NetworkMonitor.this) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on network block status changed, network: ");
                    sbLIZ.append(network.toString());
                    sbLIZ.append(", blocked: ");
                    sbLIZ.append(z);
                    Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                        NetworkMonitor networkMonitor = NetworkMonitor.this;
                        long j = networkMonitor.cellularRequestCallback;
                        if (j != 0 && (str = networkMonitor.cellularIfName) != null) {
                            NativeNetworkFunctions.nativeOnBlockedStatusChanged(str, z, j);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            synchronized (NetworkMonitor.this) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on capabilities changed, network: ");
                    sbLIZ.append(network.toString());
                    sbLIZ.append(", capabilities: ");
                    sbLIZ.append(networkCapabilities.toString());
                    Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            NetworkMonitor networkMonitor;
            String str;
            synchronized (NetworkMonitor.this) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on link properties changed, network: ");
                    sbLIZ.append(network.toString());
                    sbLIZ.append(", capabilities: ");
                    sbLIZ.append(linkProperties.toString());
                    Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                        NetworkMonitor.this.cellularIfName = linkProperties.getInterfaceName();
                        NetworkMonitor networkMonitor2 = NetworkMonitor.this;
                        if (networkMonitor2.cellularRequestCallback != 0 && networkMonitor2.shouldEmitAvailable.booleanValue() && (str = (networkMonitor = NetworkMonitor.this).cellularIfName) != null) {
                            NativeNetworkFunctions.nativeOnNetworkAvailable(str, networkMonitor.cellularRequestCallback);
                            NetworkMonitor.this.shouldEmitAvailable = Boolean.FALSE;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void cancelRequestCellularNetwork() {
        synchronized (this) {
            try {
                if (this.cellularNetworkRequested.booleanValue()) {
                    try {
                        this.connectivityManager.unregisterNetworkCallback(this.networkMonitorCallback);
                        this.cellularNetwork = null;
                        this.cellularRequestCallback = 0L;
                        this.cellularNetworkRequested = Boolean.FALSE;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cancel request cellular network exception: ");
                        sbLIZ.append(e.toString());
                        Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static NetworkMonitor create() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return new NetworkMonitor();
    }

    public NetworkMonitor() {
        Boolean bool = Boolean.FALSE;
        this.cellularNetworkRequested = bool;
        this.shouldEmitAvailable = bool;
        this.networkMonitorCallback = null;
        this.connectivityManager = (ConnectivityManager) C786410Ut5.H2(ContextUtils.getApplicationContext(), "connectivity");
    }

    public void requestCellularNetwork(long j) {
        synchronized (this) {
            try {
                if (!this.cellularNetworkRequested.booleanValue()) {
                    try {
                        this.cellularRequestCallback = j;
                        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
                        NetworkMonitoCallback networkMonitoCallback = new NetworkMonitoCallback();
                        this.networkMonitorCallback = networkMonitoCallback;
                        this.connectivityManager.requestNetwork(networkRequestBuild, networkMonitoCallback);
                        this.cellularNetworkRequested = Boolean.TRUE;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Request cellular network exception: ");
                        sbLIZ.append(e.toString());
                        Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int bindSocketToCellularNetwork(int i, String str) {
        int i2;
        synchronized (this) {
            try {
                if (this.cellularNetwork != null && str.equals(this.cellularIfName)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bind socket to network, fd: ");
                    sbLIZ.append(i);
                    Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    try {
                        ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(i);
                        this.cellularNetwork.bindSocket(parcelFileDescriptorFromFd.getFileDescriptor());
                        parcelFileDescriptorFromFd.detachFd();
                        parcelFileDescriptorFromFd.close();
                        i2 = 0;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("bind socket to network exception: ");
                        sbLIZ2.append(e.toString());
                        Logging.w("NetworkMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i2;
    }
}
