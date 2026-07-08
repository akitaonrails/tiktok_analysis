package com.bytedance.android.livesdk.rank.api.model;

import X.C09CT;
import com.bytedance.android.livesdk.rank.model.RankGiftMeta;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class RankGuardianInfo {

    @C09CT("current_guardian_user")
    public RankUser currentGuardianUser;

    @C09CT("guardian_end_timestamp")
    public long guardianEndTimestamp;

    @C09CT("guardian_gift_meta")
    public RankGiftMeta guardianGiftMeta;

    @C09CT("need_send_gift_count_become_first")
    public long needSendGiftCountBecomeFirst;

    @C09CT("period_settle_timestamp")
    public long periodSettleTimestamp;
}
