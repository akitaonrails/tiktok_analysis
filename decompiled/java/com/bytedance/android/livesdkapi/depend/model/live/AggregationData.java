package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AggregationData {

    @C09CT("Audience")
    public User audience;

    @C09CT("SuccessList")
    public List<Integer> successlist = new ArrayList();
}
