package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api;

import X.C09CT;
import X.C1741890vQh;
import X.C678560QjW;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BagAssembleRequest implements Serializable {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("condition_voucher_type_id")
    public final Long conditionVoucherTypeId;

    @C09CT("dynamic_params")
    public final Map<String, Object> dynamicParams;

    @C09CT("request_from")
    public final String requestFrom;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("assemble_req_scene")
    public final Integer scene;

    @C09CT("traffic_source_list")
    public final String trafficSourceList;

    @C09CT("use_new_req_param")
    public final boolean useNewReqParam;

    public BagAssembleRequest() {
        this("client", true, null, null, null, null, null, -1);
    }

    public final n mergeParamsToJsonObject() {
        n nVar;
        try {
            new p();
            nVar = p.LIZJ(C1741890vQh.LJIIIIZZ(this)).LJIILIIL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            nVar = new n();
        }
        Map<String, Object> map = this.dynamicParams;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                nVar.LJJIFFI(entry.getKey(), C678560QjW.LJ(entry.getValue()));
            }
        }
        nVar.LJJIJL("dynamic_params");
        return nVar;
    }

    public BagAssembleRequest(String str, boolean z, Long l, String str2, String str3, String str4, Map<String, ? extends Object> map, Integer num) {
        this.requestFrom = str;
        this.useNewReqParam = z;
        this.conditionVoucherTypeId = l;
        this.roomId = str2;
        this.authorId = str3;
        this.trafficSourceList = str4;
        this.dynamicParams = map;
        this.scene = num;
    }
}
