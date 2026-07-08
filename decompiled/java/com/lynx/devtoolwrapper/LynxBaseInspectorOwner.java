package com.lynx.devtoolwrapper;

import X.InterfaceC1311500kEW;
import X.InterfaceC1311510kEX;
import X.InterfaceC1311520kEY;
import com.lynx.react.bridge.Callback;

/* JADX INFO: loaded from: classes21.dex */
public interface LynxBaseInspectorOwner {
    void addCDPEventListener(String str, InterfaceC1311500kEW interfaceC1311500kEW);

    void getConsoleObject(String str, boolean z, Callback callback);

    void invokeCDPFromSDK(String str, InterfaceC1311510kEX interfaceC1311510kEX);

    void registerGlobalPropsUpdatedObserver(InterfaceC1311520kEY interfaceC1311520kEY);

    void reload(boolean z);

    void reload(boolean z, String str, boolean z2, int i);

    void removeCDPEventListener(String str);

    void setDebugTag(String str);

    void setLynxInspectorConsoleDelegate(Object obj);
}
