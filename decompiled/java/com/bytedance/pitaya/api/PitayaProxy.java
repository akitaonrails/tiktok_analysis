package com.bytedance.pitaya.api;

import X.C08RY;
import X.InterfaceC2117008Rc;
import X.InterfaceC2211331Bgh;
import android.content.Context;
import com.bytedance.pitaya.api.PitayaProxy;
import com.bytedance.pitaya.api.bean.PTYProxySetting;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class PitayaProxy implements ReflectionCall {
    public static final PitayaProxy INSTANCE = new PitayaProxy();
    public static final String TAG = "PTY-Proxy";
    public static volatile PitayaApplogProxy applogProxy;
    public static volatile InterfaceC2117008Rc eventVerify;
    public static volatile boolean initOnce;
    public static volatile PTYProxySetting mSetting;

    public static final int applogCacheSize() {
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            return pitayaApplogProxy.cacheSize();
        }
        return 0;
    }

    public static final boolean isFeatureStoreProxyEnabled() {
        PTYProxySetting pTYProxySetting;
        if (initOnce && (pTYProxySetting = mSetting) != null) {
            return pTYProxySetting.getFeatureStoreProxyEnabled();
        }
        return false;
    }

    public static final boolean isValid() {
        return applogProxy != null;
    }

    public final InterfaceC2117008Rc getEventVerify() {
        return eventVerify;
    }

    public final String getTAG() {
        return TAG;
    }

    public static final boolean isValidEvent(String str) {
        InterfaceC2117008Rc interfaceC2117008Rc = eventVerify;
        if (interfaceC2117008Rc != null) {
            return interfaceC2117008Rc.isValidEvent(str);
        }
        return false;
    }

    public static final void processApplogCache(PTYApplogImplCallback pTYApplogImplCallback) {
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            pitayaApplogProxy.storeCache(pTYApplogImplCallback);
        }
        applogProxy = null;
    }

    public final void setEventVerify(InterfaceC2117008Rc interfaceC2117008Rc) {
        eventVerify = interfaceC2117008Rc;
    }

    public static final boolean init(Context context, PTYProxySetting pTYProxySetting) {
        Boolean boolValueOf;
        synchronized (INSTANCE) {
            try {
                if (initOnce) {
                    return false;
                }
                initOnce = true;
                C08RY.LIZIZ(context);
                mSetting = pTYProxySetting;
                if (pTYProxySetting.getApplogProxyEnabled()) {
                    applogProxy = new PitayaApplogProxy();
                    PitayaApplogProxy pitayaApplogProxy = applogProxy;
                    if (pitayaApplogProxy != null) {
                        boolValueOf = Boolean.valueOf(pitayaApplogProxy.init(pTYProxySetting));
                    } else {
                        boolValueOf = null;
                    }
                    if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                        applogProxy = null;
                    } else {
                        eventVerify = applogProxy;
                        if (!pTYProxySetting.getProvideAppLog()) {
                            AppLog.registerGlobalEventCallback(new InterfaceC2211331Bgh() { // from class: X.08Ra
                                @Override // X.InterfaceC2211331Bgh
                                public final void LIZ(String str, String str2, String str3, long j, long j2, String str4) {
                                    PitayaProxy.init$lambda$2(str, str2, str3, j, j2, false, str4);
                                }
                            });
                            return true;
                        }
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void onAppLogEvent(String str, String str2) {
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            pitayaApplogProxy.onEvent(str, str2);
        }
    }

    public static final void onAppLogEvent(String str, JSONObject jSONObject) {
        PitayaApplogProxy pitayaApplogProxy = applogProxy;
        if (pitayaApplogProxy != null) {
            pitayaApplogProxy.onEvent(str, jSONObject);
        }
    }

    public static final void init$lambda$2(String str, String str2, String str3, long j, long j2, boolean z, String str4) {
        PitayaApplogProxy pitayaApplogProxy;
        if (str2 != null && (pitayaApplogProxy = applogProxy) != null) {
            pitayaApplogProxy.onEvent(str2, str4);
        }
    }
}
