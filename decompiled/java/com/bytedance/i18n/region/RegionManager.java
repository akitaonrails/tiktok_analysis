package com.bytedance.i18n.region;

import X.AbstractC1798240wta;
import X.C098200Yq;
import X.C0XLD;
import X.C0XLF;
import X.C1207710hX7;
import X.C1208500hYO;
import X.C1798100wtM;
import X.C1798180wtU;
import X.C1798190wtV;
import X.C1798200wtW;
import X.C1798220wtY;
import X.C1798230wtZ;
import X.C1798620wuC;
import X.C185100nR;
import X.C189200o6;
import X.C443120HZe;
import X.C786410Ut5;
import X.C818740W9w;
import X.C847070XKv;
import X.InterfaceC1798070wtJ;
import X.InterfaceC1798270wtd;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class RegionManager {
    public final C1798100wtM LIZ;
    public volatile C443120HZe<Integer, String, ? extends Map<String, C1207710hX7>> LJ;
    public final long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public final C1798230wtZ LJIIJ;
    public final C818740W9w LJIIJJI;
    public final C1798220wtY LJIIL;
    public Map<String, String> LJIILIIL;
    public final C1798190wtV LJIILJJIL;
    public volatile Integer LJIILL;
    public volatile AbstractC1798240wta LJIILLIIL;
    public final CopyOnWriteArrayList<C0XLF> LIZIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1798270wtd> LIZJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1798070wtJ> LIZLLL = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<String, C0XLD> LJFF = new ConcurrentHashMap<>();
    public final Map<String, C847070XKv> LJI = new LinkedHashMap();

    public RegionManager(C1798100wtM c1798100wtM) {
        Object c098200Yq;
        this.LIZ = c1798100wtM;
        new AtomicBoolean(false);
        this.LJII = TimeUnit.HOURS.toMillis(6L);
        this.LJIIJ = new C1798230wtZ(c1798100wtM.LIZ);
        C818740W9w c818740W9w = new C818740W9w(c1798100wtM.LIZ);
        this.LJIIJJI = c818740W9w;
        this.LJIIL = new C1798220wtY(c1798100wtM.LIZJ);
        this.LJIILIIL = new LinkedHashMap();
        this.LJIILJJIL = new C1798190wtV(c818740W9w, c1798100wtM.LJ);
        String string = c818740W9w.LIZ.getString("region_headers", "");
        string = string == null ? "" : string;
        try {
            if (string.length() > 0) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.LJIILIIL.put(next, jSONObject.optString(next));
                }
            }
            C185100nR c185100nR = C185100nR.LIZ;
            C185100nR.LJIILLIIL(0, "success");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            this.LJIIJJI.LIZ("region_headers", "");
            C185100nR c185100nR2 = C185100nR.LIZ;
            C185100nR.LJIILLIIL(-101, "header_cache_parse_failed");
        }
    }

    public final synchronized void LIZIZ(String str) {
        String strLIZ;
        AbstractC1798240wta abstractC1798240wta = this.LJIILLIIL;
        if (abstractC1798240wta != null) {
            strLIZ = abstractC1798240wta.LIZ();
        } else {
            strLIZ = null;
        }
        if (Intrinsics.LJFF(strLIZ, str)) {
            this.LJIILLIIL = null;
        }
    }

    public final C1798180wtU LIZLLL(String str) {
        C1798180wtU c1798180wtU;
        C1798230wtZ c1798230wtZ = this.LJIIJ;
        synchronized (c1798230wtZ) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1798230wtZ.LIZIZ;
            Object c1798180wtU2 = linkedHashMap.get(str);
            if (c1798180wtU2 == null) {
                c1798180wtU2 = new C1798180wtU(c1798230wtZ.LIZ, str);
                linkedHashMap.put(str, c1798180wtU2);
            }
            c1798180wtU = (C1798180wtU) c1798180wtU2;
        }
        return c1798180wtU;
    }

    public final void LJIIIIZZ(InterfaceC1798070wtJ interfaceC1798070wtJ) {
        this.LIZLLL.add(interfaceC1798070wtJ);
        C443120HZe<Integer, String, ? extends Map<String, C1207710hX7>> c443120HZe = this.LJ;
        if (c443120HZe != null) {
            interfaceC1798070wtJ.LIZ(c443120HZe.getFirst().intValue(), c443120HZe.getSecond(), c443120HZe.getThird());
        }
    }

    public static String LJIIJJI(n nVar, String str) {
        if (!Intrinsics.LJFF(C1208500hYO.LJII(nVar, "token"), str)) {
            return "control_config_token_mismatch";
        }
        k kVarLJJIIZ = nVar.LJJIIZ("init_config");
        if (kVarLJJIIZ != null && (kVarLJJIIZ instanceof n)) {
            return null;
        }
        return "control_config_missing_init_config";
    }

    public final synchronized n LIZJ(String str, String str2) {
        C1798200wtW c1798200wtW;
        AbstractC1798240wta abstractC1798240wta = this.LJIILLIIL;
        if (!(abstractC1798240wta instanceof C1798200wtW) || (c1798200wtW = (C1798200wtW) abstractC1798240wta) == null) {
            return null;
        }
        if (!Intrinsics.LJFF(c1798200wtW.LIZ, str)) {
            return null;
        }
        if (str2 != null && !Intrinsics.LJFF(c1798200wtW.LIZIZ, str2)) {
            return null;
        }
        return c1798200wtW.LIZJ;
    }

    public final void LJI(n nVar, Function0<n> function0) {
        for (InterfaceC1798270wtd interfaceC1798270wtd : this.LIZJ) {
            if (nVar != null || (nVar = function0.invoke()) != null) {
                interfaceC1798270wtd.LIZIZ(nVar);
            }
            nVar = null;
        }
    }

    public static void LJIIIZ(final int i, final long j, final String str) {
        C185100nR c185100nR = C185100nR.LIZ;
        if (str == null) {
            if (i != -22) {
                if (i != -21) {
                    if (i != -3) {
                        if (i != -2) {
                            if (i != 0) {
                                if (i != 10001) {
                                    if (i != 20001) {
                                        if (i != 30001) {
                                            if (i != 40001) {
                                                str = "unknown";
                                            } else {
                                                str = "config_query_failed";
                                            }
                                        } else {
                                            str = "no_config";
                                        }
                                    } else {
                                        str = "YU";
                                    }
                                } else {
                                    str = "NL";
                                }
                            } else {
                                str = "success";
                            }
                        } else {
                            str = "parse_config_failed";
                        }
                    } else {
                        str = "fallback_config_failed";
                    }
                } else {
                    str = "parse_json_syntax_failed";
                }
            } else {
                str = "parse_json_io_failed";
            }
        }
        if (!C185100nR.LIZ()) {
            C1798620wuC.LIZLLL("SdkMonitorWrapper", "reportRegionControlConfigStatus: not initialized");
        } else {
            C786410Ut5.LJJZZIII(C185100nR.LIZIZ, new Runnable() { // from class: X.00nC
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    int i2 = i;
                    String str2 = str;
                    jSONObject.put("err_code", i2);
                    jSONObject.put("err_msg", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cost", j);
                    C185100nR.LIZIZ(C185100nR.LIZ, "region_control_config_status", jSONObject, jSONObject2, 8);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SdkMonitorWrapper@f316.reportRegionControlConfigStatus$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportRegionControlConfigStatus$1");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1798210wtX LJ(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            com.google.gson.n r1 = r4.LIZJ(r5, r6)
            r3 = 0
            if (r1 == 0) goto Ld
            X.0wtX r0 = new X.0wtX
            r0.<init>(r1, r3)
            return r0
        Ld:
            if (r7 == 0) goto L20
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r7)     // Catch: java.lang.Throwable -> L28
            com.google.gson.n r2 = r0.LJIILIIL()     // Catch: java.lang.Throwable -> L28
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L28
            goto L34
        L20:
            X.0wtX r0 = new X.0wtX
            java.lang.String r1 = "control_config_missing_init_config"
            r0.<init>(r3, r1)
            goto L4a
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L34:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L3b
            r2 = r3
        L3b:
            com.google.gson.n r2 = (com.google.gson.n) r2
            if (r2 == 0) goto L20
            java.lang.String r1 = LJIIJJI(r2, r5)
            if (r1 == 0) goto L4f
            X.0wtX r0 = new X.0wtX
            r0.<init>(r3, r1)
        L4a:
            java.lang.String r1 = r0.LIZIZ
            if (r1 == 0) goto L55
            return r0
        L4f:
            X.0wtX r0 = new X.0wtX
            r0.<init>(r2, r3)
            goto L4a
        L55:
            com.google.gson.n r1 = r0.LIZ
            if (r1 != 0) goto L5a
            return r0
        L5a:
            X.0wtX r0 = new X.0wtX
            r4.LJII(r1, r5, r6)
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.i18n.region.RegionManager.LJ(java.lang.String, java.lang.String, java.lang.String):X.0wtX");
    }

    public final synchronized void LJII(n nVar, String str, String str2) {
        nVar.LJJIIJ("source", "region_service");
        this.LJIILLIIL = new C1798200wtW(str, str2, nVar);
    }

    public final void LIZ(String str, C1798180wtU c1798180wtU, long j, String str2) {
        c1798180wtU.LIZ();
        LIZIZ(str);
        LJFF(-2, j, str2, true);
        this.LJIILL = -2;
    }

    public final void LJFF(int i, long j, String str, boolean z) {
        this.LJIILL = Integer.valueOf(i);
        if (z) {
            if (this.LIZ.LJIIIIZZ) {
                Iterator<InterfaceC1798270wtd> it2 = this.LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }
            LJIIIZ(i, SystemClock.uptimeMillis() - j, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        if ((r2 - r4) >= r9.LIZ) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(final X.EnumC818060W7g r32, final com.bytedance.i18n.region.network.model.RequestModel r33, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> r34, final int r35) {
        /*
            Method dump skipped, instruction units count: 1878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.i18n.region.RegionManager.LJIIJ(X.0W7g, com.bytedance.i18n.region.network.model.RequestModel, kotlin.jvm.functions.Function2, int):void");
    }
}
