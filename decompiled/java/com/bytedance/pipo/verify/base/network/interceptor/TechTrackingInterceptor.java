package com.bytedance.pipo.verify.base.network.interceptor;

import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.C1707050uWV;
import X.C1713570uh1;
import X.C1713600uh4;
import X.C1713750uhJ;
import X.C1713770uhL;
import X.C1714240ui6;
import X.C2175508fh;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TechTrackingInterceptor implements InterfaceC1904907d9 {
    public final String LL;

    public TechTrackingInterceptor(String str) {
        this.LL = str;
    }

    public final String LIZ(C0X52<?> c0x52) {
        List<C080U> listLIZIZ;
        try {
            C2175508fh c2175508fh = c0x52.LIZ;
            if (c2175508fh != null) {
                listLIZIZ = c2175508fh.LIZIZ("X-Tt-Logid");
            } else {
                listLIZIZ = null;
            }
            if (listLIZIZ != null && listLIZIZ.size() > 0) {
                String str = listLIZIZ.get(0).LIZIZ;
                if (str == null) {
                    return "";
                }
                return str;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return "";
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C0X52 c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            try {
                LIZIZ(request, c0x52LIZ);
            } catch (Throwable th) {
            }
            try {
                LIZJ(request, c0x52LIZ, System.currentTimeMillis() - jCurrentTimeMillis, null);
                return c0x52LIZ;
            } catch (Throwable th2) {
                return c0x52LIZ;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                LIZJ(request, null, System.currentTimeMillis() - jCurrentTimeMillis, th3);
                throw th3;
            } finally {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Request request, C0X52<?> c0x52) {
        BaseResponse baseResponse;
        C1713570uh1 c1713570uh1LIZ;
        C1713750uhJ c1713750uhJLJII;
        T t = c0x52.LIZIZ;
        if ((t instanceof BaseResponse) && (baseResponse = (BaseResponse) t) != null && (c1713570uh1LIZ = C1713600uh4.LIZ(this.LL)) != null && (c1713750uhJLJII = c1713570uh1LIZ.LJII()) != null) {
            if (!Intrinsics.LJFF(baseResponse.resultCode, "success")) {
                C1713750uhJ.LJI(c1713750uhJLJII, request.getUrl(), LIZ(c0x52), baseResponse.errorCode, baseResponse.errorMessage, null, 16);
            } else {
                C1707050uWV.LIZ(new C1713770uhL(c1713750uhJLJII, request.getUrl(), true, LIZ(c0x52), null, null, null));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(Request request, C0X52<?> c0x52, long j, Throwable th) {
        C1713570uh1 c1713570uh1LIZ;
        C1713750uhJ c1713750uhJLJII;
        Object obj;
        BaseResponse baseResponse;
        String str;
        String str2;
        DoVerifyResponse doVerifyResponse;
        if (C1714240ui6.LIZLLL() && (c1713570uh1LIZ = C1713600uh4.LIZ(this.LL)) != null && (c1713750uhJLJII = c1713570uh1LIZ.LJII()) != null) {
            String url = request.getUrl();
            if (url != null && url.length() != 0) {
                try {
                    String path = UriProtector.parse(url).getPath();
                    if (path != null) {
                        url = path;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            } else {
                url = "";
            }
            if (th != null) {
                c1713750uhJLJII.LJIIL(j, url, null, null, null, th.toString(), false);
                return;
            }
            String str3 = null;
            if (c0x52 != null) {
                obj = c0x52.LIZIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof BaseResponse) && (baseResponse = (BaseResponse) obj) != null) {
                boolean zLJFF = Intrinsics.LJFF(baseResponse.resultCode, "success");
                T t = baseResponse.data;
                if ((t instanceof DoVerifyResponse) && (doVerifyResponse = (DoVerifyResponse) t) != null) {
                    str = doVerifyResponse.verifyResult;
                    if (str == null) {
                        str = doVerifyResponse.status;
                    }
                } else {
                    str = null;
                }
                String strLIZ = LIZ(c0x52);
                if (zLJFF) {
                    str2 = null;
                } else {
                    str2 = baseResponse.errorCode;
                    str3 = baseResponse.errorMessage;
                }
                c1713750uhJLJII.LJIIL(j, url, str, strLIZ, str2, str3, zLJFF);
            }
        }
    }
}
