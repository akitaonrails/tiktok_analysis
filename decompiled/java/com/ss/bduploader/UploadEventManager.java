package com.ss.bduploader;

import X.C08FF;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.logupload.AppLogEngineUploader;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public enum UploadEventManager {
    instance;

    public VideoEventEngineUploader mEngineUploader;
    public JSONArray mJsonArray = new JSONArray();
    public boolean mEnableUseEngineUploader = true;

    public JSONArray popAllEvents() {
        JSONArray jSONArray = this.mJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mJsonArray = new JSONArray();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONArray;
    }

    public static UploadEventManager valueOf(String str) {
        return (UploadEventManager) C08FF.LIZ(UploadEventManager.class, str);
    }

    public void addEvent(JSONObject jSONObject) {
        String string;
        synchronized (UploadEventManager.class) {
            if (jSONObject != null) {
                try {
                    if (this.mEngineUploader != null && this.mEnableUseEngineUploader) {
                        try {
                            string = jSONObject.getString("event");
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            string = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            this.mEngineUploader.onEventV3(string, jSONObject);
                        }
                    } else {
                        this.mJsonArray.put(jSONObject);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public void putEvent(JSONObject jSONObject) {
        synchronized (UploadEventManager.class) {
            try {
                this.mJsonArray.put(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public synchronized void setEngineUploader(VideoEventEngineUploader videoEventEngineUploader) {
        this.mEngineUploader = videoEventEngineUploader;
    }

    public void setUseEngineUploader(boolean z) {
        this.mEnableUseEngineUploader = z;
    }

    UploadEventManager() {
        setEngineUploader(AppLogEngineUploader.getInstance());
    }
}
