package com.bytedance.ies.xelement.input;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes36.dex */
public class LynxTextAreaView$$MethodInvoker implements InterfaceC1289340jem<LynxTextAreaView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxTextAreaView lynxTextAreaView, String str, ReadableMap readableMap, Callback callback) throws Throwable {
        str.getClass();
        switch (str.hashCode()) {
            case -1904435132:
                if (str.equals("controlKeyBoard")) {
                    lynxTextAreaView.controlKeyBoard(readableMap, callback);
                    return;
                }
                break;
            case -1725570346:
                if (str.equals("getSelection")) {
                    lynxTextAreaView.getSelection(callback);
                    return;
                }
                break;
            case -1436387831:
                if (str.equals("addMention")) {
                    lynxTextAreaView.addMention(readableMap, callback);
                    return;
                }
                break;
            case -1148585618:
                if (str.equals("addText")) {
                    lynxTextAreaView.addText(readableMap, callback);
                    return;
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    lynxTextAreaView.select(callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxTextAreaView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -366821380:
                if (str.equals("resetSelectionMenu")) {
                    lynxTextAreaView.resetSelectionMenu();
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxTextAreaView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    lynxTextAreaView.blur(callback);
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxTextAreaView.focus(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxTextAreaView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxTextAreaView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 923542547:
                if (str.equals("setSelectionRange")) {
                    lynxTextAreaView.setSelectionRange(readableMap, callback);
                    return;
                }
                break;
            case 1073937649:
                if (str.equals("getTextInfo")) {
                    lynxTextAreaView.getTextInfo(callback);
                    return;
                }
                break;
            case 1194478112:
                if (str.equals("setInputFilter")) {
                    lynxTextAreaView.setInputFilter(readableMap);
                    return;
                }
                break;
            case 1212545271:
                if (str.equals("sendDelEvent")) {
                    lynxTextAreaView.sendDelEvent(readableMap, callback);
                    return;
                }
                break;
            case 1406685743:
                if (str.equals("setValue")) {
                    lynxTextAreaView.setValue(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxTextAreaView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxTextAreaView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxTextAreaView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
