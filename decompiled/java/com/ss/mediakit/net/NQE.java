package com.ss.mediakit.net;

import X.C1476650oWt;
import X.C1476660oWu;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import com.ss.mediakit.net.APPNetworkState;
import com.ss.mediakit.net.NetworkState;
import com.ss.videoarch.liveio.LiveIOManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class NQE implements NetworkState.NetworkStateCallback, APPNetworkState.APPNetworkStateCallback {
    public static volatile NQE mInstance;
    public Map<String, NetworkState.NetworkStateCallback> mNetworkStateCallbackMap = new HashMap();
    public volatile boolean liveInitialized = false;
    public volatile boolean vodInitialized = false;
    public final Object liveInitLock = new Object();
    public final Object vodInitLock = new Object();

    public static NQE getInstance() {
        if (mInstance == null) {
            synchronized (NQE.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new NQE();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public NetworkState getNetworkState(int i) {
        if (i == 1) {
            if (!this.liveInitialized) {
                return null;
            }
            return LiveIOManager.getInstance().getNetworkState(1);
        }
        if (i != 2 || !this.vodInitialized) {
            return null;
        }
        return AVMDLDataLoader.getInstance().getNetworkState(2);
    }

    public void init(int i) {
        if (i == 1) {
            if (this.liveInitialized) {
                return;
            }
            synchronized (this.liveInitLock) {
                try {
                    if (!this.liveInitialized) {
                        C1476650oWt c1476650oWt = C1476660oWu.LIZ;
                        NQE nqe = mInstance;
                        if (c1476650oWt.LIZJ) {
                            LiveIOManager.getInstance().addNetworkStateCallback(nqe, "MIOCoreNQE");
                        }
                        this.liveInitialized = true;
                    }
                } finally {
                }
            }
            return;
        }
        if (i != 2 || this.vodInitialized) {
            return;
        }
        synchronized (this.vodInitLock) {
            try {
                if (!this.vodInitialized) {
                    AVMDLDataLoader.getInstance().addNetworkStateCallback(mInstance, "MIOCoreNQE");
                    this.vodInitialized = true;
                }
            } finally {
            }
        }
    }

    @Override // com.ss.mediakit.net.APPNetworkState.APPNetworkStateCallback
    public void onAPPNetworkStateChanged(APPNetworkState aPPNetworkState) {
        if (aPPNetworkState == null) {
            AVMDLLog.w("MIO-NQE", "onAPPNetworkStateChanged with null state");
            return;
        }
        synchronized (this.vodInitLock) {
            try {
                if (this.vodInitialized) {
                    AVMDLDataLoader.getInstance().setIntValue(7457, aPPNetworkState.toInt32Value());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("vod onAPPNetworkStateChanged, and new state is ");
                    sbLIZ.append(aPPNetworkState.toString());
                    AVMDLLog.i("MIO-NQE", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.mediakit.net.NetworkState.NetworkStateCallback
    public void onNetworkStateChanged(NetworkState networkState) {
        if (networkState == null) {
            AVMDLLog.w("MIO-NQE", "onNetworkStateChanged with null state");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onNetworkStateChanged, and new state is ");
        sbLIZ.append(networkState.toString());
        AVMDLLog.i("MIO-NQE", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mNetworkStateCallbackMap) {
            try {
                for (NetworkState.NetworkStateCallback networkStateCallback : this.mNetworkStateCallbackMap.values()) {
                    if (networkStateCallback != null) {
                        networkStateCallback.onNetworkStateChanged(networkState);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void removeNetworkStateCallback(String str) {
        if (str == null) {
            return;
        }
        synchronized (this.mNetworkStateCallbackMap) {
            try {
                this.mNetworkStateCallbackMap.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addNetworkStateCallback(NetworkState.NetworkStateCallback networkStateCallback, String str) {
        if (networkStateCallback != null && str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addNetworkStateCallback for ");
            sbLIZ.append(str);
            AVMDLLog.i("MIO-NQE", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (this.mNetworkStateCallbackMap) {
                try {
                    this.mNetworkStateCallbackMap.put(str, networkStateCallback);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
