package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SparkLitePreLoadConfig {

    @C09CT("continue_pre_decode")
    public boolean continuePreloadAndDecode;

    @C09CT("create_lite_view_async")
    public boolean createLiteViewAsync;

    @C09CT("create_lite_view_async_list")
    public List<String> createLiteViewAsyncList;

    @C09CT("enable_in_patch_chunk")
    public int enableInPatchChunk;

    @C09CT("enable_prelayout_with_commonparams")
    public int enablePraLayoutWithCommonParams;

    @C09CT("enable_prelayout")
    public int enablePreLayout;

    @C09CT("enable_release_useless_cache")
    public int enableReleaseUselessCache;

    @C09CT("enable_sync_render_without_callback")
    public int enableSyncRenderWithoutCallback;

    @C09CT("prelayout_after_request_blacklist")
    public List<String> preLayoutAfterRequestBlackBundleList;

    @C09CT("prelayout_after_request_bundlelist")
    public List<String> preLayoutAfterRequestBundleList;

    @C09CT("prelayout_during_request_schemalist")
    public List<String> preLayoutDuringRequestSchemaList;

    @C09CT("prelayout_once_bundlelist")
    public List<String> preLayoutOnceBundleList;

    @C09CT("prelayout_predict_during_request_schemalist")
    public List<String> preLayoutPredictDuringRequestSchemaList;

    @C09CT("predict_entermethod_white_list")
    public List<String> predictEnterMethodWhiteList;

    public SparkLitePreLoadConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.preLayoutOnceBundleList = c13bv;
        this.preLayoutDuringRequestSchemaList = c13bv;
        this.preLayoutAfterRequestBundleList = c13bv;
        this.preLayoutAfterRequestBlackBundleList = c13bv;
        this.preLayoutPredictDuringRequestSchemaList = c13bv;
        this.predictEnterMethodWhiteList = c13bv;
        this.createLiteViewAsyncList = c13bv;
    }
}
