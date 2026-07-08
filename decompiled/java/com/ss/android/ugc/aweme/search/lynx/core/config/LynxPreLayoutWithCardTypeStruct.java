package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxPreLayoutWithCardTypeStruct {

    @C09CT("async_pre_layout")
    public boolean asyncPreLayout;

    @C09CT("async_process_render_when_callback")
    public boolean asyncProcessRenderWhenCallback;

    @C09CT("enable_do_success_callback_when_load_finished")
    public boolean enableDoSuccessCallbackWhenLoadFinished;

    @C09CT("enable_ignore_predict_cards")
    public boolean enableIgnorePredictCards;

    @C09CT("enable_json_aweme")
    public boolean enableJSONAweme;

    @C09CT("enable_pre_set_session_id")
    public boolean enablePreSetSessionId;

    @C09CT("enable_white_list")
    public List<String> enableWhiteList;

    @C09CT("reuse_pre_template_data")
    public boolean reusePreTemplateData;

    @C09CT("update_data_pre_flush")
    public boolean updateDataPreFlush;

    @C09CT("update_data_when_chunk_ready")
    public boolean updateDataWhenChunkReady;

    @C09CT("update_data_when_chunk_ready_black_list")
    public List<String> updateDataWhenChunkReadyBlackList;

    @C09CT("update_data_when_chunk_ready_in_bg_thread")
    public boolean updateDataWhenChunkReadyInBgThread;

    @C09CT("update_data_when_predict_chunk_ready")
    public boolean updateDataWhenPredictChunkReady;

    @C09CT("use_cache_data")
    public boolean useCacheData;

    public LynxPreLayoutWithCardTypeStruct() {
        C13BV c13bv = C13BV.INSTANCE;
        this.enableWhiteList = c13bv;
        this.updateDataWhenChunkReadyBlackList = c13bv;
    }
}
