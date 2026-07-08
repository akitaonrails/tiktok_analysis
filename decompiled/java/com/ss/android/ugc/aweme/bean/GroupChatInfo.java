package com.ss.android.ugc.aweme.bean;

import X.C098200Yq;
import X.C09CT;
import X.C1227904rF;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class GroupChatInfo {

    @C09CT("group_id")
    public final String groupId;

    public final String LIZ() {
        Object c098200Yq;
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LJI(this);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public GroupChatInfo(String str) {
        this.groupId = str;
    }
}
