package com.bytedance.xelement.markdown;

import X.InterfaceC1289340jem;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes21.dex */
public class MarkdownUI$$MethodInvoker implements InterfaceC1289340jem<MarkdownUI> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1289340jem
    public void invoke(MarkdownUI markdownUI, String str, ReadableMap readableMap, Callback callback) {
        str.getClass();
        switch (str.hashCode()) {
            case -1585986401:
                if (str.equals("clearStatus")) {
                    markdownUI.clearStatus(readableMap, callback);
                    return;
                }
                break;
            case -1360985222:
                if (str.equals("getParseResult")) {
                    markdownUI.getParseResult(readableMap, callback);
                    return;
                }
                break;
            case -1296995794:
                if (str.equals("pauseAnimation")) {
                    markdownUI.pauseAnimation(readableMap, callback);
                    return;
                }
                break;
            case -527962973:
                if (str.equals("innerText")) {
                    markdownUI.innerText(readableMap, callback);
                    return;
                }
                break;
            case -357431021:
                if (str.equals("boundingClientRect")) {
                    markdownUI.boundingClientRect(readableMap, callback);
                    return;
                }
                break;
            case -127960866:
                if (str.equals("getSelectedText")) {
                    markdownUI.getSelectedText(readableMap, callback);
                    return;
                }
                break;
            case -95358563:
                if (str.equals("setTextSelection")) {
                    markdownUI.setTextSelection(readableMap, callback);
                    return;
                }
                break;
            case 194959693:
                if (str.equals("takeScreenshot")) {
                    markdownUI.takeScreenshot(readableMap, callback);
                    return;
                }
                break;
            case 510764398:
                if (str.equals("getImages")) {
                    markdownUI.getImages(readableMap, callback);
                    return;
                }
                break;
            case 692239790:
                if (str.equals("fetchAccessibilityTargets")) {
                    markdownUI.fetchAccessibilityTargets(readableMap, callback);
                    return;
                }
                break;
            case 850462443:
                if (str.equals("getTextBoundingRect")) {
                    markdownUI.getTextBoundingRect(readableMap, callback);
                    return;
                }
                break;
            case 1236882903:
                if (str.equals("resumeAnimation")) {
                    markdownUI.resumeAnimation(readableMap, callback);
                    return;
                }
                break;
            case 1419773105:
                if (str.equals("requestUIInfo")) {
                    markdownUI.requestUIInfo(readableMap, callback);
                    return;
                }
                break;
            case 1848904985:
                if (str.equals("requestAccessibilityFocus")) {
                    markdownUI.requestAccessibilityFocus(readableMap, callback);
                    return;
                }
                break;
            case 1868674099:
                if (str.equals("getCharIndexByPoint")) {
                    markdownUI.getCharIndexByPoint(readableMap, callback);
                    return;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    markdownUI.scrollIntoView(readableMap, callback);
                    return;
                }
                break;
            case 1988390979:
                if (str.equals("getContent")) {
                    markdownUI.getContent(readableMap, callback);
                    return;
                }
                break;
        }
        callback.invoke(3);
    }
}
