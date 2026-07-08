package com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveReplayCreatePlaylistData implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_publish_record")
    public Boolean hasPublishRecord;

    public LiveReplayCreatePlaylistData() {
        this(Boolean.FALSE);
    }

    public LiveReplayCreatePlaylistData(Boolean bool) {
        this.hasPublishRecord = bool;
    }

    public final void setHasPublishRecord(Boolean bool) {
        this.hasPublishRecord = bool;
    }
}
