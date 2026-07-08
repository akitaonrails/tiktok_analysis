package com.ss.android.ugc.aweme.localservice.passthrough.rules;

import X.C09CT;
import X.C13BV;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes33.dex */
public final class Rule {
    public String LIZ;

    @C09CT("btm")
    public final String btm;

    @C09CT("btm_list")
    public final List<String> btmList;

    @C09CT("data_btm")
    public final String dataBtm;

    @C09CT("data_btm_list")
    public final List<String> dataBtmList;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("event_name_list")
    public final List<String> eventNameList;

    @C09CT("params")
    public final List<String> params;

    @C09CT("unzip_params")
    public final List<String> unzipParams;

    public Rule() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public Rule(String str, List<String> list, String str2, List<String> list2, String str3, List<String> list3, String str4, List<String> list4, List<String> list5) {
        this.eventName = str;
        this.eventNameList = list;
        this.btm = str2;
        this.btmList = list2;
        this.dataBtm = str3;
        this.dataBtmList = list3;
        this.LIZ = str4;
        this.params = list4;
        this.unzipParams = list5;
    }

    public Rule(String str, List list, String str2, List list2, String str3, List list3, String str4, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? new ArrayList() : list2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? new ArrayList() : list3, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? C13BV.INSTANCE : list4, (i & 256) != 0 ? C13BV.INSTANCE : list5);
    }
}
