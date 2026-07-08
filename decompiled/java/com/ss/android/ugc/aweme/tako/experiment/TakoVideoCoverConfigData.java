package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoVideoCoverConfigData {

    @C09CT("high_end")
    public final TakoVideoCoverConfigDataSize highEnd;

    @C09CT("low_end")
    public final TakoVideoCoverConfigDataSize lowEnd;

    @C09CT("mid_end")
    public final TakoVideoCoverConfigDataSize midEnd;

    public TakoVideoCoverConfigData() {
        this(new TakoVideoCoverConfigDataSize(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 480), new TakoVideoCoverConfigDataSize(400, 600), new TakoVideoCoverConfigDataSize(500, 800));
    }

    public TakoVideoCoverConfigData(TakoVideoCoverConfigDataSize takoVideoCoverConfigDataSize, TakoVideoCoverConfigDataSize takoVideoCoverConfigDataSize2, TakoVideoCoverConfigDataSize takoVideoCoverConfigDataSize3) {
        this.lowEnd = takoVideoCoverConfigDataSize;
        this.midEnd = takoVideoCoverConfigDataSize2;
        this.highEnd = takoVideoCoverConfigDataSize3;
    }
}
