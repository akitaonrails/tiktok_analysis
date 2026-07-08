package com.ss.android.ugc.aweme.ad.network;

import X.C09CT;
import X.C0PEM;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2381009Uq;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LeadAdReporter {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AwemeRawAd awemeRawAd, Boolean bool) {
        int i;
        if (awemeRawAd == null) {
            return;
        }
        if (bool == null) {
            i = 0;
        } else if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            i = 3;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            i = 1;
        } else {
            throw new C1954807lC();
        }
        String leadAgenticData = awemeRawAd.getLeadAgenticData();
        if (leadAgenticData != null && leadAgenticData.length() != 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2381009Uq(new FormPageLeaveSignalReportRequest(awemeRawAd.getLogExtra(), leadAgenticData, awemeRawAd.getOriginalWebUrl(), Integer.valueOf(i)), null), 3);
        }
    }

    public static final class FormPageLeaveSignalReportRequest {

        @C09CT("landing_page_type")
        public final Integer landingPageType;

        @C09CT("log_extra")
        public final String logExtra;

        @C09CT("pack_pass_info")
        public final String packPassInfo;

        @C09CT("web_url")
        public final String webUrl;

        public FormPageLeaveSignalReportRequest() {
            this(null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormPageLeaveSignalReportRequest)) {
                return false;
            }
            FormPageLeaveSignalReportRequest formPageLeaveSignalReportRequest = (FormPageLeaveSignalReportRequest) obj;
            return Intrinsics.LJFF(this.logExtra, formPageLeaveSignalReportRequest.logExtra) && Intrinsics.LJFF(this.packPassInfo, formPageLeaveSignalReportRequest.packPassInfo) && Intrinsics.LJFF(this.webUrl, formPageLeaveSignalReportRequest.webUrl) && Intrinsics.LJFF(this.landingPageType, formPageLeaveSignalReportRequest.landingPageType);
        }

        public final int hashCode() {
            String str = this.logExtra;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.packPassInfo;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.webUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.landingPageType;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FormPageLeaveSignalReportRequest(logExtra=");
            sbLIZ.append(this.logExtra);
            sbLIZ.append(", packPassInfo=");
            sbLIZ.append(this.packPassInfo);
            sbLIZ.append(", webUrl=");
            sbLIZ.append(this.webUrl);
            sbLIZ.append(", landingPageType=");
            sbLIZ.append(this.landingPageType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public FormPageLeaveSignalReportRequest(String str, String str2, String str3, Integer num) {
            this.logExtra = str;
            this.packPassInfo = str2;
            this.webUrl = str3;
            this.landingPageType = num;
        }
    }
}
