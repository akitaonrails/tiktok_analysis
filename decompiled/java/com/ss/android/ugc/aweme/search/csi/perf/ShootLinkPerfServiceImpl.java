package com.ss.android.ugc.aweme.search.csi.perf;

import X.C04TD;
import X.C1448120nms;
import X.C2097608Jq;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.record.ShootLinkPerfMobModel;
import com.ss.android.ugc.aweme.performance.IShootLinkPerfService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public final class ShootLinkPerfServiceImpl implements IShootLinkPerfService {
    public final Object LIZ = new Object();
    public C1448120nms LIZIZ;
    public long LIZJ;

    public static IShootLinkPerfService LIZ() {
        Object objLIZ = C04TD.LIZ(IShootLinkPerfService.class, false);
        if (objLIZ != null) {
            return (IShootLinkPerfService) objLIZ;
        }
        if (C04TD.K3 == null) {
            synchronized (IShootLinkPerfService.class) {
                if (C04TD.K3 == null) {
                    C04TD.K3 = new ShootLinkPerfServiceImpl();
                }
            }
        }
        return C04TD.K3;
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJI() {
        synchronized (this.LIZ) {
            try {
                C1448120nms c1448120nms = this.LIZIZ;
                this.LIZIZ = c1448120nms != null ? C1448120nms.LIZ(c1448120nms, 0L, 0L, System.currentTimeMillis(), 511) : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final long LJIIIIZZ() {
        long j;
        synchronized (this.LIZ) {
            try {
                j = this.LIZJ;
                this.LIZJ = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return j;
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void clear() {
        synchronized (this.LIZ) {
            try {
                this.LIZIZ = null;
                this.LIZJ = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final boolean LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("tool_shoot_link_perf_tracing_enabled", false);
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LIZLLL(long j) {
        C1448120nms c1448120nmsLIZ;
        synchronized (this.LIZ) {
            try {
                C1448120nms c1448120nms = this.LIZIZ;
                if (c1448120nms != null) {
                    c1448120nmsLIZ = C1448120nms.LIZ(c1448120nms, j, 0L, 0L, 895);
                } else {
                    c1448120nmsLIZ = null;
                }
                this.LIZIZ = c1448120nmsLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJ(long j) {
        C1448120nms c1448120nmsLIZ;
        if (j < 0) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                C1448120nms c1448120nms = this.LIZIZ;
                if (c1448120nms != null) {
                    c1448120nmsLIZ = C1448120nms.LIZ(c1448120nms, 0L, j, 0L, 767);
                } else {
                    c1448120nmsLIZ = null;
                }
                this.LIZIZ = c1448120nmsLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJ(long j) {
        if (j <= 0) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                this.LIZJ = j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJFF(ShootLinkPerfMobModel shootLinkPerfMobModel, Bundle bundle) {
        if (bundle != null) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("tool_shoot_link_perf_tracing_enabled", false)) {
                String string = bundle.getString("shoot_perf_session_id");
                String str = "";
                if (string == null) {
                    string = "";
                }
                shootLinkPerfMobModel.shootPerfSessionId = string;
                shootLinkPerfMobModel.openTime = bundle.getLong("open_time", 0L);
                shootLinkPerfMobModel.shootNativeRecvTs = bundle.getLong("shoot_native_recv_ts", 0L);
                String string2 = bundle.getString("inspiration_enter_from");
                if (string2 == null) {
                    string2 = "";
                }
                shootLinkPerfMobModel.inspirationEnterFrom = string2;
                String string3 = bundle.getString("inspiration_enter_method");
                if (string3 == null) {
                    string3 = "";
                }
                shootLinkPerfMobModel.inspirationEnterMethod = string3;
                String string4 = bundle.getString("search_extra");
                if (string4 != null) {
                    str = string4;
                }
                shootLinkPerfMobModel.searchExtra = str;
                shootLinkPerfMobModel.interceptorCost = bundle.getLong("interceptor_cost", -1L);
                shootLinkPerfMobModel.serviceLoadCost = bundle.getLong("service_load_cost", -1L);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final Map<String, String> LIZJ(long j, List<String> list, List<Long> list2) {
        int iIndexOf;
        LJIIJ(j);
        synchronized (this.LIZ) {
            try {
                C1448120nms c1448120nms = this.LIZIZ;
                if (c1448120nms == null) {
                    return C2097608Jq.LJ();
                }
                this.LIZIZ = null;
                if (j - c1448120nms.LJFF > 60000) {
                    return C2097608Jq.LJ();
                }
                HashMap map = new HashMap(16);
                map.put("shoot_perf_session_id", c1448120nms.LIZ);
                long j2 = c1448120nms.LJI;
                if (j2 > 0) {
                    map.put("e2e_open_time", String.valueOf(j - j2));
                }
                long j3 = c1448120nms.LJI;
                if (j3 > 0) {
                    long j4 = c1448120nms.LJIIIZ;
                    if (j4 > 0) {
                        map.put("prepare_cost", String.valueOf(j4 - j3));
                    }
                }
                long j5 = c1448120nms.LJIIIZ;
                if (j5 > 0) {
                    map.put("album_launch_cost", String.valueOf(j - j5));
                }
                long j6 = c1448120nms.LJII;
                if (j6 >= 0) {
                    map.put("plugin_cost", String.valueOf(j6));
                }
                long j7 = c1448120nms.LJIIIIZZ;
                if (j7 >= 0) {
                    map.put("prefetch_cost", String.valueOf(j7));
                }
                if ((!list.isEmpty()) && list2.size() == list.size()) {
                    long j8 = c1448120nms.LJIIIZ;
                    if (j8 > 0 && (iIndexOf = list.indexOf("onClick")) >= 0 && iIndexOf < list2.size()) {
                        long jLongValue = ((Number) ListProtector.get(list2, iIndexOf)).longValue() - j8;
                        if (jLongValue > 0) {
                            map.put("album_activity_cost", String.valueOf(jLongValue));
                        }
                    }
                    Long lLJIIJJI = LJIIJJI("onClick", "onViewCreated", list, list2);
                    if (lLJIIJJI != null) {
                        map.put("activity_start_cost", String.valueOf(lLJIIJJI.longValue()));
                    }
                    Long lLJIIJJI2 = LJIIJJI("onViewCreated", "initDataEnded", list, list2);
                    if (lLJIIJJI2 != null) {
                        map.put("scene_init_cost", String.valueOf(lLJIIJJI2.longValue()));
                    }
                    Long lLJIIJJI3 = LJIIJJI("initDataEnded", "loadMediaModels", list, list2);
                    if (lLJIIJJI3 != null) {
                        map.put("media_fetch_cost", String.valueOf(lLJIIJJI3.longValue()));
                    }
                    LJIIIZ(map, "list_bind_cost", list, list2, new Pair("loadMediaModels", "onBindFirst"), new Pair("loadMediaModels", "bindAll"));
                    LJIIIZ(map, "thumbnail_load_cost", list, list2, new Pair("onBindFirst", "imageLoaded"), new Pair("bindAll", "imageLoaded"));
                }
                map.put("inspiration_enter_from", c1448120nms.LIZJ);
                map.put("inspiration_enter_method", c1448120nms.LIZLLL);
                map.put("search_extra", c1448120nms.LJ);
                return map;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Long LJIIJJI(String str, String str2, List list, List list2) {
        int iIndexOf = list.indexOf(str);
        int iIndexOf2 = list.indexOf(str2);
        if (iIndexOf >= 0 && iIndexOf2 > iIndexOf && iIndexOf < list2.size() && iIndexOf2 < list2.size()) {
            long jLongValue = ((Number) ListProtector.get(list2, iIndexOf2)).longValue() - ((Number) ListProtector.get(list2, iIndexOf)).longValue();
            if (jLongValue > 0) {
                return Long.valueOf(jLongValue);
            }
            return null;
        }
        return null;
    }

    public static void LJIIIZ(Map map, String str, List list, List list2, Pair... pairArr) {
        for (Pair pair : pairArr) {
            Long lLJIIJJI = LJIIJJI((String) pair.getFirst(), (String) pair.getSecond(), list, list2);
            if (lLJIIJJI != null) {
                ((HashMap) map).put(str, String.valueOf(lLJIIJJI.longValue()));
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.performance.IShootLinkPerfService
    public final void LJII(long j, long j2, String str, String str2, String str3, String str4) throws Throwable {
        if (str != null && str.length() != 0) {
            synchronized (this.LIZ) {
                try {
                    try {
                        this.LIZIZ = new C1448120nms(str, j, str2, str3, str4, System.currentTimeMillis(), j2, -1L, -1L, 0L);
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }
}
