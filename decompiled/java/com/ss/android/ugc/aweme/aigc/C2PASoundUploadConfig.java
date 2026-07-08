package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes31.dex */
public final class C2PASoundUploadConfig {

    @C09CT("extract_video_sound_time_out")
    public final long extractVideoSoundTimeOut;

    @C09CT("local_sound_batch_time_out")
    public final long localSoundBatchTimeOut;

    @C09CT("local_sound_single_time_out")
    public final long localSoundSingleTimeOut;

    public C2PASoundUploadConfig() {
        this(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 10000L);
    }

    public C2PASoundUploadConfig(long j, long j2, long j3) {
        this.extractVideoSoundTimeOut = j;
        this.localSoundSingleTimeOut = j2;
        this.localSoundBatchTimeOut = j3;
    }
}
