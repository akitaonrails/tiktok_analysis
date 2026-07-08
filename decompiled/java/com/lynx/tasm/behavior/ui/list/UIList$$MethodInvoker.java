package com.lynx.tasm.behavior.ui.list;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIList$$MethodInvoker implements InterfaceC1289340jem<UIList> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(UIList uIList, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -980170895:
                if (str.equals("scrollToPosition")) {
                    uIList.scrollToPosition(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    uIList.innerText(readableMap, callback);
                    return;
                }
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    uIList.scrollBy(readableMap, callback);
                    return;
                }
                break;
            case -398364324:
                if (str.equals("autoScroll")) {
                    uIList.autoScroll(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIList.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -284097454:
                if (str.equals("initCache")) {
                    uIList.initCache();
                    return;
                }
                break;
            case -231782127:
                if (str.equals("getScrollInfo")) {
                    uIList.getScrollInfo(callback);
                    return;
                }
                break;
            case -142621742:
                if (str.equals("removeStickyView")) {
                    uIList.removeStickyView();
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIList.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIList.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1363070069:
                if (str.equals("getVisibleCells")) {
                    uIList.getVisibleCells(callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIList.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIList.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIList.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
