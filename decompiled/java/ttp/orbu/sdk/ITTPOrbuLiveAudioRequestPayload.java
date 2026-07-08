package ttp.orbu.sdk;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes24.dex */
public interface ITTPOrbuLiveAudioRequestPayload extends ITTPOrbuRequestPayload {
    Buffer buffer();

    int channel();

    int sampleRate();

    int samplesPerChannel();

    long timestamp();
}
