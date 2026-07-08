package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.ReqSong;

/* JADX INFO: loaded from: classes.dex */
public final class KaraokeYouSingReqMessage extends AbstractC1136060ffY {

    @C09CT("req_timestamp_seconds")
    public long reqTimestampSeconds;

    @C09CT("song_list")
    public List<ReqSong> songList;

    @C09CT("total_req_count")
    public long totalReqCount;

    @C09CT("type")
    public int type;

    public KaraokeYouSingReqMessage() {
        super.type = C001A.KARAOKE_YOU_SING_REQ_MESSAGE;
        this.songList = new ArrayList();
    }
}
