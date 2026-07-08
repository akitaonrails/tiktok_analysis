package com.ss.android.ugc.aweme.minidrama.common.component.impl;

import X.C04TD;
import X.C1195104lx;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MiniDramaPlayProgressServiceImpl implements MiniDramaPlayProgressService {
    public final Map<String, C1195104lx> LIZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService
    public final void LIZ() {
    }

    public static MiniDramaPlayProgressService LJFF() {
        Object objLIZ = C04TD.LIZ(MiniDramaPlayProgressService.class, false);
        if (objLIZ != null) {
            return (MiniDramaPlayProgressService) objLIZ;
        }
        if (C04TD.l2 == null) {
            synchronized (MiniDramaPlayProgressService.class) {
                if (C04TD.l2 == null) {
                    C04TD.l2 = new MiniDramaPlayProgressServiceImpl();
                }
            }
        }
        return C04TD.l2;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService
    public final void LIZJ() {
        ((LinkedHashMap) this.LIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService
    public final boolean isEmpty() {
        Map<String, C1195104lx> map = this.LIZ;
        return map == null || map.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService
    public final Long LIZIZ(long j, String str) {
        C1195104lx c1195104lx = (C1195104lx) ((LinkedHashMap) this.LIZ).get(str);
        if (c1195104lx == null) {
            return null;
        }
        if (c1195104lx.LIZJ) {
            return Long.valueOf(c1195104lx.LIZ);
        }
        long j2 = c1195104lx.LIZIZ;
        if (j2 == j) {
            return null;
        }
        return Long.valueOf(j2);
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService
    public final void LJ(long j, String str) {
        C1195104lx c1195104lx;
        boolean z;
        if (this.LIZ.containsKey(str) && (c1195104lx = (C1195104lx) ((LinkedHashMap) this.LIZ).get(str)) != null) {
            Map<String, C1195104lx> map = this.LIZ;
            long j2 = c1195104lx.LIZ;
            if (!c1195104lx.LIZJ && (j * 1.0d) / j2 < 0.95d) {
                z = false;
            } else {
                z = true;
            }
            map.put(str, new C1195104lx(j2, j, z));
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaPlayProgressService
    public final void LIZLLL(long j, long j2, String str, boolean z) {
        if (!this.LIZ.containsKey(str)) {
            this.LIZ.put(str, new C1195104lx(j, j2, z));
        }
    }
}
