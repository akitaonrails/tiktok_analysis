package com.ss.android.ugc.aweme.ecommercebase.monitor;

import X.C098200Yq;
import X.C09Y4;
import X.C0PEM;
import X.C1091940eWO;
import X.C15438062q;
import X.C1758210vr1;
import X.C1758250vr5;
import X.C189200o6;
import X.C1AF0;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C786410Ut5;
import X.ChoreographerFrameCallbackC1758220vr2;
import X.EnumC1756020vnU;
import X.InterfaceC1748820vbs;
import Y.ARunnableS59S0300000_26;
import Y.ARunnableS95S0200000_26;
import android.os.Looper;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMeaningfulMonitorNewStandardSettings;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PageNodeMonitorService implements IPageNodeMonitorService {
    public final Map<String, C1758210vr1> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LIZ(String str) {
        C1758210vr1 c1758210vr1;
        Object c098200Yq;
        Object obj;
        Object obj2;
        if (C1758250vr5.LIZIZ() && (c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str)) != null) {
            try {
                if (c1758210vr1.LJII == -1) {
                    c1758210vr1.LJII = System.currentTimeMillis();
                    HashMap<String, Object> map = c1758210vr1.LIZJ;
                    Object obj3 = null;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get("previous_page");
                    }
                    HashMap<String, Object> map2 = c1758210vr1.LIZJ;
                    if (map2 != null) {
                        obj2 = map2.get("entrance_form");
                    } else {
                        obj2 = null;
                    }
                    HashMap<String, Object> map3 = c1758210vr1.LIZJ;
                    if (map3 != null) {
                        obj3 = map3.get("enter_from_info");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_stage_cost", c1758210vr1.LJII - c1758210vr1.LJ);
                    jSONObject.put("page_name", c1758210vr1.LIZ);
                    jSONObject.put("start_type", c1758210vr1.LIZIZ.getType());
                    jSONObject.put("start_to_now", System.currentTimeMillis() - c1758210vr1.LJ);
                    if (obj != null) {
                        jSONObject.put("previous_page", obj);
                    }
                    if (obj2 != null) {
                        jSONObject.put("enter_from", obj2);
                    }
                    if (obj3 != null) {
                        jSONObject.put("enter_from_info", obj3);
                    }
                    C1758210vr1.LIZJ("rd_tiktokec_meaningful_init", jSONObject);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final boolean LIZIZ(String str) {
        Object obj;
        if (!C1758250vr5.LIZIZ()) {
            return false;
        }
        C1758210vr1 c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str);
        if (c1758210vr1 != null && c1758210vr1.LJIIJJI == -1 && c1758210vr1.LIZIZ()) {
            c1758210vr1.LJIIJJI = System.currentTimeMillis();
            c1758210vr1.LIZ();
            HashMap<String, Object> map = c1758210vr1.LIZJ;
            Object obj2 = null;
            if (map != null) {
                obj = map.get("previous_page");
            } else {
                obj = null;
            }
            HashMap<String, Object> map2 = c1758210vr1.LIZJ;
            if (map2 != null) {
                obj2 = map2.get("entrance_form");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("init_stage_cost", c1758210vr1.LJII - c1758210vr1.LJ);
                jSONObject.put("data_mount_stage_cost", c1758210vr1.LJIIIIZZ - c1758210vr1.LJII);
                jSONObject.put("data_mount_cache_type", c1758210vr1.LJIIIZ.getType());
                jSONObject.put("image_fp_cost", c1758210vr1.LJIIJJI - c1758210vr1.LJ);
                jSONObject.put("image_stage_cost", c1758210vr1.LJIIJJI - c1758210vr1.LJIIIIZZ);
                jSONObject.put("page_name", c1758210vr1.LIZ);
                jSONObject.put("start_type", c1758210vr1.LIZIZ.getType());
                jSONObject.put("start_to_now", System.currentTimeMillis() - c1758210vr1.LJ);
                if (obj != null) {
                    jSONObject.put("previous_page", obj);
                }
                if (obj2 != null) {
                    jSONObject.put("enter_from", obj2);
                }
                C1758210vr1.LIZJ("rd_tiktokec_img_meaningful_rendered", jSONObject);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return true;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJIIIZ(String str) {
        Object c098200Yq;
        if (!C1758250vr5.LIZIZ()) {
            return;
        }
        C1758210vr1 c1758210vr1 = new C1758210vr1(str);
        this.LIZ.put(str, c1758210vr1);
        try {
            if (c1758210vr1.LJ == -1) {
                c1758210vr1.LJ = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_name", str);
                jSONObject.put("start_type", c1758210vr1.LIZIZ.getType());
                C1758210vr1.LIZJ("rd_tiktokec_meaningful_launch", jSONObject);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final boolean LIZJ(String str, Function0<Unit> function0) {
        C1758210vr1 c1758210vr1;
        if (!C1758250vr5.LIZIZ() || (c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str)) == null || c1758210vr1.LJIIL == -1) {
            return false;
        }
        if (C1758250vr5.LIZ().threadFreeCheck) {
            C786410Ut5.LJJZZIII(C1091940eWO.LIZ(), new ARunnableS95S0200000_26(c1758210vr1, function0, 19));
            return true;
        }
        c1758210vr1.getClass();
        if (EcMeaningfulMonitorNewStandardSettings.LIZ().enable) {
            C786410Ut5.v2().postFrameCallback(new ChoreographerFrameCallbackC1758220vr2(c1758210vr1, function0));
            return true;
        }
        c1758210vr1.LJIIIZ();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LIZLLL(String str, EnumC1756020vnU enumC1756020vnU) {
        C1758210vr1 c1758210vr1;
        Object c098200Yq;
        Object obj;
        Object obj2;
        if (C1758250vr5.LIZIZ() && (c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str)) != null) {
            try {
                if (c1758210vr1.LJIIL == -1) {
                    c1758210vr1.LJIIL = System.currentTimeMillis();
                    c1758210vr1.LJIIIZ = enumC1756020vnU;
                    c1758210vr1.LIZ();
                    HashMap<String, Object> map = c1758210vr1.LIZJ;
                    Object obj3 = null;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get("previous_page");
                    }
                    HashMap<String, Object> map2 = c1758210vr1.LIZJ;
                    if (map2 != null) {
                        obj2 = map2.get("entrance_form");
                    } else {
                        obj2 = null;
                    }
                    HashMap<String, Object> map3 = c1758210vr1.LIZJ;
                    if (map3 != null) {
                        obj3 = map3.get("enter_from_info");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_stage_cost", c1758210vr1.LJII - c1758210vr1.LJ);
                    jSONObject.put("data_mount_stage_cost", c1758210vr1.LJIIIIZZ - c1758210vr1.LJII);
                    jSONObject.put("full_data_mount_stage_cost", c1758210vr1.LJIIL - c1758210vr1.LJII);
                    jSONObject.put("data_mount_cache_type", enumC1756020vnU.getType());
                    jSONObject.put("page_name", c1758210vr1.LIZ);
                    jSONObject.put("start_type", c1758210vr1.LIZIZ.getType());
                    jSONObject.put("start_to_now", System.currentTimeMillis() - c1758210vr1.LJ);
                    if (obj != null) {
                        jSONObject.put("previous_page", obj);
                    }
                    if (obj2 != null) {
                        jSONObject.put("enter_from", obj2);
                    }
                    if (obj3 != null) {
                        jSONObject.put("enter_from_info", obj3);
                    }
                    C1758210vr1.LIZJ("rd_tiktokec_meaningful_full_data_mounted", jSONObject);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJII(LifecycleOwner lifecycleOwner, InterfaceC1748820vbs interfaceC1748820vbs) {
        PageMonitor pageMonitor = PageMonitor.LIZ;
        pageMonitor.getClass();
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            pageMonitor.LIZ(lifecycleOwner, interfaceC1748820vbs);
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C09Y4(lifecycleOwner, interfaceC1748820vbs, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final boolean LJ(String str, Function0<Unit> function0, Function0<Unit> function02) {
        C1758210vr1 c1758210vr1;
        if (!C1758250vr5.LIZIZ() || (c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str)) == null || !c1758210vr1.LIZIZ()) {
            return false;
        }
        if (C1758250vr5.LIZ().threadFreeCheck) {
            C786410Ut5.LJJZZIII(C1091940eWO.LIZ(), new ARunnableS59S0300000_26(c1758210vr1, function0, function02, 2));
            return true;
        }
        c1758210vr1.LJ(function0, function02);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJFF(String str, HashMap<String, Object> map, HashMap<String, Object> map2) {
        HashMap<String, Object> map3;
        C1758210vr1 c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str);
        if (c1758210vr1 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (c1758210vr1.LIZJ == null) {
                c1758210vr1.LIZJ = new HashMap<>(linkedHashMap);
            }
            if (map2 != null && (map3 = c1758210vr1.LIZJ) != null) {
                map3.putAll(map2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJI(String str, List<String> list, EnumC1756020vnU enumC1756020vnU) {
        C1758210vr1 c1758210vr1;
        Object c098200Yq;
        Object obj;
        Object obj2;
        if (C1758250vr5.LIZIZ() && (c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str)) != null) {
            try {
                if (!c1758210vr1.LIZIZ()) {
                    c1758210vr1.LJIIIIZZ = System.currentTimeMillis();
                    c1758210vr1.LJIIIZ = enumC1756020vnU;
                    c1758210vr1.LIZ();
                    HashMap<String, Object> map = c1758210vr1.LIZJ;
                    Object obj3 = null;
                    if (map == null) {
                        obj = null;
                    } else {
                        obj = map.get("previous_page");
                    }
                    HashMap<String, Object> map2 = c1758210vr1.LIZJ;
                    if (map2 != null) {
                        obj2 = map2.get("entrance_form");
                    } else {
                        obj2 = null;
                    }
                    HashMap<String, Object> map3 = c1758210vr1.LIZJ;
                    if (map3 != null) {
                        obj3 = map3.get("enter_from_info");
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_stage_cost", c1758210vr1.LJII - c1758210vr1.LJ);
                    jSONObject.put("data_mount_stage_cost", c1758210vr1.LJIIIIZZ - c1758210vr1.LJII);
                    jSONObject.put("data_mount_cache_type", enumC1756020vnU.getType());
                    jSONObject.put("page_name", c1758210vr1.LIZ);
                    jSONObject.put("start_type", c1758210vr1.LIZIZ.getType());
                    jSONObject.put("start_to_now", System.currentTimeMillis() - c1758210vr1.LJ);
                    if (obj != null) {
                        jSONObject.put("previous_page", obj);
                    }
                    if (obj2 != null) {
                        jSONObject.put("enter_from", obj2);
                    }
                    if (obj3 != null) {
                        jSONObject.put("enter_from_info", obj3);
                    }
                    C1758210vr1.LIZJ("rd_tiktokec_meaningful_data_mounted", jSONObject);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
            if (c1758210vr1.LIZLLL == null && (!list.isEmpty())) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    arrayList.add(new Object() { // from class: X.0vr6
                    });
                }
                c1758210vr1.LIZLLL = arrayList;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService
    public final void LJIIIIZZ(String str, HashMap<String, Object> map, Long l, String str2, String str3) {
        if (!C1758250vr5.LIZIZ()) {
            return;
        }
        C1758210vr1 c1758210vr1 = (C1758210vr1) ((LinkedHashMap) this.LIZ).get(str);
        if (c1758210vr1 != null && !c1758210vr1.LIZIZ() && c1758210vr1.LJII == -1 && c1758210vr1.LJIIJ == -1 && c1758210vr1.LJIIJJI == -1 && c1758210vr1.LJI == -1) {
            c1758210vr1.LJIIJJI(str2, l, map);
            return;
        }
        Map<String, C1758210vr1> map2 = this.LIZ;
        C1758210vr1 c1758210vr12 = new C1758210vr1(str);
        if (str3 != null) {
            c1758210vr12.LJFF = str3;
        }
        c1758210vr12.LJIIJJI(str2, l, map);
        map2.put(str, c1758210vr12);
    }
}
