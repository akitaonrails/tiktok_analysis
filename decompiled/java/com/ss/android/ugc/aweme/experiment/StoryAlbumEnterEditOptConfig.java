package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAlbumEnterEditOptConfig {
    public static final int $stable = 8;

    @C09CT("album_bind_prefetch_decode_bounds_enabled")
    public final boolean albumBindPrefetchDecodeBoundsEnabled;

    @C09CT("album_bind_prefetch_max_parallel_count")
    public final int albumBindPrefetchMaxParallelCount;

    @C09CT("album_bind_prefetch_ve_metadata_enabled")
    public final boolean albumBindPrefetchVeMetadataEnabled;

    @C09CT("decode_bounds_cache_enabled")
    public final boolean decodeBoundsCacheEnabled;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("mime_type_cache_enabled")
    public final boolean mimeTypeCacheEnabled;

    @C09CT("preload_ve_nle_after_album_first_frame_enabled")
    public final boolean preloadVeNleAfterAlbumFirstFrameEnabled;

    @C09CT("rules")
    public final List<StoryAlbumEnterEditRule> rules;

    @C09CT("session_cache_max_ttl_s")
    public final long sessionCacheMaxTtlSec;

    @C09CT("ve_metadata_cache_enabled")
    public final boolean veMetadataCacheEnabled;

    public StoryAlbumEnterEditOptConfig() {
        this(false, false, false, false, 0L, false, false, 0, false, null, 1023, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryAlbumEnterEditOptConfig)) {
            return false;
        }
        StoryAlbumEnterEditOptConfig storyAlbumEnterEditOptConfig = (StoryAlbumEnterEditOptConfig) obj;
        return this.enable == storyAlbumEnterEditOptConfig.enable && this.mimeTypeCacheEnabled == storyAlbumEnterEditOptConfig.mimeTypeCacheEnabled && this.decodeBoundsCacheEnabled == storyAlbumEnterEditOptConfig.decodeBoundsCacheEnabled && this.veMetadataCacheEnabled == storyAlbumEnterEditOptConfig.veMetadataCacheEnabled && this.sessionCacheMaxTtlSec == storyAlbumEnterEditOptConfig.sessionCacheMaxTtlSec && this.albumBindPrefetchDecodeBoundsEnabled == storyAlbumEnterEditOptConfig.albumBindPrefetchDecodeBoundsEnabled && this.albumBindPrefetchVeMetadataEnabled == storyAlbumEnterEditOptConfig.albumBindPrefetchVeMetadataEnabled && this.albumBindPrefetchMaxParallelCount == storyAlbumEnterEditOptConfig.albumBindPrefetchMaxParallelCount && this.preloadVeNleAfterAlbumFirstFrameEnabled == storyAlbumEnterEditOptConfig.preloadVeNleAfterAlbumFirstFrameEnabled && Intrinsics.LJFF(this.rules, storyAlbumEnterEditOptConfig.rules);
    }

    public int hashCode() {
        return (((((((((((((((((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.mimeTypeCacheEnabled)) * 31) + C786410Ut5.Z2(this.decodeBoundsCacheEnabled)) * 31) + C786410Ut5.Z2(this.veMetadataCacheEnabled)) * 31) + C786410Ut5.Y2(this.sessionCacheMaxTtlSec)) * 31) + C786410Ut5.Z2(this.albumBindPrefetchDecodeBoundsEnabled)) * 31) + C786410Ut5.Z2(this.albumBindPrefetchVeMetadataEnabled)) * 31) + this.albumBindPrefetchMaxParallelCount) * 31) + C786410Ut5.Z2(this.preloadVeNleAfterAlbumFirstFrameEnabled)) * 31) + this.rules.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryAlbumEnterEditOptConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", mimeTypeCacheEnabled=");
        sbLIZ.append(this.mimeTypeCacheEnabled);
        sbLIZ.append(", decodeBoundsCacheEnabled=");
        sbLIZ.append(this.decodeBoundsCacheEnabled);
        sbLIZ.append(", veMetadataCacheEnabled=");
        sbLIZ.append(this.veMetadataCacheEnabled);
        sbLIZ.append(", sessionCacheMaxTtlSec=");
        sbLIZ.append(this.sessionCacheMaxTtlSec);
        sbLIZ.append(", albumBindPrefetchDecodeBoundsEnabled=");
        sbLIZ.append(this.albumBindPrefetchDecodeBoundsEnabled);
        sbLIZ.append(", albumBindPrefetchVeMetadataEnabled=");
        sbLIZ.append(this.albumBindPrefetchVeMetadataEnabled);
        sbLIZ.append(", albumBindPrefetchMaxParallelCount=");
        sbLIZ.append(this.albumBindPrefetchMaxParallelCount);
        sbLIZ.append(", preloadVeNleAfterAlbumFirstFrameEnabled=");
        sbLIZ.append(this.preloadVeNleAfterAlbumFirstFrameEnabled);
        sbLIZ.append(", rules=");
        sbLIZ.append(this.rules);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryAlbumEnterEditOptConfig(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, int i, boolean z7, List<StoryAlbumEnterEditRule> list) {
        this.enable = z;
        this.mimeTypeCacheEnabled = z2;
        this.decodeBoundsCacheEnabled = z3;
        this.veMetadataCacheEnabled = z4;
        this.sessionCacheMaxTtlSec = j;
        this.albumBindPrefetchDecodeBoundsEnabled = z5;
        this.albumBindPrefetchVeMetadataEnabled = z6;
        this.albumBindPrefetchMaxParallelCount = i;
        this.preloadVeNleAfterAlbumFirstFrameEnabled = z7;
        this.rules = list;
    }

    public StoryAlbumEnterEditOptConfig(boolean z, boolean z2, boolean z3, boolean z4, long j, boolean z5, boolean z6, int i, boolean z7, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) != 0 ? 10 : i, (i2 & 256) == 0 ? z7 : false, (i2 & 512) != 0 ? C13BV.INSTANCE : list);
    }
}
