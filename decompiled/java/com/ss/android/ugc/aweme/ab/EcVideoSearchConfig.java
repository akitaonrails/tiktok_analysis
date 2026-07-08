package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcVideoSearchConfig implements Serializable {

    @C09CT("enable_video_tab")
    public final int enableVideoTab;

    @C09CT("request_count")
    public final int requestCount;

    @C09CT("return_to_top_distance")
    public final int returnToTopDistance;

    @C09CT("search_channel")
    public final String searchChannel;

    @C09CT("source")
    public final String source;

    public EcVideoSearchConfig() {
        this(0, 12, LSPassThroughRecordSizeConfig.DEFAULT, "tiktok_video", "mall_video_tab");
    }

    public EcVideoSearchConfig(int i, int i2, int i3, String str, String str2) {
        this.enableVideoTab = i;
        this.requestCount = i2;
        this.returnToTopDistance = i3;
        this.searchChannel = str;
        this.source = str2;
    }
}
