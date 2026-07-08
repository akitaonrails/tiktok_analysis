package com.ss.android.ugc.aweme.aigc;

import X.AbstractC1387200mCc;
import X.C098200Yq;
import X.C0AGD;
import X.C0LAB;
import X.C0LOP;
import X.C10ZH;
import X.C13LQ;
import X.C189200o6;
import X.C1906580ziK;
import X.C2188811AlT;
import X.C542230LOj;
import X.C542370LOx;
import X.C542380LOy;
import X.C546820LcW;
import X.C547140Ld2;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1603190roz;
import X.InterfaceC542330LOt;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCNotifyRouteAction implements IRouteAction {
    public static void LIZ(String str, String str2, String str3) {
        C542370LOx.LIZ.getClass();
        NoticeService noticeServiceLIZ = C542370LOx.LIZ();
        C0LAB c0lab = new C0LAB();
        if (str == null) {
            str = "";
        }
        c0lab.LJ("business_type", str);
        if (str2 == null) {
            str2 = "";
        }
        c0lab.LJ("task_type", str2);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
        c0lab.LJ("msg", str3);
        noticeServiceLIZ.onEventV3("aikit_notice_route_dispatch", c0lab.LIZ);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) throws JSONException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object c098200Yq;
        Object obj;
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "business_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = bundle.getString("business_type");
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "task_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = bundle.getString("task_type");
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "payload");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = bundle.getString("payload")) == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = C542380LOy.LIZ(uri)) == null) {
            Set setLJLIIL = C13LQ.LJLIIL(new String[]{"business_type", "task_type", "payload", "redirect_url"});
            JSONObject jSONObject = new JSONObject();
            for (String str2 : bundle.keySet()) {
                if (!setLJLIIL.contains(str2)) {
                    try {
                        obj = bundle.get(str2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    }
                    if (obj instanceof String) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
            if (jSONObject.length() > 0) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = C786410Ut5.J3(jSONObject);
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = null;
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "redirect_url");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = bundle.getString("redirect_url");
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "min_version");
        boolean z6 = true;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && C10ZH.LIZIZ.LJJLIIIJ(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, str)) {
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("below minVersion, url: ");
            sbLIZ.append(str);
            c547140Ld2.LIZJ("AIGCNotifyRouteAction", C2188811AlT.LIZIZ(sbLIZ));
            LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "intercept_by_min_version");
            return Boolean.FALSE;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            C547140Ld2 c547140Ld22 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("use redirectUrl, redirectUrl=");
            sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
            c547140Ld22.LIZJ("AIGCNotifyRouteAction", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("redirect:");
            sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
            LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, C2188811AlT.LIZIZ(sbLIZ3));
            SmartRouter.buildRoute(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4).open();
            return Boolean.TRUE;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() != 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    C547140Ld2 c547140Ld23 = C546820LcW.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("missing payload param: url=");
                    sbLIZ4.append(str);
                    c547140Ld23.LIZIZ("AIGCNotifyRouteAction", C2188811AlT.LIZIZ(sbLIZ4), null);
                    LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "missing_payload");
                    return Boolean.FALSE;
                }
                C542370LOx.LIZ.getClass();
                NoticeService noticeServiceLIZ = C542370LOx.LIZ();
                Activity activityLIZIZ = C737910Sx3.LIZIZ(context);
                if (activityLIZIZ == null) {
                    AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                    if (abstractC1387200mCcLJFF != null) {
                        activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ();
                    } else {
                        activityLIZIZ = null;
                    }
                    if (activityLIZIZ == null) {
                        C547140Ld2 c547140Ld24 = C546820LcW.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("context is not Activity and no valid top Activity available, context=");
                        sbLIZ5.append(context.getClass().getSimpleName());
                        c547140Ld24.LIZIZ("AIGCNotifyRouteAction", C2188811AlT.LIZIZ(sbLIZ5), null);
                        LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "no_activity_context");
                        return Boolean.FALSE;
                    }
                }
                long jNanoTime = System.nanoTime() & 65535;
                CharsKt__CharJVMKt.checkRadix(16);
                String strLJJJJJL = a0.LJJJJJL('0', 4, Long.toString(jNanoTime, 16));
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("aiNotify#");
                sbLIZ6.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                sbLIZ6.append('/');
                sbLIZ6.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                sbLIZ6.append('#');
                sbLIZ6.append(strLJJJJJL);
                C542230LOj c542230LOj = new C542230LOj(activityLIZIZ, C2188811AlT.LIZIZ(sbLIZ6), new C0LOP(this));
                InterfaceC542330LOt interfaceC542330LOtLIZIZ = c542230LOj.LIZIZ("AIGCNotifyRouteAction");
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("open: context=");
                sbLIZ7.append(activityLIZIZ.getClass().getSimpleName());
                sbLIZ7.append(", payload=");
                sbLIZ7.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                sbLIZ7.append("\n url: ");
                sbLIZ7.append(str);
                interfaceC542330LOtLIZIZ.i(C2188811AlT.LIZIZ(sbLIZ7));
                if (((Boolean) C0AGD.LIZ.getValue()).booleanValue()) {
                    AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                    int length = abstractC1387200mCcArrLJII.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (abstractC1387200mCcArrLJII[i].LIZ instanceof InterfaceC1603190roz) {
                                break;
                            }
                            i++;
                        } else {
                            z6 = false;
                            break;
                        }
                    }
                    if (!z6) {
                        interfaceC542330LOtLIZIZ.i("cold start: launch MainActivity to keep back stack non-empty before dispatch");
                        try {
                            SmartRouter.buildRoute(activityLIZIZ, "//main").open();
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            interfaceC542330LOtLIZIZ.e("launch MainActivity for cold start back stack failed", thM5exceptionOrNullimpl);
                        }
                    }
                }
                noticeServiceLIZ.LIZ(c542230LOj, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                return Boolean.TRUE;
            }
        }
        C547140Ld2 c547140Ld25 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("missing required params: business_type='");
        sbLIZ8.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        sbLIZ8.append("', task_type='");
        sbLIZ8.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
        sbLIZ8.append("', url=");
        sbLIZ8.append(str);
        c547140Ld25.LIZIZ("AIGCNotifyRouteAction", C2188811AlT.LIZIZ(sbLIZ8), null);
        LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "missing_params");
        return Boolean.FALSE;
    }
}
