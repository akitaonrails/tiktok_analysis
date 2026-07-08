package com.ss.android.ugc.aweme.personalized;

import X.C09CT;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public interface ReportHybridABApi {
    @InterfaceC1501170pAR("/tiktok/v1/report/hybridab/")
    C11NZ<ReportHybridABResponse> reportHybridAB(@InterfaceC1485405rg ReportHybridABRequest reportHybridABRequest);

    public static final class ReportHybridABRequest {

        @C09CT("hybridab_experiment_info")
        public final List<HybridABExperimentInfo> hybridABExperimentInfo;

        public ReportHybridABRequest(List<HybridABExperimentInfo> list) {
            this.hybridABExperimentInfo = list;
        }
    }

    public static final class HybridABExperimentInfo {

        @C09CT("experiment_name_id")
        public final int experimentNameId;

        @C09CT("vid")
        public final String vid;

        public HybridABExperimentInfo(int i, String str) {
            this.experimentNameId = i;
            this.vid = str;
        }
    }

    public static final class HybridABExperimentInfoHandleResult {

        @C09CT("experiment_name_id")
        public final int experimentNameId;

        @C09CT("failure_reason")
        public final String failureReason;

        @C09CT("is_successful")
        public final boolean isSuccessful;

        public HybridABExperimentInfoHandleResult(int i, boolean z, String str) {
            this.experimentNameId = i;
            this.isSuccessful = z;
            this.failureReason = str;
        }
    }

    public static final class ReportHybridABResponse {

        @C09CT("result")
        public final HybridABExperimentInfoHandleResult[] result;

        @C09CT("status_code")
        public final int statusCode;

        @C09CT("status_msg")
        public final String statusMessage;

        public ReportHybridABResponse(HybridABExperimentInfoHandleResult[] hybridABExperimentInfoHandleResultArr, int i, String str) {
            this.result = hybridABExperimentInfoHandleResultArr;
            this.statusCode = i;
            this.statusMessage = str;
        }
    }
}
