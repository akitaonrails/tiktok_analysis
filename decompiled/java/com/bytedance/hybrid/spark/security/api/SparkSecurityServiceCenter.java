package com.bytedance.hybrid.spark.security.api;

import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C821850WLv;
import X.C828460Wei;
import X.InterfaceC828450Weh;
import android.util.AndroidRuntimeException;
import com.bytedance.hybrid.spark.security.api.protocols.DynamicRuleHandler;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityServiceProtocol;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SparkSecurityServiceCenter {
    public static DynamicRuleHandler dynamicHandler;
    public static final InvocationHandler handler;
    public static final SparkSecurityService innerProtocol;
    public static final ConcurrentHashMap<Class<? extends SparkSecurityService>, SparkSecurityService> interceptableServiceMap;
    public static final Map<String, String> jsbMethodToServiceClassName;
    public static InterfaceC828450Weh reportHelper;
    public static final ConcurrentHashMap<Class<? extends SparkSecurityService>, Set<SparkSecurityService>> serviceMapList;
    public static final SparkSecurityServiceCenter INSTANCE = new SparkSecurityServiceCenter();
    public static final Map<String, String> dynamicApiNameMapper = C2097908Jt.LIZJ(new Pair("handleWillModifyNetworkResponseWithEvent", "handleWillReturnNetworkResponse"));
    public static volatile boolean enable = true;

    static {
        C828460Wei c828460Wei = new InvocationHandler() { // from class: X.0Wei
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:148:0x0311  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0340  */
            /* JADX WARN: Removed duplicated region for block: B:196:0x0109 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:201:0x0058 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r2v24 */
            /* JADX WARN: Type inference failed for: r2v25, types: [T, X.0WLv] */
            /* JADX WARN: Type inference failed for: r2v34 */
            /* JADX WARN: Type inference failed for: r2v35 */
            /* JADX WARN: Type inference failed for: r2v36 */
            /* JADX WARN: Type inference failed for: r2v4, types: [T, X.0Wee] */
            @Override // java.lang.reflect.InvocationHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r35, java.lang.reflect.Method r36, java.lang.Object[] r37) {
                /*
                    Method dump skipped, instruction units count: 866
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C828460Wei.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
            }
        };
        handler = c828460Wei;
        serviceMapList = new ConcurrentHashMap<>();
        interceptableServiceMap = new ConcurrentHashMap<>();
        jsbMethodToServiceClassName = C2097608Jq.LJIIIIZZ(new Pair("handleWillExecuteJSBridgeMethodEvent", SparkSecurityJSBService.class.getName()), new Pair("handleDidExecuteJSBridgeMethodEvent", SparkSecurityJSBService.class.getName()));
        innerProtocol = (SparkSecurityService) Proxy.newProxyInstance(SparkSecurityServiceProtocol.class.getClassLoader(), new Class[]{SparkSecurityServiceProtocol.class}, c828460Wei);
    }

    public final DynamicRuleHandler getDynamicHandler() {
        return dynamicHandler;
    }

    public final boolean getEnable() {
        return enable;
    }

    public final InterfaceC828450Weh getReportHelper() {
        return reportHelper;
    }

    public final <E extends SparkSecurityService> E protocol() {
        return (E) innerProtocol;
    }

    private final void checkServiceClazz(Class<? extends SparkSecurityService> cls) {
        if (SparkSecurityService.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(SparkSecurityServiceProtocol.class)) {
                return;
            } else {
                throw new IllegalArgumentException("not required service instance");
            }
        }
        throw new IllegalArgumentException("not assignable from SparkSecurityService");
    }

    public final void handleSparkSecurityAsyncResult(C821850WLv c821850WLv) {
        InterfaceC828450Weh interfaceC828450Weh = reportHelper;
        if (interfaceC828450Weh != null) {
            interfaceC828450Weh.LIZLLL(c821850WLv);
        }
    }

    public final void setDynamicHandler(DynamicRuleHandler dynamicRuleHandler) {
        dynamicHandler = dynamicRuleHandler;
    }

    public final void setEnable(boolean z) {
        enable = z;
    }

    public final void setReportHelper(InterfaceC828450Weh interfaceC828450Weh) {
        reportHelper = interfaceC828450Weh;
    }

    private final void checkServiceMatch(Class<? extends SparkSecurityService> cls, SparkSecurityService sparkSecurityService) {
        checkServiceClazz(cls);
        if (cls.isAssignableFrom(sparkSecurityService.getClass())) {
        } else {
            throw new IllegalArgumentException("unmatched clazz and instance");
        }
    }

    public final SparkSecurityService getInterceptableService(Class<?> cls, String str) {
        Object next;
        SparkSecurityService sparkSecurityService;
        String str2;
        Object next2;
        SparkSecurityService sparkSecurityService2;
        if (cls == null) {
            return null;
        }
        if (Intrinsics.LJFF(cls.getName(), SparkSecurityServiceProtocol.class.getName()) && (str2 = jsbMethodToServiceClassName.get(str)) != null) {
            Iterator<T> it2 = interceptableServiceMap.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (Intrinsics.LJFF(((Class) ((Map.Entry) next2).getKey()).getName(), str2)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next2;
            if (entry != null && (sparkSecurityService2 = (SparkSecurityService) entry.getValue()) != null) {
                return sparkSecurityService2;
            }
        }
        ConcurrentHashMap<Class<? extends SparkSecurityService>, SparkSecurityService> concurrentHashMap = interceptableServiceMap;
        SparkSecurityService sparkSecurityService3 = concurrentHashMap.get(cls);
        if (sparkSecurityService3 != null) {
            return sparkSecurityService3;
        }
        Iterator<T> it3 = concurrentHashMap.entrySet().iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(((Class) ((Map.Entry) next).getKey()).getName(), cls.getName())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 == null || (sparkSecurityService = (SparkSecurityService) entry2.getValue()) == null) {
            return null;
        }
        return sparkSecurityService;
    }

    public final Set<SparkSecurityService> getNonInterceptableServices(Class<?> cls, String str) {
        Object next;
        Set<SparkSecurityService> set;
        String str2;
        Object next2;
        Set<SparkSecurityService> set2;
        if (cls == null) {
            return null;
        }
        if (Intrinsics.LJFF(cls.getName(), SparkSecurityServiceProtocol.class.getName()) && (str2 = jsbMethodToServiceClassName.get(str)) != null) {
            Iterator<T> it2 = serviceMapList.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (Intrinsics.LJFF(((Class) ((Map.Entry) next2).getKey()).getName(), str2)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next2;
            if (entry != null && (set2 = (Set) entry.getValue()) != null) {
                return set2;
            }
        }
        ConcurrentHashMap<Class<? extends SparkSecurityService>, Set<SparkSecurityService>> concurrentHashMap = serviceMapList;
        Set<SparkSecurityService> set3 = concurrentHashMap.get(cls);
        if (set3 != null) {
            return set3;
        }
        Iterator<T> it3 = concurrentHashMap.entrySet().iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(((Class) ((Map.Entry) next).getKey()).getName(), cls.getName())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 == null || (set = (Set) entry2.getValue()) == null) {
            return null;
        }
        return set;
    }

    public final void registerService(Class<? extends SparkSecurityService> cls, SparkSecurityService sparkSecurityService) {
        Set<SparkSecurityService> setPutIfAbsent;
        checkServiceMatch(cls, sparkSecurityService);
        if (sparkSecurityService.interceptable()) {
            ConcurrentHashMap<Class<? extends SparkSecurityService>, SparkSecurityService> concurrentHashMap = interceptableServiceMap;
            if (concurrentHashMap.containsKey(cls)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("The corresponding key is already registered, the value is ");
                sbLIZ.append(sparkSecurityService.getClass().getName());
                sbLIZ.append('.');
                new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            concurrentHashMap.put(cls, sparkSecurityService);
            return;
        }
        ConcurrentHashMap<Class<? extends SparkSecurityService>, Set<SparkSecurityService>> concurrentHashMap2 = serviceMapList;
        Set<SparkSecurityService> setNewSetFromMap = concurrentHashMap2.get(cls);
        if (setNewSetFromMap == null && (setPutIfAbsent = concurrentHashMap2.putIfAbsent(cls, (setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap())))) != null) {
            setNewSetFromMap = setPutIfAbsent;
        }
        setNewSetFromMap.add(sparkSecurityService);
    }

    public final void unregisterService(Class<? extends SparkSecurityService> cls, SparkSecurityService sparkSecurityService) {
        Set<SparkSecurityService> setPutIfAbsent;
        checkServiceMatch(cls, sparkSecurityService);
        if (sparkSecurityService.interceptable()) {
            interceptableServiceMap.remove(cls, sparkSecurityService);
        }
        ConcurrentHashMap<Class<? extends SparkSecurityService>, Set<SparkSecurityService>> concurrentHashMap = serviceMapList;
        Set<SparkSecurityService> setNewSetFromMap = concurrentHashMap.get(cls);
        if (setNewSetFromMap == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap())))) != null) {
            setNewSetFromMap = setPutIfAbsent;
        }
        setNewSetFromMap.remove(sparkSecurityService);
    }
}
