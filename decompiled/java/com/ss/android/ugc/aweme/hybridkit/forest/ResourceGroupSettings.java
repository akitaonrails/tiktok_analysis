package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.n;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class ResourceGroupSettings {
    public static final ResourceGroupModel LIZ = new ResourceGroupModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(77));

    public static final class ResourceGroupModel {

        @C09CT("data_origin")
        public int dataOrigin;

        @C09CT("data_type")
        public int dataType;

        @C09CT("enable_global_preload")
        public boolean enableGlobalPreload;

        @C09CT("enable_need_local_file_on_new_link")
        public boolean enableNeedLocalFileOnNewLink;

        @C09CT("enable_page_info_request")
        public boolean enablePageInfoRequest;

        @C09CT("enable_page_info_preconnect")
        public boolean enablePreConnect;

        @C09CT("enable_pre_decode_lynx")
        public boolean enablePreDecodeLynx;

        @C09CT("enable_resource_group")
        public boolean enableResourceGroup;

        @C09CT("enable_retry_on_fail")
        public boolean enableRetryOnFail;

        @C09CT("fetch_if_destroyed")
        public boolean fetchIfDestroyed;

        @C09CT("optimize_preload_report")
        public boolean optimizePreloadReport;

        @C09CT("optimize_process_chain")
        public boolean optimizeProcessChin;

        @C09CT("prefetch_type")
        public int prefetchType;

        @C09CT("resource_config")
        public n resourceConfig;

        @C09CT("use_thread_pool")
        public boolean useThreadPool;

        @C09CT("prefetch_valid_time")
        public long prefetchValidTime = 180000;

        @C09CT("disable_prefetch_lynx")
        public boolean disablePrefetchLynx = true;

        @C09CT("enable_retry_on_fail_if_only_local")
        public boolean enableRetryOnFailIfOnlyLocal = true;
    }

    public static ResourceGroupModel LIZ() {
        return (ResourceGroupModel) LIZIZ.getValue();
    }
}
