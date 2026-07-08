package com.bytedance.pumbaa.utility.method_id;

import X.C01GW;
import X.C0W9T;
import X.C0W9U;
import X.C19719512Dh;
import X.C19719612Di;
import X.C452501pT;
import X.C823280WRi;
import X.C838890WvX;
import X.C838970Wvf;
import X.C838980Wvg;
import X.C838990Wvh;
import X.C839010Wvj;
import X.C839040Wvm;
import com.bytedance.bpea.transmit.IRegister;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class MethodIDManager {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static int LJFF = -1;
    public static final C01GW LJI = C452501pT.LIZIZ(new C839040Wvm());

    public static JSONObject LIZJ() {
        if (!LIZIZ) {
            return null;
        }
        JSONObject jSONObject = C838980Wvg.LIZIZ;
        C838980Wvg.LIZIZ = null;
        if (LJ) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("config", C838980Wvg.LIZLLL);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set LIZLLL() {
        LinkedHashSet linkedHashSet = null;
        if (!LIZIZ) {
            return null;
        }
        Long lValueOf = LIZLLL ? Long.valueOf(System.nanoTime()) : null;
        try {
            if (LIZJ == 3) {
                C838990Wvh c838990Wvh = C838990Wvh.LIZ;
                int i = LJFF;
                c838990Wvh.getClass();
                Object objLIZLLL = C0W9U.LIZLLL(i);
                List list = objLIZLLL instanceof List ? (List) objLIZLLL : null;
                if (!(list == null || list.isEmpty())) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (int size = list.size() - 1; -1 < size; size--) {
                        linkedHashSet2.add(ListProtector.get(list, size));
                    }
                    linkedHashSet = linkedHashSet2;
                }
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZ(System.nanoTime() - lValueOf.longValue());
                }
                return linkedHashSet;
            }
            C838990Wvh c838990Wvh2 = C838990Wvh.LIZ;
            int i2 = LJFF;
            c838990Wvh2.getClass();
            C839010Wvj c839010WvjLIZIZ = C838990Wvh.LIZIZ(i2);
            if (c839010WvjLIZIZ == null) {
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZ(System.nanoTime() - lValueOf.longValue());
                }
                return null;
            }
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            while (c839010WvjLIZIZ != null) {
                Integer num = (Integer) c839010WvjLIZIZ.LIZ;
                if (num != null) {
                    linkedHashSet3.add(Integer.valueOf(num.intValue()));
                }
                c839010WvjLIZIZ = c839010WvjLIZIZ.LIZIZ;
            }
            if (LIZLLL && lValueOf != null) {
                C838980Wvg.LIZ(System.nanoTime() - lValueOf.longValue());
            }
            return linkedHashSet3;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C823280WRi.LIZLLL(th);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZ(System.nanoTime() - lValueOf.longValue());
                }
                return null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZ(System.nanoTime() - lValueOf.longValue());
                }
                throw th2;
            }
        }
    }

    public static final void LJ() {
        if (LIZIZ) {
            Long lValueOf = LIZLLL ? Long.valueOf(System.nanoTime()) : null;
            try {
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C823280WRi.LIZLLL(th);
                    if (!LIZLLL || lValueOf == null) {
                        return;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (LIZLLL && lValueOf != null) {
                        C838980Wvg.LIZIZ(System.nanoTime() - lValueOf.longValue());
                    }
                    throw th2;
                }
            }
            if (LIZJ == 3) {
                LJFF();
                if (!LIZLLL || lValueOf == null) {
                    return;
                }
                C838980Wvg.LIZIZ(System.nanoTime() - lValueOf.longValue());
                return;
            }
            C838990Wvh c838990Wvh = C838990Wvh.LIZ;
            int i = LJFF;
            c838990Wvh.getClass();
            C838990Wvh.LIZJ(i);
            if (!LIZLLL || lValueOf == null) {
                return;
            }
            C838980Wvg.LIZIZ(System.nanoTime() - lValueOf.longValue());
        }
    }

    public static void LJFF() {
        List list;
        C0W9T c0w9tLIZJ = C0W9U.LIZJ();
        Object data = c0w9tLIZJ != null ? c0w9tLIZJ.getData(LJFF) : null;
        if (!C19719512Dh.LJI(data) || (list = (List) data) == null || list.isEmpty() || list.size() == 1) {
            C838990Wvh c838990Wvh = C838990Wvh.LIZ;
            int i = LJFF;
            c838990Wvh.getClass();
            C0W9U.LIZ(i, null, c0w9tLIZJ);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        C19719612Di.LJJIJIIJI(arrayList);
        C838990Wvh c838990Wvh2 = C838990Wvh.LIZ;
        int i2 = LJFF;
        c838990Wvh2.getClass();
        C0W9U.LIZ(i2, arrayList, c0w9tLIZJ);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Register implements IRegister {
        @Override // com.bytedance.bpea.transmit.IRegister
        public final boolean enable() {
            return MethodIDManager.LIZIZ;
        }

        @Override // com.bytedance.bpea.transmit.IRegister
        public final void LIZ(int i) {
            MethodIDManager.LJFF = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(int i) {
        Object data;
        C0W9T c0w9tLIZJ = C0W9U.LIZJ();
        C839010Wvj c839010Wvj = null;
        if (c0w9tLIZJ != null) {
            data = c0w9tLIZJ.getData(LJFF);
        } else {
            data = null;
        }
        if (data instanceof C839010Wvj) {
            c839010Wvj = (C839010Wvj) data;
        }
        if (c839010Wvj == null) {
            if (!C838890WvX.LIZ(i)) {
                return false;
            }
        } else {
            for (C839010Wvj c839010Wvj2 = c839010Wvj; c839010Wvj2 != null; c839010Wvj2 = c839010Wvj2.LIZIZ) {
                Integer num = (Integer) c839010Wvj2.LIZ;
                if (num != null && num.intValue() == i) {
                    return false;
                }
            }
        }
        C838990Wvh c838990Wvh = C838990Wvh.LIZ;
        int i2 = LJFF;
        C839010Wvj c839010Wvj3 = new C839010Wvj(Integer.valueOf(i), c839010Wvj);
        c838990Wvh.getClass();
        return C0W9U.LIZ(i2, c839010Wvj3, c0w9tLIZJ);
    }

    public static boolean LIZIZ(int i) {
        Object data;
        ArrayList arrayList;
        C0W9T c0w9tLIZJ = C0W9U.LIZJ();
        List list = null;
        if (c0w9tLIZJ != null) {
            data = c0w9tLIZJ.getData(LJFF);
        } else {
            data = null;
        }
        if (data instanceof List) {
            list = (List) data;
        }
        if (list == null) {
            if (!C838890WvX.LIZ(i)) {
                return false;
            }
            arrayList = new ArrayList();
        } else {
            if (list.contains(Integer.valueOf(i))) {
                return false;
            }
            arrayList = new ArrayList(list);
        }
        arrayList.add(Integer.valueOf(i));
        C838990Wvh c838990Wvh = C838990Wvh.LIZ;
        int i2 = LJFF;
        c838990Wvh.getClass();
        return C0W9U.LIZ(i2, arrayList, c0w9tLIZJ);
    }

    public static final boolean LJI(int i) {
        Long lValueOf;
        if (!LIZIZ) {
            return false;
        }
        if (LIZLLL) {
            ConcurrentHashMap<Integer, Integer> concurrentHashMap = C838980Wvg.LIZ;
            Integer numValueOf = Integer.valueOf(i);
            Integer num = concurrentHashMap.get(Integer.valueOf(i));
            if (num == null) {
                num = 0;
            }
            concurrentHashMap.put(numValueOf, Integer.valueOf(num.intValue() + 1));
        }
        if (LIZLLL) {
            lValueOf = Long.valueOf(System.nanoTime());
        } else {
            lValueOf = null;
        }
        try {
            int i2 = LIZJ;
            if (i2 == 0) {
                boolean zLIZ = C838970Wvf.LIZ(i);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                }
                return zLIZ;
            }
            if (i2 == 1) {
                if (!C838890WvX.LIZ(i)) {
                    C838990Wvh c838990Wvh = C838990Wvh.LIZ;
                    int i3 = LJFF;
                    c838990Wvh.getClass();
                    if (C0W9U.LIZLLL(i3) == null) {
                        if (LIZLLL && lValueOf != null) {
                            C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                        }
                        return false;
                    }
                }
                C838990Wvh c838990Wvh2 = C838990Wvh.LIZ;
                int i4 = LJFF;
                Integer numValueOf2 = Integer.valueOf(i);
                c838990Wvh2.getClass();
                boolean zLIZLLL = C838990Wvh.LIZLLL(i4, numValueOf2);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                }
                return zLIZLLL;
            }
            if (i2 == 2) {
                boolean zLIZ2 = LIZ(i);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                }
                return zLIZ2;
            }
            if (i2 == 3) {
                boolean zLIZIZ = LIZIZ(i);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                }
                return zLIZIZ;
            }
            if (LIZLLL && lValueOf != null) {
                C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
            }
            return false;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C823280WRi.LIZLLL(th);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                }
                return false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (LIZLLL && lValueOf != null) {
                    C838980Wvg.LIZJ(System.nanoTime() - lValueOf.longValue());
                }
                throw th2;
            }
        }
    }
}
