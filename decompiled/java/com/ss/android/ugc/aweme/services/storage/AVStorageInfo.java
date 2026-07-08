package com.ss.android.ugc.aweme.services.storage;

/* JADX INFO: loaded from: classes31.dex */
public final class AVStorageInfo {
    public long creativeCacheSize;
    public long creativeDraftSize;
    public long creativePersistentSize;
    public long creativePublicSize;
    public long cutSameSize;
    public long effectModelSize;
    public long effectSize;
    public long filterSize;
    public long fontSize;
    public long musicSize;
    public long mvSize;

    public String toString() {
        return "AVStorageInfo(effectSize=" + this.effectSize + ", filterSize=" + this.filterSize + ", mvSize=" + this.mvSize + ", musicSize=" + this.musicSize + ", effectModelSize=" + this.effectModelSize + ", fontSize=" + this.fontSize + ", cutSameSize=" + this.cutSameSize + ", creativeDraftSize=" + this.creativeDraftSize + ", creativePublicSize=" + this.creativePublicSize + ", creativePersistentSize=" + this.creativePersistentSize + ", creativeCacheSize=" + this.creativeCacheSize + ')';
    }

    public AVStorageInfo() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
    }

    public final void setCreativeCacheSize(long j) {
        this.creativeCacheSize = j;
    }

    public final void setCreativeDraftSize(long j) {
        this.creativeDraftSize = j;
    }

    public final void setCreativePersistentSize(long j) {
        this.creativePersistentSize = j;
    }

    public final void setCreativePublicSize(long j) {
        this.creativePublicSize = j;
    }

    public final void setCutSameSize(long j) {
        this.cutSameSize = j;
    }

    public final void setEffectModelSize(long j) {
        this.effectModelSize = j;
    }

    public final void setEffectSize(long j) {
        this.effectSize = j;
    }

    public final void setFilterSize(long j) {
        this.filterSize = j;
    }

    public final void setFontSize(long j) {
        this.fontSize = j;
    }

    public final void setMusicSize(long j) {
        this.musicSize = j;
    }

    public final void setMvSize(long j) {
        this.mvSize = j;
    }

    public AVStorageInfo(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.effectSize = j;
        this.filterSize = j2;
        this.mvSize = j3;
        this.musicSize = j4;
        this.effectModelSize = j5;
        this.fontSize = j6;
        this.cutSameSize = j7;
        this.creativeDraftSize = j8;
        this.creativePublicSize = j9;
        this.creativePersistentSize = j10;
        this.creativeCacheSize = j11;
    }
}
