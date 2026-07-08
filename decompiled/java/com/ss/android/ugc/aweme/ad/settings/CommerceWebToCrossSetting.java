package com.ss.android.ugc.aweme.ad.settings;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class CommerceWebToCrossSetting {
    public static final CommerceWebToCrossSetting LIZ = new CommerceWebToCrossSetting();
    public static final CommerceWebToCrossModel LIZIZ = new CommerceWebToCrossModel(true, false, true);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(121));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(122));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(123));

    public static final class CommerceWebToCrossModel {

        @C09CT("init_view_gone")
        public final boolean initViewGone;

        @C09CT("log_page_scroll")
        public final boolean logPageScroll;

        @C09CT("stay_page_switch")
        public final boolean stayPageSwitch;

        public CommerceWebToCrossModel() {
            this(true, false, true);
        }

        public CommerceWebToCrossModel(boolean z, boolean z2, boolean z3) {
            this.initViewGone = z;
            this.logPageScroll = z2;
            this.stayPageSwitch = z3;
        }
    }
}
