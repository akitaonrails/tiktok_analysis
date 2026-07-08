package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1027660cqi;
import X.C1027880cr4;
import X.C1027990crF;
import X.C1051660dTQ;
import X.C1AF0;
import X.C2344809Gs;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdInfoMethod extends BaseBridgeMethod {
    public static final C1027880cr4 Companion = new Object() { // from class: X.0cr4
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return "adInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AdInfoMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        C1027660cqi c1027660cqi;
        int i;
        int i2;
        JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        if (kitContainerApi != null) {
            kitContainerApi.LIZLLL();
        }
        InterfaceC1028200cra kitContainerApi2 = getKitContainerApi();
        if (kitContainerApi2 != null) {
            c1027660cqi = (C1027660cqi) kitContainerApi2.LIZIZ(C1027660cqi.class);
        } else {
            c1027660cqi = null;
        }
        if (c1027660cqi != null) {
            jSONObject2.put("cid", c1027660cqi.LIZJ());
            jSONObject2.put("group_id", c1027660cqi.LIZLLL());
            jSONObject2.put("ad_type", c1027660cqi.LJJJJJ.LIZJ());
            jSONObject2.put("log_extra", c1027660cqi.LJ());
            Object objLIZJ = c1027660cqi.LJJJJLI.LIZJ();
            String str = "";
            if (objLIZJ == null) {
                objLIZJ = "";
            }
            jSONObject2.put("download_url", objLIZJ);
            Object objLIZJ2 = c1027660cqi.LJJJJLL.LIZJ();
            if (objLIZJ2 == null) {
                objLIZJ2 = "";
            }
            jSONObject2.put("package_name", objLIZJ2);
            Object objLIZJ3 = c1027660cqi.LJJJJZ.LIZJ();
            if (objLIZJ3 == null) {
                objLIZJ3 = "";
            }
            jSONObject2.put("app_name", objLIZJ3);
            if (c1027660cqi.LIZJ() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject2.put("code", i2);
            jSONObject2.put("land_page_data", c1027660cqi.LJJZZIII);
            jSONObject2.put("extra_param", c1027660cqi.LJLIL);
            try {
                String str2 = (String) c1027660cqi.LJJLIIIJLJLI.LIZJ();
                if (str2 != null) {
                    str = str2;
                }
                jSONObject2.put("track_url_list", new JSONArray(str));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            C1027990crF c1027990crF = C1027990crF.LIZ;
            c1027660cqi.LIZJ();
            c1027660cqi.LJ();
            c1027990crF.getClass();
        } else if (this.contextProviderFactory.LIZIZ(Bundle.class) != null) {
            BaseBundle baseBundle = (BaseBundle) this.contextProviderFactory.LIZIZ(Bundle.class);
            if (baseBundle == null) {
                return;
            }
            jSONObject2.put("cid", baseBundle.getLong("ad_id"));
            jSONObject2.put("group_id", baseBundle.getString("aweme_group_id"));
            jSONObject2.put("ad_type", baseBundle.getInt("ad_system_origin"));
            jSONObject2.put("log_extra", baseBundle.getString("bundle_download_app_log_extra"));
            jSONObject2.put("download_url", baseBundle.getString("bundle_download_url"));
            jSONObject2.put("package_name", baseBundle.getString("aweme_package_name"));
            jSONObject2.put("app_name", baseBundle.getString("bundle_download_app_name"));
            if (baseBundle.getLong("ad_id") == 0) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject2.put("code", i);
            jSONObject2.put("land_page_data", baseBundle.getString("landing_page_info"));
            jSONObject2.put("extra_param", baseBundle.getString("bundle_extra_param"));
            try {
                jSONObject2.put("track_url_list", new JSONArray(baseBundle.getString("track_url_list")));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
        } else {
            C2344809Gs.LJ("It is illegal to call adInfo in non-commercialized scenarios, please chat with zhangxiang.aaron privately");
        }
        interfaceC1019840ce6.LIZIZ(jSONObject2);
    }
}
