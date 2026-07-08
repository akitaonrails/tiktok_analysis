package com.ss.android.ugc.aweme.service;

import X.AbstractC1556090qb1;
import X.AbstractC1617510sC5;
import X.C002Y;
import X.C1556020qau;
import X.C1574380r4W;
import X.C1574580r4q;
import X.C1574610r4t;
import X.C1574620r4u;
import X.C1574630r4v;
import X.C1574690r51;
import X.EnumC1574730r55;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.preload.MiniDramaPreloadMonitor;
import java.util.Collections;
import kotlin.jvm.internal.AwS1S2000100_24;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaAwemeCacheServiceImpl implements IMiniDramaAwemeCacheService {
    @Override // com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService
    public final String LIZJ(long j, String str) {
        String strLIZ = C002Y.LIZ(Long.valueOf(j), str);
        if (strLIZ != null) {
            C1574690r51.LIZ.getClass();
            if (C1574690r51.LIZ()) {
                if (j > 0 && (!a0.LJJJIL(str))) {
                    C1574580r4q.LIZIZ.LJI(Collections.singletonList(Long.valueOf(j)), C1574380r4W.LIZ, new C1556020qau("anchor", str), null);
                }
            } else {
                C1574610r4t.LIZ.LIZ(strLIZ, new AwS1S2000100_24(strLIZ, j, 0));
                return strLIZ;
            }
        }
        return strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService
    public final Aweme LIZIZ(Long l, final String str, final String str2) {
        boolean z;
        AbstractC1617510sC5 c1574620r4u;
        AbstractC1617510sC5 c1574620r4u2;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String strLIZ = C002Y.LIZ(l, str2);
        C1574690r51.LIZ.getClass();
        if (C1574690r51.LIZ()) {
            if (l != null && l.longValue() > 0) {
                long jLongValue = l.longValue();
                if (str2 != null && (!a0.LJJJIL(str2))) {
                    Aweme awemeLJ = C1574580r4q.LIZIZ.LJ(jLongValue, C1574380r4W.LIZ, new AbstractC1556090qb1(str, str2) { // from class: X.0qav
                        public final String LIZ;
                        public final String LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C1556030qav)) {
                                return false;
                            }
                            C1556030qav c1556030qav = (C1556030qav) obj;
                            return Intrinsics.LJFF(this.LIZ, c1556030qav.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556030qav.LIZIZ);
                        }

                        public final int hashCode() {
                            return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("FypComponent(component=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", sourceVideoId=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.AbstractC1556090qb1
                        public final String LIZ() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fyp:");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(':');
                            sbLIZ.append(this.LIZIZ);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = str;
                            this.LIZIZ = str2;
                        }
                    });
                    if (awemeLJ != null) {
                        c1574620r4u2 = new C1574630r4v(str);
                    } else {
                        c1574620r4u2 = new C1574620r4u(str);
                    }
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    MiniDramaPreloadMonitor.LIZ(strLIZ, EnumC1574730r55.COMPONENT_PRELOAD, c1574620r4u2, new AwS74S1000000_24(str, 15));
                    return awemeLJ;
                }
            }
            return null;
        }
        if (strLIZ == null) {
            return null;
        }
        Aweme aweme = (Aweme) C1574610r4t.LIZIZ.LJIIIZ(strLIZ);
        if (aweme != null) {
            c1574620r4u = new C1574630r4v(str);
        } else {
            c1574620r4u = new C1574620r4u(str);
        }
        MiniDramaPreloadMonitor.LIZ(strLIZ, EnumC1574730r55.COMPONENT_PRELOAD, c1574620r4u, new AwS74S1000000_24(str, 16));
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaAwemeCacheService
    public final String LIZ(long j, long j2, String str, String str2) {
        String strLIZ = C002Y.LIZ(Long.valueOf(j2), str2);
        if (strLIZ != null) {
            C1574690r51.LIZ.getClass();
            if (C1574690r51.LIZ()) {
                if (j > 0 && (!a0.LJJJIL(str2))) {
                    C1574580r4q.LIZIZ.LIZ(Collections.singletonList(Long.valueOf(j)), new C1556020qau(str, str2), null);
                }
            } else {
                C1574610r4t.LIZ.LIZ(strLIZ, new AwS1S2000100_24(strLIZ, j, str, 1));
                return strLIZ;
            }
        }
        return strLIZ;
    }
}
