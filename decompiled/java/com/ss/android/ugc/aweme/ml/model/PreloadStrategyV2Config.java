package com.ss.android.ugc.aweme.ml.model;

import X.C09CT;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class PreloadStrategyV2Config {

    @C09CT("default")
    public int defaultIndex;

    @C09CT("lable_index_mapping")
    public List<String> lableIndexMapping;

    @C09CT("plan")
    public PreloadStrategyConfig[] plans;

    public String toString() {
        return super.toString();
    }
}
