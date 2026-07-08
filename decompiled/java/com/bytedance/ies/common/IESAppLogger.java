package com.bytedance.ies.common;

import X.C08JP;
import X.C2189061Als;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class IESAppLogger {
    public String appId;
    public Boolean initFlag;
    public Boolean isAbroad;
    public static final Object object = new Object();
    public static volatile IESAppLogger instance = null;
    public final Set<String> mSampler = new HashSet();
    public C08JP appLoggerCallback = null;

    public native void nativeSetSampler(Set<String> set);

    public static IESAppLogger sharedInstance() {
        IESAppLogger iESAppLogger;
        if (instance != null) {
            return instance;
        }
        synchronized (object) {
            try {
                if (instance == null) {
                    instance = new IESAppLogger();
                }
                iESAppLogger = instance;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iESAppLogger;
    }

    public IESAppLogger() {
        Boolean bool = Boolean.FALSE;
        this.initFlag = bool;
        this.appId = null;
        this.isAbroad = bool;
    }

    public static JSONObject copyJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys == null) {
            return new JSONObject();
        }
        while (itKeys.hasNext()) {
            linkedList.add(itKeys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public boolean isSampled(String str) {
        if (str != null && !str.isEmpty() && !this.mSampler.isEmpty() && this.mSampler.contains(str)) {
            return true;
        }
        return false;
    }

    public synchronized void setSampler(Set<String> set) {
        if (set != null) {
            if (!set.isEmpty()) {
                this.mSampler.clear();
                this.mSampler.addAll(set);
                nativeSetSampler(this.mSampler);
            }
        }
    }

    public void appLogOnEvent(String str, String str2, String str3) {
        appLogOnEvent(str, str2, str3, false);
    }

    public void setAppLogCallback(String str, C08JP c08jp, boolean z) {
        if (this.initFlag.booleanValue()) {
            return;
        }
        synchronized (object) {
            try {
                if (!this.initFlag.booleanValue()) {
                    this.appId = str;
                    this.appLoggerCallback = c08jp;
                    this.initFlag = Boolean.TRUE;
                    this.isAbroad = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2) {
        appLogOnEvent(str, jSONObject, str2, false);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        }
        if (this.appLoggerCallback == null) {
            return;
        }
        if (!this.mSampler.isEmpty() && this.mSampler.contains(str)) {
            return;
        }
        if (z2) {
            ((C2189061Als) this.appLoggerCallback).LIZ(str, str2, copyJson(jSONObject));
        }
        if (z) {
            JSONObject jSONObjectCopyJson = copyJson(jSONObject);
            try {
                if (this.isAbroad.booleanValue()) {
                    jSONObjectCopyJson.put("second_appid", "2780");
                    jSONObjectCopyJson.put("second_appname", "vesdk_abroad");
                } else {
                    jSONObjectCopyJson.put("second_appid", "1357");
                    jSONObjectCopyJson.put("second_appname", "video_editor_sdk");
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((C2189061Als) this.appLoggerCallback).LIZ(str, str2, jSONObjectCopyJson);
        }
    }

    public void appLogOnEvent(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        if (this.appLoggerCallback == null) {
            return;
        }
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        appLogOnEvent(str, jSONObject, str3, z);
    }

    public void appLogOnEvent(String str, String str2, String str3, int i) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        appLogOnEvent(str, jSONObject, str3, i);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, boolean z) {
        int i;
        if (z) {
            i = 3;
        } else {
            i = 1;
        }
        appLogOnEvent(str, jSONObject, str2, i);
    }
}
