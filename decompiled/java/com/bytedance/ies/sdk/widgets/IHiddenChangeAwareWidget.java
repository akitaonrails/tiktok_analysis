package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes8.dex */
public interface IHiddenChangeAwareWidget {

    public static final class DefaultImpls {
        public static void onHide(IHiddenChangeAwareWidget iHiddenChangeAwareWidget) {
        }

        public static void onShow(IHiddenChangeAwareWidget iHiddenChangeAwareWidget) {
        }
    }

    void onHide();

    void onShow();
}
