package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ReachCfgData {

    @C09CT("impression_info")
    public final n algoInfo;

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("da_params")
    public final Map<String, Object> daParams;

    @C09CT("da_params_v2")
    public final n daParamsV2;

    @C09CT("diversion_clear_pending_queue")
    public final Integer diversionClearPendingQueue;

    @C09CT("diversion_id")
    public final String diversionId;

    @C09CT("diversion_entrance_name")
    public final String entranceName;

    @C09CT("diversion_entrance_resources")
    public final List<DiversionEntranceRes> entranceResources;

    @C09CT("show_count")
    public final Integer showCount;

    @C09CT("diversion_target_name")
    public final String targetName;

    @C09CT("diversion_target_resources")
    public final List<DiversionTargetRes> targetResources;

    public final String toString() {
        return "ReachCfgData(entranceName=" + this.entranceName + ", entranceResources=" + this.entranceResources + ", targetName=" + this.targetName + ", targetResources=" + this.targetResources + ", showCount=" + this.showCount + ", daParams=" + this.daParams + ", daParamsV2=" + this.daParamsV2 + ", diversionId=" + this.diversionId + ", algoInfo=" + this.algoInfo + ", diversionClearPendingQueue=" + this.diversionClearPendingQueue + ", bizType=" + this.bizType + ')';
    }

    public ReachCfgData(String str, List<DiversionEntranceRes> list, String str2, List<DiversionTargetRes> list2, Integer num, Map<String, ? extends Object> map, n nVar, String str3, n nVar2, Integer num2, String str4) {
        this.entranceName = str;
        this.entranceResources = list;
        this.targetName = str2;
        this.targetResources = list2;
        this.showCount = num;
        this.daParams = map;
        this.daParamsV2 = nVar;
        this.diversionId = str3;
        this.algoInfo = nVar2;
        this.diversionClearPendingQueue = num2;
        this.bizType = str4;
    }
}
