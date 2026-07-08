package com.bytedance.android.livesdk.sei;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchGameSeiInfo {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("create_time")
    public long createTime;

    @C09CT("linkmic_id")
    public String linkMicId;

    @C09CT("score")
    public long score;

    public MatchGameSeiInfo() {
        this("", 0L, 0L, 0L);
    }

    public MatchGameSeiInfo(String str, long j, long j2, long j3) {
        this.linkMicId = str;
        this.battleId = j;
        this.score = j2;
        this.createTime = j3;
    }
}
