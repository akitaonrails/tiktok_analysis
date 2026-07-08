package com.bytedance.lynx.media;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes34.dex */
public class LynxVideoEngineUI$$MethodInvoker implements InterfaceC1289340jem<LynxVideoEngineUI> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxVideoEngineUI lynxVideoEngineUI, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1988613871:
                if (str.equals("releaseFocus")) {
                    lynxVideoEngineUI.releaseFocus(callback);
                    return;
                }
                break;
            case -802181223:
                if (str.equals("exitFullScreen")) {
                    lynxVideoEngineUI.exitFullScreen(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxVideoEngineUI.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxVideoEngineUI.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -318370553:
                if (str.equals("prepare")) {
                    lynxVideoEngineUI.prepare(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    lynxVideoEngineUI.play(readableMap, callback);
                    return;
                }
                break;
            case 3526264:
                if (str.equals("seek")) {
                    lynxVideoEngineUI.seek(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    lynxVideoEngineUI.stop(readableMap, callback);
                    return;
                }
                break;
            case 85887754:
                if (str.equals("getDuration")) {
                    lynxVideoEngineUI.getDuration(readableMap, callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    lynxVideoEngineUI.pause(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxVideoEngineUI.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 458133450:
                if (str.equals("requestFullScreen")) {
                    lynxVideoEngineUI.requestFullScreen(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxVideoEngineUI.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    lynxVideoEngineUI.requestFocus(callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxVideoEngineUI.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxVideoEngineUI.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxVideoEngineUI.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
