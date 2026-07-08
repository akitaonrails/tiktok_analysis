package com.ss.android.ugc.aweme.choosemusic.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class MusicConsumptionInfo {

    @C09CT("consumption_time")
    public long consumptionTime;

    @C09CT("music_id")
    public final long musicId;

    public MusicConsumptionInfo(long j, long j2) {
        this.musicId = j;
        this.consumptionTime = j2;
    }
}
