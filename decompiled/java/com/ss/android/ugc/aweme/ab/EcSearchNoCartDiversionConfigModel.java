package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class EcSearchNoCartDiversionConfigModel {

    @C09CT("pause_screenshot_enable")
    public final int pauseScreenshotEnable;

    @C09CT("request_control")
    public final int requestControl;

    @C09CT("request_limits")
    public final Map<String, Integer> requestLimits;

    @C09CT("request_percentages")
    public final List<Float> requestPercentages;

    @C09CT("request_times")
    public final List<Integer> requestTimes;

    @C09CT("return_code_list")
    public final List<Integer> returnCodeList;

    public EcSearchNoCartDiversionConfigModel() {
        this(0, 0, null, null, null, null, 63, null);
    }

    public EcSearchNoCartDiversionConfigModel(int i, int i2, Map<String, Integer> map, List<Integer> list, List<Float> list2, List<Integer> list3) {
        this.pauseScreenshotEnable = i;
        this.requestControl = i2;
        this.requestLimits = map;
        this.requestTimes = list;
        this.requestPercentages = list2;
        this.returnCodeList = list3;
    }

    public EcSearchNoCartDiversionConfigModel(int i, int i2, Map map, List list, List list2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? C2097608Jq.LJ() : map, (i3 & 8) != 0 ? C13BV.INSTANCE : list, (i3 & 16) != 0 ? C13BV.INSTANCE : list2, (i3 & 32) != 0 ? C13BV.INSTANCE : list3);
    }
}
