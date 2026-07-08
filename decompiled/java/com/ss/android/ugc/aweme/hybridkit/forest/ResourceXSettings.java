package com.ss.android.ugc.aweme.hybridkit.forest;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.h;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes24.dex */
public final class ResourceXSettings {
    public static final ResourceXModel LIZ = new ResourceXModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(78));

    public static final class ResourceXModel {

        @C09CT("cache_all_resource")
        public int cacheAllResource;

        @C09CT("check_version_dir_exists")
        public boolean checkVersionDirExists;

        @C09CT("delete_lynx_cache")
        public int deleteLynxCache;

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_array_meta")
        public boolean enableArrayMeta;

        @C09CT("enable_code_cache")
        public boolean enableCodeCache;

        @C09CT("enable_heuristic_cache")
        public boolean enableHeuristicCache;

        @C09CT("enable_interrupt")
        public boolean enableInterrupt;

        @C09CT("enable_native_io")
        public boolean enableNativeIO;

        @C09CT("enable_non_blocking_io")
        public boolean enableNonBlockingIO;

        @C09CT("enable_pre_decode")
        public boolean enablePreDecode;

        @C09CT("enable_unsafe")
        public boolean enableUnsafe;

        @C09CT("replace_forest")
        public boolean replaceForest;

        @C09CT("skip_version_force")
        public boolean skipVersionForce;

        @C09CT("support_records")
        public boolean supportRecords;

        @C09CT("max_waiting_time")
        public long maxWaitingTime = 150;

        @C09CT("block_cache_list")
        public h blockList = new h();

        @C09CT("support_assets_file")
        public boolean supportAssets2File = true;
    }

    public static ResourceXModel LIZ() {
        return (ResourceXModel) LIZIZ.getValue();
    }
}
