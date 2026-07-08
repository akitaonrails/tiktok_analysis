package com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.mob;

import X.C0LSO;
import X.C0LUR;
import X.C0LUT;
import X.C1954807lC;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2341909Fp;
import X.C542850LQt;
import X.C543450LTb;
import X.C543460LTc;
import X.C548010LeR;
import com.bytedance.aigc.proto.Level;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker;
import com.ss.android.ugc.aweme.aigc.aicreation.trace.IAICreationTrace;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AITheaterTraceConfigExp;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class AICreationTaskEventTrackerImpl implements IAICreationTaskEventTracker {
    @Override // com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker
    public final void LIZ(C0LUT c0lut) {
        Pair pair;
        String strLIZIZ;
        Map<String, Object> mapLJ;
        Level level;
        boolean z = c0lut instanceof C0LSO;
        if (z) {
            pair = new Pair("camera_aigc_start", c0lut.LIZJ());
        } else if ((c0lut instanceof C543460LTc) || (c0lut instanceof C543450LTb)) {
            pair = new Pair("camera_aigc_end", c0lut.LIZJ());
        } else {
            throw new C1954807lC();
        }
        String str = (String) pair.getFirst();
        JSONObject jSONObject = (JSONObject) pair.getSecond();
        String string = JSONObjectProtectorUtils.getString(jSONObject, "business");
        if ((Intrinsics.LJFF(string, Source.AI_THEATER.getSource()) || Intrinsics.LJFF(string, Source.AI_THEATER_CAMEO_RECORD.getSource())) && ((AITheaterTraceConfigExp.AITheaterTraceConfig) AITheaterTraceConfigExp.LIZIZ.getValue()).enableLogCollection) {
            String strOptString = jSONObject.optString("trace_id");
            int iOptInt = jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "task_type");
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append("_start");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (c0lut instanceof C543460LTc) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(string2);
                sbLIZ2.append("_end");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else if (c0lut instanceof C543450LTb) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(string2);
                sbLIZ3.append("_end");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                throw new C1954807lC();
            }
            try {
                mapLJ = JsonExtKt.toMap(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                mapLJ = C2097608Jq.LJ();
            }
            IAICreationTrace iAICreationTraceLIZ = C542850LQt.LIZ();
            if (iAICreationTraceLIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJ.size()));
                Iterator<T> it2 = mapLJ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                String str2 = c0lut.LIZ().LJFF;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(String.valueOf(C548010LeR.LJ.LIZ).toLowerCase(Locale.ROOT));
                sbLIZ4.append('.');
                sbLIZ4.append(string2);
                sbLIZ4.append('.');
                C0LUR c0lur = new C0LUR(strOptString, string, str2, C2188811AlT.LIZIZ(sbLIZ4));
                if (iOptInt != 0) {
                    if (iOptInt != 1) {
                        level = Level.WARN;
                    } else {
                        level = Level.INFO;
                    }
                } else {
                    level = Level.ERROR;
                }
                iAICreationTraceLIZ.LIZ(strLIZIZ, linkedHashMap, c0lur, level);
            }
        }
        C2341909Fp.LIZIZ(str, jSONObject);
    }
}
