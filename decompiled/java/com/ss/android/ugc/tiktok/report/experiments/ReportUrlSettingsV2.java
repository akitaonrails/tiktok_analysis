package com.ss.android.ugc.tiktok.report.experiments;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ReportUrlSettingsV2 {
    public static final ReportUrlConfig[] LIZ = new ReportUrlConfig[0];
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(196));

    public static final class ReportUrlConfig {

        @C09CT("report_type")
        public final List<String> reportTypes;

        @C09CT("url")
        public final String reportUrl;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportUrlConfig)) {
                return false;
            }
            ReportUrlConfig reportUrlConfig = (ReportUrlConfig) obj;
            return Intrinsics.LJFF(this.reportTypes, reportUrlConfig.reportTypes) && Intrinsics.LJFF(this.reportUrl, reportUrlConfig.reportUrl);
        }

        public final int hashCode() {
            return (this.reportTypes.hashCode() * 31) + this.reportUrl.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReportUrlConfig(reportTypes=");
            sbLIZ.append(this.reportTypes);
            sbLIZ.append(", reportUrl=");
            sbLIZ.append(this.reportUrl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ReportUrlConfig(List<String> list, String str) {
            this.reportTypes = list;
            this.reportUrl = str;
        }
    }
}
