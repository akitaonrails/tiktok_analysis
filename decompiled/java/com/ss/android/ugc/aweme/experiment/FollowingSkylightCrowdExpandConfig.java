package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FollowingSkylightCrowdExpandConfig {
    public static final FollowingSkylightCrowdExpandConfig LIZ = new FollowingSkylightCrowdExpandConfig();
    public static final Config LIZIZ = new Config(null, 1, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(241));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(240));

    public static final class Config {

        @C09CT("fold_user_base")
        public final List<Integer> foldUserBase;

        public Config() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && Intrinsics.LJFF(this.foldUserBase, ((Config) obj).foldUserBase);
        }

        public final int hashCode() {
            return this.foldUserBase.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(foldUserBase=");
            sbLIZ.append(this.foldUserBase);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(List<Integer> list) {
            this.foldUserBase = list;
        }

        public Config(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
