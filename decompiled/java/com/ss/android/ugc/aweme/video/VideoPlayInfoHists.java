package com.ss.android.ugc.aweme.video;

import com.ss.android.ugc.playerkit.session.Session;

/* JADX INFO: loaded from: classes24.dex */
public class VideoPlayInfoHists {
    public String source_id;
    public int internet_speed = -1;
    public int cache_size = -1;
    public int video_bitrate = -1;
    public int block_cnt = -1;
    public int block_time = -1;
    public int play_time = -1;
    public float play_bitrate = -1.0f;

    public static VideoPlayInfoHists convert(Session session) {
        VideoPlayInfoHists videoPlayInfoHists = new VideoPlayInfoHists();
        videoPlayInfoHists.internet_speed = (int) session.speed;
        videoPlayInfoHists.cache_size = session.cacheSize;
        videoPlayInfoHists.video_bitrate = session.bitrate;
        videoPlayInfoHists.block_cnt = session.blockCnt;
        videoPlayInfoHists.block_time = session.blockTime;
        videoPlayInfoHists.play_time = session.playTime;
        videoPlayInfoHists.play_bitrate = session.playBitrate;
        return videoPlayInfoHists;
    }
}
