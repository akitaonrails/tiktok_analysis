package com.lynx.tasm.behavior.ui.text;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIText$$MethodInvoker implements InterfaceC1289340jem<UIText> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(UIText uIText, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -527962973:
                if (str.equals("innerText")) {
                    uIText.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIText.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -127960866:
                if (str.equals("getSelectedText")) {
                    uIText.getSelectedText(readableMap, callback);
                    return;
                }
                break;
            case -95358563:
                if (str.equals("setTextSelection")) {
                    uIText.setTextSelection(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIText.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIText.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 850462443:
                if (str.equals("getTextBoundingRect")) {
                    uIText.getTextBoundingRect(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIText.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIText.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIText.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
