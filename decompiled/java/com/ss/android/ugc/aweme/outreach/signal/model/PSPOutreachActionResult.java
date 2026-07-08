package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import X.C13BV;
import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class PSPOutreachActionResult {

    @C09CT("biz_condition")
    public n bizCondition;

    @C09CT("err_code")
    public Integer errCode;

    @C09CT("error_detail")
    public List<? extends List<? extends Object>> errorDetail;

    @C09CT("err_msg")
    public String errorMsg;

    @C09CT("is_new_timing")
    public boolean isNewTiming;

    @C09CT("is_succes")
    public boolean isSucces;

    @C09CT("condition")
    public Map<String, Object> outreachCondition;

    @C09CT("timing_key")
    public String outreachTimingKey;

    @C09CT("outreach_types")
    public List<String> outreachTypes;

    @C09CT("processor_costs")
    public Map<String, Long> processorCosts;

    public PSPOutreachActionResult() {
        this(null, null, null, null, false, null, null, null, null, false, 1023, null);
    }

    public PSPOutreachActionResult(Integer num, String str, String str2, Map<String, Object> map, boolean z, List<String> list, n nVar, Map<String, Long> map2, List<? extends List<? extends Object>> list2, boolean z2) {
        this.errCode = num;
        this.outreachTimingKey = str;
        this.errorMsg = str2;
        this.outreachCondition = map;
        this.isNewTiming = z;
        this.outreachTypes = list;
        this.bizCondition = nVar;
        this.processorCosts = map2;
        this.errorDetail = list2;
        this.isSucces = z2;
    }

    public PSPOutreachActionResult(Integer num, String str, String str2, Map map, boolean z, List list, n nVar, Map map2, List list2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? new LinkedHashMap() : map, (i & 16) != 0 ? false : z, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) == 0 ? nVar : null, (i & 128) != 0 ? new LinkedHashMap() : map2, (i & 256) != 0 ? C13BV.INSTANCE : list2, (i & 512) == 0 ? z2 : false);
    }
}
