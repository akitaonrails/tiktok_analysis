package com.ss.android.ugc.aweme.commercialize.log;

import X.C04TD;
import X.C1019030ccn;
import X.C1AF0;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedRawAdLogUtilsImpl implements FeedRawAdLogUtilsApi {
    public static FeedRawAdLogUtilsApi LIZIZ() {
        Object objLIZ = C04TD.LIZ(FeedRawAdLogUtilsApi.class, false);
        if (objLIZ != null) {
            return (FeedRawAdLogUtilsApi) objLIZ;
        }
        if (C04TD.LLLIIIL == null) {
            synchronized (FeedRawAdLogUtilsApi.class) {
                if (C04TD.LLLIIIL == null) {
                    C04TD.LLLIIIL = new FeedRawAdLogUtilsImpl();
                }
            }
        }
        return C04TD.LLLIIIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi
    public final void LIZ(Context context, Aweme aweme) {
        if (aweme != null) {
            JSONObject jSONObjectLJIIIZ = C1019030ccn.LJIIIZ(context, aweme);
            try {
                HashMap map = new HashMap();
                map.put("anchor_id", C1019030ccn.LJI(aweme));
                map.put("room_id", C1019030ccn.LJIIZILJ(aweme));
                jSONObjectLJIIIZ.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            C1019030ccn.LJJJJ(context, "share", aweme, jSONObjectLJIIIZ);
        }
    }
}
