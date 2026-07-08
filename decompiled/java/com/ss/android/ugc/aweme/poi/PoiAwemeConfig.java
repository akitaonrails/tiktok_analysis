package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiAwemeConfig implements Serializable {

    @C09CT("end_ms")
    public final Long endMs;

    @C09CT("start_frame")
    public final UrlModel startFrame;

    @C09CT("start_ms")
    public final Long startMs;

    @C09CT("video_image_index")
    public final Integer videoImageIndex;

    public PoiAwemeConfig() {
        this(null, null, null, null);
    }

    public PoiAwemeConfig(UrlModel urlModel, Long l, Long l2, Integer num) {
        this.startFrame = urlModel;
        this.startMs = l;
        this.endMs = l2;
        this.videoImageIndex = num;
    }
}
