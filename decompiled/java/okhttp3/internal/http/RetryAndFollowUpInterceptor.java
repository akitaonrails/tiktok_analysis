package okhttp3.internal.http;

import X.AbstractC1494940p0O;
import X.C0X0W;
import X.C0XLQ;
import X.C0XLX;
import X.C0XLY;
import X.C0XLZ;
import X.C1490230osn;
import X.C1493970oyp;
import X.C1493980oyq;
import X.C1494950p0P;
import X.C1495380p16;
import X.C1495390p17;
import X.C1495400p18;
import X.C1495430p1B;
import X.C1495520p1K;
import X.C1495540p1M;
import X.C1495680p1a;
import X.C2188811AlT;
import X.InterfaceC1495410p19;
import X.InterfaceC1495580p1Q;
import X.InterfaceC836900WsK;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Request;
import xlp.c;

/* JADX INFO: loaded from: classes24.dex */
public final class RetryAndFollowUpInterceptor implements InterfaceC836900WsK {
    public static final List<String> LJI = c.LJIILJJIL("Accept", "Accept-Charset", "Accept-Encoding", "Accept-Language", "Authorization", "Cache-Control", "Connection", "Content-Length", "Content-Type", "Host", "If-Match", "If-Modified-Since", "If-None-Match", "If-Range", "If-Unmodified-Since", "Origin", "Pragma", "Proxy-Authorization", "Proxy-Connection", "Range", "Referer", "Transfer-Encoding", "User-Agent");
    public final C1495520p1K LIZ;
    public volatile C1495430p1B LIZIZ;
    public Object LIZJ;
    public volatile boolean LIZLLL;
    public volatile int LJ = -1;
    public volatile boolean LJFF;

    public RetryAndFollowUpInterceptor(C1495520p1K c1495520p1K) {
        this.LIZ = c1495520p1K;
    }

