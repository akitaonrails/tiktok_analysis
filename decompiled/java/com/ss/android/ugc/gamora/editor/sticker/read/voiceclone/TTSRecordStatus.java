package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSRecordStatus {

    @C09CT("required_count")
    public final Integer requiredCount;

    @C09CT("skipped_count")
    public final Integer skippedCount;

    @C09CT("succeed_count")
    public final Integer succeedCount;

    @C09CT("total_count")
    public final Integer totalCount;

    public TTSRecordStatus(Integer num, Integer num2, Integer num3, Integer num4) {
        this.requiredCount = num;
        this.succeedCount = num2;
        this.totalCount = num3;
        this.skippedCount = num4;
    }
}
