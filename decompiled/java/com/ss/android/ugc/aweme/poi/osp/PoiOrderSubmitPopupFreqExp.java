package com.ss.android.ugc.aweme.poi.osp;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitPopupFreqExp {
    public static final PoiOrderSubmitPopupFreqExpModel LIZ = new PoiOrderSubmitPopupFreqExpModel(Boolean.TRUE, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(410));

    public static final class FrequencyModel {

        @C09CT("frequency")
        public final int frequency;

        @C09CT("time")
        public final int time;

        public FrequencyModel(int i, int i2) {
            this.time = i;
            this.frequency = i2;
        }
    }

    public static final class PoiOrderSubmitPopupFreqExpModel {

        @C09CT("frequency_control")
        public final FrequencyModel frequencyControl;

        @C09CT("should_show")
        public final Boolean shouldShow;

        public PoiOrderSubmitPopupFreqExpModel(Boolean bool, FrequencyModel frequencyModel) {
            this.shouldShow = bool;
            this.frequencyControl = frequencyModel;
        }
    }
}
