package com.ss.android.ugc.aweme.ad.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class IABPrefetchHTMLSettings {
    public static final IABPrefetchHTMLSettingsModel LIZ = new IABPrefetchHTMLSettingsModel(null, 0, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(101));

    public static final class IABPrefetchHTMLSettingsModel {

        @C09CT("enable_language_header")
        public final boolean enableLanguageHeader;

        @C09CT("max_redirect_count")
        public final int maxRedirectCount;

        @C09CT("redirect_black_list")
        public final List<String> redirectBlackList;

        public IABPrefetchHTMLSettingsModel() {
            this(null, 0, true);
        }

        public IABPrefetchHTMLSettingsModel(List<String> list, int i, boolean z) {
            this.redirectBlackList = list;
            this.maxRedirectCount = i;
            this.enableLanguageHeader = z;
        }
    }
}
