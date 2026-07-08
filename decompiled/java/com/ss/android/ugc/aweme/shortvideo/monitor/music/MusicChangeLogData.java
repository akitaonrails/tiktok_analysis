package com.ss.android.ugc.aweme.shortvideo.monitor.music;

import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class MusicChangeLogData {
    public final String current_scene;
    public final MusicDetailLog music_detail;
    public final List<NleDetail> nle_details;
    public final TrackDetails track_details;

    public MusicChangeLogData(String str, MusicDetailLog musicDetailLog, List<NleDetail> list, TrackDetails trackDetails) {
        this.current_scene = str;
        this.music_detail = musicDetailLog;
        this.nle_details = list;
        this.track_details = trackDetails;
    }
}