    public final C1495540p1M LIZ(C0XLQ c0xlq) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C1495680p1a c1495680p1a;
        if (c0xlq.LIZ.equals("https")) {
            C1495520p1K c1495520p1K = this.LIZ;
            sSLSocketFactory = c1495520p1K.LLJIJIL;
            hostnameVerifier = c1495520p1K.LLJILJILJ;
            c1495680p1a = c1495520p1K.LLJILLL;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c1495680p1a = null;
        }
        String str = c0xlq.LIZLLL;
        int i = c0xlq.LJ;
        C1495520p1K c1495520p1K2 = this.LIZ;
        return new C1495540p1M(str, i, c1495520p1K2.LLJJIJI, c1495520p1K2.LLJI, sSLSocketFactory, hostnameVerifier, c1495680p1a, c1495520p1K2.LLJJ, c1495520p1K2.LLILLJJLI, c1495520p1K2.LLILLL, c1495520p1K2.LLILZ, c1495520p1K2.LLIZLLLIL, c1495520p1K2.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) throws IOException {
        boolean z;
        C0XLY c0xlyLJ;
        InterfaceC1495410p19 interfaceC1495410p19;
        Request requestLIZIZ = ((C1495400p18) c0x0w).LJFF;
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        InterfaceC1495580p1Q interfaceC1495580p1Q = c1495400p18.LJI;
        AbstractC1494940p0O abstractC1494940p0O = c1495400p18.LJII;
        C1495430p1B c1495430p1B = new C1495430p1B(this.LIZ.LLJJIII, LIZ(requestLIZIZ.url()), interfaceC1495580p1Q, abstractC1494940p0O, this.LIZJ);
        this.LIZIZ = c1495430p1B;
        int i = 0;
        C0XLY c0xly = null;
        while (!this.LIZLLL) {
            try {
                try {
                    c0xlyLJ = c1495400p18.LJ(requestLIZIZ, c1495430p1B, null, null);
                    if (c0xly != null) {
                        C0XLX c0xlx = new C0XLX(c0xlyLJ);
                        C0XLX c0xlx2 = new C0XLX(c0xly);
                        c0xlx2.LJI = null;
                        C0XLY c0xlyLIZ = c0xlx2.LIZ();
                        if (c0xlyLIZ.LLIZ == null) {
                            c0xlx.LJIIIZ = c0xlyLIZ;
                            c0xlyLJ = c0xlx.LIZ();
                        } else {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                    }
                    try {
                        requestLIZIZ = LIZIZ(c0xlyLJ, c1495430p1B.LIZJ, interfaceC1495580p1Q, abstractC1494940p0O);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1495430p1B.LJI();
                        throw e;
                    }
                } catch (C0XLZ e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    if (!LIZJ(e2.getLastConnectException(), c1495430p1B, false, requestLIZIZ)) {
                        throw e2.getFirstConnectException();
                    }
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    if (!(e3 instanceof C1495390p17)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!LIZJ(e3, c1495430p1B, z, requestLIZIZ)) {
                        throw e3;
                    }
                }
                if (requestLIZIZ != null) {
                    c.LJ(c0xlyLJ.LLIZ);
                    i++;
                    if (i <= 20) {
                        requestLIZIZ.body();
                        if (!LJ(c0xlyLJ, requestLIZIZ.url())) {
                            c1495430p1B.LJI();
                            c1495430p1B = new C1495430p1B(this.LIZ.LLJJIII, LIZ(requestLIZIZ.url()), interfaceC1495580p1Q, abstractC1494940p0O, this.LIZJ);
                            this.LIZIZ = c1495430p1B;
                        } else {
                            synchronized (c1495430p1B.LIZLLL) {
                                try {
                                    interfaceC1495410p19 = c1495430p1B.LJIILJJIL;
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            if (interfaceC1495410p19 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Closing the body of ");
                                sbLIZ.append(c0xlyLJ);
                                sbLIZ.append(" didn't close its backing stream. Bad interceptor?");
                                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        c0xly = c0xlyLJ;
                    } else {
                        c1495430p1B.LJI();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Too many follow-up requests: ");
                        sbLIZ2.append(i);
                        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    c1495430p1B.LJI();
                    return c0xlyLJ;
                }
            } catch (Throwable th) {
                c1495430p1B.LJII(null);
                c1495430p1B.LJI();
                throw th;
            }
        }
        c1495430p1B.LJI();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Canceled#Reason=");
        sbLIZ3.append(this.LJ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static int LIZLLL(C0XLY c0xly, int i) {
        String strLIZ = c0xly.LIZ("Retry-After", null);
        if (strLIZ == null) {
            return i;
        }
        if (strLIZ.matches("\\d+")) {
            return CastIntegerProtector.valueOf(strLIZ).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean LJ(C0XLY c0xly, C0XLQ c0xlq) {
        C0XLQ c0xlqUrl = c0xly.LL.url();
        if (c0xlqUrl.LIZLLL.equals(c0xlq.LIZLLL) && c0xlqUrl.LJ == c0xlq.LJ && c0xlqUrl.LIZ.equals(c0xlq.LIZ)) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(IOException iOException, Request request) {
        if (this.LJFF) {
            return false;
        }
        this.LJFF = true;
        int iLIZJ = C1494950p0P.LIZJ(iOException);
        C1490230osn c1490230osnLIZIZ = C1490230osn.LIZIZ();
        c1490230osnLIZIZ.getClass();
        if (iOException != null && request.url() != null && c1490230osnLIZIZ.LJI.get() && c1490230osnLIZIZ.LJII.contains(Integer.valueOf(iLIZJ))) {
            String str = request.url().LIZLLL;
            if (!TextUtils.isEmpty(str) && c1490230osnLIZIZ.LJIIIIZZ.contains(str)) {
                C1495430p1B c1495430p1B = this.LIZIZ;
                C1493970oyp c1493970oyp = c1495430p1B.LJII;
                C1495540p1M c1495540p1M = c1493970oyp.LIZ;
                c1493970oyp.LIZJ(c1495540p1M.LIZ, c1495540p1M.LJII);
                c1493970oyp.LJII.clear();
                ((ArrayList) c1493970oyp.LJIIIIZZ).clear();
                c1493970oyp.LJ = null;
                c1495430p1B.LIZIZ = null;
                if (C1495380p16.LIZIZ == null) {
                    synchronized (C1495380p16.class) {
                        try {
                            if (C1495380p16.LIZIZ == null) {
                                C1495380p16.LIZIZ = new C1495380p16();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                C1495380p16 c1495380p16 = C1495380p16.LIZIZ;
                c1495380p16.getClass();
                if (request.url() != null && !TextUtils.isEmpty(request.url().LIZLLL)) {
                    c1495380p16.LIZ.add(request.url().LIZLLL);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Request LIZIZ(X.C0XLY r22, X.C1495560p1O r23, X.InterfaceC1495580p1Q r24, X.AbstractC1494940p0O r25) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.LIZIZ(X.0XLY, X.0p1O, X.0p1Q, X.0p0O):okhttp3.Request");
    }

    public final boolean LIZJ(IOException iOException, C1495430p1B c1495430p1B, boolean z, Request request) {
        C1493980oyq c1493980oyq;
        c1495430p1B.LJII(iOException);
        if (!this.LIZ.LLJJJ) {
            return false;
        }
        if (z) {
            request.body();
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) {
            C1495430p1B c1495430p1B2 = this.LIZIZ;
            if (c1495430p1B2.LIZJ == null && ((c1493980oyq = c1495430p1B2.LIZIZ) == null || !c1493980oyq.LIZ())) {
                C1493970oyp c1493970oyp = c1495430p1B2.LJII;
                if (c1493970oyp.LJI >= c1493970oyp.LJFF.size() && ((ArrayList) c1493970oyp.LJIIIIZZ).isEmpty()) {
                    return LJFF(iOException, request);
                }
            }
            return true;
        }
        return LJFF(iOException, request);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.InterfaceC1495580p1Q r8, okhttp3.Request r9, X.C0XLQ r10, boolean r11, X.C0X33 r12, X.AbstractC1494940p0O r13) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.LJI(X.0p1Q, okhttp3.Request, X.0XLQ, boolean, X.0X33, X.0p0O):void");
    }
}
