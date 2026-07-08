package com.bytedance.ies.xelement;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public class LynxAudio$$MethodInvoker implements InterfaceC1289340jem<LynxAudio> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxAudio lynxAudio, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    lynxAudio.duration(callback);
                    return;
                }
                break;
            case -892481550:
                if (str.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                    lynxAudio.status(callback);
                    return;
                }
                break;
            case -679066215:
                if (str.equals("playBitrate")) {
                    lynxAudio.playBitrate(callback);
                    return;
                }
                break;
            case -553589393:
                if (str.equals("cacheTime")) {
                    lynxAudio.cacheTime(callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxAudio.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxAudio.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    lynxAudio.play(callback);
                    return;
                }
                break;
            case 3526264:
                if (str.equals("seek")) {
                    lynxAudio.seek(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    lynxAudio.stop(callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    lynxAudio.pause(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxAudio.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 601235430:
                if (str.equals("currentTime")) {
                    lynxAudio.currentTime(callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxAudio.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxAudio.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1457763334:
                if (str.equals("currentSrcID")) {
                    lynxAudio.currentSrcID(callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxAudio.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxAudio.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
