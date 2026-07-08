package com.ss.android.ugc.aweme.relation.api;

import X.C08JS;
import X.C098200Yq;
import X.C09CT;
import X.C13BV;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceUserInfo implements Serializable {

    @C09CT("middle_uids")
    public final List<String> middleUids;

    @C09CT("push_rec_reason")
    public final String recReason;

    @C09CT("uid")
    public final String uid;

    public PlaceUserInfo() {
        this(null, null, null, 7, null);
    }

    public final String toJson() {
        try {
            String strLIZLLL = C08JS.LIZLLL(this);
            return strLIZLLL != null ? strLIZLLL : "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return "";
        }
    }

    public PlaceUserInfo(String str, String str2, List<String> list) {
        this.uid = str;
        this.recReason = str2;
        this.middleUids = list;
    }

    public PlaceUserInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
