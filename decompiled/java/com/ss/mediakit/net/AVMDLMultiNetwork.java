package com.ss.mediakit.net;

import X.C0WZX;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLMultiNetwork {
    public static Runnable loopRefreshRunnable = new Runnable() { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.1
        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("AVMDLMultiNetwork@a66b.<field>$1");
            com_ss_mediakit_net_AVMDLMultiNetwork$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("AVMDLMultiNetwork@a66b.<field>$1");
        }

        public void com_ss_mediakit_net_AVMDLMultiNetwork$1__run$___twin___() {
            AVMDLMultiNetwork.refreshIpReachable();
            C786410Ut5.LJLIIL(60000L, AVMDLMultiNetwork.mHandler, this);
        }

        public static void com_ss_mediakit_net_AVMDLMultiNetwork$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            try {
                anonymousClass1.com_ss_mediakit_net_AVMDLMultiNetwork$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public static Network mCellularNetwork = null;
    public static ConnectivityManager mCm = null;
    public static long mCurNetId = 0;
    public static Network mCurNetwork = null;
    public static Handler mHandler = null;
    public static boolean mIsIPv4Reachable = true;
    public static boolean mIsIPv6Reachable = true;
    public static HandlerThread mThread;

    public static void refreshIpReachable() {
    }

    public static Network getCellularNetwork() {
        Network network;
        synchronized (AVMDLMultiNetwork.class) {
            try {
                network = mCellularNetwork;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return network;
    }

    public static Network getCurNetwork() {
        Network network;
        synchronized (AVMDLMultiNetwork.class) {
            try {
                network = mCurNetwork;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return network;
    }

    public static boolean isIPv4Reachable() {
        boolean z;
        synchronized (AVMDLMultiNetwork.class) {
            try {
                z = mIsIPv4Reachable;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static boolean isIPv6Reachable() {
        boolean z;
        synchronized (AVMDLMultiNetwork.class) {
            try {
                z = mIsIPv6Reachable;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static void switchToCellularNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 1;
            C786410Ut5.LJLJJL(mHandler, message);
            AVMDLLog.d("AVMDLMultiNetwork", "send msg of switch to cellular network");
        }
    }

    public static void switchToDefaultNetwork() {
        if (mHandler != null) {
            Message message = new Message();
            message.what = 2;
            C786410Ut5.LJLJJL(mHandler, message);
            AVMDLLog.d("AVMDLMultiNetwork", "send msg of switch to default network");
        }
    }

    public static void switchToDefaultNetworkInternal() {
        AVMDLLog.d("AVMDLMultiNetwork", "try switch to default network");
        if (mCurNetId != 0) {
            AVMDLLog.d("AVMDLMultiNetwork", "do switch");
            IPCache.getInstance().clear();
            AVMDLDataLoader.getInstance().onCellularAlwaysUp(0L);
            mCurNetId = 0L;
            setCurNetwork(null);
        }
        AVMDLLog.d("AVMDLMultiNetwork", "end try switch to default network");
    }

    public static void switchToCellularNetworkInternal() {
        int iOnCellularAlwaysUp;
        Network cellularNetwork = getCellularNetwork();
        if (cellularNetwork == null) {
            return;
        }
        long netId = getNetId(cellularNetwork);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try switch to cellular curNetId: ");
        sbLIZ.append(mCurNetId);
        sbLIZ.append(" netId:");
        sbLIZ.append(netId);
        AVMDLLog.d("AVMDLMultiNetwork", C2188811AlT.LIZIZ(sbLIZ));
        if (mCurNetId != netId) {
            AVMDLLog.d("AVMDLMultiNetwork", "do switch");
            IPCache.getInstance().clear();
            iOnCellularAlwaysUp = AVMDLDataLoader.getInstance().onCellularAlwaysUp(NetUtils.getNetId(cellularNetwork));
            mCurNetId = netId;
            setCurNetwork(cellularNetwork);
        } else {
            AVMDLLog.d("AVMDLMultiNetwork", "cur is cellular, not need switch");
            iOnCellularAlwaysUp = 0;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("end switch to cellular, ret:");
        sbLIZ2.append(iOnCellularAlwaysUp);
        AVMDLLog.d("AVMDLMultiNetwork", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static boolean alwayUpCellular(Context context) {
        initHandler(context);
        if (mCm == null) {
            AVMDLLog.d("AVMDLMultiNetwork", "cm is null");
            return false;
        }
        try {
            mCm.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new ConnectivityManager.NetworkCallback() { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.3
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    Message message = new Message();
                    message.obj = network;
                    message.what = 0;
                    C786410Ut5.LJLJJL(AVMDLMultiNetwork.mHandler, message);
                    AVMDLLog.d("AVMDLMultiNetwork", "send msg of onavailable ");
                }
            });
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static long getNetId(Network network) {
        return network.getNetworkHandle();
    }

    public static void initHandler(Context context) {
        Looper looperW2;
        synchronized (AVMDLMultiNetwork.class) {
            try {
                if (mHandler == null) {
                    if (AVMDLDataLoader.getInstance().enableThreadMerge() && (looperW2 = AVMDLDataLoader.getInstance().getGlobalLooper()) != null) {
                        AVMDLLog.d("AVMDLMultiNetwork", "[tm]use mdl global thread looper");
                    } else {
                        HandlerThread handlerThread = new HandlerThread("AVMDLMultiNetwork");
                        mThread = handlerThread;
                        handlerThread.start();
                        looperW2 = C786410Ut5.W2(mThread);
                        AVMDLLog.d("AVMDLMultiNetwork", "[tm]use independent thread looper");
                    }
                    mHandler = new BPEAHandler(looperW2) { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.4
                        @Override // android.os.Handler
                        public void handleMessage(Message message) throws Throwable {
                            Network network;
                            C1C7U.LIZ("AVMDLMultiNetwork@a66b.initHandler$1");
                            if (HandlerHook.getMessageObj(message.obj) != null) {
                                network = (Network) HandlerHook.getMessageObj(message.obj);
                            } else {
                                network = null;
                            }
                            Locale locale = Locale.US;
                            AVMDLLog.d("AVMDLMultiNetwork", C786410Ut5.k4(locale, "----receive msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                            int i = message.what;
                            if (i != 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            AVMDLMultiNetwork.refreshIpReachable();
                                        }
                                    } else {
                                        AVMDLMultiNetwork.switchToDefaultNetworkInternal();
                                    }
                                } else {
                                    AVMDLMultiNetwork.switchToCellularNetworkInternal();
                                }
                            } else {
                                AVMDLMultiNetwork.onAvailableInternal(network);
                            }
                            AVMDLLog.d("AVMDLMultiNetwork", C786410Ut5.k4(locale, "****end proc msg what:%d info:%s", new Object[]{Integer.valueOf(message.what), network}));
                            C1C7U.LIZIZ("AVMDLMultiNetwork@a66b.initHandler$1");
                        }
                    };
                }
                if (context != null && mCm == null) {
                    mCm = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void onAvailableInternal(Network network) throws Throwable {
        ConnectivityManager connectivityManager;
        if (network != null && (connectivityManager = mCm) != null) {
            NetworkInfo networkInfoZ4 = C786410Ut5.z4(connectivityManager, network);
            AVMDLLog.d("AVMDLMultiNetwork", "start on available");
            if (networkInfoZ4 != null) {
                AVMDLLog.d("AVMDLMultiNetwork", "network name: " + C2204961BRm.LJLLJ(networkInfoZ4, new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WKQK1kAWEP+tNBHpIWOw83pg==", null)) + e3.e + C2204961BRm.LJLLI(networkInfoZ4, new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WKQK1kAWEP+tNBHpIWOw83pg==", null)) + "], state: " + networkInfoZ4.getDetailedState() + " netid:" + getNetId(network));
            }
            NetworkCapabilities networkCapabilitiesLJLJL = C2204961BRm.LJLJL(mCm, network, new C0WZX("dzBzEhEpEcfZUV4gThuQKJLVr0WKQK1kAWEP+tNBHpIWOw83pg==", null));
            if (networkCapabilitiesLJLJL != null && networkCapabilitiesLJLJL.hasTransport(0) && networkCapabilitiesLJLJL.hasCapability(12)) {
                onCellularNetwork(network);
                AVMDLDataLoader.getInstance().onInitMultiNetworkEnv();
            } else {
                AVMDLDataLoader.getInstance().onCellularAlwaysUp(0L);
            }
            AVMDLLog.d("AVMDLMultiNetwork", "end on available");
        }
    }

    public static void onCellularNetwork(Network network) {
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mCellularNetwork = network;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean registerNetworkChangeCallback(Context context) {
        initHandler(context);
        if (mCm == null) {
            AVMDLLog.d("AVMDLMultiNetwork", "cm is null");
            return false;
        }
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
        try {
            if (AVMDLDataLoader.getInstance().getConfig().mEnableNetworkChangeNotify == 1) {
                mCm.registerNetworkCallback(networkRequestBuild, new ConnectivityManager.NetworkCallback() { // from class: com.ss.mediakit.net.AVMDLMultiNetwork.2
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLost(Network network) {
                        AVMDLLog.d("AVMDLMultiNetwork", "send msg of onLost ");
                        if (network != null && AVMDLMultiNetwork.mCm != null) {
                            Message message = new Message();
                            message.obj = network;
                            message.what = 3;
                            C786410Ut5.LJLJLJ(AVMDLMultiNetwork.mHandler, message, 200L);
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        AVMDLLog.d("AVMDLMultiNetwork", "send msg of onLinkPropertiesChanged");
                        if (network != null && AVMDLMultiNetwork.mCm != null) {
                            Message message = new Message();
                            message.obj = network;
                            message.what = 3;
                            C786410Ut5.LJLJJL(AVMDLMultiNetwork.mHandler, message);
                        }
                    }
                });
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void setCurNetwork(Network network) {
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mCurNetwork = network;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setIPv4Reachable(boolean z) {
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mIsIPv4Reachable = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setIPv6Reachable(boolean z) {
        synchronized (AVMDLMultiNetwork.class) {
            try {
                mIsIPv6Reachable = z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
