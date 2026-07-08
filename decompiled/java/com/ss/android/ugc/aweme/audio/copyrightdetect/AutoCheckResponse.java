package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AutoCheckResponse {

    @C09CT("enable_auto_strip")
    public final Integer enableAutoMuteStrip;

    @C09CT("precheck_music")
    public final Integer precheck_music;
    public final Integer statusCode;

    public AutoCheckResponse(Integer num, Integer num2, Integer num3) {
        this.statusCode = num;
        this.precheck_music = num2;
        this.enableAutoMuteStrip = num3;
    }
}
