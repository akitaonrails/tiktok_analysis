package com.ss.android.ugc.aweme.ad.setting;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class CTAButtonShowAndColorSetting {
    public static final CTAButtonConfig LIZ = new CTAButtonConfig(2, 2);
    public static final C01GW LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(120));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((CTAButtonConfig) c01gwLIZIZ.getValue()).showTime * LSPassThroughRecordSizeConfig.DEFAULT;
        LIZLLL = ((CTAButtonConfig) c01gwLIZIZ.getValue()).colorTime * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static final class CTAButtonConfig {

        @C09CT("cta_color_time")
        public final int colorTime;

        @C09CT("cta_show_time")
        public final int showTime;

        public CTAButtonConfig() {
            this(2, 2);
        }

        public CTAButtonConfig(int i, int i2) {
            this.colorTime = i;
            this.showTime = i2;
        }
    }
}
