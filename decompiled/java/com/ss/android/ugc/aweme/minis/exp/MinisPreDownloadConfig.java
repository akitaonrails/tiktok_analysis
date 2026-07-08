package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPreDownloadConfig implements Serializable {

    @C09CT("client_key_block_list")
    public final List<String> clientKeyBlockList;

    @C09CT("download_on_wifi_only")
    public final boolean downloadOnWifiOnly;

    @C09CT("max_download_concurrency_count")
    public final int maxDownloadConcurrencyCount;

    @C09CT("max_download_task_count")
    public final int maxDownloadTaskCount;

    @C09CT("mimetype_white_list")
    public final List<String> mimeTypeWhiteList;

    @C09CT("min_pre_download_storage_level")
    public final int minPreDownloadStorage;

    @C09CT("same_app_download_interval")
    public final long sameAppDownloadInterval;

    public MinisPreDownloadConfig() {
        this(0, 0, null, null, 0L, 0, false, 127, null);
    }

    public MinisPreDownloadConfig(int i, int i2, List<String> list, List<String> list2, long j, int i3, boolean z) {
        this.maxDownloadConcurrencyCount = i;
        this.maxDownloadTaskCount = i2;
        this.mimeTypeWhiteList = list;
        this.clientKeyBlockList = list2;
        this.sameAppDownloadInterval = j;
        this.minPreDownloadStorage = i3;
        this.downloadOnWifiOnly = z;
    }

    public MinisPreDownloadConfig(int i, int i2, List list, List list2, long j, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 3 : i, (i4 & 2) != 0 ? 20 : i2, (i4 & 4) != 0 ? C1697810uHb.LJIIJJI("html", "htm", "css", "js", "mjs", "webmanifest", "wasm") : list, (i4 & 8) != 0 ? C13BV.INSTANCE : list2, (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? 2600 : i3, (i4 & 64) != 0 ? false : z);
    }
}
