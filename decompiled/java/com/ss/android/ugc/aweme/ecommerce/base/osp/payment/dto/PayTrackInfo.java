package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PayTrackInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("extra_track_param")
    public Map<String, String> extraTrackParam;

    @C09CT("main_track_id")
    public String mainTrackId;

    @C09CT("render_time")
    public Integer renderTime;

    public PayTrackInfo() {
        this(null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PayTrackInfo(mainTrackId=");
        sbLIZ.append(this.mainTrackId);
        sbLIZ.append(", renderTime=");
        sbLIZ.append(this.renderTime);
        sbLIZ.append(", extraTrackParam=");
        sbLIZ.append(this.extraTrackParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PayTrackInfo(String str, Integer num, Map<String, String> map) {
        this.mainTrackId = str;
        this.renderTime = num;
        this.extraTrackParam = map;
    }
}
