package com.bytedance.ies.im.core.bridge.init.queryexp;

import X.C01GW;
import X.C051M;
import X.C054G;
import X.C09JN;
import X.C0I0B;
import X.C0PEM;
import X.C1400340mXo;
import X.C1906580ziK;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C296690Bk3;
import X.C327360CsQ;
import X.C327370CsR;
import X.C328780Cui;
import X.C328820Cum;
import X.C328840Cuo;
import X.C328870Cur;
import X.C452501pT;
import X.InterfaceC908170Zjz;
import android.util.LruCache;
import com.bytedance.ies.im.core.api.model.ExpValue;
import com.bytedance.ies.im.core.api.service.IIMQueryExpManager;
import com.bytedance.ies.im.core.bridge.init.queryexp.QueryExpManager;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.ExpResult;
import com.bytedance.ies.im.core.bridge.init.queryexp.model.UserExperimentResult;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryExpManager implements IIMQueryExpManager {
    public static final QueryExpManager LIZIZ = new QueryExpManager();
    public static final LruCache<String, Map<String, ExpValue>> LIZJ = new LruCache<>(LSPassThroughRecordSizeConfig.DEFAULT);
    public static final LruCache<String, Map<String, ExpValue>> LIZLLL = new LruCache<>(500);
    public static final C01GW LJ = C452501pT.LIZIZ(new C328870Cur());
    public static final C054G LJFF = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()).plus(new C327370CsR(CoroutineExceptionHandler.LJJLIL)));

    public static final class Service implements IIMQueryExpManager {
        public final /* synthetic */ QueryExpManager LIZIZ = QueryExpManager.LIZIZ;

        @Override // com.bytedance.ies.im.core.api.service.IIMQueryExpManager
        public final ExpValue LIZ(String str, String str2) {
            return this.LIZIZ.LIZ(str, str2);
        }

        @Override // com.bytedance.ies.im.core.api.service.IIMQueryExpManager
        public final void LIZIZ(int i, List list, List list2) {
            this.LIZIZ.LIZIZ(i, list, list2);
        }
    }

    static {
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new C09JN() { // from class: X.0Cun
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("QueryExpManager@84cc.<init>$1");
                if (((Boolean) obj).booleanValue()) {
                    QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
                    QueryExpManager.LJ(2, QueryExpManager.LIZLLL.snapshot());
                }
                C1C7U.LIZIZ("QueryExpManager@84cc.<init>$1");
            }
        });
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.0Cup
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C23118094a.LJ(QueryExpManager.LJFF.LL);
                        QueryExpManager queryExpManager = QueryExpManager.LIZIZ;
                        if (C296690Bk3.LIZ()) {
                            ((AtomicBoolean) QueryExpManager.LJ.getValue()).set(false);
                        }
                        QueryExpManager.LIZJ.evictAll();
                        QueryExpManager.LIZLLL.evictAll();
                        C328840Cuo.LIZ.LIZLLL(0L);
                    }
                }
            }
        });
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C327360CsQ(null), 3);
    }

    public static void LJFF() {
        if (!C296690Bk3.LIZ()) {
            Map mapLIZJ = C328840Cuo.LIZJ(false);
            if (mapLIZJ != null) {
                for (Map.Entry entry : mapLIZJ.entrySet()) {
                    LIZJ.put((String) entry.getKey(), (Map<String, ExpValue>) entry.getValue());
                }
            }
            Map mapLIZJ2 = C328840Cuo.LIZJ(true);
            if (mapLIZJ2 != null) {
                for (Map.Entry entry2 : mapLIZJ2.entrySet()) {
                    LIZLLL.put((String) entry2.getKey(), (Map<String, ExpValue>) entry2.getValue());
                }
                return;
            }
            return;
        }
        if (((AtomicBoolean) LJ.getValue()).compareAndSet(false, true)) {
            Map mapLIZJ3 = C328840Cuo.LIZJ(false);
            if (mapLIZJ3 != null) {
                for (Map.Entry entry3 : mapLIZJ3.entrySet()) {
                    LIZJ.put((String) entry3.getKey(), (Map<String, ExpValue>) entry3.getValue());
                }
            }
            Map mapLIZJ4 = C328840Cuo.LIZJ(true);
            if (mapLIZJ4 != null) {
                for (Map.Entry entry4 : mapLIZJ4.entrySet()) {
                    LIZLLL.put((String) entry4.getKey(), (Map<String, ExpValue>) entry4.getValue());
                }
            }
        }
    }

    public static Map LIZJ(List list) {
        ExpValue expValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ExpResult expResult = (ExpResult) it2.next();
            String str = expResult.key;
            if (str != null && (expValue = expResult.value) != null) {
                linkedHashMap.put(str, expValue);
            }
        }
        return linkedHashMap;
    }

    public static boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        if (C296690Bk3.LIZ() && !((AtomicBoolean) LJ.getValue()).get()) {
            LJFF();
        }
        if (LIZJ.get(str) == null && LIZLLL.get(str) == null) {
            return false;
        }
        return true;
    }

    public static void LJ(int i, Map map) {
        Integer numValueOf;
        boolean z;
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveUsersExpInfoToLocal, size:");
        if (map != null) {
            numValueOf = Integer.valueOf(map.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", type: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C328840Cuo c328840Cuo = C328840Cuo.LIZ;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        synchronized (c328840Cuo) {
            if (!z) {
                try {
                    C328840Cuo.LIZ().storeString(C328840Cuo.LIZIZ(), "");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String strLJ = C051M.LJ(map, false);
            Keva kevaLIZ = C328840Cuo.LIZ();
            if (z) {
                strLIZIZ = C328840Cuo.LIZIZ();
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("full_user_exp_info-");
                sbLIZ2.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            kevaLIZ.storeString(strLIZIZ, strLJ);
        }
        if (i == 1) {
            C328840Cuo.LIZ.LIZLLL(System.currentTimeMillis());
        }
    }

    @Override // com.bytedance.ies.im.core.api.service.IIMQueryExpManager
    public final ExpValue LIZ(String str, String str2) {
        ExpValue expValue;
        if (str2 == null) {
            return null;
        }
        if (C296690Bk3.LIZ() && !((AtomicBoolean) LJ.getValue()).get()) {
            LJFF();
        }
        Map<String, ExpValue> map = LIZJ.get(str2);
        if (map != null && (expValue = map.get(str)) != null) {
            return expValue;
        }
        Map<String, ExpValue> map2 = LIZLLL.get(str2);
        if (map2 == null) {
            return null;
        }
        return map2.get(str);
    }

    public final synchronized void LJI(UserExperimentResult userExperimentResult, int i) {
        LruCache<String, Map<String, ExpValue>> lruCache;
        if (i == 2) {
            lruCache = LIZLLL;
        } else {
            lruCache = LIZJ;
        }
        if (userExperimentResult.expResult == null) {
            lruCache.put(userExperimentResult.userId, C2097608Jq.LJ());
            return;
        }
        Map<String, ExpValue> map = lruCache.get(userExperimentResult.userId);
        if (map == null) {
            lruCache.put(userExperimentResult.userId, LIZJ(userExperimentResult.expResult));
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(LIZJ(userExperimentResult.expResult));
            lruCache.put(userExperimentResult.userId, linkedHashMap);
        }
    }

    @Override // com.bytedance.ies.im.core.api.service.IIMQueryExpManager
    public final void LIZIZ(int i, List list, List list2) {
        if (!C328780Cui.LIZ().enabled) {
            return;
        }
        C23250099c.LIZLLL(LJFF, null, null, new C328820Cum(i, list, list2, null), 3);
    }
}
