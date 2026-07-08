package com.ss.android.ugc.aweme.effectplatform;

import X.C0C64;
import X.C0CHQ;
import X.C13VI;
import X.C20186013yc;
import X.C2188811AlT;
import X.C756002xK;
import X.EnumC1335420kr6;
import X.InterfaceC2385909Wn;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.CreativeToolsCachingDurationValidity;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class EffectPlatformCaching extends C13VI {
    public static EffectPlatformCaching LJ;
    public Map<String, Long> LIZJ;
    public final Keva LIZIZ = Keva.getRepo("keva_ep_download_repo");
    public final InterfaceC2385909Wn LIZLLL = C0CHQ.LIZ().getRegionService();

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    public static EffectPlatformCaching LJIIZILJ() {
        if (LJ == null) {
            synchronized (EffectPlatformCaching.class) {
                try {
                    if (LJ == null) {
                        LJ = new EffectPlatformCaching();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        this.LIZIZ.getAll().clear();
        this.LIZIZ.clear();
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        this.LIZIZ.getAll().clear();
        this.LIZIZ.clear();
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        this.LIZIZ.getAll().clear();
        this.LIZIZ.clear();
        return 0L;
    }

    public final String LJIILLIIL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_ep_panel__");
        sbLIZ.append(C20186013yc.LIZ());
        sbLIZ.append("_");
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJIJ(String str) {
        if (this.LIZJ == null) {
            this.LIZJ = CreativeToolsCachingDurationValidity.LIZ();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_effect_platform_caching", true, false)) {
            if (C756002xK.LIZ() == null || !C756002xK.LIZ().contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJIJI(String str) {
        if (this.LIZJ == null) {
            this.LIZJ = CreativeToolsCachingDurationValidity.LIZ();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_check_update_apis_client_caching", true, false)) {
            if (C756002xK.LIZ() == null || !C756002xK.LIZ().contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJIJJ(String str) {
        if (LJIJI(str) && System.currentTimeMillis() <= this.LIZIZ.getLong(LJIILLIIL(str), 0L)) {
            return true;
        }
        return false;
    }

    public final boolean LJIL(String str) {
        if (LJIJ(str) && System.currentTimeMillis() <= this.LIZIZ.getLong(LJIILLIIL(str), 0L)) {
            return true;
        }
        return false;
    }

    public final void LJJ(String str) {
        if (LJIJ(str)) {
            Map<String, Long> map = this.LIZJ;
            if (map != null && map.containsKey(str)) {
                this.LIZIZ.storeLong(LJIILLIIL(str), System.currentTimeMillis() + (((Long) ((LinkedHashMap) this.LIZJ).get(str)).longValue() * 1000));
            } else {
                this.LIZIZ.storeLong(LJIILLIIL(str), System.currentTimeMillis() + 86400000);
            }
        }
    }

    public final void LJJI(String str, String str2) {
        if (LJIJ(str)) {
            Map<String, Long> map = this.LIZJ;
            if (map != null && map.containsKey(str)) {
                this.LIZIZ.storeLong(LJIILL(0, str, str2), System.currentTimeMillis() + (((Long) ((LinkedHashMap) this.LIZJ).get(str)).longValue() * 1000));
            } else {
                this.LIZIZ.storeLong(LJIILL(0, str, str2), System.currentTimeMillis() + 86400000);
            }
        }
    }

    public final String LJIILL(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_ep_panel__");
        sbLIZ.append(C20186013yc.LIZ());
        sbLIZ.append("_");
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(str2);
        sbLIZ.append("_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJIJJLI(int i, String str, String str2) {
        if (!LJIJ(str) || System.currentTimeMillis() > this.LIZIZ.getLong(LJIILL(i, str, str2), 0L)) {
            return false;
        }
        return true;
    }
}
