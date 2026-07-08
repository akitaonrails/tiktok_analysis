package okhttp3.internal.cache;

import X.AbstractC1495490p1H;
import X.C0X0W;
import X.C0X1U;
import X.C0X1V;
import X.C0XLV;
import X.C0XLX;
import X.C0XLY;
import X.C1495400p18;
import X.C1495450p1D;
import X.EnumC847200XLi;
import X.InterfaceC836900WsK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: loaded from: classes14.dex */
public final class CacheInterceptor implements InterfaceC836900WsK {
    public static boolean LIZ(String str) {
        if (!"Content-Length".equalsIgnoreCase(str) && !"Content-Encoding".equalsIgnoreCase(str) && !"Content-Type".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static C0XLY LIZJ(C0XLY c0xly) {
        if (c0xly != null && c0xly.LLIZ != null) {
            C0XLX c0xlx = new C0XLX(c0xly);
            c0xlx.LJI = null;
            return c0xlx.LIZ();
        }
        return c0xly;
    }

    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        System.currentTimeMillis();
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request request = c1495400p18.LJFF;
        C0XLV c0xlv = new C0XLV(request, null);
        if (request != null && request.cacheControl().LJIIIZ) {
            c0xlv = new C0XLV(null, null);
        }
        Request request2 = c0xlv.LIZ;
        C0XLY c0xly = c0xlv.LIZIZ;
        if (request2 == null && c0xly == null) {
            C0XLX c0xlx = new C0XLX();
            c0xlx.LIZ = c1495400p18.LJFF;
            c0xlx.LIZIZ = EnumC847200XLi.HTTP_1_1;
            c0xlx.LIZJ = 504;
            c0xlx.LIZLLL = "Unsatisfiable Request (only-if-cached)";
            c0xlx.LJI = c.LIZJ;
            c0xlx.LJIIJ = -1L;
            c0xlx.LJIIJJI = System.currentTimeMillis();
            return c0xlx.LIZ();
        }
        if (request2 == null) {
            c0xly.getClass();
            C0XLX c0xlx2 = new C0XLX(c0xly);
            C0XLY c0xlyLIZJ = LIZJ(c0xly);
            if (c0xlyLIZJ != null) {
                C0XLX.LIZIZ("cacheResponse", c0xlyLIZJ);
            }
            c0xlx2.LJIIIIZZ = c0xlyLIZJ;
            return c0xlx2.LIZ();
        }
        try {
            C0XLY c0xlyLIZ = ((C1495400p18) c0x0w).LIZ(request2);
            if (c0xly != null) {
                if (c0xlyLIZ.LLILLL == 304) {
                    C0XLX c0xlx3 = new C0XLX(c0xly);
                    C0X1V c0x1v = c0xly.LLILZLL;
                    C0X1V c0x1v2 = c0xlyLIZ.LLILZLL;
                    C0X1U c0x1u = new C0X1U();
                    int length = c0x1v.LIZ.length / 2;
                    for (int i = 0; i < length; i++) {
                        String strLJ = c0x1v.LJ(i);
                        String strLJIIJ = c0x1v.LJIIJ(i);
                        if ((!"Warning".equalsIgnoreCase(strLJ) || !strLJIIJ.startsWith("1")) && (LIZ(strLJ) || !LIZIZ(strLJ) || c0x1v2.LIZLLL(strLJ) == null)) {
                            AbstractC1495490p1H.LIZ.getClass();
                            c0x1u.LIZIZ(strLJ, strLJIIJ);
                        }
                    }
                    int length2 = c0x1v2.LIZ.length / 2;
                    for (int i2 = 0; i2 < length2; i2++) {
                        String strLJ2 = c0x1v2.LJ(i2);
                        if (!LIZ(strLJ2) && LIZIZ(strLJ2)) {
                            C1495450p1D c1495450p1D = AbstractC1495490p1H.LIZ;
                            String strLJIIJ2 = c0x1v2.LJIIJ(i2);
                            c1495450p1D.getClass();
                            c0x1u.LIZIZ(strLJ2, strLJIIJ2);
                        }
                    }
                    c0xlx3.LJFF = new C0X1V(c0x1u).LJI();
                    c0xlx3.LJIIJ = c0xlyLIZ.LLJIJIL;
                    c0xlx3.LJIIJJI = c0xlyLIZ.LLJILJIL;
                    C0XLY c0xlyLIZJ2 = LIZJ(c0xly);
                    if (c0xlyLIZJ2 != null) {
                        C0XLX.LIZIZ("cacheResponse", c0xlyLIZJ2);
                    }
                    c0xlx3.LJIIIIZZ = c0xlyLIZJ2;
                    C0XLY c0xlyLIZJ3 = LIZJ(c0xlyLIZ);
                    if (c0xlyLIZJ3 != null) {
                        C0XLX.LIZIZ("networkResponse", c0xlyLIZJ3);
                    }
                    c0xlx3.LJII = c0xlyLIZJ3;
                    c0xlx3.LIZ();
                    c0xlyLIZ.LLIZ.close();
                    throw null;
                }
                c.LJ(c0xly.LLIZ);
            }
            c0xlyLIZ.getClass();
            C0XLX c0xlx4 = new C0XLX(c0xlyLIZ);
            C0XLY c0xlyLIZJ4 = LIZJ(c0xly);
            if (c0xlyLIZJ4 != null) {
                C0XLX.LIZIZ("cacheResponse", c0xlyLIZJ4);
            }
            c0xlx4.LJIIIIZZ = c0xlyLIZJ4;
            C0XLY c0xlyLIZJ5 = LIZJ(c0xlyLIZ);
            if (c0xlyLIZJ5 != null) {
                C0XLX.LIZIZ("networkResponse", c0xlyLIZJ5);
            }
            c0xlx4.LJII = c0xlyLIZJ5;
            return c0xlx4.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
