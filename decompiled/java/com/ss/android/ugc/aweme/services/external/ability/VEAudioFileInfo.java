package com.ss.android.ugc.aweme.services.external.ability;

/* JADX INFO: loaded from: classes11.dex */
public final class VEAudioFileInfo {
    public final Integer bitRate;
    public final Integer channelSize;
    public final Integer duration;
    public final Integer sampleFormat;
    public final Integer sampleRate;

    public VEAudioFileInfo() {
        this(null, null, null, null, null);
    }

    public VEAudioFileInfo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.sampleRate = num;
        this.channelSize = num2;
        this.sampleFormat = num3;
        this.duration = num4;
        this.bitRate = num5;
    }
}
