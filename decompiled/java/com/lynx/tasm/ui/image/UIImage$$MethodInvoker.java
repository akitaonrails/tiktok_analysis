package com.lynx.tasm.ui.image;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIImage$$MethodInvoker implements InterfaceC1289340jem<UIImage> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(UIImage uIImage, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1296995794:
                if (str.equals("pauseAnimation")) {
                    uIImage.pauseAnimation(readableMap, callback);
                    return;
                }
                break;
            case -991382497:
                if (str.equals("startAnimate")) {
                    uIImage.startAnimate();
                    return;
                }
                break;
            case -893184606:
                if (str.equals("stopAnimation")) {
                    uIImage.stopAnimation(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    uIImage.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIImage.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIImage.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIImage.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1236882903:
                if (str.equals("resumeAnimation")) {
                    uIImage.resumeAnimation(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIImage.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIImage.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIImage.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
