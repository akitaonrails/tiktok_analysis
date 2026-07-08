package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class RetainInfo {

    @C09CT("effective_time_list")
    public List<EffectiveTime> effectiveTimeList;

    @C09CT("experiment_list")
    public List<RetentionExperiment> experimentList;

    @C09CT("frequency_limit_list")
    public List<FrequencyLimit> frequencyLimitList;

    @C09CT("group")
    public String group;

    @C09CT("params")
    public Map<String, String> params;

    @C09CT("payload_template")
    public PayloadTemplate payloadTemplate;

    @C09CT("pmid_list")
    public List<String> paymentMethodsList;

    @C09CT("position")
    public String position;

    @C09CT("priority")
    public Integer priority;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene;

    @C09CT("type")
    public String type;

    public RetainInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public RetainInfo(String str, String str2, String str3, List<String> list, Integer num, List<FrequencyLimit> list2, List<RetentionExperiment> list3, PayloadTemplate payloadTemplate, List<EffectiveTime> list4, Map<String, String> map, String str4) {
        this.position = str;
        this.scene = str2;
        this.type = str3;
        this.paymentMethodsList = list;
        this.priority = num;
        this.frequencyLimitList = list2;
        this.experimentList = list3;
        this.payloadTemplate = payloadTemplate;
        this.effectiveTimeList = list4;
        this.params = map;
        this.group = str4;
    }
}
