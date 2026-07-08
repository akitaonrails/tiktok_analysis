package com.ss.android.ugc.aweme.sync;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes24.dex */
public final class SyncConfigSettings {
    public static final SyncSdkConfigModel LIZ;
    public static final SyncSdkConfigModel LIZIZ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new SyncSdkConfigModel(bool, bool, bool, null, null, null);
        n nVar = new n();
        Boolean bool2 = Boolean.TRUE;
        nVar.LJJII(bool2, "8");
        nVar.LJJII(bool2, "23");
        LIZIZ = new SyncSdkConfigModel(bool2, bool2, null, null, 200, nVar);
    }

    public static final class SyncSdkConfigModel {

        @C09CT("biz_enable_info")
        public final n bizEnableInfo;

        @C09CT("enable")
        public final Boolean enable;

        @C09CT("monitor_sampling")
        public final Integer monitorSampling;

        @C09CT("sync_connect_fallback_ts")
        public final Long syncConnectFallbackTs;

        @C09CT("sync_connect_opt")
        public final Boolean syncConnectOpt;

        @C09CT("use_shared_ws")
        public final Boolean useSharedWs;

        public SyncSdkConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num, n nVar) {
            this.enable = bool;
            this.useSharedWs = bool2;
            this.syncConnectOpt = bool3;
            this.syncConnectFallbackTs = l;
            this.monitorSampling = num;
            this.bizEnableInfo = nVar;
        }
    }
}
