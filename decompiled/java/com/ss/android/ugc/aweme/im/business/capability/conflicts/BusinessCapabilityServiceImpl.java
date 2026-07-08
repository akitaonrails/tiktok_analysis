package com.ss.android.ugc.aweme.im.business.capability.conflicts;

import X.AbstractC1360960lWI;
import X.AbstractC1883407Zg;
import X.AnonymousClass0951;
import X.C01GW;
import X.C08CX;
import X.C098200Yq;
import X.C09IC;
import X.C1360910lWD;
import X.C1360950lWH;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1883107Zd;
import X.C1883307Zf;
import X.C1883507Zh;
import X.C189200o6;
import X.C1954807lC;
import X.C19719612Di;
import X.C1BNE;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C259800zU;
import X.C269970Ai3;
import X.C349380Dmq;
import X.EnumC1355290lN9;
import X.EnumC1355300lNA;
import X.InterfaceC1360930lWF;
import Y.AComparatorS24S0000000_5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class BusinessCapabilityServiceImpl implements BusinessCapabilityService {
    public final Object LIZIZ = new Object();
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;
    public final Set<EnumC1355300lNA> LJ;
    public final Map<EnumC1355290lN9, AbstractC1360960lWI> LJFF;

    public final void LJIIIZ() {
        C2252321DDq c2252321DDq = this.LIZJ;
        Set setLLIIJI = C13LP.LLIIJI(this.LJ);
        Map<EnumC1355290lN9, AbstractC1360960lWI> map = this.LJFF;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), ((AbstractC1360960lWI) entry.getValue()).LIZ());
        }
        c2252321DDq.setValue(new C1883107Zd(setLLIIJI, linkedHashMap));
    }

    public BusinessCapabilityServiceImpl() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1883107Zd.LIZJ);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJ = new LinkedHashSet();
        this.LJFF = new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final AnonymousClass0951 LJI() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final void LIZ(EnumC1355300lNA enumC1355300lNA) {
        synchronized (this.LIZIZ) {
            try {
                if (this.LJ.add(enumC1355300lNA)) {
                    LJIIIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final void LIZIZ(EnumC1355300lNA enumC1355300lNA) {
        Set<? extends EnumC1355290lN9> setLLIIJI;
        synchronized (this.LIZIZ) {
            try {
                Set setEntrySet = ((LinkedHashMap) this.LJFF).entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setEntrySet) {
                    if (((AbstractC1360960lWI) ((Map.Entry) obj).getValue()).LIZ() == enumC1355300lNA) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((EnumC1355290lN9) ((Map.Entry) it2.next()).getKey());
                }
                setLLIIJI = C13LP.LLIIJI(arrayList2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!setLLIIJI.isEmpty()) {
            LJ(enumC1355300lNA, setLLIIJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final void LIZJ(EnumC1355300lNA enumC1355300lNA) {
        synchronized (this.LIZIZ) {
            try {
                if (C19719612Di.LJJIII(((LinkedHashMap) this.LJFF).entrySet(), new AwS600S0100000_21(enumC1355300lNA, 128), true) | this.LJ.remove(enumC1355300lNA)) {
                    LJIIIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final EnumC1355300lNA LIZLLL(EnumC1355290lN9 enumC1355290lN9) {
        EnumC1355300lNA enumC1355300lNALIZ;
        synchronized (this.LIZIZ) {
            try {
                AbstractC1360960lWI abstractC1360960lWI = (AbstractC1360960lWI) ((LinkedHashMap) this.LJFF).get(enumC1355290lN9);
                if (abstractC1360960lWI != null) {
                    enumC1355300lNALIZ = abstractC1360960lWI.LIZ();
                } else {
                    enumC1355300lNALIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return enumC1355300lNALIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final void LJ(EnumC1355300lNA enumC1355300lNA, Set<? extends EnumC1355290lN9> set) {
        EnumC1355300lNA enumC1355300lNALIZ;
        synchronized (this.LIZIZ) {
            try {
                boolean z = false;
                for (EnumC1355290lN9 enumC1355290lN9 : set) {
                    AbstractC1360960lWI abstractC1360960lWI = (AbstractC1360960lWI) ((LinkedHashMap) this.LJFF).get(enumC1355290lN9);
                    if (abstractC1360960lWI != null) {
                        enumC1355300lNALIZ = abstractC1360960lWI.LIZ();
                    } else {
                        enumC1355300lNALIZ = null;
                    }
                    if (enumC1355300lNALIZ == enumC1355300lNA) {
                        this.LJFF.remove(enumC1355290lN9);
                        z = true;
                    }
                }
                if (z) {
                    LJIIIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C20684815ws.LJIILLIIL("ttsocial_im_business_capability_release", C2097608Jq.LJII(new Pair("business_domain", enumC1355300lNA.toString()), new Pair("capabilities", C13LP.LJLLLL(new AComparatorS24S0000000_5(95), set).toString())));
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final AbstractC1883407Zg LJII(EnumC1355300lNA enumC1355300lNA, Set<? extends EnumC1355290lN9> set) {
        return LJFF(enumC1355300lNA, set, C1360910lWD.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final boolean LJIIIIZZ(EnumC1355300lNA enumC1355300lNA, Set<? extends EnumC1355290lN9> set) {
        C01GW c01gw = C269970Ai3.LIZ;
        if (!C269970Ai3.LIZIZ) {
            return true;
        }
        synchronized (this.LIZIZ) {
            try {
                if (!this.LJ.contains(enumC1355300lNA)) {
                    return false;
                }
                return ((ArrayList) LJIIJ(enumC1355300lNA, set)).isEmpty();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final List<Pair<EnumC1355300lNA, String>> LJIIJ(EnumC1355300lNA enumC1355300lNA, Set<? extends EnumC1355290lN9> set) {
        ArrayList arrayList = new ArrayList();
        for (EnumC1355290lN9 enumC1355290lN9 : set) {
            AbstractC1360960lWI abstractC1360960lWI = (AbstractC1360960lWI) ((LinkedHashMap) this.LJFF).get(enumC1355290lN9);
            if (abstractC1360960lWI != null && abstractC1360960lWI.LIZ() != enumC1355300lNA) {
                if (abstractC1360960lWI instanceof C349380Dmq) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1355290lN9);
                    sbLIZ.append(" is held by ");
                    sbLIZ.append((Object) null);
                    sbLIZ.append(" in strict mode (not preemptable)");
                    arrayList.add(new Pair(null, C2188811AlT.LIZIZ(sbLIZ)));
                } else if (abstractC1360960lWI instanceof C1360950lWH) {
                    C1360950lWH c1360950lWH = (C1360950lWH) abstractC1360960lWI;
                    if (!c1360950lWH.LIZIZ.LIZ.contains(enumC1355300lNA)) {
                        EnumC1355300lNA enumC1355300lNA2 = c1360950lWH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(enumC1355290lN9);
                        sbLIZ2.append(" is held by ");
                        sbLIZ2.append(c1360950lWH.LIZ);
                        sbLIZ2.append("; ");
                        sbLIZ2.append(enumC1355300lNA);
                        sbLIZ2.append(" not in its preemptableBy whitelist");
                        arrayList.add(new Pair(enumC1355300lNA2, C2188811AlT.LIZIZ(sbLIZ2)));
                    }
                } else {
                    throw new C1954807lC();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.13BV] */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService
    public final AbstractC1883407Zg LJFF(EnumC1355300lNA enumC1355300lNA, Set<? extends EnumC1355290lN9> set, C1360910lWD c1360910lWD) {
        String str;
        String str2;
        Collection collection;
        C1883307Zf c1883307Zf;
        if (!C269970Ai3.LIZIZ) {
            return new AbstractC1883407Zg() { // from class: X.07Zh
            };
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C13BV.INSTANCE;
        AbstractC1883407Zg c1883307Zf2 = new AbstractC1883407Zg() { // from class: X.07Zh
        };
        synchronized (this.LIZIZ) {
            try {
                if (!this.LJ.contains(enumC1355300lNA)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Domain ");
                    sbLIZ.append(enumC1355300lNA);
                    sbLIZ.append(" is not registered");
                    c1883307Zf2 = new C1883307Zf(C2188811AlT.LIZIZ(sbLIZ), C08CX.INSTANCE);
                } else {
                    List<Pair<EnumC1355300lNA, String>> listLJIIJ = LJIIJ(enumC1355300lNA, set);
                    ArrayList arrayList = (ArrayList) listLJIIJ;
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((EnumC1355300lNA) ((Pair) it2.next()).getFirst());
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJIIJ, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add((String) ((Pair) it3.next()).getSecond());
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Preemption blocked: ");
                        sbLIZ2.append(C13LP.LJJLIIIJ(arrayList3, null, null, null, 0, null, null, 63));
                        c1883307Zf2 = new C1883307Zf(C2188811AlT.LIZIZ(sbLIZ2), setLLIIJI);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (EnumC1355290lN9 enumC1355290lN9 : set) {
                            AbstractC1360960lWI abstractC1360960lWI = (AbstractC1360960lWI) ((LinkedHashMap) this.LJFF).get(enumC1355290lN9);
                            if ((abstractC1360960lWI instanceof C1360950lWH) && ((C1360950lWH) abstractC1360960lWI).LIZ != enumC1355300lNA) {
                                EnumC1355300lNA enumC1355300lNA2 = ((C1360950lWH) abstractC1360960lWI).LIZ;
                                Object pair = linkedHashMap.get(enumC1355300lNA2);
                                if (pair == null) {
                                    pair = new Pair(((C1360950lWH) abstractC1360960lWI).LIZIZ.LIZIZ, new LinkedHashSet());
                                    linkedHashMap.put(enumC1355300lNA2, pair);
                                }
                                ((Set) ((Pair) pair).getSecond()).add(enumC1355290lN9);
                            }
                        }
                        Iterator<? extends EnumC1355290lN9> it4 = set.iterator();
                        while (it4.hasNext()) {
                            this.LJFF.put(it4.next(), new C1360950lWH(enumC1355300lNA, c1360910lWD));
                        }
                        LJIIIZ();
                        Collection<Pair> collectionValues = linkedHashMap.values();
                        ?? arrayList4 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                        for (Pair pair2 : collectionValues) {
                            arrayList4.add(new Pair((InterfaceC1360930lWF) pair2.getFirst(), C13LP.LLIIJI((Set) pair2.getSecond())));
                        }
                        c259800zU.element = arrayList4;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (Pair pair3 : (Iterable) c259800zU.element) {
            try {
                ((InterfaceC1360930lWF) pair3.getFirst()).LIZ(enumC1355300lNA, (Set) pair3.getSecond());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("business_domain", enumC1355300lNA.toString());
        pairArr[1] = new Pair("capabilities", C13LP.LJLLLL(new AComparatorS24S0000000_5(94), set).toString());
        if (Intrinsics.LJFF(c1360910lWD, C1360910lWD.LIZJ)) {
            str = "strict";
        } else {
            str = "preemption";
        }
        pairArr[2] = new Pair("policy", str);
        LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(pairArr);
        if (c1883307Zf2 instanceof C1883507Zh) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (!(c1883307Zf2 instanceof C1883307Zf) || (c1883307Zf = (C1883307Zf) c1883307Zf2) == null || (collection = c1883307Zf.LIZIZ) == null) {
            collection = C08CX.INSTANCE;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMapLJII);
        linkedHashMap2.put("result", str2);
        if (!collection.isEmpty()) {
            linkedHashMap2.put("conflict_owner", C13LP.LJLLLL(new AComparatorS24S0000000_5(96), collection).toString());
        }
        C20684815ws.LJIILLIIL("ttsocial_im_business_capability_request_result", linkedHashMap2);
        return c1883307Zf2;
    }
}
