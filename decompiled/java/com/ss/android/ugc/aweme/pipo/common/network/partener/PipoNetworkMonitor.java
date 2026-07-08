package com.ss.android.ugc.aweme.pipo.common.network.partener;

import X.AnonymousClass0881;
import X.C098200Yq;
import X.C0X52;
import X.C1494430ozZ;
import X.C1494450ozb;
import X.C1494570ozn;
import X.C1494690ozz;
import X.C1710990ucr;
import X.C189200o6;
import X.C1AF0;
import X.C2188811AlT;
import android.util.Log;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PipoNetworkMonitor implements NetworkPartner.Bystander {
    public final String LIZ;

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

    public /* synthetic */ PipoNetworkMonitor() {
        this("");
    }

    public PipoNetworkMonitor(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Request request, C0X52<?> c0x52, Throwable th) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        JSONObject jSONObjectOptJSONObject;
        String path = request.getPath();
        String host = request.getHost();
        int i = 1;
        String str = null;
        if (c0x52 != null) {
            if (c0x52.LIZJ()) {
                T t = c0x52.LIZIZ;
                if ((t instanceof BaseResponse) && t != 0) {
                    BaseResponse baseResponse = (BaseResponse) t;
                    if (baseResponse.LIZ()) {
                        strValueOf = "success";
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(baseResponse.resultCode);
                        sbLIZ.append('-');
                        sbLIZ.append(baseResponse.errorCode);
                        strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                        str = baseResponse.resultCode;
                        strValueOf2 = baseResponse.errorCode;
                        strValueOf3 = baseResponse.errorMessage;
                    }
                } else {
                    strValueOf = String.valueOf(c0x52.LIZ.LIZIZ);
                }
                i = 0;
                strValueOf3 = null;
                strValueOf2 = null;
            } else {
                strValueOf = String.valueOf(c0x52.LIZ.LIZIZ);
                strValueOf2 = String.valueOf(c0x52.LIZ.LIZIZ);
                strValueOf3 = c0x52.LIZ.LJI;
            }
        } else if (th != null) {
            if (th instanceof C1494430ozZ) {
                strValueOf = "-3";
            } else if (th instanceof C1494690ozz) {
                strValueOf = "-1";
            } else {
                strValueOf = "-2";
            }
            try {
                if (th instanceof C1494430ozZ) {
                    strValueOf2 = String.valueOf(((C1494430ozZ) th).getStatusCode());
                } else if (th instanceof C1494690ozz) {
                    String requestLog = ((C1494690ozz) th).getRequestLog();
                    if (requestLog == null || (jSONObjectOptJSONObject = new JSONObject(requestLog).optJSONObject("base")) == null || (strValueOf2 = jSONObjectOptJSONObject.optString("net_error", String.valueOf(((C1494690ozz) th).getStatusCode()))) == null) {
                        strValueOf2 = String.valueOf(((C1494690ozz) th).getStatusCode());
                    }
                } else if (th instanceof C1494450ozb) {
                    strValueOf2 = "-106";
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getTTNetStatusCode Throwable:");
                    sbLIZ2.append(th.getMessage());
                    sbLIZ2.append(", ");
                    sbLIZ2.append(th.getCause());
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    strValueOf2 = "client_exception";
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getTTNetStatusCode Exception:");
                sbLIZ3.append(Log.getStackTraceString(th));
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                strValueOf2 = "error_parse_client_exception";
            }
            strValueOf3 = String.valueOf(th.getMessage());
        } else {
            strValueOf = "-4";
            strValueOf3 = null;
            strValueOf2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLIZ = "";
        if (host == null) {
            host = "";
        }
        linkedHashMap.put("host", host);
        if (path == null) {
            path = "";
        }
        linkedHashMap.put("path", path);
        linkedHashMap.put("uni_result_code", strValueOf);
        if (str != null) {
            linkedHashMap.put("result_code", str);
        }
        if (strValueOf2 != null) {
            linkedHashMap.put("error_code", strValueOf2);
        }
        if (strValueOf3 != null) {
            linkedHashMap.put("error_message", strValueOf3);
        }
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        if (c0x52 != null) {
            strLIZ = AnonymousClass0881.LIZ(c0x52);
        }
        linkedHashMap.put("log_id", strLIZ);
        C1494570ozn metrics = request.getMetrics();
        long jCurrentTimeMillis = 0;
        if (metrics != null) {
            long j = metrics.LJIILIIL;
            if (j > 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - j;
            }
        }
        linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis));
        C1710990ucr.LIZ(this.LIZ).LIZ("rd_pipo_network", linkedHashMap);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        Object c098200Yq;
        try {
            LIZIZ(request, c0x52, th);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }
}
