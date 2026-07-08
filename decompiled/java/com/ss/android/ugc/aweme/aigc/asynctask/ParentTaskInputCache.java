package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class ParentTaskInputCache {

    @C09CT("algo_param")
    public final String algoParam;

    @C09CT("algo_req")
    public final String algoReq;

    @C09CT("extra")
    public final String extra;

    @C09CT("image_local_path_list")
    public final List<String> imageLocalPathList;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("reqKey")
    public final String reqKey;

    @C09CT("time_out_second")
    public final Long timeOutSecond;

    public ParentTaskInputCache() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public ParentTaskInputCache(String str, String str2, String str3, String str4, String str5, String str6, Long l, List<String> list) {
        this.prompt = str;
        this.algoReq = str2;
        this.reqKey = str3;
        this.reqJson = str4;
        this.algoParam = str5;
        this.extra = str6;
        this.timeOutSecond = l;
        this.imageLocalPathList = list;
    }

    public ParentTaskInputCache(String str, String str2, String str3, String str4, String str5, String str6, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? null : l, (i & 128) != 0 ? C13BV.INSTANCE : list);
    }
}
