package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C0W9A;
import X.C13LP;
import X.C1697810uHb;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import android.text.TextUtils;
import com.ss.android.ugc.awemepushlib.experiments.PushDualImageStyleOptimizeExp;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PushDualImageStyleOptPhase2 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("samsung", "xiaomi", "redmi");
    public static final Config LIZIZ = new Config(0, 0, 0, null, null, 31, null);
    public static final C01GW LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(185));
        LIZJ = c01gwLIZIZ;
        LIZLLL = ((Config) c01gwLIZIZ.getValue()).imShortcutNum;
    }

    public static final boolean LIZ(String str) {
        List<String> list;
        List<Integer> list2;
        C01GW c01gw = PushDualImageStyleOptimizeExp.LIZIZ;
        if (!((PushDualImageStyleOptimizeExp.Config) c01gw.getValue()).enable || TextUtils.isEmpty(str) || !C13LP.LJJJJ(str, ((PushDualImageStyleOptimizeExp.Config) c01gw.getValue()).pushLabelList)) {
            return false;
        }
        String strLIZIZ = C0W9A.LIZIZ();
        if (LIZ.contains(strLIZIZ)) {
            return true;
        }
        C01GW c01gw2 = LIZJ;
        if (((Config) c01gw2.getValue()).value == 1 && (list = ((Config) c01gw2.getValue()).enableDevices) != null && list.contains(strLIZIZ)) {
            Map<String, List<Integer>> map = ((Config) c01gw2.getValue()).disableDeviceMap;
            if (map == null || (list2 = map.get(strLIZIZ)) == null) {
                return true;
            }
            return true ^ C13LP.LJJJJ(C2095008Iq.LJIIJJI(C0W9A.LIZ()), list2);
        }
        return false;
    }

    public static final class Config {

        @C09CT("disable_device_map")
        public final Map<String, List<Integer>> disableDeviceMap;

        @C09CT("enable_devices")
        public final List<String> enableDevices;

        @C09CT("enable_shortcut")
        public final int enableShortcut;

        @C09CT("max_shortcut_num")
        public final int imShortcutNum;

        @C09CT("value")
        public final int value;

        public Config() {
            this(0, 0, 0, null, null, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.value == config.value && this.enableShortcut == config.enableShortcut && this.imShortcutNum == config.imShortcutNum && Intrinsics.LJFF(this.enableDevices, config.enableDevices) && Intrinsics.LJFF(this.disableDeviceMap, config.disableDeviceMap);
        }

        public final int hashCode() {
            int i = ((((this.value * 31) + this.enableShortcut) * 31) + this.imShortcutNum) * 31;
            List<String> list = this.enableDevices;
            int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, List<Integer>> map = this.disableDeviceMap;
            return iHashCode + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(value=");
            sbLIZ.append(this.value);
            sbLIZ.append(", enableShortcut=");
            sbLIZ.append(this.enableShortcut);
            sbLIZ.append(", imShortcutNum=");
            sbLIZ.append(this.imShortcutNum);
            sbLIZ.append(", enableDevices=");
            sbLIZ.append(this.enableDevices);
            sbLIZ.append(", disableDeviceMap=");
            sbLIZ.append(this.disableDeviceMap);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config(int i, int i2, int i3, List<String> list, Map<String, ? extends List<Integer>> map) {
            this.value = i;
            this.enableShortcut = i2;
            this.imShortcutNum = i3;
            this.enableDevices = list;
            this.disableDeviceMap = map;
        }

        public Config(int i, int i2, int i3, List list, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 2 : i3, (i4 & 8) != 0 ? PushDualImageStyleOptPhase2.LIZ : list, (i4 & 16) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("oppo", C1697810uHb.LJIIJJI(15, 16)), new Pair("realme", C1697810uHb.LJIIJJI(15, 16)), new Pair("oneplus", C1697810uHb.LJIIJJI(15, 16))) : map);
        }
    }
}
