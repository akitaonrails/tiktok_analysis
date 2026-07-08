package com.ss.android.ugc.aweme.feed.model;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyInfoKt {
    public static final NearbyInfo removeInnerSessionId(NearbyInfo nearbyInfo) {
        JSONObject jSONObject;
        try {
            if (nearbyInfo.nearbyDoubleColumnEventTrack != null) {
                jSONObject = new JSONObject(nearbyInfo.nearbyDoubleColumnEventTrack);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject.remove("nearby_inner_session_id");
            return nearbyInfo.copy(nearbyInfo.eventTrack, nearbyInfo.cannotCached, nearbyInfo.nearbyRegion, nearbyInfo.nearbyVV, nearbyInfo.localViewsItemAuth, C786410Ut5.J3(jSONObject));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return nearbyInfo;
        }
    }

    public static final NearbyInfo addParamsToNearbyDoubleColumnEventTrack(NearbyInfo nearbyInfo, Map<String, Object> map) {
        JSONObject jSONObject;
        try {
            if (nearbyInfo.nearbyDoubleColumnEventTrack != null) {
                jSONObject = new JSONObject(nearbyInfo.nearbyDoubleColumnEventTrack);
            } else {
                jSONObject = new JSONObject();
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return nearbyInfo.copy(nearbyInfo.eventTrack, nearbyInfo.cannotCached, nearbyInfo.nearbyRegion, nearbyInfo.nearbyVV, nearbyInfo.localViewsItemAuth, C786410Ut5.J3(jSONObject));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return nearbyInfo;
        }
    }
}
