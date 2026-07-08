package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRetagEducationPanelFrequencyControlSettings {
    public static final PoiRetagEducationPanelFrequencyControlModel LIZ = new PoiRetagEducationPanelFrequencyControlModel(1, 30);

    public static final class PoiRetagEducationPanelFrequencyControlModel {

        @C09CT("cumulative_number_of_closures")
        public final Integer cumulativeNumberOfClosures;

        @C09CT("remake_days")
        public final Integer remakeDays;

        public PoiRetagEducationPanelFrequencyControlModel() {
            this(null, null);
        }

        public PoiRetagEducationPanelFrequencyControlModel(Integer num, Integer num2) {
            this.cumulativeNumberOfClosures = num;
            this.remakeDays = num2;
        }
    }
}
