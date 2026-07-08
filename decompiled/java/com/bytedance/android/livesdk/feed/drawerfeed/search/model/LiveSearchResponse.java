package com.bytedance.android.livesdk.feed.drawerfeed.search.model;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class LiveSearchResponse {
    public String LIZ;

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("data")
    public List<LiveSearchStruct> liveList;

    @C09CT("log_pb")
    public n logPb;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_message")
    public String statusMessage = "";

    public final String LIZ() {
        Object c098200Yq;
        k kVarLJJIIZ;
        if (this.LIZ == null) {
            try {
                n nVar = this.logPb;
                if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ("impr_id")) == null || (c098200Yq = kVarLJJIIZ.LJIL()) == null) {
                    c098200Yq = "";
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            if (str == null) {
                str = "";
            }
            this.LIZ = str;
        }
        String str2 = this.LIZ;
        return str2 != null ? str2 : "";
    }
}
