package com.ss.android.ugc.aweme.data;

import X.C01GW;
import X.C09CT;
import X.C1073590e2n;
import X.C1697810uHb;
import X.C452501pT;
import com.ss.android.ugc.aweme.experiment.Rules;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class SocialAuthPopupControlAB {
    public static final SocialAuthControlConfig LIZ = new SocialAuthControlConfig(0, 0, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1073590e2n());

    public static final class SocialAuthControlConfig {

        @C09CT("delay_vv")
        public final int delay_vv;

        @C09CT("rules")
        public final List<Rules> exp_rules;

        @C09CT("strategy_group")
        public final int group;

        public SocialAuthControlConfig() {
            this(0, 0, null, 7, null);
        }

        public SocialAuthControlConfig(int i, int i2, List<Rules> list) {
            this.group = i;
            this.delay_vv = i2;
            this.exp_rules = list;
        }

        public SocialAuthControlConfig(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 10 : i2, (i3 & 4) != 0 ? C1697810uHb.LJIIJJI(new Rules(Collections.singletonList(2), Collections.singletonList(3)), new Rules(C1697810uHb.LJIIJJI(3, 2), C1697810uHb.LJIIJJI(3, 0)), new Rules(C1697810uHb.LJIIJJI(3, 2), C1697810uHb.LJIIJJI(4, 0))) : list);
        }
    }
}
