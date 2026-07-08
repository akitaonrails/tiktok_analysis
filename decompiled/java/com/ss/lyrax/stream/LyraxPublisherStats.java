package com.ss.lyrax.stream;

import X.C2188811AlT;
import com.ss.lyrax.audio.LyraxAudioLocalStats;
import com.ss.lyrax.net.LyraxNetworkStats;
import com.ss.lyrax.video.LyraxVideoLocalStats;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherStats {
    public LyraxAudioLocalStats audioStats;
    public boolean isScreen;
    public LyraxNetworkStats networkStats;
    public int statsInterval;
    public LyraxVideoLocalStats videoStats;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxPublisherStats{audioStats=");
        sbLIZ.append(this.audioStats);
        sbLIZ.append(", videoStats=");
        sbLIZ.append(this.videoStats);
        sbLIZ.append(", isScreen=");
        sbLIZ.append(this.isScreen);
        sbLIZ.append(", networkStats=");
        sbLIZ.append(this.networkStats);
        sbLIZ.append(", statsInterval=");
        sbLIZ.append(this.statsInterval);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxPublisherStats() {
    }

    public LyraxPublisherStats(LyraxAudioLocalStats lyraxAudioLocalStats, LyraxVideoLocalStats lyraxVideoLocalStats, LyraxNetworkStats lyraxNetworkStats, boolean z, int i) {
        this.audioStats = lyraxAudioLocalStats;
        this.videoStats = lyraxVideoLocalStats;
        this.networkStats = lyraxNetworkStats;
        this.isScreen = z;
        this.statsInterval = i;
    }
}
