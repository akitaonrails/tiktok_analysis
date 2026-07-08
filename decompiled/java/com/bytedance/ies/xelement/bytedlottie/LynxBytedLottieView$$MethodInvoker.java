package com.bytedance.ies.xelement.bytedlottie;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class LynxBytedLottieView$$MethodInvoker implements InterfaceC1289340jem<LynxBytedLottieView> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(LynxBytedLottieView lynxBytedLottieView, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1998037676:
                if (str.equals("isAnimating")) {
                    lynxBytedLottieView.isAnimating(readableMap, callback);
                    return;
                }
                break;
            case -1222700566:
                if (str.equals("getCurrentFrame")) {
                    lynxBytedLottieView.getCurrentFrame(readableMap, callback);
                    return;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    lynxBytedLottieView.resume(readableMap, callback);
                    return;
                }
                break;
            case -929558362:
                if (str.equals("listenAnimationUpdate")) {
                    lynxBytedLottieView.listenAnimationUpdate(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    lynxBytedLottieView.innerText(readableMap, callback);
                    return;
                }
                break;
            case -407658560:
                if (str.equals("unsubscribeUpdateEvent")) {
                    lynxBytedLottieView.unsubscribeUpdateEvent(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    lynxBytedLottieView.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    lynxBytedLottieView.play(readableMap, callback);
                    return;
                }
                break;
            case 3526264:
                if (str.equals("seek")) {
                    lynxBytedLottieView.seek(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    lynxBytedLottieView.stop(readableMap, callback);
                    return;
                }
                break;
            case 47962023:
                if (str.equals("subscribeUpdateEvent")) {
                    lynxBytedLottieView.subscribeUpdateEvent(readableMap, callback);
                    return;
                }
                break;
            case 85887754:
                if (str.equals("getDuration")) {
                    lynxBytedLottieView.getDuration(readableMap, callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    lynxBytedLottieView.pause(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    lynxBytedLottieView.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    lynxBytedLottieView.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    lynxBytedLottieView.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    lynxBytedLottieView.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    lynxBytedLottieView.scrollIntoView(readableMap);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
