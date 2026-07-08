package com.bytedance.pumbaa.hybrid.governance.csp;

import X.C098200Yq;
import X.C0VZK;
import X.C189200o6;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C821850WLv;
import X.C828420Wee;
import X.C828620Wey;
import android.net.Uri;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityModifyResourceService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AddCspHeaderServiceImpl implements SparkSecurityModifyResourceService {
    public final PnsOfflineResComplianceModel LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityModifyResourceService
    public C821850WLv handleWillModifyNetworkResponseWithEvent(C828420Wee c828420Wee) {
        return null;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityModifyResourceService
    public C821850WLv shouldModifyResource(C828420Wee c828420Wee) {
        return null;
    }

    public AddCspHeaderServiceImpl(PnsOfflineResComplianceModel pnsOfflineResComplianceModel) {
        this.LIZ = pnsOfflineResComplianceModel;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityModifyResourceService
    public C821850WLv handleWillModifyWebOfflineResourceWithEvent(C828420Wee c828420Wee) {
        try {
            if (!this.LIZ.cspEnable) {
                return null;
            }
            String str = (String) c828420Wee.LJFF.get("URL");
            boolean zBooleanValue = ((Boolean) c828420Wee.LJFF.get("is_main_frame")).booleanValue();
            String str2 = (String) c828420Wee.LJFF.get("channel");
            String str3 = (String) c828420Wee.LJFF.get("access_key");
            if (!zBooleanValue || str.length() == 0) {
                return null;
            }
            C828620Wey.LIZ.getClass();
            Map mapLIZ = C828620Wey.LIZ(str2, str3);
            if (mapLIZ == null || mapLIZ.isEmpty()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            Uri uri = UriProtector.parse(str);
            jSONObject.put(Scene.SCENE_SERVICE, "csp_header");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getHost());
            sbLIZ.append(uri.getPath());
            jSONObject.put("url", C2188811AlT.LIZIZ(sbLIZ));
            jSONObject.put("host", uri.getHost());
            jSONObject.put("channel", str2);
            C0VZK.LIZIZ().monitorEvent("pns_hybrid_dm_shutdown", jSONObject, null, null);
            return new C821850WLv(false, C2097908Jt.LIZJ(new Pair("append_header", mapLIZ)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
