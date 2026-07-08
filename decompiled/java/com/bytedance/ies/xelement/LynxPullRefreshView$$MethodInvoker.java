package com.bytedance.ies.xelement;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxPullRefreshView$$MethodInvoker implements InterfaceC1289340jem<LynxPullRefreshView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxPullRefreshView lynxPullRefreshView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1890175128:
                if (str.equals("autoStartRefresh")) {
                    lynxPullRefreshView.autoStartRefresh(readableMap);
                    return;
                }
                break;
            case -1662894322:
                if (str.equals("finishLoadMore")) {
                    lynxPullRefreshView.finishLoadMore(readableMap);
                    return;
                }
                break;
            case -828841272:
                if (str.equals("finishRefresh")) {
                    lynxPullRefreshView.finishRefresh(readableMap);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxPullRefreshView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxPullRefreshView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxPullRefreshView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxPullRefreshView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxPullRefreshView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxPullRefreshView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxPullRefreshView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
