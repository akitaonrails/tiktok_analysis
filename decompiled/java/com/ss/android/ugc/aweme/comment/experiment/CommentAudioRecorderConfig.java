package com.ss.android.ugc.aweme.comment.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentAudioRecorderConfig {

    @C09CT("bit_rate")
    public final int bitRate;

    @C09CT("channel_count")
    public final int channelCount;

    @C09CT("min_voice_value")
    public final float minVoiceValue;

    @C09CT("point_rate")
    public final float pointRate;

    @C09CT("sample_rate")
    public final int sampleRate;

    public CommentAudioRecorderConfig() {
        this(44100, 64000, 2, 33.0f, 0.2f);
    }

    public CommentAudioRecorderConfig(int i, int i2, int i3, float f, float f2) {
        this.sampleRate = i;
        this.bitRate = i2;
        this.channelCount = i3;
        this.pointRate = f;
        this.minVoiceValue = f2;
    }
}
