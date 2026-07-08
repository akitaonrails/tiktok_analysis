package com.ss.lyrax.augur;

import com.ss.lyrax.LyraxErrorCode;

/* JADX INFO: loaded from: classes21.dex */
public interface AugurConfigRequesterObserver {
    void onCachedConfigReceived(String str, LyraxErrorCode lyraxErrorCode, int i, int i2);

    void onRuntimeConfigReceived(String str, LyraxErrorCode lyraxErrorCode, int i, int i2);
}
