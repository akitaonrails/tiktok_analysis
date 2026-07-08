package com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.router;

import X.C1227904rF;
import X.C1390920mIc;
import X.C1766680w4g;
import X.C1766690w4h;
import X.C1976907ol;
import X.C19EG;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.bean.OrderCenterGuideData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECOrderCenterRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "ec");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        if (routeIntent == null) {
            return false;
        }
        try {
            if (Intrinsics.LJFF(routeIntent.getPath(), "/order_center/close_dialog") && context != null && (context instanceof C19EG)) {
                Uri uri = routeIntent.getUri();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = null;
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "page_data")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                    return false;
                }
                C1227904rF.LIZ.getClass();
                OrderCenterGuideData orderCenterGuideData = (OrderCenterGuideData) C1227904rF.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, OrderCenterGuideData.class);
                final C1766690w4h c1766690w4h = new C1766690w4h(context);
                Uri uri2 = routeIntent.getUri();
                String str = "";
                if (uri2 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "page_name")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                Uri uri3 = routeIntent.getUri();
                if (uri3 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, "enter_from")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                Uri uri4 = routeIntent.getUri();
                if (uri4 != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, "previous_page")) != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
                String strLIZ = C1766680w4g.LIZ(orderCenterGuideData);
                Uri uri5 = routeIntent.getUri();
                if (uri5 != null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri5, "migration_dialog_frequency");
                }
                Map mapLIZIZ = C1766680w4g.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                linkedHashMap.put("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                linkedHashMap.put("previous_page", str);
                if (strLIZ != null) {
                    linkedHashMap.put("mall_extra_info", strLIZ);
                }
                linkedHashMap.putAll(mapLIZIZ);
                c1766690w4h.LIZ(orderCenterGuideData, linkedHashMap);
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIII = c1766690w4h;
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0w4f
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        String str2;
                        String strValueOf = String.valueOf((int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                        C1766690w4h c1766690w4h2 = c1766690w4h;
                        if (c1766690w4h2.LLIZ) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        String quitType = c1766690w4h2.getQuitType();
                        Map<String, Object> map = linkedHashMap;
                        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("stay_time", strValueOf), new Pair("is_load_data", str2), new Pair("quit_type", quitType), new Pair("actionsheet_name", "order_center_shoptab_diversion_guide"));
                        mapLJIIJ.putAll(map);
                        C1018703yb.LIZIZ("tiktokec_stay_actionsheet", mapLJIIJ);
                        c1766690w4h.LLILZLL = null;
                    }
                };
                c1766690w4h.setTuxSheet(tuxSheet);
                tuxSheet.show(((C19EG) context).getSupportFragmentManager(), "order_center_close_dialog");
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }
}
