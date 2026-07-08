package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveAppLogInnerSerializeOptExperiment {
    public static final LiveAppLogInnerSerializeOptConfig LIZ = new LiveAppLogInnerSerializeOptConfig(false, false, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(152));

    public static final class LiveAppLogInnerSerializeOptConfig {

        @C09CT("enable_anchor")
        public final boolean enableAnchor;

        @C09CT("enable_user")
        public final boolean enableUser;

        @C09CT("white_list")
        public final List<String> whiteList;

        public LiveAppLogInnerSerializeOptConfig() {
            this(false, false, null, 7, null);
        }

        public final boolean getEnableAnchor() {
            return this.enableAnchor;
        }

        public final boolean getEnableUser() {
            return this.enableUser;
        }

        public final List<String> getWhiteList() {
            return this.whiteList;
        }

        public LiveAppLogInnerSerializeOptConfig(boolean z, boolean z2, List<String> list) {
            this.enableAnchor = z;
            this.enableUser = z2;
            this.whiteList = list;
        }

        public LiveAppLogInnerSerializeOptConfig(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
