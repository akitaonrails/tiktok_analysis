package com.ss.android.ugc.gamora.editor.audio.copyrightdetect.longvideo;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class CheckInfringementResponse {
    public static final int $stable = 0;

    @C09CT("is_infringement")
    public final Boolean isInfringement;

    public final Boolean isInfringement() {
        return this.isInfringement;
    }

    public CheckInfringementResponse(Boolean bool) {
        this.isInfringement = bool;
    }
}
