package com.lynx.animax;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIAnimaX$$MethodInvoker implements InterfaceC1289340jem<UIAnimaX> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(UIAnimaX uIAnimaX, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1998037676:
                if (str.equals("isAnimating")) {
                    uIAnimaX.isAnimating(readableMap, callback);
                    return;
                }
                break;
            case -1222700566:
                if (str.equals("getCurrentFrame")) {
                    uIAnimaX.getCurrentFrame(readableMap, callback);
                    return;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    uIAnimaX.resume(readableMap, callback);
                    return;
                }
                break;
            case -929558362:
                if (str.equals("listenAnimationUpdate")) {
                    uIAnimaX.listenAnimationUpdate(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    uIAnimaX.innerText(readableMap, callback);
                    return;
                }
                break;
            case -407658560:
                if (str.equals("unsubscribeUpdateEvent")) {
                    uIAnimaX.unsubscribeUpdateEvent(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIAnimaX.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    uIAnimaX.play(readableMap, callback);
                    return;
                }
                break;
            case 3526264:
                if (str.equals("seek")) {
                    uIAnimaX.seek(readableMap, callback);
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    uIAnimaX.stop(readableMap, callback);
                    return;
                }
                break;
            case 47962023:
                if (str.equals("subscribeUpdateEvent")) {
                    uIAnimaX.subscribeUpdateEvent(readableMap, callback);
                    return;
                }
                break;
            case 85887754:
                if (str.equals("getDuration")) {
                    uIAnimaX.getDuration(readableMap, callback);
                    return;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    uIAnimaX.pause(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIAnimaX.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 247486643:
                if (str.equals("unsubscribeUpdateEvents")) {
                    uIAnimaX.unsubscribeUpdateEvents(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIAnimaX.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1396926815:
                if (str.equals("playSegment")) {
                    uIAnimaX.playSegment(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIAnimaX.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1486822828:
                if (str.equals("subscribeUpdateEvents")) {
                    uIAnimaX.subscribeUpdateEvents(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIAnimaX.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIAnimaX.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
