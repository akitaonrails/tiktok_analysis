package com.ss.android.ugc.aweme.geoblocking.common;

import X.C100C;
import X.C1494600ozq;
import X.C1494690ozz;
import X.C1518810pct;
import X.C1518990pdB;
import X.C1519020pdE;
import X.C1697810uHb;
import X.C2097608Jq;
import X.C2097908Jt;
import X.InterfaceC1519030pdF;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.geoblocking.interceptor.GeoBlockInterceptor;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class GeoBlockingServiceImpl implements IGeoBlockingService {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("passport/email/oauth_bind_register_or_login", "passport/mobile/sms_login", "passport/employee/account/create", "passport/carrier_auth/login_continue", "passport/mobile/oauth_bind_register_or_login", "passport/email/register/v2", "passport/auth/login", "passport/email/register_verify_login", "passport/mobile/sms_login_continue", "passport/app/email/register/ticket_register", "passport/mobile/register", "passport/auth/login_only", "passport/auth/only_login", "passport/username/register", "tiktok/user/profile/self/v1", "tiktok/v1/calculate/age", "aweme/v1/user/profile/self", "aweme/v3/verification/age");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("geoblocking_non_op_wo_uid", "geoblocking_lb_wo_uid", "geoblocking_non_op_reg", "geoblocking_non_op", "geoblocking_lb_uid", "settings_reset_ut_err_code");
    public static final List<String> LIZJ = Collections.synchronizedList(new ArrayList());
    public static boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJ() {
        LIZLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final boolean LIZIZ() {
        C1518990pdB.LIZ.getClass();
        return C1518990pdB.LIZLLL.get();
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJIIJJI() {
        C1518990pdB.LIZ.getClass();
        C1518990pdB.LJ.set(true);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void reset() {
        LIZJ.clear();
        C1518990pdB.LIZ.getClass();
        C1518990pdB.LIZIZ = "user_update";
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final GeoBlockInterceptor LIZ() {
        return GeoBlockInterceptor.LL;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LIZJ(String str) {
        C1518990pdB.LIZ.getClass();
        if (C1518990pdB.LIZJ.get() && C1518990pdB.LIZLLL.compareAndSet(false, true)) {
            C100C.LIZ.LIZJ().LIZ("hit_geoblocking", C2097908Jt.LIZJ(new Pair("config_id", str)));
            C1519020pdE.LIZ.LIZIZ(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final Integer LIZLLL(Exception exc) {
        Integer num;
        String string;
        JSONObject jSONObject;
        String string2;
        C1494690ozz c1494690ozz = null;
        IGeoBlockingDepService iGeoBlockingDepService = (IGeoBlockingDepService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingDepService.class, false, false, false, 14, null);
        Integer num2 = null;
        if (iGeoBlockingDepService == null) {
            return null;
        }
        int iLIZIZ = iGeoBlockingDepService.LIZIZ(exc);
        int iLJI = iGeoBlockingDepService.LJI(exc);
        if ((iLIZIZ == -555 || u.LJIJI(exc.getMessage(), "ERR_TTNET_TRAFFIC_CONTROL_DROP, -555", false)) && iLJI == 2) {
            num = 555;
        } else {
            num = null;
        }
        if (num == null) {
            if (exc instanceof C1494690ozz) {
                c1494690ozz = (C1494690ozz) exc;
            }
            if (c1494690ozz != null) {
                try {
                    C1494600ozq requestInfo = c1494690ozz.getRequestInfo();
                    if (requestInfo == null || (jSONObject = requestInfo.LJJIIJZLJL) == null || (string2 = JSONObjectProtectorUtils.getString(jSONObject, "response-headers")) == null || (string = JSONObjectProtectorUtils.getString(new JSONObject(string2), "x-tt-system-error")) == null) {
                        string = "";
                    }
                    if (((C1494690ozz) exc).getStatusCode() == 503 && Intrinsics.LJFF(string, "23")) {
                        num2 = 503;
                        return num2;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return num2;
        }
        return num;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final boolean LJII(Bundle bundle) {
        if (!LIZLLL) {
            return false;
        }
        String string = bundle.getString("path");
        if (string != null && LIZ.contains(a0.LJLIL(string, '/'))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final boolean LJIIIZ(String str) {
        if (a0.LJJIIZI(str, "settings_reset_ut_err_code", false) || LJIILIIL(str) == null) {
            return false;
        }
        return LIZJ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJIIJ(String str) {
        String str2;
        if (Intrinsics.LJFF("empty", "empty")) {
            C1518810pct.LIZ.getClass();
            C1518810pct.LIZJ.set(true);
        }
        C1518990pdB.LIZ.getClass();
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("business", "geoblock_popup");
        if (((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).isLogin()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("login_type", str2);
        str.toString();
        pairArr[2] = new Pair(Scene.SCENE_SERVICE, str);
        pairArr[3] = new Pair("fail_reason", "empty");
        interfaceC1519030pdFLIZJ.LIZ("geoblock_load_fail", C2097608Jq.LJIIIIZZ(pairArr));
        C1519020pdE.LIZ.LIZIZ(500);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final String LJIILIIL(String str) {
        for (String str2 : LIZIZ) {
            if (a0.LJJIIZI(str, str2, false)) {
                return str2;
            }
        }
        if (a0.LJJIIZI(str, "geoblocking", false)) {
            return str;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJFF(int i, String str) {
        C1518990pdB.LIZ.getClass();
        C1518990pdB.LIZ(i, str);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJIIIIZZ(String str, String str2) {
        String str3;
        String str4;
        C1518990pdB.LIZ.getClass();
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("business", "geoblock_popup");
        if (((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).isLogin()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("login_type", str3);
        pairArr[2] = new Pair("geoblock_type", str);
        pairArr[3] = new Pair("enter_from", C1518990pdB.LIZIZ);
        if (u.LJIIZILJ(str2, "//pns/logout", false)) {
            str4 = "logout";
        } else if (u.LJIIZILJ(str2, "//setting", false)) {
            str4 = "go_to_settings";
        } else if (u.LJIIZILJ(str2, "//pns/close", false)) {
            str4 = "close_app";
        } else if (!a0.LJJIIZI(str2, "//webview", false) && !a0.LJJIIZI(str2, "http://", false) && !a0.LJJIIZI(str2, "https://", false)) {
            str4 = "ok";
        } else if (a0.LJJIIZI(str2, "dyd.html", false)) {
            str4 = "download_your_data";
        } else if (a0.LJJIIZI(str2, "/store/apps", false)) {
            str4 = "download";
        } else {
            str4 = "webform";
        }
        pairArr[4] = new Pair("action", str4);
        interfaceC1519030pdFLIZJ.LIZ("click_geoblock_popup", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJIIL(String str, String str2) {
        String str3;
        String str4;
        if (LJIILIIL(str2) != null && !a0.LJJIIZI(str2, "geoblocking_non_op_reg", false) && !a0.LJJIIZI(str2, "settings_reset_ut_err_code", false)) {
            LIZJ.add(str2);
            C1518810pct.LIZ.getClass();
            C1518810pct.LIZJ.set(true);
        }
        C1518990pdB.LIZ.getClass();
        if (Intrinsics.LJFF(C1518990pdB.LIZIZ, "user_update") && Intrinsics.LJFF(str2, "geoblocking_non_op")) {
            str3 = "login";
        } else if (Intrinsics.LJFF(str2, "geoblocking_non_op_reg")) {
            str3 = "signup";
        } else {
            str3 = "other";
        }
        C1518990pdB.LIZIZ = str3;
        boolean zIsLogin = ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).isLogin();
        LinkedHashMap linkedHashMap = new LinkedHashMap(((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LJIIJ());
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        linkedHashMap.put("business", "geoblock_popup");
        if (zIsLogin) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("login_type", str4);
        linkedHashMap.put("geoblock_type", str2);
        linkedHashMap.put("enter_from", C1518990pdB.LIZIZ);
        C100C.LIZ.LIZJ().LIZ("pns_popup_shown", linkedHashMap);
        C1519020pdE.LIZ.LIZIZ(900);
    }

    @Override // com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService
    public final void LJI(int i, String str, String str2, String str3) {
        int i2;
        C1518990pdB.LIZ.getClass();
        C100C.LIZ.LIZJ().LIZ("geoblock_popup_ready_display", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, str), new Pair("business", str2), new Pair("drop", String.valueOf(i)), new Pair("reason", str3)));
        C1519020pdE c1519020pdE = C1519020pdE.LIZ;
        if (i == 1) {
            i2 = OppoPermissionPopupMaskDelayExp.DEFAULT;
        } else {
            i2 = 800;
        }
        c1519020pdE.LIZIZ(i2);
    }
}
