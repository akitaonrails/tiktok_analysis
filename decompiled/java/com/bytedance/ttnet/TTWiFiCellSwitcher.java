package com.bytedance.ttnet;

import X.C1492990oxF;
import X.C786410Ut5;
import X.EnumC1492930ox9;
import X.EnumC1493060oxM;
import X.InterfaceC1492980oxE;
import Y.ARunnableS10S0102000_23;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.utils.TTNetProtocolUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class TTWiFiCellSwitcher {
    public volatile EnumC1493060oxM mCurrentState = EnumC1493060oxM.STOPPED;
    public final Map<InterfaceC1492980oxE, Handler> mObservers = new HashMap();

    public void start() {
        try {
            TTNetProtocolUtil.LIZ("/start", null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void stop() {
        try {
            TTNetProtocolUtil.LIZ("/stop", null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static TTWiFiCellSwitcher inst() {
        return C1492990oxF.LIZ;
    }

    public EnumC1493060oxM getCurrentState() {
        return this.mCurrentState;
    }

    public void triggerSwitchingToNetwork(EnumC1492930ox9 enumC1492930ox9) {
        try {
            HashMap map = new HashMap();
            map.put("network-type", Integer.toString(enumC1492930ox9.networkType));
            TTNetProtocolUtil.LIZ("/trigger-switch", map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void unregisterObserver(InterfaceC1492980oxE interfaceC1492980oxE) {
        if (interfaceC1492980oxE != null) {
            synchronized (this) {
                try {
                    this.mObservers.remove(interfaceC1492980oxE);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("observer == null");
    }

    private void handleWiFiToCellState(int i, int i2) {
        this.mCurrentState = EnumC1493060oxM.values()[i2 - EnumC1493060oxM.STOPPED.state];
        synchronized (this) {
            try {
                for (Map.Entry<InterfaceC1492980oxE, Handler> entry : this.mObservers.entrySet()) {
                    InterfaceC1492980oxE key = entry.getKey();
                    Handler value = entry.getValue();
                    if (value != null) {
                        C786410Ut5.LJJZZIII(value, new ARunnableS10S0102000_23(key, i, i2, 0));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void notifyWiFiToCellState(int i, int i2) {
        inst().handleWiFiToCellState(i, i2);
    }

    public void registerObserver(InterfaceC1492980oxE interfaceC1492980oxE, Handler handler) {
        if (interfaceC1492980oxE != null) {
            synchronized (this) {
                try {
                    if (!this.mObservers.containsKey(interfaceC1492980oxE)) {
                        if (handler == null) {
                            this.mObservers.put(interfaceC1492980oxE, new BPEAHandler(Looper.getMainLooper()));
                        } else {
                            this.mObservers.put(interfaceC1492980oxE, handler);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("observer == null");
    }
}
