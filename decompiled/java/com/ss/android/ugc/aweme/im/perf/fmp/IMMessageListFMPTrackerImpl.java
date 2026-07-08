package com.ss.android.ugc.aweme.im.perf.fmp;

import X.C01GW;
import X.C09CT;
import X.C0PEM;
import X.C0W8I;
import X.C13LP;
import X.C15438062q;
import X.C1807710x8r;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187308hb;
import X.C2187508hd;
import X.C2296808zG;
import X.C23250099c;
import X.C2485509ob;
import X.C2502509rL;
import X.C452501pT;
import X.EnumC2187408hc;
import X.InterfaceC2187608he;
import X.InterfaceC2187708hf;
import X.InterfaceC2187908hh;
import X.InterfaceC911210Zot;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class IMMessageListFMPTrackerImpl implements InterfaceC911210Zot {
    public final C1807710x8r LIZ;
    public long LIZIZ = -1;
    public final Set<String> LIZJ = new LinkedHashSet();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(499));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(502));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(501));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(500));
    public long LJII = -1;
    public boolean LJIIIIZZ = true;

    public static void LJI() {
        C0W8I.LIZ.getClass();
        if (C0W8I.LIZIZ() && !C2485509ob.LIZ()) {
            throw new IllegalStateException("Call in Main Thread!!!");
        }
    }

    @Override // X.InterfaceC911210Zot
    public final void LIZ() {
        this.LIZIZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC911210Zot
    public final void onPause() {
        this.LJII = System.currentTimeMillis();
    }

    public static abstract class FMPResult implements Serializable {
        public final transient Map<String, InterfaceC2187708hf> LL;

        @C09CT("component_completion_times")
        public final Map<String, List<ComponentCompletionTime>> componentCompletionTimes;

        @C09CT("component_list_not_rendered")
        public final Map<String, List<ComponentNotRendered>> componentListNotRendered;

        @C09CT("uuid_to_mp_component")
        public final Map<String, String> meaningfulComponentMapListForJson;

        @C09CT("success")
        public final boolean success;

        @C09CT("successful_component_id_list")
        public final Map<String, List<String>> successfulComponentIdList;

        @C09CT("total_time_ms")
        public final Long totalTime;

        public static final class Failed extends FMPResult {

            @C09CT("load_rate")
            public final float loadRate;

            @C09CT("load_rate_list")
            public final Map<String, Float> loadRateList;

            public final float getLoadRate() {
                return this.loadRate;
            }

            public final Map<String, Float> getLoadRateList() {
                return this.loadRateList;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Long l, Map<String, ? extends InterfaceC2187708hf> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<ComponentCompletionTime>> map3, Map<String, ? extends List<ComponentNotRendered>> map4) {
                Collection collectionValues;
                int size;
                float size2;
                List<ComponentNotRendered> list;
                super(l, map, map2, map3, map4, false);
                LinkedHashMap linkedHashMap = null;
                float fLJJIZ = 0.0f;
                if (map2 != null) {
                    linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                    Iterator<T> it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Object key = entry.getKey();
                        Object key2 = entry.getKey();
                        int size3 = ((List) entry.getValue()).size();
                        if (map4 != null && (list = map4.get(key2)) != null) {
                            size = list.size();
                        } else {
                            size = 0;
                        }
                        int i = size3 + size;
                        if (i == 0) {
                            size2 = 0.0f;
                        } else {
                            size2 = r1.size() / i;
                        }
                        linkedHashMap.put(key, Float.valueOf(size2));
                    }
                }
                this.loadRateList = linkedHashMap;
                if (linkedHashMap != null && (collectionValues = linkedHashMap.values()) != null && (!collectionValues.isEmpty())) {
                    fLJJIZ = (float) C13LP.LJJIZ(collectionValues);
                }
                this.loadRate = fLJJIZ;
            }
        }

        public static final class Success extends FMPResult {

            @C09CT("most_time_consuming_component")
            public final ComponentCompletionTime mostTimeConsumingComponent;

            public final ComponentCompletionTime getMostTimeConsumingComponent() {
                return this.mostTimeConsumingComponent;
            }

            public Success(Long l, Map<String, ? extends InterfaceC2187708hf> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<ComponentCompletionTime>> map3) {
                Collection<? extends List<ComponentCompletionTime>> collectionValues;
                super(l, map, map2, map3, C2097608Jq.LJ(), true);
                ComponentCompletionTime componentCompletionTime = null;
                Object next = null;
                componentCompletionTime = null;
                if (map3 != null && (collectionValues = map3.values()) != null) {
                    Iterator it2 = C15438062q.LJIJJLI(collectionValues).iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long j = ((ComponentCompletionTime) next).completionTimeMs;
                            do {
                                Object next2 = it2.next();
                                long j2 = ((ComponentCompletionTime) next2).completionTimeMs;
                                if (j < j2) {
                                    next = next2;
                                    j = j2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    componentCompletionTime = (ComponentCompletionTime) next;
                }
                this.mostTimeConsumingComponent = componentCompletionTime;
            }
        }

        public final Map<String, List<ComponentCompletionTime>> getComponentCompletionTimes() {
            return this.componentCompletionTimes;
        }

        public final Map<String, List<ComponentNotRendered>> getComponentListNotRendered() {
            return this.componentListNotRendered;
        }

        public final Map<String, InterfaceC2187708hf> getMeaningfulComponentMapList() {
            return this.LL;
        }

        public final Map<String, String> getMeaningfulComponentMapListForJson() {
            return this.meaningfulComponentMapListForJson;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final Map<String, List<String>> getSuccessfulComponentIdList() {
            return this.successfulComponentIdList;
        }

        public final Long getTotalTime() {
            return this.totalTime;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FMPResult(Long l, Map<String, ? extends InterfaceC2187708hf> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<ComponentCompletionTime>> map3, Map<String, ? extends List<ComponentNotRendered>> map4, boolean z) {
            LinkedHashMap linkedHashMap;
            this.totalTime = l;
            this.LL = map;
            this.successfulComponentIdList = map2;
            this.componentCompletionTimes = map3;
            this.componentListNotRendered = map4;
            this.success = z;
            if (map != 0) {
                linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((InterfaceC2187708hf) entry.getValue()).LIZ());
                }
            } else {
                linkedHashMap = null;
            }
            this.meaningfulComponentMapListForJson = linkedHashMap;
        }
    }

    public IMMessageListFMPTrackerImpl(C1807710x8r c1807710x8r) {
        this.LIZ = c1807710x8r;
    }

    @Override // X.InterfaceC911210Zot
    public final void LIZIZ(Map<String, String> map) {
        this.LJIIIIZZ = false;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), new C2502509rL(CoroutineExceptionHandler.LJJLIL, 2), null, new C2187308hb(this, map, null), 2);
    }

    @Override // X.InterfaceC911210Zot
    public final void LJ(List<String> list) {
        LJI();
        this.LIZJ.addAll(list);
    }

    @Override // X.InterfaceC911210Zot
    public final void LJFF(String str) {
        LJI();
        if (this.LJIIIIZZ && !((Map) this.LJ.getValue()).containsKey(str)) {
            ((Map) this.LJ.getValue()).put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static final class ComponentNotRendered implements Serializable {
        public final transient InterfaceC2187908hh componentId;

        @C09CT("component_id")
        public final String componentIdString;
        public final transient EnumC2187408hc failureReason;

        @C09CT("failure_reason")
        public final String failureReasonString;

        public ComponentNotRendered(InterfaceC2187908hh interfaceC2187908hh, EnumC2187408hc enumC2187408hc) {
            this.componentId = interfaceC2187908hh;
            this.failureReason = enumC2187408hc;
            this.failureReasonString = enumC2187408hc.getEtString();
            this.componentIdString = interfaceC2187908hh.LIZ();
        }
    }

    @Override // X.InterfaceC911210Zot
    public final void LIZJ(String str, InterfaceC2187708hf interfaceC2187708hf) {
        LJI();
        if (this.LJIIIIZZ && !((Map) this.LIZLLL.getValue()).containsKey(str)) {
            ((Map) this.LIZLLL.getValue()).put(str, Long.valueOf(System.currentTimeMillis()));
            ((Map) this.LJFF.getValue()).put(str, interfaceC2187708hf);
        }
    }

    @Override // X.InterfaceC911210Zot
    public final void LIZLLL(String str, InterfaceC2187608he interfaceC2187608he) {
        LJI();
        if (!this.LJIIIIZZ) {
            return;
        }
        Map map = (Map) this.LJI.getValue();
        Object arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        ((List) arrayList).add(new C2187508hd(interfaceC2187608he));
    }

    public static final class ComponentCompletionTime implements Serializable {

        @C09CT("completion_time_ms")
        public final long completionTimeMs;

        @C09CT("component_id")
        public final String componentId;
        public final transient InterfaceC2187708hf meaningfulComponent;

        @C09CT("meaningful_component_id")
        public final String meaningfulComponentId;

        @C09CT("report_component_id")
        public final String reportComponentId;
        public final transient InterfaceC2187608he reportableComponent;

        public ComponentCompletionTime(InterfaceC2187708hf interfaceC2187708hf, InterfaceC2187608he interfaceC2187608he, long j) {
            this.meaningfulComponent = interfaceC2187708hf;
            this.reportableComponent = interfaceC2187608he;
            this.completionTimeMs = j;
            this.meaningfulComponentId = interfaceC2187708hf.LIZ();
            this.reportComponentId = interfaceC2187608he.LIZ();
            this.componentId = interfaceC2187608he.LJJJ().LIZ();
        }
    }
}
