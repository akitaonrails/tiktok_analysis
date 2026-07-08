package com.ss.android.ugc.aweme.tako.experiment;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C1255004vc;
import X.C2188811AlT;
import X.C452501pT;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TakoEnterMethodListExperiment {
    public static volatile String LIZIZ;
    public static final Config LIZ = new Config(0, null, null, 7, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(687));

    public static boolean LIZ(boolean z) {
        String str = LIZIZ;
        if (!z || Intrinsics.LJFF(str, "click_info")) {
            if (((Number) C1255004vc.LIZ.getValue()).intValue() == 0 && !Intrinsics.LJFF(str, "click_info")) {
                return true;
            }
            C01GW c01gw = LIZJ;
            int i = ((Config) c01gw.getValue()).enable;
            if (i != 1) {
                if (i != 2 || str == null || !((Config) c01gw.getValue()).blackEnterMethodList.contains(str)) {
                    return true;
                }
            } else if (str != null && ((Config) c01gw.getValue()).enterMethodList.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static final class Config {

        @C09CT("black_enter_method_list")
        public final Set<String> blackEnterMethodList;

        @C09CT("enable")
        public final int enable;

        @C09CT("enter_method_list")
        public final Set<String> enterMethodList;

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
            return this.enable == config.enable && Intrinsics.LJFF(this.enterMethodList, config.enterMethodList) && Intrinsics.LJFF(this.blackEnterMethodList, config.blackEnterMethodList);
        }

        public final int hashCode() {
            return (((this.enable * 31) + this.enterMethodList.hashCode()) * 31) + this.blackEnterMethodList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", enterMethodList=");
            sbLIZ.append(this.enterMethodList);
            sbLIZ.append(", blackEnterMethodList=");
            sbLIZ.append(this.blackEnterMethodList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(int i, Set<String> set, Set<String> set2) {
            this.enable = i;
            this.enterMethodList = set;
            this.blackEnterMethodList = set2;
        }

        public Config(int i, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C08CX.INSTANCE : set, (i2 & 4) != 0 ? C08CX.INSTANCE : set2);
        }
    }
}
