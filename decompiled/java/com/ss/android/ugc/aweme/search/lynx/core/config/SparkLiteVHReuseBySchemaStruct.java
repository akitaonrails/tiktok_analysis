package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SparkLiteVHReuseBySchemaStruct {

    @C09CT("black_list")
    public List<String> blackList;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_white_list")
    public List<String> enableWhiteList;

    @C09CT("lynx_update_white_list")
    public List<String> lynxUpdateWhiteList;

    public SparkLiteVHReuseBySchemaStruct() {
        C13BV c13bv = C13BV.INSTANCE;
        this.enableWhiteList = c13bv;
        this.blackList = c13bv;
        this.lynxUpdateWhiteList = c13bv;
    }
}
