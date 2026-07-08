package com.ss.android.ugc.aweme.search.common.config;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSugPreInfoContextConfig {
    public static final SearchSugPreInfoContextConfig LIZ = new SearchSugPreInfoContextConfig();
    public static final SugPreInfoContextValue LIZIZ = new SugPreInfoContextValue(false, 10, 10);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(170));

    public static final class SugPreInfoContextValue {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("feed_scene_valid_minutes")
        public final int feedSceneValidMinutes;

        @C09CT("query_list_valid_minutes")
        public final int queryListValidMinutes;

        public SugPreInfoContextValue() {
            this(false, 10, 10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SugPreInfoContextValue)) {
                return false;
            }
            SugPreInfoContextValue sugPreInfoContextValue = (SugPreInfoContextValue) obj;
            return this.enable == sugPreInfoContextValue.enable && this.queryListValidMinutes == sugPreInfoContextValue.queryListValidMinutes && this.feedSceneValidMinutes == sugPreInfoContextValue.feedSceneValidMinutes;
        }

        public final int hashCode() {
            return (((C786410Ut5.Z2(this.enable) * 31) + this.queryListValidMinutes) * 31) + this.feedSceneValidMinutes;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SugPreInfoContextValue(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", queryListValidMinutes=");
            sbLIZ.append(this.queryListValidMinutes);
            sbLIZ.append(", feedSceneValidMinutes=");
            sbLIZ.append(this.feedSceneValidMinutes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SugPreInfoContextValue(boolean z, int i, int i2) {
            this.enable = z;
            this.queryListValidMinutes = i;
            this.feedSceneValidMinutes = i2;
        }
    }
}
