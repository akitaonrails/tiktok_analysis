package com.bytedance.ies.xelement.audiott;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes34.dex */
public class LynxAudioTTView$$MethodInvoker implements InterfaceC1289340jem<LynxAudioTTView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxAudioTTView lynxAudioTTView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1988613871:
                if (str.equals("releaseFocus")) {
                    lynxAudioTTView.releaseFocus(callback);
                    return;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    lynxAudioTTView.resume(callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxAudioTTView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxAudioTTView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -318370553:
                if (str.equals("prepare")) {
                    lynxAudioTTView.prepare(callback);
                    return;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    lynxAudioTTView.mute(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    lynxAudioTTView.play(callback);
                    return;
                }
                break;
            case 3526264:
                if (str.equals("seek")) {
                    lynxAudioTTView.seek(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    lynxAudioTTView.stop(callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    lynxAudioTTView.pause(callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxAudioTTView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 670514716:
                if (str.equals("setVolume")) {
                    lynxAudioTTView.setVolume(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxAudioTTView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    lynxAudioTTView.requestFocus(callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxAudioTTView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxAudioTTView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxAudioTTView.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
            case 2095520559:
                if (str.equals("playerInfo")) {
                    lynxAudioTTView.playerInfo(callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
