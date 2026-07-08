package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyConfigGetResponse implements Serializable {

    @C09CT("scenes")
    public final List<FrequencySceneConfig> scenes;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("sync_conv_limit")
    public final Long syncConvLimit;

    @C09CT("sync_interval")
    public final Long syncInterval;

    public FrequencyConfigGetResponse() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyConfigGetResponse)) {
            return false;
        }
        FrequencyConfigGetResponse frequencyConfigGetResponse = (FrequencyConfigGetResponse) obj;
        return Intrinsics.LJFF(this.statusCode, frequencyConfigGetResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, frequencyConfigGetResponse.statusMsg) && Intrinsics.LJFF(this.syncInterval, frequencyConfigGetResponse.syncInterval) && Intrinsics.LJFF(this.syncConvLimit, frequencyConfigGetResponse.syncConvLimit) && Intrinsics.LJFF(this.scenes, frequencyConfigGetResponse.scenes);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.syncInterval;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.syncConvLimit;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<FrequencySceneConfig> list = this.scenes;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyConfigGetResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", syncInterval=");
        sbLIZ.append(this.syncInterval);
        sbLIZ.append(", syncConvLimit=");
        sbLIZ.append(this.syncConvLimit);
        sbLIZ.append(", scenes=");
        sbLIZ.append(this.scenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyConfigGetResponse(Integer num, String str, Long l, Long l2, List<FrequencySceneConfig> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.syncInterval = l;
        this.syncConvLimit = l2;
        this.scenes = list;
    }
}
