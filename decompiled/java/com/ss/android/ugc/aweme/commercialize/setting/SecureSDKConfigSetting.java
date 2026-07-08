package com.ss.android.ugc.aweme.commercialize.setting;

import X.C01GW;
import X.C09CT;
import X.C2184191Ae1;
import X.C452501pT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class SecureSDKConfigSetting {
    public static final SecureSDkConfig LIZ = new SecureSDkConfig(false, 1, new ArrayList(), new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2184191Ae1());

    public static final class SecureSDkConfig {

        @C09CT("duplicate_check_threshold")
        public final int duplicateCheckThreshold;

        @C09CT("duplicate_filter_list")
        public final List<List<String>> duplicateFilterList;

        @C09CT("enable_check_required_params")
        public final boolean isEnableCheck;

        @C09CT("validate_skip_list")
        public final List<List<String>> validateSkipList;

        public SecureSDkConfig() {
            this(false, 1, new ArrayList(), new ArrayList());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SecureSDkConfig(boolean z, int i, List<? extends List<String>> list, List<? extends List<String>> list2) {
            this.isEnableCheck = z;
            this.duplicateCheckThreshold = i;
            this.validateSkipList = list;
            this.duplicateFilterList = list2;
        }
    }
}
