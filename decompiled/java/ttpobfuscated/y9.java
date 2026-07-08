package ttpobfuscated;

import X.AbstractC842530X3j;
import X.C1496330p2d;
import X.C1496710p3F;
import X.C2095008Iq;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.ranges.IntRange;
import ttp.orbu.sdk.configuration.model.ServerAPITypeKt;

/* JADX INFO: loaded from: classes24.dex */
public final class y9 {
    public static final AbstractC842530X3j a(AbstractC842530X3j abstractC842530X3j, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (abstractC842530X3j != null && abstractC842530X3j.LIZ() > iIntValue) {
                C1496710p3F c1496710p3F = new C1496710p3F(C1496330p2d.LIZ(new ByteArrayOutputStream()));
                abstractC842530X3j.LJ(c1496710p3F);
                byte[] bArr = new byte[iIntValue];
                c1496710p3F.LL.read(bArr);
                return AbstractC842530X3j.LIZLLL(abstractC842530X3j.LIZIZ(), bArr);
            }
            return abstractC842530X3j;
        }
        return abstractC842530X3j;
    }

    public static final long a(Object obj, Integer num, s4 s4Var, Map<IntRange, Long> map) {
        Integer numLJIIJJI;
        String str;
        int default_service_defer_interval_in_seconds;
        Map.Entry<IntRange, Long> next;
        Long value;
        boolean z;
        if (s4Var.a("adaptiveConfigDelay")) {
            if (!(obj instanceof Integer) || (numLJIIJJI = (Integer) obj) == null) {
                if ((obj instanceof String) && (str = (String) obj) != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(str);
                } else {
                    numLJIIJJI = null;
                }
            }
            if (num != null) {
                default_service_defer_interval_in_seconds = num.intValue();
            } else {
                default_service_defer_interval_in_seconds = ServerAPITypeKt.getDEFAULT_SERVICE_DEFER_INTERVAL_IN_SECONDS();
            }
            long j = default_service_defer_interval_in_seconds * LSPassThroughRecordSizeConfig.DEFAULT;
            if (numLJIIJJI != null) {
                int iIntValue = numLJIIJJI.intValue();
                Iterator<Map.Entry<IntRange, Long>> it2 = map.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        IntRange key = next.getKey();
                        boolean z2 = true;
                        if (iIntValue >= key.LL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i = key.LLILLJJLI;
                        if (i != Integer.MAX_VALUE && iIntValue >= i) {
                            z2 = false;
                        }
                        if (z && z2) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Map.Entry<IntRange, Long> entry = next;
                if (entry != null && (value = entry.getValue()) != null) {
                    return value.longValue();
                }
                return j;
            }
            return j;
        }
        return ServerAPITypeKt.getDEFAULT_SERVICE_DEFER_INTERVAL_IN_SECONDS() * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static /* synthetic */ long a(Object obj, Integer num, s4 s4Var, Map map, int i, Object obj2) {
        if ((i & 2) != 0) {
            num = Integer.valueOf(ServerAPITypeKt.getDEFAULT_SERVICE_DEFER_INTERVAL_IN_SECONDS());
        }
        return a(obj, num, s4Var, map);
    }
}
