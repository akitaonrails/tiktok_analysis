package com.ss.android.ugc.aweme.traffic;

import X.C04TD;
import X.C0X4T;
import X.C2188811AlT;
import X.C793770VBv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TrafficMonitorService implements ITrafficMonitorApi {
    public static ITrafficMonitorApi LIZJ() {
        Object objLIZ = C04TD.LIZ(ITrafficMonitorApi.class, false);
        if (objLIZ != null) {
            return (ITrafficMonitorApi) objLIZ;
        }
        if (C04TD.R5 == null) {
            synchronized (ITrafficMonitorApi.class) {
                if (C04TD.R5 == null) {
                    C04TD.R5 = new TrafficMonitorService();
                }
            }
        }
        return C04TD.R5;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi
    public final void LIZ(long j, String str) {
        C0X4T.LIZLLL(j, "ttnet", str, true);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ITrafficMonitorApi
    public final void LIZIZ(String str, JSONObject jSONObject) {
        if (Intrinsics.LJFF(str, "download_common")) {
            try {
                if (Intrinsics.LJFF(jSONObject.optString(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, ""), "download_success")) {
                    long jOptLong = jSONObject.optLong("total_bytes", 0L);
                    String strOptString = jSONObject.optString("url", "");
                    String strOptString2 = jSONObject.optString("url_path", "");
                    String strOptString3 = jSONObject.optString("event_page", "");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strOptString3);
                    sbLIZ.append(':');
                    sbLIZ.append(strOptString2);
                    C793770VBv.LJIJ(jOptLong, C2188811AlT.LIZIZ(sbLIZ), "downloader", "");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("url: ");
                    sbLIZ2.append(strOptString);
                    sbLIZ2.append(", size: ");
                    sbLIZ2.append(jOptLong);
                    sbLIZ2.append(", biz: ");
                    sbLIZ2.append(strOptString3);
                    sbLIZ2.append(", category: ");
                    sbLIZ2.append(jSONObject);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
