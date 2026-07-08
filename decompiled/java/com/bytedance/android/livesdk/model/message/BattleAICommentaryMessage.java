package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleAICommentaryMessage extends AbstractC1136060ffY {

    @C09CT("audio_stream")
    public byte[] audioStream;

    @C09CT("battle_meta")
    public BattleMeta battleMeta;

    @C09CT("commentary_id")
    public long commentaryId;

    @C09CT("commentary_meta")
    public AudioMeta commentaryMeta;

    @C09CT("extra")
    public String extra;

    @C09CT("is_share_perf_on")
    public boolean isSharePerfOn;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("timestamp_expire")
    public long timestampExpire;

    @C09CT("timestamp_origin")
    public long timestampOrigin;

    public BattleAICommentaryMessage() {
        this.type = C001A.BATTLE_A_I_COMMENTARY_MESSAGE;
        this.subtitle = "";
        this.extra = "";
    }
}
