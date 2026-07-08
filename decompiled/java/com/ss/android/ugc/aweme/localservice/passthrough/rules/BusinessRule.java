package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BusinessRule {

    @C09CT("btm_list")
    public final List<String> btmList;

    @C09CT("btm_list_v2")
    public final List<String> btmListV2;

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("data_btm_list")
    public final List<String> dataBtmList;

    @C09CT("data_source")
    public final String dataSource;

    @C09CT("params")
    public final List<String> params;

    @C09CT("btm_strict_mode")
    public final Boolean strictMode;

    @C09CT("unzip_params")
    public final List<String> unzipParams;

    public BusinessRule() {
        this(null, null, null, null, null, null, null, null);
    }

    public BusinessRule(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, Boolean bool, String str2) {
        this.businessScene = str;
        this.btmList = list;
        this.btmListV2 = list2;
        this.dataBtmList = list3;
        this.params = list4;
        this.unzipParams = list5;
        this.strictMode = bool;
        this.dataSource = str2;
    }
}
