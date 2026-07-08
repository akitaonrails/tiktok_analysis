package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class KaraokeQueueListMessage extends AbstractC1136060ffY {

    @C09CT("latest_update_time")
    public long latestUpdateTime;

    @C09CT("operator")
    public long operator;

    @C09CT("song_list")
    public List<KaraokeSong> songList;

    @C09CT("total_queue_count")
    public long totalQueueCount;

    @C09CT("type")
    public int type;

    public KaraokeQueueListMessage() {
        super.type = C001A.KARAOKE_QUEUE_LIST_MESSAGE;
        this.songList = new ArrayList();
    }
}
