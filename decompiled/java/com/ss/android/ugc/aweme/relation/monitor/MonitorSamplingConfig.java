package com.ss.android.ugc.aweme.relation.monitor;

import X.C01GW;
import X.C09CT;
import X.C2183621Ad6;
import X.C2183631Ad7;
import X.C2183641Ad8;
import X.C2183651Ad9;
import X.C2183661AdA;
import X.C2183671AdB;
import X.C452501pT;
import X.EnumC452301pR;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class MonitorSamplingConfig {
    public static final MonitorSamplingConfig LIZ = new MonitorSamplingConfig();
    public static final ConfigValue LIZIZ = new ConfigValue(0.05d, 0.05d, 0.00125d, 0.05d, 0.05d);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2183671AdB());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2183621Ad6());
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;

    public static final class ConfigValue {

        @C09CT("relation_image_value")
        public final double imageValue;

        @C09CT("rec_user_popup_value")
        public final double recUserPopup;

        @C09CT("rec_user_refresh_value")
        public final double recUserRefresh;

        @C09CT("rec_user_scene_value")
        public final double recUserScene;

        @C09CT("relation_page_value")
        public final double relationPage;

        public ConfigValue() {
            this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
        }

        public ConfigValue(double d, double d2, double d3, double d4, double d5) {
            this.recUserPopup = d;
            this.recUserScene = d2;
            this.imageValue = d3;
            this.recUserRefresh = d4;
            this.relationPage = d5;
        }
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LJ = C452501pT.LIZ(enumC452301pR, new C2183641Ad8());
        LJFF = C452501pT.LIZ(enumC452301pR, new C2183661AdA());
        LJI = C452501pT.LIZ(enumC452301pR, new C2183631Ad7());
        LJII = C452501pT.LIZ(enumC452301pR, new C2183651Ad9());
        LJIIIIZZ = C452501pT.LIZ(enumC452301pR, AFwS224S0000000_33.get$arr$(437));
    }

    public static double LIZ() {
        return ((Number) LIZLLL.getValue()).doubleValue();
    }
}
