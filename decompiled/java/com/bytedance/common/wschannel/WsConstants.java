package com.bytedance.common.wschannel;

import X.C0WJZ;
import X.C0XE1;
import X.C821140WJc;
import X.InterfaceC810750VrF;
import X.InterfaceC820200WFm;
import X.InterfaceC821150WJd;
import X.InterfaceC821160WJe;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class WsConstants {
    public static InterfaceC821150WJd sAckListener;
    public static C0WJZ sBindWsChannelServiceListener;
    public static InterfaceC810750VrF sListener;
    public static InterfaceC821160WJe sServiceListener;
    public static Map<Integer, C0XE1> sStates = new ConcurrentHashMap();
    public static Map<Integer, Boolean> sPrivateProtocolState = new ConcurrentHashMap();
    public static Map<Integer, Map<Integer, Boolean>> sServiceState = new HashMap();
    public static final Object sServiceLock = new Object();
    public static volatile InterfaceC820200WFm<Boolean> optLogic = C821140WJc.LIZ;

    public static InterfaceC821150WJd getMessageAckListener() {
        return null;
    }

    public static InterfaceC821160WJe getServiceConnectListener() {
        return null;
    }

    public static void setMessageAckListener(InterfaceC821150WJd interfaceC821150WJd) {
    }

    public static void setServiceConnectListener(InterfaceC821160WJe interfaceC821160WJe) {
    }

    public static C0WJZ getBindWsChannelServiceListener() {
        return sBindWsChannelServiceListener;
    }

    public static InterfaceC820200WFm<Boolean> getOptLogic() {
        return optLogic;
    }

    public static InterfaceC810750VrF getListener(int i) {
        return sListener;
    }

    public static boolean isPrivateProtocolEnabled(int i) {
        if (!sPrivateProtocolState.containsKey(Integer.valueOf(i)) || !sPrivateProtocolState.get(Integer.valueOf(i)).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean isWsChannelConnected(int i) {
        if (sStates.get(Integer.valueOf(i)) == C0XE1.CONNECTED) {
            return true;
        }
        return false;
    }

    public static void remove(int i) {
        sStates.remove(Integer.valueOf(i));
        synchronized (sServiceLock) {
            try {
                sServiceState.remove(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setBindWsChannelServiceListener(C0WJZ c0wjz) {
        sBindWsChannelServiceListener = c0wjz;
    }

    public static void setOnMessageReceiveListener(InterfaceC810750VrF interfaceC810750VrF) {
        sListener = interfaceC810750VrF;
    }

    public static void setOptLogic(InterfaceC820200WFm<Boolean> interfaceC820200WFm) {
        if (interfaceC820200WFm == null) {
            return;
        }
        optLogic = interfaceC820200WFm;
    }

    public static void setServiceState(ServiceConnectEvent serviceConnectEvent) {
        synchronized (sServiceLock) {
            try {
                Map<Integer, Boolean> map = sServiceState.get(Integer.valueOf(serviceConnectEvent.mChannelId));
                if (map == null) {
                    return;
                }
                map.put(Integer.valueOf(serviceConnectEvent.mServiceId), Boolean.valueOf(serviceConnectEvent.mConnected));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void initServiceState(int i, List<Integer> list) {
        synchronized (sServiceLock) {
            try {
                HashMap map = new HashMap();
                if (list == null) {
                    sServiceState.put(Integer.valueOf(i), map);
                    return;
                }
                Iterator<Integer> it2 = list.iterator();
                while (it2.hasNext()) {
                    map.put(it2.next(), Boolean.FALSE);
                }
                sServiceState.put(Integer.valueOf(i), map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean isServiceConnected(int i, int i2) {
        synchronized (sServiceLock) {
            try {
                Map<Integer, Boolean> map = sServiceState.get(Integer.valueOf(i));
                if (map == null) {
                    return false;
                }
                Boolean bool = map.get(Integer.valueOf(i2));
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void removeService(int i, int i2) {
        synchronized (sServiceLock) {
            try {
                Map<Integer, Boolean> map = sServiceState.get(Integer.valueOf(i));
                if (map == null) {
                    return;
                }
                map.remove(Integer.valueOf(i2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void setConnectionState(int i, C0XE1 c0xe1, boolean z) {
        sStates.put(Integer.valueOf(i), c0xe1);
        sPrivateProtocolState.put(Integer.valueOf(i), Boolean.valueOf(z));
    }
}
