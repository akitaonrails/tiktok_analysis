package com.bytedance.ies.xelement.alphavideo;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxAlphaVideo$$MethodInvoker implements InterfaceC1289340jem<LynxAlphaVideo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxAlphaVideo lynxAlphaVideo, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1073342556:
                if (str.equals("isPlaying")) {
                    lynxAlphaVideo.isPlaying(readableMap, callback);
                    return;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    lynxAlphaVideo.resume(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxAlphaVideo.innerText(readableMap, callback);
                    return;
                }
                break;
            case -407658560:
                if (str.equals("unsubscribeUpdateEvent")) {
                    lynxAlphaVideo.unsubscribeUpdateEvent(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxAlphaVideo.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    lynxAlphaVideo.play(readableMap, callback);
                    return;
                }
                break;
            case 3526264:
                if (str.equals("seek")) {
                    lynxAlphaVideo.seek(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    lynxAlphaVideo.stop(readableMap, callback);
                    return;
                }
                break;
            case 47962023:
                if (str.equals("subscribeUpdateEvent")) {
                    lynxAlphaVideo.subscribeUpdateEvent(readableMap, callback);
                    return;
                }
                break;
            case 85887754:
                if (str.equals("getDuration")) {
                    lynxAlphaVideo.getDuration(readableMap, callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    lynxAlphaVideo.pause(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxAlphaVideo.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxAlphaVideo.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1090594823:
                if (str.equals("release")) {
                    lynxAlphaVideo.release(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxAlphaVideo.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxAlphaVideo.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxAlphaVideo.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
