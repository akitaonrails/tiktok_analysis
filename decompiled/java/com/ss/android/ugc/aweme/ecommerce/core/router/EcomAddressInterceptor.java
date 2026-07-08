package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C1741890vQh;
import X.C1976907ol;
import X.C786410Ut5;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomAddressInterceptor implements IInterceptor {
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

    /* JADX WARN: Removed duplicated region for block: B:134:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011c  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r43, com.bytedance.router.RouteIntent r44) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZ(int i, int i2, Object obj, List list) {
        Object jSONArray;
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        String str2 = "";
        if (list == null) {
            jSONArray = "";
        } else {
            jSONArray = new JSONArray(C1741890vQh.LJIIIIZZ(list));
        }
        JSONObject jSONObjectPut = jSONObject.put("districts", jSONArray).put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        if (obj != null && (string = obj.toString()) != null) {
            str2 = string;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("enter_method", str2);
        if (i2 == 2) {
            str = "ec_district_panel_changed_v2";
        } else {
            str = "ec_district_panel_changed";
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ(str, C786410Ut5.J3(jSONObjectPut2));
    }
}
