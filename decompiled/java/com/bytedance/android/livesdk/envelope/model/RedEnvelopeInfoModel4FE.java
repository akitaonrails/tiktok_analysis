package com.bytedance.android.livesdk.envelope.model;

import X.C09CT;
import X.C963140bAe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class RedEnvelopeInfoModel4FE {

    @C09CT("list_response_timestamp")
    public long listResponseTimestamp;

    @C09CT("preview")
    public PreviewModel preview;

    @C09CT("request_list_timestamp")
    public long requestListTimestamp;

    @C09CT("request_permission_timestamp")
    public long requestPermissionTimestamp;

    @C09CT("data_from")
    public String dataFrom = "";

    @C09CT("envelope_infos")
    public List<RedEnvelopeMessage4FE> envelopList = new ArrayList();

    @C09CT("time_diff")
    public long timeDiff = C963140bAe.LIZLLL;
}
