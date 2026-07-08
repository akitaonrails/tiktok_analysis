package com.tiktok.strategycenterengineimpl.utils;

import X.AbstractC2213701BkW;
import X.C2213381Bk0;
import X.InterfaceC830890Wid;
import X.InterfaceC830900Wie;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import com.tiktok.ttm.TTMContext;
import com.tiktok.ttm.TTMParamData;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class TTMUtils {
    public static long TTMGetStrategyPackageAddress(TTMContext tTMContext, String str) {
        InterfaceC830890Wid interfaceC830890Wid;
        AbstractC2213701BkW abstractC2213701BkWLIZIZ;
        if (tTMContext == null || (interfaceC830890Wid = (InterfaceC830890Wid) ((Reference) tTMContext.userContextData).get()) == null || (abstractC2213701BkWLIZIZ = interfaceC830890Wid.LIZIZ(str)) == null) {
            return 0L;
        }
        return abstractC2213701BkWLIZIZ.LJII().LIZJ();
    }

    public static long TTMGetStrategyPackageAddressFromSingletonScene(String str, String str2) {
        AbstractC2213701BkW abstractC2213701BkWLIZIZ;
        if (str != null && str2 != null) {
            try {
                InterfaceC830890Wid interfaceC830890Wid = TTMStrategyCenterManagerImpl.LJII.get(str);
                if (interfaceC830890Wid != null && (abstractC2213701BkWLIZIZ = interfaceC830890Wid.LIZIZ(str2)) != null) {
                    return abstractC2213701BkWLIZIZ.LJII().LIZJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return 0L;
    }

    public static TTMParamData TTMTarsInfer(String str, Map<String, Object> map, Map<String, Object> map2, TTMContext tTMContext) {
        if (tTMContext == null) {
            return null;
        }
        try {
            InterfaceC830890Wid interfaceC830890Wid = (InterfaceC830890Wid) ((WeakReference) tTMContext.userContextData).get();
            if (interfaceC830890Wid == null) {
                return null;
            }
            for (InterfaceC830900Wie interfaceC830900Wie : interfaceC830890Wid.LIZJ()) {
                if (interfaceC830900Wie != null && (interfaceC830900Wie instanceof C2213381Bk0) && interfaceC830900Wie.LIZJ().equals(str)) {
                    Map<String, Object> mapLJIILIIL = ((C2213381Bk0) interfaceC830900Wie).LJIILIIL(map, map2);
                    if (mapLJIILIIL == null) {
                        return null;
                    }
                    return new TTMParamData(mapLJIILIIL);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }
}
