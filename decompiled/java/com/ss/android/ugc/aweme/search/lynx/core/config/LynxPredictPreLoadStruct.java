package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxPredictPreLoadStruct {

    @C09CT("enableAddPreLayoutHolder")
    public boolean enableAddPreLayoutHolder;

    @C09CT("enablePredictLynxRuntimeWhenResumeRecyclerView")
    public boolean enablePredictLynxRuntimeWhenValid;

    @C09CT("enable_predict_pre_layout_when_data_ready")
    public boolean enablePredictPreLayoutWhenDataReady;

    @C09CT("preLayoutCacheUsePropCallback")
    public boolean preLayoutCacheUsePropCallback;

    @C09CT("predict_pre_layout_list")
    public List<String> predictPreLayoutList;

    @C09CT("predictPreLayoutSync")
    public boolean predictPreLayoutSync;

    @C09CT("predict_pre_layout_when_data_ready_list")
    public List<String> predictPreLayoutWhenDataReadyList;

    @C09CT("predict_update_black_list")
    public List<String> predictUpdateBlackList;

    @C09CT("predictUpdateDiffJudgeBIZ")
    public boolean predictUpdateDiffJudgeBIZ;

    @C09CT("predict_update_list")
    public List<String> predictUpdateList;

    @C09CT("predictUpdateStrategy")
    public int predictUpdateStrategy;

    @C09CT("predictUpdateWhenBindTwice")
    public boolean predictUpdateWhenBindTwice;

    public LynxPredictPreLoadStruct() {
        C13BV c13bv = C13BV.INSTANCE;
        this.predictPreLayoutList = c13bv;
        this.predictPreLayoutWhenDataReadyList = c13bv;
        this.predictUpdateList = c13bv;
        this.predictUpdateBlackList = c13bv;
        this.predictUpdateDiffJudgeBIZ = true;
        this.predictPreLayoutSync = true;
    }
}
