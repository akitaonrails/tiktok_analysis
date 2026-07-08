package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkSSRGlobalSettings {
    public static final LynxSSRGlobalSettingsModel LIZ = new LynxSSRGlobalSettingsModel(false, null, null, false, false, false, false, 127, null);

    public static final class LynxSSRGlobalSettingsModel {

        @C09CT("allowList")
        public final List<String> allowList;

        @C09CT("async_load_hydrate_res")
        public final boolean asyncLoadHydrateRes;

        @C09CT("blockList")
        public final List<String> blockList;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_pre_request")
        public final boolean enablePreRequest;

        @C09CT("enable_refactor_life_time")
        public final boolean enableRefactorLifeTime;

        @C09CT("should_check_empty_ssr_url")
        public final boolean shouldCheckEmptySSRUrl;

        public LynxSSRGlobalSettingsModel() {
            this(false, null, null, false, false, false, false, 127, null);
        }

        public LynxSSRGlobalSettingsModel(boolean z, List<String> list, List<String> list2, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.enable = z;
            this.blockList = list;
            this.allowList = list2;
            this.enableRefactorLifeTime = z2;
            this.enablePreRequest = z3;
            this.shouldCheckEmptySSRUrl = z4;
            this.asyncLoadHydrateRes = z5;
        }

        public LynxSSRGlobalSettingsModel(boolean z, List list, List list2, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? true : z5);
        }
    }
}
