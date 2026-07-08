package com.bytedance.ies.xelement.viewpager;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxViewPager$$MethodInvoker implements InterfaceC1289340jem<LynxViewPager> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxViewPager lynxViewPager, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1715986183:
                if (str.equals("selectTab")) {
                    lynxViewPager.selectTab(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxViewPager.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxViewPager.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxViewPager.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxViewPager.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxViewPager.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxViewPager.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxViewPager.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
