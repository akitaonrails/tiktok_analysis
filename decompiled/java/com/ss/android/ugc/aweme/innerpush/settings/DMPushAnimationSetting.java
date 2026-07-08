package com.ss.android.ugc.aweme.innerpush.settings;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class DMPushAnimationSetting {
    public static final MetaData LIZ = new MetaData(2);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(91));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(90));

    public static final class MetaData {

        @C09CT("click_area_times")
        public final int clickAreaTimes;

        public MetaData() {
            this(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetaData) && this.clickAreaTimes == ((MetaData) obj).clickAreaTimes;
        }

        public final int hashCode() {
            return this.clickAreaTimes;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MetaData(clickAreaTimes=");
            sbLIZ.append(this.clickAreaTimes);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MetaData(int i) {
            this.clickAreaTimes = i;
        }
    }
}
