package okhttp3.internal.http;

import X.AbstractC842530X3j;
import X.C0X0P;
import X.C0X0W;
import X.C0X1U;
import X.C0X1V;
import X.C0X2Z;
import X.C0X33;
import X.C0XLX;
import X.C0XLY;
import X.C1495400p18;
import X.C1496660p3A;
import X.C1496670p3B;
import X.C842180X2a;
import X.C842190X2b;
import X.C842200X2c;
import X.InterfaceC836900WsK;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: loaded from: classes14.dex */
public final class BridgeInterceptor implements InterfaceC836900WsK {
    public final C0X2Z LIZ;

    public BridgeInterceptor(C0X2Z c0x2z) {
        this.LIZ = c0x2z;
    }

    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        boolean z;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request request = c1495400p18.LJFF;
        C0X33 c0x33NewBuilder = request.newBuilder();
        AbstractC842530X3j abstractC842530X3jBody = request.body();
        if (abstractC842530X3jBody != null) {
            C0X0P c0x0pLIZIZ = abstractC842530X3jBody.LIZIZ();
            if (c0x0pLIZIZ != null) {
                c0x33NewBuilder.LIZJ("Content-Type", c0x0pLIZIZ.LIZ);
            }
            long jLIZ = abstractC842530X3jBody.LIZ();
            if (jLIZ != -1) {
                c0x33NewBuilder.LIZJ("Content-Length", Long.toString(jLIZ));
                c0x33NewBuilder.LJFF("Transfer-Encoding");
            } else {
                c0x33NewBuilder.LIZJ("Transfer-Encoding", "chunked");
                c0x33NewBuilder.LJFF("Content-Length");
            }
        }
        if (request.header("Host") == null) {
            c0x33NewBuilder.LIZJ("Host", c.LJIIL(request.url(), false));
        }
        if (request.header("Connection") == null) {
            c0x33NewBuilder.LIZJ("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            c0x33NewBuilder.LIZJ("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C842190X2b> listLIZ = this.LIZ.LIZ(request.url());
        if (!listLIZ.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = listLIZ.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C842190X2b c842190X2b = (C842190X2b) ListProtector.get(listLIZ, i);
                sb.append(c842190X2b.LIZ);
                sb.append('=');
                sb.append(c842190X2b.LIZIZ);
            }
            c0x33NewBuilder.LIZJ("Cookie", sb.toString());
        }
        if (request.header("User-Agent") == null) {
            c0x33NewBuilder.LIZJ("User-Agent", "okhttp/3.12.13.21");
        }
        C0XLY c0xlyLIZ = c1495400p18.LIZ(c0x33NewBuilder.LIZIZ());
        C842180X2a.LIZLLL(this.LIZ, request.url(), c0xlyLIZ.LLILZLL);
        C0XLX c0xlx = new C0XLX(c0xlyLIZ);
        c0xlx.LIZ = request;
        if (z && "gzip".equalsIgnoreCase(c0xlyLIZ.LIZ("Content-Encoding", null)) && C842180X2a.LIZIZ(c0xlyLIZ)) {
            C1496660p3A c1496660p3A = new C1496660p3A(c0xlyLIZ.LLIZ.source());
            C0X1U c0x1uLJI = c0xlyLIZ.LLILZLL.LJI();
            c0x1uLJI.LIZLLL("Content-Encoding");
            c0x1uLJI.LIZLLL("Content-Length");
            c0xlx.LJFF = new C0X1V(c0x1uLJI).LJI();
            c0xlx.LJI = new C842200X2c(c0xlyLIZ.LIZ("Content-Type", null), -1L, new C1496670p3B(c1496660p3A));
        }
        return c0xlx.LIZ();
    }
}
