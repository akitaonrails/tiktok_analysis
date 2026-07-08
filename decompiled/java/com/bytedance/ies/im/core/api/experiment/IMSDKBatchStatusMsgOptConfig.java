package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSDKBatchStatusMsgOptConfig {

    @C09CT("enable_batch_conv_info_transaction")
    public final boolean enableBatchConvInfoTransaction;

    @C09CT("enable_batch_settings_response_update")
    public final boolean enableBatchSettingsResponseUpdate;

    public IMSDKBatchStatusMsgOptConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMSDKBatchStatusMsgOptConfig)) {
            return false;
        }
        IMSDKBatchStatusMsgOptConfig iMSDKBatchStatusMsgOptConfig = (IMSDKBatchStatusMsgOptConfig) obj;
        return this.enableBatchSettingsResponseUpdate == iMSDKBatchStatusMsgOptConfig.enableBatchSettingsResponseUpdate && this.enableBatchConvInfoTransaction == iMSDKBatchStatusMsgOptConfig.enableBatchConvInfoTransaction;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enableBatchSettingsResponseUpdate) * 31) + C786410Ut5.Z2(this.enableBatchConvInfoTransaction);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSDKBatchStatusMsgOptConfig(enableBatchSettingsResponseUpdate=");
        sbLIZ.append(this.enableBatchSettingsResponseUpdate);
        sbLIZ.append(", enableBatchConvInfoTransaction=");
        sbLIZ.append(this.enableBatchConvInfoTransaction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMSDKBatchStatusMsgOptConfig(boolean z, boolean z2) {
        this.enableBatchSettingsResponseUpdate = z;
        this.enableBatchConvInfoTransaction = z2;
    }
}
