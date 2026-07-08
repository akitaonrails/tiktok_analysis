package com.ss.android.ugc.aweme.feed.spi;

import X.C098200Yq;
import X.C0X52;
import X.C0XIR;
import X.C1494850p0F;
import X.C1742580vRo;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.C592002So;
import X.C624802cA;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Set;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ApiMobNetworkPartner implements NetworkPartner.Bystander {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        int errorCode;
        C1494850p0F c1494850p0F;
        Long lValueOf;
        C592002So c592002So;
        String str;
        Long lValueOf2;
        String strOptString;
        Long lValueOf3;
        String str2;
        Long lValueOf4;
        try {
            Set set = (Set) C1742580vRo.LIZJ.getValue();
            String path = request.getPath();
            if (set.contains(path)) {
                if (c0x52 != null) {
                    Object obj = c0x52.LIZ.LJFF;
                    Long lValueOf5 = null;
                    if (obj instanceof C1494850p0F) {
                        c1494850p0F = (C1494850p0F) obj;
                    } else {
                        c1494850p0F = null;
                    }
                    if (c0x52.LIZJ()) {
                        T t = c0x52.LIZIZ;
                        if (t instanceof BaseResponse) {
                            String host = request.getHost();
                            BaseResponse.ServerTimeExtra serverTimeExtra = ((BaseResponse) t).extra;
                            if (serverTimeExtra != null) {
                                str2 = serverTimeExtra.logid;
                            } else {
                                str2 = null;
                            }
                            Integer numValueOf = Integer.valueOf(((BaseResponse) t).status_code);
                            String str3 = ((BaseResponse) t).status_msg;
                            if (c1494850p0F != null) {
                                lValueOf5 = Long.valueOf(c1494850p0F.LJIILLIIL);
                                lValueOf4 = Long.valueOf(c1494850p0F.LJIJJ);
                            } else {
                                lValueOf4 = null;
                            }
                            LIZIZ(path, host, str2, str3, numValueOf, lValueOf5, lValueOf4);
                        } else if (t instanceof String) {
                            JSONObject jSONObject = new JSONObject((String) t);
                            int iOptInt = jSONObject.optInt("status_code");
                            String strOptString2 = jSONObject.optString("status_msg");
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
                            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("logid")) == null) {
                                strOptString = "";
                            }
                            String host2 = request.getHost();
                            Integer numValueOf2 = Integer.valueOf(iOptInt);
                            if (c1494850p0F != null) {
                                lValueOf5 = Long.valueOf(c1494850p0F.LJIILLIIL);
                                lValueOf3 = Long.valueOf(c1494850p0F.LJIJJ);
                            } else {
                                lValueOf3 = null;
                            }
                            LIZIZ(path, host2, strOptString, strOptString2, numValueOf2, lValueOf5, lValueOf3);
                        } else if (t instanceof ComposePbAndJson) {
                            P p = ((ComposePbAndJson) t).LLILLJJLI;
                            if ((p instanceof C592002So) && (c592002So = (C592002So) p) != null) {
                                String host3 = request.getHost();
                                C624802cA c624802cA = c592002So.extra;
                                if (c624802cA != null) {
                                    str = c624802cA.logid;
                                } else {
                                    str = null;
                                }
                                Integer num = c592002So.status_code;
                                String str4 = c592002So.status_msg;
                                if (c1494850p0F != null) {
                                    lValueOf5 = Long.valueOf(c1494850p0F.LJIILLIIL);
                                    lValueOf2 = Long.valueOf(c1494850p0F.LJIJJ);
                                } else {
                                    lValueOf2 = null;
                                }
                                LIZIZ(path, host3, str, str4, num, lValueOf5, lValueOf2);
                            } else {
                                return;
                            }
                        }
                    } else {
                        int i = c0x52.LIZ.LIZIZ;
                        String host4 = request.getHost();
                        Integer numValueOf3 = Integer.valueOf(i);
                        if (c1494850p0F != null) {
                            lValueOf5 = Long.valueOf(c1494850p0F.LJIILLIIL);
                            lValueOf = Long.valueOf(c1494850p0F.LJIJJ);
                        } else {
                            lValueOf = null;
                        }
                        LIZIZ(path, host4, null, "unknown", numValueOf3, lValueOf5, lValueOf);
                    }
                } else if (th == null) {
                    LIZIZ(path, request.getHost(), null, "unknown", -1001, null, null);
                } else {
                    if (th instanceof C0XIR) {
                        errorCode = ((C0XIR) th).getErrorCode();
                    } else {
                        errorCode = -1002;
                    }
                    LIZIZ(path, request.getHost(), null, String.valueOf(th.getCause()), Integer.valueOf(errorCode), null, null);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, Integer num, Long l, Long l2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("path", str);
        if (str2 != null) {
            c2344009Gk.LJFF("host", str2);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "statusCode");
        }
        if (str4 != null) {
            c2344009Gk.LJFF("statusMsg", str4);
        }
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue(), "totalTime");
        }
        if (l2 != null) {
            c2344009Gk.LIZLLL(l2.longValue(), "receivedByteCount");
        }
        if (str3 != null) {
            c2344009Gk.LJFF("logId", str3);
        }
        C20684815ws.LJIILLIIL("rd_feed_network_monitor_event", c2344009Gk.LIZ);
    }
}
