package com.ss.android.ugc.aweme.iap.component.impl;

import X.AbstractC1387200mCc;
import X.C1616810sAx;
import X.C1906580ziK;
import X.C19EG;
import X.C2097608Jq;
import X.C290690BaN;
import X.C517260KQi;
import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILivePurchasePanelBridge;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public final class LivePurchasePanelBridgeImpl implements ILivePurchasePanelBridge {
    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILivePurchasePanelBridge
    public final boolean LIZIZ() {
        return C290690BaN.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILivePurchasePanelBridge
    public final boolean isEnabled() {
        return C517260KQi.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.api.service.api.ILivePurchasePanelBridge
    public final boolean LIZ(String str, String str2, String str3, Map<String, String> map, Map<String, ? extends Object> map2) {
        Activity activityLIZIZ;
        boolean z;
        String str4;
        String str5;
        Map<String, ? extends Object> mapLJIILIIL = map2;
        String strLJI = str;
        if (!C517260KQi.LIZ()) {
            return false;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        String str6 = null;
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (!(activityLIZIZ instanceof C19EG) || activityLIZIZ == null) {
            return false;
        }
        if (strLJI.length() == 0) {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("lynx_purchase_panel_default_schema", "aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&scene=purchase_panel&skip_precheck=1");
            if (strLJI == null) {
                strLJI = "aweme://roma_redirect/?spark_page=pgc_iap_components_container&roma_group_key=spark_page_pgc_iap_components_container&roma_page_key=p&scene=purchase_panel&skip_precheck=1";
            }
        }
        if (strLJI.length() == 0) {
            return false;
        }
        String str7 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() == 0) {
            if (str2 != null) {
                str7 = str2;
            }
        } else {
            str7 = str3;
        }
        if (str7.length() == 0) {
            return false;
        }
        if (mapLJIILIIL != null) {
            Object obj = mapLJIILIIL.get("previous_page");
            if ((obj instanceof String) && (str5 = (String) obj) != null && str5.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            Object obj2 = mapLJIILIIL.get("enter_from");
            if ((obj2 instanceof String) && (str4 = (String) obj2) != null && str4.length() > 0) {
                str6 = str4;
            }
            if (!z && str6 != null) {
                mapLJIILIIL = C2097608Jq.LJIILIIL(mapLJIILIIL, new Pair("previous_page", str6));
            }
        } else {
            mapLJIILIIL = null;
        }
        C1616810sAx.LIZIZ.LJFF(strLJI, "", str7, map, mapLJIILIIL, null);
        return true;
    }
}
