package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsOspBlikConfigModel {

    @C09CT("enable_debug_log")
    public final boolean enableDebugLog;

    @C09CT("enable_parallel_polling")
    public final boolean enableParallelPolling;

    @C09CT("error_code")
    public final List<String> errorCodes;

    @C09CT("input_code_digit")
    public final int inputCodeDigit;

    @C09CT("polling_interval")
    public final int pollingInterval;

    @C09CT("polling_times")
    public final int pollingTimes;

    @C09CT("timeout_code")
    public final List<String> timeoutCodes;

    public PipoTtsOspBlikConfigModel() {
        this(0, 0, 0, false, null, null, false, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoTtsOspBlikConfigModel)) {
            return false;
        }
        PipoTtsOspBlikConfigModel pipoTtsOspBlikConfigModel = (PipoTtsOspBlikConfigModel) obj;
        return this.inputCodeDigit == pipoTtsOspBlikConfigModel.inputCodeDigit && this.pollingInterval == pipoTtsOspBlikConfigModel.pollingInterval && this.pollingTimes == pipoTtsOspBlikConfigModel.pollingTimes && this.enableParallelPolling == pipoTtsOspBlikConfigModel.enableParallelPolling && Intrinsics.LJFF(this.timeoutCodes, pipoTtsOspBlikConfigModel.timeoutCodes) && Intrinsics.LJFF(this.errorCodes, pipoTtsOspBlikConfigModel.errorCodes) && this.enableDebugLog == pipoTtsOspBlikConfigModel.enableDebugLog;
    }

    public final int hashCode() {
        int iZ2 = ((((((this.inputCodeDigit * 31) + this.pollingInterval) * 31) + this.pollingTimes) * 31) + C786410Ut5.Z2(this.enableParallelPolling)) * 31;
        List<String> list = this.timeoutCodes;
        int iHashCode = (iZ2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.errorCodes;
        return ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.enableDebugLog);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoTtsOspBlikConfigModel(inputCodeDigit=");
        sbLIZ.append(this.inputCodeDigit);
        sbLIZ.append(", pollingInterval=");
        sbLIZ.append(this.pollingInterval);
        sbLIZ.append(", pollingTimes=");
        sbLIZ.append(this.pollingTimes);
        sbLIZ.append(", enableParallelPolling=");
        sbLIZ.append(this.enableParallelPolling);
        sbLIZ.append(", timeoutCodes=");
        sbLIZ.append(this.timeoutCodes);
        sbLIZ.append(", errorCodes=");
        sbLIZ.append(this.errorCodes);
        sbLIZ.append(", enableDebugLog=");
        sbLIZ.append(this.enableDebugLog);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoTtsOspBlikConfigModel(int i, int i2, int i3, boolean z, List<String> list, List<String> list2, boolean z2) {
        this.inputCodeDigit = i;
        this.pollingInterval = i2;
        this.pollingTimes = i3;
        this.enableParallelPolling = z;
        this.timeoutCodes = list;
        this.errorCodes = list2;
        this.enableDebugLog = z2;
    }

    public PipoTtsOspBlikConfigModel(int i, int i2, int i3, boolean z, List list, List list2, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 6 : i, (i4 & 2) != 0 ? LSPassThroughRecordSizeConfig.DEFAULT : i2, (i4 & 4) != 0 ? 60 : i3, (i4 & 8) != 0 ? true : z, (i4 & 16) != 0 ? C1697810uHb.LJIIJJI("ot0001", "REQUEST_TIMEOUT") : list, (i4 & 32) != 0 ? Collections.singletonList("EXTERNAL_PARAMETER_ERROR") : list2, (i4 & 64) != 0 ? true : z2);
    }
}
