package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C1392670mLR;
import X.C1574470r4f;
import X.C1612150s3R;
import X.EnumC1574490r4h;
import X.InterfaceC1612220s3Y;
import android.os.Build;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaCacheServiceImpl implements MiniDramaCacheService {
    public final ConcurrentHashMap<Long, InterfaceC1612220s3Y> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, Integer> LIZJ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService
    public final boolean LIZ(Long l) {
        return LIZLLL(l).LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService
    public final boolean LIZIZ(Long l) {
        return LIZLLL(l).LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService
    public final void LIZJ(Long l) {
        int iIntValue;
        if (l != null) {
            long jLongValue = l.longValue();
            Integer num = this.LIZJ.get(Long.valueOf(jLongValue));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            this.LIZJ.put(Long.valueOf(jLongValue), Integer.valueOf(iIntValue + 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService
    public final InterfaceC1612220s3Y LIZLLL(Long l) {
        long jLongValue;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i != 27) {
            return this.LIZIZ.computeIfAbsent(Long.valueOf(jLongValue), new Function() { // from class: X.0s3i
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C1612150s3R();
                }
            });
        }
        if (!this.LIZIZ.containsKey(Long.valueOf(jLongValue))) {
            this.LIZIZ.put(Long.valueOf(jLongValue), new C1612150s3R());
        }
        InterfaceC1612220s3Y interfaceC1612220s3Y = this.LIZIZ.get(Long.valueOf(jLongValue));
        if (interfaceC1612220s3Y == null) {
            C1612150s3R c1612150s3R = new C1612150s3R();
            this.LIZIZ.put(Long.valueOf(jLongValue), c1612150s3R);
            return c1612150s3R;
        }
        return interfaceC1612220s3Y;
    }

    @Override // com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService
    public final void LJ(Long l) {
        int iIntValue;
        if (l != null) {
            long jLongValue = l.longValue();
            Integer num = this.LIZJ.get(Long.valueOf(jLongValue));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            int i = iIntValue - 1;
            this.LIZJ.put(Long.valueOf(jLongValue), Integer.valueOf(i));
            if (i == 0) {
                LIZLLL(Long.valueOf(jLongValue)).clear();
                MiniDramaDetailOperator.LIZ.getClass();
                MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
                if (miniDramaDetailOperatorLIZ != null) {
                    miniDramaDetailOperatorLIZ.Ym(jLongValue);
                }
            }
            Collection<Integer> collectionValues = this.LIZJ.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                for (Integer num2 : collectionValues) {
                    if (num2 == null || num2.intValue() != 0) {
                        return;
                    }
                }
            }
            Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
            C1574470r4f.LIZLLL(EnumC1574490r4h.RECOMMENDED_DRAMA);
        }
    }
}
