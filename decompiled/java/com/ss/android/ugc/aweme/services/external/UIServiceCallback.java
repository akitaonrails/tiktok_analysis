package com.ss.android.ugc.aweme.services.external;

/* JADX INFO: loaded from: classes9.dex */
public interface UIServiceCallback {

    public static final class DefaultImpls {
        public static boolean checkIsCanceled(UIServiceCallback uIServiceCallback) {
            return false;
        }
    }

    boolean checkIsCanceled();

    void postFail();

    void postSuccess();

    void preFail(int i);

    void preSuccess();
}
