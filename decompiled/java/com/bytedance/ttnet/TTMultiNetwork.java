package com.bytedance.ttnet;

import X.C786410Ut5;
import X.EnumC1493070oxN;
import X.EnumC1493180oxY;
import X.InterfaceC1493160oxW;
import X.InterfaceC594300NSq;
import Y.ARunnableS5S0110100_23;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTMultiNetwork;
import com.bytedance.ttnet.utils.TTNetProtocolUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class TTMultiNetwork {
    public static volatile EnumC1493070oxN sCurrentState = EnumC1493070oxN.STOPPED;
    public static volatile EnumC1493180oxY sActiveResult = EnumC1493180oxY.DEFAULT;
    public static Map<InterfaceC1493160oxW, Handler> sObservers = new HashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oxX] */
    public static void tryActivateAlternativeNet() {
        try {
            TTNetProtocolUtil.LIZIZ(new InterfaceC594300NSq<TypedInput>() { // from class: X.0oxX
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                    TTMultiNetwork.notifyUserSpecifiedNetworkEnabled(false);
                    c0x9s.cancel();
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                    String str;
                    EnumC1493180oxY enumC1493180oxY;
                    try {
                        Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C080U next = it2.next();
                                if ("ActiveResult".equalsIgnoreCase(next.LIZ)) {
                                    str = next.LIZIZ;
                                    break;
                                }
                            } else {
                                str = null;
                                break;
                            }
                        }
                        try {
                            enumC1493180oxY = EnumC1493180oxY.values()[CastIntegerProtector.parseInt(str) - EnumC1493180oxY.DEFAULT.code];
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            enumC1493180oxY = EnumC1493180oxY.DEFAULT;
                        }
                        TTMultiNetwork.sActiveResult = enumC1493180oxY;
                        TTMultiNetwork.notifyUserSpecifiedNetworkEnabled("1".equals(str));
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    c0x9s.cancel();
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static EnumC1493180oxY getActiveResult() {
        return sActiveResult;
    }

    public static EnumC1493070oxN getCurrentState() {
        return sCurrentState;
    }

    public static void notifyUserSpecifiedNetworkEnabled(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (TTMultiNetwork.class) {
            try {
                for (Map.Entry<InterfaceC1493160oxW, Handler> entry : sObservers.entrySet()) {
                    InterfaceC1493160oxW key = entry.getKey();
                    Handler value = entry.getValue();
                    if (value != null) {
                        C786410Ut5.LJJZZIII(value, new ARunnableS5S0110100_23(key, z, jCurrentTimeMillis, 0));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void unregisterMultiNetObserver(InterfaceC1493160oxW interfaceC1493160oxW) {
        if (interfaceC1493160oxW != null) {
            synchronized (TTMultiNetwork.class) {
                try {
                    sObservers.remove(interfaceC1493160oxW);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new NullPointerException("observer == null");
    }

    public static void notifyMultiNetworkState(final int i, final int i2) {
        Logger.debug();
        sCurrentState = EnumC1493070oxN.values()[i2 - EnumC1493070oxN.STOPPED.state];
        final long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (TTMultiNetwork.class) {
            try {
                for (Map.Entry<InterfaceC1493160oxW, Handler> entry : sObservers.entrySet()) {
                    final InterfaceC1493160oxW key = entry.getKey();
                    Handler value = entry.getValue();
                    if (value != null) {
                        C786410Ut5.LJJZZIII(value, new Runnable() { // from class: X.0oxV
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("TTMultiNetwork@9111.notifyMultiNetworkState$1");
                                try {
                                    InterfaceC1493160oxW interfaceC1493160oxW = key;
                                    int i3 = i;
                                    EnumC1493070oxN[] enumC1493070oxNArrValues = EnumC1493070oxN.values();
                                    EnumC1493070oxN enumC1493070oxN = EnumC1493070oxN.STOPPED;
                                    interfaceC1493160oxW.onMultiNetStateChanged(enumC1493070oxNArrValues[i3 - enumC1493070oxN.state], EnumC1493070oxN.values()[i2 - enumC1493070oxN.state], jCurrentTimeMillis);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("TTMultiNetwork@9111.notifyMultiNetworkState$1");
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void registerMultiNetObserver(InterfaceC1493160oxW interfaceC1493160oxW, Handler handler) {
        if (interfaceC1493160oxW != null) {
            synchronized (TTMultiNetwork.class) {
                try {
                    if (!sObservers.containsKey(interfaceC1493160oxW)) {
                        if (handler == null) {
                            sObservers.put(interfaceC1493160oxW, new BPEAHandler(Looper.getMainLooper()));
                        } else {
                            sObservers.put(interfaceC1493160oxW, handler);
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
