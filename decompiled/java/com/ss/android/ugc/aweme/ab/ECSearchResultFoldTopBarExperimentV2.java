package com.ss.android.ugc.aweme.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECSearchResultFoldTopBarExperimentV2 {
    public static final AnimConfig LIZ = new AnimConfig(0, false, false, new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(30));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(31));

    public static boolean LIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static final class AnimConfig {

        @C09CT("search_bar_animation_enable")
        public final boolean searchBarAnimationEnable;

        @C09CT("simple_tab_content")
        public final int simpleTabContent;

        @C09CT("tab_bar_animation_enable")
        public final boolean tabBarAnimationEnable;

        @C09CT("voucher_native_fetch_channel_list")
        public final List<String> voucher_fetch_native_enable;

        public AnimConfig() {
            this(0, false, false, new ArrayList());
        }

        public AnimConfig(int i, boolean z, boolean z2, List<String> list) {
            this.simpleTabContent = i;
            this.tabBarAnimationEnable = z;
            this.searchBarAnimationEnable = z2;
            this.voucher_fetch_native_enable = list;
        }
    }
}
