package com.bytedance.android.livesdk.impl.revenue.strategy.guide;

import X.C098200Yq;
import X.C1161920gLG;
import X.C189200o6;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LiveGiftGuideAvoidQueryMessageHandler implements PTYMessageHandler {
    public static final LiveGiftGuideAvoidQueryMessageHandler INSTANCE = new LiveGiftGuideAvoidQueryMessageHandler();
    public static final AtomicBoolean registered = new AtomicBoolean(false);
    public static final int $stable = 8;

    public final void register() {
        if (registered.compareAndSet(false, true)) {
            LivePitayaEnv.LJIIL().registerMessageHandler("live_guide_is_in_avoid", this);
        }
    }

    public final void unregister() {
        if (registered.compareAndSet(true, false)) {
            LivePitayaEnv.LJIIL().removeMessageHandler("live_guide_is_in_avoid");
        }
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) throws JSONException {
        Object c098200Yq;
        try {
            c098200Yq = Boolean.valueOf(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isGiftGuideInAvoid());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("result", zBooleanValue ? 1 : 0);
        return jSONObject2;
    }
}
