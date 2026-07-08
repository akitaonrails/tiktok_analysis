package com.ss.android.ugc.aweme.compliance.business.video;

import X.C01GW;
import X.C0S78;
import X.C0XQ7;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoViewService;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS3S1100200_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class PNSVideoViewService implements IPNSVideoViewService {
    public long LIZLLL;
    public boolean LJ;
    public String LJFF;
    public long LJII;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(62));
    public final Object LIZIZ = new Object();
    public final LinkedHashSet<String> LIZJ = new LinkedHashSet<>();
    public LinkedHashSet<String> LJI = new LinkedHashSet<>();

    @Override // com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoViewService
    public final long LIZ() {
        long size;
        synchronized (this.LIZIZ) {
            try {
                if (!this.LJ) {
                    this.LIZLLL = ((Keva) this.LIZ.getValue()).getLong("vv_count_install", 0L);
                    this.LJ = true;
                }
                size = this.LIZLLL + ((long) this.LIZJ.size());
                if (size > 200) {
                    size = 200;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoViewService
    public final long LIZJ() {
        long size;
        String strLIZIZ = C0XQ7.LIZIZ();
        synchronized (this.LIZIZ) {
            try {
                LJ(strLIZIZ);
                size = this.LJII + ((long) this.LJI.size());
                if (size > 200) {
                    size = 200;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.video.IPNSVideoViewService
    public final void LIZIZ(String str) {
        Pair pair;
        if (str.length() == 0) {
            return;
        }
        String strLIZIZ = C0XQ7.LIZIZ();
        synchronized (this.LIZIZ) {
            try {
                if (!this.LJ) {
                    this.LIZLLL = ((Keva) this.LIZ.getValue()).getLong("vv_count_install", 0L);
                    this.LJ = true;
                }
                LJ(strLIZIZ);
                LIZLLL(this.LIZJ, str);
                LIZLLL(this.LJI, str);
                long size = this.LIZLLL + ((long) this.LIZJ.size());
                if (size > 200) {
                    size = 200;
                }
                Long lValueOf = Long.valueOf(size);
                long size2 = this.LJII + ((long) this.LJI.size());
                if (size2 > 200) {
                    size2 = 200;
                }
                pair = new Pair(lValueOf, Long.valueOf(size2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        long jLongValue = ((Number) pair.getFirst()).longValue();
        long jLongValue2 = ((Number) pair.getSecond()).longValue();
        if (jLongValue >= 200 && jLongValue2 >= 200) {
            return;
        }
        C0S78.LIZ(new AwS3S1100200_30(jLongValue, this, jLongValue2, strLIZIZ, 0), true);
    }

    public final void LJ(String str) {
        if (Intrinsics.LJFF(this.LJFF, str)) {
            return;
        }
        this.LJFF = str;
        this.LJI = new LinkedHashSet<>();
        Keva keva = (Keva) this.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_vv_count_install");
        this.LJII = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static void LIZLLL(LinkedHashSet linkedHashSet, String str) {
        if (!linkedHashSet.add(str) || linkedHashSet.size() <= 200) {
            return;
        }
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }
}
