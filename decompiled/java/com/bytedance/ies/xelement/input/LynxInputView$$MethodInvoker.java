package com.bytedance.ies.xelement.input;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes36.dex */
public class LynxInputView$$MethodInvoker implements InterfaceC1289340jem<LynxInputView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxInputView lynxInputView, String str, ReadableMap readableMap, Callback callback) throws Throwable {
        str.getClass();
        switch (str.hashCode()) {
            case -1904435132:
                if (str.equals("controlKeyBoard")) {
                    lynxInputView.controlKeyBoard(readableMap, callback);
                    return;
                }
                break;
            case -1725570346:
                if (str.equals("getSelection")) {
                    lynxInputView.getSelection(callback);
                    return;
                }
                break;
            case -1148585618:
                if (str.equals("addText")) {
                    lynxInputView.addText(readableMap, callback);
                    return;
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    lynxInputView.select(callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxInputView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxInputView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    lynxInputView.blur(callback);
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxInputView.focus(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxInputView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxInputView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxInputView.setSelectionRange(readableMap, callback);
                    return;
                }
                break;
            case 1194478112:
                if (str.equals("setInputFilter")) {
                    lynxInputView.setInputFilter(readableMap);
                    return;
                }
                break;
            case 1212545271:
                if (str.equals("sendDelEvent")) {
                    lynxInputView.sendDelEvent(readableMap, callback);
                    return;
                }
                break;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxInputView.setValue(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxInputView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxInputView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxInputView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
