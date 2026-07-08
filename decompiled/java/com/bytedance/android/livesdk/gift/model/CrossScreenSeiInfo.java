package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class CrossScreenSeiInfo {

    @C09CT("cross_screen_order_id")
    public final long crossScreenId;

    @C09CT("duration")
    public final long duration;

    @C09CT("gift_id")
    public final long giftId;

    @C09CT("gift_sender_uid")
    public final long giftSenderUid;

    @C09CT("price")
    public final int price;

    @C09CT("reaction_effect_ids")
    public final Map<Long, Integer> reactionEffectIds;

    @C09CT("repeat_count")
    public final int repeatCount;

    @C09CT("sei_write_timestamp")
    public final long seiWriteTimestamp;

    @C09CT("team_id")
    public final long teamId;

    public CrossScreenSeiInfo() {
        this(0L, 0L, 0, 0L, C2097608Jq.LJ(), 0L, 1, 0L, 0L);
    }

    public CrossScreenSeiInfo(long j, long j2, int i, long j3, Map<Long, Integer> map, long j4, int i2, long j5, long j6) {
        this.crossScreenId = j;
        this.giftId = j2;
        this.price = i;
        this.duration = j3;
        this.reactionEffectIds = map;
        this.teamId = j4;
        this.repeatCount = i2;
        this.giftSenderUid = j5;
        this.seiWriteTimestamp = j6;
    }
}
