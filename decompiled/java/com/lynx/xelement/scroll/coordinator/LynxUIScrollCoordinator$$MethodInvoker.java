package com.lynx.xelement.scroll.coordinator;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinator$$MethodInvoker implements InterfaceC1289340jem<LynxUIScrollCoordinator> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxUIScrollCoordinator lynxUIScrollCoordinator, String str, ReadableMap readableMap, Callback callback) throws Throwable {
        str.getClass();
        switch (str.hashCode()) {
            case -1054205604:
                if (str.equals("setFoldExpanded")) {
                    lynxUIScrollCoordinator.setFoldExpanded(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxUIScrollCoordinator.innerText(readableMap, callback);
                    return;
                }
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    lynxUIScrollCoordinator.scrollBy(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxUIScrollCoordinator.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -231782127:
                if (str.equals("getScrollInfo")) {
                    lynxUIScrollCoordinator.getScrollInfo(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxUIScrollCoordinator.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxUIScrollCoordinator.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxUIScrollCoordinator.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxUIScrollCoordinator.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxUIScrollCoordinator.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
