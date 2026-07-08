package com.ss.android.ugc.aweme.ml.infra;

import X.AbstractC1511510pR7;
import X.AbstractC1511520pR8;
import X.C0N33;
import X.C1510130pOt;
import X.C1510230pP3;
import X.C1511340pQq;
import X.C1511350pQr;
import X.C1511470pR3;
import X.C1512100pS4;
import X.InterfaceC1510960pQE;
import X.InterfaceC1511190pQb;
import X.InterfaceC1511740pRU;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartMLSceneServiceImpl extends SmartMLSceneService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, C1511350pQr> LIZ = new ConcurrentHashMap();

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        C1511350pQr c1511350pQr;
        AbstractC1511510pR7 abstractC1511510pR7;
        if (str == null || str.length() == 0 || (c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC1511510pR7 = c1511350pQr.LIZ) == null) {
            return false;
        }
        return abstractC1511510pR7.enable();
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
        C1511350pQr c1511350pQr;
        AbstractC1511510pR7 abstractC1511510pR7;
        if (str != null && str.length() != 0 && (c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str)) != null && (abstractC1511510pR7 = c1511350pQr.LIZ) != null) {
            abstractC1511510pR7.preloadEnv();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public final AbstractC1511520pR8 getSmartRunner(String str) {
        C1511350pQr c1511350pQr;
        Object objLIZ;
        C1510130pOt c1510130pOtCallExtMethod$default;
        if (str == null || str.length() == 0 || (c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str)) == null) {
            return null;
        }
        AbstractC1511510pR7 abstractC1511510pR7 = c1511350pQr.LIZ;
        if (abstractC1511510pR7 != null && (c1510130pOtCallExtMethod$default = AbstractC1511510pR7.callExtMethod$default(abstractC1511510pR7, "getSmartRunner", null, 2, null)) != null) {
            objLIZ = c1510130pOtCallExtMethod$default.LIZ("result");
        } else {
            objLIZ = null;
        }
        if (!(objLIZ instanceof AbstractC1511520pR8)) {
            return null;
        }
        return (AbstractC1511520pR8) objLIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean isEnvReady(String str) {
        C1511350pQr c1511350pQr;
        AbstractC1511510pR7 abstractC1511510pR7;
        if (str == null || str.length() == 0 || (c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC1511510pR7 = c1511350pQr.LIZ) == null) {
            return false;
        }
        return abstractC1511510pR7.isEnvReady();
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        C1511350pQr c1511350pQr;
        AbstractC1511510pR7 abstractC1511510pR7;
        C1512100pS4 c1512100pS4LastResult;
        if (str == null || str.length() == 0 || (c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC1511510pR7 = c1511350pQr.LIZ) == null || (c1512100pS4LastResult = abstractC1511510pR7.lastResult()) == null) {
            return -999;
        }
        return c1512100pS4LastResult.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final C1511340pQq lastSuccessRunResult(String str) {
        C1511350pQr c1511350pQr;
        if (str == null || str.length() == 0 || (c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str)) == null) {
            return null;
        }
        return c1511350pQr.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
        if (str == null || str.length() == 0 || smartSceneConfig == null || !TextUtils.equals(str, smartSceneConfig.getScene()) || ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return;
        }
        Map<String, C1511350pQr> map = this.LIZ;
        C1511470pR3 c1511470pR3 = new C1511470pR3(str);
        C1510230pP3 c1510230pP3 = new C1510230pP3(str);
        c1510230pP3.LIZIZ = smartSceneConfig;
        c1511470pR3.configService(c1510230pP3);
        ((ConcurrentHashMap) map).put(str, new C1511350pQr(c1511470pR3));
    }

    public static Map LIZ(boolean z, int i, C1511340pQq c1511340pQq) {
        HashMap map = new HashMap();
        map.put("success", Boolean.valueOf(z));
        map.put("errorCode", Integer.valueOf(i));
        if (c1511340pQq != null && z) {
            Float f = c1511340pQq.LIZLLL;
            if (f != null) {
                map.put("value", Float.valueOf(f.floatValue()));
            }
            String str = c1511340pQq.LIZIZ;
            if (str != null) {
                map.put("label", str);
            }
            Map<String, Float> map2 = c1511340pQq.LIZJ;
            if (map2 != null) {
                map.put("probMap", map2);
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public final Map<String, Object> runSync(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE) {
        AbstractC1511510pR7 abstractC1511510pR7;
        if (str != null && str.length() != 0) {
            C1511350pQr c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c1511350pQr != null && (abstractC1511510pR7 = c1511350pQr.LIZ) != null) {
                C1512100pS4 c1512100pS4RunSync = abstractC1511510pR7.runSync(c0n33);
                if (c1512100pS4RunSync != null) {
                    C1511340pQq c1511340pQq = new C1511340pQq();
                    c1511340pQq.LIZIZ = c1512100pS4RunSync.LIZIZ;
                    c1511340pQq.LIZJ = c1512100pS4RunSync.LIZJ;
                    c1511340pQq.LIZLLL = c1512100pS4RunSync.LIZLLL;
                    c1511340pQq.LJFF = c1512100pS4RunSync.LJFF;
                    if (c1511340pQq.LIZIZ()) {
                        c1511350pQr.LIZIZ = c1511340pQq;
                    }
                    return LIZ(c1512100pS4RunSync.LIZIZ(), c1512100pS4RunSync.LIZ, c1511340pQq);
                }
                return LIZ(false, -5, null);
            }
            return LIZ(false, -1, null);
        }
        return LIZ(false, -1, null);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void run(String str, C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, InterfaceC1511190pQb interfaceC1511190pQb) {
        runDelay(str, 0L, c0n33, null, interfaceC1511190pQb);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j, final C0N33 c0n33, InterfaceC1510960pQE interfaceC1510960pQE, final InterfaceC1511190pQb interfaceC1511190pQb) {
        AbstractC1511510pR7 abstractC1511510pR7;
        if (str != null && str.length() != 0) {
            final C1511350pQr c1511350pQr = (C1511350pQr) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c1511350pQr != null && (abstractC1511510pR7 = c1511350pQr.LIZ) != null) {
                abstractC1511510pR7.runAsyncDelay(j, c0n33, new InterfaceC1511740pRU() { // from class: X.0pQp
                    @Override // X.InterfaceC1511740pRU
                    public final void LIZ(C1512100pS4 c1512100pS4) {
                        if (c1512100pS4 != null) {
                            C1511340pQq c1511340pQq = new C1511340pQq();
                            c1511340pQq.LIZIZ = c1512100pS4.LIZIZ;
                            c1511340pQq.LIZJ = c1512100pS4.LIZJ;
                            c1511340pQq.LIZLLL = c1512100pS4.LIZLLL;
                            c1511340pQq.LJFF = c1512100pS4.LJFF;
                            if (c1511340pQq.LIZIZ()) {
                                c1511350pQr.LIZIZ = c1511340pQq;
                            }
                            InterfaceC1511190pQb interfaceC1511190pQb2 = interfaceC1511190pQb;
                            if (interfaceC1511190pQb2 != null) {
                                interfaceC1511190pQb2.LIZ(c1512100pS4.LIZIZ(), c1512100pS4.LIZ, c1511340pQq, c0n33);
                                return;
                            }
                            return;
                        }
                        InterfaceC1511190pQb interfaceC1511190pQb3 = interfaceC1511190pQb;
                        if (interfaceC1511190pQb3 == null) {
                            return;
                        }
                        interfaceC1511190pQb3.LIZ(false, -5, null, c0n33);
                    }
                });
                return;
            } else {
                if (interfaceC1511190pQb != null) {
                    interfaceC1511190pQb.LIZ(false, -1, null, c0n33);
                    return;
                }
                return;
            }
        }
        if (interfaceC1511190pQb != null) {
            interfaceC1511190pQb.LIZ(false, -1, null, c0n33);
        }
    }
}
