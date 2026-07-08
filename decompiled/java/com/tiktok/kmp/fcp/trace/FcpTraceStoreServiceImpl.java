package com.tiktok.kmp.fcp.trace;

import X.C707940Rpo;
import X.InterfaceC699620RcO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.kmp.fcp.service.IFcpTraceStoreService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FcpTraceStoreServiceImpl implements IFcpTraceStoreService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Rpo] */
    @Override // com.tiktok.kmp.fcp.service.IFcpTraceStoreService
    public final C707940Rpo LIZ() {
        return new InterfaceC699620RcO() { // from class: X.0Rpo
            public final Map<C707900Rpk, List<C707890Rpj>> LIZ = new LinkedHashMap();
            public final Map<String, C707900Rpk> LIZIZ = new LinkedHashMap();
            public final C707960Rpq LIZJ = new C707960Rpq();

            public static long LJII() {
                C19990513Jn c19990513JnNow = C19267610Zm.LIZ.now();
                return (c19990513JnNow.getEpochSeconds() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + ((long) (c19990513JnNow.getNanosecondsOfSecond() / 1000000));
            }

            @Override // X.InterfaceC699620RcO
            public final Map<C707900Rpk, List<C707890Rpj>> LIZ() {
                LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZ.size());
                for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
                    linkedHashMap.put(entry.getKey(), C13LP.LLIIII((Iterable) entry.getValue()));
                }
                return linkedHashMap;
            }

            @Override // X.InterfaceC699620RcO
            public final void LIZJ() {
                C707960Rpq c707960Rpq = this.LIZJ;
                c707960Rpq.LIZ.clear();
                c707960Rpq.LIZIZ.clear();
                c707960Rpq.LIZJ.clear();
                c707960Rpq.LIZLLL.clear();
                c707960Rpq.LJ.clear();
                c707960Rpq.LJFF.clear();
                c707960Rpq.LJI.clear();
            }

            @Override // X.InterfaceC699620RcO
            public final void clear() {
                C707960Rpq c707960Rpq = this.LIZJ;
                Map<C707900Rpk, List<C707890Rpj>> map = this.LIZ;
                Map<String, C707900Rpk> map2 = this.LIZIZ;
                c707960Rpq.getClass();
                Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
                while (it2.hasNext()) {
                    List<C707890Rpj> list = (List) ((Map.Entry) it2.next()).getValue();
                    for (C707890Rpj c707890Rpj : list) {
                        AbstractC707990Rpt abstractC707990Rpt = c707890Rpj.LIZIZ;
                        if (abstractC707990Rpt instanceof C708030Rpx) {
                            C708030Rpx c708030Rpx = (C708030Rpx) abstractC707990Rpt;
                            C707930Rpn c707930Rpn = c708030Rpx.LIZ;
                            c707960Rpq.LIZJ(c707930Rpn.LIZ);
                            c707960Rpq.LIZJ(c707930Rpn.LIZIZ);
                            c707960Rpq.LIZJ(c707930Rpn.LIZJ);
                            c707960Rpq.LIZJ(c707930Rpn.LIZLLL);
                            C707930Rpn c707930Rpn2 = c708030Rpx.LIZ;
                            c707930Rpn2.LIZ = null;
                            c707930Rpn2.LIZIZ = null;
                            c707930Rpn2.LIZJ = null;
                            c707930Rpn2.LIZLLL = null;
                            if (c707960Rpq.LIZIZ.size() < 320) {
                                c707960Rpq.LIZIZ.addLast(c707890Rpj);
                            }
                        } else if (abstractC707990Rpt instanceof C708000Rpu) {
                            C708000Rpu c708000Rpu = (C708000Rpu) abstractC707990Rpt;
                            c707960Rpq.LIZJ(c708000Rpu.LIZ.LIZ);
                            c708000Rpu.LIZ.LIZ = null;
                            if (c707960Rpq.LIZJ.size() < 320) {
                                c707960Rpq.LIZJ.addLast(c707890Rpj);
                            }
                        } else {
                            if (!(abstractC707990Rpt instanceof C708020Rpw)) {
                                throw new C1954807lC();
                            }
                            C708020Rpw c708020Rpw = (C708020Rpw) abstractC707990Rpt;
                            C707870Rph c707870Rph = c708020Rpw.LIZ;
                            c707960Rpq.LIZJ(c707870Rph.LIZ);
                            c707960Rpq.LIZJ(c707870Rph.LIZIZ);
                            C707870Rph c707870Rph2 = c708020Rpw.LIZ;
                            c707870Rph2.LIZ = null;
                            c707870Rph2.LIZIZ = null;
                            if (c707960Rpq.LIZLLL.size() < 320) {
                                c707960Rpq.LIZLLL.addLast(c707890Rpj);
                            }
                        }
                    }
                    list.clear();
                    if (c707960Rpq.LJI.size() < 80) {
                        c707960Rpq.LJI.addLast(list);
                    }
                }
                Iterator it3 = ((LinkedHashMap) map2).entrySet().iterator();
                while (it3.hasNext()) {
                    C707900Rpk c707900Rpk = (C707900Rpk) ((Map.Entry) it3.next()).getValue();
                    c707900Rpk.LIZJ = C2097608Jq.LJ();
                    if (c707960Rpq.LIZ.size() < 80) {
                        c707960Rpq.LIZ.addLast(c707900Rpk);
                    }
                }
                ((LinkedHashMap) this.LIZ).clear();
                ((LinkedHashMap) this.LIZIZ).clear();
            }

            public final void LJI(C707900Rpk c707900Rpk, C707890Rpj c707890Rpj) {
                Object obj;
                Map<String, C707900Rpk> map = this.LIZIZ;
                String str = c707900Rpk.LIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    linkedHashMap.put(str, c707900Rpk);
                    obj = c707900Rpk;
                } else {
                    obj = obj2;
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LIZ;
                Object arrayList = linkedHashMap2.get(obj);
                if (arrayList == null) {
                    arrayList = (List) this.LIZJ.LJI.LJIIZILJ();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    linkedHashMap2.put(obj, arrayList);
                }
                ((List) arrayList).add(c707890Rpj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final C707920Rpm LJFF(Boolean bool, String str, Map<String, ? extends Object> map) {
                if (bool == 0 && str == null && map == null) {
                    return null;
                }
                C707920Rpm c707920RpmLIZ = this.LIZJ.LIZ();
                c707920RpmLIZ.LIZ = bool;
                if (str != null || map != null) {
                    C707980Rps c707980RpsLIZIZ = this.LIZJ.LIZIZ();
                    c707980RpsLIZIZ.LIZ = str;
                    c707980RpsLIZIZ.LIZIZ = map;
                    c707920RpmLIZ.LIZIZ = c707980RpsLIZIZ;
                }
                return c707920RpmLIZ;
            }

            public final C707900Rpk LJIIIIZZ(String str, String str2, Map<String, ? extends Object> map) {
                EnumC707860Rpg enumC707860RpgValueOf;
                C707900Rpk c707900Rpk;
                C707900Rpk c707900Rpk2 = (C707900Rpk) ((LinkedHashMap) this.LIZIZ).get(str);
                if (c707900Rpk2 != null) {
                    if (map != null && !map.isEmpty()) {
                        c707900Rpk2.LIZJ = map;
                    }
                    return c707900Rpk2;
                }
                try {
                    enumC707860RpgValueOf = EnumC707860Rpg.valueOf(str2.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    enumC707860RpgValueOf = EnumC707860Rpg.NORMAL;
                }
                C13E8<C707900Rpk> c13e8 = this.LIZJ.LIZ;
                int size = c13e8.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        c707900Rpk = c13e8.get(i);
                        if (Intrinsics.LJFF(c707900Rpk.LIZ, str) && c707900Rpk.LIZIZ == enumC707860RpgValueOf) {
                            c13e8.remove(i);
                            break;
                        }
                        i++;
                    } else {
                        c707900Rpk = new C707900Rpk(str, enumC707860RpgValueOf);
                        break;
                    }
                }
                if (map != null && !map.isEmpty()) {
                    c707900Rpk.LIZJ = map;
                }
                this.LIZIZ.put(str, c707900Rpk);
                return c707900Rpk;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC699620RcO
            public final void LIZIZ(String str, String str2, Boolean bool, Boolean bool2, Map<String, String> map, Map<String, ? extends Object> map2) {
                C707960Rpq c707960Rpq = this.LIZJ;
                long jLJII = LJII();
                C707890Rpj c707890RpjLJIIZILJ = c707960Rpq.LIZLLL.LJIIZILJ();
                if (c707890RpjLJIIZILJ != null) {
                    c707890RpjLJIIZILJ.LIZ = jLJII;
                } else {
                    c707890RpjLJIIZILJ = new C707890Rpj(jLJII, new C708020Rpw(new C707870Rph(0)));
                }
                C707870Rph c707870Rph = ((C708020Rpw) c707890RpjLJIIZILJ.LIZIZ).LIZ;
                if (bool != 0) {
                    C707920Rpm c707920RpmLIZ = this.LIZJ.LIZ();
                    c707920RpmLIZ.LIZ = bool;
                    c707870Rph.LIZ = c707920RpmLIZ;
                }
                C707920Rpm c707920RpmLIZ2 = this.LIZJ.LIZ();
                c707920RpmLIZ2.LIZ = bool2;
                if (map != null) {
                    C707980Rps c707980RpsLIZIZ = this.LIZJ.LIZIZ();
                    c707980RpsLIZIZ.LIZ = "";
                    c707980RpsLIZIZ.LIZIZ = map;
                    c707920RpmLIZ2.LIZIZ = c707980RpsLIZIZ;
                }
                c707870Rph.LIZIZ = c707920RpmLIZ2;
                LJI(LJIIIIZZ(str, str2, map2), c707890RpjLJIIZILJ);
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Boolean] */
            @Override // X.InterfaceC699620RcO
            public final void LJ(String str, String str2, boolean z, String str3, boolean z2, String str4, List<String> list, String str5, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
                C707960Rpq c707960Rpq = this.LIZJ;
                long jLJII = LJII();
                C707890Rpj c707890RpjLJIIZILJ = c707960Rpq.LIZJ.LJIIZILJ();
                if (c707890RpjLJIIZILJ != null) {
                    c707890RpjLJIIZILJ.LIZ = jLJII;
                } else {
                    c707890RpjLJIIZILJ = new C707890Rpj(jLJII, new C708000Rpu(new C707880Rpi(0)));
                }
                C707880Rpi c707880Rpi = ((C708000Rpu) c707890RpjLJIIZILJ.LIZIZ).LIZ;
                C707980Rps c707980RpsLIZIZ = this.LIZJ.LIZIZ();
                c707980RpsLIZIZ.LIZ = str3;
                C13DA c13da = new C13DA();
                c13da.put("participated", Boolean.valueOf(z2));
                c13da.put("decision_maker", str4);
                c13da.put("winner", list);
                if (str5 != null) {
                    c13da.put("cause", str5);
                }
                if (map2 != null && !map2.isEmpty()) {
                    c13da.putAll(map2);
                }
                c707980RpsLIZIZ.LIZIZ = c13da.build();
                C707920Rpm c707920RpmLIZ = this.LIZJ.LIZ();
                c707920RpmLIZ.LIZ = Boolean.valueOf(z);
                c707920RpmLIZ.LIZIZ = c707980RpsLIZIZ;
                c707880Rpi.LIZ = c707920RpmLIZ;
                LJI(LJIIIIZZ(str, str2, map), c707890RpjLJIIZILJ);
            }

            @Override // X.InterfaceC699620RcO
            public final void LIZLLL(String str, String str2, Boolean bool, String str3, Map<String, ? extends Object> map, Boolean bool2, String str4, Map<String, ? extends Object> map2, Boolean bool3, String str5, Map<String, ? extends Object> map3, Boolean bool4, String str6, Map<String, ? extends Object> map4, Map<String, ? extends Object> map5) {
                C707960Rpq c707960Rpq = this.LIZJ;
                long jLJII = LJII();
                C707890Rpj c707890RpjLJIIZILJ = c707960Rpq.LIZIZ.LJIIZILJ();
                if (c707890RpjLJIIZILJ != null) {
                    c707890RpjLJIIZILJ.LIZ = jLJII;
                } else {
                    c707890RpjLJIIZILJ = new C707890Rpj(jLJII, new C708030Rpx(new C707930Rpn(0)));
                }
                C707930Rpn c707930Rpn = ((C708030Rpx) c707890RpjLJIIZILJ.LIZIZ).LIZ;
                c707930Rpn.LIZ = LJFF(bool, str3, map);
                c707930Rpn.LIZIZ = LJFF(bool2, str4, map2);
                c707930Rpn.LIZJ = LJFF(bool3, str5, map3);
                c707930Rpn.LIZLLL = LJFF(bool4, str6, map4);
                LJI(LJIIIIZZ(str, str2, map5), c707890RpjLJIIZILJ);
            }
        };
    }
}
