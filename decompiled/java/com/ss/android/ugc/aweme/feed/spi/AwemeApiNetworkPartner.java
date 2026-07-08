package com.ss.android.ugc.aweme.feed.spi;

import X.AbstractC1604130rqV;
import X.C01GW;
import X.C098200Yq;
import X.C0O5B;
import X.C0X52;
import X.C0XIR;
import X.C15438062q;
import X.C189200o6;
import X.C2188811AlT;
import X.C23112093u;
import X.C452501pT;
import X.C5186020i;
import X.C592002So;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeApiNetworkPartner implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0O5B());

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

    public final void LJIIL(String str, ComposePbAndJson<?, ?> composePbAndJson) {
        C592002So c592002So;
        P p = composePbAndJson.LLILLJJLI;
        if ((p instanceof C592002So) && (c592002So = (C592002So) p) != null) {
            List<C5186020i> list = c592002So.aweme_list;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C5186020i> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().aweme_id);
            }
            AbstractC1604130rqV abstractC1604130rqVLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AwemeApiNetworkPartner path: ");
            sbLIZ.append(str);
            sbLIZ.append(", statusCode: ");
            sbLIZ.append(c592002So.status_code);
            sbLIZ.append(", statusMsg: ");
            sbLIZ.append(c592002So.status_msg);
            sbLIZ.append(", logId: ");
            sbLIZ.append(c592002So.extra.logid);
            sbLIZ.append(", req {}, res {awemeIds: ");
            sbLIZ.append(arrayList);
            sbLIZ.append('}');
            abstractC1604130rqVLIZIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
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
                sbLIZ.append("AwemeApiNetworkPartner path: ");
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
        sbLIZ2.append("AwemeApiNetworkPartner path: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", statusCode: ");
        sbLIZ2.append(errorCode);
        sbLIZ2.append(", statusMsg: ");
        sbLIZ2.append(strValueOf);
        abstractC1604130rqVLIZIZ2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        Object obj;
        String strOptString;
        ArrayList arrayList = null;
        if (c0x52 == null) {
            obj = null;
        } else {
            try {
                obj = c0x52.LIZIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return;
            }
        }
        String path = request.getPath();
        if (path != null) {
            switch (path.hashCode()) {
                case -2013454539:
                    if (path.equals("/aweme/v2/feed/")) {
                        if (obj instanceof ComposePbAndJson) {
                            LJIIL(path, (ComposePbAndJson) obj);
                        } else {
                            LJ(path, c0x52, th);
                        }
                    }
                    break;
                case -936843595:
                    if (path.equals("/aweme/v1/aweme/stats/")) {
                        if (obj instanceof BaseResponse) {
                            AbstractC1604130rqV abstractC1604130rqVLIZIZ = LIZIZ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("AwemeApiNetworkPartner path: ");
                            sbLIZ.append(path);
                            sbLIZ.append(", statusCode: ");
                            sbLIZ.append(((BaseResponse) obj).status_code);
                            sbLIZ.append(", statusMsg: ");
                            sbLIZ.append(((BaseResponse) obj).status_msg);
                            sbLIZ.append(", logId: ");
                            sbLIZ.append(((BaseResponse) obj).extra.logid);
                            sbLIZ.append(", req {}, res {}");
                            abstractC1604130rqVLIZIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            LJ(path, c0x52, th);
                        }
                    }
                    break;
                case 175243583:
                    if (path.equals("/aweme/v1/aweme/delete/")) {
                        if (obj instanceof BaseResponse) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(request.getUrl()), "aweme_id");
                            AbstractC1604130rqV abstractC1604130rqVLIZIZ2 = LIZIZ();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("AwemeApiNetworkPartner path: ");
                            sbLIZ2.append(path);
                            sbLIZ2.append(", statusCode: ");
                            sbLIZ2.append(((BaseResponse) obj).status_code);
                            sbLIZ2.append(", statusMsg: ");
                            sbLIZ2.append(((BaseResponse) obj).status_msg);
                            sbLIZ2.append(", logId: ");
                            sbLIZ2.append(((BaseResponse) obj).extra.logid);
                            sbLIZ2.append(", req {awemeId: ");
                            sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            sbLIZ2.append("}, res {}");
                            abstractC1604130rqVLIZIZ2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            LJ(path, c0x52, th);
                        }
                    }
                    break;
                case 182502233:
                    if (path.equals("/aweme/v1/aweme/detail/")) {
                        if (obj instanceof String) {
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(request.getUrl()), "aweme_id");
                            JSONObject jSONObject = new JSONObject((String) obj);
                            int iOptInt = jSONObject.optInt("status_code");
                            String strOptString2 = jSONObject.optString("status_msg");
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
                            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("logid")) == null) {
                                strOptString = "";
                            }
                            AbstractC1604130rqV abstractC1604130rqVLIZIZ3 = LIZIZ();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("AwemeApiNetworkPartner path: ");
                            sbLIZ3.append(path);
                            sbLIZ3.append(", statusCode: ");
                            sbLIZ3.append(iOptInt);
                            sbLIZ3.append(", statusMsg: ");
                            sbLIZ3.append(strOptString2);
                            sbLIZ3.append(", logId: ");
                            sbLIZ3.append(strOptString);
                            sbLIZ3.append(", req {awemeId: ");
                            sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            sbLIZ3.append("}, res {}");
                            abstractC1604130rqVLIZIZ3.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                        } else {
                            LJ(path, c0x52, th);
                        }
                    }
                    break;
                case 365936323:
                    if (path.equals("/aweme/v1/multi/aweme/detail/")) {
                        if (obj instanceof BatchDetailList) {
                            List<Aweme> list = ((BatchDetailList) obj).items;
                            if (list != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator<Aweme> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(it2.next().getAid());
                                }
                            }
                            AbstractC1604130rqV abstractC1604130rqVLIZIZ4 = LIZIZ();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("AwemeApiNetworkPartner path: ");
                            sbLIZ4.append(path);
                            sbLIZ4.append(", statusCode: ");
                            sbLIZ4.append(((BatchDetailList) obj).status_code);
                            sbLIZ4.append(", statusMsg: ");
                            sbLIZ4.append(((BatchDetailList) obj).status_msg);
                            sbLIZ4.append(", logId: ");
                            sbLIZ4.append(((BatchDetailList) obj).extra.logid);
                            sbLIZ4.append(", req {}, res {awemeIds: ");
                            sbLIZ4.append(arrayList);
                            sbLIZ4.append('}');
                            abstractC1604130rqVLIZIZ4.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                        } else {
                            LJ(path, c0x52, th);
                        }
                    }
                    break;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }
}
