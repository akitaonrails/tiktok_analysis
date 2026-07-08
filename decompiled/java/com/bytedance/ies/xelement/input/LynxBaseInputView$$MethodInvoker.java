package com.bytedance.ies.xelement.input;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes36.dex */
public class LynxBaseInputView$$MethodInvoker implements InterfaceC1289340jem<LynxBaseInputView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxBaseInputView lynxBaseInputView, String str, ReadableMap readableMap, Callback callback) throws Throwable {
        str.getClass();
        switch (str.hashCode()) {
            case -1904435132:
                if (str.equals("controlKeyBoard")) {
                    lynxBaseInputView.controlKeyBoard(readableMap, callback);
                    return;
                }
                break;
            case -1725570346:
                if (str.equals("getSelection")) {
                    lynxBaseInputView.getSelection(callback);
                    return;
                }
                break;
            case -1148585618:
                if (str.equals("addText")) {
                    lynxBaseInputView.addText(readableMap, callback);
                    return;
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    lynxBaseInputView.select(callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxBaseInputView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxBaseInputView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    lynxBaseInputView.blur(callback);
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxBaseInputView.focus(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxBaseInputView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxBaseInputView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxBaseInputView.setSelectionRange(readableMap, callback);
                    return;
                }
                break;
            case 1194478112:
                if (str.equals("setInputFilter")) {
                    lynxBaseInputView.setInputFilter(readableMap);
                    return;
                }
                break;
            case 1212545271:
                if (str.equals("sendDelEvent")) {
                    lynxBaseInputView.sendDelEvent(readableMap, callback);
                    return;
                }
                break;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxBaseInputView.setValue(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxBaseInputView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxBaseInputView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxBaseInputView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
