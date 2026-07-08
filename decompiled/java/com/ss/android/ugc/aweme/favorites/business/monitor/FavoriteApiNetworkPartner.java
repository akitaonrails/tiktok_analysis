package com.ss.android.ugc.aweme.favorites.business.monitor;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C0X52;
import X.C0XIR;
import X.C1172310gc1;
import X.C2188811AlT;
import X.C23112093u;
import X.C452501pT;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: loaded from: classes19.dex */
public final class FavoriteApiNetworkPartner implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1172310gc1());

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    public final AbstractC1604130rqV LIZIZ() {
        return (AbstractC1604130rqV) this.LIZ.getValue();
    }

    public final void LJ(String str, C0X52<?> c0x52, Throwable th) {
        int errorCode;
        String strValueOf;
        if (c0x52 != null) {
            errorCode = c0x52.LIZ.LIZIZ;
        } else {
            if (th != null) {
                if (th instanceof C0XIR) {
                    errorCode = ((C23112093u) th).getErrorCode();
                } else {
                    errorCode = -1002;
                }
                if (th instanceof C0XIR) {
                    strValueOf = ((C0XIR) th).getErrorMsg();
                } else {
                    strValueOf = String.valueOf(th.getCause());
                }
                AbstractC1604130rqV abstractC1604130rqVLIZIZ = LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FavoriteApiNetworkPartner path: ");
                sbLIZ.append(str);
                sbLIZ.append(", statusCode: ");
                sbLIZ.append(errorCode);
                sbLIZ.append(", statusMsg: ");
                sbLIZ.append(strValueOf);
                abstractC1604130rqVLIZIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            errorCode = -1001;
        }
        strValueOf = "unknown";
        AbstractC1604130rqV abstractC1604130rqVLIZIZ2 = LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("FavoriteApiNetworkPartner path: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", statusCode: ");
        sbLIZ2.append(errorCode);
        sbLIZ2.append(", statusMsg: ");
        sbLIZ2.append(strValueOf);
        abstractC1604130rqVLIZIZ2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05ee A[Catch: all -> 0x0641, TryCatch #0 {all -> 0x0641, blocks: (B:7:0x0009, B:9:0x000f, B:13:0x0036, B:131:0x05ee, B:133:0x05f2, B:134:0x063c, B:28:0x0125, B:29:0x012a, B:31:0x0132, B:33:0x0136, B:34:0x0198, B:35:0x019d, B:37:0x01a5, B:39:0x01a9, B:41:0x01b0, B:42:0x01b2, B:44:0x01b9, B:45:0x01bb, B:48:0x0221, B:49:0x0226, B:51:0x022e, B:53:0x0232, B:54:0x0293, B:55:0x0298, B:57:0x02a0, B:61:0x02b9, B:68:0x0372, B:69:0x0377, B:71:0x037f, B:73:0x0383, B:75:0x0390, B:77:0x0394, B:78:0x0398, B:80:0x03e8, B:100:0x04cb, B:107:0x04ea, B:124:0x05da, B:103:0x04d2, B:128:0x05e0, B:130:0x05e8, B:6:0x0007), top: B:141:0x0007 }] */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.bytedance.retrofit2.client.Request r24, X.C0X52<?> r25, java.lang.Throwable r26) {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.monitor.FavoriteApiNetworkPartner.LJIIJJI(com.bytedance.retrofit2.client.Request, X.0X52, java.lang.Throwable):void");
    }
}
