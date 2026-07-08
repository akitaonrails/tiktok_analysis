package com.ss.android.ugc.aweme.ecommerce.ug.perf;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class MallLandingPerfConfigModel {

    @C09CT("event_allow_list")
    public final List<MallLandingPerfEventConfig> allowList;

    @C09CT("check_landing_finished_delay_time")
    public final Long checkLandingFinishedDelayTime;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("enter_from_map")
    public final Map<String, String> enterFromMap;

    @C09CT("mall_landing_page_to_page_name_map")
    public final Map<String, String> mallLandingPageToPageNameMap;

    public MallLandingPerfConfigModel() {
        this(Boolean.FALSE, null, null, null, null);
    }

    public MallLandingPerfConfigModel(Boolean bool, List<MallLandingPerfEventConfig> list, Map<String, String> map, Map<String, String> map2, Long l) {
        this.enable = bool;
        this.allowList = list;
        this.enterFromMap = map;
        this.mallLandingPageToPageNameMap = map2;
        this.checkLandingFinishedDelayTime = l;
    }
}
