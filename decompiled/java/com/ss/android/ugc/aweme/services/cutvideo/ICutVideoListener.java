package com.ss.android.ugc.aweme.services.cutvideo;

/* JADX INFO: loaded from: classes.dex */
public interface ICutVideoListener {
    void onCompileDone();

    void onCompileError(int i, int i2, float f, String str);

    void onCompileProgress(float f);

    void onStart();
}
