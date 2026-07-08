package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalRemoteAudioStats;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteAudioStats {
    public float audioLossRate;
    public int concealedSamples;
    public int concealmentEvent;
    public int decDuration;
    public int decSampleRate;
    public long e2eDelay;
    public int frozenRate;
    public int jitter;
    public int jitterBufferDelay;
    public int numChannels;
    public int playoutSampleRate;
    public int quality;
    public float receivedKBitrate;
    public int receivedSampleRate;
    public int rtt;
    public int stallCount;
    public int stallDuration;
    public int statsInterval;
    public int totalRtt;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteAudioStats{audioLossRate='");
        sbLIZ.append(this.audioLossRate);
        sbLIZ.append('\'');
        sbLIZ.append(", receivedKBitrate='");
        sbLIZ.append(this.receivedKBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", stallCount='");
        sbLIZ.append(this.stallCount);
        sbLIZ.append('\'');
        sbLIZ.append(", stallDuration='");
        sbLIZ.append(this.stallDuration);
        sbLIZ.append('\'');
        sbLIZ.append(", playoutSampleRate='");
        sbLIZ.append(this.playoutSampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", e2eDelay='");
        sbLIZ.append(this.e2eDelay);
        sbLIZ.append('\'');
        sbLIZ.append(", rtt='");
        sbLIZ.append(this.rtt);
        sbLIZ.append('\'');
        sbLIZ.append(", quality='");
        sbLIZ.append(this.quality);
        sbLIZ.append('\'');
        sbLIZ.append(", jitterBufferDelay='");
        sbLIZ.append(this.jitterBufferDelay);
        sbLIZ.append('\'');
        sbLIZ.append(", numChannels='");
        sbLIZ.append(this.numChannels);
        sbLIZ.append('\'');
        sbLIZ.append(", receivedSampleRate='");
        sbLIZ.append(this.receivedSampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", frozenRate='");
        sbLIZ.append(this.frozenRate);
        sbLIZ.append('\'');
        sbLIZ.append(", concealedSamples='");
        sbLIZ.append(this.concealedSamples);
        sbLIZ.append('\'');
        sbLIZ.append(", concealmentEvent='");
        sbLIZ.append(this.concealmentEvent);
        sbLIZ.append('\'');
        sbLIZ.append(", decSampleRate='");
        sbLIZ.append(this.decSampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", decDuration='");
        sbLIZ.append(this.decDuration);
        sbLIZ.append('\'');
        sbLIZ.append(", total_rtt='");
        sbLIZ.append(this.totalRtt);
        sbLIZ.append('\'');
        sbLIZ.append(", jitter='");
        sbLIZ.append(this.jitter);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoteAudioStats() {
    }

    public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
        this.audioLossRate = internalRemoteAudioStats.audioLossRate;
        this.receivedKBitrate = internalRemoteAudioStats.receivedKBitrate;
        this.stallCount = internalRemoteAudioStats.stallCount;
        this.stallDuration = internalRemoteAudioStats.stallDuration;
        this.e2eDelay = internalRemoteAudioStats.e2eDelay;
        this.playoutSampleRate = internalRemoteAudioStats.playoutSampleRate;
        this.statsInterval = internalRemoteAudioStats.statsInterval;
        this.rtt = internalRemoteAudioStats.rtt;
        this.totalRtt = internalRemoteAudioStats.totalRtt;
        this.quality = internalRemoteAudioStats.quality;
        this.jitterBufferDelay = internalRemoteAudioStats.jitterBufferDelay;
        this.numChannels = internalRemoteAudioStats.numChannels;
        this.receivedSampleRate = internalRemoteAudioStats.receivedSampleRate;
        this.frozenRate = internalRemoteAudioStats.frozenRate;
        this.concealedSamples = internalRemoteAudioStats.concealedSamples;
        this.concealmentEvent = internalRemoteAudioStats.concealmentEvent;
        this.decSampleRate = internalRemoteAudioStats.decSampleRate;
        this.decDuration = internalRemoteAudioStats.decDuration;
        this.jitter = internalRemoteAudioStats.jitter;
    }
}
