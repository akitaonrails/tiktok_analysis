package com.orbu.core.adapter;

import X.C2188811AlT;
import com.orbu.core.api.ITTKOrbuLiveAudioRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.nio.Buffer;
import java.util.Map;
import ttp.orbu.sdk.Channel;

/* JADX INFO: loaded from: classes29.dex */
public final class TTKLiveAudioRequest implements ITTKOrbuRequest<ITTKOrbuLiveAudioRequestPayload> {
    public final Buffer buffer;
    public final int channel;
    public final Map<String, String> metadata;
    public final int sampleRate;
    public final int samplesPerChannel;
    public final long timestamp;

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public String description() {
        return null;
    }

    @Override // ttp.orbu.sdk.ITTPOrbuRequest
    public ITTKOrbuLiveAudioRequestPayload payload() {
        return new ITTKOrbuLiveAudioRequestPayload() { // from class: com.orbu.core.adapter.TTKLiveAudioRequest.payload.1
            @Override // ttp.orbu.sdk.ITTPOrbuLiveAudioRequestPayload
            public Buffer buffer() {
                return TTKLiveAudioRequest.this.buffer;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuLiveAudioRequestPayload
            public int channel() {
                return TTKLiveAudioRequest.this.channel;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuLiveAudioRequestPayload
            public int sampleRate() {
                return TTKLiveAudioRequest.this.sampleRate;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuLiveAudioRequestPayload
            public int samplesPerChannel() {
                return TTKLiveAudioRequest.this.samplesPerChannel;
            }

            @Override // ttp.orbu.sdk.ITTPOrbuLiveAudioRequestPayload
            public long timestamp() {
                return TTKLiveAudioRequest.this.timestamp;
            }

            public String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(TTKLiveAudioRequest.this.buffer);
                sbLIZ.append(", ");
                sbLIZ.append(TTKLiveAudioRequest.this.samplesPerChannel);
                sbLIZ.append(", ");
                sbLIZ.append(TTKLiveAudioRequest.this.sampleRate);
                sbLIZ.append(", ");
                sbLIZ.append(TTKLiveAudioRequest.this.channel);
                sbLIZ.append(", ");
                sbLIZ.append(TTKLiveAudioRequest.this.timestamp);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Channel channel() {
        return Channel.LIVE_AUDIO;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest, ttp.orbu.sdk.ITTPOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKLiveAudioRequest(Buffer buffer, int i, int i2, int i3, long j, Map<String, String> map) {
        this.buffer = buffer;
        this.samplesPerChannel = i;
        this.sampleRate = i2;
        this.channel = i3;
        this.timestamp = j;
        this.metadata = map;
    }
}
