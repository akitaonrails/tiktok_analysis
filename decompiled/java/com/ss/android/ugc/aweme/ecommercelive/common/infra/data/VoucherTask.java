package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes10.dex */
public final class VoucherTask {

    @C09CT("desc")
    public final String desc;

    @C09CT("end_time")
    public final String endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("start_time")
    public final String startTime;

    @C09CT("type")
    public final Integer type;

    @C09CT("user_task_id")
    public final String userTaskId;

    public VoucherTask() {
        this(null, null, null, null, null, null);
    }

    public VoucherTask(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.type = num;
        this.desc = str2;
        this.endTime = str3;
        this.startTime = str4;
        this.userTaskId = str5;
    }
}
