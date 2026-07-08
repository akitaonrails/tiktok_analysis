package com.ss.android.ugc.aweme.base.xelements;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUILive$$MethodInvoker implements InterfaceC1289340jem<LynxUILive> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxUILive lynxUILive, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1619762465:
                if (str.equals("enterLiveRoom")) {
                    lynxUILive.enterLiveRoom(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxUILive.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxUILive.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    lynxUILive.play(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    lynxUILive.stop(readableMap, callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    lynxUILive.pause(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxUILive.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxUILive.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxUILive.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxUILive.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxUILive.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
