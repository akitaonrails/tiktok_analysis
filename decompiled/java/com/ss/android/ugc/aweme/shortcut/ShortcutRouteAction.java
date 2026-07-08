package com.ss.android.ugc.aweme.shortcut;

import X.C098200Yq;
import X.C0W8Y;
import X.C1584320rKY;
import X.C1733740vDY;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.C815890VzX;
import X.EnumC1589910rTZ;
import X.InterfaceC816000Vzi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes14.dex */
public final class ShortcutRouteAction implements InterfaceC816000Vzi {
    public static final int $stable = 0;
    public static final C815890VzX Companion = new Object() { // from class: X.0VzX
    };

    private final void mobLauncherShortcutRoute(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shortcut_id", str);
        c2344009Gk.LJIIIIZZ("routes", str2);
        c2344009Gk.LJIIIIZZ("needLogin", str3);
        C20684815ws.LJIILLIIL("rd_feed_launcher_shortcut_route", c2344009Gk.LIZ);
    }

    private final SmartRoute routeH5(Context context, String str, String str2) {
        String str3;
        String path = UriProtector.parse(str).getPath();
        if (path != null && u.LJIIZILJ(path, "template.js", false)) {
            str3 = "aweme://lynxview/";
        } else {
            str3 = "aweme://webview/";
        }
        String string = UriProtector.parse(str3).buildUpon().appendQueryParameter("url", str).appendQueryParameter("SHORTCUT_ID", str2).appendQueryParameter("use_spark", "1").build().toString();
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(string);
        return smartRoute;
    }

    private final SmartRoute routeUrlOrAction(Context context, String str, String str2) {
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(str);
        smartRoute.withParam("SHORTCUT_ID", str2);
        return smartRoute;
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        if (context != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            String string = bundle.getString("SHORTCUT_ID");
            if (string == null) {
                string = "";
            }
            return onShortcutAction(context, string, str, bundle);
        }
        return null;
    }

    @Override // X.InterfaceC816000Vzi
    public Object onShortcutAction(Context context, String str, String str2, Bundle bundle) {
        Object c098200Yq;
        Object obj;
        Object c098200Yq2;
        SmartRoute smartRouteRouteUrlOrAction;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        try {
            String string = bundle.getString("SHORTCUT_ID");
            String str3 = "";
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("shortcut_type");
            if (string2 == null) {
                string2 = CardStruct.IStatusCode.DEFAULT;
            }
            if (!Intrinsics.LJFF(string2, "2")) {
                C0W8Y.LIZ(string);
            }
            if (Intrinsics.LJFF(string2, "2")) {
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                String value = EnumC1589910rTZ.HOME_SCREEN_ICON.getValue();
                c1584320rKY.getClass();
                C1584320rKY.LJ = value;
            }
            String strDecode = Uri.decode(bundle.getString("shortcutRouteUrl"));
            String string3 = bundle.getString("SHORTCUT_NEED_LOGIN");
            String string4 = bundle.getString("source_btm_token");
            try {
                JSONArray jSONArray = new JSONArray(strDecode);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(C1733740vDY.LIZ(JSONArrayProtectorUtils.getString(jSONArray, i), string4));
                }
                C189200o6.m2constructorimpl(arrayList);
                obj = arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq3 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq3);
                obj = c098200Yq3;
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
            Object arrayList2 = obj;
            if (thM5exceptionOrNullimpl != null) {
                arrayList2 = new ArrayList();
            }
            List list = (List) arrayList2;
            String string5 = bundle.getString("SHORTCUT_ROUTE_ACTION");
            if (string5 != null) {
                str3 = string5;
            }
            list.add(str3);
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((String) obj2).length() != 0) {
                    arrayList3.add(obj2);
                }
            }
            for (String str4 : arrayList3) {
                try {
                    String scheme = UriProtector.parse(str4).getScheme();
                    if (scheme != null && (scheme.equals("https") || scheme.equals("http"))) {
                        smartRouteRouteUrlOrAction = routeH5(context, str4, string);
                    } else if (a0.LJJIIZI(str4, "//webview", false) && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str4), "url")) != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        smartRouteRouteUrlOrAction = routeH5(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, string);
                    } else {
                        smartRouteRouteUrlOrAction = routeUrlOrAction(context, str4, string);
                    }
                    smartRouteRouteUrlOrAction.open();
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            }
            if (Intrinsics.LJFF(string2, "2")) {
                mobLauncherShortcutRoute(string, strDecode, string3);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return null;
    }
}
