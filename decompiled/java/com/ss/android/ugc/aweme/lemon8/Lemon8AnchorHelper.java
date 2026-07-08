package com.ss.android.ugc.aweme.lemon8;

import X.AbstractC19484711Kz;
import X.AnonymousClass1440;
import X.C01GW;
import X.C051S;
import X.C08A3;
import X.C098200Yq;
import X.C0X9S;
import X.C1065200dpG;
import X.C123100dR;
import X.C1603330rpD;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.C286760BLu;
import X.C452501pT;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class Lemon8AnchorHelper {
    public static final Lemon8AnchorHelper LIZ = new Lemon8AnchorHelper();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(578));

    public interface Lemon8AnchorImpressionReportApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/lemon8_appsflyer/upload/v1")
        AbstractC19484711Kz<Unit> reportAppsflyerClick(@InterfaceC1501050pAF("event_name") int i, @InterfaceC1501050pAF("event_time") long j, @InterfaceC1501050pAF("os") int i2, @InterfaceC1501050pAF("app_id") String str, @InterfaceC1501050pAF("app_name") String str2, @InterfaceC1501050pAF("pid") String str3, @InterfaceC1501050pAF("af_ua") String str4, @InterfaceC1501050pAF("advertising_id") String str5, @InterfaceC1501050pAF("af_custom_params") String str6);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/lemon8_appsflyer/upload/v1")
        C0X9S<C08A3> reportAppsflyerShow(@InterfaceC1501050pAF("event_name") int i, @InterfaceC1501050pAF("event_time") long j, @InterfaceC1501050pAF("os") int i2, @InterfaceC1501050pAF("app_id") String str, @InterfaceC1501050pAF("app_name") String str2, @InterfaceC1501050pAF("pid") String str3, @InterfaceC1501050pAF("af_ua") String str4, @InterfaceC1501050pAF("advertising_id") String str5, @InterfaceC1501050pAF("android_id") String str6);
    }

    public static Map LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        String extra;
        boolean z;
        if (anchorCommonStruct != null && (extra = anchorCommonStruct.getExtra()) != null) {
            try {
                String string = JSONObjectProtectorUtils.getString(new JSONObject(extra), "event_map");
                if (string == null) {
                    return new LinkedHashMap();
                }
                if (string.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return new LinkedHashMap(C051S.LIZJ(new JSONObject(string)));
                }
                return new LinkedHashMap();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Object c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    c098200Yq = new LinkedHashMap();
                }
                return (Map) c098200Yq;
            }
        }
        return new LinkedHashMap();
    }

    public static void LIZLLL(String str) {
        try {
            String strLIZJ = AnonymousClass1440.LIZJ();
            if (strLIZJ.length() <= 0) {
                strLIZJ = null;
            }
            boolean zLIZ = C123100dR.LIZ(strLIZJ);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(zLIZ ? 1 : 0, "is_gaid_empty");
            C20684815ws.LJIILLIIL("impression_report_param_error", c2344009Gk.LIZ);
            C08A3 c08a3 = ((Lemon8AnchorImpressionReportApi) LIZIZ.getValue()).reportAppsflyerShow(1, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 1, C1065200dpG.LIZ().lemon8AppId, C1065200dpG.LIZ().lemon8AppName, str, C1603330rpD.LIZIZ.LJI("other"), strLIZJ, AnonymousClass1440.LIZIZ()).execute().LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str, Object obj) {
        if (obj instanceof String) {
            c2344009Gk.LJFF(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            c2344009Gk.LIZJ(((Number) obj).intValue(), str);
            return;
        }
        if (obj instanceof Long) {
            c2344009Gk.LIZLLL(((Number) obj).longValue(), str);
            return;
        }
        if (obj instanceof Double) {
            c2344009Gk.LIZ(((Number) obj).doubleValue(), str);
        } else if (obj instanceof Float) {
            c2344009Gk.LIZIZ(((Number) obj).floatValue(), str);
        } else {
            c2344009Gk.LJ(obj, str);
        }
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("result", str);
        c2344009Gk.LJFF("enter_group_id", str2);
        c2344009Gk.LJFF("anchor_type", "Lemon8");
        c2344009Gk.LJFF("anchor_name", str3);
        if (str4 != null) {
            c2344009Gk.LJFF("lemon8_pick_anchor_type", str4);
        }
        if (str5 != null) {
            c2344009Gk.LJFF("error_reason", str5);
        }
        if (str6 != null && str6.length() > 0 && 1 != 0) {
            for (Map.Entry entry : ((HashMap) C051S.LIZJ(new JSONObject(str6))).entrySet()) {
                Object key = entry.getKey();
                if ((key instanceof String) && (str7 = (String) key) != null) {
                    Lemon8AnchorHelper lemon8AnchorHelper = LIZ;
                    Object value = entry.getValue();
                    lemon8AnchorHelper.getClass();
                    LIZ(c2344009Gk, str7, value);
                }
            }
        }
        if (C286760BLu.LIZ()) {
            C20684815ws.LJIILLIIL("anchor_half_page_show_result", c2344009Gk.LIZ);
        }
        C20684815ws.LJIILLIIL("lemon8_ug_half_page_show_result", c2344009Gk.LIZ);
    }
}
