package com.ss.android.ugc.aweme.ecommerce.network;

import X.C080U;
import X.C0XLO;
import X.C0XS7;
import X.C1336330ksZ;
import X.C1494600ozq;
import X.C1494850p0F;
import X.C1499330p7T;
import X.C1515820pY4;
import X.C718040SEo;
import X.C786410Ut5;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.network.EcomNetworkInterceptOptConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomResponseHandler implements NetworkPartner.ResponseHandler {
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.ResponseHandler
    public final void LIZ(C0XS7<?> c0xs7, C1499330p7T c1499330p7T) throws JSONException {
        C1494600ozq c1494600ozq;
        Object obj;
        Response response;
        String strLIZJ;
        C0XLO c0xlo = c0xs7.LIZIZ;
        if (!C1336330ksZ.LIZLLL(c0xlo.LIZLLL, c0xlo.LJFF.LIZ())) {
            return;
        }
        T t = c0xs7.LJII;
        if ((t instanceof Response) && (response = (Response) t) != null && response.logId == null && (strLIZJ = c0xs7.LJ.LIZJ("X-Tt-Logid")) != null) {
            response.logId = strLIZJ;
        }
        EcomNetworkInterceptOptConfig.EcomNetworkInterceptOptModel ecomNetworkInterceptOptModel = EcomNetworkInterceptOptConfig.LIZ;
        String strLIZ = c0xs7.LIZIZ.LJFF.LIZ();
        EcomNetworkInterceptOptConfig.EcomNetworkInterceptOptModel ecomNetworkInterceptOptModel2 = EcomNetworkInterceptOptConfig.LIZ;
        if ((!ecomNetworkInterceptOptModel2.ttnetTimingWhiteList.isEmpty()) && ecomNetworkInterceptOptModel2.ttnetTimingWhiteList.contains(strLIZ) && (obj = c0xs7.LJI) != null && (obj instanceof C1494850p0F)) {
            StringBuilder sb = new StringBuilder("ttnet_total_time=");
            C1494600ozq c1494600ozq2 = (C1494600ozq) obj;
            sb.append(c1494600ozq2.LJIILLIIL);
            sb.append(",ttnet_dns_time=");
            sb.append(c1494600ozq2.LJIIJ);
            sb.append(",ttnet_connect_time=");
            sb.append(c1494600ozq2.LJIIJJI);
            sb.append(",ttnet_ssl_time=");
            sb.append(c1494600ozq2.LJIIL);
            sb.append(",ttnet_send_time=");
            sb.append(c1494600ozq2.LJIILIIL);
            sb.append(",ttnet_receive_time=");
            sb.append(c1494600ozq2.LJIILL);
            sb.append(",ttnet_ttfb_time=");
            sb.append(c1494600ozq2.LJIILJJIL);
            sb.append(",ttnet_socket_resued=");
            sb.append(c1494600ozq2.LJJI);
            sb.append(",ttnet_receive_byte=");
            sb.append(c1494600ozq2.LJIJJ);
            c0xs7.LJ.LIZ("ttnet-timing", sb.toString());
        }
        if (c0xs7.LJII instanceof C1515820pY4) {
            Object obj2 = c0xs7.LJI;
            if ((obj2 instanceof C1494600ozq) && (c1494600ozq = (C1494600ozq) obj2) != null) {
                String str = c1494600ozq.LJJIJ;
                if (str == null || str.length() == 0) {
                    JSONObject jSONObject = new JSONObject();
                    for (C080U c080u : (ArrayList) c0xs7.LJ.LIZIZ()) {
                        jSONObject.put(c080u.LIZ, c080u.LIZIZ);
                    }
                    c1494600ozq.LJJIJ = C786410Ut5.J3(jSONObject);
                }
            }
        }
    }
}
