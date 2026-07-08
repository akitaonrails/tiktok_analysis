package com.bytedance.realx.base;

import X.C0W9U;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.realx.base.NetworkTypeUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkChangeReceiver extends BroadcastReceiver {
    public static Object threadLock = new Object();
    public boolean firstChanged;
    public Context mContext;
    public final long nativeNetworkReceiver;
    public Intent networkChangeIntent;
    public NetworkTypeThread networkTypeThread;
    public NetworkTypeUtils.NetworkType sNetworkType = NetworkTypeUtils.NetworkType.NONE;

    public class NetworkTypeThread extends BPEAThread {
        public boolean keepAlive;

        private void bpea_origin_run() {
            com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread__run$___twin___() {
            while (true) {
                synchronized (NetworkChangeReceiver.threadLock) {
                    try {
                        if (NetworkChangeReceiver.this.firstChanged) {
                            try {
                                NetworkChangeReceiver.threadLock.wait();
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (!this.keepAlive) {
                            return;
                        } else {
                            NetworkChangeReceiver.this.getNetworkTypeInternal();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }

        @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("NetworkChangeReceiver$NetworkTypeThread@aba7.run");
            boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
            try {
                com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("NetworkChangeReceiver$NetworkTypeThread@aba7.run");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        public void stopThread() {
            synchronized (NetworkChangeReceiver.threadLock) {
                try {
                    Logging.i("NetworkChangeReceiver", "stopThread");
                    this.keepAlive = false;
                    NetworkChangeReceiver.threadLock.notify();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public static void com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkTypeThread networkTypeThread) {
            try {
                networkTypeThread.com_bytedance_realx_base_NetworkChangeReceiver$NetworkTypeThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public NetworkTypeThread(String str) {
            super(str);
            this.keepAlive = true;
        }
    }

    private native void nativeSetNetworkType(int i, String str, long j);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_bytedance_realx_base_NetworkChangeReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    /* JADX INFO: renamed from: com.bytedance.realx.base.NetworkChangeReceiver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType;

        static {
            int[] iArr = new int[NetworkTypeUtils.NetworkType.values().length];
            $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType = iArr;
            try {
                iArr[NetworkTypeUtils.NetworkType.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_2G.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_3G.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_4G.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[NetworkTypeUtils.NetworkType.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
    }

    public void StartDetect() {
        if (this.networkTypeThread == null) {
            NetworkTypeThread networkTypeThread = new NetworkTypeThread("NetworkTypeThread");
            this.networkTypeThread = networkTypeThread;
            networkTypeThread.start();
        }
    }

    public void StopDetect() {
        NetworkTypeThread networkTypeThread = this.networkTypeThread;
        if (networkTypeThread != null) {
            networkTypeThread.stopThread();
            this.networkTypeThread.interrupt();
            this.networkTypeThread = null;
            NetworkTypeUtils.unregisterReceiver(this.mContext, this);
        }
    }

    public void getNetworkTypeInternal() {
        NetworkTypeUtils.NetworkType networkType = NetworkTypeUtils.getNetworkType(this.mContext, this.networkChangeIntent);
        this.networkChangeIntent = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetNetworkType, networkType： ");
        sbLIZ.append(networkType);
        Logging.i("NetworkChangeReceiver", C2188811AlT.LIZIZ(sbLIZ));
        if (this.firstChanged && this.sNetworkType == networkType) {
            return;
        }
        this.firstChanged = true;
        nativeSetNetworkType(getConstantNetworkType(networkType), NetworkTypeUtils.getDebugInfo(), this.nativeNetworkReceiver);
        this.sNetworkType = networkType;
    }

    public NetworkChangeReceiver(long j) throws Exception {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, nativeNetworkReceiver: ");
        sbLIZ.append(j);
        Logging.i("NetworkChangeReceiver", C2188811AlT.LIZIZ(sbLIZ));
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        this.nativeNetworkReceiver = j;
        NetworkTypeUtils.registerReceiver(applicationContext, this);
    }

    private int getConstantNetworkType(NetworkTypeUtils.NetworkType networkType) {
        if (!networkType.isAvailable()) {
            return 0;
        }
        return getType(networkType);
    }

    private int getType(NetworkTypeUtils.NetworkType networkType) {
        switch (AnonymousClass1.$SwitchMap$com$bytedance$realx$base$NetworkTypeUtils$NetworkType[networkType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return -1;
        }
    }

    public void com_bytedance_realx_base_NetworkChangeReceiver__onReceive$___twin___(Context context, Intent intent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceive, action: ");
        sbLIZ.append(intent.getAction());
        Logging.i("NetworkChangeReceiver", C2188811AlT.LIZIZ(sbLIZ));
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            synchronized (threadLock) {
                try {
                    this.networkChangeIntent = intent;
                    threadLock.notify();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void com_bytedance_realx_base_NetworkChangeReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(NetworkChangeReceiver networkChangeReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            networkChangeReceiver.com_bytedance_realx_base_NetworkChangeReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            networkChangeReceiver.com_bytedance_realx_base_NetworkChangeReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_bytedance_realx_base_NetworkChangeReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(NetworkChangeReceiver networkChangeReceiver, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_bytedance_realx_base_NetworkChangeReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(networkChangeReceiver, context, intent);
    }
}
