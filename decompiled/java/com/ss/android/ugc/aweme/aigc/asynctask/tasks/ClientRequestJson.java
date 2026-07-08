package com.ss.android.ugc.aweme.aigc.asynctask.tasks;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ClientRequestJson {

    @C09CT("data")
    public final List<Data> data;

    @C09CT("resource")
    public final List<Resource> resource;

    @C09CT("stage")
    public final String stage;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public ClientRequestJson() {
        this(null, null, null, null, 15, null);
    }

    public ClientRequestJson(String str, String str2, List<Data> list, List<Resource> list2) {
        this.stage = str;
        this.status = str2;
        this.data = list;
        this.resource = list2;
    }

    public ClientRequestJson(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2);
    }
}
