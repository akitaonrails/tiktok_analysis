package com.bytedance.android.livesdk.broadcast.dynamic;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class DynamicChildSwitch {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int mID;

    @C09CT("strategy")
    public final List<DynamicStrategy> mStrategyList;

    @C09CT("name")
    public final String mSwitchName;

    public DynamicChildSwitch(String str, int i, List<DynamicStrategy> list) {
        this.mSwitchName = str;
        this.mID = i;
        this.mStrategyList = list;
    }
}
