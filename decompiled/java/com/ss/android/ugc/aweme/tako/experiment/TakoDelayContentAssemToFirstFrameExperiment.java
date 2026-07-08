package com.ss.android.ugc.aweme.tako.experiment;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoDelayContentAssemToFirstFrameExperiment {
    public static final Config LIZ = new Config(0, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(686));

    public static boolean LIZ(String str, String str2) {
        C01GW c01gw = LIZIZ;
        if (((Config) c01gw.getValue()).enable != 1) {
            return false;
        }
        if (str != null && ((Config) c01gw.getValue()).enterFromBlackList.contains(str)) {
            return false;
        }
        if (str2 != null && ((Config) c01gw.getValue()).enterMethodBlackList.contains(str2)) {
            return false;
        }
        return true;
    }

    public static final class Config {

        @C09CT("enable")
        public final int enable;

        @C09CT("enter_from_black_list")
        public final Set<String> enterFromBlackList;

        @C09CT("enter_method_black_list")
        public final Set<String> enterMethodBlackList;

        public Config() {
            this(0, null, null, 7, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && Intrinsics.LJFF(this.enterFromBlackList, config.enterFromBlackList) && Intrinsics.LJFF(this.enterMethodBlackList, config.enterMethodBlackList);
        }

        public final int hashCode() {
            return (((this.enable * 31) + this.enterFromBlackList.hashCode()) * 31) + this.enterMethodBlackList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", enterFromBlackList=");
            sbLIZ.append(this.enterFromBlackList);
            sbLIZ.append(", enterMethodBlackList=");
            sbLIZ.append(this.enterMethodBlackList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, Set<String> set, Set<String> set2) {
            this.enable = i;
            this.enterFromBlackList = set;
            this.enterMethodBlackList = set2;
        }

        public Config(int i, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C08CX.INSTANCE : set, (i2 & 4) != 0 ? C08CX.INSTANCE : set2);
        }
    }
}
