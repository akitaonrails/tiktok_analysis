package com.ss.lyrax.augur;

import com.ss.lyrax.ILyraxObject;
import com.ss.lyrax.engine.LyraxScene;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface IAugur extends ILyraxObject {
    void destroy();

    @Override // com.ss.lyrax.ILyraxObject
    long getNativePtr();

    boolean isAugurInited();

    long registerCommand(IAugurCommand iAugurCommand, LyraxScene lyraxScene);

    void runStrategyGraphOnce();

    void setConfigRequester(long j);

    void start();

    void stop();

    long unregisterCommand(String str);

    void updateConfig(String str, AugurConfigExtraInfo augurConfigExtraInfo);

    void updateConfigAsync(String str, AugurConfigExtraInfo augurConfigExtraInfo);

    void updateFeature(String str, double d);

    void updateFeature(String str, float f);

    void updateFeature(String str, int i);

    void updateFeature(String str, long j);

    void updateFeature(String str, String str2);

    void updateFeature(String str, JSONArray jSONArray);

    void updateFeature(String str, JSONObject jSONObject);

    void updateFeature(String str, boolean z);

    void updateFeatures(Map<String, Object> map);
}
