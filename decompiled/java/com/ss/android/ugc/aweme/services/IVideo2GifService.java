package com.ss.android.ugc.aweme.services;

import X.C1464620oDU;

/* JADX INFO: loaded from: classes23.dex */
public interface IVideo2GifService {

    public interface ConvertListener {
        void onConfigured(C1464620oDU c1464620oDU);

        void onDone(boolean z);

        void onStart();

        void onUpdateProgress(int i);
    }
}
