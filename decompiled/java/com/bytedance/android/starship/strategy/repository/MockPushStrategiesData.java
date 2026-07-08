package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1307160k7W;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class MockPushStrategiesData implements Serializable {

    @C09CT("mock_event_params")
    public final String mockEventJson;

    @C09CT("mock_input_params")
    public final String mockInputJson;

    @C09CT("strategy_info")
    public final StrategiesData strategyInfo;

    @C09CT("strategy_test_id")
    public final String strategyTestId;
    public transient InterfaceC1307160k7W tracer;

    @C09CT("use_cpp")
    public boolean useCxx;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MockPushStrategiesData)) {
            return false;
        }
        MockPushStrategiesData mockPushStrategiesData = (MockPushStrategiesData) obj;
        return Intrinsics.LJFF(this.strategyTestId, mockPushStrategiesData.strategyTestId) && Intrinsics.LJFF(this.strategyInfo, mockPushStrategiesData.strategyInfo) && Intrinsics.LJFF(this.mockInputJson, mockPushStrategiesData.mockInputJson) && Intrinsics.LJFF(this.mockEventJson, mockPushStrategiesData.mockEventJson) && this.useCxx == mockPushStrategiesData.useCxx;
    }

    public int hashCode() {
        String str = this.strategyTestId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        StrategiesData strategiesData = this.strategyInfo;
        int iHashCode2 = (iHashCode + (strategiesData == null ? 0 : strategiesData.hashCode())) * 31;
        String str2 = this.mockInputJson;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mockEventJson;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.useCxx);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategiesData(strategyInfo=");
        sbLIZ.append(this.strategyInfo);
        sbLIZ.append(", mock_input_params=");
        sbLIZ.append(this.mockInputJson);
        sbLIZ.append(", strategyTestId=");
        sbLIZ.append(this.strategyTestId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setTracer(InterfaceC1307160k7W interfaceC1307160k7W) {
        this.tracer = interfaceC1307160k7W;
    }

    public final void setUseCxx(boolean z) {
        this.useCxx = z;
    }

    public MockPushStrategiesData(String str, StrategiesData strategiesData, String str2, String str3, boolean z) {
        this.strategyTestId = str;
        this.strategyInfo = strategiesData;
        this.mockInputJson = str2;
        this.mockEventJson = str3;
        this.useCxx = z;
    }
}
