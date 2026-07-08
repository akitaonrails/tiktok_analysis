package okhttp3.internal.http;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X0W;
import X.C0X34;
import X.C0XLX;
import X.C0XLY;
import X.C1495400p18;
import X.C1495420p1A;
import X.C1495430p1B;
import X.C1495650p1X;
import X.C1496710p3F;
import X.C2188811AlT;
import X.InterfaceC1495410p19;
import X.InterfaceC836900WsK;
import java.net.ProtocolException;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: loaded from: classes24.dex */
public final class CallServerInterceptor implements InterfaceC836900WsK {
    public final boolean LIZ;

    public CallServerInterceptor(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) throws Throwable {
        C0XLX c0xlxLJFF;
        C0XLY c0xlyLIZ;
        Object obj;
        C0X0W c0x0w2 = c0x0w;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400207, "okhttp3/internal/http/CallServerInterceptor", "intercept", this, new Object[]{c0x0w2}, "okhttp3.Response", new C0WZW(false, "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", new C0WZX("ezR2SBYqDITVW0MkVxyFal/OghDkTJQ/MH692jFJY+0OaY/uqStlKM8osA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (C0XLY) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            c0x0w2 = (C0X0W) obj;
        }
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w2;
        InterfaceC1495410p19 interfaceC1495410p19 = c1495400p18.LIZJ;
        C1495430p1B c1495430p1B = c1495400p18.LIZIZ;
        C1495650p1X c1495650p1X = c1495400p18.LIZLLL;
        Request request = c1495400p18.LJFF;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1495400p18.LJII.requestHeadersStart(c1495400p18.LJI);
        interfaceC1495410p19.LIZIZ(request);
        c1495400p18.LJII.requestHeadersEnd(c1495400p18.LJI, request);
        if (C0X34.LIZ(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                interfaceC1495410p19.LIZ();
                c1495400p18.LJII.responseHeadersStart(c1495400p18.LJI);
                c0xlxLJFF = interfaceC1495410p19.LJFF(true);
                if (c0xlxLJFF != null) {
                    if (c1495650p1X.LJII == null) {
                        c1495430p1B.LJFF();
                    }
                }
            } else {
                c0xlxLJFF = null;
            }
            c1495400p18.LJII.requestBodyStart(c1495400p18.LJI);
            C1495420p1A c1495420p1A = new C1495420p1A(interfaceC1495410p19.LIZJ(request, request.body().LIZ()));
            C1496710p3F c1496710p3F = new C1496710p3F(c1495420p1A);
            request.body().LJ(c1496710p3F);
            c1496710p3F.close();
            c1495400p18.LJII.requestBodyEnd(c1495400p18.LJI, c1495420p1A.LLILLJJLI);
        } else {
            c0xlxLJFF = null;
        }
        interfaceC1495410p19.LIZLLL();
        if (c0xlxLJFF == null) {
            c1495400p18.LJII.responseHeadersStart(c1495400p18.LJI);
            c0xlxLJFF = interfaceC1495410p19.LJFF(false);
        }
        c0xlxLJFF.LIZ = request;
        c0xlxLJFF.LJ = c1495430p1B.LIZIZ().LJFF;
        c0xlxLJFF.LJIIJ = jCurrentTimeMillis;
        c0xlxLJFF.LJIIJJI = System.currentTimeMillis();
        C0XLY c0xlyLIZ2 = c0xlxLJFF.LIZ();
        int i = c0xlyLIZ2.LLILLL;
        if (i == 100) {
            C0XLX c0xlxLJFF2 = interfaceC1495410p19.LJFF(false);
            c0xlxLJFF2.LIZ = request;
            c0xlxLJFF2.LJ = c1495430p1B.LIZIZ().LJFF;
            c0xlxLJFF2.LJIIJ = jCurrentTimeMillis;
            c0xlxLJFF2.LJIIJJI = System.currentTimeMillis();
            c0xlyLIZ2 = c0xlxLJFF2.LIZ();
            i = c0xlyLIZ2.LLILLL;
        }
        c1495400p18.LJII.responseHeadersEnd(c1495400p18.LJI, c0xlyLIZ2);
        if (this.LIZ && i == 101) {
            C0XLX c0xlx = new C0XLX(c0xlyLIZ2);
            c0xlx.LJI = c.LIZJ;
            c0xlyLIZ = c0xlx.LIZ();
        } else {
            C0XLX c0xlx2 = new C0XLX(c0xlyLIZ2);
            c0xlx2.LJI = interfaceC1495410p19.LJ(c0xlyLIZ2);
            c0xlyLIZ = c0xlx2.LIZ();
        }
        if ("close".equalsIgnoreCase(c0xlyLIZ.LL.header("Connection")) || "close".equalsIgnoreCase(c0xlyLIZ.LIZ("Connection", null))) {
            c1495430p1B.LJFF();
        }
        if ((i == 204 || i == 205) && c0xlyLIZ.LLIZ.contentLength() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HTTP ");
            sbLIZ.append(i);
            sbLIZ.append(" had non-zero Content-Length: ");
            sbLIZ.append(c0xlyLIZ.LLIZ.contentLength());
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return c0xlyLIZ;
    }
}
