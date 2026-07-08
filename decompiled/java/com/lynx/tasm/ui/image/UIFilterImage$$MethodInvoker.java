package com.lynx.tasm.ui.image;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class UIFilterImage$$MethodInvoker implements InterfaceC1289340jem<UIFilterImage> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(UIFilterImage uIFilterImage, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1296995794:
                if (str.equals("pauseAnimation")) {
                    uIFilterImage.pauseAnimation(readableMap, callback);
                    return;
                }
                break;
            case -991382497:
                if (str.equals("startAnimate")) {
                    uIFilterImage.startAnimate();
                    return;
                }
                break;
            case -893184606:
                if (str.equals("stopAnimation")) {
                    uIFilterImage.stopAnimation(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    uIFilterImage.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    uIFilterImage.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    uIFilterImage.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    uIFilterImage.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 1236882903:
                if (str.equals("resumeAnimation")) {
                    uIFilterImage.resumeAnimation(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    uIFilterImage.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    uIFilterImage.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    uIFilterImage.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
