package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TeamRankProgress {

    @C09CT("add_score")
    public int addScore;

    @C09CT("contributed_score")
    public int contributedScore;

    @C09CT("current_number")
    public int currentNumber;

    @C09CT("gift_ids")
    public List<Long> giftIds = new ArrayList();

    @C09CT("target_number")
    public int targetNumber;

    @C09CT("timestamp")
    public long timestamp;
}
