package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C08FF;
import X.C09CS;
import X.C09CT;
import X.C09DL;
import X.C09GP;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AgentCommandResponse {

    @C09CT("error")
    public final ErrorInfo error;

    @C09CT("execution_time_ms")
    public final Long executionTimeMs;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("payload")
    public final String payload;

    @C09CT("result")
    public final ResultStatus result;

    @C09CT("timestamp")
    public final Long timestamp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes4.dex */
    @C09CS(ResultStatusAdapter.class)
    public static final class ResultStatus {
        public static final C09GP Companion;
        public static final /* synthetic */ ResultStatus[] LLILLJJLI;
        public static final /* synthetic */ C2254308sP LLILLL;
        public static final ResultStatus RESULT_STATUS_FAILURE;
        public static final ResultStatus RESULT_STATUS_SUCCESS;
        public static final ResultStatus RESULT_STATUS_TIMEOUT;
        public static final ResultStatus RESULT_STATUS_UNSPECIFIED;
        public final int LL;

        public static InterfaceC2044707zh<ResultStatus> getEntries() {
            return LLILLL;
        }

        static {
            ResultStatus resultStatus = new ResultStatus("RESULT_STATUS_UNSPECIFIED", 0, 0);
            RESULT_STATUS_UNSPECIFIED = resultStatus;
            ResultStatus resultStatus2 = new ResultStatus("RESULT_STATUS_SUCCESS", 1, 1);
            RESULT_STATUS_SUCCESS = resultStatus2;
            ResultStatus resultStatus3 = new ResultStatus("RESULT_STATUS_FAILURE", 2, 2);
            RESULT_STATUS_FAILURE = resultStatus3;
            ResultStatus resultStatus4 = new ResultStatus("RESULT_STATUS_TIMEOUT", 3, 3);
            RESULT_STATUS_TIMEOUT = resultStatus4;
            ResultStatus[] resultStatusArr = {resultStatus, resultStatus2, resultStatus3, resultStatus4};
            LLILLJJLI = resultStatusArr;
            LLILLL = new C2254308sP(resultStatusArr);
            Companion = new C09GP();
        }

        public static ResultStatus[] values() {
            return (ResultStatus[]) LLILLJJLI.clone();
        }

        public final int getValue() {
            return this.LL;
        }

        public static final class ResultStatusAdapter extends TypeAdapter<ResultStatus> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
            @Override // com.google.gson.TypeAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse.ResultStatus read(X.C09CU r5) throws java.io.IOException {
                /*
                    r4 = this;
                    X.09D6 r3 = r5.LJJLIIIJ()
                    if (r3 != 0) goto L59
                    r1 = -1
                L7:
                    r0 = 2
                    if (r1 == r0) goto L25
                    com.google.gson.o r2 = new com.google.gson.o
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Unexpected token for PermissionState: "
                    r1.append(r0)
                    r1.append(r3)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    r2.<init>(r0)
                    X.C1AF0.LJ(r2)
                L22:
                    com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse$ResultStatus r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse.ResultStatus.RESULT_STATUS_UNSPECIFIED
                L24:
                    return r1
                L25:
                    java.lang.String r2 = r5.LJJJZ()
                    java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r2)
                    if (r0 == 0) goto L3e
                    X.09GP r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse.ResultStatus.Companion
                    int r0 = r0.intValue()
                    r1.getClass()
                    com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse$ResultStatus r1 = X.C09GP.LIZ(r0)
                    if (r1 != 0) goto L24
                L3e:
                    com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse$ResultStatus r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse.ResultStatus.valueOf(r2)     // Catch: java.lang.Throwable -> L46
                    X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L46
                    goto L52
                L46:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.00Yq r1 = new X.00Yq
                    r1.<init>(r0)
                    X.C189200o6.m2constructorimpl(r1)
                L52:
                    boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                    if (r0 == 0) goto L71
                    goto L22
                L59:
                    int[] r1 = X.C09GO.LIZ
                    int r0 = r3.ordinal()
                    r1 = r1[r0]
                    r0 = 1
                    if (r1 != r0) goto L7
                    X.09GP r1 = com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse.ResultStatus.Companion
                    int r0 = r5.LJJIZ()
                    r1.getClass()
                    com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse$ResultStatus r1 = X.C09GP.LIZ(r0)
                L71:
                    if (r1 != 0) goto L24
                    goto L22
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandResponse.ResultStatus.ResultStatusAdapter.read(X.09CU):java.lang.Object");
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, ResultStatus resultStatus) {
                ResultStatus resultStatus2 = resultStatus;
                if (resultStatus2 == null) {
                    c09dl.LJIJJ();
                } else {
                    c09dl.LJJJJ(Integer.valueOf(resultStatus2.getValue()));
                }
            }
        }

        public static ResultStatus valueOf(String str) {
            return (ResultStatus) C08FF.LIZ(ResultStatus.class, str);
        }

        public ResultStatus(String str, int i, int i2) {
            this.LL = i2;
        }
    }

    public AgentCommandResponse() {
        this("", ResultStatus.RESULT_STATUS_UNSPECIFIED, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentCommandResponse)) {
            return false;
        }
        AgentCommandResponse agentCommandResponse = (AgentCommandResponse) obj;
        return Intrinsics.LJFF(this.id, agentCommandResponse.id) && this.result == agentCommandResponse.result && Intrinsics.LJFF(this.payload, agentCommandResponse.payload) && Intrinsics.LJFF(this.error, agentCommandResponse.error) && Intrinsics.LJFF(this.executionTimeMs, agentCommandResponse.executionTimeMs) && Intrinsics.LJFF(this.timestamp, agentCommandResponse.timestamp);
    }

    public final int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.result.hashCode()) * 31;
        String str = this.payload;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ErrorInfo errorInfo = this.error;
        int iHashCode3 = (iHashCode2 + (errorInfo == null ? 0 : errorInfo.hashCode())) * 31;
        Long l = this.executionTimeMs;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.timestamp;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgentCommandResponse(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.payload);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", executionTimeMs=");
        sbLIZ.append(this.executionTimeMs);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.timestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class ErrorInfo {

        @C09CT("code")
        public final String code;

        @C09CT("details")
        public final Map<String, Object> details;

        @C09CT("message")
        public final String message;

        @C09CT("timestamp")
        public final Long timestamp;

        public ErrorInfo() {
            this("", "", null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorInfo)) {
                return false;
            }
            ErrorInfo errorInfo = (ErrorInfo) obj;
            return Intrinsics.LJFF(this.code, errorInfo.code) && Intrinsics.LJFF(this.message, errorInfo.message) && Intrinsics.LJFF(this.details, errorInfo.details) && Intrinsics.LJFF(this.timestamp, errorInfo.timestamp);
        }

        public final int hashCode() {
            int iHashCode = ((this.code.hashCode() * 31) + this.message.hashCode()) * 31;
            Map<String, Object> map = this.details;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Long l = this.timestamp;
            return iHashCode2 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ErrorInfo(code=");
            sbLIZ.append(this.code);
            sbLIZ.append(", message=");
            sbLIZ.append(this.message);
            sbLIZ.append(", details=");
            sbLIZ.append(this.details);
            sbLIZ.append(", timestamp=");
            sbLIZ.append(this.timestamp);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ErrorInfo(String str, String str2, Map<String, ? extends Object> map, Long l) {
            this.code = str;
            this.message = str2;
            this.details = map;
            this.timestamp = l;
        }
    }

    public AgentCommandResponse(String str, ResultStatus resultStatus, String str2, ErrorInfo errorInfo, Long l, Long l2) {
        this.id = str;
        this.result = resultStatus;
        this.payload = str2;
        this.error = errorInfo;
        this.executionTimeMs = l;
        this.timestamp = l2;
    }
}
