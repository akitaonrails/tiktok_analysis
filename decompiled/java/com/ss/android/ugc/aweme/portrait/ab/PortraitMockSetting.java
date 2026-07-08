package com.ss.android.ugc.aweme.portrait.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class PortraitMockSetting {
    public static final Meta LIZ = new Meta(false, Integer.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(243));

    public static final class Meta {

        @C09CT("inbox_feature_activity_preference_key")
        public final int inboxFeatureActivityPreferenceKey;

        @C09CT("notice_preference_score_key")
        public final float inboxFeatureActivityPreferenceNoticeScoreKey;

        @C09CT("urcard_preference_score_key")
        public final float inboxFeatureActivityPreferenceURCardScoreKey;

        @C09CT("inbox_portrait_debug")
        public final boolean isMockOpen;

        public Meta() {
            this(false, Integer.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        }

        public Meta(boolean z, int i, float f, float f2) {
            this.isMockOpen = z;
            this.inboxFeatureActivityPreferenceKey = i;
            this.inboxFeatureActivityPreferenceNoticeScoreKey = f;
            this.inboxFeatureActivityPreferenceURCardScoreKey = f2;
        }
    }
}
