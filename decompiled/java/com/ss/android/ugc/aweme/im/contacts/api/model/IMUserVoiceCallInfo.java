package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMUserVoiceCallInfo implements Serializable {

    @C09CT("feature_result")
    public final FeatureResult featureResult;

    public IMUserVoiceCallInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMUserVoiceCallInfo) && Intrinsics.LJFF(this.featureResult, ((IMUserVoiceCallInfo) obj).featureResult);
    }

    public int hashCode() {
        FeatureResult featureResult = this.featureResult;
        if (featureResult == null) {
            return 0;
        }
        return featureResult.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserVoiceCallInfo(featureResult=");
        sbLIZ.append(this.featureResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMUserVoiceCallInfo(FeatureResult featureResult) {
        this.featureResult = featureResult;
    }
}
