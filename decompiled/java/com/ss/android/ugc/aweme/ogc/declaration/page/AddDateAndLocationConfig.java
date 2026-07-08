package com.ss.android.ugc.aweme.ogc.declaration.page;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class AddDateAndLocationConfig {
    public static final ConfigModel LIZ = new ConfigModel();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1750));

    public static final class ConfigModel {
        public static final int $stable = 8;

        @C09CT("date_picker_min_year")
        public Integer datePickerMinYear = 2022;

        public final Integer getDatePickerMinYear() {
            return this.datePickerMinYear;
        }

        public final void setDatePickerMinYear(Integer num) {
            this.datePickerMinYear = num;
        }
    }
}
