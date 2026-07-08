package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class MixStatisStruct implements Serializable {

    @C09CT("collect_vv")
    public long collectVV;

    @C09CT("current_episode")
    public long currentEpisode;

    @C09CT("has_updated_episode")
    public long hasUpdatedEpisode;

    @C09CT("last_read_episode")
    public long lastReadEpisode;

    @C09CT("total")
    public int total;

    @C09CT("total_play_count")
    public long totalPlayCount;

    @C09CT("updated_to_episode")
    public long updatedToEpisode;

    public final long getCollectVV() {
        return this.collectVV;
    }

    public final long getCurrentEpisode() {
        return this.currentEpisode;
    }

    public final long getHasUpdatedEpisode() {
        return this.hasUpdatedEpisode;
    }

    public final long getLastReadEpisode() {
        return this.lastReadEpisode;
    }

    public final int getTotal() {
        return this.total;
    }

    public final long getTotalPlayCount() {
        return this.totalPlayCount;
    }

    public final long getUpdatedToEpisode() {
        return this.updatedToEpisode;
    }

    public final void setCollectVV(long j) {
        this.collectVV = j;
    }

    public final void setCurrentEpisode(long j) {
        this.currentEpisode = j;
    }

    public final void setHasUpdatedEpisode(long j) {
        this.hasUpdatedEpisode = j;
    }

    public final void setLastReadEpisode(long j) {
        this.lastReadEpisode = j;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public final void setTotalPlayCount(long j) {
        this.totalPlayCount = j;
    }

    public final void setUpdatedToEpisode(long j) {
        this.updatedToEpisode = j;
    }
}
