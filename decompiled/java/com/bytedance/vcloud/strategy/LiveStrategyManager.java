package com.bytedance.vcloud.strategy;

import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LiveStrategyManager {
    public static volatile LiveStrategyManager sInstance;
    public final Map<String, WeakReference<ILiveFeatureBundle>> mListenerMap = new LinkedHashMap();
    public final ReentrantLock mLock = new ReentrantLock();

    public int convertLiveStrategyIdToVCOptionId(int i) {
        return i != 23 ? -1 : 12002;
    }

    public static LiveStrategyManager inst() {
        if (sInstance == null) {
            synchronized (LiveStrategyManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LiveStrategyManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void purgeDeadListeners() {
        Iterator<Map.Entry<String, WeakReference<ILiveFeatureBundle>>> it2 = this.mListenerMap.entrySet().iterator();
        while (it2.hasNext()) {
            WeakReference<ILiveFeatureBundle> value = it2.next().getValue();
            if (value == null || value.get() == null) {
                it2.remove();
            }
        }
    }

    public void releaseFeatureDataBundle(String str) {
        this.mLock.lock();
        try {
            this.mListenerMap.remove(str);
            this.mLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mLock.unlock();
            throw th;
        }
    }

    public JSONObject runLiveStrategy(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && jSONObject.has("InputFeatureList")) {
            jSONObject2 = LiveFeatureCollector.inst().fillInputFeatures(jSONObject);
        }
        if (jSONObject != null && jSONObject.has("InputSettingsParam")) {
            try {
                jSONObject2.put("InputSettingsParam", jSONObject.optJSONObject("InputSettingsParam"));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (jSONObject != null && jSONObject.has("configUniqueId")) {
            try {
                jSONObject2.put("configUniqueId", jSONObject.optString("configUniqueId"));
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (jSONObject != null && jSONObject.has("stream_session_vv_id")) {
            try {
                jSONObject2.put("stream_session_vv_id", jSONObject.optString("stream_session_vv_id"));
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        if (jSONObject != null && jSONObject.has("media_id")) {
            try {
                jSONObject2.put("media_id", jSONObject.optString("media_id"));
            } catch (JSONException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        int iConvertLiveStrategyIdToVCOptionId = convertLiveStrategyIdToVCOptionId(i);
        if (iConvertLiveStrategyIdToVCOptionId > 0) {
            String stringValue = StrategyCenter.getInstance().getStringValue(iConvertLiveStrategyIdToVCOptionId, C786410Ut5.J3(jSONObject2));
            if (!TextUtils.isEmpty(stringValue)) {
                try {
                    return new JSONObject(stringValue);
                } catch (OutOfMemoryError e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    try {
                        new JSONObject().put("predict_bitrate", 0);
                        return null;
                    } catch (JSONException e6) {
                        TryCatchGuardChecker.doCheck(e6);
                    }
                } catch (JSONException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    return null;
                }
            }
        }
        return null;
    }

    public void setFeatureDataBundle(String str, ILiveFeatureBundle iLiveFeatureBundle) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "none") && iLiveFeatureBundle != null) {
            this.mLock.lock();
            try {
                purgeDeadListeners();
                if (this.mListenerMap.containsKey(str)) {
                    this.mListenerMap.remove(str);
                }
                if (this.mListenerMap.size() >= 10) {
                    Iterator<Map.Entry<String, WeakReference<ILiveFeatureBundle>>> it2 = this.mListenerMap.entrySet().iterator();
                    while (this.mListenerMap.size() >= 10 && it2.hasNext()) {
                        it2.next();
                        it2.remove();
                    }
                }
                this.mListenerMap.put(str, new WeakReference<>(iLiveFeatureBundle));
                this.mLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mLock.unlock();
                throw th;
            }
        }
    }

    public void getRtFeatureData(String str, String str2, JSONObject jSONObject) {
        ILiveFeatureBundle iLiveFeatureBundle;
        this.mLock.lock();
        try {
            WeakReference<ILiveFeatureBundle> weakReference = this.mListenerMap.get(str);
            if (weakReference != null) {
                iLiveFeatureBundle = weakReference.get();
                if (iLiveFeatureBundle == null) {
                    this.mListenerMap.remove(str);
                }
            } else {
                iLiveFeatureBundle = null;
            }
            this.mLock.unlock();
            if (iLiveFeatureBundle == null) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str2);
                iLiveFeatureBundle.getAppInfoForKey("bundle", new JSONObject().put("featuresBundleList", jSONArray).put("featuresData", jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mLock.unlock();
            throw th;
        }
    }
}
