package com.ss.android.ugc.aweme.music.model;

/* JADX INFO: loaded from: classes10.dex */
public final class DspLinkStateKt {
    public static final DspLinkState getLinkState(DspPlatform dspPlatform) {
        if (dspPlatform != DspPlatform.UNKNOWN) {
            return DspLinkState.LINKED;
        }
        return DspLinkState.UNLINKED;
    }
}
