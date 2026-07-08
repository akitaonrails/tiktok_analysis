package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class IMMessageBubbleAGSLSetting {
    public static final BubbleAGSLSetting LIZ = new BubbleAGSLSetting(C1697810uHb.LJIIJJI("#ff0894ff", "#FF266BFF", "#FF4257FF", "#ff9B4BFF"), C1697810uHb.LJIIJJI(Float.valueOf(0.1237f), Float.valueOf(0.3115f), Float.valueOf(0.5903f), Float.valueOf(0.8909f)), C1697810uHb.LJIIJJI(Float.valueOf(0.0151f), Float.valueOf(0.312f), Float.valueOf(0.5235f), Float.valueOf(0.9993f)), true, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(65));

    public static final class BubbleAGSLSetting {

        @C09CT("colors")
        public final List<String> colors;

        @C09CT("force_disable_agsl")
        public final boolean forceDisableAGSL;

        @C09CT("is_diagonal")
        public final boolean isDiagonal;

        @C09CT("ratio")
        public final List<Float> ratio;

        @C09CT("send_btn_ratio")
        public final List<Float> sendBtnRatio;

        public BubbleAGSLSetting() {
            this(C1697810uHb.LJIIJJI("#ff0894ff", "#FF266BFF", "#FF4257FF", "#ff9B4BFF"), C1697810uHb.LJIIJJI(Float.valueOf(0.1237f), Float.valueOf(0.3115f), Float.valueOf(0.5903f), Float.valueOf(0.8909f)), C1697810uHb.LJIIJJI(Float.valueOf(0.0151f), Float.valueOf(0.312f), Float.valueOf(0.5235f), Float.valueOf(0.9993f)), true, false);
        }

        public BubbleAGSLSetting(List<String> list, List<Float> list2, List<Float> list3, boolean z, boolean z2) {
            this.colors = list;
            this.ratio = list2;
            this.sendBtnRatio = list3;
            this.isDiagonal = z;
            this.forceDisableAGSL = z2;
        }
    }

    public static BubbleAGSLSetting LIZ() {
        return (BubbleAGSLSetting) LIZIZ.getValue();
    }
}
