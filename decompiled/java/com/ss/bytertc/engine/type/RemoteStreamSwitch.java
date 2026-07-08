package com.ss.bytertc.engine.type;

import X.C2188811AlT;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteStreamSwitch {
    public boolean afterEnable;
    public int afterVideoIndex;
    public boolean beforeEnable;
    public int beforeVideoIndex;
    public boolean isScreen;
    public FallbackOrRecoverReason reason;
    public String uid;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteStreamSwitch{uid='");
        sbLIZ.append(this.uid);
        sbLIZ.append('\'');
        sbLIZ.append(", isScreen='");
        sbLIZ.append(this.isScreen);
        sbLIZ.append('\'');
        sbLIZ.append(", before_video_index='");
        sbLIZ.append(this.beforeVideoIndex);
        sbLIZ.append('\'');
        sbLIZ.append(", after_video_index='");
        sbLIZ.append(this.afterVideoIndex);
        sbLIZ.append('\'');
        sbLIZ.append(", before_enable='");
        sbLIZ.append(this.beforeEnable);
        sbLIZ.append('\'');
        sbLIZ.append(", after_enable='");
        sbLIZ.append(this.afterEnable);
        sbLIZ.append('\'');
        sbLIZ.append(", reason='");
        sbLIZ.append(this.reason);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoteStreamSwitch() {
    }

    public RemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        this.uid = internalRemoteStreamSwitch.uid;
        this.beforeVideoIndex = internalRemoteStreamSwitch.beforeVideoIndex;
        this.afterVideoIndex = internalRemoteStreamSwitch.afterVideoIndex;
        this.beforeEnable = internalRemoteStreamSwitch.beforeEnable;
        this.afterEnable = internalRemoteStreamSwitch.afterEnable;
        this.reason = getFallbackOrRecoverReason(internalRemoteStreamSwitch.reason);
    }

    private FallbackOrRecoverReason getFallbackOrRecoverReason(int i) {
        switch (i) {
            case 0:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH;
            case 1:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE;
            case 2:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH;
            case 3:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE;
            case 4:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH;
            case 5:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE;
            case 6:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH;
            case 7:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE;
            default:
                return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_UNKNOWN;
        }
    }
}
