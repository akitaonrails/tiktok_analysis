package com.ss.android.ugc.aweme.commercialize.promote.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteLiveSetting {
    public static final PromoteLiveSwitch LIZ = new PromoteLiveSwitch(true, true);

    public static final class PromoteLiveSwitch {

        @C09CT("promote_before_live")
        public final boolean promoteBeforeLive;

        @C09CT("promote_in_live")
        public final boolean promoteInLive;

        public PromoteLiveSwitch() {
            this(true, true);
        }

        public PromoteLiveSwitch(boolean z, boolean z2) {
            this.promoteBeforeLive = z;
            this.promoteInLive = z2;
        }
    }
}
