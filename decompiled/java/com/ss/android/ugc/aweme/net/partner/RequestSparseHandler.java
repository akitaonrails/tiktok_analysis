package com.ss.android.ugc.aweme.net.partner;

import X.C0XM9;
import X.C0XS7;
import X.C1499330p7T;
import X.C1499500p7k;
import X.C1499630p7x;
import X.C718040SEo;
import X.InterfaceC1499640p7y;
import X.InterfaceC1499650p7z;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestSparseHandler implements NetworkPartner.RequestHandler, NetworkPartner.ResponseHandler {
    public static final RequestSparseHandler LIZ = new RequestSparseHandler();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) {
        Long l;
        Map<String, InterfaceC1499640p7y> map = C1499630p7x.LIZ;
        String str = c0xs7.LIZIZ.LJIIIIZZ;
        int iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6);
        if (iLJJIZ > 0) {
            String strSubstring = str.substring(0, iLJJIZ);
            InterfaceC1499650p7z interfaceC1499650p7z = C1499630p7x.LIZJ;
            if (interfaceC1499650p7z != null && (l = C1499630p7x.LJFF.get()) != null) {
                long jLongValue = l.longValue();
                Long l2 = C1499630p7x.LJI.get();
                if (l2 != null) {
                    l2.longValue();
                    long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - jLongValue;
                    System.currentTimeMillis();
                    interfaceC1499650p7z.LIZ(jCurrentThreadTimeMillis, strSubstring);
                }
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) throws InterruptedException {
        boolean z;
        Map<String, InterfaceC1499640p7y> map = C1499630p7x.LIZ;
        String str = c0xm9.LIZJ.LJIIIIZZ;
        if (C1499630p7x.LIZJ != null) {
            C1499630p7x.LJFF.set(Long.valueOf(SystemClock.currentThreadTimeMillis()));
            C1499630p7x.LJI.set(Long.valueOf(System.currentTimeMillis()));
        }
        InterfaceC1499640p7y interfaceC1499640p7y = C1499630p7x.LIZIZ;
        if (interfaceC1499640p7y != null) {
            String strReplace = C1499630p7x.LJII.replace(str, "");
            int iLJJIZ = a0.LJJIZ(strReplace, '?', 0, false, 6);
            if (iLJJIZ > 0) {
                strReplace = strReplace.substring(0, iLJJIZ);
            }
            if (strReplace.length() > 0) {
                if ((interfaceC1499640p7y.LJIL() & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (interfaceC1499640p7y.LJJIFFI() != 1 ? !(interfaceC1499640p7y.LJJIFFI() != 2 || !interfaceC1499640p7y.LJJI().contains(strReplace)) : !interfaceC1499640p7y.LJJ().contains(strReplace))) {
                    InterfaceC1499650p7z interfaceC1499650p7z = C1499630p7x.LIZJ;
                    if (interfaceC1499650p7z != null) {
                        interfaceC1499650p7z.LIZIZ(str);
                    }
                    int i = 0;
                    while (true) {
                        InterfaceC1499640p7y interfaceC1499640p7y2 = C1499630p7x.LIZIZ;
                        if (interfaceC1499640p7y2 == null || interfaceC1499640p7y2.LJIL() != 1 || i >= 5) {
                            break;
                        }
                        Thread.sleep(C1499500p7k.LIZIZ);
                        i++;
                    }
                }
                if ((interfaceC1499640p7y.LJIL() & 2) == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - C1499630p7x.LIZLLL;
                    if (interfaceC1499640p7y.LJJIFFI() != 1 ? !(interfaceC1499640p7y.LJJIFFI() != 2 || !interfaceC1499640p7y.LJJI().contains(strReplace)) : !interfaceC1499640p7y.LJJ().contains(strReplace)) {
                        long j = C1499500p7k.LIZ;
                        if (jCurrentTimeMillis < j) {
                            long j2 = j - jCurrentTimeMillis;
                            if (C1499500p7k.LIZJ) {
                                long j3 = C1499630p7x.LJ.get();
                                long j4 = C1499500p7k.LIZ;
                                Long.signum(j3);
                                j2 += j3 * j4;
                            }
                            InterfaceC1499650p7z interfaceC1499650p7z2 = C1499630p7x.LIZJ;
                            if (interfaceC1499650p7z2 != null) {
                                interfaceC1499650p7z2.LIZIZ(str);
                            }
                            AtomicInteger atomicInteger = C1499630p7x.LJ;
                            atomicInteger.incrementAndGet();
                            Thread.sleep(j2);
                            atomicInteger.decrementAndGet();
                        }
                    }
                    C1499630p7x.LIZLLL = System.currentTimeMillis();
                }
            }
        }
    }
}
