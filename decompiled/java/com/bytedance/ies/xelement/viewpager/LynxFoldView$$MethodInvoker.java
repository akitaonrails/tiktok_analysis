package com.bytedance.ies.xelement.viewpager;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxFoldView$$MethodInvoker implements InterfaceC1289340jem<LynxFoldView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxFoldView lynxFoldView, String str, ReadableMap readableMap, Callback callback) throws Throwable {
        str.getClass();
        switch (str.hashCode()) {
            case -1054205604:
                if (str.equals("setFoldExpanded")) {
                    lynxFoldView.setFoldExpanded(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxFoldView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxFoldView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxFoldView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxFoldView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxFoldView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxFoldView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxFoldView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
