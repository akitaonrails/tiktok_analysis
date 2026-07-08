package com.lynx.tasm.service;

import X.C0X8C;
import X.InterfaceC1309710kBd;
import X.InterfaceC1310380kCi;
import X.InterfaceC1310630kD7;
import android.content.Context;
import com.lynx.devtoolwrapper.LynxDevtool;
import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.LynxView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxDevToolService extends IServiceProvider {
    InterfaceC1309710kBd createInspectorOwner(LynxView lynxView, boolean z);

    InterfaceC1310380kCi createLogBox(LynxDevtool lynxDevtool);

    void devtoolEnvInit(Context context);

    void devtoolEnvSetDevToolLibraryLoader(C0X8C c0x8c);

    void enableAllSessions();

    Class<? extends LynxModule> getDevToolSetModuleClass();

    boolean getLoadQJSBridge();

    boolean getLoadV8Bridge();

    boolean getLogBoxPresetValue();

    boolean getLynxDebugPresetValue();

    Class<? extends LynxModule> getLynxTrailModule();

    Class<? extends LynxModule> getLynxWebSocketModuleClass();

    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    void globalDebugBridgeOnPerfMetricsEvent(String str, JSONObject jSONObject, int i);

    Boolean globalDebugBridgePrepareRemoteDebug(String str);

    void globalDebugBridgeRegisterCardListener(InterfaceC1310630kD7 interfaceC1310630kD7);

    void globalDebugBridgeSetAppInfo(Context context, Map<String, String> map);

    Boolean globalDebugBridgeShouldPrepareRemoteDebug(String str);

    boolean isDevtoolAttached();

    void setLoadQJSBridge(boolean z);

    void setLoadV8Bridge(boolean z);

    void setLogBoxPresetValue(boolean z);

    void setLynxDebugPresetValue(boolean z);
}
