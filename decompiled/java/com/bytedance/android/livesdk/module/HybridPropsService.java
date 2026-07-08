package com.bytedance.android.livesdk.module;

import X.C0IL2;
import X.C500260Jjc;
import X.C520730KbX;
import X.C930940aKi;
import com.bytedance.android.live.browser.IHybridPropsService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public class HybridPropsService implements IHybridPropsService {
    @Override // com.bytedance.android.live.browser.IHybridPropsService
    public final Map<String, Object> Aj() {
        return C520730KbX.LIZ.LIZIZ();
    }

    @Override // com.bytedance.android.live.browser.IHybridPropsService
    public final Map<String, Object> Pe() {
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.TimeStamp timeStamp;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(C930940aKi.class);
        if (!C500260Jjc.LJJIJLIJ()) {
            str = objGg0 != null ? C500260Jjc.LJIJ(dataChannelGlobal) ? "live_room_anchor" : "live_room_audience" : "live_room_preview";
            return linkedHashMap;
        }
        if (str != null && !a0.LJJJIL(str)) {
            linkedHashMap.put(Scene.SCENE_SERVICE, str);
            EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
            if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (timeStamp = enterRoomConfig.mRoomsData.timeStamps) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - timeStamp.enterRoomStarTimeReal;
                linkedHashMap.put("sub_scene", (0 > jCurrentTimeMillis || jCurrentTimeMillis >= 1001) ? (1000 > jCurrentTimeMillis || jCurrentTimeMillis >= 3001) ? (3000 > jCurrentTimeMillis || jCurrentTimeMillis >= 5001) ? (Mp4ScreenVideoLoadTimeout.CONTROL > jCurrentTimeMillis || jCurrentTimeMillis >= 10001) ? (10000 > jCurrentTimeMillis || jCurrentTimeMillis >= 15001) ? (15000 > jCurrentTimeMillis || jCurrentTimeMillis >= 30001) ? "enter_room_30s+" : "enter_room_30s" : "enter_room_15s" : "enter_room_10s" : "enter_room_5s" : "enter_room_3s" : "enter_room_1s");
            }
        }
        return linkedHashMap;
    }

    @Override // com.bytedance.android.live.browser.IHybridPropsService
    public final Map<String, String> Gu2() {
        return C520730KbX.LIZ();
    }
}
