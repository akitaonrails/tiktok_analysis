package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.api.bean.PTYAbility;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class BootWatcher {
    public static final BootWatcher LIZ = new BootWatcher();
    public static final AtomicReference<PTYAbility> LIZIZ = new AtomicReference<>(new PTYAbility(0));
    public static final Map<Integer, List<BootListener>> LIZJ = new LinkedHashMap();
    public static final Map<Integer, List<BootListener>> LIZLLL = new LinkedHashMap();

    public interface BootListener extends ReflectionCall {
        void onBoot();
    }

    public static final void LIZ(PTYAbility pTYAbility, Map<Integer, List<BootListener>> map) {
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            if (pTYAbility.contains(iIntValue)) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    try {
                        ((BootListener) it3.next()).onBoot();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                it2.remove();
            }
        }
    }

    public final synchronized void LIZIZ(PTYAbility pTYAbility, BootListener bootListener) {
        if (LIZIZ.get().contains(pTYAbility)) {
            try {
                bootListener.onBoot();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else {
            int status = pTYAbility.getStatus();
            Map<Integer, List<BootListener>> map = LIZLLL;
            if (!map.containsKey(Integer.valueOf(status))) {
                map.put(Integer.valueOf(status), new ArrayList());
            }
            List list = (List) ((LinkedHashMap) map).get(Integer.valueOf(status));
            if (list != null) {
                list.add(bootListener);
            }
        }
    }
}
