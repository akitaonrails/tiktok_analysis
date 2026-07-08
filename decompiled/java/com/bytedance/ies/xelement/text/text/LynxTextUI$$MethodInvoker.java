package com.bytedance.ies.xelement.text.text;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxTextUI$$MethodInvoker implements InterfaceC1289340jem<LynxTextUI> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxTextUI lynxTextUI, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -527962973:
                if (str.equals("innerText")) {
                    lynxTextUI.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxTextUI.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -127960866:
                if (str.equals("getSelectedText")) {
                    lynxTextUI.getSelectedText(readableMap, callback);
                    return;
                }
                break;
            case -95358563:
                if (str.equals("setTextSelection")) {
                    lynxTextUI.setTextSelection(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxTextUI.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxTextUI.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 850462443:
                if (str.equals("getTextBoundingRect")) {
                    lynxTextUI.getTextBoundingRect(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxTextUI.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxTextUI.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxTextUI.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
