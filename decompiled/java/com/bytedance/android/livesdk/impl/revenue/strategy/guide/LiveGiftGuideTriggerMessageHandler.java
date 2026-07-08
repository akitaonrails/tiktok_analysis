package com.bytedance.android.livesdk.impl.revenue.strategy.guide;

import X.C183100n7;
import X.C203600qQ;
import X.C206400qs;
import X.C786410Ut5;
import X.C930940aKi;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.api.revenue.strategy.guide.TriggerApi;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pitaya.api.PTYMessageHandler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LiveGiftGuideTriggerMessageHandler implements PTYMessageHandler {
    public static DataChannel dataChannel;
    public static final LiveGiftGuideTriggerMessageHandler INSTANCE = new LiveGiftGuideTriggerMessageHandler();
    public static final AtomicBoolean registered = new AtomicBoolean(false);
    public static final int $stable = 8;

    public final void unregister() {
        if (registered.compareAndSet(true, false)) {
            dataChannel = null;
            LivePitayaEnv.LJIIL().removeMessageHandler("live_guide_trigger_call");
        }
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) throws JSONException {
        Function0 function0;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long jLongValue = 0;
        if (room != null) {
            long id = room.getId();
            if (id > 0 && !a0.LJJJIL(C786410Ut5.J3(jSONObject))) {
                C183100n7.LIZ("live_guide_trigger_call", jSONObject);
                String strLIZJ = C183100n7.LIZJ("biz_name", jSONObject);
                String strLIZJ2 = C183100n7.LIZJ("trigger_type", jSONObject);
                String strLIZJ3 = C183100n7.LIZJ("label", jSONObject);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("client_trigger_feature");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                String strLIZJ4 = C183100n7.LIZJ("sub_trigger_name", jSONObject);
                String strLIZJ5 = C183100n7.LIZJ("anchor_trigger_biz_info", jSONObject);
                if (!a0.LJJJIL(strLIZJ) && !a0.LJJJIL(strLIZJ2)) {
                    String strLIZ = C203600qQ.LIZ();
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null && (function0 = (Function0) dataChannel2.gg0(WatchDurationChannel.class)) != null) {
                        jLongValue = ((Number) function0.invoke()).longValue();
                    }
                    C206400qs c206400qs = TriggerApi.LIZ;
                    List listSingletonList = Collections.singletonList(strLIZJ);
                    c206400qs.getClass();
                    C206400qs.LIZIZ(id, listSingletonList, strLIZJ2, jLongValue, strLIZ, strJ3, strLIZJ3, strLIZJ4, strLIZJ5);
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final void register(DataChannel dataChannel2) {
        if (registered.compareAndSet(false, true)) {
            dataChannel = dataChannel2;
            LivePitayaEnv.LJIIL().registerMessageHandler("live_guide_trigger_call", this);
        }
    }
}
