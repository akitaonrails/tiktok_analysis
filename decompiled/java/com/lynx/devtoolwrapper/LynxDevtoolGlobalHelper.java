package com.lynx.devtoolwrapper;

import X.C1285920jZG;
import X.C1310180kCO;
import X.InterfaceC1310630kD7;
import android.content.Context;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.service.ILynxDevToolService;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LynxDevtoolGlobalHelper {
    public static ILynxDevToolService sDevToolService;
    public Map<String, String> mAppInfo;
    public boolean remoteDebugAvailable;

    public LynxDevtoolGlobalHelper() {
        HashMap map = new HashMap();
        this.mAppInfo = map;
        map.put("sdkVersion", LynxEnv.inst().getLynxVersion());
        if (LynxEnv.inst().isLynxDebugEnabled()) {
            initRemoteDebugIfNecessary();
            sDevToolService = (ILynxDevToolService) C1285920jZG.LIZJ().LIZ(ILynxDevToolService.class);
        }
    }

    private boolean initRemoteDebugIfNecessary() {
        if (!LynxEnv.inst().isLynxDebugEnabled()) {
            return false;
        }
        if (!LynxEnv.inst().isNativeLibraryLoaded()) {
            LynxLog.w("LynxDevtoolGlobalHelper", "liblynx.so not loaded!");
            return false;
        }
        if (this.remoteDebugAvailable) {
            return true;
        }
        this.remoteDebugAvailable = true;
        return true;
    }

    public static LynxDevtoolGlobalHelper getInstance() {
        return C1310180kCO.LIZ;
    }

    public boolean isRemoteDebugAvailable() {
        return this.remoteDebugAvailable;
    }

    public boolean prepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        if (!LynxEnv.inst().isLynxDebugEnabled()) {
            LynxLog.w("LynxDevtoolGlobalHelper", "Debugging not supported in this package");
            return false;
        }
        if (!LynxEnv.inst().isDevtoolEnabled()) {
            LynxLog.w("LynxDevtoolGlobalHelper", "DevTool not enabled, turn on the switch!");
            return false;
        }
        ILynxDevToolService iLynxDevToolService = sDevToolService;
        if (iLynxDevToolService != null) {
            return iLynxDevToolService.globalDebugBridgePrepareRemoteDebug(str).booleanValue();
        }
        LynxLog.e("LynxDevtoolGlobalHelper", "failed to get DevToolService");
        return false;
    }

    public void registerCardListener(InterfaceC1310630kD7 interfaceC1310630kD7) {
        if (!initRemoteDebugIfNecessary()) {
            return;
        }
        ILynxDevToolService iLynxDevToolService = sDevToolService;
        if (iLynxDevToolService != null) {
            iLynxDevToolService.globalDebugBridgeRegisterCardListener(interfaceC1310630kD7);
        } else {
            LynxLog.e("LynxDevtoolGlobalHelper", "failed to get DevToolService");
        }
    }

    public boolean shouldPrepareRemoteDebug(String str) {
        if (!initRemoteDebugIfNecessary()) {
            return false;
        }
        ILynxDevToolService iLynxDevToolService = sDevToolService;
        if (iLynxDevToolService != null) {
            return iLynxDevToolService.globalDebugBridgeShouldPrepareRemoteDebug(str).booleanValue();
        }
        LynxLog.e("LynxDevtoolGlobalHelper", "failed to get DevToolService");
        return false;
    }

    public void setAppInfo(Context context, Map<String, String> map) {
        if (map != null) {
            this.mAppInfo.putAll(map);
        }
        if (!initRemoteDebugIfNecessary()) {
            return;
        }
        ILynxDevToolService iLynxDevToolService = sDevToolService;
        if (iLynxDevToolService != null) {
            iLynxDevToolService.globalDebugBridgeSetAppInfo(context, this.mAppInfo);
        } else {
            LynxLog.e("LynxDevtoolGlobalHelper", "failed to get DevToolService");
        }
    }

    public void setAppInfo(String str, String str2) {
        setAppInfo(null, str, str2);
    }

    public void onPerfMetricsEvent(String str, JSONObject jSONObject, int i) {
        if (!this.remoteDebugAvailable) {
            return;
        }
        ILynxDevToolService iLynxDevToolService = sDevToolService;
        if (iLynxDevToolService != null) {
            iLynxDevToolService.globalDebugBridgeOnPerfMetricsEvent(str, jSONObject, i);
        } else {
            LynxLog.e("LynxDevtoolGlobalHelper", "failed to get DevToolService");
        }
    }

    public void setAppInfo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("App", str);
        map.put("AppVersion", str2);
        setAppInfo(context, map);
    }
}
