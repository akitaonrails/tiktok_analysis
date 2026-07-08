package com.ss.ttlivestreamer.core.engine;

/* JADX INFO: loaded from: classes21.dex */
public class AudioTrack extends MediaTrack {
    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public synchronized void release() {
        super.release();
    }

    public void setAudioProcessor(AudioProcessor audioProcessor) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public void addAudioSink(AudioSink audioSink) {
        super.addAudioSink(audioSink);
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaTrack
    public void removeAudioSink(AudioSink audioSink) {
        super.removeAudioSink(audioSink);
    }

    public AudioTrack(long j, MediaSource mediaSource) {
        super(j, mediaSource);
    }
}
