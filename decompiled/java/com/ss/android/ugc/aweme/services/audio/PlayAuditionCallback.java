package com.ss.android.ugc.aweme.services.audio;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public interface PlayAuditionCallback {
    void oPrepare();

    void onAudioFileSuccess(int i, File file);

    void onPlay();

    void onStop();
}
