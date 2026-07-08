package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C295960Bis;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1350510lFR;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentTopBarPriorityConfig {
    public static final CommentTopBarPriorityConfig LIZ = new CommentTopBarPriorityConfig();
    public static final Config LIZIZ = new Config(false, true, C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.AD_TOP_BAR_BG.getValue()), Integer.valueOf(EnumC1350510lFR.AD_TOP_ANCHOR_BG.getValue()), Integer.valueOf(EnumC1350510lFR.TTBA_BG.getValue()), Integer.valueOf(EnumC1350510lFR.TTCM_BG.getValue()), Integer.valueOf(EnumC1350510lFR.POI_BG.getValue()), Integer.valueOf(EnumC1350510lFR.TT_SHOWCASE_BG.getValue()), Integer.valueOf(EnumC1350510lFR.DRAMA.getValue()), Integer.valueOf(EnumC1350510lFR.SEARCH_BG.getValue()), Integer.valueOf(EnumC1350510lFR.SEARCH_TAKO_BG.getValue()), Integer.valueOf(EnumC1350510lFR.ACTIVITY_BG.getValue()), Integer.valueOf(EnumC1350510lFR.UG_DRAMA.getValue())));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(243));

    public static Config LIZIZ() {
        Config config = (Config) LIZJ.getValue();
        return config == null ? LIZIZ : config;
    }

    public static boolean LIZ() {
        return LIZIZ().enable && C295960Bis.LIZ();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("enable_fix_act")
        public final boolean enableFixAct;

        @C09CT("type_priority_list")
        public final List<Integer> typePriorityList;

        public Config() {
            this(false, true, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && this.enableFixAct == config.enableFixAct && Intrinsics.LJFF(this.typePriorityList, config.typePriorityList);
        }

        public final int hashCode() {
            int iZ2 = ((C786410Ut5.Z2(this.enable) * 31) + C786410Ut5.Z2(this.enableFixAct)) * 31;
            List<Integer> list = this.typePriorityList;
            return iZ2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Config(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", enableFixAct=");
            sbLIZ.append(this.enableFixAct);
            sbLIZ.append(", typePriorityList=");
            sbLIZ.append(this.typePriorityList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public Config(boolean z, boolean z2, List<Integer> list) {
            this.enable = z;
            this.enableFixAct = z2;
            this.typePriorityList = list;
        }
    }
}
