package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.KaraokeSong;

/* JADX INFO: loaded from: classes.dex */
public final class KaraokeQueueMessage extends AbstractC1136060ffY {

    @C09CT("song")
    public KaraokeSong song;

    @C09CT("type")
    public int type;

    public KaraokeQueueMessage() {
        super.type = C001A.KARAOKE_QUEUE_MESSAGE;
    }
}
