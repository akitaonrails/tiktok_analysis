package com.ss.android.ugc.aweme.legoImp.task.dm.ai;

import X.C2188811AlT;
import X.C793770VBv;
import X.C800820VbE;
import X.C805130ViB;
import X.C805140ViC;
import X.C805150ViD;
import com.ss.android.ugc.tiktok.security.ai.KVAiInterface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS129S1200000_13;
import kotlin.jvm.internal.AwS98S1000000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class KVAiManagerService implements KVAiInterface {
    @Override // com.ss.android.ugc.tiktok.security.ai.KVAiInterface
    public final void LIZ(C800820VbE c800820VbE, Map map) throws JSONException {
        C805150ViD c805150ViDPoll;
        Function0<Unit> function0;
        if (C805130ViB.LJFF) {
            if (map.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", "js_injection");
                jSONObject.put("error_info", "map is empty");
                C793770VBv.LJII("pns_kv_model_metric", jSONObject, null, null);
            }
            boolean z = false;
            if (C805130ViB.LIZJ != null && (C805130ViB.LIZ.size() > 0 || System.currentTimeMillis() % ((long) C805130ViB.LIZIZ) == 0)) {
                C805140ViC c805140ViC = C805130ViB.LJ;
                if (c805140ViC != null) {
                    AwS129S1200000_13 awS129S1200000_13 = new AwS129S1200000_13(c800820VbE, map, 5);
                    AwS98S1000000_13 awS98S1000000_13 = new AwS98S1000000_13(16);
                    if (c805140ViC.LIZIZ.size() >= c805140ViC.LIZ && (c805150ViDPoll = c805140ViC.LIZIZ.poll()) != null && (function0 = c805150ViDPoll.LIZIZ) != null) {
                        function0.invoke();
                    }
                    c805140ViC.LIZIZ.offer(new C805150ViD(awS129S1200000_13, awS98S1000000_13));
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resources didnt ready. cache file status: ");
            sbLIZ.append(!C805130ViB.LIZ.isEmpty());
            sbLIZ.append(" psp scene status: ");
            if (C805130ViB.LIZJ != null) {
                z = true;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("source", "js_injection");
            jSONObject2.put("error_info", "resource was not ready");
            C793770VBv.LJII("pns_kv_model_metric", jSONObject2, null, null);
        }
    }
}
