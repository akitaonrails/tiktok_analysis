package com.lynx.xelement.scroll.coordinator.childitem;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinatorHeader$$MethodInvoker implements InterfaceC1289340jem<LynxUIScrollCoordinatorHeader> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxUIScrollCoordinatorHeader lynxUIScrollCoordinatorHeader, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -527962973:
                if (str.equals("innerText")) {
                    lynxUIScrollCoordinatorHeader.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxUIScrollCoordinatorHeader.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxUIScrollCoordinatorHeader.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxUIScrollCoordinatorHeader.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxUIScrollCoordinatorHeader.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxUIScrollCoordinatorHeader.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxUIScrollCoordinatorHeader.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
