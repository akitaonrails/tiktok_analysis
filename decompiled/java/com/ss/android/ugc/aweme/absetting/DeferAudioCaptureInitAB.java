package com.ss.android.ugc.aweme.absetting;

import X.C0C64;

/* JADX INFO: loaded from: classes5.dex */
public final class DeferAudioCaptureInitAB {
    public static final boolean DISABLE = false;
    public static final boolean ENABLE = true;
    public static final DeferAudioCaptureInitAB INSTANCE = new DeferAudioCaptureInitAB();

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "defer_audio_capture_init", true, false);
    }
}
