package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import X.C13BV;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmParamsRule {
    public final String LIZ;

    @C09CT("btm_list")
    public final List<String> btmList;

    @C09CT("data_btm_list")
    public final List<String> dataBtmList;

    @C09CT("params")
    public final List<String> params;

    @C09CT("unzip_params")
    public final List<String> unzipParams;

    public BtmParamsRule() {
        this(null, null, null, null, null, 31, null);
    }

    public BtmParamsRule(List<String> list, List<String> list2, String str, List<String> list3, List<String> list4) {
        this.btmList = list;
        this.dataBtmList = list2;
        this.LIZ = str;
        this.params = list3;
        this.unzipParams = list4;
    }

    public BtmParamsRule(List list, List list2, String str, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? C13BV.INSTANCE : list3, (i & 16) != 0 ? C13BV.INSTANCE : list4);
    }
}
