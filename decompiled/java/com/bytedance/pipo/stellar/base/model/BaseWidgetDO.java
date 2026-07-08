package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public class BaseWidgetDO implements Serializable {

    @C09CT("click_action")
    public StellarActionDO action;

    @C09CT("obj_id")
    public String objId;

    @C09CT("re_report_in_single_page")
    public final Integer repeatReportInSinglePage;

    @C09CT("should_tracking_event")
    public final Integer shouldTrackEvent;

    @C09CT("track_params")
    public Map<String, ? extends Object> trackingParams;

    public BaseWidgetDO() {
        this(null, null, 1, null, null);
    }

    public final StellarActionDO getAction() {
        return this.action;
    }

    public final String getObjId() {
        return this.objId;
    }

    public final Integer getRepeatReportInSinglePage() {
        return this.repeatReportInSinglePage;
    }

    public final Integer getShouldTrackEvent() {
        return this.shouldTrackEvent;
    }

    public final Map<String, Object> getTrackingParams() {
        return this.trackingParams;
    }

    public final void setAction(StellarActionDO stellarActionDO) {
        this.action = stellarActionDO;
    }

    public final void setObjId(String str) {
        this.objId = str;
    }

    public final void setTrackingParams(Map<String, ? extends Object> map) {
        this.trackingParams = map;
    }

    public BaseWidgetDO(String str, Map<String, ? extends Object> map, Integer num, Integer num2, StellarActionDO stellarActionDO) {
        this.objId = str;
        this.trackingParams = map;
        this.shouldTrackEvent = num;
        this.repeatReportInSinglePage = num2;
        this.action = stellarActionDO;
    }
}
