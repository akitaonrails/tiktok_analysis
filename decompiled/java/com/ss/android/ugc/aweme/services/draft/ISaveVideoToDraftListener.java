package com.ss.android.ugc.aweme.services.draft;

/* JADX INFO: loaded from: classes9.dex */
public interface ISaveVideoToDraftListener {
    void onFailed(Exception exc);

    void onSuccess();

    public static final class DefaultImpls {
        public static /* synthetic */ void onFailed$default(ISaveVideoToDraftListener iSaveVideoToDraftListener, Exception exc, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    exc = null;
                }
                iSaveVideoToDraftListener.onFailed(exc);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFailed");
        }
    }
}
