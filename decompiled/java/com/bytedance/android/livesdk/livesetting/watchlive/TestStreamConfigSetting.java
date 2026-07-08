package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C1161920gLG;
import X.C786410Ut5;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.LiveStreamTestConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("test_stream_config")
public final class TestStreamConfigSetting {
    public static final TestStreamConfigSetting INSTANCE = new TestStreamConfigSetting();
    public static final LiveStreamTestConfig DEFAULT = new LiveStreamTestConfig();

    public final LiveStreamTestConfig getValue() {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            return DEFAULT;
        }
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveStreamTestConfig liveStreamTestConfig = DEFAULT;
        LiveStreamTestConfig liveStreamTestConfig2 = (LiveStreamTestConfig) settingsManager.getValueSafely("test_stream_config", liveStreamTestConfig);
        return liveStreamTestConfig2 != null ? liveStreamTestConfig2 : liveStreamTestConfig;
    }

    public final LiveStreamTestConfig getDEFAULT() {
        return DEFAULT;
    }

    public final String replaceSdkParams(Map<String, String> map, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "PushBase"));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("PushBase", jSONObject2);
        return C786410Ut5.J3(jSONObject);
    }
}
