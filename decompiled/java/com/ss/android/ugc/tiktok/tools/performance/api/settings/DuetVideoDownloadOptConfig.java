package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes22.dex */
public final class DuetVideoDownloadOptConfig {

    @C09CT("download_net_level")
    public int downloadNetLevel;

    @C09CT("feed_cache_ratio_threshold")
    public float feedCacheRatioThreshold;

    @C09CT("load_aigc_info_in_record")
    public boolean loadAigcInfoInRecord;

    @C09CT("max_video_length")
    public long maxVideoLength;

    @C09CT("permission_check_cache_duration")
    public long permissionCheckCacheDuration;

    @C09CT("reuse_aweme_size")
    public boolean reuseAwemeSize;

    @C09CT("reuse_local_path")
    public boolean reuseLocalPath;

    @C09CT("reuse_mdl_cache")
    public boolean reuseMdlCache;

    @C09CT("show_loading_net_level")
    public int showLoadingNetLevel;

    @C09CT("show_loading_progress_level")
    public int showLoadingProgressLevel;

    @C09CT("show_record_loading")
    public boolean showRecordLoading;

    @C09CT("skip_portrait_layout_preload")
    public boolean skipPortraitLayoutPreload;

    public DuetVideoDownloadOptConfig() {
        this(false, false, false, 0L, false, -1, true, 6, 50, 600000L, true, 0.5f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetVideoDownloadOptConfig)) {
            return false;
        }
        DuetVideoDownloadOptConfig duetVideoDownloadOptConfig = (DuetVideoDownloadOptConfig) obj;
        return this.reuseAwemeSize == duetVideoDownloadOptConfig.reuseAwemeSize && this.reuseLocalPath == duetVideoDownloadOptConfig.reuseLocalPath && this.loadAigcInfoInRecord == duetVideoDownloadOptConfig.loadAigcInfoInRecord && this.permissionCheckCacheDuration == duetVideoDownloadOptConfig.permissionCheckCacheDuration && this.skipPortraitLayoutPreload == duetVideoDownloadOptConfig.skipPortraitLayoutPreload && this.downloadNetLevel == duetVideoDownloadOptConfig.downloadNetLevel && this.showRecordLoading == duetVideoDownloadOptConfig.showRecordLoading && this.showLoadingNetLevel == duetVideoDownloadOptConfig.showLoadingNetLevel && this.showLoadingProgressLevel == duetVideoDownloadOptConfig.showLoadingProgressLevel && this.maxVideoLength == duetVideoDownloadOptConfig.maxVideoLength && this.reuseMdlCache == duetVideoDownloadOptConfig.reuseMdlCache && Float.compare(this.feedCacheRatioThreshold, duetVideoDownloadOptConfig.feedCacheRatioThreshold) == 0;
    }

    public final String toString() {
        return "DuetVideoDownloadOptConfig(reuseAwemeSize=" + this.reuseAwemeSize + ", reuseLocalPath=" + this.reuseLocalPath + ", loadAigcInfoInRecord=" + this.loadAigcInfoInRecord + ", permissionCheckCacheDuration=" + this.permissionCheckCacheDuration + ", skipPortraitLayoutPreload=" + this.skipPortraitLayoutPreload + ", downloadNetLevel=" + this.downloadNetLevel + ", showRecordLoading=" + this.showRecordLoading + ", showLoadingNetLevel=" + this.showLoadingNetLevel + ", showLoadingProgressLevel=" + this.showLoadingProgressLevel + ", maxVideoLength=" + this.maxVideoLength + ", reuseMdlCache=" + this.reuseMdlCache + ", feedCacheRatioThreshold=" + this.feedCacheRatioThreshold + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((((C786410Ut5.Z2(this.reuseAwemeSize) * 31) + C786410Ut5.Z2(this.reuseLocalPath)) * 31) + C786410Ut5.Z2(this.loadAigcInfoInRecord)) * 31) + C786410Ut5.Y2(this.permissionCheckCacheDuration)) * 31) + C786410Ut5.Z2(this.skipPortraitLayoutPreload)) * 31) + this.downloadNetLevel) * 31) + C786410Ut5.Z2(this.showRecordLoading)) * 31) + this.showLoadingNetLevel) * 31) + this.showLoadingProgressLevel) * 31) + C786410Ut5.Y2(this.maxVideoLength)) * 31) + C786410Ut5.Z2(this.reuseMdlCache)) * 31) + Float.floatToIntBits(this.feedCacheRatioThreshold);
    }

    public DuetVideoDownloadOptConfig(boolean z, boolean z2, boolean z3, long j, boolean z4, int i, boolean z5, int i2, int i3, long j2, boolean z6, float f) {
        this.reuseAwemeSize = z;
        this.reuseLocalPath = z2;
        this.loadAigcInfoInRecord = z3;
        this.permissionCheckCacheDuration = j;
        this.skipPortraitLayoutPreload = z4;
        this.downloadNetLevel = i;
        this.showRecordLoading = z5;
        this.showLoadingNetLevel = i2;
        this.showLoadingProgressLevel = i3;
        this.maxVideoLength = j2;
        this.reuseMdlCache = z6;
        this.feedCacheRatioThreshold = f;
    }
}
