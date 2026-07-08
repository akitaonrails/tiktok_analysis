package com.lynx.tasm.behavior.ui.list.container;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIListContainer$$MethodInvoker implements InterfaceC1289340jem<UIListContainer> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(UIListContainer uIListContainer, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -980170895:
                if (str.equals("scrollToPosition")) {
                    uIListContainer.scrollToPosition(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    uIListContainer.innerText(readableMap, callback);
                    return;
                }
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    uIListContainer.scrollBy(readableMap, callback);
                    return;
                }
                break;
            case -398364324:
                if (str.equals("autoScroll")) {
                    uIListContainer.autoScroll(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIListContainer.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -231782127:
                if (str.equals("getScrollInfo")) {
                    uIListContainer.getScrollInfo(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIListContainer.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIListContainer.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1363070069:
                if (str.equals("getVisibleCells")) {
                    uIListContainer.getVisibleCells(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIListContainer.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIListContainer.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIListContainer.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
