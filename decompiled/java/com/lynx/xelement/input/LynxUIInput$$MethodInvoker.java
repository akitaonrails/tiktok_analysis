package com.lynx.xelement.input;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes36.dex */
public class LynxUIInput$$MethodInvoker implements InterfaceC1289340jem<LynxUIInput> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxUIInput lynxUIInput, String str, ReadableMap readableMap, Callback callback) throws Throwable {
        str.getClass();
        switch (str.hashCode()) {
            case -527962973:
                if (str.equals("innerText")) {
                    lynxUIInput.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxUIInput.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    lynxUIInput.blur(readableMap, callback);
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxUIInput.focus(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxUIInput.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxUIInput.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxUIInput.setSelectionRange(readableMap, callback);
                    return;
                }
                break;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxUIInput.setValue(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxUIInput.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxUIInput.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxUIInput.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
            case 1967798203:
                if (str.equals("getValue")) {
                    lynxUIInput.getValue(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
