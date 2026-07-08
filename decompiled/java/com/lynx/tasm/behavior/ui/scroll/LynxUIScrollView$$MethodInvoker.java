package com.lynx.tasm.behavior.ui.scroll;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollView$$MethodInvoker implements InterfaceC1289340jem<LynxUIScrollView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxUIScrollView lynxUIScrollView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -527962973:
                if (str.equals("innerText")) {
                    lynxUIScrollView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    lynxUIScrollView.scrollBy(readableMap, callback);
                    return;
                }
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    lynxUIScrollView.scrollTo(readableMap, callback);
                    return;
                }
                break;
            case -398364324:
                if (str.equals("autoScroll")) {
                    lynxUIScrollView.autoScroll(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxUIScrollView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -231782127:
                if (str.equals("getScrollInfo")) {
                    lynxUIScrollView.getScrollInfo(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxUIScrollView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxUIScrollView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxUIScrollView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxUIScrollView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxUIScrollView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
