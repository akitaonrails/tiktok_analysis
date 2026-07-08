package com.ss.lyrax.stream;

import com.ss.lyrax.audio.LyraxAudioRemoteStats;
import com.ss.lyrax.net.LyraxNetworkStats;
import com.ss.lyrax.video.LyraxVideoRemoteStats;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxSubscriberStats {
    public LyraxAudioRemoteStats audioStats;
    public boolean isScreen;
    public LyraxNetworkStats networkStats;
    public int statsInterval;
    public String userId;
    public LyraxVideoRemoteStats videoStats;

    public LyraxSubscriberStats(String str, LyraxAudioRemoteStats lyraxAudioRemoteStats, LyraxVideoRemoteStats lyraxVideoRemoteStats, LyraxNetworkStats lyraxNetworkStats, boolean z, int i) {
        this.userId = str;
        this.audioStats = lyraxAudioRemoteStats;
        this.videoStats = lyraxVideoRemoteStats;
        this.networkStats = lyraxNetworkStats;
        this.statsInterval = i;
        this.isScreen = z;
    }
}
